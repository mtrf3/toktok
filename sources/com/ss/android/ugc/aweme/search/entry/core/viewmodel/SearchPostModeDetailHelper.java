package com.ss.android.ugc.aweme.search.entry.core.viewmodel;

import X.C34257DcT;
import X.C34476Dg0;
import X.C48891JGt;
import X.C62822Ol8;
import X.InterfaceC48888JGq;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes9.dex */
public final class SearchPostModeDetailHelper implements InterfaceC48888JGq {
    public static final SearchPostModeDetailHelper LJLIL = new SearchPostModeDetailHelper();

    public static boolean LIZ() {
        C62822Ol8 c62822Ol8 = C34257DcT.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() != 1 && (((Number) c62822Ol8.getValue()).intValue() != 2 || ((Number) C34476Dg0.LIZ.getValue()).intValue() != 1)) {
            return false;
        }
        return true;
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
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C48891JGt.onResume(this);
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
