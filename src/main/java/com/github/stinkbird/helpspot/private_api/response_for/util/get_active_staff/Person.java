//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 02:05:37 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.util.get_active_staff;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}xPerson"/>
 *         &lt;element ref="{}sFname"/>
 *         &lt;element ref="{}sLname"/>
 *         &lt;element ref="{}sUsername"/>
 *         &lt;element ref="{}sEmail"/>
 *         &lt;element ref="{}sEmail2"/>
 *         &lt;element ref="{}sSMS"/>
 *         &lt;element ref="{}xSMSService"/>
 *         &lt;element ref="{}sPhone"/>
 *         &lt;element ref="{}tSignature"/>
 *         &lt;element ref="{}tMobileSignature"/>
 *         &lt;element ref="{}fNotifyEmail"/>
 *         &lt;element ref="{}fNotifyEmail2"/>
 *         &lt;element ref="{}fNotifySMS"/>
 *         &lt;element ref="{}fNotifySMSUrgent"/>
 *         &lt;element ref="{}xPersonPhotoId"/>
 *         &lt;element ref="{}fUserType"/>
 *         &lt;element ref="{}xPersonOutOfOffice"/>
 *         &lt;element ref="{}fNotifyNewRequest"/>
 *         &lt;element ref="{}fDeleted"/>
 *         &lt;element ref="{}sWorkspaceDefault"/>
 *         &lt;element ref="{}fDefaultToPublic"/>
 *         &lt;element ref="{}fDefaultTTOpen"/>
 *         &lt;element ref="{}fHideWysiwyg"/>
 *         &lt;element ref="{}fHideImages"/>
 *         &lt;element ref="{}iRequestHistoryLimit"/>
 *         &lt;element ref="{}fReturnToReq"/>
 *         &lt;element ref="{}sHTMLEditor"/>
 *         &lt;element ref="{}tSignature_HTML"/>
 *         &lt;element ref="{}fullname"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xPerson",
    "sFname",
    "sLname",
    "sUsername",
    "sEmail",
    "sEmail2",
    "ssms",
    "xsmsService",
    "sPhone",
    "tSignature",
    "tMobileSignature",
    "fNotifyEmail",
    "fNotifyEmail2",
    "fNotifySMS",
    "fNotifySMSUrgent",
    "xPersonPhotoId",
    "fUserType",
    "xPersonOutOfOffice",
    "fNotifyNewRequest",
    "fDeleted",
    "sWorkspaceDefault",
    "fDefaultToPublic",
    "fDefaultTTOpen",
    "fHideWysiwyg",
    "fHideImages",
    "iRequestHistoryLimit",
    "fReturnToReq",
    "shtmlEditor",
    "tSignatureHTML",
    "fullname"
})
@XmlRootElement(name = "person")
public class Person implements Serializable {

	private static final long serialVersionUID = -711507308316128667L;
	
