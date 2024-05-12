package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.powerpermissions.IGetInterceptor;
import com.ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NyQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61098NyQ {
    public final void LIZ() {
        if (!C61099NyR.LJ) {
            synchronized (this) {
                if (!C61099NyR.LJ) {
                    IGetInterceptor LJ = PowerPermissionsTask.LJ();
                    if (LJ != null) {
                        List<AbstractC61106NyY> interceptors = LJ.getInterceptors();
                        if (interceptors != null) {
                            for (AbstractC61106NyY it : interceptors) {
                                o.LJIIIIZZ(it, "it");
                                C61099NyR.LIZJ.add(it);
                            }
                        }
                        List<AbstractC61106NyY> LIZLLL = LJ.LIZLLL();
                        if (LIZLLL != null) {
                            for (AbstractC61106NyY it2 : LIZLLL) {
                                o.LJIIIIZZ(it2, "it");
                                C61099NyR.LIZLLL.add(it2);
                            }
                        }
                    }
                    C61099NyR.LJ = true;
                }
            }
        }
    }

    public final C61099NyR LIZIZ(Activity activity, Cert cert) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cert, "cert");
        LIZ();
        C61099NyR c61099NyR = new C61099NyR(activity, cert);
        Iterator<AbstractC61106NyY> it = C61099NyR.LIZJ.iterator();
        while (it.hasNext()) {
            c61099NyR.LIZ.LIZ(new C61104NyW(it.next()));
        }
        return c61099NyR;
    }
}
