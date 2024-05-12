package com.ss.android.ugc.aweme.sticker.panel.info;

import X.C16880lQ;
import X.C2311895m;
import X.C26338AVi;
import X.C278817o;
import X.C32151Nz;
import X.C3C5;
import X.C44423Hc3;
import X.C45931I0x;
import X.C48841JEv;
import X.C60903NvH;
import X.C61845OOz;
import X.C64962gm;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C74275TDb;
import X.C78555UsJ;
import X.C78613UtF;
import X.C82622Wbi;
import X.C82631Wbr;
import X.C82632Wbs;
import X.EJT;
import X.ERN;
import X.ERS;
import X.F4V;
import X.I0N;
import X.ID0;
import X.IDH;
import X.IDK;
import X.InterfaceC135635Tz;
import X.InterfaceC67352kd;
import X.InterfaceC74236TBo;
import X.InterfaceC74330TFe;
import X.O6R;
import X.T4L;
import X.T4Q;
import X.T4S;
import X.TBT;
import X.TGM;
import X.UCI;
import X.XKQ;
import X.XKS;
import X.XKX;
import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.views.IDlS19S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EffectInfoStickerHandler implements GenericLifecycleObserver, F4V, TGM, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public ConstraintLayout LJLILLLLZI;
    public LinearLayout LJLJI;
    public T4Q LJLJJI;
    public boolean LJLJJL;
    public XKQ LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82631Wbr LJLJLJ;
    public final C64962gm LJLJLLL;

    static {
        TBT tbt = new TBT(EffectInfoStickerHandler.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(EffectInfoStickerHandler.class, "effectInfoApiComponent", "getEffectInfoApiComponent()Lcom/ss/android/ugc/aweme/sticker/panel/info/EffectInfoApiComponent;", 0, c65351Pkp)};
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

    public final InterfaceC74330TFe LJ() {
        return (InterfaceC74330TFe) this.LJLJLJ.LIZ(this, LJLL[1]);
    }

    public final I0N LJFF() {
        return (I0N) this.LJLJL.LIZ(this, LJLL[0]);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C48841JEv.LIZJ(this.LJLJLLL, null);
    }

    public final void LJIIIIZZ() {
        if (C2311895m.LIZJ()) {
            ConstraintLayout constraintLayout = this.LJLILLLLZI;
            if (constraintLayout == null) {
                return;
            }
            constraintLayout.setVisibility(8);
            return;
        }
        IDH LLLF = LJFF().LLLF();
        if (LLLF == null) {
            return;
        }
        LLLF.Mi();
    }

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLILLLLZI = (ConstraintLayout) stickerView.findViewById(R.id.fhe);
        this.LJLJI = (LinearLayout) stickerView.findViewById(R.id.fme);
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        if (state == IDK.AFTER_ANIMATE && !this.LJLJJL) {
            this.LJLJJL = true;
            T4Q t4q = this.LJLJJI;
            if (t4q != null) {
                LJIIIZ(t4q);
            }
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
        this.LJLJJL = false;
    }

    public final void LJIIIZ(T4Q t4q) {
        Effect effect;
        if (C2311895m.LIZIZ()) {
            LinearLayout linearLayout = this.LJLJI;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ConstraintLayout constraintLayout = this.LJLILLLLZI;
            if (constraintLayout != null) {
                C16880lQ.LJIL(constraintLayout, null);
            }
            if (ID0.LJIIL(t4q.LIZ) || ((effect = t4q.LIZ) != null && (effect.getSource() == 101 || effect.getSource() == 102))) {
                XKQ xkq = this.LJLJJLL;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                this.LJLJJLL = XKX.LIZLLL(this.LJLJLLL, null, null, new EJT(this, t4q.LIZ, null), 3);
            }
            if (C2311895m.LIZJ()) {
                Effect effect2 = t4q.LIZ;
                ConstraintLayout constraintLayout2 = this.LJLILLLLZI;
                if (constraintLayout2 != null) {
                    constraintLayout2.getLayoutParams().width = -2;
                    constraintLayout2.getLayoutParams().height = -2;
                    constraintLayout2.setVisibility(0);
                    Handler handler = constraintLayout2.getHandler();
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    constraintLayout2.setPadding(C278817o.LIZ(12.0f), C278817o.LIZ(8.0f), C278817o.LIZ(12.0f), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(8.0f))));
                    View showCoreStickerCardView$lambda$4$lambda$2 = constraintLayout2.findViewById(R.id.fm8);
                    o.LJIIIIZZ(showCoreStickerCardView$lambda$4$lambda$2, "showCoreStickerCardView$lambda$4$lambda$2");
                    C26338AVi.LJI(showCoreStickerCardView$lambda$4$lambda$2, 0, Integer.valueOf((int) C74275TDb.LIZ(3.0f)), 0, 0, false, 16);
                    TextView textView = (TextView) constraintLayout2.findViewById(R.id.fme);
                    textView.setText(effect2.getName());
                    textView.setVisibility(0);
                    constraintLayout2.findViewById(R.id.flv).setVisibility(8);
                    ((ImageView) constraintLayout2.findViewById(R.id.fha)).setVisibility(8);
                    C16880lQ.LJIL(constraintLayout2, new IDlS19S0200000_12(this, effect2, 0));
                    constraintLayout2.postDelayed(new ARunnableS37S0100000_1(constraintLayout2, 50), 3000L);
                    return;
                }
                return;
            }
            Effect effect3 = t4q.LIZ;
            IDH LLLF = LJFF().LLLF();
            if (LLLF == null) {
                return;
            }
            LLLF.B0(effect3.getName(), new AqS159S0200000_12(this, effect3, 36));
            return;
        }
        LJIIIIZZ();
    }

    public EffectInfoStickerHandler(LifecycleOwner lifeCycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        this.LJLIL = diContainer;
        this.LJLJL = UCI.LJI(diContainer, I0N.class, null);
        this.LJLJLJ = UCI.LJII(diContainer, InterfaceC74330TFe.class, null);
        this.LJLJLLL = C48841JEv.LIZ(C78613UtF.LIZJ);
        lifeCycleOwner.getLifecycle().addObserver(this);
    }

    public static Object LIZIZ(Effect effect, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C44423Hc3 user = C60903NvH.LJIIJJI().getAccountService().LJII(effect.getDesignerId(), effect.getDesignerEncryptedId());
        o.LJIIIZ(user, "user");
        C45931I0x c45931I0x = new C45931I0x(user);
        C3C5.m7constructorimpl(c45931I0x);
        xks.resumeWith(c45931I0x);
        return xks.LJIIJJI();
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        if (session instanceof T4Q) {
            if (this.LJLJJL) {
                this.LJLJJI = null;
                LJIIIZ((T4Q) session);
            } else {
                this.LJLJJI = (T4Q) session;
            }
        } else {
            LJIIIIZZ();
        }
        return ern.LIZ(session);
    }
}
