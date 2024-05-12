package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.internal.b;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.showcase.settings.RomaSchemaGroupShoppingStoreSettings;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$startRequestV2$1", f = "StoreFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ORs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61916ORs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;
    public final /* synthetic */ android.net.Uri LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61916ORs(StoreFragment storeFragment, android.net.Uri uri, InterfaceC67352kd<? super C61916ORs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
        this.LJLJI = uri;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C61916ORs c61916ORs = new C61916ORs(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c61916ORs.LJLIL = obj;
        return c61916ORs;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int value;
        int i;
        String str;
        int[] iArr;
        String str2;
        String str3;
        String str4;
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        List<String> list5;
        List<String> list6;
        String str5;
        String str6;
        String str7;
        Integer LJJIL;
        String string;
        Integer LJJIL2;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        m mVar = new m();
        b.LJJIIZI("seller_id", this.LJLILLLLZI.LJLLILLLL, mVar);
        Bundle arguments = this.LJLILLLLZI.getArguments();
        if (arguments != null && (string = arguments.getString("default_product_sort_field")) != null && (LJJIL2 = C38350F3i.LJJIL(string)) != null) {
            value = LJJIL2.intValue();
        } else {
            value = EnumC35468Dw0.SORT_FIELD_POPULAR.getValue();
        }
        mVar.LJJIIJ("sort_field", new Integer(value));
        if (C52235Kel.LIZ()) {
            i = 10;
        } else {
            i = 20;
        }
        mVar.LJJIIJ("page_size", new Integer(i));
        b.LJJIIZI("session_id", this.LJLILLLLZI.LJLLI, mVar);
        b.LJJIIZI("page_name", "shop", mVar);
        b.LJJIIZI("recommend_context", this.LJLILLLLZI.LJLLL, mVar);
        C61918ORu c61918ORu = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu != null && (str7 = c61918ORu.LIZLLL) != null && (LJJIL = C38350F3i.LJJIL(str7)) != null) {
            mVar.LJJIIJ("custom_tab", LJJIL);
        }
        C61918ORu c61918ORu2 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu2 != null) {
            str = c61918ORu2.LIZJ;
        } else {
            str = null;
        }
        b.LJJIIZI("enter_from", str, mVar);
        Object obj2 = this.LJLILLLLZI.LJLIL.get("traffic_source_list");
        if (obj2 instanceof int[]) {
            iArr = (int[]) obj2;
        } else {
            iArr = null;
        }
        b.LJJIIZ(mVar, "traffic_source_list", iArr);
        C61918ORu c61918ORu3 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu3 != null) {
            str2 = c61918ORu3.LJFF;
        } else {
            str2 = null;
        }
        b.LJJIIZI("source_previous_page", str2, mVar);
        C61918ORu c61918ORu4 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu4 != null) {
            str3 = c61918ORu4.LJI;
        } else {
            str3 = null;
        }
        b.LJJIIZI("enter_method", str3, mVar);
        C61918ORu c61918ORu5 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu5 != null) {
            str4 = c61918ORu5.LJ;
        } else {
            str4 = null;
        }
        b.LJJIIZI("product_id", str4, mVar);
        C61918ORu c61918ORu6 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu6 != null) {
            list = c61918ORu6.LJIIIIZZ;
        } else {
            list = null;
        }
        b.LJJIIJZLJL(mVar, "expo_product_id_list", list);
        C61918ORu c61918ORu7 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu7 != null) {
            list2 = c61918ORu7.LJIIIZ;
        } else {
            list2 = null;
        }
        b.LJJIIJZLJL(mVar, "click_product_id_list", list2);
        C61918ORu c61918ORu8 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu8 != null) {
            list3 = c61918ORu8.LJIIJ;
        } else {
            list3 = null;
        }
        b.LJJIIJZLJL(mVar, "related_product_id_list", list3);
        C61918ORu c61918ORu9 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu9 != null) {
            list4 = c61918ORu9.LJIIJJI;
        } else {
            list4 = null;
        }
        b.LJJIIJZLJL(mVar, "search_query", list4);
        C61918ORu c61918ORu10 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu10 != null) {
            list5 = c61918ORu10.LJIILJJIL;
        } else {
            list5 = null;
        }
        b.LJJIIJZLJL(mVar, "search_card_no_live_product_id_list", list5);
        C61918ORu c61918ORu11 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu11 != null) {
            list6 = c61918ORu11.LJIILIIL;
        } else {
            list6 = null;
        }
        b.LJJIIJZLJL(mVar, "search_card_live_product_id_list", list6);
        C61918ORu c61918ORu12 = this.LJLILLLLZI.LJLILLLLZI;
        if (c61918ORu12 != null) {
            str5 = c61918ORu12.LJIILL;
        } else {
            str5 = null;
        }
        b.LJJIIZI("ug_top_product_id", str5, mVar);
        PageSourceInfo LIZJ = C39468FeK.LIZJ();
        if (LIZJ != null) {
            str6 = C27739Aud.LJI(LIZJ);
        } else {
            str6 = null;
        }
        b.LJJIIZI("page_source_info", str6, mVar);
        C84661XKn LIZIZ = XKX.LIZIZ(interfaceC70422pa, null, null, new OS3(this.LJLILLLLZI, mVar, null), 3);
        SparkContext LIZIZ2 = C42193GhB.LIZIZ(RomaSchemaGroupShoppingStoreSettings.LIZ().getValue(this.LJLILLLLZI.LJLLILLLL, "shop").romaSchemaPageShopPage);
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(this.LJLJI);
        o.LJIIIIZZ(queryParameterNames, "intentData.queryParameterNames");
        android.net.Uri uri = this.LJLJI;
        for (String it : queryParameterNames) {
            if (!o.LJ(it, "sellerId") && !o.LJ(it, "trackParams")) {
                o.LJIIIIZZ(it, "it");
                String queryParameter = UriProtector.getQueryParameter(uri, it);
                if (queryParameter != null) {
                    LIZIZ2.LJJIIJ(it, queryParameter);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        LIZIZ2.LJJIIJ("seller_id", this.LJLILLLLZI.LJLLILLLL);
        LIZIZ2.LJJIIJ("is_host_profile", CardStruct.IStatusCode.DEFAULT);
        LIZIZ2.LJJIIJ("preload_container", "1");
        LIZIZ2.LJJIIJ("store_session_id", this.LJLILLLLZI.LJLLI);
        LIZIZ2.LJJIIJ("_ec_start_time", String.valueOf(this.LJLILLLLZI.LJLJLJ));
        LIZIZ2.LJJIIJ("trackParams", C27739Aud.LJI(this.LJLILLLLZI.LJLIL));
        LIZIZ2.LJJ(new C60751Nsp(null, new AqS160S0100000_10(LIZIZ, 629)));
        LIZIZ2.LJJIJIL(new C61468OAm());
        LIZIZ2.LJJ(new C61428O8y());
        StoreFragment storeFragment = this.LJLILLLLZI;
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context requireContext = storeFragment.requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(requireContext, LIZIZ2));
        LIZ.LIZIZ();
        storeFragment.LJLJJLL = LIZ;
        ((ViewGroup) this.LJLILLLLZI._$_findCachedViewById(R.id.itn)).addView(this.LJLILLLLZI.LJLJJLL);
        View expand_container = this.LJLILLLLZI._$_findCachedViewById(R.id.d1a);
        o.LJIIIIZZ(expand_container, "expand_container");
        if (expand_container.getVisibility() != 0) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.LJLILLLLZI._$_findCachedViewById(R.id.itn);
            swipeRefreshLayout.LLFFF = 0;
            swipeRefreshLayout.LJZ = false;
            swipeRefreshLayout.LJZL.invalidate();
            ((SwipeRefreshLayout) this.LJLILLLLZI._$_findCachedViewById(R.id.itn)).setOnRefreshListener(new OS6(this.LJLILLLLZI));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
