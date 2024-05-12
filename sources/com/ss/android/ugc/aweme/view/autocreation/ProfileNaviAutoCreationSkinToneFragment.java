package com.ss.android.ugc.aweme.view.autocreation;

import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C51936KZw;
import X.C62822Ol8;
import X.C65777Prh;
import X.C72571Sdz;
import X.C72581Se9;
import X.C72591SeJ;
import X.C72593SeL;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.FMX;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC72574Se2;
import X.InterfaceC72575Se3;
import X.InterfaceC72580Se8;
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
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviFeatureDataModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviAutoCreationViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviAutoCreationSkinToneFragment extends Fragment implements InterfaceC151715xP, InterfaceC72574Se2 {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 935));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 936));

    @Override // X.InterfaceC72574Se2
    public final void LJLIL(InterfaceC72575Se3 selectable, int i) {
        o.LJIIIZ(selectable, "selectable");
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        InterfaceC72580Se8 interfaceC72580Se8;
        wl().getClass();
        HashMap<String, InterfaceC72580Se8> hashMap = C72593SeL.LJ;
        if (hashMap != null && (interfaceC72580Se8 = hashMap.get("skin_tone")) != null) {
            ((TextView) _$_findCachedViewById(R.id.i8z)).setText(interfaceC72580Se8.getName());
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.i8w);
            getContext();
            recyclerView.setLayoutManager(new GridLayoutManager(6));
            ((RecyclerView) _$_findCachedViewById(R.id.i8w)).setAdapter(new C72571Sdz(6, new ArrayList(interfaceC72580Se8.LJ().values()), interfaceC72580Se8.LIZ(), 1, this, new AqS178S0100000_12(this, 301), new AqS178S0100000_12(this, 302)));
        }
    }

    public final ProfileNaviAutoCreationViewModel wl() {
        return (ProfileNaviAutoCreationViewModel) this.LJLIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int i;
        super.onStart();
        String valueOf = String.valueOf(new Date().getTime());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("start_time", valueOf);
        c188727au.LJIIIZ("enter_from", "avatar_hub");
        c188727au.LJIIIZ("enter_method", "click");
        FMX.LJIIL("show_auto_avatar_skin_tone", c188727au.LIZ);
        W5F LJFF = W5U.LJFF(UriProtector.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_avatar_outline.png"));
        LJFF.LIZJ = getContext();
        LJFF.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.i7n);
        C16880lQ.LLJJJ(LJFF);
        Bitmap selfieBitmap = wl().Hv0(this).getSelfieBitmap();
        if (selfieBitmap != null) {
            ((ImageView) _$_findCachedViewById(R.id.i8y)).setImageBitmap(selfieBitmap);
        }
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.i8u), new ACListenerS32S0100000_12(this, 1));
        View _$_findCachedViewById = _$_findCachedViewById(R.id.byl);
        if (C51936KZw.LIZ()) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.byl), new ACListenerS32S0100000_12(this, 2));
        if (C51936KZw.LIZ()) {
            _$_findCachedViewById(R.id.i8w).getLayoutParams().height = C7MY.LIZIZ(156);
        }
        if (((ProfileNaviEditorState) ((BaseJediViewModel) this.LJLILLLLZI.getValue()).Hv0(this)).isSceneEffectLoaded()) {
            xl();
        } else {
            C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.SeI
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((ProfileNaviEditorState) obj).isSceneEffectLoaded());
                }
            }, new AqS194S0100000_12(this, 1));
        }
    }

    public final void vl() {
        ProfileNaviDataModel profileNaviDataModel;
        InterfaceC72575Se3 selectedSkintone = wl().Hv0(this).getSelectedSkintone();
        if (selectedSkintone != null && (profileNaviDataModel = wl().Hv0(this).getProfileNaviDataModel()) != null) {
            List<ProfileNaviFeatureDataModel> features = profileNaviDataModel.getFeatures();
            if (features != null) {
                C65777Prh.LIZIZ(features).add(new ProfileNaviFeatureDataModel(selectedSkintone.LIZ().getKey(), C72581Se9.LIZIZ(selectedSkintone)));
            }
            ProfileNaviAutoCreationViewModel wl = wl();
            wl.getClass();
            wl.setStateImmediate(new AqS178S0100000_12(profileNaviDataModel, 396));
            wl.setStateImmediate(C72591SeJ.LJLIL);
        }
    }

    @Override // X.InterfaceC72574Se2
    public final void LJJL(InterfaceC72575Se3 selectable) {
        o.LJIIIZ(selectable, "selectable");
        ProfileNaviAutoCreationViewModel wl = wl();
        wl.getClass();
        wl.setStateImmediate(new AqS178S0100000_12(selectable, 399));
        String valueOf = String.valueOf(new Date().getTime());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("start_time", valueOf);
        c188727au.LJIIIZ("enter_from", "avatar_hub");
        c188727au.LJIIIZ("enter_method", "click");
        FMX.LJIIL("select_auto_avatar_skin_tone", c188727au.LIZ);
        if (!C51936KZw.LIZ()) {
            vl();
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c6u, viewGroup, false);
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
