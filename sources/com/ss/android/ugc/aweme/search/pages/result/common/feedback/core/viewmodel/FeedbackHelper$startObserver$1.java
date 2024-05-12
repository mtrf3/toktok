package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel;

import X.ActivityC45651qj;
import X.C17J;
import X.C48891JGt;
import X.C50656JuO;
import X.InterfaceC48888JGq;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes9.dex */
public final class FeedbackHelper$startObserver$1 implements InterfaceC48888JGq {
    public final /* synthetic */ ActivityC45651qj LJLIL;

    @Override // X.InterfaceC48888JGq
    public final void onResume() {
        if (C50656JuO.LIZIZ) {
            C50656JuO.LIZIZ = false;
            C17J.LJJIZ(this.LJLIL);
        }
        if (C50656JuO.LIZJ) {
            C50656JuO.LIZJ = false;
            C50656JuO.LIZ = 2;
            C17J.LJJIZ(this.LJLIL);
        }
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C48891JGt.onCreate(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C48891JGt.onDestroy(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C48891JGt.onPause(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C48891JGt.onStart(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C48891JGt.onStop(this);
    }

    public FeedbackHelper$startObserver$1(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }
}
