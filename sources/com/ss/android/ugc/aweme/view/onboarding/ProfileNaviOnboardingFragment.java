package com.ss.android.ugc.aweme.view.onboarding;

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
import X.C2NU;
import X.C30032BqW;
import X.C3C5;
import X.C40328FsC;
import X.C53247Kv5;
import X.C62822Ol8;
import X.C69601RTh;
import X.C69602RTi;
import X.C72604SeW;
import X.C72641Sf7;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC72613Sef;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.RTR;
import X.TBV;
import X.TBW;
import X.TMG;
import X.W1T;
import X.W5F;
import X.W5U;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS48S0100000_12;
import Y.IDAListenerS79S0100000_12;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviOnboardingFragment extends Fragment implements InterfaceC151715xP, InterfaceC72613Sef {
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 955));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 956));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 957));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    public final ProfileNaviOnboardingViewModel xl() {
        return (ProfileNaviOnboardingViewModel) this.LJLJI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        SharedPreferences preferences;
        super.onStart();
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.gxz);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS32S0100000_12(this, 112));
        }
        W5F LJFF = W5U.LJFF(UriProtector.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_starter_display_image.png"));
        LJFF.LIZJ = _$_findCachedViewById(R.id.gy4).getContext();
        LJFF.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.gy4);
        C16880lQ.LLJJJ(LJFF);
        C73156SnQ.LJIIIIZZ(this, xl(), new TBV() { // from class: X.Sew
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getOnboardingStepState();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setOnboardingStepState((C72626Ses) obj2);
            }
        }, new AqS194S0100000_12(this, 185));
        C73156SnQ.LJIIIIZZ(this, xl(), new TBV() { // from class: X.Sf2
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getStarterAvatarList();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setStarterAvatarList((List) obj2);
            }
        }, new AqS194S0100000_12(this, 186));
        if (xl().Hv0(this).getStarterAvatarList() == null) {
            ProfileNaviOnboardingViewModel xl = xl();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null || (preferences = mo49getActivity.getPreferences(0)) == null) {
                return;
            }
            xl.getClass();
            xl.LJLJLJ = preferences;
            C53247Kv5.LIZ.getClass();
            if (!preferences.getBoolean("profile_navi_onboarding_tutorial_shown", C53247Kv5.LIZIZ)) {
                xl.setState(C72641Sf7.LJLIL);
                xl.LJLJL.removeCallbacksAndMessages(null);
                xl.LJLJL.postDelayed(new ARunnableS48S0100000_12(xl, 73), xl.LJLJJLL);
                return;
            }
            xl.Mv0();
        }
    }

    @Override // X.InterfaceC72613Sef
    public final void vc() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    ProfileNaviOnboardingViewModel xl = xl();
                    xl.setStateImmediate(C69601RTh.LJLIL);
                    xl.setStateImmediate(C69602RTi.LJLIL);
                    return;
                }
            } catch (Exception unused) {
            }
            C40328FsC.LIZLLL(mo49getActivity, R.string.im9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C53246Kv4.LIZIZ == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean wl() {
        /*
            r1 = this;
            com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel r0 = r1.xl()
            X.2at r0 = r0.Hv0(r1)
            com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState r0 = (com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState) r0
            boolean r0 = r0.getShouldShowAutoCreation()
            if (r0 == 0) goto L19
            X.Kv4 r0 = X.C53246Kv4.LIZ
            r0.getClass()
            boolean r0 = X.C53246Kv4.LIZIZ
            if (r0 != 0) goto L22
        L19:
            X.Kv3 r0 = X.C53245Kv3.LIZ
            r0.getClass()
            boolean r0 = X.C53245Kv3.LIZIZ
            if (r0 == 0) goto L24
        L22:
            r0 = 1
        L23:
            return r0
        L24:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.view.onboarding.ProfileNaviOnboardingFragment.wl():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r3 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Al(java.util.List<X.RTR> r9) {
        /*
            r8 = this;
            r6 = 2131371921(0x7f0a2791, float:1.836389E38)
            android.view.View r0 = r8._$_findCachedViewById(r6)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.09q r0 = r0.getAdapter()
            boolean r0 = r0 instanceof X.C72610Sec
            if (r0 == 0) goto L24
            android.view.View r0 = r8._$_findCachedViewById(r6)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.09q r3 = r0.getAdapter()
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.view.adapter.ProfileNaviStarterAvatarListAdapter"
            kotlin.jvm.internal.o.LJII(r3, r0)
            X.Sec r3 = (X.C72610Sec) r3
            if (r3 != 0) goto Lb1
        L24:
            X.Sec r3 = new X.Sec
            r5 = 1
            r3.<init>(r8, r5)
            android.view.View r1 = r8._$_findCachedViewById(r6)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r4 = 2
            if (r1 != 0) goto Lc1
        L33:
            android.view.View r7 = r8._$_findCachedViewById(r6)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L4f
            X.4kX r2 = new X.4kX
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131166345(0x7f070489, float:1.7946933E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.<init>(r0)
            r0 = -1
            r7.LJII(r2, r0)
        L4f:
            android.view.View r0 = r8._$_findCachedViewById(r6)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            if (r0 != 0) goto Lbd
        L57:
            android.view.View r2 = r8._$_findCachedViewById(r6)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L69
            Y.IDrS50S0100000_12 r1 = new Y.IDrS50S0100000_12
            r0 = 8
            r1.<init>(r8, r0)
            r2.LJIIJJI(r1)
        L69:
            X.1qj r0 = r8.mo49getActivity()
            if (r0 == 0) goto Lb1
            int r0 = X.C63081OpJ.LJJJJJL(r0)
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            float[] r1 = new float[r4]
            float r0 = (float) r0
            r4 = 0
            r1[r4] = r0
            r0 = 0
            r1[r5] = r0
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r1)
            java.lang.String r0 = "ofFloat(TRANSLATION_Y, height.toFloat(), 0f)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            android.view.View r1 = r8._$_findCachedViewById(r6)
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r5]
            r0[r4] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r1, r0)
            java.lang.String r0 = "ofPropertyValuesHolder(n…g_recycler_view, holderY)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.setDuration(r0)
            Y.IDAListenerS79S0100000_12 r1 = new Y.IDAListenerS79S0100000_12
            r0 = 6
            r1.<init>(r8, r0)
            r2.addListener(r1)
            r2.start()
        Lb1:
            r3.LJLILLLLZI = r9
            boolean r0 = r8.wl()
            r3.LJLJJI = r0
            r3.notifyDataSetChanged()
            return
        Lbd:
            r0.setAdapter(r3)
            goto L57
        Lc1:
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r8.mo49getActivity()
            r0.<init>(r4)
            r1.setLayoutManager(r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.view.onboarding.ProfileNaviOnboardingFragment.Al(java.util.List):void");
    }

    public final void Gl(boolean z) {
        if (z) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f - ((Number) this.LJLILLLLZI.getValue()).floatValue(), 0.0f);
            o.LJIIIIZZ(ofFloat, "ofFloat(TRANSLATION_Y, 0…TOP_TITLE_BAR_HEIGHT, 0f)");
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(_$_findCachedViewById(R.id.i9c), ofFloat);
            o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(p…i_top_title_bar, holderY)");
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(200L);
            ofPropertyValuesHolder.addListener(new IDAListenerS79S0100000_12(this, 3));
            ofPropertyValuesHolder.start();
            return;
        }
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, 0.0f - ((Number) this.LJLILLLLZI.getValue()).floatValue());
        o.LJIIIIZZ(ofFloat2, "ofFloat(TRANSLATION_Y, 0…f - TOP_TITLE_BAR_HEIGHT)");
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(_$_findCachedViewById(R.id.i9c), ofFloat2);
        o.LJIIIIZZ(ofPropertyValuesHolder2, "ofPropertyValuesHolder(p…i_top_title_bar, holderY)");
        ofPropertyValuesHolder2.setInterpolator(new AccelerateInterpolator());
        ofPropertyValuesHolder2.setDuration(200L);
        ofPropertyValuesHolder2.addListener(new IDAListenerS79S0100000_12(this, 4));
        ofPropertyValuesHolder2.start();
    }

    @Override // X.InterfaceC72613Sef
    public final void e5(RTR starterAvatar) {
        o.LJIIIZ(starterAvatar, "starterAvatar");
        C72604SeW.LIZIZ(String.valueOf(starterAvatar.LIZ()));
        ProfileNaviOnboardingViewModel xl = xl();
        xl.getClass();
        xl.setState(new AqS178S0100000_12(starterAvatar, 411));
    }

    public static void vl(TuxTextView tuxTextView, String str) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, -50.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(TRANSLATION_X, -50f)");
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(ALPHA, 0f)");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxTextView, ofFloat, ofFloat2);
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(view, holderX, holderAlpha)");
        ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.addListener(new C30032BqW(tuxTextView, str));
        ofPropertyValuesHolder.start();
    }

    public final void Dl(String str, String str2) {
        vl((TuxTextView) _$_findCachedViewById(R.id.gy1), str);
        vl((TuxTextView) _$_findCachedViewById(R.id.gy2), str2);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", C72604SeW.LIZ);
        FMX.LJIIL("show_avatar_edit_page", c188727au.LIZ);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c7b, viewGroup, false);
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
