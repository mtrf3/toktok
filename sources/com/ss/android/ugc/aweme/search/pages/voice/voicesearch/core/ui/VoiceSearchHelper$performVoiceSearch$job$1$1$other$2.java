package com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui;

import X.ActivityC45651qj;
import X.C09G;
import X.C26231ARf;
import X.C93906aYQ;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class VoiceSearchHelper$performVoiceSearch$job$1$1$other$2 implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final /* synthetic */ C93906aYQ LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
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
    public final void onPause(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C26231ARf c26231ARf = this.LJLIL.LIZ;
        if (c26231ARf != null) {
            c26231ARf.LIZIZ(null);
        }
        this.LJLILLLLZI.getLifecycle().removeObserver(this);
    }

    public VoiceSearchHelper$performVoiceSearch$job$1$1$other$2(C93906aYQ c93906aYQ, ActivityC45651qj activityC45651qj) {
        this.LJLIL = c93906aYQ;
        this.LJLILLLLZI = activityC45651qj;
    }
}
