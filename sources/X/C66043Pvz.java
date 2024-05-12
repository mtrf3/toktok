package X;

import Y.ARunnableS1S0000200_11;
import android.os.Handler;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Pvz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66043Pvz implements InterfaceC66032Pvo {
    public static long LIZIZ;
    public static ARunnableS1S0000200_11 LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static final C66043Pvz LJFF = new C66043Pvz();
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C66047Pw3.LJLIL);

    public static InterfaceC66048Pw4 LIZJ() {
        return (InterfaceC66048Pw4) LIZ.getValue();
    }

    static {
        long j;
        InterfaceC66048Pw4 LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            j = LIZJ2.getLong("alog_last_upload_time");
        } else {
            j = 0;
        }
        LIZIZ = j;
    }

    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel newSettings) {
        long j;
        o.LJIIIZ(newSettings, "newSettings");
        LIZLLL = newSettings.alogEnabled;
        LJ = newSettings.alogDuration;
        InterfaceC66048Pw4 LIZJ2 = LIZJ();
        long j2 = 0;
        if (LIZJ2 != null) {
            j = LIZJ2.getLong("alog_last_request_start_time");
        } else {
            j = 0;
        }
        InterfaceC66048Pw4 LIZJ3 = LIZJ();
        if (LIZJ3 != null) {
            j2 = LIZJ3.getLong("alog_last_request_end_time");
        }
        if (1 > j || j2 <= j) {
            return;
        }
        LIZLLL(j, j2, 0L);
    }

    public static ApmEvent LIZIZ(String str, String str2) {
        ApmEvent apmEvent = new ApmEvent("helios_upload_alog");
        apmEvent.LIZ(str, "code");
        apmEvent.LIZIZ(str2, "message");
        return apmEvent;
    }

    public static void LIZLLL(long j, long j2, long j3) {
        if (!LIZLLL) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isFirstStart=");
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
            LIZ2.append(heliosEnvImpl.LIZLLL);
            C66059PwF.LIZIZ(LIZIZ("-102", X1D.LIZIZ(LIZ2)));
            return;
        }
        ARunnableS1S0000200_11 aRunnableS1S0000200_11 = LIZJ;
        if (aRunnableS1S0000200_11 != null) {
            HandlerThreadC65936PuG.LIZ();
            HandlerThreadC65936PuG.LJLILLLLZI.removeCallbacks(aRunnableS1S0000200_11);
        }
        LIZJ = new ARunnableS1S0000200_11(j, j2, 0);
        HandlerThreadC65936PuG.LIZ();
        Handler handler = HandlerThreadC65936PuG.LJLILLLLZI;
        ARunnableS1S0000200_11 aRunnableS1S0000200_112 = LIZJ;
        o.LJI(aRunnableS1S0000200_112);
        handler.postDelayed(aRunnableS1S0000200_112, j3);
    }
}
