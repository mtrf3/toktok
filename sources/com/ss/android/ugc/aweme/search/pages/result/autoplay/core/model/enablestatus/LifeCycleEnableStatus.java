package com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.enablestatus;

import X.AbstractC49223JTn;
import X.C221108m2;
import X.C48891JGt;
import X.C49227JTr;
import X.C62822Ol8;
import X.InterfaceC48888JGq;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes9.dex */
public final class LifeCycleEnableStatus extends AbstractC49223JTn implements InterfaceC48888JGq {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C49227JTr.LJLIL);

    @Override // X.InterfaceC49220JTk
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC48888JGq
    public final void onPause() {
        ((LiveData) this.LJLILLLLZI.getValue()).setValue(0);
    }

    @Override // X.InterfaceC48888JGq
    public final void onResume() {
        ((LiveData) this.LJLILLLLZI.getValue()).setValue(1);
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
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C48891JGt.onStart(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C48891JGt.onStop(this);
    }
}
