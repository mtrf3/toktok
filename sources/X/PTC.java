package X;

/* loaded from: classes12.dex */
public enum PTC {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("NULL_RESULT_TYPE", "null"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("STRING_RESULT_TYPE", "string"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("INT_RESULT_TYPE", "int"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("LONG_RESULT_TYPE", "long"),
    /* JADX INFO: Fake field, exist only in values array */
    EF47("FLOAT_RESULT_TYPE", "float"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("JSON_ELEMENT_RESULT_TYPE", "jsonElement"),
    /* JADX INFO: Fake field, exist only in values array */
    EF67("BOOLEAN_RESULT_TYPE", "boolean"),
    /* JADX INFO: Fake field, exist only in values array */
    EF77("BYTE_RESULT_TYPE", "byte"),
    /* JADX INFO: Fake field, exist only in values array */
    EF88("SHORT_RESULT_TYPE", "short"),
    /* JADX INFO: Fake field, exist only in values array */
    EF99("DOUBLE_RESULT_TYPE", "double");

    public final String LJLIL;
    public final int LJLILLLLZI;

    public static int LIZJ(String str) {
        for (PTC ptc : values()) {
            if (str.equals(ptc.LJLIL)) {
                return ptc.LJLILLLLZI;
            }
        }
        return 0;
    }

    public static PTC valueOf(String str) {
        return (PTC) V0N.LJJJ(PTC.class, str);
    }

    PTC(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }
}
