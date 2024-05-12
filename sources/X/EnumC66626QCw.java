package X;

/* renamed from: X.QCw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC66626QCw {
    GET("get"),
    POST("post"),
    PUT("put"),
    DELETE("delete"),
    UNSUPPORTED("unsupported");

    public static final C66627QCx Companion = new C66627QCx();
    public final String LJLIL;

    public static EnumC66626QCw valueOf(String str) {
        return (EnumC66626QCw) V0N.LJJJ(EnumC66626QCw.class, str);
    }

    public final String getMethod() {
        return this.LJLIL;
    }

    EnumC66626QCw(String str) {
        this.LJLIL = str;
    }
}
