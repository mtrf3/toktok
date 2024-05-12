package X;

import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U1F implements Q09, HWI, InterfaceC15710jX {
    @Override // X.HWI
    public void LIZIZ() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static OSZ LIZLLL(int i) {
        int i2 = R.anim.cb;
        int i3 = R.anim.ca;
        switch (i) {
            case 0:
            case 6:
            default:
                i2 = R.anim.g2;
                i3 = R.anim.ft;
                break;
            case 1:
                i2 = 0;
                i3 = 0;
                break;
            case 2:
                i3 = R.anim.fu;
                i2 = R.anim.g3;
                break;
            case 3:
            case 9:
                i2 = R.anim.y;
                i3 = 0;
                break;
            case 4:
                i3 = R.anim.fv;
                i2 = R.anim.g0;
                break;
            case 5:
                i2 = R.anim.g0;
                i3 = 0;
                break;
            case 7:
                i2 = R.anim.y;
                break;
            case 8:
                i3 = R.anim.fs;
                i2 = R.anim.y;
                break;
            case 10:
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                i2 = R.anim.fb;
                i3 = R.anim.go;
                break;
            case 12:
                i2 = R.anim.f9;
                i3 = R.anim.go;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                i2 = R.anim.f8;
                i3 = R.anim.go;
                break;
            case 14:
                i2 = R.anim.f_;
                i3 = R.anim.go;
                break;
            case 15:
                i2 = R.anim.f6;
                i3 = R.anim.go;
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                i2 = R.anim.f5;
                i3 = R.anim.go;
                break;
            case 17:
                i2 = R.anim.f7;
                i3 = R.anim.go;
                break;
            case 18:
                i3 = R.anim.go;
                break;
        }
        return new OSZ(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static OSZ LJ(int i) {
        int i2 = R.anim.cb;
        int i3 = R.anim.ft;
        switch (i) {
            case 0:
            case 5:
            default:
                i2 = R.anim.g0;
                i3 = R.anim.fv;
                break;
            case 1:
                i2 = 0;
                i3 = 0;
                break;
            case 2:
                i3 = R.anim.fw;
                i2 = R.anim.g1;
                break;
            case 3:
                i2 = 0;
                i3 = R.anim.x;
                break;
            case 4:
                i2 = R.anim.g2;
                break;
            case 6:
                i2 = 0;
                break;
            case 7:
                i3 = R.anim.x;
                break;
            case 8:
                i2 = R.anim.fz;
                i3 = R.anim.x;
                break;
            case 9:
                i2 = R.anim.go;
                i3 = R.anim.x;
                break;
            case 10:
                i3 = R.anim.ca;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                i3 = R.anim.fa;
                i2 = R.anim.go;
                break;
            case 12:
            case 18:
                i3 = R.anim.f3;
                i2 = R.anim.go;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                i3 = R.anim.f2;
                i2 = R.anim.go;
                break;
            case 14:
                i3 = R.anim.f4;
                i2 = R.anim.go;
                break;
            case 15:
                i3 = R.anim.f0;
                i2 = R.anim.go;
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                i3 = R.anim.ez;
                i2 = R.anim.go;
                break;
            case 17:
                i3 = R.anim.f1;
                i2 = R.anim.go;
                break;
        }
        return new OSZ(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    @Override // X.Q09
    public JSONObject LIZ(Cert cert) {
        o.LJIIIZ(cert, "cert");
        return Q0J.LIZ(cert);
    }

    @Override // X.InterfaceC15710jX
    public void onFinish(boolean z) {
        if (!z) {
            CL6.LIZIZ("match_in_progress");
        }
        C75622Tm6.LJIJI(EnumC76429Tz7.START_ANIMATION, z, null);
    }

    public static void LIZJ(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        OSZ LIZLLL = LIZLLL(i);
        activity.overridePendingTransition(((Integer) LIZLLL.getFirst()).intValue(), ((Integer) LIZLLL.getSecond()).intValue());
    }

    public static void LJFF(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        OSZ LJ = LJ(i);
        activity.overridePendingTransition(((Integer) LJ.getFirst()).intValue(), ((Integer) LJ.getSecond()).intValue());
    }
}
