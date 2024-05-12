package X;

import android.content.Context;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewJSBConfig;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import kotlin.jvm.internal.o;

/* renamed from: X.19l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C283719l implements InterfaceC13440fs, IFetchResourceListener, InterfaceC40178Fpm {
    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public void onFailure(Exception exception) {
        o.LJIIIZ(exception, "exception");
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public void onSuccess(long j) {
    }

    public /* synthetic */ C283719l() {
    }

    public /* synthetic */ C283719l(Context context) {
    }

    public static String LIZ(int i) {
        switch (i) {
            case -1:
                return "SCREEN_ORIENTATION_UNSPECIFIED";
            case 0:
                return "SCREEN_ORIENTATION_LANDSCAPE";
            case 1:
                return "SCREEN_ORIENTATION_PORTRAIT";
            case 2:
                return "SCREEN_ORIENTATION_USER";
            case 3:
                return "SCREEN_ORIENTATION_BEHIND";
            case 4:
                return "SCREEN_ORIENTATION_SENSOR";
            case 5:
                return "SCREEN_ORIENTATION_NOSENSOR";
            case 6:
                return "SCREEN_ORIENTATION_SENSOR_LANDSCAPE";
            case 7:
                return "SCREEN_ORIENTATION_SENSOR_PORTRAIT";
            case 8:
                return "SCREEN_ORIENTATION_REVERSE_LANDSCAPE";
            case 9:
                return "SCREEN_ORIENTATION_REVERSE_PORTRAIT";
            case 10:
                return "SCREEN_ORIENTATION_FULL_SENSOR";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "SCREEN_ORIENTATION_USER_LANDSCAPE";
            case 12:
                return "SCREEN_ORIENTATION_USER_PORTRAIT";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "SCREEN_ORIENTATION_FULL_USER";
            case 14:
                return "SCREEN_ORIENTATION_LOCKED";
            default:
                return Integer.toString(i);
        }
    }

    @Override // X.InterfaceC40178Fpm
    public InterfaceC60614Nqc LIZIZ(C60737Nsb hybridContext) {
        boolean z;
        o.LJIIIZ(hybridContext, "hybridContext");
        if (((Boolean) AdSparkWebViewJSBConfig.LIZIZ.getValue()).booleanValue() && hybridContext.LIZIZ(C59222NMc.class) != null) {
            z = true;
        } else {
            z = false;
        }
        F04 f04 = new F04(C38084Ex6.LIZ, z);
        hybridContext.LJII(C37944Euq.class, f04);
        return F01.LIZ.LJIJJ(f04);
    }
}
