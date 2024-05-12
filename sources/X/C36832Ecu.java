package X;

import Y.ARunnableS13S0000000_6;
import android.media.AudioManager;
import android.os.Handler;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ecu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36832Ecu implements InterfaceC64592gB<Long> {
    public int LJLIL;
    public int LJLILLLLZI;

    @Override // X.InterfaceC64592gB
    public final void accept(Long l) {
        boolean z;
        int i;
        boolean z2 = true;
        this.LJLIL++;
        try {
            z = ((AudioManager) C16880lQ.LLIZ("audio", FKM.LIZ())).isMusicActive();
        } catch (Throwable unused) {
            z = true;
        }
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = this.LJLILLLLZI + 1;
        }
        this.LJLILLLLZI = i;
        if (this.LJLIL == 6) {
            C73411SrX c73411SrX = C36833Ecv.LJ;
            if (c73411SrX != null) {
                C36833Ecv.LJFF = null;
                c73411SrX.dispose();
            }
            if (this.LJLILLLLZI < 3 || C36833Ecv.LIZ(FKM.LIZ())) {
                return;
            }
            Iterator it = ((ArrayList) C36833Ecv.LJI).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                i3++;
                if (((InterfaceC36830Ecs) it.next()).LIZ()) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("LowMemoryAppKillSelf", "start killProcess ");
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJIIJ(31744, 0, "low_memory_kill", true) != 1) {
                        z2 = false;
                    }
                    String currentSessionId = AppLog.getCurrentSessionId();
                    C188727au c188727au = new C188727au();
                    if (z2) {
                        i2 = i3;
                    }
                    c188727au.LJIIIZ("self_terminate", String.valueOf(i2));
                    c188727au.LJ(C36833Ecv.LIZJ, "launch_time");
                    c188727au.LJ(C36833Ecv.LIZLLL, "session_duration");
                    c188727au.LJIIIZ("session_id", currentSessionId);
                    C38836FMa.LIZLLL("prf_low_memory_self_terminate", c188727au.LIZ);
                    C36833Ecv.LIZLLL = 0L;
                    if (!z2) {
                        return;
                    }
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS13S0000000_6(19), 5000L);
                    return;
                }
            }
        }
    }
}
