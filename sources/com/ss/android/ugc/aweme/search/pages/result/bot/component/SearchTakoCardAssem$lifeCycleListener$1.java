package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C09G;
import X.C49512Jbw;
import X.C50322Jp0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchTakoCardAssem$lifeCycleListener$1 implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final /* synthetic */ SearchTakoCardAssem LJLIL;

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

    public SearchTakoCardAssem$lifeCycleListener$1(SearchTakoCardAssem searchTakoCardAssem) {
        this.LJLIL = searchTakoCardAssem;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        this.LJLIL.u4();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        String str;
        o.LJIIIZ(owner, "owner");
        C50322Jp0 z4 = this.LJLIL.z4();
        if (z4 != null) {
            str = z4.LJLJI;
        } else {
            str = null;
        }
        C49512Jbw.LIZ(str);
    }
}
