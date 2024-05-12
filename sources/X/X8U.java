package X;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8U implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ Application.ActivityLifecycleCallbacks LJLIL;
    public final /* synthetic */ X8S LJLILLLLZI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity p0) {
        o.LJIIJ(p0, "p0");
        this.LJLIL.onActivityPaused(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity p0) {
        o.LJIIJ(p0, "p0");
        this.LJLIL.onActivityResumed(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        o.LJIIJ(p0, "p0");
        o.LJIIJ(p1, "p1");
        this.LJLIL.onActivitySaveInstanceState(p0, p1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity p0) {
        o.LJIIJ(p0, "p0");
        this.LJLIL.onActivityStarted(p0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity p0) {
        o.LJIIJ(p0, "p0");
        this.LJLIL.onActivityStopped(p0);
    }

    public X8U(X8S x8s) {
        this.LJLILLLLZI = x8s;
        Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, VCZ.LIZ);
        if (newProxyInstance != null) {
            this.LJLIL = (Application.ActivityLifecycleCallbacks) newProxyInstance;
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        X8X LIZLLL;
        java.util.Set<X8F> LIZIZ;
        o.LJIIJ(activity, "activity");
        X8Y x8y = (X8Y) this.LJLILLLLZI.LIZIZ.getValue();
        x8y.getClass();
        Intent intent = activity.getIntent();
        o.LJFF(intent, "owner.intent");
        String LIZ = C44206HWo.LIZ(intent);
        if (LIZ != null && (LIZLLL = x8y.LIZ.LIZLLL(activity.getClass().getName())) != null && LIZLLL.LJLILLLLZI && (LIZIZ = x8y.LIZ.LIZIZ(LIZLLL)) != null) {
            for (X8F x8f : LIZIZ) {
                X8P<?> x8p = x8f.LJLIL;
                if (x8p != null && x8f.L(null, LIZ)) {
                    x8p.onDetach();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
        X8Y x8y = (X8Y) this.LJLILLLLZI.LIZIZ.getValue();
        x8y.getClass();
        X8X LIZLLL = x8y.LIZ.LIZLLL(activity.getClass().getName());
        if (LIZLLL != null) {
            if (LIZLLL.LJLIL && (activity instanceof ActivityC45651qj)) {
                ((ActivityC45651qj) activity).getSupportFragmentManager().LJJLIL(new X8T(x8y), false);
            }
            Intent intent = activity.getIntent();
            o.LJFF(intent, "owner.intent");
            String LIZ = C44206HWo.LIZ(intent);
            if (LIZ != null && !LIZLLL.LJLIL) {
                LIZLLL.LJLILLLLZI = true;
                java.util.Set<X8F> LIZIZ = x8y.LIZ.LIZIZ(LIZLLL);
                if (LIZIZ != null) {
                    for (X8F x8f : LIZIZ) {
                        X8P<?> x8p = x8f.LJLIL;
                        if (x8p != null && x8f.L(null, LIZ)) {
                            C36411bp c36411bp = x8p.LJLIL;
                            InterfaceC74236TBo property = X8P.LJLJL[0];
                            c36411bp.getClass();
                            o.LJIIJ(property, "property");
                            c36411bp.LJLIL = new WeakReference(activity);
                            x8p.LIZ(bundle);
                        }
                    }
                }
            }
        }
    }
}
