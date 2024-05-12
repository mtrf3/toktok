package com.ss.android.ugc.aweme.ecommerce.showcase.profile;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C18000nE;
import X.C1E4;
import X.C27739Aud;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C52221KeX;
import X.C60726NsQ;
import X.C61491OBj;
import X.C61908ORk;
import X.C65300Pk0;
import X.C73305Spp;
import X.C76800UCe;
import X.C78565UsT;
import X.C90903hW;
import X.EZJ;
import X.EZK;
import X.InterfaceC18010nF;
import X.InterfaceC34461Ww;
import X.InterfaceC60061Nhh;
import X.M2T;
import X.OSZ;
import X.OUP;
import X.PII;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.XKQ;
import X.Z9N;
import Y.IDrS49S0100000_10;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.internal.b;
import com.google.gson.m;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.showcase.EcommerceStoreBizLogServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.GetCreatorShopInfoData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.Shop;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class TabStoreFragment extends TabCommerceFragment implements InterfaceC60061Nhh, InterfaceC34461Ww {
    public GetCreatorShopInfoData LL;
    public XKQ LLD;
    public long LLF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public String LLFF = "";
    public final IDrS49S0100000_10 LLFFF = new IDrS49S0100000_10(this, 0);

    @Override // X.InterfaceC34461Ww
    public final Object LJJIII() {
        return this;
    }

    public final void Ql() {
        try {
            Uri parse = UriProtector.parse(Jl().shopRouter);
            o.LJIIIIZZ(parse, "Uri.parse(this)");
            String queryParameter = UriProtector.getQueryParameter(parse, "sellerId");
            if (queryParameter != null) {
                XKQ xkq = this.LLD;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                this.LLD = null;
                EZJ.LIZJ.remove(queryParameter);
                this.LL = null;
                this.LJLLL = 0L;
                C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.cyv);
                if (c73305Spp != null) {
                    c73305Spp.setVisibility(8);
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLZ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    this.LJLZ = null;
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                    View view = getView();
                    o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
                    C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, (ViewGroup) view);
                }
                this.LLD = C78565UsT.LJJIJIIJIL(this, new C61908ORk(this, queryParameter, null));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
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

    @Override // X.InterfaceC34461Ww, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b3422";
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
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
            return Hl.findViewByName("profile-shop-tab-list");
        }
        return null;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    public final void Sl() {
        View LJIJJ = LJIJJ();
        if (LJIJJ != null) {
            Rect rect = new Rect();
            LJIJJ.getGlobalVisibleRect(rect);
            int height = rect.height();
            if (height > 0) {
                JSONObject jSONObject = new JSONObject();
                Context context = LJIJJ.getContext();
                o.LJIIIIZZ(context, "context");
                JSONObject put = jSONObject.put("height", C32151Nz.LJJIJIIJI(context, height));
                o.LJIIIIZZ(put, "JSONObject().put(\"height….px2dp(height.toFloat()))");
                Ol("viewHeightUpdate", put);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView;
        Shop shop;
        String str;
        if (C52221KeX.LIZ()) {
            EventCenter.LJ().LIZIZ("ec_store_exposed_product_count", this);
            GetCreatorShopInfoData getCreatorShopInfoData = this.LL;
            if (getCreatorShopInfoData != null && (shop = getCreatorShopInfoData.shop) != null && (str = shop.sellerId) != null) {
                EZJ.LIZJ.remove(str);
            }
        }
        View LJIJJ = LJIJJ();
        if ((LJIJJ instanceof RecyclerView) && (recyclerView = (RecyclerView) LJIJJ) != null) {
            recyclerView.LJJLL(this.LLFFF);
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C12460eI.LJIIL(this, false);
    }

    @Override // X.InterfaceC87073YFh
    public final void onScrollEnd() {
        Sl();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment
    public final void Ll(int i) {
        String str;
        if (this.LLF > 0) {
            if (i == 0 || ActivityStack.isAppBackGround()) {
                str = "close";
            } else if (requireActivity().isFinishing()) {
                str = "return";
            } else {
                str = "next";
            }
            JSONObject jsonObject = new JSONObject().put("stay_time", SystemClock.uptimeMillis() - this.LLF).put("quit_type", str);
            for (Map.Entry entry : ((LinkedHashMap) this.LJLLLLLL).entrySet()) {
                jsonObject.put((String) entry.getKey(), entry.getValue());
            }
            IEcommerceStoreBizLogService LJI = EcommerceStoreBizLogServiceImpl.LJI();
            o.LJIIIIZZ(jsonObject, "jsonObject");
            LJI.LJFF(jsonObject);
            this.LLF = 0L;
        }
        super.Ll(i);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment
    public final void Ml(int i) {
        super.Ml(i);
        if (this.LLF <= 0) {
            this.LLF = SystemClock.uptimeMillis();
        }
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
        String valueOf = String.valueOf(miniUser.followStatus);
        this.LJLLLL.put("follow_status", valueOf);
        this.LJLLLLLL.put("follow_status", valueOf);
        if (z) {
            return;
        }
        String str = this.LJZ;
        if (str != null && !ujb.o.LJJJJJL(str)) {
            this.LJLLLL.put("list_source_content_id", str);
            this.LJLLLLLL.put("list_source_content_id", str);
            b.LJJIJIIJI("tiktokec_shop_entrance_show", this.LJLLLLLL);
        }
        this.LJLLLL.put("author_id", miniUser.id);
        this.LJLLLLLL.put("author_id", miniUser.id);
        Ql();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String LJIL;
        String str;
        String str2;
        super.onCreate(bundle);
        this.LJLJL = M2T.LIZ(7, this.LJLJL);
        if (bundle == null || (LJIL = bundle.getString("session_id")) == null) {
            LJIL = C1E4.LJIL();
        }
        this.LLFF = LJIL;
        if (Kl()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        this.LJLLLL.put("traffic_source_list", this.LJLJL);
        this.LJLLLL.put("enter_from", getEnterFrom());
        this.LJLLLL.put("source_previous_page", str);
        Map<String, Object> map = this.LJLLLL;
        String str3 = (String) this.LJLJJLL.getValue();
        if (str3.length() == 0) {
            str3 = "click_button";
        }
        map.put("enter_method", str3);
        this.LJLLLL.put("author_id", Jl().id);
        Map<String, Object> map2 = this.LJLLLL;
        if (Jl().tabType == 14) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("default_product_tab", str2);
        this.LJLLLL.put("follow_status", String.valueOf(Jl().followStatus));
        this.LJLLLL.putAll(Z9N.LIZIZ.LLJLLIL(getEnterFrom(), ""));
        this.LJLLLLLL.putAll(this.LJLLLL);
        this.LJLLLLLL.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        this.LJLLLLLL.put("page_name", str);
        this.LJLLLLLL.put("entrance_type", "shop_list");
        this.LJLLLLLL.put("is_self", Integer.valueOf(Kl() ? 1 : 0));
        this.LJLLLLLL.put("traceparent", PII.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("session_id", this.LLFF);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-6166093528864275314");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabStoreFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabStoreFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            EcommerceStoreBizLogServiceImpl.LJI().LJ(this.LJLLLLLL);
            if (this.LL != null) {
                Sl();
                Ml(0);
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabStoreFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        Integer num;
        Shop shop;
        String str2;
        EZJ ezj;
        EZK ezk;
        o.LJIIIZ(eventName, "eventName");
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        Object obj = null;
        if (LJII != null) {
            obj = LJII.get("exposedProductLength");
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            int intValue = num.intValue();
            GetCreatorShopInfoData getCreatorShopInfoData = this.LL;
            if (getCreatorShopInfoData == null || (shop = getCreatorShopInfoData.shop) == null || (str2 = shop.sellerId) == null || (ezj = EZJ.LIZJ.get(str2)) == null || (ezk = ezj.LIZ.get(ezj.LIZIZ)) == null || intValue <= ezk.LIZ) {
                return;
            }
            ezk.LIZ = intValue;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C12460eI.LJIIL(this, true);
        if (C52221KeX.LIZ()) {
            EventCenter.LJ().LIZJ("ec_store_exposed_product_count", this);
        }
        Ql();
    }

    public final TemplateData Tl(String str, Response<m> response, Object obj) {
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("recommend_context", str);
        oszArr[1] = new OSZ("is_live", Integer.valueOf(Jl().isLive ? 1 : 0));
        oszArr[2] = new OSZ("creator_info", C27739Aud.LJI(response));
        if (!(obj instanceof String)) {
            if (obj != null) {
                obj = C27739Aud.LJI(obj);
            } else {
                obj = null;
            }
        }
        oszArr[3] = new OSZ("product_list", obj);
        TemplateData LJLIL = C61491OBj.LJLIL(oszArr);
        if (LJLIL != null) {
            return LJLIL;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        if (viewGroup != null) {
            view = OUP.LJIL(R.layout.a64, viewGroup, false);
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
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
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Rl(java.lang.String r8, java.lang.String r9, X.InterfaceC68342mE<? extends com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.m>> r10, X.InterfaceC67352kd<? super X.InterfaceC68342mE<? extends com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.m>>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C61910ORm
            if (r0 == 0) goto L6f
            r6 = r11
            X.ORm r6 = (X.C61910ORm) r6
            int r2 = r6.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r6.LJLJL = r2
        L12:
            java.lang.Object r5 = r6.LJLJJL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJL
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L36
            if (r0 != r1) goto L75
            X.2mE r10 = r6.LJLJJI
            java.lang.Object r9 = r6.LJLJI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.LJLILLLLZI
            java.lang.String r8 = (java.lang.String) r8
            com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment r3 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
        L2d:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r5 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r5
            if (r5 == 0) goto L5c
            T r0 = r5.data
            if (r0 == 0) goto L5c
        L35:
            return r10
        L36:
            X.C141335gf.LIZJ(r5)
            if (r10 == 0) goto L5b
            boolean r0 = r10.isCompleted()
            if (r0 != 0) goto L42
            goto L35
        L42:
            boolean r0 = r10.isCompleted()
            if (r0 != r1) goto L5b
            r6.LJLIL = r7
            r6.LJLILLLLZI = r8
            r6.LJLJI = r9
            r6.LJLJJI = r10
            r6.LJLJL = r1
            java.lang.Object r5 = r10.LJI(r6)
            if (r5 != r2) goto L59
            return r2
        L59:
            r3 = r7
            goto L2d
        L5b:
            r3 = r7
        L5c:
            X.MBA r0 = r6.getContext()
            X.2gm r2 = X.C48841JEv.LIZ(r0)
            X.ORi r1 = new X.ORi
            r1.<init>(r8, r3, r9, r4)
            r0 = 3
            X.XKn r10 = X.XKX.LIZIZ(r2, r4, r4, r1, r0)
            goto L35
        L6f:
            X.ORm r6 = new X.ORm
            r6.<init>(r7, r11)
            goto L12
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment.Rl(java.lang.String, java.lang.String, X.2mE, X.2kd):java.lang.Object");
    }
}
