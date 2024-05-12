package com.ss.android.ugc.aweme.view.profileImageEditor;

import X.AML;
import X.AbstractC029409q;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C223338pd;
import X.C29S;
import X.C2U8;
import X.C3C5;
import X.C62822Ol8;
import X.C72549Sdd;
import X.C72550Sde;
import X.C72553Sdh;
import X.C72556Sdk;
import X.C72582SeA;
import X.C72593SeL;
import X.C72632Sey;
import X.C72633Sez;
import X.C72653SfJ;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78939UyV;
import X.C90903hW;
import X.DialogC72548Sdc;
import X.EnumC72807Shn;
import X.FMX;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC72558Sdm;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.SY4;
import X.TBV;
import X.TBW;
import X.TMG;
import X.VA9;
import X.W1T;
import X.W5F;
import X.W5U;
import Y.ACListenerS32S0100000_12;
import android.app.Dialog;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviProfileImageEditorFragment extends DialogFragment implements InterfaceC151715xP, InterfaceC72558Sdm {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 959));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 960));

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

    public final ProfileNaviCreatorViewModel vl() {
        return (ProfileNaviCreatorViewModel) this.LJLIL.getValue();
    }

    public final void wl() {
        FMX.LJIIL("cancel_edit_set_avatar_profile", new C188727au().LIZ);
        ProfileNaviCreatorViewModel vl = vl();
        vl.setStateImmediate(C72632Sey.LJLIL);
        vl.setStateImmediate(C72633Sez.LJLIL);
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C2U8.LIZ(new C72550Sde(1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2U8.LIZ(new C72550Sde(0));
    }

    public final void Al(C72556Sdk c72556Sdk) {
        String str = c72556Sdk.LIZIZ;
        if (str == null || str.length() == 0) {
            return;
        }
        ProfileNaviCreatorViewModel vl = vl();
        String str2 = c72556Sdk.LIZIZ;
        o.LJI(str2);
        vl.getClass();
        vl.setStateImmediate(new AqS35S1000000_12(str2, 18));
    }

    @Override // X.InterfaceC72558Sdm
    public final void Jd(C72556Sdk c72556Sdk) {
        ((C72549Sdd) this.LJLILLLLZI.getValue()).LIZIZ = c72556Sdk;
        AbstractC029409q adapter = ((RecyclerView) _$_findCachedViewById(R.id.i8n)).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        Al(c72556Sdk);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, android.R.style.Theme.DeviceDefault.NoActionBar.Fullscreen);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        return new DialogC72548Sdc(this, requireActivity(), getTheme());
    }

    public final void xl(boolean z) {
        if (!isAdded() || _$_findCachedViewById(R.id.i90) == null) {
            return;
        }
        if (z) {
            _$_findCachedViewById(R.id.i91).setVisibility(0);
            ((C223338pd) _$_findCachedViewById(R.id.i90)).LIZIZ();
        } else {
            ((C223338pd) _$_findCachedViewById(R.id.i90)).LIZJ();
            _$_findCachedViewById(R.id.i91).setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        UrlModel urlModel;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C73156SnQ.LJIIIIZZ(this, vl(), new TBV() { // from class: X.Seq
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj2) {
                return ((ProfileNaviCreatorState) obj2).getProfileImageBackgroundColor();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj2, Object obj3) {
                ((ProfileNaviCreatorState) obj2).setProfileImageBackgroundColor((String) obj3);
            }
        }, new AqS194S0100000_12(this, 187));
        if (getContext() != null && getFragmentManager() != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.i8n);
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            ((RecyclerView) _$_findCachedViewById(R.id.i8n)).setAdapter(new C72553Sdh((C72549Sdd) this.LJLILLLLZI.getValue(), this));
            C72556Sdk c72556Sdk = ((C72549Sdd) this.LJLILLLLZI.getValue()).LIZIZ;
            if (c72556Sdk != null) {
                Al(c72556Sdk);
            }
        }
        vl().getClass();
        C72653SfJ c72653SfJ = C72593SeL.LIZJ;
        File file = null;
        if (c72653SfJ != null) {
            obj = c72653SfJ.LIZ;
        } else {
            obj = null;
        }
        if (obj != null) {
            VA9 va9 = (VA9) _$_findCachedViewById(R.id.i8t);
            vl().getClass();
            C72653SfJ c72653SfJ2 = C72593SeL.LIZJ;
            if (c72653SfJ2 != null) {
                file = (File) c72653SfJ2.LIZ;
            }
            o.LJI(file);
            va9.setImageBitmap(BitmapFactory.decodeFile(file.getAbsolutePath()));
        } else {
            vl().getClass();
            C72582SeA c72582SeA = C72593SeL.LIZIZ;
            if (c72582SeA != null && (urlModel = c72582SeA.LJ) != null) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                LJII.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.i8t);
                LJII.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                C16880lQ.LLJJJ(LJII);
            }
        }
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.i8r), new ACListenerS32S0100000_12(this, 117));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.i8l), new ACListenerS32S0100000_12(this, 118));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c7d, viewGroup, false);
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
