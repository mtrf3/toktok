package X;

/* renamed from: X.BtM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC30208BtM {
    QUESTION(true),
    CUSTOM_POLL(true),
    LINK_HOST(true),
    BOTTOM_LEFT_SLOT(false),
    AUDIENCE_SLOT(false),
    SUBSCRIPTION_ICON(false),
    FAST_GIFT(false),
    GIFT(false),
    DUMMY_FAST_GIFT(false),
    DUMMY_GIFT(false),
    SHARE(false),
    INTERACTION(false);

    public final boolean LJLIL;

    public static EnumC30208BtM valueOf(String str) {
        return (EnumC30208BtM) V0N.LJJJ(EnumC30208BtM.class, str);
    }

    public final boolean isInteractionFunctions() {
        return this.LJLIL;
    }

    EnumC30208BtM(boolean z) {
        this.LJLIL = z;
    }
}
