package com.ss.android.ugc.aweme.commercialize.profile;

import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C49634Jdu;
import X.C54886LgQ;
import X.C55456Lpc;
import X.C55457Lpd;
import X.C55788Luy;
import X.C56490MFa;
import X.C56525MGj;
import X.C58655N0h;
import X.C58704N2e;
import X.C65300Pk0;
import X.C6ZT;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C79004UzY;
import X.C90903hW;
import X.InterfaceC223218pR;
import X.InterfaceC56526MGk;
import X.KL2;
import X.MH9;
import X.OGG;
import Y.ACListenerS29S0100000_9;
import Y.IDLListenerS196S0100000_9;
import Y.IDrS48S0100000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AdFakeUserProfileAwemeListFragment extends AmeBaseFragment implements InterfaceC223218pR<Aweme>, OGG, MH9, InterfaceC56526MGk {
    public static final /* synthetic */ int LJLZ = 0;
    public RecyclerView LJLIL;
    public C73305Spp LJLILLLLZI;
    public WrapGridLayoutManager LJLJI;
    public C55456Lpc LJLJJI;
    public boolean LJLJLLL;
    public C55788Luy LJLL;
    public AwemeRawAd LJLLI;
    public long LJLLL;
    public boolean LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public String LJLJJL = "";
    public String LJLJJLL = "";
    public String LJLJL = "";
    public String LJLJLJ = "";
    public final List<String> LJLLILLLL = new ArrayList();
    public final Map<String, Boolean> LJLLJ = new HashMap();

    @Override // X.InterfaceC56526MGk
    public final void A8(boolean z) {
    }

    public final void Dl() {
        this.LJLLLL = false;
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        } else {
            o.LJIJI("mStatusView");
            throw null;
        }
    }

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
    }

    @Override // X.MH9
    public final /* synthetic */ void Q7(TuxTextView tuxTextView, Aweme aweme) {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.MH9
    public final /* synthetic */ void bl(int i, View view, Aweme aweme, String str) {
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<Aweme> list, boolean z) {
    }

    @Override // X.MH9
    public final /* synthetic */ void l2(Boolean bool) {
    }

    @Override // X.MH9
    public final /* synthetic */ void p4(Boolean bool) {
    }

    @Override // X.MH9
    public final /* synthetic */ void yb(View view, Aweme aweme, String str) {
    }

    public final void Al() {
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            C73305Spp c73305Spp2 = this.LJLILLLLZI;
            if (c73305Spp2 != null) {
                c73305Spp2.LJFF();
                C73305Spp c73305Spp3 = this.LJLILLLLZI;
                if (c73305Spp3 != null) {
                    C16880lQ.LJIIJJI(null, c73305Spp3);
                    this.LJLLLL = true;
                    return;
                } else {
                    o.LJIJI("mStatusView");
                    throw null;
                }
            }
            o.LJIJI("mStatusView");
            throw null;
        }
        o.LJIJI("mStatusView");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        C55788Luy c55788Luy = this.LJLL;
        if (c55788Luy != null && c55788Luy.getItemCount() == 0) {
            Al();
        }
    }

    public final void wl() {
        C55788Luy c55788Luy = this.LJLL;
        if (c55788Luy != null) {
            C55456Lpc c55456Lpc = this.LJLJJI;
            if (c55456Lpc != null) {
                Object[] objArr = new Object[8];
                objArr[0] = this.LJLJJLL;
                int i = 1;
                objArr[1] = this.LJLJL;
                objArr[2] = Long.valueOf(this.LJLLL);
                objArr[3] = 0L;
                objArr[4] = 6;
                List<T> list = c55788Luy.mmItems;
                if (list != 0 && list.size() != 0) {
                    i = 4;
                }
                objArr[5] = Integer.valueOf(i);
                objArr[6] = this.LJLJLJ;
                objArr[7] = this.LJLJJL;
                c55456Lpc.LJIILL(objArr);
                return;
            }
            o.LJIJI("mPresenter");
            throw null;
        }
    }

    public final void xl() {
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            C73305Spp c73305Spp2 = this.LJLILLLLZI;
            if (c73305Spp2 != null) {
                C73306Spq c73306Spq = new C73306Spq();
                String string = getString(R.string.hvg);
                o.LJIIIIZZ(string, "getString(R.string.load_status_error)");
                c73306Spq.LJI = string;
                c73305Spp2.setStatus(c73306Spq);
                C73305Spp c73305Spp3 = this.LJLILLLLZI;
                if (c73305Spp3 != null) {
                    C16880lQ.LJIIJJI(new ACListenerS29S0100000_9(this, 11), c73305Spp3);
                    this.LJLLLL = false;
                    return;
                } else {
                    o.LJIJI("mStatusView");
                    throw null;
                }
            }
            o.LJIJI("mStatusView");
            throw null;
        }
        o.LJIJI("mStatusView");
        throw null;
    }

    @Override // X.OGG
    public final View LJIJJ() {
        if (!isViewValid()) {
            return null;
        }
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("mListView");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        if (!isViewValid()) {
            return;
        }
        xl();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        if (!isViewValid()) {
            return;
        }
        C55788Luy c55788Luy = this.LJLL;
        if (c55788Luy != null && c55788Luy.getItemCount() == 0) {
            Al();
        }
        C55788Luy c55788Luy2 = this.LJLL;
        if (c55788Luy2 != null) {
            c55788Luy2.showLoadMoreLoading();
        }
    }

    @Override // X.InterfaceC56526MGk
    public final void LIZJ() {
        wl();
    }

    @Override // X.InterfaceC56526MGk
    public final boolean hasMore() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        List<Aweme> list;
        C55788Luy c55788Luy;
        if (!isViewValid()) {
            return;
        }
        xl();
        C55788Luy c55788Luy2 = this.LJLL;
        if (c55788Luy2 != null) {
            list = c55788Luy2.getData();
        } else {
            list = null;
        }
        if (!C79004UzY.LJJIFFI(list) && (c55788Luy = this.LJLL) != null) {
            c55788Luy.clearData();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        C55788Luy c55788Luy = this.LJLL;
        if (c55788Luy != null && c55788Luy.getItemCount() == 0) {
            Dl();
        }
        C55788Luy c55788Luy2 = this.LJLL;
        if (c55788Luy2 != null) {
            c55788Luy2.showPullUpLoadMore();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C55788Luy c55788Luy;
        List<T> list;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-5406267302252051903");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/commercialize/profile/AdFakeUserProfileAwemeListFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/profile/AdFakeUserProfileAwemeListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z && ((c55788Luy = this.LJLL) == null || c55788Luy.mmItems == null || (c55788Luy != null && (list = c55788Luy.mmItems) != 0 && list.size() == 0))) {
            wl();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/profile/AdFakeUserProfileAwemeListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void vl(boolean z) {
        int i;
        C55788Luy c55788Luy;
        List<T> list;
        Aweme aweme;
        List<T> list2;
        WrapGridLayoutManager wrapGridLayoutManager = this.LJLJI;
        if (wrapGridLayoutManager != null) {
            int LLILLJJLI = wrapGridLayoutManager.LLILLJJLI();
            ((ArrayList) this.LJLLILLLL).clear();
            if (z && LLILLJJLI >= 5) {
                LLILLJJLI = 5;
            }
            int i2 = LLILLJJLI + 1;
            for (int LLILL = wrapGridLayoutManager.LLILL(); LLILL < i2; LLILL++) {
                C55788Luy c55788Luy2 = this.LJLL;
                if (c55788Luy2 != null && (list2 = c55788Luy2.mmItems) != 0) {
                    i = list2.size();
                } else {
                    i = 0;
                }
                if (LLILL >= i || (c55788Luy = this.LJLL) == null || (list = c55788Luy.mmItems) == 0 || (aweme = (Aweme) ListProtector.get(list, LLILL)) == null) {
                    return;
                }
                String aid = aweme.getAid();
                Boolean bool = (Boolean) ((HashMap) this.LJLLJ).get(aid);
                if (bool == null || !bool.booleanValue()) {
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "othershow", this.LJLLI);
                    LIZLLL.LIZJ("video_cover", "refer");
                    LIZLLL.LIZIZ(aweme.getAid(), "item_id");
                    LIZLLL.LJI();
                }
                Map<String, Boolean> map = this.LJLLJ;
                o.LJIIIIZZ(aid, "aid");
                ((HashMap) map).put(aid, Boolean.TRUE);
                ((ArrayList) this.LJLLILLLL).add(aid);
            }
            for (Object obj : ((HashMap) this.LJLLJ).keySet()) {
                if (!((ArrayList) this.LJLLILLLL).contains(obj)) {
                    ((HashMap) this.LJLLJ).put(obj, Boolean.FALSE);
                }
            }
            return;
        }
        o.LJIJI("mLayoutManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        if (isViewValid()) {
            C55788Luy c55788Luy = this.LJLL;
            if (c55788Luy != null) {
                c55788Luy.resetLoadMoreState();
            }
            C55456Lpc c55456Lpc = this.LJLJJI;
            if (c55456Lpc != null) {
                T t = c55456Lpc.LJLIL;
                o.LJII(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.FakeUserAwemeModel");
                T t2 = t.mData;
                if (t2 != 0 && ((FeedItemList) t2).getItems() != null && ((FeedItemList) t.mData).getItems().size() != 0) {
                    int size = ((FeedItemList) t.mData).getItems().size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.set(((FeedItemList) t.mData).getItems(), i, AwemeService.LIZ().R1((Aweme) ListProtector.get(((FeedItemList) t.mData).getItems(), i)));
                    }
                }
                C55788Luy c55788Luy2 = this.LJLL;
                if (c55788Luy2 != null) {
                    c55788Luy2.setData(list);
                }
                this.LJLJLLL = z;
                C55788Luy c55788Luy3 = this.LJLL;
                if (c55788Luy3 != null && c55788Luy3.getBasicItemCount() == 0 && !z && this.LJLLLL) {
                    Dl();
                    return;
                }
                if (C79004UzY.LJJIFFI(list) && z) {
                    wl();
                    return;
                } else {
                    if (C79004UzY.LJJIFFI(list)) {
                        return;
                    }
                    Dl();
                    return;
                }
            }
            o.LJIJI("mPresenter");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.d3x);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.fake_user_aweme_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLIL = recyclerView;
        recyclerView.setOnFlingListener(new C56525MGj(recyclerView, this));
        View findViewById2 = view.findViewById(R.id.d47);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.fake_user_status_view)");
        this.LJLILLLLZI = (C73305Spp) findViewById2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("user_id");
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        this.LJLJJLL = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("sec_user_id")) == null) {
            str2 = "";
        }
        this.LJLJL = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str3 = arguments3.getString("aweme_id")) == null) {
            str3 = "";
        }
        this.LJLJJL = str3;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string = arguments4.getString("adv_id")) != null) {
            str4 = string;
        }
        this.LJLJLJ = str4;
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 != null) {
            recyclerView2.setOverScrollMode(2);
            mo49getActivity();
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(2, 1, false);
            this.LJLJI = wrapGridLayoutManager;
            RecyclerView recyclerView3 = this.LJLIL;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(wrapGridLayoutManager);
                RecyclerView recyclerView4 = this.LJLIL;
                if (recyclerView4 != null) {
                    recyclerView4.LJII(new C49634Jdu(2, (int) KL2.LIZJ(getContext(), 1.0f)), -1);
                    RecyclerView recyclerView5 = this.LJLIL;
                    if (recyclerView5 != null) {
                        recyclerView5.LJIIJJI(new C56490MFa());
                        C55788Luy c55788Luy = new C55788Luy(this);
                        this.LJLL = c55788Luy;
                        String curAwemeId = this.LJLJJL;
                        o.LJIIIZ(curAwemeId, "curAwemeId");
                        c55788Luy.LJLJJI = curAwemeId;
                        RecyclerView recyclerView6 = this.LJLIL;
                        if (recyclerView6 != null) {
                            recyclerView6.setAdapter(this.LJLL);
                            RecyclerView recyclerView7 = this.LJLIL;
                            if (recyclerView7 != null) {
                                recyclerView7.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS196S0100000_9(this, 0));
                                C55456Lpc c55456Lpc = new C55456Lpc();
                                this.LJLJJI = c55456Lpc;
                                c55456Lpc.LJLILLLLZI = this;
                                C54886LgQ c54886LgQ = new C54886LgQ();
                                C55456Lpc c55456Lpc2 = this.LJLJJI;
                                if (c55456Lpc2 != null) {
                                    c55456Lpc2.LJJ(c54886LgQ);
                                    IDrS48S0100000_9 iDrS48S0100000_9 = new IDrS48S0100000_9(this, 0);
                                    RecyclerView recyclerView8 = this.LJLIL;
                                    if (recyclerView8 != null) {
                                        recyclerView8.LJIIJJI(iDrS48S0100000_9);
                                        return;
                                    } else {
                                        o.LJIJI("mListView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("mPresenter");
                                throw null;
                            }
                            o.LJIJI("mListView");
                            throw null;
                        }
                        o.LJIJI("mListView");
                        throw null;
                    }
                    o.LJIJI("mListView");
                    throw null;
                }
                o.LJIJI("mListView");
                throw null;
            }
            o.LJIJI("mListView");
            throw null;
        }
        o.LJIJI("mListView");
        throw null;
    }

    @Override // X.MH9
    public final void LLLILZ(View view, Aweme aweme, String str) {
        if (!C6ZT.LIZ(view) && aweme != null && mo49getActivity() != null) {
            C55456Lpc c55456Lpc = this.LJLJJI;
            if (c55456Lpc != null) {
                C55457Lpd.LJLJJLL = (AbstractC51036K1g) c55456Lpc.LJLIL;
                Bundle bundle = new Bundle();
                bundle.putString("id", aweme.getAid());
                bundle.putString("userid", this.LJLJJLL);
                bundle.putString("sec_userid", this.LJLJL);
                bundle.putString("refer", "new_ad_fake_user");
                bundle.putString("video_from", "from_ad_new_fake_user");
                bundle.putString("feed_ad_aweme_id", this.LJLJJL);
                bundle.putString("feed_adv_id", this.LJLJLJ);
                bundle.putLong("max_cursor", this.LJLLL);
                SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "aweme://aweme/detail/");
                buildRoute.withParam(bundle);
                buildRoute.open();
                C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "otherclick", this.LJLLI);
                LIZLLL.LIZJ("video_cover", "refer");
                LIZLLL.LIZIZ(aweme.getAid(), "item_id");
                LIZLLL.LJI();
                return;
            }
            o.LJIJI("mPresenter");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c4a, viewGroup, false);
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
