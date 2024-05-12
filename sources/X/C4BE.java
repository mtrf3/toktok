package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.4BE, reason: invalid class name */
/* loaded from: classes2.dex */
public interface C4BE extends InterfaceC105124Aq {
    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    /* bridge */ /* synthetic */ void onDestroy();

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    /* bridge */ /* synthetic */ void onPause();

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    /* bridge */ /* synthetic */ void onResume();

    @Override // X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    /* bridge */ /* synthetic */ void onStop();
}
