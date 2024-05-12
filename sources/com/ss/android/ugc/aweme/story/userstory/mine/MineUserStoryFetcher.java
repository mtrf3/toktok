package com.ss.android.ugc.aweme.story.userstory.mine;

import X.C73318Sq2;
import X.LYD;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MineUserStoryFetcher implements GenericLifecycleObserver {
    public final C73318Sq2 LJLIL;

    public MineUserStoryFetcher() {
        this(0);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public static Aweme LIZ() {
        LYD.LIZ.getClass();
        if (LYD.LIZIZ == null) {
            LYD.LIZIZ = LYD.LIZ();
        }
        Aweme aweme = LYD.LIZIZ;
        o.LJI(aweme);
        Aweme m114clone = aweme.m114clone();
        o.LJIIIIZZ(m114clone, "mineUserStory!!.clone()");
        Aweme m114clone2 = m114clone.m114clone();
        o.LJIIIIZZ(m114clone2, "MineStoryCache.getMineUserStory().clone()");
        return m114clone2;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LJLIL.dispose();
    }

    public MineUserStoryFetcher(int i) {
        this.LJLIL = new C73318Sq2();
    }
}
