package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.tab.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C1BC;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C88963eO;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C91343iE;
import X.C93903mM;
import X.C94393n9;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.ORY;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SYL;
import X.TBT;
import X.TBW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.tab.filterlist.StickerStoreFilterCell;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.tab.viewmodel.StickerStoreTabViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS120S0300000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerStoreTabFragment extends BaseFragment implements KPL {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public String LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public StickerStoreTabFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(StickerStoreTabViewModel.class);
        this.LJLIL = new C214298b3(LIZ, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 275), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C93903mM.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLILLLLZI = C221108m2.LIZIZ(C91343iE.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(new AqS173S0100000_7(this, 72));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int[] intArray;
        final List LJJZ;
        Bundle arguments;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (intArray = arguments2.getIntArray("filter_type_list")) == null || (LJJZ = ORY.LJJZ(intArray)) == null || (arguments = getArguments()) == null) {
            return;
        }
        final int i = arguments.getInt("tab_type");
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str = arguments3.getString("conversation_id");
        } else {
            str = null;
        }
        this.LJLJI = str;
        SYL syl = (SYL) view.findViewById(R.id.kk2);
        syl.LLLF.LJZL(StickerStoreFilterCell.class);
        syl.setOrientation(0);
        C94393n9 c94393n9 = (C94393n9) view.findViewById(R.id.kk3);
        boolean LJFF = C88963eO.LJFF();
        final FragmentManager childFragmentManager = getChildFragmentManager();
        final int i2 = LJFF ? 1 : 0;
        c94393n9.setAdapter(new C1BC(i2, childFragmentManager) { // from class: X.3hz
            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return LJJZ.size();
            }

            @Override // X.C1BC
            public final Fragment LJJIII(int i3) {
                return C91283i8.LIZ(((Number) ListProtector.get(LJJZ, i3)).intValue(), i, EnumC87003bE.STICKER_STORE.getType(), null, this.LJLJI, 8);
            }
        });
        c94393n9.setScrollEnabled$im_base_release(false);
        c94393n9.setCanScrollHorizontally$im_base_release(false);
        if (C88963eO.LJFF()) {
            c94393n9.setOffscreenPageLimit(2);
        }
        AssemViewModel value = this.LJLIL.getValue();
        value.setState(new AqS167S0100000_1(LJJZ, (List<VoucherInfoNew>) 418));
        C8YN.LJII(this, value, new TBT() { // from class: X.3mN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C93883mK) obj).LJLIL;
            }
        }, null, new AqS120S0300000_1(syl, this, c94393n9, 5), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b2f, viewGroup, false);
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