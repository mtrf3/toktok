package com.ss.android.ugc.aweme.profile.ui;

import X.AV1;
import X.AbstractC51036K1g;
import X.AnonymousClass636;
import X.C03880Dg;
import X.C118804lQ;
import X.C16880lQ;
import X.C221018lt;
import X.C235779Nd;
import X.C26045AKb;
import X.C26360AWe;
import X.C2RZ;
import X.C34172Db6;
import X.C38306F1q;
import X.C38333F2r;
import X.C39687Fhr;
import X.C40443Fu3;
import X.C51031K1b;
import X.C52975Kqh;
import X.C53230Kuo;
import X.C54293LSn;
import X.C55703Ltb;
import X.C56477MEn;
import X.C56483MEt;
import X.C56490MFa;
import X.C65300Pk0;
import X.C73098SmU;
import X.C73305Spp;
import X.C73306Spq;
import X.C79045V0n;
import X.C80896Voy;
import X.C87030YDq;
import X.EnumC80902Vp4;
import X.InterfaceC55057LjB;
import X.KL2;
import X.L14;
import X.MEX;
import X.MF3;
import X.MFB;
import X.MFC;
import X.MFQ;
import X.TBT;
import Y.AObjectS147S0100000_9;
import Y.AObjectS45S0101000_13;
import Y.IDTListenerS118S0100000_9;
import Y.IDrS48S0100000_9;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;

