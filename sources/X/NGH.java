package X;

/* loaded from: classes11.dex */
public enum NGH implements InterfaceC58699N1z<String> {
    AUTO("auto"),
    MANUAL("manual");

    public final String LJLIL;

    public static NGH valueOf(String str) {
        return (NGH) V0N.LJJJ(NGH.class, str);
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }

    NGH(String str) {
        this.LJLIL = str;
    }
}
