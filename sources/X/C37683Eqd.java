package X;

import Y.ARunnableS9S0201000_6;
import android.app.Activity;
import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Eqd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37683Eqd extends EG4 {
    public final List<String> LJLIL = new ArrayList();
    public final /* synthetic */ C37688Eqi LJLILLLLZI;

    public C37683Eqd(C37688Eqi c37688Eqi) {
        this.LJLILLLLZI = c37688Eqi;
    }

    @Override // X.EG4, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        String className = activity.getComponentName().getClassName();
        if (((ArrayList) this.LJLIL).contains(className)) {
            HandlerC37686Eqg handlerC37686Eqg = this.LJLILLLLZI.LIZLLL;
            if (handlerC37686Eqg != null) {
                try {
                    try {
                        if (((Handler) C36508EUm.LIZJ(handlerC37686Eqg.LJLJI, "mHandler")) == handlerC37686Eqg) {
                            Choreographer choreographer = handlerC37686Eqg.LJLJI;
                            try {
                                C37685Eqf.LIZIZ(C37685Eqf.LIZ(C36508EUm.LIZ(choreographer.getClass(), "mHandler")), choreographer, handlerC37686Eqg.LJLIL);
                            } catch (Throwable th) {
                                android.util.Log.getStackTraceString(th);
                            }
                            C37684Eqe.LIZIZ(handlerC37686Eqg, handlerC37686Eqg.LJLIL);
                        }
                    } catch (Throwable th2) {
                        android.util.Log.getStackTraceString(th2);
                    }
                } catch (Throwable unused) {
                }
            }
            ((ArrayList) this.LJLIL).remove(className);
        }
        HandlerC37687Eqh handlerC37687Eqh = this.LJLILLLLZI.LJ;
        if (handlerC37687Eqh != null) {
            try {
                ViewParent viewParent = handlerC37687Eqh.LJLILLLLZI.get();
                if (viewParent != null && C37684Eqe.LJFF(viewParent) == handlerC37687Eqh) {
                    C37684Eqe.LIZJ(handlerC37687Eqh.LJLIL, viewParent);
                    C37684Eqe.LIZIZ(handlerC37687Eqh, handlerC37687Eqh.LJLIL);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        super.onActivityPostResumed(activity);
        Choreographer LLIIIJ = C16880lQ.LLIIIJ();
        String className = activity.getComponentName().getClassName();
        if (!((ArrayList) this.LJLIL).contains(className)) {
            try {
                Handler handler = (Handler) C36508EUm.LIZJ(LLIIIJ, "mHandler");
                if (handler != null) {
                    this.LJLILLLLZI.LIZLLL = new HandlerC37686Eqg(handler, LLIIIJ);
                    C37688Eqi.LIZIZ(handler, this.LJLILLLLZI.LIZLLL);
                }
            } catch (Throwable th) {
                android.util.Log.getStackTraceString(th);
            }
            ((ArrayList) this.LJLIL).add(className);
        }
        View decorView = activity.getWindow().getDecorView();
        if (decorView != null) {
            FAJ.LIZLLL(LLIIIJ, new ARunnableS9S0201000_6(2, this, decorView, 1));
        }
    }
}
