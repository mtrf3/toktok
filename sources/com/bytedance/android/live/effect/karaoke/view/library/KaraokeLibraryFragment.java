package com.bytedance.android.live.effect.karaoke.view.library;

import X.ActivityC45651qj;
import X.AnonymousClass064;
import X.C03880Dg;
import X.C0K4;
import X.C0K5;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C21180sM;
import X.C21210sP;
import X.C221108m2;
import X.C29306Beo;
import X.C29S;
import X.C2B1;
import X.C2B3;
import X.C3C5;
import X.C47071t1;
import X.C47231tH;
import X.C47241tI;
import X.C47251tJ;
import X.C47261tK;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC32901Qw;
import X.V10;
import X.XKX;
import Y.IDCListenerS370S0100000;
import Y.IDObjectS173S0100000;
import Y.IDcS169S0100000;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class KaraokeLibraryFragment extends BaseFragment implements InterfaceC32901Qw {
    public LiveEditText LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public ConstraintLayout LJLJL;
    public C0K5 LJLJLJ;
    public KaraokeViewModel LJLLI;
    public DataChannel LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C47231tH.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C47241tI.LJLIL);
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C47251tJ.LJLIL);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(C47261tK.LJLIL);

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    public final KaraokePageFragment vl() {
        return (KaraokePageFragment) this.LJLLILLLL.getValue();
    }

    public final void wl() {
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJIILLIIL(R.string.jvx);
        c47071t1.LJFF(R.string.jvv);
        c47071t1.LJIIIZ(R.string.jws, new IDcS169S0100000(this, 15));
        c47071t1.LJIIL(R.string.jvw, new IDcS169S0100000(this, 16));
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-6935801188476917491")).LIZ) {
            LIZ.show();
        }
        C21180sM.LIZJ(this.LJLLL, "click_quit");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-6935801188476917491");
        if (c03880Dg.LIZJ(10501, "com/bytedance/android/live/effect/karaoke/view/library/KaraokeLibraryFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/android/live/effect/karaoke/view/library/KaraokeLibraryFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (vl().isAdded()) {
            vl().onHiddenChanged(z);
        }
        c03880Dg.LIZIZ(10501, "com/bytedance/android/live/effect/karaoke/view/library/KaraokeLibraryFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLLL = C51029K0z.LJIILIIL(this);
        View findViewById = view.findViewById(R.id.jef);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.search_box)");
        this.LJLIL = (LiveEditText) findViewById;
        View findViewById2 = view.findViewById(R.id.jg0);
        findViewById2.setAlpha(0.34f);
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = view.findViewById(R.id.jeo);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.search_clear_icon)");
        this.LJLJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.bfj);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.close_button)");
        this.LJLJJI = findViewById4;
        View findViewById5 = view.findViewById(R.id.bfn);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.close_guide)");
        this.LJLJJL = findViewById5;
        View findViewById6 = view.findViewById(R.id.aej);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.back_btn)");
        this.LJLJJLL = findViewById6;
        View findViewById7 = view.findViewById(R.id.fqd);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.library_container)");
        this.LJLJL = (ConstraintLayout) findViewById7;
        View findViewById8 = view.findViewById(R.id.ke8);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.state_view)");
        this.LJLJLJ = (C0K5) findViewById8;
        LiveEditText liveEditText = this.LJLIL;
        if (liveEditText != null) {
            liveEditText.setOnFocusChangeListener(new IDCListenerS370S0100000(this, 2));
            LiveEditText liveEditText2 = this.LJLIL;
            if (liveEditText2 != null) {
                liveEditText2.addTextChangedListener(new IDObjectS173S0100000(this, 1));
                View view2 = this.LJLJJI;
                if (view2 != null) {
                    C29306Beo.LJJJLL(view2, 500L, new IDqS416S0100000(this, 96));
                    View view3 = this.LJLJJL;
                    if (view3 != null) {
                        C29306Beo.LJJJLL(view3, 500L, new IDqS416S0100000(this, 97));
                        View view4 = this.LJLJI;
                        if (view4 != null) {
                            C29306Beo.LJJJLL(view4, 500L, new IDqS416S0100000(this, 98));
                            View view5 = this.LJLJJLL;
                            if (view5 != null) {
                                C29306Beo.LJJJLL(view5, 500L, new IDqS416S0100000(this, 99));
                                AnonymousClass064 anonymousClass064 = (AnonymousClass064) this.LJLJLLL.getValue();
                                ConstraintLayout constraintLayout = this.LJLJL;
                                if (constraintLayout != null) {
                                    anonymousClass064.LJII(constraintLayout);
                                    AnonymousClass064 anonymousClass0642 = (AnonymousClass064) this.LJLL.getValue();
                                    ConstraintLayout constraintLayout2 = this.LJLJL;
                                    if (constraintLayout2 != null) {
                                        anonymousClass0642.LJII(constraintLayout2);
                                        C0K5 c0k5 = this.LJLJLJ;
                                        if (c0k5 != null) {
                                            c0k5.LJI();
                                            C0K5 c0k52 = this.LJLJLJ;
                                            if (c0k52 != null) {
                                                c0k52.setErrorClickListener(new C0K4() { // from class: X.1Hq
                                                    @Override // X.C0K4
                                                    public final void LIZIZ() {
                                                        KaraokeLibraryFragment karaokeLibraryFragment = KaraokeLibraryFragment.this;
                                                        karaokeLibraryFragment.getClass();
                                                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(karaokeLibraryFragment), null, null, new C2B3(karaokeLibraryFragment, null), 3);
                                                    }
                                                });
                                                if (C29306Beo.LJIIL(this.LJLLL)) {
                                                    View view6 = this.LJLJJI;
                                                    if (view6 != null) {
                                                        C29306Beo.LJI(view6);
                                                        View view7 = this.LJLJJL;
                                                        if (view7 != null) {
                                                            C29306Beo.LJI(view7);
                                                        } else {
                                                            o.LJIJI("closeGuide");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("closeBtn");
                                                        throw null;
                                                    }
                                                }
                                                this.LJLLI = C21210sP.LIZJ(C51029K0z.LJIILIIL(this));
                                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2B1(this, null), 3);
                                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2B3(this, null), 3);
                                                return;
                                            }
                                            o.LJIJI("stateView");
                                            throw null;
                                        }
                                        o.LJIJI("stateView");
                                        throw null;
                                    }
                                    o.LJIJI("container");
                                    throw null;
                                }
                                o.LJIJI("container");
                                throw null;
                            }
                            o.LJIJI("backBtn");
                            throw null;
                        }
                        o.LJIJI("clearSearchBtn");
                        throw null;
                    }
                    o.LJIJI("closeGuide");
                    throw null;
                }
                o.LJIJI("closeBtn");
                throw null;
            }
            o.LJIJI("searchBox");
            throw null;
        }
        o.LJIJI("searchBox");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d_3, viewGroup, false);
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
}
