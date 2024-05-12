package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.GEz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC41201GEz extends InterfaceC41034G8o, InterfaceC40967G5z, InterfaceC41448GOm<GGH>, InterfaceC40998G7e {
    void Kf(boolean z);

    void N10(boolean z);

    void Sn0(boolean z);

    @Override // X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    /* synthetic */ void onCreate();

    @Override // X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    /* synthetic */ void onDestroy();

    @Override // X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    /* synthetic */ void onPause();

    @Override // X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    /* synthetic */ void onResume();

    @Override // X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    /* synthetic */ void onStart();

    @Override // X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    /* synthetic */ void onStop();

    Object rd0(Fragment fragment, InterfaceC67352kd<? super Integer> interfaceC67352kd);

    void sr(Fragment fragment);

    boolean vz(String str);

    void wb0(Context context);
}
