package com.ss.android.ugc.aweme.favorites.business;

import X.AbstractC186377Td;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0C3;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C178456zR;
import X.C193507ic;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C73411SrX;
import X.C73969T1h;
import X.C76800UCe;
import X.C80675VlP;
import X.C84364X9c;
import X.C8Z3;
import X.C8Z6;
import X.C8Z8;
import X.C8Z9;
import X.C90903hW;
import X.FMX;
import X.HT5;
import X.InterfaceC64592gB;
import X.OGG;
import X.OSZ;
import X.T16;
import X.VW3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FavoritesFragmentOtherProfile extends AmeBaseFragment implements C0C3, OGG {
    public final String LJLIL;
    public C80675VlP LJLILLLLZI;
    public VW3 LJLJI;
    public final C62822Ol8 LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public C73411SrX LJLJL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public FavoritesFragmentOtherProfile() {
        new LinkedHashMap();
        this.LJLIL = "others_homepage";
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 228));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ProfileListFragment profileListFragment;
        C178456zR.LIZ = this.LJLIL;
        super.onResume();
        FavoritesPagerAdapterOtherProfile vl = vl();
        int i = this.LJLJJL;
        vl.LJJIIZI(i);
        if (i >= 1 && i < ((ArrayList) vl.LJLJLJ).size()) {
            Object obj = ListProtector.get(vl.LJJIIJZLJL(), i);
            if ((obj instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) obj) != null) {
                profileListFragment.Dl(true);
            }
        }
        if (!this.LJLJJLL) {
            VW3 vw3 = this.LJLJI;
            if (vw3 != null) {
                C84364X9c.LIZ(vw3, C8Z8.LJLIL);
                this.LJLJJLL = true;
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
    }

    public final FavoritesPagerAdapterOtherProfile vl() {
        return (FavoritesPagerAdapterOtherProfile) this.LJLJJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.OGG
    public final View LJIJJ() {
        if (getHost() == null) {
            return null;
        }
        FavoritesPagerAdapterOtherProfile vl = vl();
        int i = this.LJLJJL;
        if (((ArrayList) vl.LJJIIJZLJL()).isEmpty()) {
            return null;
        }
        Fragment fragment = (Fragment) ListProtector.get(vl.LJJIIJZLJL(), i);
        if (fragment instanceof OGG) {
            return ((OGG) fragment).LJIJJ();
        }
        return C8Z6.LIZ(fragment.getView());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C73411SrX c73411SrX = this.LJLJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C16970lZ.LJII(R.layout.av1);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        HT5.LIZ = false;
        HT5.LIZIZ = -1;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().addObserver(vl());
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C8Z9 c8z9;
        ProfileListFragment profileListFragment;
        if (i < 0 || i >= vl().getCount()) {
            return;
        }
        FavoritesPagerAdapterOtherProfile vl = vl();
        int i2 = this.LJLJJL;
        ((AbstractC186377Td) ListProtector.get(vl.LJLJLJ, i)).LJ(true);
        ((AbstractC186377Td) ListProtector.get(vl.LJLJLJ, i2)).LJ(false);
        vl.LJJIIZI(i);
        if (i >= 1 && i < ((ArrayList) vl.LJLJLJ).size()) {
            Object obj = ListProtector.get(vl.LJJIIJZLJL(), i);
            if ((obj instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) obj) != null && profileListFragment.LJJ()) {
                profileListFragment.LJJJJ();
            }
            Object obj2 = ListProtector.get(vl.LJJIIJZLJL(), i);
            if ((obj2 instanceof C8Z9) && (c8z9 = (C8Z9) obj2) != null) {
                c8z9.LJJIJL();
            }
        }
        this.LJLJJL = i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "7950554542494451728");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/favorites/business/FavoritesFragmentOtherProfile", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/favorites/business/FavoritesFragmentOtherProfile", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (z) {
            C178456zR.LIZ = this.LJLIL;
        }
        super.setUserVisibleHint(z);
        if (getHost() != null) {
            Iterator it = ((ArrayList) vl().LJLJLJ).iterator();
            while (it.hasNext()) {
                AbstractC186377Td abstractC186377Td = (AbstractC186377Td) it.next();
                if (!z) {
                    abstractC186377Td.LJ(false);
                }
                abstractC186377Td.LIZLLL(z);
            }
        }
        if (getHost() != null && z && vl().getCount() > 0) {
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ("others_homepage", "enter_from");
            FavoritesPagerAdapterOtherProfile vl = vl();
            VW3 vw3 = this.LJLJI;
            if (vw3 != null) {
                oszArr[1] = new OSZ(vl.LJJIIZ(vw3.getCurrentItem()), "tab_name");
                FMX.LJIILL("enter_personal_favourite", oszArr);
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/favorites/business/FavoritesFragmentOtherProfile", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.l_2).setVisibility(8);
        View findViewById = view.findViewById(R.id.kyt);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tab_layout)");
        C80675VlP c80675VlP = (C80675VlP) findViewById;
        this.LJLILLLLZI = c80675VlP;
        c80675VlP.setVisibility(8);
        View findViewById2 = view.findViewById(R.id.ncx);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.viewpager)");
        VW3 vw3 = (VW3) findViewById2;
        this.LJLJI = vw3;
        vw3.setBackground(null);
        C80675VlP c80675VlP2 = this.LJLILLLLZI;
        if (c80675VlP2 != null) {
            c80675VlP2.setBackground(null);
            FavoriteTabCountApi.LIZ.getClass();
            FavoriteTabCountApi LIZ = C8Z3.LIZ();
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("ownerUid")) != null) {
                this.LJLJL = (C73411SrX) LIZ.getTabCountsForOtherProfile(string).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(new InterfaceC64592gB() { // from class: X.8Z0
                    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e4, code lost:
                    
                        if (r1 <= 1) goto L12;
                     */
                    @Override // X.InterfaceC64592gB
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r13) {
                        /*
                            Method dump skipped, instructions count: 562
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C8Z0.accept(java.lang.Object):void");
                    }
                }).LJJJLIIL(new InterfaceC64592gB() { // from class: X.8Z4
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }, new InterfaceC64592gB() { // from class: X.8Z5
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        o.LJIJI("tabLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        if (C193507ic.LIZ()) {
            LLLLIILL = C16970lZ.LIZJ(R.layout.av1, mo49getActivity(), viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.av1, viewGroup, false);
        }
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
