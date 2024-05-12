package X;

/* renamed from: X.5xI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC151645xI {
    NAV_BAR_AT_TOP,
    NAV_BAR_AT_BOTTOM,
    NO_NAV_BAR;

    public static EnumC151645xI valueOf(String str) {
        return (EnumC151645xI) V0N.LJJJ(EnumC151645xI.class, str);
    }

    public final boolean isExist$tools_creative_ui_release() {
        if (this != NO_NAV_BAR) {
            return true;
        }
        return false;
    }

    public final boolean isInBottom$tools_creative_ui_release() {
        if (this == NAV_BAR_AT_BOTTOM) {
            return true;
        }
        return false;
    }

    public final boolean isInTop$tools_creative_ui_release() {
        if (this == NAV_BAR_AT_TOP) {
            return true;
        }
        return false;
    }
}
