package com.bytedance.ies.bullet.ui.common;

import X.C59551NYt;
import X.FCQ;
import X.InterfaceC60180Njc;
import X.InterfaceC60187Njj;
import X.OHQ;
import X.ORZ;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class BulletActivityWrapper implements InterfaceC60187Njj {
    public final WeakReference<Activity> LJLIL;
    public final List<InterfaceC60180Njc> LJLILLLLZI;

    /* loaded from: classes11.dex */
    public static final class BulletLifecycleObserver implements GenericLifecycleObserver {
        public final WeakReference<BulletActivityWrapper> LJLIL;
        public final WeakReference<LifecycleOwner> LJLILLLLZI;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_CREATE) {
                onCreate();
                return;
            }
            if (event == Lifecycle.Event.ON_START) {
                onStart();
                return;
            }
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
                return;
            }
            if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
            } else if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        public final void onCreate() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity activity;
            if (this.LJLIL.get() != null && (bulletActivityWrapper = this.LJLIL.get()) != null && (activity = bulletActivityWrapper.getActivity()) != null) {
                bulletActivityWrapper.LJFF(activity, null);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity activity;
            Lifecycle lifecycle;
            if (this.LJLIL.get() != null && (bulletActivityWrapper = this.LJLIL.get()) != null && (activity = bulletActivityWrapper.getActivity()) != null) {
                bulletActivityWrapper.LIZJ(activity);
                LifecycleOwner lifecycleOwner = this.LJLILLLLZI.get();
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.removeObserver(this);
                }
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity activity;
            if (this.LJLIL.get() != null && (bulletActivityWrapper = this.LJLIL.get()) != null && (activity = bulletActivityWrapper.getActivity()) != null) {
                bulletActivityWrapper.LIZIZ(activity);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity activity;
            if (this.LJLIL.get() != null && (bulletActivityWrapper = this.LJLIL.get()) != null && (activity = bulletActivityWrapper.getActivity()) != null) {
                bulletActivityWrapper.LIZLLL(activity);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity activity;
            if (this.LJLIL.get() != null && (bulletActivityWrapper = this.LJLIL.get()) != null && (activity = bulletActivityWrapper.getActivity()) != null) {
                bulletActivityWrapper.LJII(activity);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity activity;
            if (this.LJLIL.get() != null && (bulletActivityWrapper = this.LJLIL.get()) != null && (activity = bulletActivityWrapper.getActivity()) != null) {
                bulletActivityWrapper.LJ(activity);
            }
        }

        public BulletLifecycleObserver(WeakReference<BulletActivityWrapper> weakReference, WeakReference<LifecycleOwner> weakReference2) {
            this.LJLIL = weakReference;
            this.LJLILLLLZI = weakReference2;
        }
    }

    public final List<InterfaceC60180Njc> LJIILL() {
        return ORZ.LLJI(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC60187Njj
    public final Activity getActivity() {
        return this.LJLIL.get();
    }

    public BulletActivityWrapper(Activity activity) {
        o.LJIIJ(activity, "activity");
        this.LJLIL = new WeakReference<>(activity);
        this.LJLILLLLZI = new ArrayList();
    }

    @Override // X.InterfaceC60187Njj
    public final void LIZ(InterfaceC60180Njc delegate) {
        o.LJIIJ(delegate, "delegate");
        ((ArrayList) this.LJLILLLLZI).add(delegate);
    }

    @Override // X.InterfaceC60180Njc
    public final void LIZIZ(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZIZ(activity);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60180Njc
    public final void LIZJ(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZJ(activity);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60180Njc
    public final void LIZLLL(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZLLL(activity);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60180Njc
    public final void LJ(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LJ(activity);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60180Njc
    public final void LJII(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LJII(activity);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60187Njj
    public final void LJIIJJI(C59551NYt delegate) {
        o.LJIIJ(delegate, "delegate");
        ((ArrayList) this.LJLILLLLZI).remove(delegate);
    }

    @Override // X.InterfaceC60180Njc
    public final boolean LJIIL(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                return it.next().LJIIL(activity);
            } catch (FCQ unused) {
            }
        }
        return false;
    }

    public final void LJIILJJIL(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(new BulletLifecycleObserver(new WeakReference(this), new WeakReference(lifecycleOwner)));
    }

    @Override // X.InterfaceC60180Njc
    public final void LJFF(Activity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LJFF(activity, bundle);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60180Njc
    public final void LJIIIIZZ(Activity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LJIIIIZZ(activity, bundle);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60180Njc
    public final void LJIIIZ(Activity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LJIIIZ(activity, bundle);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60180Njc
    public final void LJIILIIL(Activity activity, boolean z) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LJIILIIL(activity, z);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60180Njc
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().onConfigurationChanged(activity, configuration);
            } catch (FCQ unused) {
            }
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException: Cannot invoke "jadx.api.plugins.input.data.annotations.EncodedValue.getValue()" because the return value of "jadx.core.dex.nodes.FieldNode.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" is null
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.getConstString(ProcessKotlinInternals.java:163)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processInvoke(ProcessKotlinInternals.java:122)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:97)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:84)
     */
    @Override // X.InterfaceC60180Njc
    public final void LJI(Activity activity, int i, String[] strArr, int[] grantResults) {
        o.LJIIJ(activity, "activity");
        o.LJIIJ(strArr, OHQ.LIZIZ);
        o.LJIIJ(grantResults, "grantResults");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LJI(activity, i, strArr, grantResults);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // X.InterfaceC60180Njc
    public final void LJIIJ(Activity activity, int i, int i2, Intent intent) {
        o.LJIIJ(activity, "activity");
        Iterator<InterfaceC60180Njc> it = LJIILL().iterator();
        while (it.hasNext()) {
            try {
                it.next().LJIIJ(activity, i, i2, intent);
            } catch (FCQ unused) {
            }
        }
    }
}
