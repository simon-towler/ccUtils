package ccnums;

/**
 * Created by simontowler on 10/07/2017.
 */
class AmexCcNumber extends ccnums.CcNumber {

    // constructor
    AmexCcNumber(String number) {
        setNumber(number);
        setIssuer("AmericanExpress");
        setGrouping(getNumber());
        setValidLengths(new int[]{15});//TODO load valid lengths from properties
    }

}
