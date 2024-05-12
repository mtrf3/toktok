package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C207668Da;
import X.C226288uO;
import X.C29S;
import X.C3C5;
import X.C44428Hc8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C84939XVf;
import X.C84981XWv;
import X.C90903hW;
import X.InterfaceC191547fS;
import X.InterfaceC85019XYh;
import X.OGG;
import X.XXC;
import X.XY6;
import X.XYJ;
import X.XYL;
import X.XYN;
import X.XZ1;
import Y.AgS115S0200000_15;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseDiscoverMusicFragment extends AmeBaseFragment implements Observer<C207668Da>, OGG, InterfaceC191547fS {
    public static final /* synthetic */ int LJLLI = 0;
    public RecyclerView LJLIL;
    public DataCenter LJLILLLLZI;
    public WidgetManager LJLJI;
    public XXC LJLJJI;
    public int LJLJJL;
    public XY6 LJLJJLL;
    public XZ1 LJLJL;
    public InterfaceC85019XYh<XYN> LJLJLJ;
    public int LJLJLLL;
    public C84939XVf LJLL;

    public abstract void showLoadMoreEmpty();

    public abstract void vl(C207668Da c207668Da);

    public abstract void wl();

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        XXC xxc;
        int i = this.LJLJLLL - 2;
        if (i < 0) {
            i = 0;
        }
        C84939XVf c84939XVf = this.LJLL;
        if (!c84939XVf.LIZJ) {
            c84939XVf.LIZJ = true;
            ChooseMusicApi.LIZ.musicCollectionFeed(Integer.valueOf(i), 10).LJ(new AgS115S0200000_15(c84939XVf, C44428Hc8.LIZ(), 6), C10K.LJIIIIZZ, null);
        }
        if (!isViewValid() || (xxc = this.LJLJJI) == null) {
            return;
        }
        xxc.showLoadMoreLoading();
    }

    @Override // X.OGG
    public final View LJIJJ() {
        return this.LJLIL;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C207668Da r11) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseDiscoverMusicFragment.onChanged(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 1;
        }
        this.LJLJJL = i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-1074315935952990504");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/kids/choosemusic/fragment/BaseDiscoverMusicFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/kids/choosemusic/fragment/BaseDiscoverMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.LJLIL == null || !z) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/kids/choosemusic/fragment/BaseDiscoverMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            return;
        }
        XXC xxc = this.LJLJJI;
        if (xxc != null) {
            xxc.LJLZ(true);
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/kids/choosemusic/fragment/BaseDiscoverMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bg3, viewGroup, false);
        this.LJLIL = (RecyclerView) LLLLIILL.findViewById(R.id.ftt);
        LLLLIILL.findViewById(R.id.kf_);
        XXC xxc = new XXC(this.LJLJI, this.LJLILLLLZI, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJJL);
        this.LJLJJI = xxc;
        xxc.setLoadMoreListener(this);
        this.LJLIL.setOverScrollMode(2);
        RecyclerView recyclerView = this.LJLIL;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.LJLIL.setAdapter(this.LJLJJI);
        C84981XWv c84981XWv = new C84981XWv(new C226288uO(this), 5);
        RecyclerView recyclerView2 = this.LJLIL;
        if (Build.VERSION.SDK_INT >= 23) {
            recyclerView2.setOnScrollChangeListener(new XYL(c84981XWv));
        } else {
            recyclerView2.setOnScrollListener(new XYJ(c84981XWv));
        }
        DataCenter dataCenter = this.LJLILLLLZI;
        dataCenter.iv0("list", this, false);
        dataCenter.iv0("should_load_more_pick", this, false);
        dataCenter.iv0("music_collect_status", this, false);
        dataCenter.iv0("collection_feed_status", this, false);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
