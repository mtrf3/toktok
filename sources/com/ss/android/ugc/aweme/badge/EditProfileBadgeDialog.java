package com.ss.android.ugc.aweme.badge;

import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C72734Sgc;
import X.C72735Sgd;
import X.C72736Sge;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C78688UuS;
import X.C78939UyV;
import X.C90903hW;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC72738Sgg;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.SY4;
import X.TBT;
import X.TBW;
import X.TMG;
import X.W1T;
import X.W5F;
import X.W5U;
import Y.ACListenerS32S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeState;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EditProfileBadgeDialog extends DialogFragment implements InterfaceC151715xP, InterfaceC72738Sgg {
    public static final /* synthetic */ int LJLLLL = 0;
    public final User LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public EditProfileBadgeModel LJLJJI;
    public boolean LJLJJL;
    public ProfileBadgeStruct LJLJJLL;
    public ProfileBadgeStruct LJLJL;
    public C72734Sgc LJLJLJ;
    public GridLayoutManager LJLJLLL;
    public final IProfileBadgeService LJLL;
    public final C62822Ol8 LJLLI;
    public C72735Sgd LJLLILLLL;
    public C72736Sge LJLLJ;
    public final Map<Integer, View> LJLLL;

    public EditProfileBadgeDialog() {
        this((User) null, 3);
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final void xl() {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.pe5);
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LIZLLL(2000L);
        c26045AKb.LJIIJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLLJ = null;
        this.LJLLILLLL = null;
    }

    public final void wl() {
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJI(c73306Spq, new AqS162S0100000_12(this, 102));
        c73305Spp.setStatus(c73306Spq);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
    }

    @Override // X.InterfaceC72738Sgg
    public final void Ob(EditProfileBadgeModel editProfileBadgeModel) {
        String str;
        Boolean bool;
        String str2;
        this.LJLJJI = editProfileBadgeModel;
        this.LJLJJL = true;
        String str3 = null;
        if (editProfileBadgeModel != null) {
            str = editProfileBadgeModel.getUrl();
            bool = editProfileBadgeModel.getShouldShow();
        } else {
            str = null;
            bool = null;
        }
        Al(bool, str);
        TextView textView = (TextView) _$_findCachedViewById(R.id.cnn);
        if (editProfileBadgeModel != null) {
            str2 = editProfileBadgeModel.getName();
        } else {
            str2 = null;
        }
        textView.setText(str2);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.cnm);
        if (editProfileBadgeModel != null) {
            str3 = editProfileBadgeModel.getDescription();
        }
        textView2.setText(str3);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJJLL = this.LJLIL.getProfileBadge();
        this.LJLJL = this.LJLIL.getProfileBadge();
        setStyle(0, R.style.a_o);
    }

    public final void vl(boolean z) {
        int i;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        if (_$_findCachedViewById(R.id.cnk) != null && _$_findCachedViewById(R.id.cnn) != null && _$_findCachedViewById(R.id.cnn) != null && _$_findCachedViewById(R.id.cnv) != null) {
            _$_findCachedViewById(R.id.cnk).setVisibility(i);
            _$_findCachedViewById(R.id.cnn).setVisibility(i);
            _$_findCachedViewById(R.id.cnm).setVisibility(i);
            _$_findCachedViewById(R.id.cnv).setVisibility(i);
        }
    }

    public EditProfileBadgeDialog(User curUser, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(curUser, "curUser");
        this.LJLLL = new LinkedHashMap();
        this.LJLIL = curUser;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 103));
        IProfileBadgeService createIProfileBadgeServicebyMonsterPlugin = ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIProfileBadgeServicebyMonsterPlugin, "get().getService(IProfileBadgeService::class.java)");
        this.LJLL = createIProfileBadgeServicebyMonsterPlugin;
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 101));
    }

    public final void Al(Boolean bool, String str) {
        if (str != null && o.LJ(bool, Boolean.TRUE) && _$_findCachedViewById(R.id.cnj) != null) {
            ((ImageView) _$_findCachedViewById(R.id.cnj)).setVisibility(0);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.cnj);
            LJIIIIZZ.LIZIZ("EditProfileBadgeDialog");
            C16880lQ.LLJJJ(LJIIIIZZ);
            return;
        }
        if (_$_findCachedViewById(R.id.cnj) == null) {
            return;
        }
        ((ImageView) _$_findCachedViewById(R.id.cnj)).setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(8);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.ar);
        }
        if (_$_findCachedViewById(R.id.cni) != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(C78688UuS.LJJI(this.LJLIL)));
            LJII.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.cni);
            LJII.LIZIZ("EditProfileBadgeDialog");
            C16880lQ.LLJJJ(LJII);
        }
        ProfileBadgeStruct profileBadge = this.LJLIL.getProfileBadge();
        Boolean bool = null;
        if (profileBadge != null) {
            str = profileBadge.getUrl();
        } else {
            str = null;
        }
        ProfileBadgeStruct profileBadge2 = this.LJLIL.getProfileBadge();
        if (profileBadge2 != null) {
            bool = Boolean.valueOf(profileBadge2.getShouldShow());
        }
        Al(bool, str);
        C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.cnx), new ACListenerS32S0100000_12(this, 155));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.cnv), new Au2S20S0100000_12(this, 77));
        ((EditProfileBadgeViewModel) this.LJLLI.getValue()).Hv0();
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.E2n
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditProfileBadgeState) obj).getResult();
            }
        }, new AqS194S0100000_12(this, 212));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public /* synthetic */ EditProfileBadgeDialog(User user, int i) {
        this((i & 1) != 0 ? new User() : user, (InterfaceC65784Pro<C76800UCe>) null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.clt, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
