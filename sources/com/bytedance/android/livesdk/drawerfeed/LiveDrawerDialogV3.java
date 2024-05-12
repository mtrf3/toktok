package com.bytedance.android.livesdk.drawerfeed;

import X.ActivityC45651qj;
import X.B4J;
import X.B4K;
import X.B83;
import X.BJB;
import X.BOE;
import X.BON;
import X.BOO;
import X.BOP;
import X.BOQ;
import X.BOR;
import X.BOT;
import X.BTJ;
import X.BUC;
import X.BZI;
import X.BZM;
import X.C025107z;
import X.C06490Nh;
import X.C08680Vs;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15790jf;
import X.C16330kX;
import X.C1B3;
import X.C1B6;
import X.C1EW;
import X.C20910rv;
import X.C28731BPj;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C3C5;
import X.C45804HyK;
import X.C72972SkS;
import X.C73318Sq2;
import X.C73943T0h;
import X.C76800UCe;
import X.C80261Vej;
import X.C90903hW;
import X.CN1;
import X.KL2;
import X.LHW;
import X.ORZ;
import X.Q7L;
import X.X1D;
import Y.AfS25S0110000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.feed.api.DrawerTypeChangeEvent;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsApi;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerTabTypeSetting;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerDrawOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerLoadOptSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveDrawerDialogV3 extends BaseFragment implements B4K {
    public BZM LJLIL;
    public Bundle LJLILLLLZI;
    public DrawerLayout$DrawerListener LJLJI;
    public long LJLJJL;
    public DataChannel LJLJJLL;
    public BOO LJLJL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public BOR LJLLJ;
    public List<DrawerTabsItem> LJLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public String LJZI;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public final C73318Sq2 LJLJJI = new C73318Sq2();
    public final Map<String, Fragment> LJLJLJ = new LinkedHashMap();
    public final Map<String, String> LJLJLLL = new LinkedHashMap();
    public int LJLL = Integer.MAX_VALUE;
    public final List<DrawerTabsItem> LJLLLL = new ArrayList();
    public boolean LJZ = true;
    public final BOE LJZL = new BOE(this);
    public final BOQ LL = new BOQ(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLD;
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

    public final void Ll() {
        if (o.LJ("game_drawer_drops", C08680Vs.LJIILJJIL.LJIIIIZZ)) {
            ((TextView) _$_findCachedViewById(R.id.c_o)).setText(C15380j0.LJIILJJIL(R.string.lap));
            _$_findCachedViewById(R.id.c_o).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.c_o).setVisibility(8);
        }
    }

    public final void vl() {
        Fragment wl = wl(this.LJZI, true);
        if (wl != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            if (!wl.isAdded()) {
                LIZ.LJIIIIZZ(R.id.hhs, 1, wl, null);
            } else {
                LIZ.LJIIL(wl);
            }
            LIZ.LJI();
        }
        _$_findCachedViewById(R.id.chl).setVisibility(8);
        _$_findCachedViewById(R.id.chk).setVisibility(8);
        _$_findCachedViewById(R.id.kz6).setVisibility(0);
        _$_findCachedViewById(R.id.hhs).setVisibility(0);
        Ll();
    }

    public final boolean Dl() {
        Context context;
        View _$_findCachedViewById;
        View _$_findCachedViewById2;
        Context context2;
        if (getContext() != null && (context = getContext()) != null && context.getApplicationInfo() != null && _$_findCachedViewById(R.id.chi) != null && (_$_findCachedViewById = _$_findCachedViewById(R.id.chi)) != null && _$_findCachedViewById.getContext() != null && (_$_findCachedViewById2 = _$_findCachedViewById(R.id.chi)) != null && (context2 = _$_findCachedViewById2.getContext()) != null && context2.getApplicationInfo() != null && ((C025107z) _$_findCachedViewById(R.id.chi)).isDrawerOpen(8388613) && C16330kX.LIZIZ(_$_findCachedViewById(R.id.chi))) {
            return true;
        }
        return false;
    }

    @Override // X.B4K
    public final boolean dg() {
        return Dl();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLLLLLL = false;
        this.LJLJJI.LIZLLL();
        BJB.LJ(true);
        BJB.LIZLLL(false);
        BJB.LJ = false;
        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
        c08680Vs.getClass();
        c08680Vs.LJIIJJI = "";
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // X.B4K
    public final BZM x2() {
        return this.LJLIL;
    }

    public final void Al(boolean z) {
        if (LiveDrawerTabTypeSetting.INSTANCE.getValue() == 0) {
            return;
        }
        List<DrawerTabsItem> list = this.LJLLL;
        if (list != null) {
            if (!z) {
                Jl(list, z);
            }
        } else {
            this.LJLJJI.LIZ(C1EW.LIZ(((DrawerTabsApi) Q7L.LIZIZ(DrawerTabsApi.class)).queryDrawerTabs(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())).LJII(BTJ.LIZIZ(this)).LJJJLIIL(new AfS25S0110000_5(this, z, 1), new AfS25S0110000_5(this, z, 2)));
        }
    }

    public final void Gl(boolean z) {
        boolean z2;
        boolean z3;
        Room room;
        String str;
        LiveDrawerLoadOptSetting liveDrawerLoadOptSetting = LiveDrawerLoadOptSetting.INSTANCE;
        if (liveDrawerLoadOptSetting.getValue() != null) {
            z2 = liveDrawerLoadOptSetting.getValue().isLandingGame;
        } else {
            z2 = false;
        }
        if (LiveDrawerTabTypeSetting.INSTANCE.getValue() == 2 || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !this.LJLLLLLL && ((Dl() || z) && (room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class)) != null && (str = room.drawerTabPosition) != null)) {
            int size = ((ArrayList) this.LJLLLL).size();
            for (int i = 0; i < size; i++) {
                if (TextUtils.equals(((DrawerTabsItem) ListProtector.get(this.LJLLLL, i)).tabType, str)) {
                    this.LJLLLLLL = true;
                    DrawerLoadOpt value = LiveDrawerLoadOptSetting.INSTANCE.getValue();
                    if (value != null && value.isPreLoadingGameUI) {
                        this.LJZ = false;
                    }
                    ((ViewPager) _$_findCachedViewById(R.id.chl)).setCurrentItem(i);
                    C08680Vs.LJIILJJIL.LJII = str;
                    Hl("personal", str);
                    this.LJLZ = true;
                }
            }
        }
        if (!this.LJLZ && !this.LJLLLLLL) {
            if (Dl() || z) {
                this.LJLLLLLL = true;
                this.LJZ = true;
                ((ViewPager) _$_findCachedViewById(R.id.chl)).setCurrentItem(0);
                C08680Vs.LJIILJJIL.LJII = "foru";
                Hl("default", "foru");
            }
        }
    }

    public final void Il(String str) {
        if (o.LJ(str, "game_drawer_drops")) {
            Object obj = ((LinkedHashMap) this.LJLJLLL).get(str);
            String str2 = C08680Vs.LJIILJJIL.LJIIIZ;
            if (str2.length() > 0 && !o.LJ(obj, str2)) {
                this.LJLJLLL.put("game_drawer_drops", str2);
                Fragment wl = wl(str, false);
                if (wl != null) {
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
                    if (wl.isAdded()) {
                        LIZ.LJIIIZ(wl);
                        LIZ.LJJI(wl);
                        LIZ.LJI();
                    }
                    this.LJLJLJ.remove(str);
                }
            }
        }
        this.LJZI = str;
    }

    public final void Kl(boolean z) {
        int i;
        Il(C08680Vs.LJIILJJIL.LJIIIIZZ);
        boolean z2 = true;
        if (ORZ.LJLJJI(this.LJZI, C08680Vs.LJIJI)) {
            vl();
            ((BUC) _$_findCachedViewById(R.id.chi)).setViewPagerPos(0);
            Fragment wl = wl(this.LJZI, true);
            if (wl == null) {
                return;
            }
            wl.setUserVisibleHint(true);
            return;
        }
        BOO boo = this.LJLJL;
        if (boo == null) {
            if (LiveDrawerTabTypeSetting.INSTANCE.getValue() == 0) {
                Jl(null, z);
                return;
            }
            List<DrawerTabsItem> list = B4J.LIZIZ;
            if (list != null) {
                Jl(list, z);
                return;
            } else {
                Al(false);
                return;
            }
        }
        Fragment fragment = boo.LJLLI;
        if (fragment != null) {
            fragment.setUserVisibleHint(true);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        List<DrawerTabsItem> list2 = this.LJLLL;
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        if (!z || mo49getActivity == null) {
            return;
        }
        LiveDrawerLoadOptSetting liveDrawerLoadOptSetting = LiveDrawerLoadOptSetting.INSTANCE;
        if (liveDrawerLoadOptSetting.getValue() == null) {
            return;
        }
        DrawerLoadOpt value = liveDrawerLoadOptSetting.getValue();
        boolean z3 = value.isPreLoadingForuUI;
        if (i <= 0 || !value.isPreLoadingGameUI) {
            z2 = false;
        }
        if (z3) {
            ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).lu(mo49getActivity, "foru");
        }
        if (!z2) {
            return;
        }
        ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).lu(mo49getActivity, "game");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        int LIZJ;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (C29306Beo.LJIIZILJ(newConfig.orientation)) {
            LIZJ = this.LJLL;
            int LJIIJJI = KL2.LJIIJJI(mo49getActivity());
            if (LIZJ > LJIIJJI) {
                LIZJ = LJIIJJI;
            }
            this.LJLL = LIZJ;
        } else {
            int i = this.LJLL;
            int LJIIJJI2 = KL2.LJIIJJI(mo49getActivity());
            if (i > LJIIJJI2) {
                i = LJIIJJI2;
            }
            LIZJ = (int) (i - KL2.LIZJ(mo49getActivity(), 50.0f));
        }
        if (LIZJ <= 0) {
            return;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hht);
        if (_$_findCachedViewById != null) {
            layoutParams = _$_findCachedViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = LIZJ;
            }
        } else {
            layoutParams = null;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hht);
        if (_$_findCachedViewById2 == null) {
            return;
        }
        _$_findCachedViewById2.setLayoutParams(layoutParams);
    }

    @Override // X.B4K
    public final void setDataChannel(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLJJLL = dataChannel;
    }

    public final String xl(boolean z) {
        if (this.LJLLILLLL && z) {
            String qY = ((IHostPersonalized) CN1.LIZ(IHostPersonalized.class)).qY(2);
            if (qY == null) {
                return "";
            }
            return qY;
        }
        String string = getString(R.string.kxw);
        o.LJIIIIZZ(string, "{\n            getString(…al_for_you_tab)\n        }");
        return string;
    }

    public final void Hl(String str, String str2) {
        BZI LIZ = C28787BRn.LIZ("livesdk_drawer_tab_landing");
        LIZ.LJIILLIIL(this.LJLJJLL);
        C06490Nh.LIZLLL(LIZ, str, "landing_reason", str2, "tab_type");
        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
        c08680Vs.getClass();
        c08680Vs.LJIIJJI = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r0.LIZLLL != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x002d, code lost:
    
        if (r13 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jl(java.util.List r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3.Jl(java.util.List, boolean):void");
    }

    @Override // X.B4K
    public final void T5(boolean z, boolean z2) {
        C025107z c025107z = (C025107z) _$_findCachedViewById(R.id.chi);
        if (c025107z != null && C16330kX.LIZIZ(c025107z)) {
            if (z) {
                c025107z.openDrawer(8388613, z2);
            } else {
                if (!Dl()) {
                    return;
                }
                c025107z.closeDrawer(8388613, z2);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        ActivityC45651qj LJJIFFI;
        Window window;
        o.LJIIIZ(view, "view");
        this.LJLLILLLL = BOT.LIZ();
        super.onViewCreated(view, bundle);
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C15790jf.class).LJJJJZI(new AfS57S0100000_5(this, 101)));
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(DrawerTypeChangeEvent.class).LJJJJZI(new AfS57S0100000_5(this, 102)));
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(BOR.class).LJJJJZI(new AfS57S0100000_5(this, 103)));
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C28731BPj.class).LJJJJZI(new AfS57S0100000_5(this, 104)));
        BZM bzm = this.LJLIL;
        if (bzm != null) {
            bzm.setDrawerLayout((C025107z) _$_findCachedViewById(R.id.chi));
        }
        ((C025107z) _$_findCachedViewById(R.id.chi)).addDrawerListener(this.LJZL);
        DrawerLayout$DrawerListener drawerLayout$DrawerListener = this.LJLJI;
        if (drawerLayout$DrawerListener != null) {
            ((C025107z) _$_findCachedViewById(R.id.chi)).addDrawerListener(drawerLayout$DrawerListener);
        }
        int LJIIJJI = (int) (KL2.LJIIJJI(getContext()) - KL2.LIZJ(getContext(), 50.0f));
        if (LJIIJJI > 0) {
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.hht).getLayoutParams();
            layoutParams.width = LJIIJJI;
            _$_findCachedViewById(R.id.hht).setLayoutParams(layoutParams);
        }
        int i = this.LJLL;
        int LJIIJJI2 = KL2.LJIIJJI(getContext());
        if (i > LJIIJJI2) {
            i = LJIIJJI2;
        }
        this.LJLL = i;
        ((C80261Vej) _$_findCachedViewById(R.id.chk)).setupWithViewPager((ViewPager) _$_findCachedViewById(R.id.chl));
        ((C80261Vej) _$_findCachedViewById(R.id.chk)).addOnTabSelectedListener((LHW) new BOP(this));
        ((ViewPager) _$_findCachedViewById(R.id.chl)).addOnPageChangeListener(new BON(this));
        BJB.LJ = false;
        if (LiveDrawerDrawOptSetting.INSTANCE.isOpt() && (context = getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (window = LJJIFFI.getWindow()) != null) {
            window.setBackgroundDrawable(null);
        }
    }

    public final Fragment wl(String str, boolean z) {
        boolean z2;
        String str2;
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        str.toString();
        if (this.LJLJLJ.containsKey(str)) {
            return (Fragment) ((LinkedHashMap) this.LJLJLJ).get(str);
        }
        if (!z) {
            return null;
        }
        if (o.LJ(str, "game_drawer_drops")) {
            StringBuilder LJFF = C72972SkS.LJFF(str, '_');
            LJFF.append((String) ((LinkedHashMap) this.LJLJLLL).get("game_drawer_drops"));
            str2 = X1D.LIZIZ(LJFF);
        } else {
            str2 = str;
        }
        DrawerFeedLiveFragmentV2 drawerFeedFragment = ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).iu0(this.LL, str2);
        Map<String, Fragment> map = this.LJLJLJ;
        o.LJIIIIZZ(drawerFeedFragment, "drawerFeedFragment");
        map.put(str, drawerFeedFragment);
        return drawerFeedFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LJI;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        if (!LiveDrawerDrawOptSetting.INSTANCE.isOpt()) {
            LJI = C20910rv.LJI(R.layout.amo, viewGroup, false, 12);
        } else {
            LJI = C20910rv.LJI(R.layout.amp, viewGroup, false, 12);
        }
        try {
            ViewTreeLifecycleOwner.set(LJI, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LJI, this);
            C10A.LIZIZ(LJI, this);
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
        return LJI;
    }
}
