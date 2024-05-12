package X;

/* loaded from: classes6.dex */
public enum CXL {
    INIT_FAILED("LynxInitFailed"),
    RUNTIME_NOT_FOUND("RuntimeRetrieveFailed"),
    LOAD_FAILED("OnLoadFailed");

    public final String LJLIL;

    public static CXL valueOf(String str) {
        return (CXL) V0N.LJJJ(CXL.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    CXL(String str) {
        this.LJLIL = str;
    }
}
