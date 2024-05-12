package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import X.NUT;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;

/* loaded from: classes11.dex */
public final class AdPopUpLynxContainer implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLJI = 0;
    public final LifecycleOwner LJLIL;
    public final NUT LJLILLLLZI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

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

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        AdLynxStatBusiness adLynxStatBusiness;
        NUT nut = this.LJLILLLLZI;
        if (nut != null && (adLynxStatBusiness = (AdLynxStatBusiness) nut.LIZ(AdLynxStatBusiness.class)) != null) {
            adLynxStatBusiness.LIZLLL();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        AdLynxStatBusiness adLynxStatBusiness;
        System.currentTimeMillis();
        NUT nut = this.LJLILLLLZI;
        if (nut != null && (adLynxStatBusiness = (AdLynxStatBusiness) nut.LIZ(AdLynxStatBusiness.class)) != null) {
            adLynxStatBusiness.LJ();
        }
    }

    public AdPopUpLynxContainer(LifecycleOwner lifecycleOwner, NUT nut) {
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = nut;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
