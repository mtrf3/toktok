package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.4Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC105124Aq extends LifecycleObserver {
    boolean AQ();

    void LLLLLZIL();

    void LLLZLZ(C105454Bx c105454Bx);

    void T0(C32V c32v, C4B8 c4b8);

    int getPanelType();

    void i30(String str);

    void n9();

    boolean onBackPressed();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy();

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause();

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume();

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop();

    void vb();
}
