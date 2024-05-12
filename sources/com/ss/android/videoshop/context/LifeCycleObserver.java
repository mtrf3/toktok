package com.ss.android.videoshop.context;

import X.C16880lQ;
import X.C79377VDh;
import X.C79518VIs;
import X.EnumC48190Ivi;
import X.X1D;
import X.YSE;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes16.dex */
public class LifeCycleObserver extends C79518VIs implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final YSE LJLIL;
    public final VideoContext LJLILLLLZI;
    public final Lifecycle LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.C79518VIs, X.YSE
    public final boolean onBackPressedWhenFullScreen(VideoContext videoContext) {
        return this.LJLIL.onBackPressedWhenFullScreen(videoContext);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnCreate owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.notifyEvent(this.LJLJI, new C79377VDh(401));
        this.LJLIL.onLifeCycleOnCreate(lifecycleOwner, this.LJLILLLLZI);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnDestroy owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.notifyEvent(this.LJLJI, new C79377VDh(406));
        this.LJLIL.onLifeCycleOnDestroy(lifecycleOwner, this.LJLILLLLZI);
        this.LJLILLLLZI.cleanUp(this.LJLJI);
        this.LJLILLLLZI.unregisterLifeCycleVideoHandler(this.LJLJI);
        this.LJLJI.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnPause owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.notifyEvent(this.LJLJI, new C79377VDh(404));
        this.LJLIL.onLifeCycleOnPause(lifecycleOwner, this.LJLILLLLZI);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnResume owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.notifyEvent(this.LJLJI, new C79377VDh(403));
        this.LJLIL.onLifeCycleOnResume(lifecycleOwner, this.LJLILLLLZI);
    }

    @Override // X.C79518VIs, X.YSE
    public final void onScreenOff(VideoContext videoContext) {
        this.LJLIL.onScreenOff(videoContext);
    }

    @Override // X.C79518VIs, X.YSE
    public final void onScreenUserPresent(VideoContext videoContext) {
        this.LJLIL.onScreenUserPresent(videoContext);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnStart owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.notifyEvent(this.LJLJI, new C79377VDh(402));
        this.LJLIL.onLifeCycleOnStart(lifecycleOwner, this.LJLILLLLZI);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLifeCycleOnStop owner:");
        LIZ.append(C16880lQ.LJLLJ(lifecycleOwner.getClass()));
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI.notifyEvent(this.LJLJI, new C79377VDh(405));
        this.LJLIL.onLifeCycleOnStop(lifecycleOwner, this.LJLILLLLZI);
    }

    @Override // X.C79518VIs, X.YSE
    public final void onAudioFocusGain(VideoContext videoContext, boolean z) {
        this.LJLIL.onAudioFocusGain(videoContext, z);
    }

    @Override // X.C79518VIs, X.YSE
    public final void onAudioFocusLoss(VideoContext videoContext, boolean z) {
        this.LJLIL.onAudioFocusLoss(videoContext, z);
    }

    public LifeCycleObserver(Lifecycle lifecycle, YSE yse, VideoContext videoContext) {
        this.LJLJI = lifecycle;
        this.LJLIL = yse;
        this.LJLILLLLZI = videoContext;
        lifecycle.addObserver(this);
    }

    @Override // X.C79518VIs, X.YSE
    public final void onFullScreen(boolean z, int i, boolean z2) {
        this.LJLIL.onFullScreen(z, i, z2);
    }

    @Override // X.C79518VIs, X.YSE
    public final boolean onInterceptFullScreen(boolean z, int i, boolean z2) {
        return this.LJLIL.onInterceptFullScreen(z, i, z2);
    }

    @Override // X.C79518VIs, X.YSE
    public final void onNetWorkChanged(EnumC48190Ivi enumC48190Ivi, VideoContext videoContext, Context context, Intent intent) {
        this.LJLIL.onNetWorkChanged(enumC48190Ivi, videoContext, context, intent);
    }
}
