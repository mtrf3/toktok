package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui;

import X.C09G;
import X.C46442IKo;
import X.C46444IKq;
import X.C48887JGp;
import X.JGI;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchVideoHolder$bindLifeCycleCallback$1 implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final /* synthetic */ SearchVideoHolder LJLIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public SearchVideoHolder$bindLifeCycleCallback$1(SearchVideoHolder searchVideoHolder) {
        this.LJLIL = searchVideoHolder;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        C48887JGp w0;
        JGI core;
        o.LJIIIZ(owner, "owner");
        C46444IKq.LJLJLJ.getClass();
        if (C46444IKq.LJJIZ().enableSearchSecondVideoPrepare && C46442IKo.LIZ() && (w0 = this.LJLIL.w0()) != null && (core = w0.getCore()) != null) {
            core.LJIIL();
        }
        this.LJLIL.getLifecycle().removeObserver(this);
    }
}
