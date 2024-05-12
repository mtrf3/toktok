package X;

/* renamed from: X.IyN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48355IyN {
    NOT_SUPPORTED("notSupported"),
    DEPENDENT_ON_OTHER_COMPONENT("dependentOnOtherComponent"),
    CONDITIONAL_SUPPORT("conditionalSupport"),
    ALWAYS("always");

    public final String LJLIL;

    public static EnumC48355IyN valueOf(String str) {
        return (EnumC48355IyN) V0N.LJJJ(EnumC48355IyN.class, str);
    }

    public final String getId() {
        return this.LJLIL;
    }

    EnumC48355IyN(String str) {
        this.LJLIL = str;
    }
}
