package X;

/* renamed from: X.BZr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC28999BZr {
    EFFECT_MESSAGE_NULL(-10),
    ASSET_NOT_FOUND(-11),
    FOUNDATION_ERROR(-13),
    DOWNLOAD_CANCELED(-14),
    GIFT_MESSAGE_NULL(-15),
    LOCAL_PATH_ERROR(-16),
    RESOURCE_TYPE_ERROR(-17),
    PLAYER_NOT_READY(-18),
    BACKGROUND_PLAY(-19),
    EFFECT_VIEW_IS_NULL(-20),
    SEND_EVENT_ERROR(-21);

    public int LJLIL;

    public static EnumC28999BZr valueOf(String str) {
        return (EnumC28999BZr) V0N.LJJJ(EnumC28999BZr.class, str);
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final void setErrorCode(int i) {
        this.LJLIL = i;
    }

    EnumC28999BZr(int i) {
        this.LJLIL = i;
    }
}
