package X;

/* renamed from: X.ILi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC46462ILi {
    SUCCESS("sucess"),
    DELAY_SUCCESS("delay_success"),
    FAILURE("failure");

    public final String LJLIL;

    public static EnumC46462ILi valueOf(String str) {
        return (EnumC46462ILi) V0N.LJJJ(EnumC46462ILi.class, str);
    }

    public final String getState() {
        return this.LJLIL;
    }

    EnumC46462ILi(String str) {
        this.LJLIL = str;
    }
}
