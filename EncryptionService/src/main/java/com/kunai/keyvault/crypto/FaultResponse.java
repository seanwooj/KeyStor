
package com.kunai.keyvault.crypto;

import com.kunai.keyvault.crypto.voltage.vibesimple.Fault;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Fault", targetNamespace = "http://voltage.com/vibesimple")
public class FaultResponse
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Fault faultInfo;

    /**
     * 
     * @param faultInfo additional (SOAP) information if necessary
     * @param message Fault to create an error message for
     */
    public FaultResponse(String message, Fault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo additional (SOAP) information if necessary
     * @param cause information about the object causing the issue
     * @param message Fault to create an error message for
     */
    public FaultResponse(String message, Fault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.kunai.keyvault.crypto.voltage.vibesimple.Fault
     */
    public Fault getFaultInfo() {
        return faultInfo;
    }

}
