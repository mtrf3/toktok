package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptorTTNet;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet;
import com.ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import com.ss.android.ugc.aweme.utils.SecUidInterceptorTTNet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pcf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64845Pcf extends AbstractC65156Phg {
    @Override // X.AbstractC65156Phg
    public final synchronized InterfaceC65157Phh LJIIL() {
        C64841Pcb.LIZ().LJFF();
        C64852Pcm c64852Pcm = new C64852Pcm();
        if (c64852Pcm.LIZIZ == null) {
            c64852Pcm.LIZIZ = new C48153Iv7();
        }
        C48153Iv7 c48153Iv7 = c64852Pcm.LIZIZ;
        c48153Iv7.LIZJ = 60000L;
        c48153Iv7.LIZLLL = 60000L;
        c48153Iv7.LJ = 60000L;
        c64852Pcm.LJIIL(C64841Pcb.LIZ().LJ());
        c64852Pcm.LJIIL(new ApiCheckInterceptorTTNet());
        c64852Pcm.LJIIL(new DevicesNullInterceptorTTNet());
        c64852Pcm.LJIIL(new UrlTransformInterceptorTTNet());
        c64852Pcm.LJIIL(new SecUidInterceptorTTNet());
        List LIZIZ = InterceptorHolder.LIZLLL().LIZIZ();
        if (!C79004UzY.LJJIFFI(LIZIZ)) {
            Iterator it = LIZIZ.iterator();
            while (it.hasNext()) {
                c64852Pcm.LJIIL((InterfaceC37216Ej6) it.next());
            }
        }
        c64852Pcm.LIZJ = new PZL();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("change_network_client", 1) == 0) {
            return c64852Pcm;
        }
        return new C65153Phd(c64852Pcm);
    }
}
