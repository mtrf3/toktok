package com.ss.android.ugc.feed.platform.panel.refreshpanel;

import X.AbstractC55114Lk6;
import X.ActivityC45651qj;
import X.C221108m2;
import X.C221138m5;
import X.C25678A5y;
import X.C26045AKb;
import X.C2K0;
import X.C2LG;
import X.C2MH;
import X.C2NU;
import X.C2U8;
import X.C40328FsC;
import X.C48203Ivv;
import X.C51031K1b;
import X.C51781KTx;
import X.C54409LWz;
import X.C54970Lhm;
import X.C54974Lhq;
import X.C54975Lhr;
import X.C5H3;
import X.C62822Ol8;
import X.EnumC111394Yt;
import X.EnumC221088m0;
import X.InterfaceC54977Lht;
import X.InterfaceC54978Lhu;
import X.InterfaceC55102Lju;
import X.JAK;
import X.KL2;
import X.KR6;
import X.KU4;
import X.MG5;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS65S0110000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RefreshPanelComponent extends BasePanelUIComponent implements IRefreshAbility, KR6, InterfaceC55102Lju {
    public static final /* synthetic */ int LJLJLJ = 0;
    public InterfaceC54977Lht LJLJJI;
    public C54975Lhr LJLJJL;
    public final CopyOnWriteArrayList<InterfaceC54978Lhu> LJLJJLL;
    public final C5H3 LJLJL;

    @Override // X.KR6
    public final void LJLLILLLL() {
    }

    @Override // X.KR6
    public final void LLJILJIL() {
    }

    @Override // X.KR6
    public final void LLJLLL() {
    }

    @Override // X.KR6
    public final void LLLIL() {
    }

    @Override // X.KR6
    public final void LLLLLZ(Bundle bundle) {
    }

    @Override // X.KR6
    public final void LLLLZLLLI() {
    }

    @Override // X.KR6
    public final void W1() {
    }

    @Override // X.KR6
    public final void d5() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KU4
    public final void onPagePause(int i) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KU4
    public final void onPageResume(int i) {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1860815867) {
            return null;
        }
        return this;
    }

    @Override // X.KR6
    public final void v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshPanelComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        this.LJLJJLL = new CopyOnWriteArrayList<>();
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS159S0100000_9((KU4) this, 743), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS65S0110000_9(false, (KU4) this, 4));
        }
        this.LJLJL = c62822Ol8;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void Gz() {
        Fragment fragment = getPanelContext().LJ;
        if (!(fragment instanceof FeedFragment)) {
            return;
        }
        setRefreshing(true);
        FeedFragment feedFragment = (FeedFragment) fragment;
        feedFragment.ub(false);
        int i = feedFragment.LJLJJI;
        if (i == 33 || i == 0) {
            C2U8.LIZ(new C2LG());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final boolean O6() {
        InterfaceC54977Lht interfaceC54977Lht;
        if (!isContainerViewAssigned() || (interfaceC54977Lht = this.LJLJJI) == null) {
            return false;
        }
        return interfaceC54977Lht.O6();
    }

    public final InterfaceC54977Lht v3() {
        return this.LJLJJI;
    }

    @Override // X.KR6
    public final void LLIIIJ(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.KR6
    public final void LLLII(Bundle outState) {
        o.LJIIIZ(outState, "outState");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void N30(C54970Lhm c54970Lhm) {
        if (c54970Lhm != null) {
            this.LJLJJLL.remove(c54970Lhm);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void XX(InterfaceC54978Lhu interfaceC54978Lhu) {
        if (interfaceC54978Lhu != null && !this.LJLJJLL.contains(interfaceC54978Lhu)) {
            this.LJLJJLL.add(interfaceC54978Lhu);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        AbstractC55114Lk6 abstractC55114Lk6;
        InterfaceC54977Lht interfaceC54977Lht;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        x3(getContainerView());
        int LIZJ = (int) KL2.LIZJ(getContainerView().getContext(), 49.0f);
        int LIZJ2 = (int) KL2.LIZJ(getContainerView().getContext(), 113.0f);
        C54975Lhr c54975Lhr = this.LJLJJL;
        if (c54975Lhr != null) {
            c54975Lhr.P6(LIZJ, LIZJ2);
        }
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (view2 = fragment.getView()) != null && (abstractC55114Lk6 = (AbstractC55114Lk6) view2.findViewById(R.id.ncx)) != null && (interfaceC54977Lht = this.LJLJJI) != null) {
            interfaceC54977Lht.setViewPager(abstractC55114Lk6);
        }
        InterfaceC54977Lht interfaceC54977Lht2 = this.LJLJJI;
        if (interfaceC54977Lht2 != null) {
            interfaceC54977Lht2.setOnRefreshListener(new C54974Lhq(this));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void setCanTouch(boolean z) {
        InterfaceC54977Lht interfaceC54977Lht = this.LJLJJI;
        if (interfaceC54977Lht != null) {
            interfaceC54977Lht.setCanTouch(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void setEnabled(boolean z) {
        InterfaceC54977Lht v3 = v3();
        if (v3 != null) {
            v3.setEnabled(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final void setRefreshing(boolean z) {
        C54975Lhr c54975Lhr = this.LJLJJL;
        if (c54975Lhr == null) {
            return;
        }
        c54975Lhr.setRefreshing(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility
    public final boolean ub(boolean z) {
        MG5 mg5;
        boolean z2;
        C51031K1b<?> Qv;
        Fragment fragment = getPanelContext().LJ;
        boolean z3 = false;
        if (fragment == null || !(fragment instanceof FeedFragment) || this.LJLJJI == null) {
            return false;
        }
        MG5 mg52 = MG5.DEFAULT;
        if (o.LJ("Following", getPanelContext().LIZ)) {
            mg5 = MG5.FOLLOW_FEED;
        } else if (o.LJ("For You", getPanelContext().LIZ)) {
            mg5 = MG5.RECOMMEND_FEED;
        } else if (o.LJ("Friends", getPanelContext().LIZ)) {
            mg5 = MG5.TAB_FRIENDS;
        } else {
            mg5 = mg52;
        }
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (C2NU.LIZ.LIZJ == EnumC111394Yt.NOT_AVAILABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (mo49getActivity != null && z2) {
            if (mg5 != mg52) {
                C25678A5y.LIZIZ(mo49getActivity, mg5, null, null);
            } else if (C48203Ivv.LIZJ(mo49getActivity)) {
                C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
                c26045AKb.LJIIIZ(mo49getActivity.getString(R.string.dtk));
                c26045AKb.LJIIJ();
            } else {
                C40328FsC.LIZLLL(mo49getActivity, R.string.img);
            }
            setRefreshing(false);
            if (o.LJ("Friends", getPanelContext().LIZ)) {
                C2U8.LIZ(new C54409LWz("FRIENDS_FEED"));
            } else {
                C2U8.LIZ(new C54409LWz());
            }
            return false;
        }
        IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) this.LJLJL.getValue();
        if (iFeedFetchDataAbility != null && (Qv = iFeedFetchDataAbility.Qv()) != null) {
            z3 = Qv.LJJIFFI();
        }
        return !z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x3(View view) {
        InterfaceC54977Lht interfaceC54977Lht;
        if (!o.LJ(this.LJLJJI, view)) {
            InterfaceC54977Lht interfaceC54977Lht2 = null;
            if ((view instanceof InterfaceC54977Lht) && (interfaceC54977Lht = (InterfaceC54977Lht) view) != null) {
                this.LJLJJL = new C54975Lhr(interfaceC54977Lht);
                interfaceC54977Lht2 = interfaceC54977Lht;
            }
            this.LJLJJI = interfaceC54977Lht2;
        }
    }

    @Override // X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
        View view2;
        if (view != null) {
            view2 = view.findViewById(R.id.itq);
        } else {
            view2 = null;
        }
        x3(view2);
    }

    @Override // X.KR6
    public final void j(Activity activity, Fragment fragment) {
        C2MH.LIZ(activity, fragment);
    }
}
