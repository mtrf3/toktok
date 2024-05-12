package com.ss.android.ugc.aweme.canvas.guide;

import X.AbstractC42651GoZ;
import X.C221108m2;
import X.C5H3;
import X.C73543Stf;
import X.EnumC221088m0;
import X.W5G;
import Y.AObserverS70S0100000_2;
import Y.IDTListenerS112S0100000_2;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AqS152S0100000_2;

/* loaded from: classes3.dex */
public final class CanvasGestureGuideWidget {
    public final AbstractC42651GoZ LIZ;
    public final W5G LIZIZ;
    public final View LIZJ;
    public final C5H3 LIZLLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS152S0100000_2(this, 70));
    public C73543Stf LJ;

    /* loaded from: classes3.dex */
    public final class CanvasGestureGuideObserver implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            C73543Stf c73543Stf = CanvasGestureGuideWidget.this.LJ;
            if (c73543Stf != null) {
                c73543Stf.dispose();
            }
            CanvasGestureGuideWidget.this.LIZ.getLifecycle().removeObserver(this);
        }

        public CanvasGestureGuideObserver() {
        }
    }

    public final void LIZ() {
        ((LiveData) this.LIZLLL.getValue()).observe(this.LIZ, new AObserverS70S0100000_2(this, 19));
        View view = this.LIZJ;
        if (view != null) {
            view.setOnTouchListener(new IDTListenerS112S0100000_2(this, 0));
        }
        this.LIZ.getLifecycle().addObserver(new CanvasGestureGuideObserver());
    }

    public CanvasGestureGuideWidget(AbstractC42651GoZ abstractC42651GoZ, W5G w5g, View view) {
        this.LIZ = abstractC42651GoZ;
        this.LIZIZ = w5g;
        this.LIZJ = view;
    }
}
