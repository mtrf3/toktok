package X;

import android.content.Context;
import android.os.Vibrator;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WfM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82848WfM {
    public static final int LIZ = (int) KL2.LIZJ(C82891Wg3.LIZ(), 60.0f);
    public static final int LIZIZ = (int) KL2.LIZJ(C82891Wg3.LIZ(), 30.0f);
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;

    static {
        int i;
        KL2.LIZJ(C82891Wg3.LIZ(), 64.0f);
        if (C82852WfQ.LIZ().LJIIJ.invoke().booleanValue()) {
            i = 16;
        } else {
            i = 12;
        }
        LIZJ = (int) KL2.LIZJ(C82891Wg3.LIZ(), i);
        LIZLLL = (int) KL2.LIZJ(C82891Wg3.LIZ(), 4.0f);
        KL2.LIZJ(C82891Wg3.LIZ(), 5.0f);
        LJ = C82891Wg3.LIZ().getResources().getDimensionPixelSize(R.dimen.aji);
        LJFF = (int) KL2.LIZJ(C82891Wg3.LIZ(), 20.0f);
    }

    public static EnumC82528WaC LIZIZ(float f) {
        EnumC82528WaC enumC82528WaC = EnumC82528WaC.EPIC;
        if (f == enumC82528WaC.value()) {
            return enumC82528WaC;
        }
        EnumC82528WaC enumC82528WaC2 = EnumC82528WaC.SLOW;
        if (f == enumC82528WaC2.value()) {
            return enumC82528WaC2;
        }
        EnumC82528WaC enumC82528WaC3 = EnumC82528WaC.NORMAL;
        if (f == enumC82528WaC3.value()) {
            return enumC82528WaC3;
        }
        EnumC82528WaC enumC82528WaC4 = EnumC82528WaC.FAST;
        if (f == enumC82528WaC4.value()) {
            return enumC82528WaC4;
        }
        EnumC82528WaC enumC82528WaC5 = EnumC82528WaC.LAPSE;
        if (f == enumC82528WaC5.value()) {
            return enumC82528WaC5;
        }
        return null;
    }

    public static long LIZJ(long j) {
        if (C82852WfQ.LIZ().LJIIIZ.invoke().booleanValue()) {
            if (j > LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                return LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
            }
            return j;
        }
        if (C82852WfQ.LIZ().LJII.invoke().booleanValue() || C82852WfQ.LIZ().LJIIIZ.invoke().booleanValue()) {
            return Math.min(j, C82852WfQ.LIZ().LJIIIIZZ.invoke().longValue());
        }
        if (j <= LivePlayEnforceIntervalSetting.DEFAULT) {
            return j;
        }
        return LivePlayEnforceIntervalSetting.DEFAULT;
    }

    public static void LJ(Context context) {
        Vibrator vibrator = (Vibrator) C16880lQ.LLILL(context, "vibrator");
        if (vibrator != null) {
            try {
                vibrator.vibrate(10L);
            } catch (Exception e) {
                C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("vibrate exception: ");
                LIZ2.append(e.getMessage());
                LIZLLL2.w(X1D.LIZIZ(LIZ2));
            }
        }
    }

    public static void LIZLLL(int i, Context context) {
        Vibrator vibrator = (Vibrator) C16880lQ.LLILL(context, "vibrator");
        if (vibrator != null) {
            try {
                vibrator.vibrate(i);
            } catch (Exception e) {
                C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("vibrate exception: ");
                LIZ2.append(e.getMessage());
                LIZLLL2.w(X1D.LIZIZ(LIZ2));
            }
        }
    }

    public static float LIZ(Context context, C82849WfN c82849WfN, float f, VideoSegment videoSegment, int i) {
        if (videoSegment.LJ() - videoSegment.LJIIIZ() == videoSegment.duration) {
            return (C81184Vtc.LJ(context) - i) - LIZJ;
        }
        return (((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / (videoSegment.LJIIIIZZ() * c82849WfN.LJ)) + f + LIZJ;
    }
}
