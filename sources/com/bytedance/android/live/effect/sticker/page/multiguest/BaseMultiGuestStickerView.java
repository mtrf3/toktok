package com.bytedance.android.live.effect.sticker.page.multiguest;

import X.C0PO;
import X.C0TY;
import X.C0WF;
import X.C221108m2;
import X.C30261Gs;
import X.C32537Cpp;
import X.C41191jX;
import X.C47641tw;
import X.C51029K0z;
import X.C54562Ce;
import X.C62822Ol8;
import X.InterfaceC08020Te;
import X.ORZ;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.effect.model.EffectDataRestoreSucc;
import com.bytedance.android.live.liveinteract.api.MultiGuestPreviewCameraOpenEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.BaseDataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class BaseMultiGuestStickerView implements GenericLifecycleObserver {
    public static boolean LJLLILLLL;
    public final Fragment LJLIL;
    public final IFilterManager LJLILLLLZI;
    public final C0WF LJLJI;
    public final ViewGroup LJLJJI;
    public final boolean LJLJJL;
    public final DataChannel LJLJJLL;
    public LiveEffect LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C41191jX LJLL;
    public final C30261Gs LJLLI;

    public abstract View LIZJ();

    public abstract String LIZLLL();

    public abstract void LJII();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final View LJ() {
        return (View) this.LJLJLLL.getValue();
    }

    public final void LJFF() {
        this.LJLIL.getLifecycle().addObserver(this);
        C41191jX c41191jX = this.LJLL;
        String STICKER_INTERACT = C0TY.LIZJ;
        o.LJIIIIZZ(STICKER_INTERACT, "STICKER_INTERACT");
        c41191jX.LIZJ(STICKER_INTERACT);
        this.LJLL.LJ(this.LJLJJI);
        DataChannel dataChannel = this.LJLJJLL;
        if (dataChannel != null) {
            dataChannel.lv0(this.LJLIL, MultiGuestPreviewCameraOpenEvent.class, new IDqS416S0100000(this, 81));
            dataChannel.lv0(this.LJLIL, EffectDataRestoreSucc.class, new IDqS416S0100000(this, 82));
        }
    }

    public void LJI() {
        this.LJLL.getClass();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C30261Gs c30261Gs = this.LJLLI;
        if (c30261Gs != null) {
            c30261Gs.onDestroy();
        }
        this.LJLIL.getLifecycle().removeObserver(this);
        this.LJLJJI.removeAllViews();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.1Gs, O] */
    public BaseMultiGuestStickerView(Fragment fragment, IFilterManager iFilterManager, C0WF c0wf, ViewGroup propsAlbumContainer, InterfaceC08020Te interfaceC08020Te, boolean z) {
        LiveEffect liveEffect;
        List<LiveEffect> LIZ;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(propsAlbumContainer, "propsAlbumContainer");
        this.LJLIL = fragment;
        this.LJLILLLLZI = iFilterManager;
        this.LJLJI = c0wf;
        this.LJLJJI = propsAlbumContainer;
        this.LJLJJL = z;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(fragment);
        this.LJLJJLL = LJIILIIL;
        C30261Gs c30261Gs = null;
        if (c0wf != null && (LIZ = c0wf.LIZ(C0TY.LIZJ)) != null) {
            liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ);
        } else {
            liveEffect = null;
        }
        this.LJLJL = liveEffect;
        this.LJLJLJ = C221108m2.LIZIZ(C47641tw.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(new IDqS420S0100000(this, 59));
        this.LJLL = new C41191jX(this);
        if (LJIILIIL != null) {
            WeakReference weakReference = new WeakReference(LJIILIIL);
            ?? c30261Gs2 = new C30261Gs(weakReference, new WeakReference(fragment), interfaceC08020Te);
            BaseDataChannel baseDataChannel = (BaseDataChannel) weakReference.get();
            if (baseDataChannel != null) {
                ((C32537Cpp) baseDataChannel.gv0(C54562Ce.class)).LIZ = c30261Gs2;
            }
            c30261Gs2.LJFF = new IDqS443S0100000(this, 9);
            C0PO c0po = c30261Gs2.LJII;
            c30261Gs = c30261Gs2;
            if (c0po != null) {
                c0po.setComposerManager(c0wf);
                c30261Gs = c30261Gs2;
            }
        }
        this.LJLLI = c30261Gs;
    }
}
