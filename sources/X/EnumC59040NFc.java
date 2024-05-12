package X;

/* renamed from: X.NFc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC59040NFc {
    POLITICAL_ACCOUNT("political_account"),
    STATE_CONTROLLED_MEDIA("state_controlled_media"),
    SHOP_ACCOUNT("shop_account"),
    BUSINESS_ACCOUNT("business_account"),
    PRIVACY_ACCOUNT("privacy_account");

    public final String LJLIL;

    public static EnumC59040NFc valueOf(String str) {
        return (EnumC59040NFc) V0N.LJJJ(EnumC59040NFc.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC59040NFc(String str) {
        this.LJLIL = str;
    }
}
