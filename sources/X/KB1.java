package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KB1 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(C50948Jz6 c50948Jz6) {
        if (c50948Jz6 != null) {
            return c50948Jz6.getEcSearchEntranceValue();
        }
        return EnumC51281KAr.DEFAULT.getValue();
    }

    public static KB8 LIZIZ(int i) {
        EnumC51281KAr.Companion.getClass();
        switch (C51283KAt.LIZ[C51282KAs.LIZIZ(i).ordinal()]) {
            case 1:
                return KB8.CHANNEL_SHOP;
            case 2:
            case 3:
            case 4:
                return KB8.CHANNEL_MALL;
            case 5:
                return KB8.CHANNEL_PDP;
            case 6:
                return KB8.CHANNEL_FASHION;
            case 7:
                return KB8.CHANNEL_COMMENT_TOP_ANCHOR;
            case 8:
                return KB8.CHANNEL_FEED_BOTTOM_BAR;
            case 9:
                return KB8.CHANNEL_VIDEO_ANCHOR;
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                C78983UzD.LJIILL("Flash&Brand reach ECSearchEntrance");
                return KB8.CHANNEL_SHOP;
            case 17:
            case 18:
                return KB8.CHANNEL_SHOP;
            case 19:
                return KB8.CHANNEL_DEFAULT;
            default:
                throw new C162476Zf();
        }
    }

    public static KB2 LIZJ(int i) {
        EnumC51281KAr.Companion.getClass();
        switch (C51283KAt.LIZ[C51282KAs.LIZIZ(i).ordinal()]) {
            case 1:
                return KB2.SOURCE_SHOP;
            case 2:
            case 3:
            case 4:
                return KB2.SOURCE_MALL;
            case 5:
                return KB2.SOURCE_PDP;
            case 6:
                return KB2.SOURCE_FASHION;
            case 7:
                return KB2.SOURCE_COMMENT_TOP_ANCHOR;
            case 8:
                return KB2.SOURCE_FEED_BOTTOM_BAR;
            case 9:
                return KB2.SOURCE_ANCHOR_PRODUCT;
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                C78983UzD.LJIILL("Flash&Brand reach ECSearchEntrance");
                return KB2.SOURCE_SHOP;
            case 17:
            case 18:
                return KB2.SOURCE_SHOP;
            case 19:
                return KB2.SOURCE_DEFAULT;
            default:
                throw new C162476Zf();
        }
    }

    public static KB0 LIZLLL(int i) {
        EnumC51281KAr.Companion.getClass();
        switch (C51283KAt.LIZ[C51282KAs.LIZIZ(i).ordinal()]) {
            case 1:
                return KB0.TYPE_SHOP;
            case 2:
            case 3:
            case 4:
                return KB0.TYPE_MALL;
            case 5:
                return KB0.TYPE_PDP;
            case 6:
                return KB0.TYPE_FASHION;
            case 7:
                return KB0.TYPE_COMMENT_TOP_ANCHOR;
            case 8:
                return KB0.TYPE_FEED_BOTTOM_BAR;
            case 9:
                return KB0.TYPE_ANCHOR;
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                C78983UzD.LJIILL("Flash&Brand reach ECSearchEntrance");
                return KB0.TYPE_SHOP;
            case 17:
            case 18:
                return KB0.TYPE_SHOP;
            case 19:
                return KB0.TYPE_DEFAULT;
            default:
                throw new C162476Zf();
        }
    }

    public static KB4 LJFF(int i) {
        EnumC51281KAr.Companion.getClass();
        EnumC51281KAr ecSearchEntrance = C51282KAs.LIZIZ(i);
        o.LJIIIZ(ecSearchEntrance, "ecSearchEntrance");
        if (LJI(ecSearchEntrance)) {
            int i2 = C51283KAt.LIZ[ecSearchEntrance.ordinal()];
            if (i2 != 5) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        if (i2 != 9) {
                            return KB4.SOURCE_MALL_MIDDLE;
                        }
                        return KB4.SOURCE_ANCHOR_MIDDLE;
                    }
                    return KB4.SOURCE_FEED_BOTTOM_BAR_MIDDLE;
                }
                return KB4.SOURCE_COMMENT_TOP_ANCHOR_MIDDLE;
            }
            return KB4.SOURCE_PDP_MIDDLE;
        }
        return null;
    }

    public static boolean LJI(EnumC51281KAr ecSearchEntrance) {
        o.LJIIIZ(ecSearchEntrance, "ecSearchEntrance");
        if (ecSearchEntrance != EnumC51281KAr.DEFAULT) {
            return true;
        }
        return false;
    }

    public static boolean LJII(int i) {
        if (i != EnumC51281KAr.DEFAULT.getValue()) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(int i) {
        if (i == EnumC51281KAr.MALL.getValue() || i == EnumC51281KAr.HOMEPAGE_MALL.getValue() || i == EnumC51281KAr.FROM_HALF_SHOP.getValue()) {
            return true;
        }
        return false;
    }

    public static KB3 LJ(int i, boolean z) {
        EnumC51281KAr.Companion.getClass();
        EnumC51281KAr ecSearchEntrance = C51282KAs.LIZIZ(i);
        o.LJIIIZ(ecSearchEntrance, "ecSearchEntrance");
        if (LJI(ecSearchEntrance)) {
            int i2 = C51283KAt.LIZ[ecSearchEntrance.ordinal()];
            if (i2 != 5) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        if (i2 != 9) {
                            if (z) {
                                return KB3.SOURCE_SHOP;
                            }
                        } else {
                            return KB3.SOURCE_ANCHOR;
                        }
                    } else {
                        return KB3.SOURCE_FEED_BOTTOM_BAR;
                    }
                } else {
                    return KB3.SOURCE_COMMENT_PRODUCT_ANCHOR;
                }
            } else {
                return KB3.SOURCE_PDP;
            }
        }
        return null;
    }
}
