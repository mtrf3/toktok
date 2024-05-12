package X;

import Y.ACListenerS27S0100000_7;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hw8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45668Hw8 extends AbstractC56012Ht<C45296Hq8, C45669Hw9> {
    public View LJLIL;
    public SmartImageView LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public View LJLJLJ;
    public W5G LJLJLLL;
    public W5G LJLL;
    public final Interpolator LJLLI;
    public AnimatorSet LJLLILLLL;
    public AnimatorSet LJLLJ;
    public boolean LJLLL;

    public final void LLJILJIL() {
        this.LJLLL = false;
        AnimatorSet animatorSet = this.LJLLILLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJLLJ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        W5G w5g = this.LJLJLLL;
        if (w5g != null) {
            w5g.bringToFront();
        } else {
            o.LJIJI("animCover1");
            throw null;
        }
    }

    public C45668Hw8() {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.45f, 0.0f, 0.55f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(0.45f, 0f, 0.55f, 1f)");
        this.LJLLI = LIZIZ;
    }

    public final View LLJILJILJ() {
        if (C90193gN.LIZ()) {
            View view = this.LJLJJI;
            if (view != null) {
                return view;
            }
            o.LJIJI("backBtnRTL");
            throw null;
        }
        View view2 = this.LJLJI;
        if (view2 != null) {
            return view2;
        }
        o.LJIJI("backBtn");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        LLJILJIL();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.j71);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.root)");
        this.LJLIL = requireViewById;
        View requireViewById2 = requireViewById(R.id.g83);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.loading_background)");
        this.LJLILLLLZI = (SmartImageView) requireViewById2;
        View requireViewById3 = requireViewById(R.id.aej);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.back_btn)");
        this.LJLJI = requireViewById3;
        View requireViewById4 = requireViewById(R.id.aen);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.back_btn_rtl)");
        this.LJLJJI = requireViewById4;
        View requireViewById5 = requireViewById(R.id.ias);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.progress_hint_title)");
        this.LJLJJL = (TuxTextView) requireViewById5;
        View requireViewById6 = requireViewById(R.id.iar);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.progress_hint_detail)");
        this.LJLJJLL = (TuxTextView) requireViewById6;
        View requireViewById7 = requireViewById(R.id.bei);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.clear_edit_hint)");
        this.LJLJL = (TuxTextView) requireViewById7;
        View requireViewById8 = requireViewById(R.id.izp);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.retry_btn)");
        this.LJLJLJ = requireViewById8;
        View requireViewById9 = requireViewById(R.id.a53);
        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.anim_cover1)");
        this.LJLJLLL = (W5G) requireViewById9;
        View requireViewById10 = requireViewById(R.id.a54);
        o.LJIIIIZZ(requireViewById10, "requireViewById(R.id.anim_cover2)");
        this.LJLL = (W5G) requireViewById10;
        if (C90193gN.LIZ()) {
            View view = this.LJLJI;
            if (view != null) {
                view.setVisibility(8);
                View view2 = this.LJLJJI;
                if (view2 != null) {
                    view2.setVisibility(0);
                } else {
                    o.LJIJI("backBtnRTL");
                    throw null;
                }
            } else {
                o.LJIJI("backBtn");
                throw null;
            }
        }
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.HqD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C45296Hq8) obj).LIZ;
            }
        }, null, new AqS173S0100000_7(this, 48), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.HqE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C45296Hq8) obj).LIZJ;
            }
        }, null, new AqS173S0100000_7(this, 49), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.HqF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C45296Hq8) obj).LIZIZ;
            }
        }, null, new AqS173S0100000_7(this, 50), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.Hq9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C45296Hq8) obj).LIZLLL);
            }
        }, null, new AqS173S0100000_7(this, 38), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.HqA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C45296Hq8) obj).LJ);
            }
        }, null, new AqS173S0100000_7(this, 42), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.HqG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C45296Hq8) obj).LJFF);
            }
        }, null, new AqS173S0100000_7(this, 43), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.HqC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C45296Hq8) obj).LJI;
            }
        }, null, new AqS173S0100000_7(this, 46), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.HqB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C45296Hq8) obj).LJII);
            }
        }, null, new AqS173S0100000_7(this, 47), 2, null);
        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 11), LLJILJILJ());
        View view3 = this.LJLJLJ;
        if (view3 != null) {
            C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 12), view3);
        } else {
            o.LJIJI("retryBtn");
            throw null;
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.l_, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
