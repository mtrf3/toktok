package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Sha, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72794Sha extends RecyclerView.ViewHolder {
    public final InterfaceC88472Yns<Effect, C76800UCe> LJLIL;
    public Effect LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;
    public final C72790ShW LJLJJL;
    public final /* synthetic */ C72793ShZ LJLJJLL;

    public final void L() {
        String str;
        TEZ LLLLL = this.LJLJJLL.LJLIL.LLLLL();
        int position = getPosition();
        this.LJLJJLL.LJLIL.LLLLL().LJIIJ();
        LLLLL.LJJIJL(position);
        Effect effect = this.LJLILLLLZI;
        if (effect == null || !this.LJLJJLL.LJLJJLL.add(effect.getEffectId())) {
            return;
        }
        if (!this.LJLJJLL.LJLJJL) {
            str = "search";
        } else {
            str = "recommend";
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("tab_name", "search");
        c145995oB.LJI("search_id", this.LJLJJLL.LJLJJI);
        c145995oB.LJI("creation_id", this.LJLJJLL.LJLILLLLZI);
        Z9N z9n = Z9N.LIZIZ;
        c145995oB.LJI("effect_session_id", z9n.LJFF().LJIJJLI());
        c145995oB.LJI("search_method", str);
        c145995oB.LIZ(getAdapterPosition() + 1, "impr_position");
        c145995oB.LJI("prop_id", effect.getEffectId());
        c145995oB.LIZ(this.LJLJJLL.LJLIL.LLLLL().LJI(), "impr_position");
        c145995oB.LJI("enter_from", "video_shoot_page");
        C72793ShZ.LJLLLLLL(c145995oB, effect);
        GXR.LIZ("prop_show", c145995oB.LIZ);
        z9n.LJFF().LJFF(new K3M(this.LJLJJLL.LJLIL.LLLLL().LJI(), this.LJLJJLL.LJLJJI, effect.getEffectId(), effect.getDoc_id(), this.LJLJJLL.LJLILLLLZI, str, "", ""));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C72794Sha(C72793ShZ c72793ShZ, View view, InterfaceC88472Yns<? super Effect, C76800UCe> clickListener) {
        super(view);
        o.LJIIIZ(clickListener, "clickListener");
        this.LJLJJLL = c72793ShZ;
        this.LJLIL = clickListener;
        this.LJLJI = (TuxTextView) view.findViewById(R.id.csj);
        this.LJLJJI = (TuxTextView) view.findViewById(R.id.n74);
        this.LJLJJL = (C72790ShW) view.findViewById(R.id.csp);
        if (C58B.LIZ()) {
            View findViewById = view.findViewById(R.id.mxs);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt.LIZJ = C61328O5c.LIZJ(5);
            C71313Ryn.LIZIZ(view, "itemView.context", c110614Vt, findViewById);
        }
    }
}
