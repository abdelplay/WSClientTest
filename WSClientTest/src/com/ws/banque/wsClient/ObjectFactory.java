
package com.ws.banque.wsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.banque.wsClient package. 
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

    private final static QName _GetCompteResponse_QNAME = new QName("http://service.banque.ws.com/", "getCompteResponse");
    private final static QName _ConversionEuroToDhResponse_QNAME = new QName("http://service.banque.ws.com/", "conversionEuroToDhResponse");
    private final static QName _GetListeComptesResponse_QNAME = new QName("http://service.banque.ws.com/", "getListeComptesResponse");
    private final static QName _ConversionEuroToDh_QNAME = new QName("http://service.banque.ws.com/", "conversionEuroToDh");
    private final static QName _Compte_QNAME = new QName("http://service.banque.ws.com/", "compte");
    private final static QName _GetCompte_QNAME = new QName("http://service.banque.ws.com/", "getCompte");
    private final static QName _GetListeComptes_QNAME = new QName("http://service.banque.ws.com/", "getListeComptes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.banque.wsClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEuroToDh }
     * 
     */
    public ConversionEuroToDh createConversionEuroToDh() {
        return new ConversionEuroToDh();
    }

    /**
     * Create an instance of {@link GetListeComptesResponse }
     * 
     */
    public GetListeComptesResponse createGetListeComptesResponse() {
        return new GetListeComptesResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDhResponse }
     * 
     */
    public ConversionEuroToDhResponse createConversionEuroToDhResponse() {
        return new ConversionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link GetListeComptes }
     * 
     */
    public GetListeComptes createGetListeComptes() {
        return new GetListeComptes();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.banque.ws.com/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.banque.ws.com/", name = "conversionEuroToDhResponse")
    public JAXBElement<ConversionEuroToDhResponse> createConversionEuroToDhResponse(ConversionEuroToDhResponse value) {
        return new JAXBElement<ConversionEuroToDhResponse>(_ConversionEuroToDhResponse_QNAME, ConversionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.banque.ws.com/", name = "getListeComptesResponse")
    public JAXBElement<GetListeComptesResponse> createGetListeComptesResponse(GetListeComptesResponse value) {
        return new JAXBElement<GetListeComptesResponse>(_GetListeComptesResponse_QNAME, GetListeComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.banque.ws.com/", name = "conversionEuroToDh")
    public JAXBElement<ConversionEuroToDh> createConversionEuroToDh(ConversionEuroToDh value) {
        return new JAXBElement<ConversionEuroToDh>(_ConversionEuroToDh_QNAME, ConversionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.banque.ws.com/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.banque.ws.com/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.banque.ws.com/", name = "getListeComptes")
    public JAXBElement<GetListeComptes> createGetListeComptes(GetListeComptes value) {
        return new JAXBElement<GetListeComptes>(_GetListeComptes_QNAME, GetListeComptes.class, null, value);
    }

}