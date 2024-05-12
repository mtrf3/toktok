package com.ss.android.ugc.aweme.search.pages.result.bot;

import X.C09G;
import X.C49512Jbw;
import X.JQA;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchBotHolder$lifeCycleListener$1 implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final /* synthetic */ SearchBotHolder LJLIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public SearchBotHolder$lifeCycleListener$1(SearchBotHolder searchBotHolder) {
        this.LJLIL = searchBotHolder;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        this.LJLIL.Q();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        String str;
        o.LJIIIZ(owner, "owner");
        JQA jqa = this.LJLIL.LL;
        if (jqa != null) {
            str = jqa.LJII;
        } else {
            str = null;
        }
        C49512Jbw.LIZ(str);
    }
}
