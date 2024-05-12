package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.handler;

import X.C145995oB;
import X.C16880lQ;
import X.C45593Huv;
import X.C46193IAz;
import X.C6QQ;
import X.C71897SJp;
import X.C76800UCe;
import X.C78880UxY;
import X.ERS;
import X.ESP;
import X.IDK;
import X.InterfaceC65784Pro;
import X.T4Q;
import X.TGM;
import X.TGT;
import X.V0N;
import Y.ACListenerS27S0100000_7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GreenScreenReuseHandler extends ESP implements GenericLifecycleObserver, TGM, TGT {
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final ShortVideoContext LJLJI;
    public Effect LJLJJI;
    public C71897SJp LJLJJL;
    public TuxTextView LJLJJLL;
    public View LJLJL;

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.TGT
    public final void LLIIIL() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            setCheckBoxState();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void setCheckBoxState() {
        C6QQ.LIZ(new AqS157S0100000_7(this, 415));
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        View view = this.LJLJL;
        if (view != null) {
            view.setVisibility(8);
        }
        this.LJLJJI = null;
    }

    @Override // X.TGT
    public final boolean LLIIIJ() {
        Effect effect = this.LJLJJI;
        if (effect != null && V0N.LJJI(effect)) {
            LJIILIIL(C45593Huv.LIZ());
            View view = this.LJLJL;
            if (view == null || view.getVisibility() != 0) {
                return false;
            }
        } else {
            View view2 = this.LJLJL;
            if (view2 != null && view2.getVisibility() == 8) {
                return false;
            }
        }
        return true;
    }

    @Override // X.TGT
    public final void LLIIIZ() {
        View view;
        Effect effect = this.LJLJJI;
        if (effect == null || !V0N.LJJI(effect) || (view = this.LJLJL) == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        LayoutInflater LLZIL = C16880lQ.LLZIL(stickerView.getContext());
        ViewGroup viewGroup = (ViewGroup) stickerView.findViewById(R.id.kgo);
        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.aze, viewGroup, false);
        this.LJLJL = LLLLIILL;
        if (LLLLIILL != null && viewGroup != null) {
            viewGroup.addView(LLLLIILL, 0);
        }
        this.LJLJJL = (C71897SJp) stickerView.findViewById(R.id.dzc);
        this.LJLJJLL = (TuxTextView) stickerView.findViewById(R.id.dzd);
        View view = this.LJLJL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 77), view);
        }
        View view2 = this.LJLJL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        Effect effect = this.LJLJJI;
        if (effect != null && V0N.LJJI(effect)) {
            if (this.LJLJI.curGreenScreenMaterial.getType() == 1) {
                C71897SJp c71897SJp = this.LJLJJL;
                if (c71897SJp != null) {
                    c71897SJp.setChecked(C45593Huv.LIZ());
                }
                View view = this.LJLJL;
                if (view != null) {
                    view.setEnabled(true);
                }
                View view2 = this.LJLJL;
                if (view2 != null) {
                    view2.setClickable(true);
                }
                C71897SJp c71897SJp2 = this.LJLJJL;
                if (c71897SJp2 != null) {
                    c71897SJp2.setEnabled(true);
                }
                C71897SJp c71897SJp3 = this.LJLJJL;
                if (c71897SJp3 != null) {
                    c71897SJp3.setInnerMaskVisibility(true);
                }
                TuxTextView tuxTextView = this.LJLJJLL;
                if (tuxTextView != null) {
                    tuxTextView.setTextColorRes(R.attr.cl);
                }
            }
            View view3 = this.LJLJL;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            LJIILIIL(C45593Huv.LIZ());
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        View view;
        o.LJIIIZ(state, "state");
        Effect effect = this.LJLJJI;
        if ((effect != null && V0N.LJJI(effect)) || (view = this.LJLJL) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        boolean LJJI = V0N.LJJI(session.LIZ);
        if (LJJI) {
            this.LJLJJI = session.LIZ;
            this.LJLILLLLZI.invoke();
        }
        return LJJI;
    }

    public final void LJIILIIL(boolean z) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", this.LJLJI.enterFrom);
        c145995oB.LJI("creation_id", this.LJLJI.LJI());
        c145995oB.LJI("shoot_way", this.LJLJI.shootWay);
        c145995oB.LIZ(z ? 1 : 0, "is_in_upload_flow");
        Map<String, String> map = c145995oB.LIZ;
        o.LJIIIIZZ(map, "eventMap.builder()");
        C78880UxY.LJJLIIIJL("greenscreen_reuse_toggle_show", map);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        if (V0N.LJJI(session.LIZ)) {
            C6QQ.LIZ(new AqS157S0100000_7(this, 416));
        }
    }

    public GreenScreenReuseHandler(C46193IAz lifecycleOwner, AqS156S0100000_6 aqS156S0100000_6, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLILLLLZI = aqS156S0100000_6;
        this.LJLJI = shortVideoContext;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
