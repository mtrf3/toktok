package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C09G;
import X.C2K0;
import X.C55096Ljo;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchServiceCenterImplKt$autoBindAbility$1 implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ C2K0 LJLILLLLZI;
    public final /* synthetic */ Class<? extends C2K0> LJLJI;

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

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C55096Ljo.LJIILIIL(this.LJLIL, SearchFragmentScope.class, this.LJLILLLLZI, this.LJLJI);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C55096Ljo.LJIILLIIL(this.LJLIL, SearchFragmentScope.class, this.LJLJI);
    }

    public SearchServiceCenterImplKt$autoBindAbility$1(LifecycleOwner lifecycleOwner, C2K0 c2k0, Class<? extends C2K0> cls) {
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = c2k0;
        this.LJLJI = cls;
    }
}
