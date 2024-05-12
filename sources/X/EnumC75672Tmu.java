package X;

/* renamed from: X.Tmu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75672Tmu {
    IDLE("idle"),
    INVITER("inviter"),
    INVITEE("invitee"),
    APPLY("apply"),
    HANDLER("handler");

    public final String LJLIL;

    public static EnumC75672Tmu valueOf(String str) {
        return (EnumC75672Tmu) V0N.LJJJ(EnumC75672Tmu.class, str);
    }

    public final String getLabel() {
        return this.LJLIL;
    }

    EnumC75672Tmu(String str) {
        this.LJLIL = str;
    }
}
