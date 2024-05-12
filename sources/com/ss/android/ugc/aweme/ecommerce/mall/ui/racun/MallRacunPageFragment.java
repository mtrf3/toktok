package com.ss.android.ugc.aweme.ecommerce.mall.ui.racun;

import X.ActivityC45651qj;
import X.AnonymousClass372;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C174826ta;
import X.C178596zf;
import X.C184077Kh;
import X.C188727au;
import X.C207668Da;
import X.C212418Vh;
import X.C212428Vi;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C220858ld;
import X.C227768wm;
import X.C29S;
import X.C2KM;
import X.C33Q;
import X.C35639Dyl;
import X.C3A5;
import X.C3C5;
import X.C3C8;
import X.C40443Fu3;
import X.C45804HyK;
import X.C47285Ih7;
import X.C51697KQr;
import X.C53816LAe;
import X.C54081LKj;
import X.C54082LKk;
import X.C54990Li6;
import X.C55060LjE;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55263LmV;
import X.C55264LmW;
import X.C55265LmX;
import X.C55266LmY;
import X.C55267LmZ;
import X.C55268Lma;
import X.C55269Lmb;
import X.C55270Lmc;
import X.C55271Lmd;
import X.C55274Lmg;
import X.C55289Lmv;
import X.C55457Lpd;
import X.C55723Ltv;
import X.C55792Lv2;
import X.C55986LyA;
import X.C56412MCa;
import X.C60996Nwm;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C74291TDr;
import X.C76800UCe;
import X.C76V;
import X.C78540Us4;
import X.C786536v;
import X.C78926UyI;
import X.C80796VnM;
import X.C84193Sd;
import X.C8VV;
import X.C8W0;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.FMX;
import X.GZP;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC46330IGg;
import X.InterfaceC50391Jq7;
import X.InterfaceC51505KJh;
import X.InterfaceC51679KPz;
import X.InterfaceC51771KTn;
import X.InterfaceC55112Lk4;
import X.InterfaceC55235Lm3;
import X.InterfaceC55292Lmy;
import X.InterfaceC56322M8o;
import X.InterfaceC57302Ms;
import X.InterfaceC58812Sn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.KR6;
import X.KR8;
import X.KRB;
import X.LFH;
import X.LKF;
import X.LNH;
import X.M89;
import X.NK1;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.TBT;
import X.TBW;
import X.V0N;
import Y.ACListenerS29S0100000_9;
import Y.ALAdapterS0S0210000_3;
import Y.IDCListenerS284S0100000_9;
import Y.IDDListenerS148S0100000_9;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunTabInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.floating.MallLiveBubbleViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.floating.MallProductViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.floating.UserBubbleViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.skylight.MallSkylightViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IMallRacunFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS11S0010000_6;
import kotlin.jvm.internal.AqS126S0300000_9;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallRacunPageFragment extends CommonPageFragment implements InterfaceC55112Lk4, InterfaceC58812Sn, InterfaceC55292Lmy, InterfaceC57302Ms, NK1, IDetailBaseAbility, KPL, IMallRacunFragmentAbility, Observer<C207668Da>, InterfaceC56322M8o, InterfaceC51505KJh {
    public static final /* synthetic */ int LLIIJLIL = 0;
    public final C214298b3 LJLJI;
    public final C214298b3 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C214298b3 LJLJL;
    public final C214298b3 LJLJLJ;
    public C73305Spp LJLJLLL;
    public LoadMorePanelComponentTempHelper LJLL;
    public IRefreshAbility LJLLI;
    public IPageStateAbility LJLLILLLL;
    public View LJLLJ;
    public C786536v LJLLL;
    public C55271Lmd LJLLLL;
    public C55986LyA LJLLLLLL;
    public RecyclerView LJLZ;
    public FrameLayout LJZ;
    public FrameLayout LJZI;
    public C74291TDr LJZL;
    public int LL;
    public M89 LLD;
    public boolean LLF;
    public MallRacunFragmentPanel LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public LKF LLFZ;
    public Aweme LLI;
    public Integer LLIFFJFJJ;
    public MallRacunTabInfo LLII;
    public InterfaceC51679KPz LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public final C55060LjE LLIIIL;
    public final String LLIIIZ;
    public final Map<Integer, View> LLIIJI = new LinkedHashMap();
    public final C55289Lmv LJLILLLLZI = new C55289Lmv();

    @Override // X.InterfaceC55112Lk4
    public final void LJJIJIL() {
        Al(4);
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final void LV() {
    }

    @Override // X.InterfaceC58812Sn
    public final /* synthetic */ void Lf() {
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final boolean RZ(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJI;
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

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    public MallRacunPageFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C214298b3 c214298b33;
        C214298b3 c214298b34;
        C214298b3 c214298b35;
        C214298b3 c214298b36;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MallSkylightViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 139);
        C55266LmY c55266LmY = C55266LmY.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c55266LmY, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c55266LmY, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(UserBubbleViewModel.class);
        AqS159S0100000_9 aqS159S0100000_92 = new AqS159S0100000_9(LIZ2, UserLevelGeckoUpdateSetting.DEFAULT);
        C55267LmZ c55267LmZ = C55267LmZ.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS159S0100000_92, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c55267LmZ, LIZ2);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS159S0100000_92, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c55267LmZ, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJI = c214298b32;
        C65776Prg LIZ3 = C65352Pkq.LIZ(MallProductViewModel.class);
        AqS159S0100000_9 aqS159S0100000_93 = new AqS159S0100000_9(LIZ3, 141);
        C55268Lma c55268Lma = C55268Lma.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b33 = new C214298b3(aqS159S0100000_93, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c55268Lma, LIZ3);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b33 = new C214298b3(aqS159S0100000_93, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c55268Lma, LIZ3);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJL = c214298b33;
        C65776Prg LIZ4 = C65352Pkq.LIZ(MallLiveBubbleViewModel.class);
        AqS159S0100000_9 aqS159S0100000_94 = new AqS159S0100000_9(LIZ4, 142);
        C55269Lmb c55269Lmb = C55269Lmb.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b34 = new C214298b3(aqS159S0100000_94, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c55269Lmb, LIZ4);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b34 = new C214298b3(aqS159S0100000_94, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c55269Lmb, LIZ4);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJLL = c214298b34;
        C65776Prg LIZ5 = C65352Pkq.LIZ(MallRacunViewModel.class);
        AqS159S0100000_9 aqS159S0100000_95 = new AqS159S0100000_9(LIZ5, 143);
        C55264LmW c55264LmW = C55264LmW.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b35 = new C214298b3(aqS159S0100000_95, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c55264LmW, LIZ5);
        } else if (c9bd == null || o.LJ(c9bd, c9be)) {
            c214298b35 = new C214298b3(aqS159S0100000_95, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c55264LmW, LIZ5);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJL = c214298b35;
        C65776Prg LIZ6 = C65352Pkq.LIZ(MallRacunViewModel.class);
        AqS159S0100000_9 aqS159S0100000_96 = new AqS159S0100000_9(LIZ6, 138);
        C55265LmX c55265LmX = C55265LmX.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b36 = new C214298b3(aqS159S0100000_96, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c55265LmX, LIZ6);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b36 = new C214298b3(aqS159S0100000_96, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c55265LmX, LIZ6);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJLJ = c214298b36;
        this.LLD = new M89();
        this.LLFFF = true;
        this.LLFII = true;
        this.LLIIIL = new C55060LjE(this);
        this.LLIIIZ = "mall_racun";
    }

    public final void LJI() {
        M89 m89;
        InterfaceC46330IGg playerManager;
        M89 m892;
        if (this.LLI != null && (m89 = this.LLD) != null && m89.isFromSharedStory()) {
            MallRacunFragmentPanel mallRacunFragmentPanel = this.LLFF;
            long j = 0;
            if (mallRacunFragmentPanel != null && (playerManager = mallRacunFragmentPanel.getPlayerManager()) != null) {
                long currentPosition = playerManager.getCurrentPosition();
                if (currentPosition > 0 && (m892 = this.LLD) != null && m892.getPrevPanelId() > 0) {
                    GZP LJII = C55723Ltv.LIZIZ.LJII();
                    M89 m893 = this.LLD;
                    if (m893 != null) {
                        j = m893.getPrevPanelId();
                    }
                    LJII.LIZJ(j, currentPosition);
                }
            }
        }
        if (MSAdaptionService.LJIIL().LIZIZ(mo49getActivity())) {
            SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "//duo");
            buildRoute.withParam("duo_type", "duo_back");
            buildRoute.open();
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (mo49getActivity instanceof DetailActivity)) {
            ((DetailActivity) mo49getActivity).LLFZ();
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            mo49getActivity2.finish();
        }
        M89 m894 = this.LLD;
        if (m894 != null && m894.isFromAdsActivity() && mo49getActivity != null) {
            mo49getActivity.overridePendingTransition(R.anim.dk, R.anim.dk);
        }
    }

    @Override // X.NK1
    public final boolean cd() {
        MallRacunFragmentPanel mallRacunFragmentPanel = this.LLFF;
        if (mallRacunFragmentPanel == null || !mallRacunFragmentPanel.isShareDialogShowing()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58812Sn
    public final boolean mf() {
        InterfaceC51679KPz interfaceC51679KPz;
        InterfaceC51679KPz interfaceC51679KPz2 = this.LLIIII;
        if (interfaceC51679KPz2 == null || interfaceC51679KPz2.isLoading() || ((interfaceC51679KPz = this.LLIIII) != null && interfaceC51679KPz.cannotLoadMore())) {
            return false;
        }
        InterfaceC51679KPz interfaceC51679KPz3 = this.LLIIII;
        if (interfaceC51679KPz3 instanceof InterfaceC50391Jq7) {
            o.LJII(interfaceC51679KPz3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.operators.IDetailPageOperator.OnPreLoad");
            ((InterfaceC50391Jq7) interfaceC51679KPz3).setPreLoad(true);
        } else {
            MallRacunFragmentPanel mallRacunFragmentPanel = this.LLFF;
            if (mallRacunFragmentPanel != null) {
                mallRacunFragmentPanel.LLIIIZ = true;
            }
        }
        return Al(4);
    }

    @Override // X.InterfaceC55292Lmy
    public final boolean sd() {
        InterfaceC51679KPz interfaceC51679KPz;
        InterfaceC51679KPz interfaceC51679KPz2 = this.LLIIII;
        if (interfaceC51679KPz2 == null || interfaceC51679KPz2.isLoading() || ((interfaceC51679KPz = this.LLIIII) != null && interfaceC51679KPz.cannotLoadLatest())) {
            return false;
        }
        InterfaceC51679KPz interfaceC51679KPz3 = this.LLIIII;
        if (!(interfaceC51679KPz3 instanceof InterfaceC51771KTn)) {
            return false;
        }
        if (interfaceC51679KPz3 instanceof InterfaceC50391Jq7) {
            o.LJII(interfaceC51679KPz3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.operators.IDetailPageOperator.OnPreLoad");
            ((InterfaceC50391Jq7) interfaceC51679KPz3).setPreLoad(true);
        } else {
            MallRacunFragmentPanel mallRacunFragmentPanel = this.LLFF;
            if (mallRacunFragmentPanel != null) {
                mallRacunFragmentPanel.LLIIIZ = true;
            }
        }
        return Al(2);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final boolean vl() {
        LKF lkf = this.LLFZ;
        if (lkf != null && lkf.LJIILIIL()) {
            return true;
        }
        if (!this.LLFFF) {
            Dl(true, true, true);
            return true;
        }
        return super.vl();
    }

    public final void xl() {
        if (this.LLFF == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.LLD = (M89) arguments.getSerializable("feed_param");
                this.LLF = arguments.getBoolean("extra_challenge_is_hashtag", false);
            } else {
                M89 m89 = this.LLD;
                if (m89 != null) {
                    m89.setEventType("");
                }
            }
            M89 m892 = this.LLD;
            if (m892 == null) {
                m892 = new M89();
            }
            this.LLFF = new MallRacunFragmentPanel(m892);
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            return C54081LKj.LIZ(mo49getActivity, mo49getActivity);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IViewPagerComponentAbility getViewPagerComponentAbility() {
        IFeedPanelPlatformAbility LJI = C78540Us4.LJI(this);
        if (LJI != null) {
            return LJI.getViewPagerComponentAbility();
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C40443Fu3.LIZ("mall_racun_channel").LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        MallRacunFragmentPanel mallRacunFragmentPanel;
        InterfaceC46330IGg playerManager;
        super.onDestroyView();
        C55457Lpd.LIZ(this);
        try {
            MallRacunFragmentPanel mallRacunFragmentPanel2 = this.LLFF;
            if (mallRacunFragmentPanel2 != null) {
                mallRacunFragmentPanel2.onDestroyView();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        InterfaceC51679KPz interfaceC51679KPz = this.LLIIII;
        if (interfaceC51679KPz != null) {
            interfaceC51679KPz.unInit();
        }
        C47285Ih7.LIZIZ = false;
        if (C47285Ih7.LIZJ() && (mallRacunFragmentPanel = this.LLFF) != null && (playerManager = mallRacunFragmentPanel.getPlayerManager()) != null) {
            playerManager.release();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<KRB> registerComponents() {
        SparseArray<KRB> registerComponents = super.registerComponents();
        o.LJIIIIZZ(registerComponents, "super.registerComponents()");
        xl();
        registerComponents.append(C51697KQr.LIZJ, this.LLFF);
        return registerComponents;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final ILoadMoreAbility PZ() {
        return this.LJLL;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IPageStateAbility RP() {
        return this.LJLLILLLL;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IRefreshAbility YE() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LLIIIZ;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    public final boolean Al(int i) {
        InterfaceC51679KPz interfaceC51679KPz;
        InterfaceC51679KPz interfaceC51679KPz2 = this.LLIIII;
        if (interfaceC51679KPz2 == null || interfaceC51679KPz2.isLoading()) {
            return false;
        }
        M89 m89 = this.LLD;
        if (m89 != null && (interfaceC51679KPz = this.LLIIII) != null) {
            interfaceC51679KPz.request(i, m89, m89.getPageType(), this.LLF);
        }
        return true;
    }

    @Override // X.InterfaceC57302Ms
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        return deleteItem(aid);
    }

    @Override // X.InterfaceC57302Ms
    public final boolean deleteItem(String aid) {
        o.LJIIIZ(aid, "aid");
        InterfaceC51679KPz interfaceC51679KPz = this.LLIIII;
        if (interfaceC51679KPz == null || !interfaceC51679KPz.deleteItem(aid)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final boolean hasNextItem(int i) {
        MallRacunFragmentPanel mallRacunFragmentPanel = this.LLFF;
        if (mallRacunFragmentPanel == null || !mallRacunFragmentPanel.hasNextItem(i)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        o.LJIIIZ(activity, "activity");
        KR8.LJIIIIZZ(this);
        C55230Lly.LIZJ(this, null);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, IFeedFragmentAbility.class, null);
        super.onAttach(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C207668Da r7) {
        /*
            r6 = this;
            X.8Da r7 = (X.C207668Da) r7
            if (r7 != 0) goto L5
        L4:
            return
        L5:
            java.lang.String r1 = r7.LIZ
            int r0 = r1.hashCode()
            r4 = 0
            switch(r0) {
                case -1852517575: goto L10;
                case -1013481626: goto L29;
                case 22405807: goto L36;
                case 89664936: goto L8a;
                default: goto Lf;
            }
        Lf:
            goto L4
        L10:
            java.lang.String r0 = "feed_enter_transition_end"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L19
            goto L4
        L19:
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragmentPanel r0 = r6.LLFF
            if (r0 == 0) goto L4
            X.2MA r1 = r0.getCurFeedViewHolder()
            boolean r0 = r1 instanceof X.InterfaceC55219Lln
            if (r0 == 0) goto L4
            r1.LJIIJJI()
            goto L4
        L29:
            java.lang.String r0 = "onBack"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L32
            goto L4
        L32:
            r6.LJI()
            goto L4
        L36:
            java.lang.String r0 = "action_remove_recommend_user_card"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3f
            goto L4
        L3f:
            java.lang.Object r5 = r7.LIZIZ
            if (r5 != 0) goto L44
            goto L4
        L44:
            java.lang.String r5 = (java.lang.String) r5
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragmentPanel r0 = r6.LLFF
            if (r0 == 0) goto L88
            X.LjG r0 = r0.getAdapter()
            if (r0 == 0) goto L88
            java.util.List r3 = r0.Q8()
            if (r3 == 0) goto L88
            int r0 = r3.size()
            if (r0 <= 0) goto L88
            int r2 = r3.size()
            r1 = 0
        L61:
            if (r1 >= r2) goto L88
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            if (r0 == 0) goto L85
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L83
            java.lang.String r0 = r0.getAid()
        L75:
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 == 0) goto L85
        L7b:
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragmentPanel r0 = r6.LLFF
            if (r0 == 0) goto L4
            r0.onItemDeleted(r1)
            goto L4
        L83:
            r0 = r4
            goto L75
        L85:
            int r1 = r1 + 1
            goto L61
        L88:
            r1 = -1
            goto L7b
        L8a:
            java.lang.String r0 = "feed_transition_state"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L94
            goto L4
        L94:
            java.lang.Object r0 = r7.LIZIZ
            if (r0 != 0) goto Lb4
        L98:
            java.lang.String r0 = "kvData.getData()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r2 = r4.booleanValue()
            com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragmentPanel r0 = r6.LLFF
            if (r0 == 0) goto L4
            X.2MA r1 = r0.getCurFeedViewHolder()
            boolean r0 = r1 instanceof X.InterfaceC55219Lln
            if (r0 == 0) goto L4
            r1.w8(r2)
            goto L4
        Lb4:
            r4 = r0
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment.onChanged(java.lang.Object):void");
    }

    @QD3
    public final void onDislikeAwemeEvent(C55274Lmg event) {
        int i;
        float f;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        User author;
        o.LJIIIZ(event, "event");
        if (mo49getActivity() != null) {
            int i2 = event.LJLJJL;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                i = mo49getActivity.hashCode();
            } else {
                i = 0;
            }
            if (i2 != i || C63081OpJ.LJLJLLL(this.LLI) || !getUserVisibleHint() || event.LJLILLLLZI != -1) {
                return;
            }
            boolean z = event.LJLIL;
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                C84193Sd.LIZ(mo49getActivity2).tv0(!z);
            }
            View view = this.LJLLJ;
            if (view != null) {
                f = view.getAlpha();
            } else {
                f = 0.0f;
            }
            C178596zf.LIZ(f, 0.0f, view);
            int i3 = event.LJLJJLL;
            if ((i3 != 0 && i3 != 4) || this.LLI == null) {
                return;
            }
            C188727au c188727au = new C188727au();
            Aweme aweme = this.LLI;
            String str6 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            Aweme aweme2 = this.LLI;
            if (aweme2 == null || (author = aweme2.getAuthor()) == null || (str2 = author.getUid()) == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("author_id", str2);
            c188727au.LJIIIZ("content_type", C227768wm.LJ(this.LLI));
            c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LLI)));
            MallRacunFragmentPanel mallRacunFragmentPanel = this.LLFF;
            if (mallRacunFragmentPanel != null) {
                str3 = mallRacunFragmentPanel.getEventType();
            } else {
                str3 = null;
            }
            c188727au.LJIIIZ("enter_from", str3);
            c188727au.LJIIIZ("enter_method", "detail");
            M89 m89 = this.LLD;
            if (m89 != null) {
                str4 = m89.getPreviousPage();
            } else {
                str4 = null;
            }
            M89 m892 = this.LLD;
            if (m892 != null) {
                str5 = m892.getFromGroupId();
            } else {
                str5 = null;
            }
            c188727au.LJIIIZ("from_group_id", C2KM.LIZ(str4, str5));
            Aweme aweme3 = this.LLI;
            if (aweme3 != null) {
                bool = Boolean.valueOf(aweme3.isSubOnlyVideo());
            } else {
                bool = null;
            }
            c188727au.LJFF(bool, "is_sub_only_video");
            Aweme aweme4 = this.LLI;
            M89 m893 = this.LLD;
            if (m893 != null) {
                m893.getEventType();
            }
            V0N.LJI(c188727au, aweme4);
            if (C174826ta.LIZ()) {
                C76V.LIZ().LIZ(C227768wm.LIZIZ(this.LLI));
                c188727au.LIZLLL(0, "spammy_tag_cnt");
            }
            FMX.LJIIL("click_trans_layer", c188727au.LIZ);
            Context context = getContext();
            if (context == null) {
                return;
            }
            Aweme aweme5 = this.LLI;
            MallRacunFragmentPanel mallRacunFragmentPanel2 = this.LLFF;
            if (mallRacunFragmentPanel2 != null) {
                str6 = mallRacunFragmentPanel2.getEventType();
            }
            Dialog newOptionsDialog = BusinessComponentServiceUtils.newOptionsDialog(this, context, aweme5, str6);
            o.LJIIIIZZ(newOptionsDialog, "newOptionsDialog(\n      ….eventType,\n            )");
            if (event.LJLJJLL == 4) {
                Window window = newOptionsDialog.getWindow();
                if (window != null) {
                    window.clearFlags(2);
                }
                newOptionsDialog.setOnCancelListener(new IDCListenerS284S0100000_9(event, 3));
            }
            newOptionsDialog.setOnDismissListener(new IDDListenerS148S0100000_9(this, 7));
            ShareExtServiceImpl.LJJLIIJ().LJJIJIL(this.LLI);
            C16880lQ.LIZ(newOptionsDialog);
        }
    }

    @QD3
    public final void onFeedFetchEvent(C54990Li6 event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals("from_full_recommend", "from_cell_recommend") && getUserVisibleHint()) {
            Al(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "3494038503029178720");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/ecommerce/mall/ui/racun/MallRacunPageFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/mall/ui/racun/MallRacunPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        xl();
        super.setUserVisibleHint(z);
        MallRacunFragmentPanel mallRacunFragmentPanel = this.LLFF;
        if (mallRacunFragmentPanel != null) {
            mallRacunFragmentPanel.LLFF(z, true);
        }
        try {
            if (z) {
                MallRacunFragmentPanel mallRacunFragmentPanel2 = this.LLFF;
                if (mallRacunFragmentPanel2 != null) {
                    mallRacunFragmentPanel2.LJLZ(!C220858ld.LJIIIIZZ(this.LLI));
                }
                MallRacunFragmentPanel mallRacunFragmentPanel3 = this.LLFF;
                if (mallRacunFragmentPanel3 != null) {
                    mallRacunFragmentPanel3.LLIILII = true;
                    mallRacunFragmentPanel3.LLJJJJLIIL = true;
                    mallRacunFragmentPanel3.LLIIJLIL(true);
                }
                MallRacunFragmentPanel mallRacunFragmentPanel4 = this.LLFF;
                if (mallRacunFragmentPanel4 != null) {
                    mallRacunFragmentPanel4.handlePageResume();
                }
                KR8.LJII(1, this);
            } else {
                MallRacunFragmentPanel mallRacunFragmentPanel5 = this.LLFF;
                if (mallRacunFragmentPanel5 != null) {
                    mallRacunFragmentPanel5.LJLZ(false);
                }
                MallRacunFragmentPanel mallRacunFragmentPanel6 = this.LLFF;
                if (mallRacunFragmentPanel6 != null) {
                    mallRacunFragmentPanel6.LLIILII = false;
                    mallRacunFragmentPanel6.LLJJJJLIIL = false;
                    mallRacunFragmentPanel6.handlePageStop(false);
                }
                KR8.LJI(1, this);
            }
        } catch (CancellationException e) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/mall/ui/racun/MallRacunPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            throw e;
        } catch (Throwable unused) {
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/mall/ui/racun/MallRacunPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void wl(Integer num) {
        MallRacunViewModel.gv0((MallRacunViewModel) this.LJLJLJ.getValue(), num, null, 30);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IRefreshAbility iRefreshAbility;
        IPageStateAbility iPageStateAbility;
        MallRacunTabInfo mallRacunTabInfo;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LJJJJI(view, bundle);
            }
        }
        this.LJLLJ = view.findViewById(R.id.aej);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bfv);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS29S0100000_9(this, 199));
        }
        this.LJLLL = (C786536v) view.findViewById(R.id.gco);
        this.LJLLLLLL = (C55986LyA) view.findViewById(R.id.gcs);
        this.LJLJLLL = (C73305Spp) view.findViewById(R.id.keh);
        InterfaceC55235Lm3 LJFF = KR8.LJFF(this);
        ViewGroup.LayoutParams layoutParams = null;
        if (LJFF != null) {
            iRefreshAbility = (IRefreshAbility) C55096Ljo.LIZ(LJFF, IRefreshAbility.class, null);
        } else {
            iRefreshAbility = null;
        }
        this.LJLLI = iRefreshAbility;
        LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper = new LoadMorePanelComponentTempHelper(this);
        this.LJLL = loadMorePanelComponentTempHelper;
        loadMorePanelComponentTempHelper.onViewCreated(view, bundle);
        InterfaceC55235Lm3 LJFF2 = KR8.LJFF(this);
        if (LJFF2 != null) {
            iPageStateAbility = (IPageStateAbility) C55096Ljo.LIZ(LJFF2, IPageStateAbility.class, null);
        } else {
            iPageStateAbility = null;
        }
        this.LJLLILLLL = iPageStateAbility;
        View view2 = this.LJLLJ;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 200), view2);
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                Context context = getContext();
                if (context != null) {
                    i = C63081OpJ.LJJJJLI(context);
                } else {
                    i = 0;
                }
                marginLayoutParams2.topMargin = i;
            }
            C45804HyK.LJJIJIIJIL(view2);
        }
        IRefreshAbility iRefreshAbility2 = this.LJLLI;
        if (iRefreshAbility2 != null) {
            iRefreshAbility2.setEnabled(false);
        }
        getContext();
        this.LJLLLL = new C55271Lmd();
        C786536v c786536v = this.LJLLL;
        if (c786536v != null) {
            c786536v.setScrollPredicate(AnonymousClass372.LJLIL);
            c786536v.setCallBack(new AqS159S0100000_9(this, 1060));
            C45804HyK.LJJIJIIJIL(c786536v);
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        this.LLI = LNH.LIZIZ(requireActivity);
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "this.viewLifecycleOwner");
        LNH.LIZ(requireActivity2, viewLifecycleOwner, new C55270Lmc(this));
        Context context2 = getContext();
        if (context2 != null) {
            this.LJLILLLLZI.LJLILLLLZI = new Integer[]{Integer.valueOf(C60996Nwm.LJIIIIZZ(context2)), Integer.valueOf(C60996Nwm.LJ(context2))};
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            DataCenter gv0 = DataCenter.gv0(ViewModelProviders.of(mo49getActivity), this);
            gv0.iv0("action_remove_recommend_user_card", this, false);
            gv0.iv0("onBack", this, false);
            gv0.iv0("feed_transition_state", this, false);
            gv0.iv0("feed_enter_transition_end", this, false);
        }
        this.LJLILLLLZI.LJLIL = this.LLD;
        if (this.LLFF != null && (mallRacunTabInfo = this.LLII) != null) {
            mallRacunTabInfo.getTabType();
        }
        C8VV.LIZ(this, false, new AqS140S0200000_9(this, new C55792Lv2(this, view), 7));
        C8YN.LJII(this, (AssemViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.Ln4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35638Dyk) obj).LJLILLLLZI;
            }
        }, null, new AqS191S0100000_9(this, 12), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLJ.getValue(), new TBT() { // from class: X.Ln5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35638Dyk) obj).LJLILLLLZI;
            }
        }, null, new AqS126S0300000_9(this, view, bundle, 0), 6);
        this.LJLLLLLL = (C55986LyA) view.findViewById(R.id.gcs);
        this.LJLZ = (RecyclerView) view.findViewById(R.id.gcq);
        this.LJZ = (FrameLayout) view.findViewById(R.id.myk);
        this.LJZI = (FrameLayout) view.findViewById(R.id.fvd);
        this.LJZL = (C74291TDr) view.findViewById(R.id.fkl);
        C55986LyA c55986LyA = this.LJLLLLLL;
        if (c55986LyA != null) {
            layoutParams = c55986LyA.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            Integer num = this.LLIFFJFJJ;
            if (num == null) {
                num = 0;
            }
            marginLayoutParams.topMargin = num.intValue();
        }
        Dl(true, false, false);
    }

    public final void Dl(boolean z, boolean z2, boolean z3) {
        int i;
        C80796VnM viewPager;
        final float f;
        if (!isViewValid() || this.LLIIIILZ) {
            return;
        }
        int i2 = this.LL;
        Integer num = this.LLIFFJFJJ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        final float f2 = i2 + i;
        if (this.LJLLLL != null) {
            C786536v c786536v = this.LJLLL;
            final C55263LmV c55263LmV = new C55263LmV(this, z, z3);
            if (z) {
                f = 0.0f;
            } else {
                f = f2;
                f2 = 0.0f;
            }
            if (z2) {
                if (c786536v != null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c786536v, "translationY", f, f2);
                    ofFloat.setInterpolator(new DecelerateInterpolator());
                    ofFloat.setDuration(300L);
                    ofFloat.addListener(new ALAdapterS0S0210000_3(c55263LmV, z, ofFloat, 1));
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.8i2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator it) {
                            Float f3;
                            o.LJIIIZ(it, "it");
                            Object animatedValue = it.getAnimatedValue();
                            if ((animatedValue instanceof Float) && (f3 = (Float) animatedValue) != null) {
                                float f4 = f2;
                                float f5 = f;
                                InterfaceC88473Ynt<Float, Boolean, Boolean, C76800UCe> interfaceC88473Ynt = c55263LmV;
                                float floatValue = f3.floatValue();
                                float abs = Math.abs(f4 - f5);
                                if (abs < 1.0f) {
                                    abs = 1.0f;
                                }
                                float min = floatValue - Math.min(f5, f4);
                                if (min < 0.0f) {
                                    min = 0.0f;
                                }
                                Float valueOf = Float.valueOf(C78842Uww.LJIIJJI(min / abs, 0.0f, 1.0f));
                                Boolean bool = Boolean.FALSE;
                                interfaceC88473Ynt.invoke(valueOf, bool, bool);
                            }
                        }
                    });
                    ofFloat.start();
                }
            } else if (c786536v != null) {
                c786536v.setTranslationY(f2);
            }
        }
        this.LLFFF = z;
        boolean z4 = !z;
        this.LLFII = z4;
        MallRacunFragmentPanel mallRacunFragmentPanel = this.LLFF;
        if (mallRacunFragmentPanel != null && (viewPager = mallRacunFragmentPanel.getViewPager()) != null) {
            viewPager.setDisableScroll(!z4);
        }
        C786536v c786536v2 = this.LJLLL;
        if (c786536v2 != null) {
            c786536v2.setNeedIntercept(z);
        }
        MallRacunFragmentPanel mallRacunFragmentPanel2 = this.LLFF;
        if (mallRacunFragmentPanel2 != null) {
            mallRacunFragmentPanel2.LLIIJLIL(z);
        }
        MallRacunFragmentPanel mallRacunFragmentPanel3 = this.LLFF;
        if (mallRacunFragmentPanel3 != null) {
            mallRacunFragmentPanel3.LLJJJJ = z;
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LJLJL.getValue();
        assemViewModel.setState(new AqS11S0010000_6(z, 0));
        assemViewModel.setState(C35639Dyl.LJLIL);
        if (!z3 || z) {
            return;
        }
        ((AssemViewModel) this.LJLJL.getValue()).setState(new AqS11S0010000_6(false, 1));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        o.LJIIIZ(inflater, "inflater");
        View rootView = C16970lZ.LIZJ(R.layout.a04, mo49getActivity(), viewGroup, false);
        LFH.LIZIZ.LIZLLL().LJIILIIL();
        C53816LAe c53816LAe = C53816LAe.LIZ;
        MallRacunFragmentPanel mallRacunFragmentPanel = this.LLFF;
        if (mallRacunFragmentPanel == null || (str = mallRacunFragmentPanel.getSplitTag()) == null) {
            str = "";
        }
        o.LJIIIIZZ(rootView, "rootView");
        LKF LIZ = c53816LAe.LIZ(rootView, this, str);
        this.LLFZ = LIZ;
        View LJIILJJIL = LIZ.LJIILJJIL();
        C29S c29s = null;
        if (!(LJIILJJIL instanceof View)) {
            LJIILJJIL = null;
        }
        if (LJIILJJIL != null) {
            try {
                ViewTreeLifecycleOwner.set(LJIILJJIL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LJIILJJIL, this);
                C10A.LIZIZ(LJIILJJIL, this);
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
        return LJIILJJIL;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
