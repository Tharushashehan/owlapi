package org.semanticweb.owlapitools.builders;

import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;

/** Builder class for OWLReflexiveObjectPropertyAxiom */
public class BuilderReflexiveObjectProperty
        extends
        BaseObjectPropertyBuilder<OWLReflexiveObjectPropertyAxiom, BuilderReflexiveObjectProperty> {
    /** builder initialized from an existing object
     * 
     * @param expected
     *            the existing object */
    public BuilderReflexiveObjectProperty(
            OWLReflexiveObjectPropertyAxiom expected, OWLDataFactory df) {
        this(df);
        withProperty(expected.getProperty()).withAnnotations(
                expected.getAnnotations());
    }

    /** uninitialized builder */
    public BuilderReflexiveObjectProperty(OWLDataFactory df) {
        super(df);
    }

    @Override
    public OWLReflexiveObjectPropertyAxiom buildObject() {
        return df.getOWLReflexiveObjectPropertyAxiom(property, annotations);
    }
}