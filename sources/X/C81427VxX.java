package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.s;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Arg3;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Body;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Command;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.Interface;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VxX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81427VxX extends ESP implements TGM, TGT, InterfaceC81397Vx3 {
    public final ShortVideoContext LJLILLLLZI;
    public final TEZ LJLJI;
    public final InterfaceC82086WJm LJLJJI;
    public View LJLJJL;
    public Effect LJLJJLL;
    public boolean LJLJL;
    public final java.util.Map<String, String> LJLJLJ;

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        View view = this.LJLJJL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final void LJIILIIL() {
        Effect effect;
        if (this.LJLJL && (effect = this.LJLJJLL) != null && DiyPropParser.LJIIIIZZ(effect)) {
            C43045Guv.LIZLLL(new AqS164S0100000_14(this, 387), 0L);
        } else {
            C43045Guv.LIZLLL(new AqS164S0100000_14(this, 388), 0L);
        }
    }

    @Override // X.TGT
    public final boolean LLIIIJ() {
        View view = this.LJLJJL;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.TGT
    public final void LLIIIL() {
        View view = this.LJLJJL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.TGT
    public final void LLIIIZ() {
        View view = this.LJLJJL;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        LayoutInflater LLZIL = C16880lQ.LLZIL(stickerView.getContext());
        ConstraintLayout constraintLayout = (ConstraintLayout) stickerView.findViewById(R.id.kgf);
        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.h0, constraintLayout, false);
        this.LJLJJL = LLLLIILL;
        if (LLLLIILL != null) {
            LLLLIILL.setVisibility(8);
            if (constraintLayout != null) {
                constraintLayout.addView(LLLLIILL, 0);
            }
            AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
            LIZ.LJ(LLLLIILL.getId());
            LIZ.LJIIIIZZ(LLLLIILL.getId(), 4, 0, 4);
            LIZ.LIZIZ(constraintLayout);
        }
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        View view;
        o.LJIIIZ(state, "state");
        if (!(this.LJLJJLL instanceof DraftEffect) || (view = this.LJLJJL) == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        View view;
        o.LJIIIZ(state, "state");
        if (!(this.LJLJJLL instanceof DraftEffect) || (view = this.LJLJJL) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        if ((effect instanceof ProTemplateEffect) || (effect instanceof DraftEffect) || (DiyPropParser.LJIIIIZZ(effect) && !DiyPropParser.LIZ(session.LIZ))) {
            return true;
        }
        return false;
    }

    @Override // X.ESP, X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        this.LJLJJLL = session.LIZ();
        return super.LIZLLL(ern, session);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        int i;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        View view = this.LJLJJL;
        if (view != null) {
            boolean z = effect instanceof ProTemplateEffect;
            if (z || (effect instanceof DraftEffect)) {
                if (session.LIZJ != EnumC44267HYx.RECOVER) {
                    C78897Uxp.LJJJ("show_edit_draft_advanced_mobile_effect", this.LJLJLJ);
                }
                view.setVisibility(0);
            } else if (effect != null && DiyPropParser.LJIIIIZZ(effect)) {
                LJIILIIL();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" MEEditStickerHandler visibility not supported: ");
                LIZ.append(effect);
                H78.LIZJ(X1D.LIZIZ(LIZ));
                view.setVisibility(8);
            }
            TextView textView = (TextView) view.findViewById(R.id.a1_);
            if (z) {
                i = R.string.fzl;
            } else if (effect instanceof DraftEffect) {
                i = R.string.q8s;
            } else if (effect != null && DiyPropParser.LJIIIIZZ(effect)) {
                i = R.string.hpk;
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" MEEditStickerHandler text not supported: ");
                LIZ2.append(effect);
                H78.LIZJ(X1D.LIZIZ(LIZ2));
                i = R.string.fgu;
            }
            textView.setText(i);
            C16880lQ.LJIIJ(new C81426VxW(effect, this), view);
        }
    }

    public C81427VxX(ShortVideoContext shortVideoContext, TEZ stickerDataManager, WRQ cameraApiComponent) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = stickerDataManager;
        this.LJLJJI = cameraApiComponent;
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("creation_id", shortVideoContext.LJI());
        oszArr[1] = new OSZ("enter_from", shortVideoContext.enterFrom);
        String str = shortVideoContext.shootWay;
        oszArr[2] = new OSZ("shoot_way", str == null ? "" : str);
        this.LJLJLJ = C113554cx.LJJL(oszArr);
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        Arg3 arg3;
        Interface r1;
        Command command;
        Body body;
        Body body2;
        if (!C53560L0i.LIZ()) {
            return;
        }
        Command command2 = null;
        try {
            arg3 = (Arg3) C78880UxY.LJJIIZI(str, Arg3.class);
        } catch (s e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parseEffectMsg json fail: ");
            LIZ.append(e);
            H78.LJII(X1D.LIZIZ(LIZ));
            arg3 = null;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null || valueOf.intValue() != 41) {
            return;
        }
        if (arg3 != null) {
            r1 = arg3.interfaceStr;
        } else {
            r1 = null;
        }
        if (r1 != Interface.NATIVE_EDIT_BUTTON) {
            return;
        }
        if (arg3 != null && (body2 = arg3.body) != null) {
            command = body2.command;
        } else {
            command = null;
        }
        if (command == Command.SHOW) {
            this.LJLJL = true;
        } else {
            if (arg3 != null && (body = arg3.body) != null) {
                command2 = body.command;
            }
            if (command2 == Command.HIDE) {
                this.LJLJL = false;
            }
        }
        LJIILIIL();
    }
}
