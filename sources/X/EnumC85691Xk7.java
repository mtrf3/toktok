package X;

/* renamed from: X.Xk7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC85691Xk7 {
    SMS(EnumC85693Xk9.SMS, EnumC85633XjB.SMS, EnumC85692Xk8.SMS),
    EMAIL(EnumC85693Xk9.EMAIL, EnumC85633XjB.EMAIL, EnumC85692Xk8.EMAIL),
    PASSWORD(EnumC85693Xk9.PASSWORD, EnumC85633XjB.PASSWORD, EnumC85692Xk8.PASSWORD);

    public final EnumC85693Xk9 LJLIL;
    public final EnumC85633XjB LJLILLLLZI;
    public final EnumC85692Xk8 LJLJI;

    public static EnumC85691Xk7 valueOf(String str) {
        return (EnumC85691Xk7) V0N.LJJJ(EnumC85691Xk7.class, str);
    }

    public final EnumC85692Xk8 getResult() {
        return this.LJLJI;
    }

    public final EnumC85693Xk9 getShow() {
        return this.LJLIL;
    }

    public final EnumC85633XjB getTyping() {
        return this.LJLILLLLZI;
    }

    EnumC85691Xk7(EnumC85693Xk9 enumC85693Xk9, EnumC85633XjB enumC85633XjB, EnumC85692Xk8 enumC85692Xk8) {
        this.LJLIL = enumC85693Xk9;
        this.LJLILLLLZI = enumC85633XjB;
        this.LJLJI = enumC85692Xk8;
    }
}
