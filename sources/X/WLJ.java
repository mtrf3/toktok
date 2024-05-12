package X;

import Y.ACListenerS34S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WLJ extends AbstractC56012Ht<C161796Wp, C124354uN> {
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxTextView LJLJJI;
    public View LJLJJL;
    public ViewGroup LJLJJLL;
    public View LJLJL;
    public C72434Sbm LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 109));

    public final void LLJILJIL(int i) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                TuxTextView tuxTextView = this.LJLILLLLZI;
                if (tuxTextView != null) {
                    tuxTextView.setText(requireSceneContext().getText(R.string.e0a));
                    TuxIconView tuxIconView = this.LJLJI;
                    if (tuxIconView != null) {
                        tuxIconView.setIconRes(R.raw.icon_lock_fill);
                        return;
                    } else {
                        o.LJIJI("icPrivacy");
                        throw null;
                    }
                }
                o.LJIJI("tvPrivacy");
                throw null;
            }
            TuxTextView tuxTextView2 = this.LJLILLLLZI;
            if (tuxTextView2 != null) {
                Context requireSceneContext = requireSceneContext();
                if (this.LJLJLLL) {
                    TuxIconView tuxIconView2 = this.LJLJI;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setIconRes(R.raw.icon_follower);
                        HC6.LJIIIIZZ("followers", (String) this.LJLL.getValue(), this.LJLJLLL);
                        i2 = R.string.j4f;
                    } else {
                        o.LJIJI("icPrivacy");
                        throw null;
                    }
                } else {
                    TuxIconView tuxIconView3 = this.LJLJI;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setIconRes(R.raw.icon_earth_w);
                        HC6.LJIIIIZZ("everyone", (String) this.LJLL.getValue(), this.LJLJLLL);
                        i2 = R.string.j4c;
                    } else {
                        o.LJIJI("icPrivacy");
                        throw null;
                    }
                }
                tuxTextView2.setText(requireSceneContext.getText(i2));
                return;
            }
            o.LJIJI("tvPrivacy");
            throw null;
        }
        TuxTextView tuxTextView3 = this.LJLILLLLZI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(requireSceneContext().getText(R.string.j4g));
            TuxIconView tuxIconView4 = this.LJLJI;
            if (tuxIconView4 != null) {
                tuxIconView4.setIconRes(R.raw.icon_two_person_large_fill);
                return;
            } else {
                o.LJIJI("icPrivacy");
                throw null;
            }
        }
        o.LJIJI("tvPrivacy");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.g5e);
        o.LJIIIIZZ(requireViewById, "requireViewById<View>(R.id.ll_privacy)");
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 19), requireViewById);
        if (getUiStates().LJ.LIZJ && !getUiStates().LJ.LJFF) {
            requireViewById.setAlpha(0.34f);
            requireViewById.setEnabled(false);
        }
        View requireViewById2 = requireViewById(R.id.met);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tv_privacy)");
        this.LJLILLLLZI = (TuxTextView) requireViewById2;
        View requireViewById3 = requireViewById(R.id.ec8);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.icon_privacy)");
        this.LJLJI = (TuxIconView) requireViewById3;
        View requireViewById4 = requireViewById(R.id.mo_);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.tv_title_post)");
        this.LJLJJI = (TuxTextView) requireViewById4;
        View requireViewById5 = requireViewById(R.id.cf8);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.dot_post)");
        this.LJLJJL = requireViewById5;
        View requireViewById6 = requireViewById(R.id.g6e);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.ll_story)");
        this.LJLJJLL = (ViewGroup) requireViewById6;
        View requireViewById7 = requireViewById(R.id.eye);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.iv_avatar)");
        this.LJLJLJ = (C72434Sbm) requireViewById7;
        View requireViewById8 = requireViewById(R.id.g5e);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.ll_privacy)");
        this.LJLJL = requireViewById8;
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WLL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C161796Wp) obj).LJ);
            }
        }, null, new AqS180S0100000_14(this, 89), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WLM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C161796Wp) obj).LIZ);
            }
        }, null, new AqS180S0100000_14(this, 90), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WLO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C161796Wp) obj).LIZIZ;
            }
        }, null, new AqS180S0100000_14(this, 91), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WLK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C161796Wp) obj).LIZJ);
            }
        }, null, new AqS180S0100000_14(this, 92), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WLN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C161796Wp) obj).LIZLLL);
            }
        }, null, new AqS180S0100000_14(this, 88), 2, null);
        View view = this.LJLJL;
        if (view != null) {
            view.setBackgroundResource(R.drawable.a51);
        } else {
            o.LJIJI("rootView");
            throw null;
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cds, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