/* loaded from: classes10.dex */
public class MTAwemeListFragment extends AwemeListFragmentImpl {
    public static final /* synthetic */ int LLLLIIIILLL = 0;
    public C56477MEn LLLJL;
    public C80896Voy LLLL;
    public C2RZ LLLLII;

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl
    public final int Ql() {
        return R.layout.c4_;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl
    public final void Cm() {
        int i;
        C73306Spq c73306Spq;
        if (this.LJLLILLLL) {
            int i2 = this.LJLL;
            if (i2 == 0) {
                i = R.string.g3a;
            } else if (i2 == 1) {
                if (!AV1.LJIIJJI()) {
                    C54293LSn c54293LSn = C235779Nd.LIZ;
                    if (!c54293LSn.LJIIIZ().LIZ().booleanValue()) {
                        i = R.string.gzn;
                    } else if (c54293LSn.LJIIJJI().LIZ().intValue() == 0) {
                        i = R.string.hs1;
                    } else {
                        i = R.string.hs2;
                    }
                }
                i = R.string.ik2;
            } else {
                if (i2 == 2) {
                    i = R.string.rsk;
                }
                i = R.string.ik2;
            }
        } else if (this.LJLL == 0) {
            i = R.string.tja;
        } else {
            i = R.string.tj4;
        }
        if (this.LJLLILLLL) {
            if (this.LJLL == 1) {
                if (AV1.LJIIJJI()) {
                    c73306Spq = new C73306Spq();
                    c73306Spq.LIZIZ(getContext().getString(i));
                } else if (C235779Nd.LIZ.LJIIJJI().LIZ().intValue() == 0) {
                    c73306Spq = new C73306Spq();
                    c73306Spq.LIZJ(getContext().getString(R.string.pf2));
                    c73306Spq.LIZIZ(getContext().getString(R.string.pf9));
                } else {
                    c73306Spq = Il(getContext());
                }
            } else {
                if (this.LJLL == 14) {
                    c73306Spq = new C73306Spq();
                    c73306Spq.LIZJ(getContext().getString(R.string.pax));
                    c73306Spq.LIZIZ(getContext().getString(R.string.pez));
                }
                c73306Spq = new C73306Spq();
                c73306Spq.LIZIZ(getContext().getString(i));
            }
        } else if (this.LJLL == 1) {
            if (AV1.LJIIJJI()) {
                c73306Spq = new C73306Spq();
                c73306Spq.LIZIZ(getContext().getString(i));
            } else {
                c73306Spq = new C73306Spq();
                c73306Spq.LIZJ(getContext().getString(R.string.pf2));
                c73306Spq.LIZIZ(C16880lQ.LLLZ(getContext().getString(R.string.pen), new Object[]{AV1.LIZLLL(this.LJLJJL)}));
            }
        } else {
            if (this.LJLL == 0 && !AV1.LJIIJJI() && C34172Db6.LIZ()) {
                c73306Spq = new C73306Spq();
                c73306Spq.LIZJ(getContext().getString(R.string.pek));
                c73306Spq.LIZIZ(getContext().getString(R.string.pej));
            }
            c73306Spq = new C73306Spq();
            c73306Spq.LIZIZ(getContext().getString(i));
        }
        this.LLILII = c73306Spq;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getContext().getString(R.string.hvg));
        spannableStringBuilder.setSpan(new MF3(this), 0, spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.go, getContext())), 0, spannableStringBuilder.length(), 18);
        C73306Spq c73306Spq2 = new C73306Spq();
        c73306Spq2.LJI = spannableStringBuilder;
        this.LLILIL = c73306Spq2;
    }

    public final void Tm() {
        if (this.LLIILZL != -1) {
            Xm();
            return;
        }
        C51031K1b<AbstractC51036K1g> c51031K1b = this.LJZL;
        if (c51031K1b == null) {
            return;
        }
        c51031K1b.LJIILL(6, Boolean.FALSE, this.LJLJJLL, Integer.valueOf(this.LJLL), Integer.valueOf(LiveNetAdaptiveHurryTimeSetting.DEFAULT), this.LJLJLJ, this.LLJJIJIIJIL);
    }

    public final void Xm() {
        int i;
        WrapGridLayoutManager wrapGridLayoutManager = this.LJZI;
        if (wrapGridLayoutManager != null && this.LLIILZL != -1) {
            int LLILL = wrapGridLayoutManager.LLILL();
            int LLILLJJLI = this.LJZI.LLILLJJLI();
            Rect rect = new Rect();
            while (LLILLJJLI >= 0) {
                View LJJIJIL = this.LJZI.LJJIJIL(LLILLJJLI);
                if (LJJIJIL == null || LJJIJIL.getGlobalVisibleRect(rect)) {
                    break;
                } else {
                    LLILLJJLI--;
                }
            }
            int i2 = this.LLIILZL;
            if (i2 < LLILL) {
                View LJJIJIL2 = this.LJZI.LJJIJIL(LLILL);
                int top = this.LJZI.LJJIJIL(Sl() + LLILL).getTop() - LJJIJIL2.getBottom();
                Rect LIZJ = C73098SmU.LIZJ(LJJIJIL2);
                int Sl = ((LLILL / Sl()) - (this.LLIILZL / Sl())) + 1;
                int height = ((Sl + 1) * top) + (LJJIJIL2.getHeight() * Sl) + (LJJIJIL2.getHeight() - LIZJ.height());
                zm(true);
                this.LJLLLLLL.LJLIIIL(0, -height);
                return;
            }
            if (i2 <= LLILLJJLI) {
                return;
            }
            View LJJIJIL3 = this.LJZI.LJJIJIL(LLILL);
            while (LJJIJIL3 != null && LLILL < this.LLIILZL && LLILL <= 150 && !(LJJIJIL3 instanceof FixedRatioFrameLayout)) {
                LLILL++;
                LJJIJIL3 = this.LJZI.LJJIJIL(LLILL);
            }
            View LJJIJIL4 = this.LJZI.LJJIJIL(LLILL);
            View LJJIJIL5 = this.LJZI.LJJIJIL(Sl() + LLILL);
            if (LJJIJIL4 == null || LJJIJIL5 == null) {
                return;
            }
            int top2 = LJJIJIL5.getTop() - LJJIJIL4.getBottom();
            Rect LIZJ2 = C73098SmU.LIZJ(LJJIJIL4);
            if (LJJIJIL4.getTop() > 0) {
                i = LJJIJIL4.getTop();
            } else {
                i = 0;
            }
            int Sl2 = ((this.LLIILZL / Sl()) - (LLILL / Sl())) - 2;
            int height2 = ((Sl2 + 1) * top2) + (LJJIJIL4.getHeight() * Sl2) + LIZJ2.height() + i;
            this.LLIIJLIL.LIZ();
            zm(true);
            this.LJLLLLLL.LJLIIIL(0, height2);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl
    public final void initData() {
        C56490MFa c56490MFa;
        EnumC80902Vp4 enumC80902Vp4;
        C80896Voy c80896Voy = this.LLLL;
        if (c80896Voy != null) {
            if (C26360AWe.LIZ()) {
                enumC80902Vp4 = EnumC80902Vp4.ONLY_BOTTOM;
            } else {
                enumC80902Vp4 = EnumC80902Vp4.NONE;
            }
            c80896Voy.setOverScrollMode(enumC80902Vp4);
        }
        this.LJLLLLLL.setOverScrollMode(2);
        mo49getActivity();
        boolean z = true;
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(Sl(), 1, false);
        this.LJZI = wrapGridLayoutManager;
        this.LJLLLLLL.setLayoutManager(wrapGridLayoutManager);
        this.LJLLLLLL.LJII(new C118804lQ((int) KL2.LIZJ(getContext(), 1.0f)), -1);
        if (!C16880lQ.LLLZLL()) {
            c56490MFa = new C56490MFa();
            this.LJLLLLLL.LJIIJJI(c56490MFa);
        } else {
            c56490MFa = null;
        }
        this.LLLIIL = new MFQ(this.LJLLLLLL, c56490MFa);
        if (L14.LIZ() && !this.LJLLILLLL && this.LJLL == 0) {
            this.LJLLLLLL.LJIIJJI(new IDrS48S0100000_9(this, 4));
        }
        C53230Kuo.LIZ.getClass();
        if (((Boolean) C53230Kuo.LIZJ.getValue()).booleanValue()) {
            this.LJLLLLLL.setOnTouchListener(new IDTListenerS118S0100000_9(this, 3));
        }
        if (C55703Ltb.LIZJ) {
            this.LJLLLLLL.LJIIJJI(new IDrS48S0100000_9(this, 3));
        }
        C87030YDq c87030YDq = C87030YDq.LIZIZ;
        RecyclerView recyclerView = this.LJLLLLLL;
        if (((Number) C52975Kqh.LIZ.getValue()).intValue() <= 0) {
            z = false;
        }
        this.LJLLLLLL = c87030YDq.buildBaseRecyclerView(recyclerView, this, z);
        this.LLLJL = new C56477MEn(this.LJLLILLLL, this.LJLILLLLZI, this.LJLLLLLL);
        Wl();
        this.LJLLLLLL.setAdapter(this.LJZ);
        RecyclerView recyclerView2 = this.LJLLLLLL;
        if (recyclerView2 != null) {
            recyclerView2.getRecycledViewPool().setMaxRecycledViews(0, 25);
        }
        Xl();
        if ((this.LJLLILLLL && !this.LJLLLL) || this.LLFFF) {
            Am();
        }
        int i = this.LJLLL;
        if (i > 0) {
            this.LJLLLLLL.setPadding(0, 0, 0, i);
        }
        Integer LJI = C79045V0n.LJI(R.attr.cl, this.LJLLLLLL.getContext());
        if (LJI != null) {
            getView().setBackgroundColor(LJI.intValue());
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
        if (MEX.LJFF()) {
            ProfileViewModel profileViewModel = this.LLJJLIIIJLLLLLLLZ;
            AObjectS147S0100000_9 aObjectS147S0100000_9 = new AObjectS147S0100000_9(this, 2);
            profileViewModel.getClass();
            JediViewModel.wv0(profileViewModel, new TBT() { // from class: X.AOL
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ProfileState) obj).getNeedRefreshAwemeListEvent();
                }
            }, null, new AqS175S0100000_9(aObjectS147S0100000_9, 404), 2, null);
        }
        ProfileViewModel profileViewModel2 = this.LLJJLIIIJLLLLLLLZ;
        AObjectS45S0101000_13 aObjectS45S0101000_13 = new AObjectS45S0101000_13(3, this, 9);
        profileViewModel2.getClass();
        JediViewModel.wv0(profileViewModel2, new TBT() { // from class: X.AOM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileState) obj).getNeedRefreshPhotoModeAwemeMuteEvent();
            }
        }, null, new AqS175S0100000_9(aObjectS45S0101000_13, 405), 2, null);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.AwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC55057LjB LIZIZ;
        C56477MEn c56477MEn = this.LLLJL;
        if (c56477MEn != null && (LIZIZ = C40443Fu3.LIZIZ(c56477MEn.LIZ())) != null) {
            LIZIZ.LIZIZ();
        }
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl
    public final void Mm() {
        User user;
        super.Mm();
        if (this.LLF == null || this.LJLL != 0 || this.LJLLILLLL || AV1.LJIIJJI() || (user = this.LJLJJL) == null || user.getFollowerCount() >= 1000 || user.getAccountType() == 2 || user.getAccountType() == 3 || !C34172Db6.LIZ()) {
            return;
        }
        this.LLF.LIZIZ(this.LJLL, this.LJLLILLLL);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl, X.InterfaceC223218pR
    public final void Ne() {
        T t;
        if (!isViewValid()) {
            return;
        }
        C51031K1b<AbstractC51036K1g> c51031K1b = this.LJZL;
        if (c51031K1b != null && (t = c51031K1b.LJLIL) != 0 && ((AbstractC51036K1g) t).isHasMore()) {
            LJIIJJI();
        }
        if (this.LJLLILLLL && this.LJLL == 0) {
            if (this.LJZ.getItemCount() == 0 && !this.LJZ.LJLJI) {
                MFC mfc = this.LLF;
                if (mfc != null) {
                    mfc.LIZIZ(this.LJLL, this.LJLLILLLL);
                }
            } else {
                MFC mfc2 = this.LLF;
                if (mfc2 != null) {
                    mfc2.LIZ(this.LJLL);
                }
            }
            this.LL.setVisibility(4);
            return;
        }
        C73305Spp c73305Spp = this.LL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        if (this.LLIZ != null) {
            this.LLIZ.setVisibility(4);
        }
        this.LLILLIZIL = 2;
        this.LL.setVisibility(0);
        this.LL.setStatus(this.LLILII);
        MFC mfc3 = this.LLF;
        if (mfc3 != null) {
            mfc3.LIZIZ(this.LJLL, this.LJLLILLLL);
        }
        if (this.LJLL != 0) {
            return;
        }
        C56483MEt.LIZJ(true, false);
    }

    public final void Ym() {
        String str;
        WrapGridLayoutManager wrapGridLayoutManager;
        View view;
        int i;
        int i2;
        if (!L14.LIZ() || this.LJLLILLLL || this.LJLL != 0 || !this.LLIILII || (str = this.LLIIL) == null || !str.equals(this.LLJJIJIIJIL) || !this.LLIIZ || (wrapGridLayoutManager = this.LJZI) == null || wrapGridLayoutManager.LJJJI() <= 0) {
            return;
        }
        int i3 = this.LLIILZL;
        if (i3 != -1) {
            view = this.LJZI.LJJIJIL(this.LJZ.LLF() + i3);
        } else {
            view = null;
        }
        boolean z = false;
        if (view != null) {
            Context context = getContext();
            if (context == null) {
                C221018lt.LIZIZ("MTAwemeListFragment", "context is null");
                return;
            }
            Rect rect = new Rect();
            this.LJLLLLLL.getGlobalVisibleRect(rect);
            int i4 = C39687Fhr.LJIIL(context).LIZIZ;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (view.getVisibility() == 0 && (i = iArr[0] - rect.left) >= 0 && i <= i4 && (i2 = iArr[1]) >= rect.top && i2 <= rect.bottom) {
                this.LLIL = true;
                this.LLIIJI.LIZIZ();
                return;
            }
        }
        this.LLIL = false;
        int LLILL = this.LJZI.LLILL();
        this.LJZI.LJJIJIL(8);
        this.LJZI.LJJIJIL(11);
        MFB mfb = this.LLIIJI;
        int i5 = this.LLIILZL;
        if (i5 != -1 && i5 < LLILL) {
            z = true;
        }
        mfb.LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC55057LjB LIZIZ;
        super.onResume();
        C56477MEn c56477MEn = this.LLLJL;
        if (c56477MEn != null && (LIZIZ = C40443Fu3.LIZIZ(c56477MEn.LIZ())) != null) {
            LIZIZ.LJI(c56477MEn.LIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final View xl() {
        return this.LLLLII;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl, X.YFI
    public final void B7(boolean z) {
        this.LLIIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl, X.YFI
    public final void L(User user) {
        super.L(user);
        if (!this.LJLLILLLL && !AV1.LJIIJJI() && this.LJLL == 0 && C34172Db6.LIZ() && getContext() != null) {
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LIZJ(getContext().getString(R.string.pek));
            c73306Spq.LIZIZ(C16880lQ.LLLZ(getContext().getString(R.string.pej), new Object[]{AV1.LIZLLL(this.LJLJJL)}));
            this.LLILII = c73306Spq;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl, X.YFI
    public final void Th(Exception exc) {
        this.LLIIJI.LIZIZ();
        if (exc instanceof C38333F2r) {
            if (((C38306F1q) exc).getErrorCode() == 2053) {
                C26045AKb c26045AKb = new C26045AKb(mo49getActivity());
                c26045AKb.LJIIIIZZ(R.string.hkx);
                c26045AKb.LJIIJ();
                return;
            } else {
                C26045AKb c26045AKb2 = new C26045AKb(mo49getActivity());
                c26045AKb2.LJIIIIZZ(R.string.g5w);
                c26045AKb2.LJIIJ();
                return;
            }
        }
        C26045AKb c26045AKb3 = new C26045AKb(mo49getActivity());
        c26045AKb3.LJIIIIZZ(R.string.g5w);
        c26045AKb3.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, X.YFI
    public final void s(String str) {
        super.s(str);
        C56477MEn c56477MEn = this.LLLJL;
        if (c56477MEn != null) {
            c56477MEn.LIZIZ = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        User user;
        C56477MEn c56477MEn;
        InterfaceC55057LjB LIZIZ;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "3246729725135929120");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/profile/ui/MTAwemeListFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ui/MTAwemeListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        this.LLIILII = z;
        if (z && (c56477MEn = this.LLLJL) != null && (LIZIZ = C40443Fu3.LIZIZ(c56477MEn.LIZ())) != null) {
            LIZIZ.LJI(c56477MEn.LIZJ);
        }
        if (isResumed() && z && L14.LIZ() && !this.LJLLILLLL && this.LJLL == 0) {
            String str = this.LLIIL;
            if (str == null || !str.equals(this.LLJJIJIIJIL) || this.LLIL || (user = this.LJLJJL) == null || user.isBlock()) {
                C221018lt.LJFF("MTAwemeListFragment", "lastFeedAwemeId: " + this.LLIIL + " mFeedsAwemeId: " + this.LLJJIJIIJIL + " mIsJustWatchedAwemeVisible: " + this.LLIL + " mUser: " + this.LJLJJL);
                c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ui/MTAwemeListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
                return;
            }
            Ym();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ui/MTAwemeListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl, X.YFI
    public final void m0(List<Aweme> list, boolean z) {
        int i = 0;
        while (true) {
            if (i < list.size()) {
                if (ListProtector.get(list, i) != null && ((Aweme) ListProtector.get(list, i)).getAid() != null && ((Aweme) ListProtector.get(list, i)).getAid().equals(this.LLJJIJIIJIL)) {
                    this.LLIILZL = i;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (this.LLIILZL == -1) {
            C26045AKb c26045AKb = new C26045AKb(mo49getActivity());
            c26045AKb.LJIIIIZZ(R.string.g5w);
            c26045AKb.LJIIJ();
            MFB mfb = this.LLIIJI;
            if (mfb != null) {
                mfb.LIZIZ();
                return;
            }
            return;
        }
        j0(list, z);
        Xm();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLLL = (C80896Voy) view.findViewById(R.id.enk);
        this.LLLLII = (C2RZ) view.findViewById(R.id.btg);
        super.onViewCreated(view, bundle);
    }

    public static MTAwemeListFragment Vm(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle) {
        MTAwemeListFragment mTAwemeListFragment = new MTAwemeListFragment();
        bundle.putInt("type", i2);
        bundle.putString("uid", str);
        bundle.putString("sec_user_id", str2);
        bundle.putBoolean("is_my_profile", z);
        bundle.putBoolean("is_scene_transition_enable", z2);
        bundle.putInt("bottom_bar_height", i);
        bundle.putBoolean("delay_profile_initialization", z3);
        mTAwemeListFragment.setArguments(bundle);
        return mTAwemeListFragment;
    }
}