	@XmlElement(required = false)
    protected BigInteger xPerson;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sFname;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sLname;
    @XmlElement(required = false)
    protected SUsername sUsername;
    @XmlElement(required = false)
    protected String sEmail;
    @XmlElement(required = false)
    protected SEmail2 sEmail2;
    @XmlElement(name = "sSMS", required = false)
    protected SSMS ssms;
    @XmlElement(name = "xSMSService", required = false)
    protected BigInteger xsmsService;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sPhone;
    @XmlElement(required = false)
    protected String tSignature;
    @XmlElement(required = false)
    protected String tMobileSignature;
    @XmlElement(required = false)
    protected BigInteger fNotifyEmail;
    @XmlElement(required = false)
    protected BigInteger fNotifyEmail2;
    @XmlElement(required = false)
    protected BigInteger fNotifySMS;
    @XmlElement(required = false)
    protected BigInteger fNotifySMSUrgent;
    @XmlElement(required = false)
    protected BigInteger xPersonPhotoId;
    @XmlElement(required = false)
    protected BigInteger fUserType;
    @XmlElement(required = false)
    protected BigInteger xPersonOutOfOffice;
    @XmlElement(required = false)
    protected BigInteger fNotifyNewRequest;
    @XmlElement(required = false)
    protected BigInteger fDeleted;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sWorkspaceDefault;
    @XmlElement(required = false)
    protected BigInteger fDefaultToPublic;
    @XmlElement(required = false)
    protected BigInteger fDefaultTTOpen;
    @XmlElement(required = false)
    protected BigInteger fHideWysiwyg;
    @XmlElement(required = false)
    protected BigInteger fHideImages;
    @XmlElement(required = false)
    protected BigInteger iRequestHistoryLimit;
    @XmlElement(required = false)
    protected BigInteger fReturnToReq;
    @XmlElement(name = "sHTMLEditor", required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String shtmlEditor;
    @XmlElement(name = "tSignature_HTML", required = false)
    protected String tSignatureHTML;
    @XmlElement(required = false)
    protected String fullname;

    /**
     * Gets the value of the xPerson property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXPerson() {
        return xPerson;
    }

    /**
     * Sets the value of the xPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXPerson(BigInteger value) {
        this.xPerson = value;
    }

    /**
     * Gets the value of the sFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFname() {
        return sFname;
    }

    /**
     * Sets the value of the sFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFname(String value) {
        this.sFname = value;
    }

    /**
     * Gets the value of the sLname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLname() {
        return sLname;
    }

    /**
     * Sets the value of the sLname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLname(String value) {
        this.sLname = value;
    }

    /**
     * Gets the value of the sUsername property.
     * 
     * @return
     *     possible object is
     *     {@link SUsername }
     *     
     */
    public SUsername getSUsername() {
        return sUsername;
    }

    /**
     * Sets the value of the sUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUsername }
     *     
     */
    public void setSUsername(SUsername value) {
        this.sUsername = value;
    }

    /**
     * Gets the value of the sEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEmail() {
        return sEmail;
    }

    /**
     * Sets the value of the sEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEmail(String value) {
        this.sEmail = value;
    }

    /**
     * Gets the value of the sEmail2 property.
     * 
     * @return
     *     possible object is
     *     {@link SEmail2 }
     *     
     */
    public SEmail2 getSEmail2() {
        return sEmail2;
    }

    /**
     * Sets the value of the sEmail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEmail2 }
     *     
     */
    public void setSEmail2(SEmail2 value) {
        this.sEmail2 = value;
    }

    /**
     * Gets the value of the ssms property.
     * 
     * @return
     *     possible object is
     *     {@link SSMS }
     *     
     */
    public SSMS getSSMS() {
        return ssms;
    }

    /**
     * Sets the value of the ssms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSMS }
     *     
     */
    public void setSSMS(SSMS value) {
        this.ssms = value;
    }

    /**
     * Gets the value of the xsmsService property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXSMSService() {
        return xsmsService;
    }

    /**
     * Sets the value of the xsmsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXSMSService(BigInteger value) {
        this.xsmsService = value;
    }

    /**
     * Gets the value of the sPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPhone() {
        return sPhone;
    }

    /**
     * Sets the value of the sPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPhone(String value) {
        this.sPhone = value;
    }

    /**
     * Gets the value of the tSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSignature() {
        return tSignature;
    }

    /**
     * Sets the value of the tSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSignature(String value) {
        this.tSignature = value;
    }

    /**
     * Gets the value of the tMobileSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMobileSignature() {
        return tMobileSignature;
    }

    /**
     * Sets the value of the tMobileSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMobileSignature(String value) {
        this.tMobileSignature = value;
    }

    /**
     * Gets the value of the fNotifyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFNotifyEmail() {
        return fNotifyEmail;
    }

    /**
     * Sets the value of the fNotifyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFNotifyEmail(BigInteger value) {
        this.fNotifyEmail = value;
    }

    /**
     * Gets the value of the fNotifyEmail2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFNotifyEmail2() {
        return fNotifyEmail2;
    }

    /**
     * Sets the value of the fNotifyEmail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFNotifyEmail2(BigInteger value) {
        this.fNotifyEmail2 = value;
    }

    /**
     * Gets the value of the fNotifySMS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFNotifySMS() {
        return fNotifySMS;
    }

    /**
     * Sets the value of the fNotifySMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFNotifySMS(BigInteger value) {
        this.fNotifySMS = value;
    }

    /**
     * Gets the value of the fNotifySMSUrgent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFNotifySMSUrgent() {
        return fNotifySMSUrgent;
    }

    /**
     * Sets the value of the fNotifySMSUrgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFNotifySMSUrgent(BigInteger value) {
        this.fNotifySMSUrgent = value;
    }

    /**
     * Gets the value of the xPersonPhotoId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXPersonPhotoId() {
        return xPersonPhotoId;
    }

    /**
     * Sets the value of the xPersonPhotoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXPersonPhotoId(BigInteger value) {
        this.xPersonPhotoId = value;
    }

    /**
     * Gets the value of the fUserType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFUserType() {
        return fUserType;
    }

    /**
     * Sets the value of the fUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFUserType(BigInteger value) {
        this.fUserType = value;
    }

    /**
     * Gets the value of the xPersonOutOfOffice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXPersonOutOfOffice() {
        return xPersonOutOfOffice;
    }

    /**
     * Sets the value of the xPersonOutOfOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXPersonOutOfOffice(BigInteger value) {
        this.xPersonOutOfOffice = value;
    }

    /**
     * Gets the value of the fNotifyNewRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFNotifyNewRequest() {
        return fNotifyNewRequest;
    }

    /**
     * Sets the value of the fNotifyNewRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFNotifyNewRequest(BigInteger value) {
        this.fNotifyNewRequest = value;
    }

    /**
     * Gets the value of the fDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFDeleted() {
        return fDeleted;
    }

    /**
     * Sets the value of the fDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFDeleted(BigInteger value) {
        this.fDeleted = value;
    }

    /**
     * Gets the value of the sWorkspaceDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWorkspaceDefault() {
        return sWorkspaceDefault;
    }

    /**
     * Sets the value of the sWorkspaceDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWorkspaceDefault(String value) {
        this.sWorkspaceDefault = value;
    }

    /**
     * Gets the value of the fDefaultToPublic property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFDefaultToPublic() {
        return fDefaultToPublic;
    }

    /**
     * Sets the value of the fDefaultToPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFDefaultToPublic(BigInteger value) {
        this.fDefaultToPublic = value;
    }

    /**
     * Gets the value of the fDefaultTTOpen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFDefaultTTOpen() {
        return fDefaultTTOpen;
    }

    /**
     * Sets the value of the fDefaultTTOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFDefaultTTOpen(BigInteger value) {
        this.fDefaultTTOpen = value;
    }

    /**
     * Gets the value of the fHideWysiwyg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFHideWysiwyg() {
        return fHideWysiwyg;
    }

    /**
     * Sets the value of the fHideWysiwyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFHideWysiwyg(BigInteger value) {
        this.fHideWysiwyg = value;
    }

    /**
     * Gets the value of the fHideImages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFHideImages() {
        return fHideImages;
    }

    /**
     * Sets the value of the fHideImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFHideImages(BigInteger value) {
        this.fHideImages = value;
    }

    /**
     * Gets the value of the iRequestHistoryLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIRequestHistoryLimit() {
        return iRequestHistoryLimit;
    }

    /**
     * Sets the value of the iRequestHistoryLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIRequestHistoryLimit(BigInteger value) {
        this.iRequestHistoryLimit = value;
    }

    /**
     * Gets the value of the fReturnToReq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFReturnToReq() {
        return fReturnToReq;
    }

    /**
     * Sets the value of the fReturnToReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFReturnToReq(BigInteger value) {
        this.fReturnToReq = value;
    }

    /**
     * Gets the value of the shtmlEditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHTMLEditor() {
        return shtmlEditor;
    }

    /**
     * Sets the value of the shtmlEditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHTMLEditor(String value) {
        this.shtmlEditor = value;
    }

    /**
     * Gets the value of the tSignatureHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSignatureHTML() {
        return tSignatureHTML;
    }

    /**
     * Sets the value of the tSignatureHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSignatureHTML(String value) {
        this.tSignatureHTML = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

}
