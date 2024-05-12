package com.bytedance.pitaya.feature;

import X.C162476Zf;
import X.C16880lQ;
import X.C93241aNh;
import X.EnumC93240aNg;
import X.ExecutorC93235aNb;
import X.InterfaceC93239aNf;
import X.RunnableC93272aOC;
import X.X1D;
import Y.IDRunnableS90S0100000_32;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.pitaya.log.PitayaLogger;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class ApplicationLifecycleWatcher implements GenericLifecycleObserver {
    public static final LinkedList<InterfaceC93239aNf> LJLIL;
    public static EnumC93240aNg LJLILLLLZI;
    public static final ApplicationLifecycleWatcher LJLJI;

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

    static {
        ApplicationLifecycleWatcher applicationLifecycleWatcher = new ApplicationLifecycleWatcher();
        LJLJI = applicationLifecycleWatcher;
        LJLIL = new LinkedList<>();
        LJLILLLLZI = EnumC93240aNg.BACKGROUND;
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            new Handler(C16880lQ.LLJJJJ()).post(RunnableC93272aOC.LJLIL);
        } else {
            applicationLifecycleWatcher.LIZJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        LIZIZ(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZIZ(Lifecycle.Event.ON_DESTROY);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        LIZIZ(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        LIZIZ(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        LIZIZ(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        LIZIZ(Lifecycle.Event.ON_STOP);
    }

    public final void LIZJ() {
        try {
            LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.get();
            o.LJFF(lifecycleOwner, "ProcessLifecycleOwner.get()");
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJFF(lifecycle, "ProcessLifecycleOwner.get().lifecycle");
            lifecycle.addObserver(this);
        } catch (Exception e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    public static void LIZIZ(Lifecycle.Event event) {
        Lifecycle.State state;
        EnumC93240aNg enumC93240aNg;
        switch (C93241aNh.LIZ[event.ordinal()]) {
            case 1:
            case 2:
                state = Lifecycle.State.CREATED;
                break;
            case 3:
            case 4:
                state = Lifecycle.State.STARTED;
                break;
            case 5:
                state = Lifecycle.State.RESUMED;
                break;
            case 6:
                state = Lifecycle.State.DESTROYED;
                break;
            case 7:
                state = Lifecycle.State.INITIALIZED;
                break;
            default:
                throw new C162476Zf();
        }
        int i = C93241aNh.LIZIZ[state.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                enumC93240aNg = EnumC93240aNg.FOREGROUND;
            } else {
                throw new C162476Zf();
            }
        } else {
            enumC93240aNg = EnumC93240aNg.BACKGROUND;
        }
        ExecutorC93235aNb.LIZIZ(new IDRunnableS90S0100000_32(enumC93240aNg, 0));
    }

    public static void LIZ(InterfaceC93239aNf interfaceC93239aNf, EnumC93240aNg enumC93240aNg) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Notify listener app status is ");
        LIZ.append(enumC93240aNg);
        PitayaLogger.LIZ("AppLifecycleWat", X1D.LIZIZ(LIZ));
        int i = C93241aNh.LIZJ[enumC93240aNg.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            interfaceC93239aNf.onAppBackground();
            return;
        }
        interfaceC93239aNf.onAppForeground();
    }
}
