package com.ss.android.ugc.gamora.recorder.sticker.optionlist;

import X.C09G;
import X.C53558L0g;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C78886Uxe;
import X.C82622Wbi;
import X.C82631Wbr;
import X.C82632Wbs;
import X.ERS;
import X.ESP;
import X.H78;
import X.I0N;
import X.I9W;
import X.IDK;
import X.InterfaceC135635Tz;
import X.InterfaceC74236TBo;
import X.T4Q;
import X.TBT;
import X.TGM;
import X.TK3;
import X.UCI;
import X.V0N;
import Y.AObjectS118S0200000_12;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class OptionListHandler extends ESP implements GenericLifecycleObserver, InterfaceC135635Tz, TGM {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final C82622Wbi LJLILLLLZI;
    public final C82631Wbr LJLJI;
    public final C82631Wbr LJLJJI;
    public final C73318Sq2 LJLJJL;
    public Effect LJLJJLL;

    static {
        TBT tbt = new TBT(OptionListHandler.class, "stickerApi", "getStickerApi()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(OptionListHandler.class, "optionListApiComponent", "getOptionListApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/optionlist/OptionListApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(OptionListHandler.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
    }

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final TK3 LJIILIIL() {
        return (TK3) this.LJLJJI.LIZ(this, LJLJL[1]);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        I9W i9w = (I9W) this.LJLJI.LIZ(this, LJLJL[0]);
        if (i9w != null) {
            i9w.g1(this);
        }
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        TK3 LJIILIIL = LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.LJJLIIIJL(false);
        }
        this.LJLJJLL = null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionListHandler$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public final class AnonymousClass1 implements GenericLifecycleObserver, DefaultLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C09G.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C09G.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C09G.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C09G.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C09G.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onDestroy(LifecycleOwner owner) {
            o.LJIIIZ(owner, "owner");
            C09G.LIZIZ(this, owner);
            OptionListHandler.this.LJLJJL.dispose();
        }
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        TK3 LJIILIIL;
        TK3 LJIILIIL2;
        o.LJIIIZ(state, "state");
        H78.LIZIZ("OptionListHandler", "onStickerViewShow");
        Effect effect = this.LJLJJLL;
        if (effect != null && (LJIILIIL = LJIILIIL()) != null && !LJIILIIL.isShowing() && (LJIILIIL2 = LJIILIIL()) != null) {
            LJIILIIL2.i1(effect);
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        TK3 LJIILIIL;
        TK3 LJIILIIL2;
        o.LJIIIZ(state, "state");
        H78.LIZIZ("OptionListHandler", "onStickerViewHide");
        if (this.LJLJJLL != null && (LJIILIIL = LJIILIIL()) != null && LJIILIIL.isShowing() && (LJIILIIL2 = LJIILIIL()) != null) {
            LJIILIIL2.LJJLIIIJL(false);
        }
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        if ((C78886Uxe.LJJIJL(session.LIZ) || ((C78886Uxe.LJJJ(session.LIZ) && e1.LIZ(31744, "enable_add_effect_button", true, false)) || (C78886Uxe.LJJIJIIJI(session.LIZ) && V0N.LJJIIJ(session.LIZ)))) && !V0N.LJJI(session.LIZ)) {
            return true;
        }
        return false;
    }

    public OptionListHandler(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLILLLLZI = diContainer;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLJI = UCI.LJII(diContainer, I9W.class, null);
        this.LJLJJI = UCI.LJII(diContainer, TK3.class, null);
        C82632Wbs LJI = UCI.LJI(diContainer, I0N.class, null);
        boolean LIZ = C53558L0g.LIZ();
        this.LJLJJL = new C73318Sq2();
        lifecycleOwner.getLifecycle().addObserver(new AnonymousClass1());
        if (LIZ) {
            I0N i0n = (I0N) LJI.LIZ(this, LJLJL[2]);
            i0n.xU().LIZLLL(lifecycleOwner, new AObjectS118S0200000_12(i0n, this, 0));
        }
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        TK3 LJIILIIL = LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.i1(session.LIZ);
        }
        this.LJLJJLL = session.LIZ;
    }
}
