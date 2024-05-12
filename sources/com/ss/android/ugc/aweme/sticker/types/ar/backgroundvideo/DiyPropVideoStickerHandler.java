package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C29S;
import X.C43720HDw;
import X.C43857HJd;
import X.C43935HMd;
import X.C45595Hux;
import X.C47261Igj;
import X.C62822Ol8;
import X.C76800UCe;
import X.C83483Wpb;
import X.C83491Wpj;
import X.C83496Wpo;
import X.C83505Wpx;
import X.C83509Wq1;
import X.C83510Wq2;
import X.C83515Wq7;
import X.C83567Wqx;
import X.C83568Wqy;
import X.CountDownTimerC83512Wq4;
import X.ERS;
import X.ESP;
import X.HJF;
import X.IDK;
import X.InterfaceC45540Hu4;
import X.InterfaceC73997T2j;
import X.InterfaceC83506Wpy;
import X.InterfaceC83507Wpz;
import X.InterfaceC83508Wq0;
import X.InterfaceC83511Wq3;
import X.InterfaceC83522WqE;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.T4E;
import X.T4Q;
import X.TEZ;
import X.TGM;
import X.TGT;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class DiyPropVideoStickerHandler extends ESP implements GenericLifecycleObserver, TGM, TGT {
    public C83483Wpb LJLILLLLZI;
    public final long LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public Effect LJLJL;
    public final List<String> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final ActivityC45651qj LJLL;
    public final TEZ LJLLI;
    public final InterfaceC45540Hu4 LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;
    public final InterfaceC88472Yns<Effect, Boolean> LJLLLL;
    public final InterfaceC83522WqE LJLLLLLL;
    public final InterfaceC83508Wq0 LJLZ;
    public final InterfaceC83511Wq3 LJZ;
    public final InterfaceC73997T2j LJZI;
    public final InterfaceC83506Wpy LJZL;
    public final InterfaceC83507Wpz LL;
    public final InterfaceC88471Ynr<Context, Integer, C76800UCe> LLD;
    public final InterfaceC88472Yns<Effect, DiyPropUploadVideoAutoCutConfigure> LLF;

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.TGT
    public final void LLIIIL() {
        this.LJLJJL = false;
        C83483Wpb c83483Wpb = this.LJLILLLLZI;
        if (c83483Wpb != null) {
            c83483Wpb.LIZLLL();
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJJI = "";
        Effect effect = this.LJLJL;
        if (effect != null) {
            this.LJLZ.LIZIZ(effect);
        }
        this.LJLJL = null;
        C83483Wpb c83483Wpb = this.LJLILLLLZI;
        if (c83483Wpb != null) {
            c83483Wpb.LJIILIIL();
        }
        LLIIIL();
    }

    @Override // X.TGT
    public final void LLIIIZ() {
        C83483Wpb c83483Wpb;
        TEZ tez = this.LJLLI;
        if ((tez == null || o.LJ(tez.LLJJIJIIJIL(), this.LJLJL)) && (c83483Wpb = this.LJLILLLLZI) != null) {
            this.LJLJJL = true;
            C83483Wpb.LJIIL(c83483Wpb, this.LJLJJLL, null, 6);
            if (true ^ ((ArrayList) this.LJLJLJ).isEmpty()) {
                c83483Wpb.LIZIZ.LJLI(0);
            }
        }
    }

    @Override // X.TGT
    public final boolean LLIIIJ() {
        return this.LJLJJL;
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        int i;
        o.LJIIIZ(stickerView, "stickerView");
        ViewStubCompat viewStubCompat = (ViewStubCompat) stickerView.findViewById(R.id.km_);
        if (viewStubCompat != null) {
            if (this.LJLLL) {
                i = R.layout.dr3;
            } else {
                i = R.layout.dr2;
            }
            viewStubCompat.setLayoutResource(i);
            View LIZ = viewStubCompat.LIZ();
            if (LIZ != null) {
                boolean z = this.LJLLJ;
                this.LJLILLLLZI = new C83483Wpb(LIZ, null, null, z, null, null, null, null, (ViewGroup) stickerView.findViewById(R.id.g4a), null, C83510Wq2.LJLIL, z, this.LJLL, null, new C83496Wpo(this, stickerView), this.LJLLL, C83505Wpx.LJLIL, 1526);
            }
        }
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        this.LJLJJLL = true;
        if (state == IDK.AFTER_ANIMATE && this.LJLJL != null && !this.LJLJJL) {
            LLIIIZ();
            InterfaceC83507Wpz interfaceC83507Wpz = this.LL;
            interfaceC83507Wpz.LIZIZ(interfaceC83507Wpz.LIZLLL(), new C83491Wpj(this));
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
        Effect effect = session.LIZ;
        if (!o.LJ(effect, this.LJLJL)) {
            this.LJLJJI = "";
            Effect effect2 = this.LJLJL;
            if (effect2 != null) {
                this.LJLZ.LIZIZ(effect2);
            }
        }
        return this.LJLLLL.invoke(effect).booleanValue();
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        this.LJLJL = session.LIZ;
        C83515Wq7.LIZ = new AqS161S0200000_14(this, session, 19);
        CountDownTimerC83512Wq4 countDownTimerC83512Wq4 = C83515Wq7.LIZIZ;
        countDownTimerC83512Wq4.cancel();
        countDownTimerC83512Wq4.start();
        this.LJLZ.LIZLLL(this.LJLJL);
    }

    public final boolean LJIILIIL(int i, int i2, Intent intent, InterfaceC88472Yns<? super Intent, C83509Wq1> interfaceC88472Yns) {
        if (i == 10002) {
            if (i2 == -1) {
                if (intent != null) {
                    C83509Wq1 invoke = interfaceC88472Yns.invoke(intent);
                    String str = invoke.LJLIL;
                    String str2 = invoke.LJLJI;
                    if (str2 != null) {
                        this.LJLJJI = str2;
                    }
                    if (str != null) {
                        this.LJLZ.LIZ(str);
                    }
                }
                if (((ArrayList) this.LJLJLJ).contains(this.LJLJJI)) {
                    C83483Wpb c83483Wpb = this.LJLILLLLZI;
                    if (c83483Wpb != null) {
                        c83483Wpb.LJII(this.LJLJJI);
                        return true;
                    }
                    return true;
                }
                C83483Wpb c83483Wpb2 = this.LJLILLLLZI;
                if (c83483Wpb2 == null) {
                    return true;
                }
                c83483Wpb2.LJIILIIL();
                return true;
            }
            return true;
        }
        return false;
    }

    public DiyPropVideoStickerHandler(C29S activity, TEZ tez, String str, InterfaceC45540Hu4 interfaceC45540Hu4, C83567Wqx isTemplateVideoUploadEffect, C45595Hux c45595Hux, C43857HJd c43857HJd, C43720HDw c43720HDw, T4E t4e, HJF hjf, C47261Igj c47261Igj, C43935HMd showErrorToast, C83568Wqy parseUploadVideoConfigure) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(isTemplateVideoUploadEffect, "isTemplateVideoUploadEffect");
        o.LJIIIZ(showErrorToast, "showErrorToast");
        o.LJIIIZ(parseUploadVideoConfigure, "parseUploadVideoConfigure");
        this.LJLL = activity;
        this.LJLLI = tez;
        this.LJLLILLLL = interfaceC45540Hu4;
        this.LJLLJ = true;
        this.LJLLL = true;
        this.LJLLLL = isTemplateVideoUploadEffect;
        this.LJLLLLLL = c45595Hux;
        this.LJLZ = c43857HJd;
        this.LJZ = c43720HDw;
        this.LJZI = t4e;
        this.LJZL = hjf;
        this.LL = c47261Igj;
        this.LLD = showErrorToast;
        this.LLF = parseUploadVideoConfigure;
        this.LJLJI = 1000L;
        this.LJLJJI = "";
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 355));
    }
}
