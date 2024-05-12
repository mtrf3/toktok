package com.ss.android.ugc.aweme.sticker.presenter.handler;

import X.C0IB;
import X.C221108m2;
import X.C29S;
import X.C62822Ol8;
import X.C83909WwT;
import X.ERS;
import X.ESP;
import X.ID0;
import X.ID9;
import X.InterfaceC84016WyC;
import X.InterfaceC84017WyD;
import X.T4Q;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ARStickerHandler extends ESP implements GenericLifecycleObserver {
    public final C62822Ol8 LJLILLLLZI;
    public final Context LJLJI;
    public final LifecycleOwner LJLJJI;
    public final C0IB<Boolean> LJLJJL;
    public final InterfaceC84017WyD LJLJJLL;
    public final InterfaceC84016WyC LJLJL;
    public final int LJLJLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJJLL.D0(false);
    }

    @Override // X.ESP
    public final void LJIIIZ(T4Q session) {
        o.LJIIIZ(session, "session");
        this.LJLJJLL.D0(true);
        this.LJLJJLL.D9();
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return ID0.LIZLLL(session.LIZ);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        this.LJLJL.LIZJ((BaseSenorPresenter) this.LJLILLLLZI.getValue(), false);
    }

    public ARStickerHandler(C29S context, C29S lifecycleOwner, C0IB nativeInitLiveData, C83909WwT c83909WwT, ID9 sensorHolder, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(nativeInitLiveData, "nativeInitLiveData");
        o.LJIIIZ(sensorHolder, "sensorHolder");
        this.LJLJI = context;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = nativeInitLiveData;
        this.LJLJJLL = c83909WwT;
        this.LJLJL = sensorHolder;
        this.LJLJLJ = i;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 347));
    }
}
