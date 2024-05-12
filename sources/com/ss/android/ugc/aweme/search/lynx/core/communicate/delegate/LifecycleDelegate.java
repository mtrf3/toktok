package com.ss.android.ugc.aweme.search.lynx.core.communicate.delegate;

import X.ActivityC45651qj;
import X.C49618Jde;
import X.C50340JpI;
import X.C60193Njp;
import X.C65232Piu;
import X.C68182ly;
import X.JSR;
import X.JTS;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VNS;
import Y.ARunnableS44S0100000_8;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class LifecycleDelegate extends JSR implements GenericLifecycleObserver, View.OnAttachStateChangeListener {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        View hybirdContainerView = this.LJLIL.LIZ.getHybirdContainerView();
        if (hybirdContainerView instanceof C60193Njp) {
            ((C60193Njp) hybirdContainerView).release();
        } else if (hybirdContainerView instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ((SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) hybirdContainerView);
        }
        C50340JpI c50340JpI = this.LJLIL.LJIILLIIL;
        if (c50340JpI != null) {
            c50340JpI.LIZ.LJI(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        LJII("viewDisappear", new JSONObject());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLIL.LIZJ != null) {
            LJII("viewAppear", new JSONObject());
        }
    }

    public LifecycleDelegate(JTS jts) {
        super(jts);
        ActivityC45651qj activityC45651qj = jts.LIZIZ;
        if (activityC45651qj != null) {
            C68182ly.LIZ(activityC45651qj, this);
        }
        jts.LIZ.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        if (this.LJLIL.LJ) {
            C49618Jde.LIZ(v, new ARunnableS44S0100000_8(this, 31));
        }
        this.LJLIL.LJ = false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        if (!this.LJLIL.LJ) {
            LJII("pageScroll", C65232Piu.LIZJ("type", "hide"));
            VNS vns = this.LJLIL.LIZLLL;
            if (vns != null) {
                vns.onEnterBackground();
            }
        }
        this.LJLIL.LJ = true;
    }

    public final void LJII(String str, JSONObject jSONObject) {
        C50340JpI c50340JpI = this.LJLIL.LJIILLIIL;
        if (c50340JpI != null) {
            c50340JpI.LIZ(str, jSONObject);
        }
    }
}
