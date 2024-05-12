package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C212428Vi;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C27752Auq;
import X.C27753Aur;
import X.C27754Aus;
import X.C27755Aut;
import X.C27756Auu;
import X.C27757Auv;
import X.C27758Auw;
import X.C27759Aux;
import X.C27760Auy;
import X.C29S;
import X.C2U8;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C48658J7u;
import X.C54154LNe;
import X.C54251LQx;
import X.C54316LTk;
import X.C54362LVe;
import X.C56412MCa;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70567Rml;
import X.C70853RrN;
import X.C70858RrS;
import X.C71298RyY;
import X.C71843SHn;
import X.C76800UCe;
import X.C78915Uy7;
import X.C78926UyI;
import X.C79234V7u;
import X.C8VV;
import X.C8W0;
import X.C8YZ;
import X.C90903hW;
import X.EnumC71839SHj;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC27438Apm;
import X.InterfaceC27538ArO;
import X.InterfaceC27761Auz;
import X.InterfaceC61213O0r;
import X.InterfaceC65784Pro;
import X.InterfaceC71003Rtn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.JBR;
import X.JBS;
import X.KPL;
import X.LK2;
import X.LKH;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.TBW;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS11S1110000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class MessageCenterFragment extends BaseFragment implements KPL, InterfaceC27538ArO, LK2, LKH, JBS, InterfaceC27438Apm {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C214298b3 LJLJLLL;
    public final String LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    public MessageCenterFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArgNotNull(this, C27753Aur.LJLIL, "previous_page", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArgNotNull(this, C27758Auw.LJLIL, "show_tablist", Boolean.class);
        this.LJLJI = routeArgExtension.optionalArg(this, C27759Aux.LJLIL, "title", String.class);
        this.LJLJJI = routeArgExtension.optionalArgNotNull(this, C27757Auv.LJLIL, "show_order_center", Boolean.class);
        this.LJLJJL = routeArgExtension.optionalArgNotNull(this, C27756Auu.LJLIL, "show_notice", Boolean.class);
        this.LJLJJLL = routeArgExtension.optionalArgNotNull(this, C27755Aut.LJLIL, "show_description", Boolean.class);
        this.LJLJL = routeArgExtension.optionalArgNotNull(this, C27754Aus.LJLIL, "trackParams", String.class);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 169));
        C65776Prg LIZ = C65352Pkq.LIZ(MessageCenterViewModel.class);
        this.LJLJLLL = new C214298b3(LIZ, new AqS154S0100000_4(LIZ, 168), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C27760Auy.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLL = "click_back";
    }

    @Override // X.LKH
    public final boolean LJIIJ() {
        ((MessageCenterViewModel) this.LJLJLLL.getValue()).LJLJL = "return";
        C48658J7u.LIZ("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", C54154LNe.LIZIZ(requireActivity())), new OSZ("from_inbox_page", "shop")));
        return true;
    }

    public final Map<String, Object> vl() {
        return (Map) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageName() {
        Object obj = vl().get("enter_from");
        if (!(obj instanceof String) || obj == null) {
            obj = "";
        }
        if (o.LJ(obj, "notification_page") && C54316LTk.LIZIZ) {
            return "seller_message";
        }
        return "shop_message";
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        JBR.LIZIZ(this);
        ((MessageCenterViewModel) this.LJLJLLL.getValue()).LJLJL = "return";
        C48658J7u.LIZ("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", C54154LNe.LIZIZ(requireActivity())), new OSZ("from_inbox_page", "shop")));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C54362LVe.LIZIZ(210, 214);
        C2U8.LIZ(new C54251LQx((HashMap<Integer, Integer>) C113554cx.LJJJLZIJ(new OSZ(210, Integer.valueOf(C54362LVe.LJIILJJIL(210))), new OSZ(214, Integer.valueOf(C54362LVe.LJIILJJIL(214))))));
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return C79234V7u.LJIILL(this);
    }

    @Override // X.InterfaceC37828Esy
    public final Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
        C78915Uy7.LJJJ(c70858RrS, new AqS170S0100000_4(this, 244));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C27752Auq.LJLIL);
        C48658J7u.LIZ("enter_tiktok_shop", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page")));
    }

    @Override // X.InterfaceC27438Apm
    public final boolean onDetectBlank(Map<String, String> map) {
        int i;
        MessageCenterViewModel messageCenterViewModel = (MessageCenterViewModel) this.LJLJLLL.getValue();
        C71298RyY state = messageCenterViewModel.getVmDispatcher().getState();
        if (messageCenterViewModel.LJLILLLLZI.LIZIZ() == 3) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = C71843SHn.LIZIZ[state.LJLIL.LIZ.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                i += 4;
            }
        } else {
            i += 2;
        }
        messageCenterViewModel.LJLL = i;
        if (state.LJLIL.LIZ != EnumC71839SHj.EMPTY) {
            String valueOf = String.valueOf(i);
            HashMap hashMap = (HashMap) map;
            hashMap.put("content_list_size", valueOf);
            hashMap.put("shop_info_cnt", String.valueOf(messageCenterViewModel.LJLJLJ));
            hashMap.put("seller_message_cnt", String.valueOf(messageCenterViewModel.LJLJLLL));
            EnumC71839SHj enumC71839SHj = state.LJLIL.LIZ;
            if (enumC71839SHj == EnumC71839SHj.ERROR || enumC71839SHj == EnumC71839SHj.NETWORK_UNAVAILABLE) {
                hashMap.put("blank_type", "error_status");
            } else if (messageCenterViewModel.LJLJLJ + messageCenterViewModel.LJLJLLL <= 0) {
                hashMap.put("blank_type", "no_meta_data");
            }
            return true;
        }
        if (((ViewGroup) _$_findCachedViewById(R.id.ghq)).getChildCount() > ((MessageCenterViewModel) this.LJLJLLL.getValue()).LJLL && _$_findCachedViewById(R.id.ghq).getHeight() > 0) {
            return false;
        }
        ((HashMap) map).put("blank_type", "empty_view");
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "1160002673988537201");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/ecommerce/base/messagecenter/MessageCenterFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/ecommerce/base/messagecenter/MessageCenterFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof InterfaceC27761Auz) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC27761Auz) it2.next()).LJJJJJL(z);
            }
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/ecommerce/base/messagecenter/MessageCenterFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.LK2
    public final void v0(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C48658J7u.LIZ("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", "click_button_icon"), new OSZ("from_inbox_page", "shop")));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C70853RrN.LIZIZ(this, view, null, 2);
        boolean z = true;
        C48658J7u.LIZ("enter_social_interaction", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page")));
        Object obj = vl().get("enter_from");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        if (!o.LJ(str, "notification_page") || !C54316LTk.LIZIZ) {
            z = false;
        }
        C8VV.LIZ(this, false, new AqS11S1110000_4(this, str, z, 0));
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 167));
        c252709vu.LIZJ(LIZJ);
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a0d, viewGroup, false);
        Context context = getContext();
        if (context != null) {
            LLLLIILL.setPadding(0, C63081OpJ.LJJJJLI(context), 0, 0);
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
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
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
