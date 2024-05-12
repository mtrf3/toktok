package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C34362DeA;
import X.C43720HDw;
import X.C44000HOq;
import X.C44451HcV;
import X.C45595Hux;
import X.C47261Igj;
import X.C62822Ol8;
import X.C76800UCe;
import X.C83483Wpb;
import X.C83490Wpi;
import X.C83493Wpl;
import X.C83495Wpn;
import X.C83509Wq1;
import X.C83515Wq7;
import X.C83519WqB;
import X.CountDownTimerC83512Wq4;
import X.ERS;
import X.ESP;
import X.HJF;
import X.I0P;
import X.IB7;
import X.IBS;
import X.ID0;
import X.IDK;
import X.InterfaceC139745e6;
import X.InterfaceC144185lG;
import X.InterfaceC36571c5;
import X.InterfaceC45540Hu4;
import X.InterfaceC46236ICq;
import X.InterfaceC65784Pro;
import X.InterfaceC73997T2j;
import X.InterfaceC83506Wpy;
import X.InterfaceC83507Wpz;
import X.InterfaceC83511Wq3;
import X.InterfaceC83517Wq9;
import X.InterfaceC83518WqA;
import X.InterfaceC83522WqE;
import X.InterfaceC83524WqG;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.T4E;
import X.T4Q;
import X.TEZ;
import X.TGM;
import X.TGT;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class BackgroundVideoStickerPresenter extends ESP implements GenericLifecycleObserver, TGM, TGT {
    public static final /* synthetic */ int LLIIIILZ = 0;
    public String LJLILLLLZI;
    public C83483Wpb LJLJI;
    public boolean LJLJJI;
    public Effect LJLJJL;
    public boolean LJLJJLL;
    public final List<String> LJLJL;
    public final C62822Ol8 LJLJLJ;
    public int LJLJLLL;
    public final C62822Ol8 LJLL;
    public final MutableLiveData<Boolean> LJLLI;
    public final MutableLiveData LJLLILLLL;
    public final ActivityC45651qj LJLLJ;
    public final TEZ LJLLL;
    public final InterfaceC45540Hu4 LJLLLL;
    public final InterfaceC139745e6<InterfaceC46236ICq> LJLLLLLL;
    public final InterfaceC83518WqA LJLZ;
    public final InterfaceC83517Wq9 LJZ;
    public final InterfaceC83507Wpz LJZI;
    public final InterfaceC83506Wpy LJZL;
    public final InterfaceC83511Wq3 LL;
    public final InterfaceC83524WqG LLD;
    public final InterfaceC83522WqE LLF;
    public final InterfaceC88471Ynr<Context, Integer, C76800UCe> LLFF;
    public final InterfaceC73997T2j LLFFF;
    public final boolean LLFII;
    public final InterfaceC65784Pro<Boolean> LLFZ;
    public final boolean LLI;
    public final boolean LLIFFJFJJ;
    public final LifecycleOwner LLII;
    public final InterfaceC65784Pro<Boolean> LLIIII;

    public BackgroundVideoStickerPresenter() {
        throw null;
    }

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJJL = null;
        this.LJLILLLLZI = "";
        this.LJLLLLLL.get().LJIIIIZZ();
        C83483Wpb c83483Wpb = this.LJLJI;
        if (c83483Wpb != null) {
            c83483Wpb.LJIILIIL();
        }
        LLIIIL();
    }

    @Override // X.TGT
    public final void LLIIIL() {
        this.LJLJJI = false;
        C83483Wpb c83483Wpb = this.LJLJI;
        if (c83483Wpb != null) {
            c83483Wpb.LIZLLL();
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.TGT
    public final void LLIIIZ() {
        C83483Wpb c83483Wpb;
        TEZ tez = this.LJLLL;
        if ((tez == null || o.LJ(tez.LLJJIJIIJIL(), this.LJLJJL)) && (c83483Wpb = this.LJLJI) != null) {
            this.LJLJJI = true;
            C83483Wpb.LJIIL(c83483Wpb, this.LJLJJLL, null, 6);
            if (true ^ ((ArrayList) this.LJLJL).isEmpty()) {
                c83483Wpb.LIZIZ.LJLI(0);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LJLLLL;
        if (interfaceC45540Hu4 == null) {
            InterfaceC36571c5 interfaceC36571c5 = this.LJLLJ;
            if (!(interfaceC36571c5 instanceof InterfaceC45540Hu4)) {
                interfaceC36571c5 = null;
            }
            interfaceC45540Hu4 = (InterfaceC45540Hu4) interfaceC36571c5;
            if (interfaceC45540Hu4 == null) {
                return;
            }
        }
        interfaceC45540Hu4.unRegisterActivityResultListener((InterfaceC144185lG) this.LJLL.getValue());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LJLLLLLL.get().LJ();
    }

    public final void LJIILIIL() {
        String str;
        LLIIIZ();
        C83493Wpl c83493Wpl = (C83493Wpl) this.LJLJLJ.getValue();
        c83493Wpl.LIZIZ();
        c83493Wpl.LIZ = "video";
        c83493Wpl.LIZIZ = System.currentTimeMillis();
        Effect effect = this.LJLJJL;
        if (effect == null || (str = effect.getEffectId()) == null) {
            str = "";
        }
        c83493Wpl.LJIIIIZZ = str;
        Effect effect2 = this.LJLJJL;
        if (effect2 != null) {
            effect2.getResourceId();
        }
        c83493Wpl.LJFF = this.LJZI.LIZLLL();
        InterfaceC83507Wpz interfaceC83507Wpz = this.LJZI;
        interfaceC83507Wpz.LIZIZ(interfaceC83507Wpz.LIZLLL(), new C83490Wpi(this));
    }

    @Override // X.TGT
    public final boolean LLIIIJ() {
        return this.LJLJJI;
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        Effect effect;
        int i;
        o.LJIIIZ(stickerView, "stickerView");
        ViewStubCompat viewStubCompat = (ViewStubCompat) stickerView.findViewById(R.id.km4);
        if (viewStubCompat != null) {
            if (this.LLFII) {
                i = R.layout.dr3;
            } else {
                i = R.layout.dr2;
            }
            viewStubCompat.setLayoutResource(i);
            View LIZ = viewStubCompat.LIZ();
            if (LIZ != null) {
                boolean z = this.LLI;
                this.LJLJI = new C83483Wpb(LIZ, null, null, z, null, null, null, null, (ViewGroup) stickerView.findViewById(R.id.g4a), null, this.LLFZ, z, this.LJLLJ, null, new C83495Wpn(this, stickerView), this.LLFII, new AqS145S0200000_14(this, stickerView, 8), 1526);
            }
        }
        if (this.LLIFFJFJJ && (effect = this.LJLJJL) != null && ID0.LJIIIZ(effect) && this.LJLJJL != null && !this.LJLJJI) {
            LJIILIIL();
        }
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        this.LJLJJLL = true;
        if (state == IDK.AFTER_ANIMATE && this.LJLJJL != null && !this.LJLJJI) {
            LJIILIIL();
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
        this.LJLJJLL = false;
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return ID0.LJIIIZ(session.LIZ);
    }

    public final void LJIILJJIL(boolean z) {
        String str;
        if (this.LJLJLLL == 0) {
            str = "video";
        } else {
            str = "album";
        }
        if (z) {
            Effect effect = this.LJLJJL;
            if (effect != null) {
                this.LJZ.LIZIZ(effect, FaceStickerBean.sCurPropSource, str);
                return;
            }
            return;
        }
        Effect effect2 = this.LJLJJL;
        if (effect2 != null) {
            this.LJZ.LIZ(effect2, FaceStickerBean.sCurPropSource, str);
        }
        this.LJLJLLL = 0;
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        Object obj;
        Object LLJJIII;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        Bundle bundle = session.LJ;
        Object obj2 = null;
        if (bundle != null) {
            obj = C16880lQ.LLJJIII(bundle, "share_from_green_screen_kit");
        } else {
            obj = null;
        }
        if (o.LJ(obj, Boolean.TRUE)) {
            InterfaceC46236ICq interfaceC46236ICq = this.LJLLLLLL.get();
            Bundle bundle2 = session.LJ;
            if (bundle2 != null) {
                obj2 = C16880lQ.LLJJIII(bundle2, "green_screen_kit_video_path");
            }
            if (obj2 != null) {
                String str = (String) obj2;
                Bundle bundle3 = session.LJ;
                if (bundle3 != null && (LLJJIII = C16880lQ.LLJJIII(bundle3, "green_screen_kit_audio_path")) != null) {
                    interfaceC46236ICq.LJIIIZ(str, (String) LLJJIII);
                    interfaceC46236ICq.LIZ();
                    interfaceC46236ICq.LIZJ();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        this.LJLLLLLL.get().LJFF(session.LIZ);
        C83515Wq7.LIZ = new AqS161S0200000_14(this, session, 18);
        CountDownTimerC83512Wq4 countDownTimerC83512Wq4 = C83515Wq7.LIZIZ;
        countDownTimerC83512Wq4.cancel();
        countDownTimerC83512Wq4.start();
    }

    public final void LJIILL(int i, int i2, Intent intent, InterfaceC88472Yns<? super Intent, C83509Wq1> interfaceC88472Yns) {
        if (i == 10002) {
            InterfaceC83524WqG interfaceC83524WqG = this.LLD;
            if (interfaceC83524WqG != null) {
                interfaceC83524WqG.LIZ();
            }
            if (i2 == -1 && intent != null) {
                C83509Wq1 invoke = interfaceC88472Yns.invoke(intent);
                String str = invoke.LJLIL;
                String str2 = invoke.LJLILLLLZI;
                String str3 = invoke.LJLJI;
                if (str3 != null) {
                    this.LJLILLLLZI = str3;
                }
                if (str != null) {
                    if (str2 != null) {
                        this.LJLLLLLL.get().LJIIIZ(str, str2);
                    }
                    this.LJLZ.LIZIZ(str);
                }
            }
            this.LJLLLLLL.get().LIZ();
            if (this.LLIIII.invoke().booleanValue()) {
                this.LJLLLLLL.get().LIZIZ();
            }
            if (((ArrayList) this.LJLJL).contains(this.LJLILLLLZI)) {
                C83483Wpb c83483Wpb = this.LJLJI;
                if (c83483Wpb != null) {
                    c83483Wpb.LJII(this.LJLILLLLZI);
                }
            } else {
                C83483Wpb c83483Wpb2 = this.LJLJI;
                if (c83483Wpb2 != null) {
                    c83483Wpb2.LJIILIIL();
                }
            }
            LJIILJJIL(false);
        }
    }

    public BackgroundVideoStickerPresenter(C29S c29s, String str, InterfaceC45540Hu4 interfaceC45540Hu4, C44451HcV c44451HcV, IBS ibs, IB7 ib7, C47261Igj c47261Igj, HJF hjf, C43720HDw c43720HDw, I0P i0p, C45595Hux c45595Hux, C44000HOq c44000HOq, T4E t4e, boolean z, boolean z2, LifecycleOwner lifecycleOwner, AqS157S0100000_7 aqS157S0100000_7) {
        C34362DeA needSetParentBackGround = C34362DeA.LJLIL;
        o.LJIIIZ(needSetParentBackGround, "needSetParentBackGround");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLLJ = c29s;
        this.LJLLL = null;
        this.LJLLLL = interfaceC45540Hu4;
        this.LJLLLLLL = c44451HcV;
        this.LJLZ = ibs;
        this.LJZ = ib7;
        this.LJZI = c47261Igj;
        this.LJZL = hjf;
        this.LL = c43720HDw;
        this.LLD = i0p;
        this.LLF = c45595Hux;
        this.LLFF = c44000HOq;
        this.LLFFF = t4e;
        this.LLFII = z;
        this.LLFZ = needSetParentBackGround;
        this.LLI = false;
        this.LLIFFJFJJ = z2;
        this.LLII = lifecycleOwner;
        this.LLIIII = aqS157S0100000_7;
        this.LJLILLLLZI = "";
        this.LJLJL = new ArrayList();
        this.LJLJLJ = C221108m2.LIZIZ(C83519WqB.LJLIL);
        this.LJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 354));
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJLLI = mutableLiveData;
        this.LJLLILLLL = mutableLiveData;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
