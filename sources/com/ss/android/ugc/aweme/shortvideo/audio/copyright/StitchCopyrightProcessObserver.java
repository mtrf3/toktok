package com.ss.android.ugc.aweme.shortvideo.audio.copyright;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.WM7;
import Y.AObjectS136S0100000_7;
import Y.AObjectS50S0101000_5;
import Y.AObserverS75S0100000_7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.shortvideo.model.StitchSettingItemStatus;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StitchCopyrightProcessObserver implements GenericLifecycleObserver {
    public final WM7 LJLIL;
    public final StitchSettingItemStatus LJLILLLLZI;
    public final InterfaceC65784Pro<Boolean> LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final AqS157S0100000_7 LJLJJLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$tools_publish_release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$tools_publish_release() {
        this.LJLJJL.observe(this.LJLIL, new AObserverS75S0100000_7(this, 19));
    }

    public StitchCopyrightProcessObserver(WM7 rootScene, StitchSettingItemStatus stitchSettingItemStatus, AObjectS50S0101000_5 aObjectS50S0101000_5, AObjectS136S0100000_7 aObjectS136S0100000_7) {
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(stitchSettingItemStatus, "stitchSettingItemStatus");
        this.LJLIL = rootScene;
        this.LJLILLLLZI = stitchSettingItemStatus;
        this.LJLJI = aObjectS50S0101000_5;
        this.LJLJJI = aObjectS136S0100000_7;
        this.LJLJJL = new MutableLiveData<>(Boolean.FALSE);
        this.LJLJJLL = new AqS157S0100000_7(this, 432);
        rootScene.getLifecycle().addObserver(this);
    }
}
