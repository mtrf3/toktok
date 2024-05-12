package com.bytedance.android.live.liveinteract.multihost.biz.link.view;

import X.B5G;
import X.C0NB;
import X.C15610jN;
import X.C31731Ccp;
import X.C32208CkW;
import X.C75588TlY;
import X.C75593Tld;
import X.C75728Tno;
import X.C75737Tnx;
import X.C76265TwT;
import X.C8E;
import X.InterfaceC75179Tex;
import X.ViewOnClickListenerC76430Tz8;
import X.X1D;
import Y.ARunnableS49S0100000_13;
import android.animation.AnimatorSet;
import android.graphics.Rect;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.api.AdjustVideoInteractStreamBottomEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiMatchFixLayerSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiCoHostWindowManager {
    public boolean LIZIZ;
    public DataChannel LIZJ;
    public FrameLayout LIZLLL;
    public FrameLayout LJFF;
    public LifecycleOwner LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public final String LIZ = "MultiCoHostWindowManager";
    public final LinkCrossRoomDataHolder LJ = B5G.LIZIZ();
    public List<AnimatorSet> LJI = new ArrayList();
    public final AqS195S0100000_13 LJIIJ = new AqS195S0100000_13(this, 11);
    public final AqS195S0100000_13 LJIIJJI = new AqS195S0100000_13(this, 10);
    public final AqS195S0100000_13 LJIIL = new AqS195S0100000_13(this, 8);
    public final AqS195S0100000_13 LJIILIIL = new AqS195S0100000_13(this, 9);
    public final MultiCoHostWindowManager$lifecycleObserver$1 LJIILJJIL = new GenericLifecycleObserver() { // from class: com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            MultiCoHostWindowManager multiCoHostWindowManager = MultiCoHostWindowManager.this;
            if (multiCoHostWindowManager.LJIIIIZZ) {
                C15610jN.LIZIZ(new ARunnableS49S0100000_13(multiCoHostWindowManager, 47));
            }
        }
    };

    public final void LIZ() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.LJII;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.LJIILJJIL);
        }
        C8E.LIZLLL().LJZI(C75728Tno.class, this.LJIIJ);
        C8E.LIZLLL().LJZI(C75593Tld.class, this.LJIILIIL);
        C8E.LIZLLL().LJZI(C75588TlY.class, this.LJIIL);
        C8E.LIZLLL().LJZI(C75737Tnx.class, this.LJIIJJI);
        if (MultiMatchFixLayerSetting.INSTANCE.enable2()) {
            FrameLayout frameLayout = this.LJFF;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            C0NB.LJIIIZ(this.LIZ, "clearAnim");
            Iterator it = ((ArrayList) this.LJI).iterator();
            while (it.hasNext()) {
                ((AnimatorSet) it.next()).cancel();
            }
            ((ArrayList) this.LJI).clear();
            this.LJI = new ArrayList();
        }
        this.LJII = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJFF = null;
    }

    public final ViewOnClickListenerC76430Tz8 LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        FrameLayout frameLayout = this.LIZLLL;
        if (frameLayout != null) {
            return (ViewOnClickListenerC76430Tz8) frameLayout.findViewWithTag(linkMicId);
        }
        return null;
    }

    public final void LIZJ(InterfaceC75179Tex interfaceC75179Tex) {
        int i;
        DataChannel dataChannel;
        Rect LJJLIIIJ = interfaceC75179Tex.LJJLIIIJ();
        FrameLayout frameLayout = this.LIZLLL;
        if (frameLayout != null) {
            i = frameLayout.getHeight();
        } else {
            i = 0;
        }
        this.LJ.LJIL = interfaceC75179Tex.LLI() + LJJLIIIJ.top;
        this.LJ.LJIJJ = LJJLIIIJ.width();
        this.LJ.LJIJJLI = LJJLIIIJ.height();
        this.LJ.LJJ = i;
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendAdjustLinkMicEvent, coHostMarginTop = ");
        LIZ.append(LJJLIIIJ.top);
        LIZ.append(", width = ");
        LIZ.append(LJJLIIIJ.width());
        LIZ.append(", currentAnchorVideoHeight = ");
        b1.LJ(LIZ, i, LIZ, str);
        if (LJJLIIIJ.top > 0) {
            RandomLinkMicManager.LJLIL.getClass();
            RandomLinkMicManager.LJZ = i;
            RandomLinkMicManager.LJLZ = LJJLIIIJ.top;
            RandomLinkMicManager.LJZI = LJJLIIIJ.width();
        }
        this.LJIIIIZZ = true;
        C32208CkW c32208CkW = new C32208CkW(0);
        int i2 = LJJLIIIJ.top + i;
        c32208CkW.LIZIZ = i2;
        c32208CkW.LIZJ = C76265TwT.LJ();
        c32208CkW.LIZLLL = 0;
        DataChannel dataChannel2 = this.LIZJ;
        if (dataChannel2 != null) {
            dataChannel2.rv0(LinkCrossRoomStateChangeEvent.class, c32208CkW);
        }
        if (!this.LIZIZ && (dataChannel = this.LIZJ) != null) {
            dataChannel.rv0(AdjustVideoInteractStreamBottomEvent.class, new C31731Ccp(this.LJ.LJIL, i2));
        }
    }
}
