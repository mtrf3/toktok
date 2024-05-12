package com.ss.android.ugc.aweme.kids.commonfeed.ui;

import X.AFM;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C29S;
import X.C3C5;
import X.C42625Go9;
import X.C48203Ivv;
import X.C55121LkD;
import X.C55995LyJ;
import X.C61878OQg;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73411SrX;
import X.C73969T1h;
import X.C76800UCe;
import X.C90903hW;
import X.KRB;
import X.OB7;
import X.OB8;
import X.OB9;
import X.OBA;
import X.QD3;
import Y.ACListenerS30S0100000_10;
import Y.AObserverS77S0100000_9;
import Y.AObserverS78S0100000_10;
import Y.AfS58S0100000_6;
import Y.IDhS99S0100000_6;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.kids.commonfeed.panel.BaseFeedPanel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class KidsFeedFragment extends AmeBaseFragment {
    public static boolean LJZ;
    public boolean LJLJJL;
    public OB7 LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public C55995LyJ LJLJLLL;
    public C55121LkD LJLL;
    public C73305Spp LJLLI;
    public View LJLLILLLL;
    public TuxTextView LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public KidsFeedViewModel LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 246));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 245));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 248));
    public final BaseFeedPanel LJLJJI = new BaseFeedPanel(null, null, 3, null);

    public final void hideStatusView() {
        C73305Spp c73305Spp = this.LJLLI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
            View view = this.LJLLILLLL;
            if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                o.LJIJI("statusBackgroundView");
                throw null;
            }
        }
        o.LJIJI("statusView");
        throw null;
    }

    public final void sk() {
        boolean z;
        C73411SrX c73411SrX;
        OB7 ob7 = this.LJLJJLL;
        if (ob7 != null && ob7.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C55995LyJ c55995LyJ = this.LJLJLLL;
            if (c55995LyJ != null) {
                c55995LyJ.setRefreshing(false);
                return;
            } else {
                o.LJIJI("refreshLayout");
                throw null;
            }
        }
        Context context = getContext();
        if (context != null && !C48203Ivv.LJ(context)) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            C55995LyJ c55995LyJ2 = this.LJLJLLL;
            if (c55995LyJ2 != null) {
                if (c55995LyJ2.LJLJI) {
                    c55995LyJ2.setRefreshing(false);
                    return;
                }
                return;
            }
            o.LJIJI("refreshLayout");
            throw null;
        }
        KidsFeedViewModel kidsFeedViewModel = this.LJLLLLLL;
        if (kidsFeedViewModel != null) {
            if (kidsFeedViewModel.LJLIL == null) {
                return;
            }
            C73411SrX c73411SrX2 = kidsFeedViewModel.LJLJL;
            if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = kidsFeedViewModel.LJLJL) != null) {
                c73411SrX.dispose();
            }
            kidsFeedViewModel.LJLJL = (C73411SrX) kidsFeedViewModel.LJLIL.refresh().LJJIJL(new IDhS99S0100000_6(kidsFeedViewModel, 13)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS58S0100000_6(kidsFeedViewModel, 54), new AfS58S0100000_6(kidsFeedViewModel, 55));
            return;
        }
        o.LJIJI("feedViewModel");
        throw null;
    }

    public final void wl() {
        C73305Spp c73305Spp = this.LJLLI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            View view = this.LJLLILLLL;
            if (view != null) {
                view.setVisibility(0);
                return;
            } else {
                o.LJIJI("statusBackgroundView");
                throw null;
            }
        }
        o.LJIJI("statusView");
        throw null;
    }

    public final void z4() {
        C73411SrX c73411SrX;
        OB7 ob7 = this.LJLJJLL;
        if (ob7 != null && ob7.LJIILJJIL()) {
            Context context = getContext();
            if (context != null && !C48203Ivv.LJ(context)) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
                return;
            }
            KidsFeedViewModel kidsFeedViewModel = this.LJLLLLLL;
            if (kidsFeedViewModel != null) {
                if (kidsFeedViewModel.LJLIL == null) {
                    return;
                }
                C73411SrX c73411SrX2 = kidsFeedViewModel.LJLJLJ;
                if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = kidsFeedViewModel.LJLJLJ) != null) {
                    c73411SrX.dispose();
                }
                kidsFeedViewModel.LJLJLJ = (C73411SrX) kidsFeedViewModel.LJLIL.LJIIJJI().LJJIJL(new IDhS99S0100000_6(kidsFeedViewModel, 12)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS58S0100000_6(kidsFeedViewModel, 52), new AfS58S0100000_6(kidsFeedViewModel, 53));
                return;
            }
            o.LJIJI("feedViewModel");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LJZ = true;
        C42625Go9.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<KRB> registerComponents() {
        SparseArray<KRB> registerComponents = super.registerComponents();
        o.LJIIIIZZ(registerComponents, "super.registerComponents()");
        registerComponents.append(0, this.LJLJJI);
        return registerComponents;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onChangeDiggEvent(OB8 event) {
        int i;
        o.LJIIIZ(event, "event");
        KidsFeedViewModel kidsFeedViewModel = this.LJLLLLLL;
        if (kidsFeedViewModel != null) {
            List<Aweme> value = kidsFeedViewModel.LJLILLLLZI.getValue();
            if (value == null) {
                value = C61878OQg.INSTANCE;
            }
            for (Aweme aweme : value) {
                if (aweme.getAid().equals(event.LJLIL)) {
                    aweme.setUserDigg(event.LJLILLLLZI ? 1 : 0);
                    AwemeStatistics statistics = aweme.getStatistics();
                    long diggCount = statistics.getDiggCount();
                    if (event.LJLILLLLZI) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    statistics.setDiggCount(diggCount + i);
                    return;
                }
            }
            return;
        }
        o.LJIJI("feedViewModel");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42625Go9.LIZIZ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReportEvent(AFM event) {
        o.LJIIIZ(event, "event");
        this.LJLJLJ = true;
        KidsFeedViewModel kidsFeedViewModel = this.LJLLLLLL;
        if (kidsFeedViewModel != null) {
            List<Aweme> value = kidsFeedViewModel.LJLILLLLZI.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            Iterator<Aweme> it = value.iterator();
            while (it.hasNext()) {
                if (it.next().getAid().equals(event.LJLIL)) {
                    it.remove();
                }
            }
            kidsFeedViewModel.LJLILLLLZI.postValue(value);
            return;
        }
        o.LJIJI("feedViewModel");
        throw null;
    }

    public final void vl(int i) {
        if (i != -2) {
            if (i != -1) {
                if (i == 0) {
                    this.LJLJJL = true;
                    hideStatusView();
                }
            } else {
                wl();
                C73305Spp c73305Spp = this.LJLLI;
                if (c73305Spp != null) {
                    C73306Spq c73306Spq = new C73306Spq();
                    String string = getString(R.string.ht9);
                    o.LJIIIIZZ(string, "getString(R.string.list_empty)");
                    c73306Spq.LJI = string;
                    c73305Spp.setStatus(c73306Spq);
                    this.LJLJJI.handlePagePause(false);
                } else {
                    o.LJIJI("statusView");
                    throw null;
                }
            }
        } else {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            if (this.LJLJJL) {
                hideStatusView();
            } else {
                C73305Spp c73305Spp2 = this.LJLLI;
                if (c73305Spp2 != null) {
                    C73306Spq c73306Spq2 = new C73306Spq();
                    C73312Spw.LJI(c73306Spq2, new AqS160S0100000_10(this, 247));
                    c73305Spp2.setStatus(c73306Spq2);
                    wl();
                } else {
                    o.LJIJI("statusView");
                    throw null;
                }
            }
            this.LJLJJI.handlePagePause(false);
        }
        C55995LyJ c55995LyJ = this.LJLJLLL;
        if (c55995LyJ != null) {
            if (c55995LyJ.LJLJI) {
                c55995LyJ.setRefreshing(false);
                return;
            }
            return;
        }
        o.LJIJI("refreshLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        C73411SrX c73411SrX;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        BaseFeedPanel baseFeedPanel = this.LJLJJI;
        String enterFrom = (String) this.LJLIL.getValue();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        baseFeedPanel.setEnterFrom(enterFrom);
        this.LJLJJI.setCategoryId((String) this.LJLILLLLZI.getValue());
        this.LJLJJI.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.d6x);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.feed_base_refresh_layout)");
        this.LJLJLLL = (C55995LyJ) findViewById;
        View findViewById2 = view.findViewById(R.id.d6w);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.feed_base_loadmore_layout)");
        this.LJLL = (C55121LkD) findViewById2;
        View findViewById3 = view.findViewById(R.id.d6y);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.feed_base_status_view)");
        this.LJLLI = (C73305Spp) findViewById3;
        View findViewById4 = view.findViewById(R.id.kei);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.status_background_view)");
        this.LJLLILLLL = findViewById4;
        View findViewById5 = view.findViewById(R.id.d76);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.f…d_common_detail_textview)");
        this.LJLLJ = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.d6t);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.feed_base_bottom_space)");
        this.LJLLLL = findViewById6;
        this.LJLJJI.setCheckLoadMoreListener(new AqS160S0100000_10(this, 563));
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        if (!C48203Ivv.LJ(context)) {
            C73305Spp c73305Spp = this.LJLLI;
            if (c73305Spp != null) {
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new AqS160S0100000_10(this, 564));
                c73305Spp.setStatus(c73306Spq);
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        } else {
            C73305Spp c73305Spp2 = this.LJLLI;
            if (c73305Spp2 != null) {
                c73305Spp2.LJFF();
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        }
        C55995LyJ c55995LyJ = this.LJLJLLL;
        if (c55995LyJ != null) {
            OB7 ob7 = this.LJLJJLL;
            if (ob7 != null && ob7.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            c55995LyJ.setCanTouch(z);
            C55995LyJ c55995LyJ2 = this.LJLJLLL;
            if (c55995LyJ2 != null) {
                c55995LyJ2.setOnRefreshListener(new OB9(this));
                C55121LkD c55121LkD = this.LJLL;
                if (c55121LkD != null) {
                    c55121LkD.setLoadMoreListener(new OBA(this));
                    View findViewById7 = view.findViewById(R.id.d74);
                    o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.feed_common_back_button)");
                    this.LJLLL = findViewById7;
                    OB7 ob72 = this.LJLJJLL;
                    if (ob72 != null && ob72.LIZIZ()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        View view2 = this.LJLLL;
                        if (view2 != null) {
                            view2.setVisibility(0);
                            View view3 = this.LJLLL;
                            if (view3 != null) {
                                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 180), view3);
                            } else {
                                o.LJIJI("backButton");
                                throw null;
                            }
                        } else {
                            o.LJIJI("backButton");
                            throw null;
                        }
                    } else {
                        View view4 = this.LJLLL;
                        if (view4 != null) {
                            view4.setVisibility(8);
                        } else {
                            o.LJIJI("backButton");
                            throw null;
                        }
                    }
                    TuxTextView tuxTextView = this.LJLLJ;
                    if (tuxTextView != null) {
                        tuxTextView.setText((String) this.LJLJI.getValue());
                        KidsFeedViewModel kidsFeedViewModel = new KidsFeedViewModel(this.LJLJJLL);
                        this.LJLLLLLL = kidsFeedViewModel;
                        kidsFeedViewModel.LJLILLLLZI.observe(this, new AObserverS78S0100000_10(this, 49));
                        KidsFeedViewModel kidsFeedViewModel2 = this.LJLLLLLL;
                        if (kidsFeedViewModel2 != null) {
                            kidsFeedViewModel2.LJLJJL.observe(this, new AObserverS77S0100000_9(this, 95));
                            KidsFeedViewModel kidsFeedViewModel3 = this.LJLLLLLL;
                            if (kidsFeedViewModel3 != null) {
                                kidsFeedViewModel3.LJLJJI.observe(this, new AObserverS78S0100000_10(this, 50));
                                KidsFeedViewModel kidsFeedViewModel4 = this.LJLLLLLL;
                                if (kidsFeedViewModel4 != null) {
                                    kidsFeedViewModel4.LJLJI.observe(this, new AObserverS78S0100000_10(this, 51));
                                    wl();
                                    KidsFeedViewModel kidsFeedViewModel5 = this.LJLLLLLL;
                                    if (kidsFeedViewModel5 != null) {
                                        if (kidsFeedViewModel5.LJLIL == null) {
                                            return;
                                        }
                                        C73411SrX c73411SrX2 = kidsFeedViewModel5.LJLJJLL;
                                        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = kidsFeedViewModel5.LJLJJLL) != null) {
                                            c73411SrX.dispose();
                                        }
                                        kidsFeedViewModel5.LJLJJLL = (C73411SrX) kidsFeedViewModel5.LJLIL.LIZJ().LJJIJL(new IDhS99S0100000_6(kidsFeedViewModel5, 11)).LJJJLIIL(new AfS58S0100000_6(kidsFeedViewModel5, 50), new AfS58S0100000_6(kidsFeedViewModel5, 51));
                                        return;
                                    }
                                    o.LJIJI("feedViewModel");
                                    throw null;
                                }
                                o.LJIJI("feedViewModel");
                                throw null;
                            }
                            o.LJIJI("feedViewModel");
                            throw null;
                        }
                        o.LJIJI("feedViewModel");
                        throw null;
                    }
                    o.LJIJI("detailTextView");
                    throw null;
                }
                o.LJIJI("loadMoreLayout");
                throw null;
            }
            o.LJIJI("refreshLayout");
            throw null;
        }
        o.LJIJI("refreshLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bfg, viewGroup, false);
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
