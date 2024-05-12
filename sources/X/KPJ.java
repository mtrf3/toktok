package X;

import X.C0AC;
import X.C7MY;
import Y.IDObjectS329S0100000_8;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.detail.filter.ui.FilterPowerCell;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS125S0300000_8;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS171S0200000_8;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KPJ implements KPL, InterfaceC51657KPd {
    public final DetailPageFragment LJLIL;
    public final KPL LJLILLLLZI;
    public final C214298b3 LJLJI;
    public C51671KPr LJLJJI;
    public SYL LJLJJL;
    public InterfaceC51679KPz LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public View LJLL;
    public C55108Lk0 LJLLI;
    public View LJLLILLLL;
    public C80769Vmv LJLLJ;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this.LJLILLLLZI.getActualLifecycleOwner();
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this.LJLILLLLZI.getActualLifecycleOwnerHolder();
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this.LJLILLLLZI.getActualReceiver();
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this.LJLILLLLZI.getActualReceiverHolder();
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return this.LJLILLLLZI.getHostLifecycleOwner();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLILLLLZI.getLifecycle();
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this.LJLILLLLZI.getOwnLifecycleOwner();
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return this.LJLILLLLZI.getReceiverForHostVM();
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return this.LJLILLLLZI.getUniqueOnlyDefault();
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, C56412MCa<C213178Yf<A>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C56412MCa<C213198Yh<A, B>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, prop2, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C56412MCa<OSK<A, B, C>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, prop2, prop3, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C56412MCa<OSL<A, B, C, D>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, prop2, prop3, prop4, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, TBW<S, ? extends E> prop5, C56412MCa<OSM<A, B, C, D, E>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(prop5, "prop5");
        o.LJIIIZ(config, "config");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, prop2, prop3, prop4, prop5, config, interfaceC88472Yns, interfaceC88476Ynw);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, C56412MCa<C213178Yf<A>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribeOnAsync(assemViewModel, prop1, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.subscribe(assemViewModel, config, interfaceC88472Yns, subscriber);
    }

    public final void LJI() {
        LinearLayoutManager linearLayoutManager;
        Object obj;
        int i;
        InterfaceC58812Sn interfaceC58812Sn;
        List<Aweme> awemeList;
        SYL syl = this.LJLJJL;
        if (syl == null) {
            return;
        }
        int intValue = ((Number) DYO.LIZ.getValue()).intValue();
        C0A2 layoutManager = syl.getLayoutManager();
        InterfaceC224118qt interfaceC224118qt = null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        int size = ((ArrayList) syl.getState().LJII()).size();
        InterfaceC51679KPz interfaceC51679KPz = this.LJLJJLL;
        if (interfaceC51679KPz != null) {
            obj = interfaceC51679KPz.getViewModel();
        } else {
            obj = null;
        }
        if (obj instanceof InterfaceC224118qt) {
            interfaceC224118qt = (InterfaceC224118qt) obj;
        }
        if (interfaceC224118qt != null && (awemeList = interfaceC224118qt.getAwemeList()) != null) {
            i = awemeList.size();
        } else {
            i = 0;
        }
        if (LJIIIZ().getState().LJLIL.size() < i) {
            LJIIIZ().setState(C242109eo.LJLIL);
            return;
        }
        if (LJIIIZ().getState().LJLJJLL != KPB.OPENED || LLILLJJLI >= size || size - LLILLJJLI > intValue || LJIIIZ().getState().LJLIL.size() != i || (interfaceC58812Sn = (InterfaceC58812Sn) this.LJLJLJ.getValue()) == null) {
            return;
        }
        interfaceC58812Sn.mf();
    }

    public final View LJII() {
        View view;
        if (this.LJLLILLLL == null) {
            C55108Lk0 LJIIJ = LJIIJ();
            if (LJIIJ != null) {
                view = (View) ORZ.LJLLL(new IDObjectS329S0100000_8(LJIIJ, 0));
            } else {
                view = null;
            }
            if (view instanceof KUR) {
                this.LJLLILLLL = view;
                return view;
            }
        }
        return this.LJLLILLLL;
    }

    public final C80769Vmv LJIIIIZZ() {
        KeyEvent.Callback callback;
        if (this.LJLLJ == null) {
            ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
            C80769Vmv c80769Vmv = null;
            if (mo49getActivity != null) {
                callback = mo49getActivity.findViewById(R.id.ncx);
            } else {
                callback = null;
            }
            if (callback instanceof C80769Vmv) {
                c80769Vmv = (C80769Vmv) callback;
            }
            this.LJLLJ = c80769Vmv;
        }
        return this.LJLLJ;
    }

    public final FilterVM LJIIIZ() {
        return (FilterVM) this.LJLJI.getValue();
    }

    public final C55108Lk0 LJIIJ() {
        KeyEvent.Callback callback;
        if (this.LJLLI == null) {
            View view = this.LJLIL.getView();
            C55108Lk0 c55108Lk0 = null;
            if (view != null) {
                callback = view.findViewById(R.id.g99);
            } else {
                callback = null;
            }
            if (callback instanceof C55108Lk0) {
                c55108Lk0 = (C55108Lk0) callback;
            }
            this.LJLLI = c55108Lk0;
        }
        return this.LJLLI;
    }

    @Override // X.InterfaceC51657KPd
    public final boolean LIZLLL() {
        if (LJIIIZ().getState().LJLJJLL == KPB.CLOSED) {
            return false;
        }
        C51671KPr c51671KPr = this.LJLJJI;
        if (c51671KPr != null) {
            c51671KPr.LIZIZ(0);
        }
        LJIIIZ().hv0(EnumC51554KLe.CLICK_RETURN_BUTTON, LJIIJJI(this.LJLJJL));
        return true;
    }

    public static int LJIIJJI(SYL syl) {
        if (syl == null) {
            return 0;
        }
        C15070iV<Integer, Integer> LIZJ = C8DP.LIZJ(syl);
        int intValue = LIZJ.LIZIZ.intValue();
        Integer num = LIZJ.LIZ;
        o.LJIIIIZZ(num, "it.first");
        return (intValue - num.intValue()) + 1;
    }

    public final void LIZ(float f) {
        View view;
        if (this.LJLL == null) {
            View view2 = this.LJLIL.getView();
            if (view2 != null) {
                view = view2.findViewWithTag("search_bar");
            } else {
                view = null;
            }
            this.LJLL = view;
        }
        View view3 = this.LJLL;
        if (view3 == null) {
            return;
        }
        view3.setAlpha(C78939UyV.LJIL(f));
    }

    @Override // X.InterfaceC51657KPd
    public final void LIZIZ(View view) {
        o.LJIIIZ(view, "view");
        C51671KPr c51671KPr = (C51671KPr) view.findViewById(R.id.jf1);
        if (c51671KPr != null) {
            ActivityC45651qj requireActivity = this.LJLIL.requireActivity();
            o.LJIIIIZZ(requireActivity, "origin.requireActivity()");
            C55247LmF.LIZIZ(C55230Lly.LIZLLL(requireActivity, null), new C224298rB(new AqS154S0100000_4(this, 1044)), C224298rB.class, "source_default_key");
            SYL syl = (SYL) c51671KPr.findViewById(R.id.i04);
            if (syl != null) {
                this.LJLJJL = syl;
                syl.LLLF.LJZL(FilterPowerCell.class);
                this.LJLIL.getContext();
                syl.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.search.detail.filter.ui.delegate.FilterDetailFragmentAgent$initSidebarPowerList$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager
                    public final void LLIIIL(C0AC state, int[] extraLayoutSpace) {
                        o.LJIIIZ(state, "state");
                        o.LJIIIZ(extraLayoutSpace, "extraLayoutSpace");
                        extraLayoutSpace[0] = 0;
                        extraLayoutSpace[1] = C7MY.LIZIZ(112);
                    }
                });
                syl.LJII(new AbstractC030309z() { // from class: X.4ai
                    public final int LJLIL = C7MY.LIZIZ(4);

                    @Override // X.AbstractC030309z
                    public final void LJ(Rect rect, View view2, RecyclerView recyclerView, C0AC c0ac) {
                        T28.LJ(rect, "outRect", view2, "view", recyclerView, "parent", c0ac, "state");
                        rect.bottom = this.LJLIL;
                    }
                }, -1);
                syl.setItemAnimator(null);
                syl.setOutlineProvider(new C42504GmC());
                syl.setClipToOutline(true);
                syl.LJIIJJI(new C51539KKp(syl, this));
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.9vZ
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C252449vU) obj).LJLJI;
                    }
                }, null, new AqS171S0200000_8(syl, this, 6), 6);
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.KPW
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C252449vU) obj).LJLJJI;
                    }
                }, C213688a4.LIZJ(), new AqS171S0200000_8(syl, this, 7), 4);
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.KPP
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C252449vU) obj).LJLJLJ;
                    }
                }, null, new AqS190S0100000_8(this, 52), 6);
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.9vW
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C252449vU) obj).LJLJLLL;
                    }
                }, C213688a4.LIZLLL(), new AqS125S0300000_8(c51671KPr, this, syl, 2), 4);
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.9va
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C252449vU) obj).LJLJL;
                    }
                }, C213688a4.LIZJ(), new AqS190S0100000_8(syl, 50), 4);
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.9vV
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C252449vU) obj).LJLILLLLZI);
                    }
                }, null, new AqS190S0100000_8(c51671KPr, 51), 6);
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.9vX
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C252449vU) obj).LJLL;
                    }
                }, null, new AqS171S0200000_8(syl, this, 4), 6);
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.9vY
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C252449vU) obj).LJLLILLLL;
                    }
                }, null, new AqS171S0200000_8(syl, this, 5), 6);
                c51671KPr.setDrawerListener(new KPG(syl, this));
            }
            if (((Number) C2316597h.LIZ.getValue()).intValue() == 1) {
                InterfaceC242099en.LJII.getClass();
                C51655KPb c51655KPb = new C51655KPb();
                ViewGroup viewGroup = (ViewGroup) c51671KPr.findViewById(R.id.jf0);
                View contentUser = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c51671KPr.getContext()), R.layout.cfl, viewGroup, false);
                viewGroup.addView(contentUser);
                o.LJIIIIZZ(contentUser, "contentUser");
                c51655KPb.LIZ(contentUser, new AqS170S0100000_4(this, 915));
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.KPR
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C252449vU) obj).LJLJJI;
                    }
                }, C213688a4.LIZJ(), new AqS167S0200000_4(this, c51655KPb, 25), 4);
                C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.3nc
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Float.valueOf(((C252449vU) obj).LJLJJL);
                    }
                }, null, new AqS186S0100000_4(c51655KPb, LiveCoverMinSizeSetting.DEFAULT), 6);
            }
            C8YN.LJII(this, LJIIIZ(), new TBT() { // from class: X.9ek
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C252449vU) obj).LJLJJLL;
                }
            }, null, new AqS190S0100000_8(this, 47), 6);
        }
    }

    @Override // X.InterfaceC51657KPd
    public final void LIZJ(InterfaceC51679KPz interfaceC51679KPz) {
        InterfaceC51679KPz interfaceC51679KPz2;
        if (interfaceC51679KPz instanceof InterfaceC51679KPz) {
            interfaceC51679KPz2 = interfaceC51679KPz;
        } else {
            interfaceC51679KPz2 = null;
        }
        this.LJLJJLL = interfaceC51679KPz2;
        if (interfaceC51679KPz instanceof C49857JhV) {
            C49857JhV c49857JhV = (C49857JhV) interfaceC51679KPz;
            KPN kpn = new KPN(this);
            c49857JhV.getClass();
            c49857JhV.LJLIL.add(kpn);
        }
    }

    public KPJ(DetailPageFragment origin, KPL ivmSubscriber) {
        C214298b3 c214298b3;
        o.LJIIIZ(origin, "origin");
        o.LJIIIZ(ivmSubscriber, "ivmSubscriber");
        this.LJLIL = origin;
        this.LJLILLLLZI = ivmSubscriber;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FilterVM.class);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 482);
        KPM kpm = KPM.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(origin, true), C78926UyI.LJJIIJZLJL(origin, true), C184077Kh.LJLIL, C78926UyI.LJJ(origin, true), C78926UyI.LJIILLIIL(origin, true), kpm, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(origin, false), C78926UyI.LJJIIJZLJL(origin, false), C184077Kh.LJLIL, C78926UyI.LJJ(origin, false), C78926UyI.LJIILLIIL(origin, false), kpm, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
        this.LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 480));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 479));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 481));
    }

    @Override // X.InterfaceC51657KPd
    public final View LJFF(LayoutInflater inflater, View view) {
        C51671KPr c51671KPr;
        o.LJIIIZ(inflater, "inflater");
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(R.id.ncx);
        ViewParent parent = findViewById.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(findViewById);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        C16880lQ.LJLLL(findViewById, viewGroup);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cfh, viewGroup, false);
        if (!(LLLLIILL instanceof C51671KPr) || (c51671KPr = (C51671KPr) LLLLIILL) == null) {
            return view;
        }
        this.LJLJJI = c51671KPr;
        ((ViewGroup) c51671KPr.findViewById(R.id.jf0)).addView(findViewById, new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(c51671KPr, indexOfChild, layoutParams);
        return view;
    }
}
