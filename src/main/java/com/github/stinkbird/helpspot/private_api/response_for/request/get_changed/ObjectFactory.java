//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 01:59:10 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.request.get_changed;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.stinkbird.helpspot.private_api.response_for.request.get_changed package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _XRequest_QNAME = new QName("", "xRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.stinkbird.helpspot.private_api.response_for.request.get_changed
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Requests }
     * 
     */
    public Requests createRequests() {
        return new Requests();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xRequest")
    public JAXBElement<BigInteger> createXRequest(BigInteger value) {
        return new JAXBElement<BigInteger>(_XRequest_QNAME, BigInteger.class, null, value);
    }

}