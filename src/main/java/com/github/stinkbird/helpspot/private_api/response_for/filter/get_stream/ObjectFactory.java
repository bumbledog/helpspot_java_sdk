//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 01:55:52 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.filter.get_stream;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.stinkbird.helpspot.private_api.response_for.filter.get_stream package. 
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

    private final static QName _FPublic_QNAME = new QName("", "fPublic");
    private final static QName _FNoteIsHTML_QNAME = new QName("", "fNoteIsHTML");
    private final static QName _DtGMTChange_QNAME = new QName("", "dtGMTChange");
    private final static QName _FInitial_QNAME = new QName("", "fInitial");
    private final static QName _XPerson_QNAME = new QName("", "xPerson");
    private final static QName _FMergedFromRequest_QNAME = new QName("", "fMergedFromRequest");
    private final static QName _TNote_QNAME = new QName("", "tNote");
    private final static QName _XRequest_QNAME = new QName("", "xRequest");
    private final static QName _XRequestHistory_QNAME = new QName("", "xRequestHistory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.stinkbird.helpspot.private_api.response_for.filter.get_stream
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Stream }
     * 
     */
    public Stream createStream() {
        return new Stream();
    }

    /**
     * Create an instance of {@link HistoryNote }
     * 
     */
    public HistoryNote createHistoryNote() {
        return new HistoryNote();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fPublic")
    public JAXBElement<BigInteger> createFPublic(BigInteger value) {
        return new JAXBElement<BigInteger>(_FPublic_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fNoteIsHTML")
    public JAXBElement<BigInteger> createFNoteIsHTML(BigInteger value) {
        return new JAXBElement<BigInteger>(_FNoteIsHTML_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dtGMTChange")
    public JAXBElement<BigInteger> createDtGMTChange(BigInteger value) {
        return new JAXBElement<BigInteger>(_DtGMTChange_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fInitial")
    public JAXBElement<BigInteger> createFInitial(BigInteger value) {
        return new JAXBElement<BigInteger>(_FInitial_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xPerson")
    public JAXBElement<BigInteger> createXPerson(BigInteger value) {
        return new JAXBElement<BigInteger>(_XPerson_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fMergedFromRequest")
    public JAXBElement<BigInteger> createFMergedFromRequest(BigInteger value) {
        return new JAXBElement<BigInteger>(_FMergedFromRequest_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tNote")
    public JAXBElement<String> createTNote(String value) {
        return new JAXBElement<String>(_TNote_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xRequest")
    public JAXBElement<BigInteger> createXRequest(BigInteger value) {
        return new JAXBElement<BigInteger>(_XRequest_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xRequestHistory")
    public JAXBElement<BigInteger> createXRequestHistory(BigInteger value) {
        return new JAXBElement<BigInteger>(_XRequestHistory_QNAME, BigInteger.class, null, value);
    }

}
