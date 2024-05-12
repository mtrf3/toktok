package com.ss.android.ugc.aweme.ecommerce.showcase.profile;

import X.AbstractC78621UtN;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C18000nE;
import X.C221108m2;
import X.C29S;
import X.C31461Li;
import X.C36636EZk;
import X.C3C5;
import X.C5H3;
import X.C60726NsQ;
import X.C61907ORj;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78565UsT;
import X.C90903hW;
import X.EnumC221088m0;
import X.InterfaceC18010nF;
import X.InterfaceC34461Ww;
import X.M2T;
import X.OGF;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import X.XKQ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.showcase.EcommerceStoreBizLogServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class TabShowcaseFragment extends TabCommerceFragment implements InterfaceC34461Ww {
    public boolean LL;
    public boolean LLD;
    public final OGF LLF;
    public final C5H3 LLFF;
    public int LLFFF;
    public boolean LLFII;
    public int LLFZ;
    public String LLI;
    public XKQ LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();

    @Override // X.InterfaceC34461Ww
    public final Object LJJIII() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // X.InterfaceC34461Ww, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b2631";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public TabShowcaseFragment() {
        OGF ogf = new OGF();
        ogf.LIZIZ = this;
        this.LLF = ogf;
        this.LLFF = C221108m2.LIZ(EnumC221088m0.NONE, new AqS160S0100000_10(this, 186));
        this.LLI = "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, X.InterfaceC87073YFh
    public final void LJ() {
        JSONObject params = new JSONObject().put("enter_method", "refresh").put("viewable_area", this.LLFFF);
        o.LJIIIIZZ(params, "params");
        Ol("profile_appear_event", params);
    }

    @Override // X.InterfaceC87073YFh
    public final void onScrollEnd() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (LJIJJ() != null && !this.LLF.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        JSONObject params = jSONObject.put("is_full_screen", z).put("viewable_area", this.LLFFF);
        o.LJIIIIZZ(params, "params");
        Ol("profile_move_event", params);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC34461Ww
    public final String K3() {
        for (Fragment fragment = getParentFragment(); fragment != 0; fragment = fragment.getParentFragment()) {
            if (fragment instanceof InterfaceC18010nF) {
                return ((InterfaceC18010nF) fragment).getBtmPageCode();
            }
        }
        return "b5836";
    }

    @Override // X.OGG
    public final View LJIJJ() {
        C60726NsQ Hl = Hl();
        if (Hl != null) {
            return Hl.findViewByName("profile-shop-list");
        }
        return null;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    public final void Rl() {
        LifecycleOwner lifecycleOwner;
        this.LJLLJ = System.currentTimeMillis();
        XKQ xkq = this.LLIFFJFJJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LLIFFJFJJ = null;
        this.LJLLL = 0L;
        this.LL = false;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            this.LJLZ = null;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            View view = getView();
            o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, (ViewGroup) view);
        }
        this.LJLLILLLL = ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(this.LJLLI, "{author_id}", Jl().id, false), "{target_sec_uid}", Jl().secId, false), "{follow_status}", String.valueOf(Jl().followStatus), false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLLILLLL);
        LIZ.append("&nickname=");
        LIZ.append(Jl().nickname);
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIZ(LIZIZ, "<set-?>");
        this.LJLLILLLL = LIZIZ;
        AbstractC78621UtN context = C36636EZk.LIZ;
        C61907ORj c61907ORj = new C61907ORj(this, null);
        o.LJIIIZ(context, "context");
        if (getView() != null) {
            lifecycleOwner = getViewLifecycleOwner();
        } else {
            lifecycleOwner = this;
        }
        o.LJIIIIZZ(lifecycleOwner, "if (view != null) viewLifecycleOwner else this");
        this.LLIFFJFJJ = C78565UsT.LJJIIZI(lifecycleOwner, context, c61907ORj);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        super.onResume();
        C12460eI.LJIIL(this, false);
        if (getUserVisibleHint()) {
            if (o.LJ(mo49getActivity(), ActivityStack.getTopActivity())) {
                str = "resume";
            } else {
                str = "pop";
            }
            JSONObject params = new JSONObject().put("enter_method", str).put("viewable_area", this.LLFFF);
            o.LJIIIIZZ(params, "params");
            Ol("profile_appear_event", params);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        if (getUserVisibleHint()) {
            if (ActivityStack.isAppBackGround()) {
                str = "close";
            } else if (requireActivity().isFinishing()) {
                str = "return";
            } else {
                str = "next";
            }
            JSONObject put = new JSONObject().put("quit_type", str);
            o.LJIIIIZZ(put, "JSONObject().put(Key.QUIT_TYPE, type)");
            Ol("profile_disappear_event", put);
        }
        super.onStop();
    }

    public final void Ql(String str) {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(str)) == null || ujb.o.LJJJJJL(string)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLLI);
        LIZ.append('&');
        LIZ.append(str);
        LIZ.append('=');
        LIZ.append(string);
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIZ(LIZIZ, "<set-?>");
        this.LJLLI = LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, X.InterfaceC87073YFh
    public final void m4(MiniUser miniUser) {
        boolean z;
        if (!this.mStatusViewValid) {
            return;
        }
        if (this.LJLL != null && o.LJ(Jl().id, miniUser.id)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLL = miniUser;
        if (z) {
            JSONObject put = new JSONObject().put("follow_status", miniUser.followStatus);
            o.LJIIIIZZ(put, "JSONObject().put(Key.FOL…TATUS, user.followStatus)");
            Ol("follow_status_update", put);
        } else {
            String str = this.LJZ;
            if (str != null && !ujb.o.LJJJJJL(str)) {
                this.LJLLLL.put("list_source_content_id", str);
            }
            Rl();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        String str;
        Bundle arguments;
        String str2;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-5034314903882441280");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabShowcaseFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabShowcaseFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (this.LL) {
                JSONObject jSONObject = new JSONObject();
                if (this.LLD) {
                    str2 = "slide";
                } else {
                    str2 = "click";
                }
                JSONObject params = jSONObject.put("enter_method", str2).put("viewable_area", this.LLFFF);
                o.LJIIIIZZ(params, "params");
                Ol("profile_appear_event", params);
            }
            Bundle arguments2 = getArguments();
            Map<String, String> map = (Map) this.LLFF.getValue();
            boolean Kl = Kl();
            HashMap hashMap = new HashMap();
            if (!this.LL) {
                hashMap.put("show_to_click", Long.valueOf(this.LJLLL - this.LJLLJ));
            }
            EcommerceStoreBizLogServiceImpl.LJI().LIZLLL(arguments2, map, hashMap, Kl);
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str = arguments3.getString("has_red_dot");
            } else {
                str = null;
            }
            if (o.LJ(str, "1") && (arguments = getArguments()) != null) {
                arguments.putString("has_red_dot", CardStruct.IStatusCode.DEFAULT);
            }
            this.LLD = false;
        } else if (this.LL) {
            JSONObject put = new JSONObject().put("quit_type", "change_tab");
            o.LJIIIIZZ(put, "JSONObject().put(Key.QUIT_TYPE, CHANGE_TAB)");
            Ol("profile_disappear_event", put);
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabShowcaseFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void vl(int i) {
        if (!getUserVisibleHint() && i == 1) {
            this.LLD = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C12460eI.LJIIL(this, true);
        if (Kl()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LJLLI = ujb.o.LJJJJZ(ujb.o.LJJJJZ(C31461Li.LIZJ("ec_profile_shop_tab_schema", "sslocal://lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_profile_shop%2Fpages%2Fprofile-shop.js&use_spark=1&hide_nav_bar=1&thread_strategy=0&immersive_mode=0&hide_status_bar=0&dynamic=1&use_gecko_first=1&is_host_profile={is_host_profile}&target_sec_uid={target_sec_uid}&enter_from={enter_from}&author_id={author_id}&follow_status={follow_status}&__live_platform__=webcast&ab_params=ec_showcase_new_entrance,profile_showcase_optimize_type", "getInstance().getStringV…hemaSettings::class.java)"), "{enter_from}", getEnterFrom(), false), "{is_host_profile}", str, false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLLI);
        LIZ.append("&is_self=");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIZ(LIZIZ, "<set-?>");
        this.LJLLI = LIZIZ;
        Ql("show_window_source");
        Ql("room_id");
        this.LJLLLL.put("enter_from", getEnterFrom());
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getInt("open_from") == 12) {
            str2 = "from_pdp";
        } else {
            str2 = "click";
        }
        this.LJLLLL.put("enter_from", str2);
        this.LJLLLL.put("traffic_source_list", M2T.LIZ(3, this.LJLJL));
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("source_content_id")) != null && !ujb.o.LJJJJJL(string)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLLI);
            LIZ2.append("&source_content_id=");
            LIZ2.append(string);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(LIZIZ2, "<set-?>");
            this.LJLLI = LIZIZ2;
        }
        this.LJLLLL.putAll((Map) this.LLFF.getValue());
        HashMap<String, Object> hashMap = this.LJLJLLL;
        if (hashMap != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                if (!this.LJLLLL.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                this.LJLLLL.put(entry2.getKey(), entry2.getValue());
            }
        }
        Rl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
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
}
