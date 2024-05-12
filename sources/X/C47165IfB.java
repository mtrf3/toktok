package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.IfB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47165IfB {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC47176IfM LIZ(EnumC47177IfN enumC47177IfN) {
        if (enumC47177IfN != null) {
            switch (C47166IfC.LIZ[enumC47177IfN.ordinal()]) {
                case 1:
                    return EnumC47176IfM.Undefine;
                case 2:
                    return EnumC47176IfM.Standard;
                case 3:
                    return EnumC47176IfM.High;
                case 4:
                    return EnumC47176IfM.SuperHigh;
                case 5:
                    return EnumC47176IfM.ExtremelyHigh;
                case 6:
                    return EnumC47176IfM.FourK;
                case 7:
                    return EnumC47176IfM.HDR;
                case 8:
                    return EnumC47176IfM.Auto;
                case 9:
                    return EnumC47176IfM.L_Standard;
                case 10:
                    return EnumC47176IfM.H_High;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    return EnumC47176IfM.TwoK;
                case 12:
                    return EnumC47176IfM.ExtremelyHigh_50F;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    return EnumC47176IfM.TwoK_50F;
                case 14:
                    return EnumC47176IfM.FourK_50F;
                case 15:
                    return EnumC47176IfM.ExtremelyHigh_60F;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    return EnumC47176IfM.TwoK_60F;
                case 17:
                    return EnumC47176IfM.FourK_60F;
                case 18:
                    return EnumC47176IfM.ExtremelyHigh_120F;
                case 19:
                    return EnumC47176IfM.TwoK_120F;
                case 20:
                    return EnumC47176IfM.FourK_120F;
            }
        }
        return EnumC47176IfM.Undefine;
    }

    public static EnumC47177IfN LIZIZ(EnumC47176IfM resolution) {
        o.LJIIIZ(resolution, "resolution");
        switch (C47166IfC.LIZIZ[resolution.ordinal()]) {
            case 1:
                return EnumC47177IfN.Undefine;
            case 2:
                return EnumC47177IfN.Standard;
            case 3:
                return EnumC47177IfN.High;
            case 4:
                return EnumC47177IfN.SuperHigh;
            case 5:
                return EnumC47177IfN.ExtremelyHigh;
            case 6:
                return EnumC47177IfN.FourK;
            case 7:
                return EnumC47177IfN.HDR;
            case 8:
                return EnumC47177IfN.Auto;
            case 9:
                return EnumC47177IfN.L_Standard;
            case 10:
                return EnumC47177IfN.H_High;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return EnumC47177IfN.TwoK;
            case 12:
                return EnumC47177IfN.ExtremelyHigh_50F;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return EnumC47177IfN.TwoK_50F;
            case 14:
                return EnumC47177IfN.FourK_50F;
            case 15:
                return EnumC47177IfN.ExtremelyHigh_60F;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return EnumC47177IfN.TwoK_60F;
            case 17:
                return EnumC47177IfN.FourK_60F;
            case 18:
                return EnumC47177IfN.ExtremelyHigh_120F;
            case 19:
                return EnumC47177IfN.TwoK_120F;
            case 20:
                return EnumC47177IfN.FourK_120F;
            default:
                return EnumC47177IfN.Undefine;
        }
    }
}
