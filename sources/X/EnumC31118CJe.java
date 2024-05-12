package X;

/* renamed from: X.CJe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC31118CJe {
    UNKNOWN("unknown"),
    ANCHOR_CLOSED("gift_disable_anchor"),
    SPECIAL_ACCOUNT("special_account"),
    GIFT_FEATURE_DOES_NOT_SUPPORT("country_disable"),
    AGE_GATE("l1_anchor");

    public final String description;

    public String getDescription() {
        return this.description;
    }

    public static EnumC31118CJe parseEnum(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        return null;
    }

    public static EnumC31118CJe valueOf(String str) {
        return (EnumC31118CJe) V0N.LJJJ(EnumC31118CJe.class, str);
    }

    EnumC31118CJe(String str) {
        this.description = str;
    }
}
