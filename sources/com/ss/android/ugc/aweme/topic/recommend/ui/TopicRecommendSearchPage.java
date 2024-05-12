package com.ss.android.ugc.aweme.topic.recommend.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C29S;
import X.C2K0;
import X.C3C5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7PB;
import X.C7PC;
import X.C7PD;
import X.C7PE;
import X.C7PR;
import X.C8VV;
import X.C90903hW;
import X.EV9;
import X.InterfaceC55235Lm3;
import X.InterfaceC61213O0r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class TopicRecommendSearchPage extends DetailBaseFragment implements RefreshAbility {
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C214378bB LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public TopicRecommendSearchPage() {
        AqS60S0110000_3 LJJ;
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLILLLLZI = routeArgExtension.requiredArg(this, C7PE.LJLIL, "topic_id", String.class);
        this.LJLJI = routeArgExtension.requiredArg(this, C7PC.LJLIL, "topic_type", Integer.class);
        this.LJLJJI = routeArgExtension.requiredArg(this, C7PD.LJLIL, "page_id", String.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1087);
        C65776Prg LIZ = C65352Pkq.LIZ(TopicRecommendListVM.class);
        C7PB c7pb = C7PB.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJJL = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c7pb, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String lr() {
        if (((Number) this.LJLJI.getValue()).intValue() == C7PR.BOOK.getType()) {
            return "book_recommendation_page";
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        ((TopicRecommendListVM) this.LJLJJL.getValue()).LJLJJL = true;
        ((AssemSingleListViewModel) this.LJLJJL.getValue()).manualListRefresh();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 5));
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        C2K0 LIZ = C55096Ljo.LIZ(LIZJ, RefreshAbility.class, null);
        if (LIZ == null) {
            C55096Ljo.LJIIJJI(LIZJ, this, RefreshAbility.class, null);
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
                Object newProxyInstance = Proxy.newProxyInstance(RefreshAbility.class.getClassLoader(), new Class[]{RefreshAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, RefreshAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(this, null);
        TopicRecommendListVM topicRecommendListVM = (TopicRecommendListVM) this.LJLJJL.getValue();
        C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ2, SearchAbility.class, null);
        if (LIZ2 == null) {
            C55096Ljo.LJIIJJI(LIZJ2, topicRecommendListVM, SearchAbility.class, null);
            return;
        }
        try {
            InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
            if (invocationHandler2 instanceof EV9) {
                ((EV9) invocationHandler2).LIZ.add(topicRecommendListVM);
                return;
            }
            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
        } catch (IllegalArgumentException unused2) {
            EV9 ev92 = new EV9();
            ev92.LIZ.add(topicRecommendListVM);
            ev92.LIZ.add(LIZ2);
            Object newProxyInstance2 = Proxy.newProxyInstance(SearchAbility.class.getClassLoader(), new Class[]{SearchAbility.class}, ev92);
            if (newProxyInstance2 != null) {
                C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, SearchAbility.class, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        ((TopicRecommendListVM) this.LJLJJL.getValue()).LJLJJI = null;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setBackgroundColor(-1);
        frameLayout.setId(R.id.bul);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            C10A.LIZIZ(frameLayout, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return frameLayout;
    }
}
