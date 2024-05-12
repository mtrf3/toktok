package X;

/* renamed from: X.3Ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC81823Ja {
    DATA_SOURCE("DATA_SOURCE"),
    SESSION_MEDIATOR("SESSION_MEDIATOR"),
    INBOX_MEDIATOR("INBOX_MEDIATOR");

    public final String LJLIL;

    public static EnumC81823Ja valueOf(String str) {
        return (EnumC81823Ja) V0N.LJJJ(EnumC81823Ja.class, str);
    }

    public final String getTag() {
        return this.LJLIL;
    }

    EnumC81823Ja(String str) {
        this.LJLIL = str;
    }
}
