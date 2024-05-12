package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C191937g5;
import X.C192517h1;
import X.C192627hC;
import X.C192637hD;
import X.C192647hE;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C26045AKb;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C52535Kjb;
import X.C56412MCa;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65777Prh;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC2063587z;
import X.EnumC84576XHg;
import X.FMX;
import X.GFW;
import X.InterfaceC192527h2;
import X.InterfaceC192787hS;
import X.InterfaceC192937hh;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.M8L;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.RBY;
import X.TBT;
import X.TBW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class CollectionListFragmentForMineProfile extends BaseFragment implements KPL, InterfaceC192787hS, InterfaceC192937hh, InterfaceC192527h2 {
    public static final int LJLJL = 8;
    public final C214298b3 LJLIL;
    public final InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> LJLILLLLZI;
    public int LJLJI;
    public final C5H3 LJLJJI;
    public CollectionManageRequest LJLJJL;
    public Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLJJLL.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return xl(this, layoutInflater, viewGroup, bundle);
    }

    @Override // X.InterfaceC192787hS, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public CollectionListFragmentForMineProfile() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCollectionListViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 238);
        C192627hC c192627hC = C192627hC.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c192627hC, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c192627hC, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = new IDqS428S0100000_3(this, 6);
        this.LJLJJI = C221108m2.LIZIZ(C192647hE.LJLIL);
    }

    public final C73318Sq2 Al() {
        return (C73318Sq2) this.LJLJJI.getValue();
    }

    public final VideoCollectionListViewModel Dl() {
        return (VideoCollectionListViewModel) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC192787hS
    public void LLZLLLL() {
        M8L.LIZ("click create new collection in collection list");
        C192637hD c192637hD = new C192637hD();
        c192637hD.LIZLLL = "collection_video";
        c192637hD.LJIILIIL();
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        new AqS92S0300000_3(requireActivity, this, new AqS166S0200000_3(this, requireActivity, 5), 1).invoke();
    }

    @Override // X.InterfaceC192937hh
    public void Rj() {
        VideoCollectionListViewModel.gv0(Dl(), true, false, 6);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Al().LIZLLL();
        EventBus.LIZJ().LJIJ(this);
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LIZJ(this.LJLILLLLZI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ(this);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        long j;
        super.onResume();
        CollectionManageRequest collectionManageRequest = this.LJLJJL;
        if (collectionManageRequest != null) {
            if (collectionManageRequest.operation == 2) {
                ActivityC45651qj requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                C26045AKb c26045AKb = new C26045AKb(requireActivity);
                c26045AKb.LJIIIIZZ(R.string.gbl);
                c26045AKb.LJIIJ();
                C65777Prh.LIZJ(VideoCollectionListViewModel.LJLJJL).remove(collectionManageRequest.collectionId);
            }
            if (collectionManageRequest.operation == 1) {
                ActivityC45651qj requireActivity2 = requireActivity();
                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                C26045AKb c26045AKb2 = new C26045AKb(requireActivity2);
                c26045AKb2.LJIIIIZZ(R.string.gbd);
                c26045AKb2.LJFF(R.raw.icon_tick_fill_small);
                c26045AKb2.LJII(R.attr.e8);
                c26045AKb2.LJIIJ();
            }
            if (collectionManageRequest.operation == 10) {
                CollectionDetail collectionDetail = (CollectionDetail) ((LinkedHashMap) VideoCollectionListViewModel.LJLJJL).get(collectionManageRequest.collectionId);
                if (collectionDetail != null) {
                    List<String> list = collectionManageRequest.addIds;
                    if (list != null) {
                        j = list.size();
                    } else {
                        j = 0;
                    }
                    collectionDetail.statistic = new CollectionDetail.Statistic(Long.valueOf(j), true);
                }
                Kl(Dl(), new AqS134S0200000_3(this, collectionManageRequest, 62));
            }
            this.LJLJJL = null;
        }
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @QD3
    public final void handleOnOperationEvent(C191937g5 e) {
        o.LJIIIZ(e, "e");
        VideoCollectionListViewModel.gv0(Dl(), true, false, 6);
        if (e.LJLIL.operation == 10 && !o.LJ(e.LJLILLLLZI, "create_collection")) {
            return;
        }
        if (e.LJLIL.operation == 1 && !o.LJ(e.LJLILLLLZI, "create_collection")) {
            return;
        }
        this.LJLJJL = e.LJLIL;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GFW.LJLIL);
        if (C52535Kjb.LIZ()) {
            if (C52535Kjb.LIZIZ()) {
                AwemeCollectionAgent.LJIILLIIL().LJFF(this.LJLILLLLZI);
            } else {
                AwemeCollectionAgent.LJIILLIIL().LJI(this);
            }
        }
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, R> R Kl(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C212418Vh.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q> void Ll(VM1 vm1, InterfaceC88472Yns<? super S1, C76800UCe> interfaceC88472Yns) {
        C212418Vh.LJIIL(vm1, interfaceC88472Yns);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        VideoCollectionListViewModel Dl = Dl();
        RBY LJFF = AccountService.LJIJ().LJFF();
        String str2 = null;
        if (LJFF != null) {
            str = LJFF.getNickName();
        } else {
            str = null;
        }
        Dl.LJLILLLLZI = str;
        VideoCollectionListViewModel Dl2 = Dl();
        RBY LJFF2 = AccountService.LJIJ().LJFF();
        if (LJFF2 != null) {
            str2 = LJFF2.getCurUserId();
        }
        Dl2.LJLIL = str2;
        Dl().LJLJI = "personal_homepage";
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 63));
        EventBus.LIZJ().LJIILJJIL(this);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("tab_name", "collections");
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        FMX.LJIIL("collection_tab_init", c188727au.LIZ);
        VideoCollectionListViewModel.gv0(Dl(), true, false, 6);
        AssemViewModel.asyncSubscribe$default(Dl(), new TBT() { // from class: X.7hB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192847hY) obj).LJLIL;
            }
        }, null, null, null, new AqS169S0100000_3(this, 121), 14, null);
    }

    public void Gl(String str, boolean z, EnumC2063587z enumC2063587z) {
        C192517h1.LIZ(this, str, z, enumC2063587z);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, R> R Jl(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C212418Vh.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    @Override // X.AnonymousClass885
    public /* bridge */ /* synthetic */ void id(String str, Boolean bool, EnumC2063587z enumC2063587z) {
        Gl(str, bool.booleanValue(), enumC2063587z);
    }

    @Override // X.InterfaceC192527h2
    public void u8(String id, boolean z, EnumC2063587z source) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        if (source == EnumC2063587z.MUTATION) {
            VideoCollectionListViewModel.gv0(Dl(), true, false, 6);
        }
    }

    public View wl(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.v2, viewGroup, false);
    }

    public static View xl(CollectionListFragmentForMineProfile collectionListFragmentForMineProfile, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View wl = collectionListFragmentForMineProfile.wl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(wl instanceof View)) {
            wl = null;
        }
        if (wl != null) {
            try {
                ViewTreeLifecycleOwner.set(wl, collectionListFragmentForMineProfile.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(wl, collectionListFragmentForMineProfile);
                C10A.LIZIZ(wl, collectionListFragmentForMineProfile);
                ActivityC45651qj mo49getActivity = collectionListFragmentForMineProfile.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return wl;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, VM3 extends AssemViewModel<S3>, S3 extends C33Q, R> R Il(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C212418Vh.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    @Override // X.C8YM
    public <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <S extends C33Q, A, B> InterfaceC222288nw Hl(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LJI(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    public <S extends C33Q, T> InterfaceC222288nw vl(AssemViewModel<S> assemViewModel, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88471Ynr<? super C3C8, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super C3C8, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C212418Vh.LIZ(this, assemViewModel, tbw, c56412MCa, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
