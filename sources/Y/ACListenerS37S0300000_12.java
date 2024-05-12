package Y;

import X.ActivityC45651qj;
import X.C145995oB;
import X.C188727au;
import X.C34394Deg;
import X.C44089HSb;
import X.C44100HSm;
import X.C69604RTk;
import X.C6ZT;
import X.C70691Rol;
import X.C71830SHa;
import X.C71897SJp;
import X.C72793ShZ;
import X.C72794Sha;
import X.C74065T4z;
import X.C7F9;
import X.C80217Ve1;
import X.C80647Vkx;
import X.C8IM;
import X.GXR;
import X.HSS;
import X.InterfaceC65784Pro;
import X.K3M;
import X.S1C;
import X.S1E;
import X.S1T;
import X.S1Y;
import X.SHX;
import X.STY;
import X.T5T;
import X.T84;
import X.T86;
import X.T87;
import X.T8G;
import X.TEZ;
import X.THG;
import X.THX;
import X.Z9N;
import android.app.Dialog;
import android.text.Editable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.play.core.assetpacks.r2;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.aigc.ChooseStyleCell;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ACListenerS37S0300000_12 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        ChooseStyleCell chooseStyleCell = (ChooseStyleCell) aCListenerS37S0300000_12.l0;
        boolean z = chooseStyleCell.LJLILLLLZI;
        if (z) {
            chooseStyleCell.LJLILLLLZI = !z;
            chooseStyleCell.L().iv0(((STY) aCListenerS37S0300000_12.l1).LJLIL, ((ChooseStyleCell) aCListenerS37S0300000_12.l0).LJLILLLLZI);
            ((C71897SJp) aCListenerS37S0300000_12.l2).setChecked(((ChooseStyleCell) aCListenerS37S0300000_12.l0).LJLILLLLZI);
        } else {
            if (!chooseStyleCell.L().gv0()) {
                return;
            }
            ChooseStyleCell chooseStyleCell2 = (ChooseStyleCell) aCListenerS37S0300000_12.l0;
            boolean z2 = !chooseStyleCell2.LJLILLLLZI;
            chooseStyleCell2.LJLILLLLZI = z2;
            ((C71897SJp) aCListenerS37S0300000_12.l2).setChecked(z2);
            ((ChooseStyleCell) aCListenerS37S0300000_12.l0).L().iv0(((STY) aCListenerS37S0300000_12.l1).LJLIL, ((ChooseStyleCell) aCListenerS37S0300000_12.l0).LJLILLLLZI);
        }
    }

    public static final void onClick$1(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        String str;
        String str2;
        Effect effect = (Effect) aCListenerS37S0300000_12.l0;
        if (((C72793ShZ) aCListenerS37S0300000_12.l1).LJLJJL) {
            str = "prop_recommend";
        } else {
            str = "prop_search";
        }
        effect.setSearchType(str);
        ((C72794Sha) aCListenerS37S0300000_12.l2).LJLIL.invoke((Effect) aCListenerS37S0300000_12.l0);
        TEZ LLLLL = ((C72793ShZ) aCListenerS37S0300000_12.l1).LJLIL.LLLLL();
        int position = ((C72794Sha) aCListenerS37S0300000_12.l2).getPosition();
        ((C72793ShZ) aCListenerS37S0300000_12.l1).LJLIL.LLLLL().LJIIJ();
        LLLLL.LJJIJL(position);
        if (!((C72793ShZ) aCListenerS37S0300000_12.l1).LJLJJL) {
            str2 = "search";
        } else {
            str2 = "recommend";
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("tab_name", "search");
        c145995oB.LJI("search_id", ((C72793ShZ) aCListenerS37S0300000_12.l1).LJLJJI);
        c145995oB.LJI("creation_id", ((C72793ShZ) aCListenerS37S0300000_12.l1).LJLILLLLZI);
        Z9N z9n = Z9N.LIZIZ;
        c145995oB.LJI("effect_session_id", z9n.LJFF().LJIJJLI());
        c145995oB.LJI("search_method", str2);
        c145995oB.LIZ(((C72793ShZ) aCListenerS37S0300000_12.l1).LJLIL.LLLLL().LJI(), "impr_position");
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("prop_id", ((Effect) aCListenerS37S0300000_12.l0).getEffectId());
        C72793ShZ.LJLLLLLL(c145995oB, (Effect) aCListenerS37S0300000_12.l0);
        GXR.LIZ("prop_click", c145995oB.LIZ);
        z9n.LJFF().LJIIIZ(new K3M(((C72793ShZ) aCListenerS37S0300000_12.l1).LJLIL.LLLLL().LJI(), ((C72793ShZ) aCListenerS37S0300000_12.l1).LJLJJI, ((Effect) aCListenerS37S0300000_12.l0).getEffectId(), ((Effect) aCListenerS37S0300000_12.l0).getDoc_id(), ((C72793ShZ) aCListenerS37S0300000_12.l1).LJLILLLLZI, str2, "", ""));
    }

    public static final void onClick$10(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        ((C80217Ve1) aCListenerS37S0300000_12.l0).LIZLLL(true, true, true);
        ((RecyclerView) aCListenerS37S0300000_12.l1).LJLIL(0);
        C70691Rol c70691Rol = ((ProductReviewFragment) aCListenerS37S0300000_12.l2).Hl().LJLLILLLL;
        if (c70691Rol != null) {
            c70691Rol.LJIIJ("to_top");
        }
    }

    public static final void onClick$11(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        boolean isSelected = ((C74065T4z) aCListenerS37S0300000_12.l0).LIZLLL().isSelected();
        ViewGroup.LayoutParams layoutParams = ((C74065T4z) aCListenerS37S0300000_12.l0).LIZJ().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (isSelected) {
            ((C74065T4z) aCListenerS37S0300000_12.l0).LJFF().setText((SpannableString) aCListenerS37S0300000_12.l1);
            ((C74065T4z) aCListenerS37S0300000_12.l0).LJ().setText(((C74065T4z) aCListenerS37S0300000_12.l0).LJFF().getContext().getString(R.string.giq));
            ((C74065T4z) aCListenerS37S0300000_12.l0).LIZLLL().setImageResource(R.drawable.a_8);
            marginLayoutParams.topMargin = 0;
            ((C74065T4z) aCListenerS37S0300000_12.l0).LIZJ().setLayoutParams(marginLayoutParams);
            ((C74065T4z) aCListenerS37S0300000_12.l0).LIZLLL().setSelected(false);
        } else {
            ((C74065T4z) aCListenerS37S0300000_12.l0).LJFF().setText((SpannableString) aCListenerS37S0300000_12.l2);
            ((C74065T4z) aCListenerS37S0300000_12.l0).LJ().setText(((C74065T4z) aCListenerS37S0300000_12.l0).LJFF().getContext().getString(R.string.g7k));
            ((C74065T4z) aCListenerS37S0300000_12.l0).LIZLLL().setImageResource(R.drawable.a_9);
            marginLayoutParams.topMargin = ((Number) C74065T4z.LJIIIIZZ.getValue()).intValue();
            ((C74065T4z) aCListenerS37S0300000_12.l0).LIZJ().setLayoutParams(marginLayoutParams);
            ((C74065T4z) aCListenerS37S0300000_12.l0).LIZLLL().setSelected(true);
            View LIZJ = ((C74065T4z) aCListenerS37S0300000_12.l0).LIZJ();
            int i = 0;
            while (true) {
                if (!(LIZJ.getParent() instanceof View)) {
                    break;
                }
                Object parent = LIZJ.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.View");
                LIZJ = (View) parent;
                if (LIZJ instanceof C80647Vkx) {
                    LIZJ.scrollTo(0, 0);
                    break;
                } else {
                    i++;
                    if (i >= 10) {
                        break;
                    }
                }
            }
        }
        View.OnClickListener onClickListener = ((C74065T4z) aCListenerS37S0300000_12.l0).LJFF;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void onClick$12(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        if (!((THG) aCListenerS37S0300000_12.l0).LIZJ.isLogin()) {
            THX thx = ((THG) aCListenerS37S0300000_12.l0).LIZJ;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) aCListenerS37S0300000_12.l1;
            thx.LIZJ();
            thx.LIZIZ(activityC45651qj, "", 241, null, new AqS162S0100000_12(aCListenerS37S0300000_12, 1196));
            return;
        }
        ((InterfaceC65784Pro) aCListenerS37S0300000_12.l2).invoke();
    }

    public static final void onClick$2(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        S1T s1t = (S1T) aCListenerS37S0300000_12.l0;
        S1Y s1y = s1t.LJLLILLLL;
        if (s1y != null) {
            Aweme LJJII = s1t.LJJII();
            S1T s1t2 = (S1T) aCListenerS37S0300000_12.l0;
            s1y.LIZJ((C188727au) aCListenerS37S0300000_12.l1, LJJII, s1t2.LJLL, s1t2.LJJIIZI());
            S1T s1t3 = (S1T) aCListenerS37S0300000_12.l0;
            s1t3.getClass();
            if (s1t3 instanceof C44089HSb) {
                ((Dialog) aCListenerS37S0300000_12.l2).dismiss();
                return;
            }
            return;
        }
        o.LJIJI("makerBehavior");
        throw null;
    }

    public static final void onClick$3(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        S1E s1e = (S1E) aCListenerS37S0300000_12.l0;
        C7F9 c7f9 = (C7F9) aCListenerS37S0300000_12.l1;
        s1e.LJI(C44100HSm.LIZ(s1e, c7f9, "click_anchor", ((S1C) aCListenerS37S0300000_12.l2).LJIILL(c7f9)));
        S1E s1e2 = (S1E) aCListenerS37S0300000_12.l0;
        C7F9 c7f92 = (C7F9) aCListenerS37S0300000_12.l1;
        s1e2.LJIIIIZZ(C44100HSm.LIZJ(s1e2, c7f92, "click_anchor", ((S1C) aCListenerS37S0300000_12.l2).LJIILL(c7f92)));
    }

    public static final void onClick$4(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        S1E s1e = (S1E) aCListenerS37S0300000_12.l0;
        C7F9 c7f9 = (C7F9) aCListenerS37S0300000_12.l1;
        s1e.LJI(C44100HSm.LIZ(s1e, c7f9, "click_list", ((r2) aCListenerS37S0300000_12.l2).LJIILL(c7f9)));
        S1E s1e2 = (S1E) aCListenerS37S0300000_12.l0;
        C7F9 c7f92 = (C7F9) aCListenerS37S0300000_12.l1;
        s1e2.LJIIIIZZ(C44100HSm.LIZJ(s1e2, c7f92, "click_list", ((r2) aCListenerS37S0300000_12.l2).LJIILL(c7f92)));
    }

    public static final void onClick$5(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        S1E LIZLLL = ((C7F9) aCListenerS37S0300000_12.l0).LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        C8IM c8im = (C8IM) aCListenerS37S0300000_12.l1;
        C7F9 c7f9 = (C7F9) aCListenerS37S0300000_12.l0;
        c8im.LJ(C44100HSm.LIZJ(LIZLLL, c7f9, "click_anchor", ((r2) aCListenerS37S0300000_12.l2).LJIILL(c7f9)), C34394Deg.LJLIL);
        S1E LIZLLL2 = ((C7F9) aCListenerS37S0300000_12.l0).LIZLLL();
        o.LJII(LIZLLL2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.multi.maker.SimpleAnchorMaker");
        HSS hss = (HSS) LIZLLL2;
        C7F9 c7f92 = (C7F9) aCListenerS37S0300000_12.l0;
        r2 r2Var = (r2) aCListenerS37S0300000_12.l2;
        hss.LJJJ(C44100HSm.LIZ(hss, c7f92, "click_anchor", r2Var.LJIILL(c7f92)));
        HSS.LJJIZ(hss, C44100HSm.LIZJ(hss, c7f92, "click_anchor", r2Var.LJIILL(c7f92)), 6);
    }

    public static final void onClick$6(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        S1E s1e = (S1E) aCListenerS37S0300000_12.l0;
        C7F9 c7f9 = (C7F9) aCListenerS37S0300000_12.l1;
        s1e.LJI(C44100HSm.LIZ(s1e, c7f9, "click_anchor", ((r2) aCListenerS37S0300000_12.l2).LJIILL(c7f9)));
        S1E s1e2 = (S1E) aCListenerS37S0300000_12.l0;
        C7F9 c7f92 = (C7F9) aCListenerS37S0300000_12.l1;
        s1e2.LJIIIIZZ(C44100HSm.LIZJ(s1e2, c7f92, "click_anchor", ((r2) aCListenerS37S0300000_12.l2).LJIILL(c7f92)));
    }

    public static final void onClick$7(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        ((T84) aCListenerS37S0300000_12.l0).wA((C71830SHa) aCListenerS37S0300000_12.l1, ((SHX) aCListenerS37S0300000_12.l2).LJLILLLLZI);
    }

    public static final void onClick$8(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        List<C71830SHa> list = ((C69604RTk) aCListenerS37S0300000_12.l0).LJ;
        if (list != null) {
            T87 t87 = (T87) aCListenerS37S0300000_12.l1;
            T86 t86 = (T86) aCListenerS37S0300000_12.l2;
            if (!list.isEmpty()) {
                t87.LJLILLLLZI.wA((C71830SHa) ListProtector.get(list, 0), t86.LJFF);
            }
        }
    }

    public static final void onClick$9(ACListenerS37S0300000_12 aCListenerS37S0300000_12, View view) {
        Editable text;
        T5T t5t = (T5T) aCListenerS37S0300000_12.l0;
        if (t5t != null && (text = t5t.getText()) != null) {
            text.clear();
        }
        View view2 = (View) aCListenerS37S0300000_12.l1;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        T8G t8g = (T8G) aCListenerS37S0300000_12.l2;
        if (t8g != null) {
            t8g.LLIIIL("");
        }
        T8G t8g2 = (T8G) aCListenerS37S0300000_12.l2;
        if (t8g2 != null) {
            t8g2.HB();
        }
    }

    public ACListenerS37S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
