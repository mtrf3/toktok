package com.ss.android.ugc.aweme.trending.ui.billboardpage;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C188727au;
import X.C1HQ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C2K0;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7PG;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EV9;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC55235Lm3;
import X.InterfaceC61213O0r;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.MB3;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.trending.ui.MobAbility;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingBillboardModel;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel.TrendingBillboardViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class TrendingFullBillboardPage extends DetailBaseFragment implements KPL, MobAbility {
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String lr() {
        return "trending_billboard";
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public TrendingFullBillboardPage() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TrendingBillboardViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1123);
        C7PG c7pg = C7PG.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c7pg, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c7pg, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b3;
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1121));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.trending.ui.MobAbility
    public final void HW(TrendingBillboardModel trendingBillboardModel) {
        C1HQ c1hq;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = (String) this.LJLJI.getValue();
        if (trendingBillboardModel != null) {
            c1hq = trendingBillboardModel.LIZ();
        } else {
            c1hq = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("trending_entrance", str6);
        c188727au.LJIIIZ("enter_from", MB3.LIZ);
        if (trendingBillboardModel != null) {
            str = trendingBillboardModel.trendingName;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("trending_topic", str);
        if (trendingBillboardModel != null) {
            str2 = trendingBillboardModel.trendingId;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("trending_topic_id", str2);
        String str7 = "";
        if (c1hq == null || (str3 = (String) c1hq.getOrDefault("trending_topic_source", null)) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("trending_topic_source", str3);
        if (c1hq == null || (str4 = (String) c1hq.getOrDefault("topic_rank", null)) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("trending_rank", str4);
        if (c1hq != null && (str5 = (String) c1hq.getOrDefault("topic_group_num", null)) != null) {
            str7 = str5;
        }
        c188727au.LJIIIZ("topic_group_num", str7);
        FMX.LJIIL("trends_billboard_topic_show", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.trending.ui.MobAbility
    public final void zQ(TrendingBillboardModel trendingBillboardModel) {
        C1HQ c1hq;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = (String) this.LJLJI.getValue();
        if (trendingBillboardModel != null) {
            c1hq = trendingBillboardModel.LIZ();
        } else {
            c1hq = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("trending_entrance", str6);
        c188727au.LJIIIZ("enter_from", MB3.LIZ);
        if (trendingBillboardModel != null) {
            str = trendingBillboardModel.trendingName;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("trending_topic", str);
        if (trendingBillboardModel != null) {
            str2 = trendingBillboardModel.trendingId;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("trending_topic_id", str2);
        String str7 = "";
        if (c1hq == null || (str3 = (String) c1hq.getOrDefault("trending_topic_source", null)) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("trending_topic_source", str3);
        if (c1hq == null || (str4 = (String) c1hq.getOrDefault("topic_rank", null)) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("trending_rank", str4);
        if (c1hq != null && (str5 = (String) c1hq.getOrDefault("topic_group_num", null)) != null) {
            str7 = str5;
        }
        c188727au.LJIIIZ("topic_group_num", str7);
        FMX.LJIIL("trends_billboard_topic_click", c188727au.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        MB3.LIZ(getArguments());
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        C2K0 LIZ = C55096Ljo.LIZ(LIZJ, MobAbility.class, null);
        if (LIZ == null) {
            C55096Ljo.LJIIJJI(LIZJ, this, MobAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(this);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(MobAbility.class.getClassLoader(), new Class[]{MobAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, MobAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.trending.ui.MobAbility");
                }
            }
        }
        AssemViewModel.asyncSubscribe$default(this.LJLILLLLZI.getValue(), new TBT() { // from class: X.7PF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C118114kJ c118114kJ = (C118114kJ) obj;
                c118114kJ.getClass();
                return C208708Ha.LIZLLL(c118114kJ);
            }
        }, null, new AqS169S0100000_3(this, 508), new AqS153S0100000_3(this, 1122), new AqS169S0100000_3(this, 509), 2, null);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 50));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(R.id.bul);
        frameLayout.setFitsSystemWindows(true);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            C10A.LIZIZ(frameLayout, this);
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
        return frameLayout;
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
