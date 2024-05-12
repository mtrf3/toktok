package com.ss.android.ugc.aweme.favorites.business;

import X.AbstractC186377Td;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C0C3;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C178456zR;
import X.C193507ic;
import X.C213388Za;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C55230Lly;
import X.C55247LmF;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C73411SrX;
import X.C76800UCe;
import X.C7VM;
import X.C80672VlM;
import X.C80674VlO;
import X.C80675VlP;
import X.C84364X9c;
import X.C8Z6;
import X.C8Z9;
import X.C8ZC;
import X.C90903hW;
import X.GFS;
import X.HT5;
import X.InterfaceC55235Lm3;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.OGG;
import X.VW3;
import Y.ARunnableS39S0100000_3;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class FavoritesFragment extends AmeBaseFragment implements C0C3, OGG, JBS {
    public String LJLIL;
    public C80675VlP LJLILLLLZI;
    public VW3 LJLJI;
    public C8ZC LJLJJI;
    public final C62822Ol8 LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public Long LJLJLLL;

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBackPressed_Activity() {
        JBR.LIZIZ(this);
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public FavoritesFragment() {
        this(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ProfileListFragment profileListFragment;
        C178456zR.LIZ = this.LJLIL;
        super.onResume();
        FavoritesPagerAdapter vl = vl();
        int i = this.LJLJJLL;
        vl.LJJIJIIJI(i);
        if (i >= 1 && i < ((ArrayList) vl.LJLJLLL).size()) {
            Object obj = ListProtector.get(vl.LJJIIJZLJL(), i);
            if ((obj instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) obj) != null) {
                profileListFragment.Dl(true);
            }
        }
        if (!this.LJLJL) {
            VW3 vw3 = this.LJLJI;
            if (vw3 != null) {
                C84364X9c.LIZ(vw3, C213388Za.LJLIL);
                this.LJLJL = true;
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
    }

    public final FavoritesPagerAdapter vl() {
        return (FavoritesPagerAdapter) this.LJLJJL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.OGG
    public final View LJIJJ() {
        if (getHost() == null) {
            return null;
        }
        FavoritesPagerAdapter vl = vl();
        Fragment fragment = (Fragment) ListProtector.get(vl.LJJIIJZLJL(), this.LJLJJLL);
        if (fragment instanceof OGG) {
            return ((OGG) fragment).LJIJJ();
        }
        return C8Z6.LIZ(fragment.getView());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C8ZC c8zc = this.LJLJJI;
        if (c8zc != null) {
            C73411SrX c73411SrX = c8zc.LIZJ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            ((LinkedHashMap) c8zc.LIZLLL).clear();
            C16970lZ.LJII(R.layout.av1);
            return;
        }
        o.LJIJI("tabCountHelper");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        HT5.LIZ = false;
        HT5.LIZIZ = -1;
    }

    public FavoritesFragment(Boolean bool) {
        new LinkedHashMap();
        this.LJLIL = "personal_homepage";
        this.LJLJJL = C221108m2.LIZIZ(new AqS150S0200000_3(this, bool, 25));
    }

    @Override // X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        Intent intent;
        ActivityC86117Xqz activityC86117Xqz;
        String str = null;
        if ((activity instanceof ActivityC86117Xqz) && (activityC86117Xqz = (ActivityC86117Xqz) activity) != null) {
            C61713OJx LIZJ = C61712OJw.LIZJ(activityC86117Xqz);
            LIZJ.LJII(R.attr.cl);
            LIZJ.LIZJ();
            activityC86117Xqz.activityConfiguration(GFS.LJLIL);
        }
        if (activity != null && (intent = activity.getIntent()) != null) {
            str = intent.hasExtra("enter_from") ? C16880lQ.LLJJIJIIJIL(intent, "enter_from") : "h5";
        }
        this.LJLIL = str;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        C80672VlM c80672VlM;
        LinearLayout.LayoutParams layoutParams;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C80675VlP c80675VlP = this.LJLILLLLZI;
        if (c80675VlP == null) {
            return;
        }
        int tabCount = c80675VlP.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            C80675VlP c80675VlP2 = this.LJLILLLLZI;
            if (c80675VlP2 != null) {
                C80674VlO LJIIJ = c80675VlP2.LJIIJ(i);
                if (LJIIJ != null && (c80672VlM = LJIIJ.LJIIIIZZ) != null) {
                    ViewGroup.LayoutParams layoutParams2 = c80672VlM.getLayoutParams();
                    if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.width = -2;
                        c80672VlM.setLayoutParams(layoutParams);
                    }
                }
            } else {
                o.LJIJI("tabLayout");
                throw null;
            }
        }
        C80675VlP c80675VlP3 = this.LJLILLLLZI;
        if (c80675VlP3 != null) {
            c80675VlP3.postDelayed(new ARunnableS39S0100000_3(this, 47), 300L);
        } else {
            o.LJIJI("tabLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        getLifecycle().addObserver(vl());
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        if (getParentFragment() != null) {
            z = true;
        } else {
            z = false;
        }
        C55247LmF.LIZIZ(LIZJ, new C7VM(z), C7VM.class, "source_default_key");
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C8Z9 c8z9;
        ProfileListFragment profileListFragment;
        if (i < 0 || i >= vl().getCount()) {
            return;
        }
        FavoritesPagerAdapter vl = vl();
        int i2 = this.LJLJJLL;
        if (i2 != i) {
            ((AbstractC186377Td) ListProtector.get(vl.LJLJLLL, i)).LJ(true);
            ((AbstractC186377Td) ListProtector.get(vl.LJLJLLL, i2)).LJ(false);
        }
        vl.LJJIJIIJI(i);
        if (i >= 1 && i < ((ArrayList) vl.LJLJLLL).size()) {
            Object obj = ListProtector.get(vl.LJJIIJZLJL(), i);
            if ((obj instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) obj) != null && profileListFragment.LJJ()) {
                profileListFragment.LJJJJ();
            }
            Object obj2 = ListProtector.get(vl.LJJIIJZLJL(), i);
            if ((obj2 instanceof C8Z9) && (c8z9 = (C8Z9) obj2) != null) {
                c8z9.LJJIJL();
            }
        }
        this.LJLJJLL = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r25 != false) goto L23;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setUserVisibleHint(boolean r25) {
        /*
            r24 = this;
            X.0Dg r7 = new X.0Dg
            r2 = 2
            r7.<init>(r2)
            r1 = 1
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r3 = r25
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r15 = 0
            r12[r15] = r0
            X.Pk0 r14 = new X.Pk0
            java.lang.String r4 = "(Z)V"
            java.lang.String r0 = "7675170293297602039"
            r14.<init>(r15, r4, r0)
            r8 = 10502(0x2906, float:1.4716E-41)
            java.lang.String r18 = "com/ss/android/ugc/aweme/favorites/business/FavoritesFragment"
            java.lang.String r19 = "setUserVisibleHint"
            java.lang.String r22 = "void"
            r13 = r24
            r16 = r7
            r17 = r8
            r20 = r13
            r21 = r12
            r23 = r14
            X.Ff9 r0 = r16.LIZJ(r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L40
            r11 = 0
            java.lang.String r9 = "com/ss/android/ugc/aweme/favorites/business/FavoritesFragment"
            java.lang.String r10 = "setUserVisibleHint"
            r7.LIZIZ(r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L40:
            if (r3 == 0) goto L46
            java.lang.String r0 = r13.LJLIL
            X.C178456zR.LIZ = r0
        L46:
            super.setUserVisibleHint(r3)
            java.lang.Object r0 = r13.getHost()
            if (r0 == 0) goto L70
            com.ss.android.ugc.aweme.favorites.business.FavoritesPagerAdapter r0 = r13.vl()
            java.util.List<X.7Td> r0 = r0.LJLJLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
        L5b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r4.next()
            X.7Td r0 = (X.AbstractC186377Td) r0
            if (r3 != 0) goto L6c
            r0.LJ(r15)
        L6c:
            r0.LIZLLL(r3)
            goto L5b
        L70:
            java.lang.Object r0 = r13.getHost()
            java.lang.String r6 = "viewPager"
            r4 = 0
            if (r0 == 0) goto Lc7
            if (r3 == 0) goto Lca
            X.OSZ[] r5 = new X.OSZ[r2]
            X.OSZ r3 = new X.OSZ
            java.lang.String r2 = "personal_homepage"
            java.lang.String r0 = "enter_from"
            r3.<init>(r2, r0)
            r5[r15] = r3
            com.ss.android.ugc.aweme.favorites.business.FavoritesPagerAdapter r2 = r13.vl()
            X.VW3 r0 = r13.LJLJI
            if (r0 == 0) goto Ld9
            int r0 = r0.getCurrentItem()
            java.lang.String r3 = r2.LJJIIZ(r0)
            X.OSZ r2 = new X.OSZ
            java.lang.String r0 = "tab_name"
            r2.<init>(r3, r0)
            r5[r1] = r2
            java.lang.String r0 = "enter_personal_favourite"
            X.FMX.LJIILL(r0, r5)
        La6:
            java.lang.Long r0 = r13.LJLJLLL
            boolean r0 = X.C8ZN.LIZ(r0)
            if (r0 == 0) goto Lb7
            X.VW3 r0 = r13.LJLJI
            if (r0 == 0) goto Ld5
            r0.setCurrentItem(r15, r15)
            r13.LJLJLLL = r4
        Lb7:
            r6 = 0
            r3 = 10502(0x2906, float:1.4716E-41)
            java.lang.String r4 = "com/ss/android/ugc/aweme/favorites/business/FavoritesFragment"
            java.lang.String r5 = "setUserVisibleHint"
            r2 = r7
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r1
            r2.LIZIZ(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        Lc7:
            if (r3 == 0) goto Lca
            goto La6
        Lca:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r13.LJLJLLL = r0
            goto Lb7
        Ld5:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r4
        Ld9:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.FavoritesFragment.setUserVisibleHint(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.FavoritesFragment.onViewCreated(android.view.View, android.os.Bundle):void");
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
