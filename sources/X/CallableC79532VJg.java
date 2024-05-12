package X;

import Y.ARunnableS25S0300000_14;
import Y.ARunnableS33S0200000_14;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import java.util.concurrent.Callable;

/* renamed from: X.VJg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CallableC79532VJg implements Callable<Runnable> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ java.util.Map LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ VPA LJLJJL;
    public final /* synthetic */ VOR LJLJJLL;

    @Override // java.util.concurrent.Callable
    public final Runnable call() {
        LynxBaseUI LIZLLL;
        UIShadowProxy uIShadowProxy;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UIOwner.createViewAsync.");
            LIZ.append(this.LJLIL);
            String LIZIZ = X1D.LIZIZ(LIZ);
            TraceEvent.LIZIZ(LIZIZ);
            LynxBaseUI[] lynxBaseUIArr = new LynxBaseUI[1];
            VOR vor = this.LJLJJLL;
            int i = this.LJLILLLLZI;
            String str = this.LJLIL;
            java.util.Map<String, VNA> map = this.LJLJI;
            boolean z = this.LJLJJI;
            if (vor.LIZ < 0 && str.equals("page")) {
                LIZLLL = vor.LIZIZ;
                vor.LIZ = i;
            } else {
                LIZLLL = vor.LIZLLL(str, z);
                LIZLLL.setEvents(map);
            }
            LIZLLL.setSign(i, str);
            lynxBaseUIArr[0] = LIZLLL;
            VOR vor2 = this.LJLJJLL;
            VPA vpa = this.LJLJJL;
            vor2.getClass();
            if (vpa == null) {
                uIShadowProxy = null;
            } else {
                if (VOR.LJIIJJI(vpa)) {
                    uIShadowProxy = new UIShadowProxy(vor2.LIZJ, LIZLLL);
                } else {
                    uIShadowProxy = null;
                }
                LIZLLL.updatePropertiesInterval(vpa);
            }
            TraceEvent.LJ(LIZIZ);
            return new ARunnableS25S0300000_14(this, lynxBaseUIArr, uIShadowProxy, 19);
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("createViewAsync failed, tagName:");
            LIZ2.append(this.LJLIL);
            LIZ2.append(", error:");
            LIZ2.append(th);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            LLog.LIZLLL(4, "LynxUIOwner", LIZIZ2);
            Exception exc = new Exception(LIZIZ2);
            exc.setStackTrace(th.getStackTrace());
            C79411VEp.LIZJ(new ARunnableS33S0200000_14(this, exc, 74));
            return null;
        }
    }

    public CallableC79532VJg(VOR vor, String str, int i, java.util.Map map, boolean z, VPA vpa) {
        this.LJLJJLL = vor;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = map;
        this.LJLJJI = z;
        this.LJLJJL = vpa;
    }
}
