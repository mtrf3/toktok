package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.signal.Signal;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.PvG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65998PvG implements Application.ActivityLifecycleCallbacks {
    public static final C65998PvG LJLIL = new C65998PvG();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        String LIZ = C64401PPh.LIZ();
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        List<String> list = heliosEnvImpl.LJIIJ.signalConfig.lifecycle.get(LIZ);
        if (list != null && list.contains("onDestroyed")) {
            String substring = LIZ.substring(s.LJJLIIJ(LIZ, ".", 6) + 1);
            o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
            Signal signal = new Signal(i0.LJFF(substring, " onDestroyed"));
            EnumC66029Pvl enumC66029Pvl = EnumC66029Pvl.APP;
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.CAMERA, signal);
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.AUDIO, signal);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        String LIZ = C64401PPh.LIZ();
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        List<String> list = heliosEnvImpl.LJIIJ.signalConfig.lifecycle.get(LIZ);
        if (list != null && list.contains("onPaused")) {
            String substring = LIZ.substring(s.LJJLIIJ(LIZ, ".", 6) + 1);
            o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
            Signal signal = new Signal(i0.LJFF(substring, " onPause"));
            EnumC66029Pvl enumC66029Pvl = EnumC66029Pvl.APP;
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.CAMERA, signal);
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.AUDIO, signal);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        String LIZ = C64401PPh.LIZ();
        String substring = LIZ.substring(s.LJJLIIJ(LIZ, ".", 6) + 1);
        o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
        Signal signal = new Signal(i0.LJFF(substring, " onResume"));
        EnumC66029Pvl enumC66029Pvl = EnumC66029Pvl.APP;
        C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.CAMERA, signal);
        C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.AUDIO, signal);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        String LIZ = C64401PPh.LIZ();
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        List<String> list = heliosEnvImpl.LJIIJ.signalConfig.lifecycle.get(LIZ);
        if (list != null && list.contains("onStarted")) {
            String substring = LIZ.substring(s.LJJLIIJ(LIZ, ".", 6) + 1);
            o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
            Signal signal = new Signal(i0.LJFF(substring, " onStarted"));
            EnumC66029Pvl enumC66029Pvl = EnumC66029Pvl.APP;
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.CAMERA, signal);
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.AUDIO, signal);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        String LIZ = C64401PPh.LIZ();
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        List<String> list = heliosEnvImpl.LJIIJ.signalConfig.lifecycle.get(LIZ);
        if (list != null && list.contains("onStopped")) {
            String substring = LIZ.substring(s.LJJLIIJ(LIZ, ".", 6) + 1);
            o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
            Signal signal = new Signal(i0.LJFF(substring, " onStopped"));
            EnumC66029Pvl enumC66029Pvl = EnumC66029Pvl.APP;
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.CAMERA, signal);
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.AUDIO, signal);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        String LIZ = C64401PPh.LIZ();
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        List<String> list = heliosEnvImpl.LJIIJ.signalConfig.lifecycle.get(LIZ);
        if (list != null && list.contains("onCreated")) {
            String substring = LIZ.substring(s.LJJLIIJ(LIZ, ".", 6) + 1);
            o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
            Signal signal = new Signal(i0.LJFF(substring, " onCreated"));
            EnumC66029Pvl enumC66029Pvl = EnumC66029Pvl.APP;
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.CAMERA, signal);
            C65985Pv3.LIZIZ(enumC66029Pvl, EnumC65997PvF.AUDIO, signal);
        }
    }
}
