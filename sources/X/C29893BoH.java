package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BoH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29893BoH {
    public static final Integer LIZ(EnumC30204BtI enumC30204BtI) {
        o.LJIIIZ(enumC30204BtI, "<this>");
        int i = C30202BtG.LIZ[enumC30204BtI.ordinal()];
        Integer valueOf = Integer.valueOf(R.attr.avh);
        switch (i) {
            case 1:
                return Integer.valueOf(R.drawable.d4k);
            case 2:
                return Integer.valueOf(R.drawable.cv9);
            case 3:
                return Integer.valueOf(R.attr.av8);
            case 4:
                return Integer.valueOf(R.drawable.d0a);
            case 5:
                return Integer.valueOf(R.drawable.cxm);
            case 6:
                return Integer.valueOf(R.drawable.cus);
            case 7:
                return Integer.valueOf(R.drawable.d2n);
            case 8:
                return Integer.valueOf(R.drawable.d5o);
            case 9:
                return Integer.valueOf(R.drawable.d5k);
            case 10:
                return Integer.valueOf(R.drawable.cyp);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return Integer.valueOf(R.drawable.d0u);
            case 12:
                return Integer.valueOf(R.drawable.cwj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return Integer.valueOf(R.drawable.d60);
            case 14:
                return Integer.valueOf(R.drawable.d5c);
            case 15:
                return Integer.valueOf(R.drawable.d0q);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return Integer.valueOf(R.drawable.cx9);
            case 17:
                return Integer.valueOf(R.drawable.cwg);
            case 18:
                return Integer.valueOf(R.drawable.cx7);
            case 19:
                return Integer.valueOf(R.drawable.cx4);
            case 20:
                return Integer.valueOf(R.drawable.cuc);
            case 21:
                return Integer.valueOf(R.attr.as8);
            case 22:
            case 23:
                return valueOf;
            case 24:
                return Integer.valueOf(R.drawable.d3u);
            default:
                return null;
        }
    }

    public static final Integer LIZIZ(EnumC30204BtI enumC30204BtI) {
        o.LJIIIZ(enumC30204BtI, "<this>");
        int i = C30202BtG.LIZ[enumC30204BtI.ordinal()];
        if (i != 20) {
            switch (i) {
                case 36:
                    return Integer.valueOf(R.layout.dly);
                case 37:
                    return Integer.valueOf(R.layout.dm1);
                case 38:
                    return Integer.valueOf(R.layout.dmm);
                case 39:
                    return Integer.valueOf(R.layout.dde);
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    return Integer.valueOf(R.layout.dde);
                default:
                    return null;
            }
        }
        return Integer.valueOf(R.layout.dde);
    }
}
