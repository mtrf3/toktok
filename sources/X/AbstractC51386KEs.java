package X;

import Y.AfS57S0200000_8;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.legacy.api.SearchSuggestWordsApi;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.a1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.KEs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51386KEs extends FrameLayout implements InterfaceC70514Rlu {
    public final ECSearchEntranceData LJLIL;
    public final KEK LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final MutableLiveData<KF0> LJLJJI;
    public final SmartRoute LJLJJL;
    public List<InterfaceC88472Yns<KF0, C76800UCe>> LJLJJLL;
    public final String LJLJL;
    public final java.util.Map<String, String> LJLJLJ;
    public final java.util.Map<String, String> LJLJLLL;
    public final java.util.Map<String, String> LJLL;

    public void Y0() {
    }

    public C188727au LIZ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c188727au.LIZLLL(1, "is_ecom_search");
        String str = this.LJLILLLLZI.LJIIL;
        if (str != null) {
            c188727au.LJI("enter_product_id", str);
        }
        String str2 = this.LJLILLLLZI.LIZJ;
        if (str2 != null) {
            c188727au.LJI("enter_group_id", str2);
        }
        String str3 = this.LJLILLLLZI.LJIJJLI;
        if (str3 != null) {
            c188727au.LJI("product_panel_type", str3);
        }
        Integer num = this.LJLILLLLZI.LJI;
        if (num != null) {
            c188727au.LJI("root_enter_from_type", String.valueOf(num.intValue()));
        }
        return c188727au;
    }

    public final List<InterfaceC88472Yns<KF0, C76800UCe>> getCallbacksWhenRefreshResult() {
        return this.LJLJJLL;
    }

    public final MutableLiveData<KF0> getCurrentSearchHintWord() {
        return this.LJLJJI;
    }

    public final String getDefaultHintWord() {
        return this.LJLJL;
    }

    public final KEK getEntranceModel() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnClick() {
        return this.LJLJI;
    }

    public SmartRoute getSmartRoute() {
        return this.LJLJJL;
    }

    public SmartRoute LIZIZ(Context context) {
        String str;
        String str2;
        Word word;
        String word2;
        Word word3;
        String implId;
        Word word4;
        ICommonFeedApiService LIZ = CommonFeedApiService.LIZ();
        String str3 = "";
        if (LIZ == null || (str = LIZ.LJJIFFI()) == null) {
            str = "";
        }
        SmartRoute smartRoute = getSmartRoute();
        smartRoute.withParam("root_enter_from_type", this.LJLIL.getRootEnterFromType());
        smartRoute.withParam("enter_from", this.LJLILLLLZI.LIZ);
        smartRoute.withParam("traffic_source_list", this.LJLILLLLZI.LIZLLL);
        smartRoute.withParam("ec_entrance_data", this.LJLIL);
        smartRoute.withParam("in_single_stack", true);
        int i = 0;
        smartRoute.withParam("set_hint_by_sug_word", false);
        smartRoute.withParam("keep_tab_position", true);
        KAK kak = KAK.SHOP;
        smartRoute.withParam("target_tab", kak.getTabName());
        smartRoute.withParam("single_tab_type", kak.getTabName());
        smartRoute.withParam("blankpage_enter_from", this.LJLILLLLZI.LIZ);
        smartRoute.withParam("blankpage_enter_method", "enter");
        smartRoute.withParam("group_id", str);
        smartRoute.withParam("enter_group_id", str);
        KF0 value = this.LJLJJI.getValue();
        if (value == null || (word4 = value.LIZ) == null || (str2 = word4.getId()) == null) {
            str2 = "";
        }
        smartRoute.withParam("hint_group_id", str2);
        KF0 value2 = this.LJLJJI.getValue();
        if (value2 != null && (word3 = value2.LIZ) != null && (implId = word3.getImplId()) != null) {
            str3 = implId;
        }
        smartRoute.withParam("hint_imp_id", str3);
        KF0 value3 = this.LJLJJI.getValue();
        if (value3 != null) {
            i = value3.LIZIZ;
        }
        smartRoute.withParam("hint_position", i);
        KF0 value4 = this.LJLJJI.getValue();
        if (value4 != null && (word = value4.LIZ) != null && (word2 = word.getWord()) != null && C78685UuP.LJJJZ(word2)) {
            smartRoute.withParam("search_hint_word", word2);
        }
        String str4 = this.LJLILLLLZI.LJIIL;
        if (str4 != null) {
            smartRoute.withParam("src_material_id", str4);
            this.LJLJLLL.put("enter_product_id", str4);
            this.LJLL.put("enter_product_id", str4);
        }
        String str5 = this.LJLILLLLZI.LJIJJ;
        if (str5 != null) {
            smartRoute.withParam("src_anchor_product_id", str5);
        }
        String str6 = this.LJLILLLLZI.LJIJJLI;
        if (str6 != null) {
            smartRoute.withParam("product_panel_type", str6);
            this.LJLJLLL.put("product_panel_type", str6);
            this.LJLL.put("product_panel_type", str6);
        }
        String str7 = this.LJLILLLLZI.LJII;
        if (str7 != null) {
            this.LJLJLJ.put("search_entrance", str7);
        }
        String str8 = this.LJLILLLLZI.LJIIIIZZ;
        if (str8 != null) {
            this.LJLJLJ.put("result_search_entrance", str8);
        }
        this.LJLJLLL.put("enter_group_id", str);
        this.LJLL.put("enter_group_id", str);
        this.LJLJLLL.put("is_ecom_search", "1");
        this.LJLL.put("is_ecom_search", "1");
        smartRoute.withParam("ec_extra_log_params", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), this.LJLJLJ));
        smartRoute.withParam("ec_middle_extra_log_params", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), this.LJLJLLL));
        smartRoute.withParam("ec_result_extra_log_params", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), this.LJLL));
        return smartRoute;
    }

    @Override // X.InterfaceC70514Rlu
    public final void LLFFF(AqS178S0100000_12 aqS178S0100000_12) {
        C34K c34k = new C34K();
        this.LJLJJLL.add(new AqS139S0200000_8(aqS178S0100000_12, c34k, 1));
        if (!c34k.element && this.LJLJJI.getValue() != null) {
            aqS178S0100000_12.invoke(this.LJLJJI.getValue());
        }
    }

    @Override // X.InterfaceC70514Rlu
    public final void LLZZZZ(KF0 hintWordModel) {
        o.LJIIIZ(hintWordModel, "hintWordModel");
        this.LJLJJI.setValue(hintWordModel);
    }

    public final void setCallbacksWhenRefreshResult(List<InterfaceC88472Yns<KF0, C76800UCe>> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJJLL = list;
    }

    public final void setDefaultHintWordInView(String str) {
        MutableLiveData<KF0> mutableLiveData = this.LJLJJI;
        Word word = new Word();
        if (!C78685UuP.LJJJZ(str)) {
            str = this.LJLJL;
        }
        word.setWord(str);
        mutableLiveData.setValue(new KF0(word, 2, 0));
    }

    @Override // X.InterfaceC70514Rlu
    public final boolean LLLFF(KF2 kf2, InterfaceC88472Yns<? super Boolean, C76800UCe> callbackInUIThread) {
        Object LIZ;
        String str;
        o.LJIIIZ(callbackInUIThread, "callbackInUIThread");
        if (kf2 == null) {
            kf2 = new KF2();
        }
        kf2.LIZLLL = this.LJLIL.getEnterReqSource();
        KEK kek = this.LJLILLLLZI;
        kf2.LJ = kek.LJIIL;
        kf2.LJFF = kek.LJIJJ;
        kf2.LJI = kek.LJIILIIL;
        kf2.LJII = kek.LJIILJJIL;
        try {
            if (C38354F3m.LIZJ(EF7.LJIILIIL, "local_test")) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            kf2.LIZJ = str;
            SearchSuggestWordsApi.LIZ(kf2).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS57S0200000_8(callbackInUIThread, this, 0), new AfS57S0200000_8(callbackInUIThread, this, 1));
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C36922EeM.LJ("refreshHintWord request fail: " + m10exceptionOrNullimpl.getMessage());
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC51386KEs(Context context, ECSearchEntranceData eCSearchEntranceData, KEK kek, InterfaceC65784Pro interfaceC65784Pro) {
        super(context, null);
        a1.LJFF(context, "context");
        this.LJLIL = eCSearchEntranceData;
        this.LJLILLLLZI = kek;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = new MutableLiveData<>();
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//search");
        o.LJIIIIZZ(buildRoute, "buildRoute(\n        cont…onstants.URL_SEARCH\n    )");
        this.LJLJJL = buildRoute;
        this.LJLJJLL = new ArrayList();
        this.LJLJL = Z9N.LIZIZ.LLIIII(context);
        this.LJLJLJ = new LinkedHashMap();
        this.LJLJLLL = new LinkedHashMap();
        this.LJLL = new LinkedHashMap();
    }
}
