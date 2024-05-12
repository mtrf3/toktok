package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RAN {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(EnumC69113RAn step) {
        o.LJIIIZ(step, "step");
        switch (RAM.LIZ[step.ordinal()]) {
            case 1:
                return "b4816";
            case 2:
                return "b9472";
            case 3:
                return "b2325";
            case 4:
                return "b0442";
            case 5:
            case 6:
            case 7:
            case 8:
                return "b1865";
            case 9:
                return "b2190";
            case 10:
                return "b2981";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
                return "b8778";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "b6617";
            case 14:
            case 15:
                return "b2503";
            default:
                return "";
        }
    }
}
