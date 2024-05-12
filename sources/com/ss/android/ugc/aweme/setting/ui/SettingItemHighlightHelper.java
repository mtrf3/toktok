package com.ss.android.ugc.aweme.setting.ui;

import X.AG2;
import X.C221108m2;
import X.C62822Ol8;
import X.C85798Xlq;
import android.animation.AnimatorSet;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SettingItemHighlightHelper implements LifecycleEventObserver {
    public final Context LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final AG2 LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_PAUSE && ((AnimatorSet) this.LJLJJI.getValue()).isRunning()) {
            ((AnimatorSet) this.LJLJJI.getValue()).cancel();
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            source.getLifecycle().removeObserver(this);
        }
    }

    public SettingItemHighlightHelper(Context context, LifecycleOwner lifeCycleOwner, AG2 highlightUnit) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        o.LJIIIZ(highlightUnit, "highlightUnit");
        this.LJLIL = context;
        this.LJLILLLLZI = lifeCycleOwner;
        this.LJLJI = highlightUnit;
        lifeCycleOwner.getLifecycle().addObserver(this);
        this.LJLJJI = C221108m2.LIZIZ(C85798Xlq.LJLIL);
    }
}
