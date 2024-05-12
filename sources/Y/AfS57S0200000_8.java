package Y;

import X.AbstractC51386KEs;
import X.ActivityC45651qj;
import X.C47261Igj;
import X.C50854Jxa;
import X.C50859Jxf;
import X.C50863Jxj;
import X.C50865Jxl;
import X.C50872Jxs;
import X.C51648KOu;
import X.C75792yF;
import X.C76800UCe;
import X.C78857UxB;
import X.EnumC51280KAq;
import X.HG3;
import X.InterfaceC51622KNu;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.KF0;
import X.KHC;
import X.KHH;
import X.KHX;
import X.ORZ;
import X.RBX;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.R;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ab.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.actionai.sdk.ActionAISDKAgent;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.vision.PhotoSearchFragment;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class AfS57S0200000_8 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        TypeWords typeWords;
        List<Word> list;
        Word word;
        SuggestWordResponse suggestWordResponse = (SuggestWordResponse) obj;
        List<TypeWords> list2 = suggestWordResponse.data;
        if (list2 != null && (typeWords = (TypeWords) ORZ.LJLLLL(list2)) != null && (list = typeWords.words) != null && (word = (Word) ORZ.LJLLLL(list)) != null) {
            AbstractC51386KEs abstractC51386KEs = (AbstractC51386KEs) afS57S0200000_8.l1;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS57S0200000_8.l0;
            word.setImplId(suggestWordResponse.logId);
            abstractC51386KEs.getCurrentSearchHintWord().setValue(new KF0(word, 0));
            interfaceC88472Yns.invoke(Boolean.TRUE);
        } else {
            ((InterfaceC88472Yns) afS57S0200000_8.l0).invoke(Boolean.FALSE);
        }
        List<InterfaceC88472Yns<KF0, C76800UCe>> callbacksWhenRefreshResult = ((AbstractC51386KEs) afS57S0200000_8.l1).getCallbacksWhenRefreshResult();
        AbstractC51386KEs abstractC51386KEs2 = (AbstractC51386KEs) afS57S0200000_8.l1;
        Iterator<InterfaceC88472Yns<KF0, C76800UCe>> it = callbacksWhenRefreshResult.iterator();
        while (it.hasNext()) {
            it.next().invoke(abstractC51386KEs2.getCurrentSearchHintWord().getValue());
        }
    }

    public static final void accept$1(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        ((InterfaceC88472Yns) afS57S0200000_8.l0).invoke(Boolean.FALSE);
        Iterator<InterfaceC88472Yns<KF0, C76800UCe>> it = ((AbstractC51386KEs) afS57S0200000_8.l1).getCallbacksWhenRefreshResult().iterator();
        while (it.hasNext()) {
            it.next().invoke(null);
        }
    }

    public static final void accept$2(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        String str = (String) obj;
        ((ActionAISDKAgent) afS57S0200000_8.l0).LJLJI = str;
        ActionAISDKAgent.LJLJJLL = str;
        ((InterfaceC88472Yns) afS57S0200000_8.l1).invoke(str);
    }

    public static final void accept$3(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        FeedsResponse feedsResponse = (FeedsResponse) obj;
        InterfaceC51622KNu interfaceC51622KNu = ((C51648KOu) afS57S0200000_8.l0).LJLILLLLZI;
        JSONObject jSONObject = new JSONObject();
        C51648KOu c51648KOu = (C51648KOu) afS57S0200000_8.l0;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("react_id", c51648KOu.LJLIL);
        jSONObject2.put("page", c51648KOu.LJLJJLL);
        jSONObject2.put("has_more", feedsResponse.hasMore);
        jSONObject2.put("exist_list_raw", C75792yF.LIZJ(feedsResponse.list));
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "feeds_status_change");
        jSONObject.put("eventType", 0);
        interfaceC51622KNu.LIZ(jSONObject);
        ((C51648KOu) afS57S0200000_8.l0).handleData(feedsResponse);
        C51648KOu c51648KOu2 = (C51648KOu) afS57S0200000_8.l0;
        Activity activity = (Activity) afS57S0200000_8.l1;
        c51648KOu2.getClass();
        if (activity != null) {
            activity.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.asv, c51648KOu2);
        }
        ((C51648KOu) afS57S0200000_8.l0).mIsLoading = false;
    }

    public static final void accept$4(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        C50865Jxl c50865Jxl = (C50865Jxl) afS57S0200000_8.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS57S0200000_8.l1;
        c50865Jxl.LJIIIZ = dynamicPatch;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ;
        String str = dynamicPatch.schema;
        o.LJIIIIZZ(str, "dynamicData.schema");
        C50859Jxf.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, str, (TemplateData) obj, false, new C50854Jxa(c50865Jxl), new C50872Jxs(c50865Jxl), null);
    }

    public static final void accept$5(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        TypedByteArray typedByteArray;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Long l;
        String str15;
        Integer num;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        Integer num2;
        Integer num3;
        Integer num4;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        Integer num5;
        PhotoSearchBusinessEnterParams businessParams;
        PhotoSearchLogEnterParams logParams;
        PhotoSearchBusinessEnterParams businessParams2;
        PhotoSearchPdpEnterParams pdpParams;
        PhotoSearchPdpEnterParams pdpParams2;
        PhotoSearchLogEnterParams logParams2;
        PhotoSearchBusinessEnterParams businessParams3;
        PhotoSearchBusinessEnterParams businessParams4;
        PhotoSearchBusinessEnterParams businessParams5;
        PhotoSearchLogEnterParams logParams3;
        PhotoSearchLogEnterParams logParams4;
        PhotoSearchBusinessEnterParams businessParams6;
        PhotoSearchBusinessEnterParams businessParams7;
        PhotoSearchBusinessEnterParams businessParams8;
        PhotoSearchToolsEnterParams toolsParams;
        PhotoSearchBusinessEnterParams businessParams9;
        PhotoSearchBusinessEnterParams businessParams10;
        PhotoSearchBusinessEnterParams businessParams11;
        PhotoSearchBusinessEnterParams businessParams12;
        PhotoSearchBusinessEnterParams businessParams13;
        PhotoSearchBusinessEnterParams businessParams14;
        PhotoSearchBusinessEnterParams businessParams15;
        PhotoSearchToolsEnterParams toolsParams2;
        PhotoSearchBusinessEnterParams businessParams16;
        PhotoSearchBusinessEnterParams businessParams17;
        PhotoSearchBusinessEnterParams businessParams18;
        PhotoSearchBusinessEnterParams businessParams19;
        PhotoSearchBusinessEnterParams businessParams20;
        String groupId;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchBusinessEnterParams businessParams21;
        String str32;
        PhotoSearchBusinessEnterParams businessParams22;
        PhotoSearchBusinessEnterParams businessParams23;
        PhotoSearchBusinessEnterParams businessParams24;
        PhotoSearchBusinessEnterParams businessParams25;
        PhotoSearchBusinessEnterParams businessParams26;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchBusinessEnterParams businessParams27;
        PhotoSearchViewModel photoSearchViewModel;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchToolsEnterParams toolsParams3;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchToolsEnterParams toolsParams4;
        byte[] bArr = (byte[]) obj;
        KHH khh = new KHH(0);
        if (bArr == null) {
            typedByteArray = null;
        } else {
            typedByteArray = new TypedByteArray("image/jpeg", bArr, "image");
        }
        khh.LIZ = typedByteArray;
        khh.LIZIZ = null;
        khh.LIZJ = null;
        khh.LIZLLL = null;
        PhotoSearchViewModel photoSearchViewModel2 = ((PhotoSearchFragment) afS57S0200000_8.l0).LJLJLJ;
        String str33 = "";
        if (photoSearchViewModel2 == null || (photoSearchEnterParams4 = photoSearchViewModel2.LJLILLLLZI) == null || (toolsParams4 = photoSearchEnterParams4.getToolsParams()) == null || (str = toolsParams4.getSearchSource()) == null) {
            str = "";
        }
        PhotoSearchViewModel photoSearchViewModel3 = ((PhotoSearchFragment) afS57S0200000_8.l0).LJLJLJ;
        if (photoSearchViewModel3 != null && (photoSearchEnterParams2 = photoSearchViewModel3.LJLILLLLZI) != null && (businessParams27 = photoSearchEnterParams2.getBusinessParams()) != null && businessParams27.getRootEnterFromType() == EnumC51280KAq.PDP_FIND_SIMILAR.getValue() && (photoSearchViewModel = ((PhotoSearchFragment) afS57S0200000_8.l0).LJLJLJ) != null && (photoSearchEnterParams3 = photoSearchViewModel.LJLILLLLZI) != null && (toolsParams3 = photoSearchEnterParams3.getToolsParams()) != null) {
            str2 = toolsParams3.getLocalFilePath();
        } else {
            str2 = null;
        }
        KHC khc = new KHC(str, khh, str2, 950269);
        PhotoSearchViewModel photoSearchViewModel4 = ((PhotoSearchFragment) afS57S0200000_8.l0).LJLJLJ;
        if (photoSearchViewModel4 != null) {
            JSONObject jSONObject = new JSONObject();
            PhotoSearchEnterParams photoSearchEnterParams5 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams5 != null && (businessParams26 = photoSearchEnterParams5.getBusinessParams()) != null) {
                str3 = businessParams26.getEnterFrom();
            } else {
                str3 = null;
            }
            jSONObject.put("enter_from", str3);
            jSONObject.put("source", photoSearchViewModel4.hv0());
            PhotoSearchEnterParams photoSearchEnterParams6 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams6 != null && (businessParams25 = photoSearchEnterParams6.getBusinessParams()) != null) {
                str4 = businessParams25.getSearchChannel();
            } else {
                str4 = null;
            }
            jSONObject.put("search_channel", str4);
            PhotoSearchEnterParams photoSearchEnterParams7 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams7 != null && (businessParams24 = photoSearchEnterParams7.getBusinessParams()) != null) {
                str5 = businessParams24.getSearchContext();
            } else {
                str5 = null;
            }
            jSONObject.put("search_context", str5);
            PhotoSearchEnterParams photoSearchEnterParams8 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams8 != null && (businessParams23 = photoSearchEnterParams8.getBusinessParams()) != null) {
                str6 = businessParams23.getEnterMethod();
            } else {
                str6 = null;
            }
            jSONObject.put("enter_method", str6);
            KHH khh2 = photoSearchViewModel4.LJLJJL.LJIILL;
            if (khh2 != null) {
                str7 = khh2.LIZIZ;
            } else {
                str7 = null;
            }
            jSONObject.put("image_uri", str7);
            KHH khh3 = photoSearchViewModel4.LJLJJL.LJIILL;
            if (khh3 != null) {
                str8 = khh3.LIZJ;
            } else {
                str8 = null;
            }
            jSONObject.put("detection", str8);
            KHH khh4 = photoSearchViewModel4.LJLJJL.LJIILL;
            if (khh4 != null) {
                str9 = khh4.LIZLLL;
            } else {
                str9 = null;
            }
            jSONObject.put("detection_index", str9);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tiktok_mall_photo_search_");
            LIZ.append(photoSearchViewModel4.LJLLILLLL);
            jSONObject.put("keyword", X1D.LIZIZ(LIZ));
            PhotoSearchEnterParams photoSearchEnterParams9 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams9 != null && (businessParams22 = photoSearchEnterParams9.getBusinessParams()) != null) {
                str10 = businessParams22.getGroupId();
            } else {
                str10 = null;
            }
            if (!C78857UxB.LJJJIL(str10) && (photoSearchEnterParams = photoSearchViewModel4.LJLILLLLZI) != null && (businessParams21 = photoSearchEnterParams.getBusinessParams()) != null) {
                ICommonFeedApiService LIZ2 = CommonFeedApiService.LIZ();
                if (LIZ2 == null || (str32 = LIZ2.LJJIFFI()) == null) {
                    str32 = "";
                }
                businessParams21.setGroupId(str32);
            }
            PhotoSearchEnterParams photoSearchEnterParams10 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams10 != null && (businessParams20 = photoSearchEnterParams10.getBusinessParams()) != null && (groupId = businessParams20.getGroupId()) != null) {
                str33 = groupId;
            }
            jSONObject.put("group_id", str33);
            PhotoSearchEnterParams photoSearchEnterParams11 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams11 != null && (businessParams19 = photoSearchEnterParams11.getBusinessParams()) != null) {
                str11 = businessParams19.getPhotoSearchPreviousPage();
            } else {
                str11 = null;
            }
            jSONObject.put("search_previous_page", str11);
            PhotoSearchEnterParams photoSearchEnterParams12 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams12 != null && (businessParams18 = photoSearchEnterParams12.getBusinessParams()) != null) {
                str12 = businessParams18.getPhotoSearchPreviousSearchType();
            } else {
                str12 = null;
            }
            jSONObject.put("search_previous_search_type", str12);
            PhotoSearchEnterParams photoSearchEnterParams13 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams13 != null && (businessParams17 = photoSearchEnterParams13.getBusinessParams()) != null) {
                str13 = businessParams17.getTrafficSourceList();
            } else {
                str13 = null;
            }
            jSONObject.put("traffic_source_list", str13);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("initLynxParam: ");
            PhotoSearchEnterParams photoSearchEnterParams14 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams14 != null && (businessParams16 = photoSearchEnterParams14.getBusinessParams()) != null) {
                str14 = businessParams16.getTrafficSourceList();
            } else {
                str14 = null;
            }
            LIZ3.append(str14);
            X1D.LIZIZ(LIZ3);
            PhotoSearchEnterParams photoSearchEnterParams15 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams15 != null && (toolsParams2 = photoSearchEnterParams15.getToolsParams()) != null) {
                l = toolsParams2.getSearchTime();
            } else {
                l = null;
            }
            jSONObject.put("search_time", l);
            PhotoSearchEnterParams photoSearchEnterParams16 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams16 != null && (businessParams15 = photoSearchEnterParams16.getBusinessParams()) != null) {
                str15 = businessParams15.getFromMiddleBackFromResult();
            } else {
                str15 = null;
            }
            jSONObject.put("from_middle_back_from_result", str15);
            PhotoSearchEnterParams photoSearchEnterParams17 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams17 != null && (businessParams14 = photoSearchEnterParams17.getBusinessParams()) != null) {
                num = businessParams14.isFromVideo();
            } else {
                num = null;
            }
            jSONObject.put("is_from_video", num);
            PhotoSearchEnterParams photoSearchEnterParams18 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams18 != null && (businessParams13 = photoSearchEnterParams18.getBusinessParams()) != null) {
                str16 = businessParams13.isFromComment();
            } else {
                str16 = null;
            }
            jSONObject.put("is_from_comment", str16);
            PhotoSearchEnterParams photoSearchEnterParams19 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams19 != null && (businessParams12 = photoSearchEnterParams19.getBusinessParams()) != null) {
                str17 = businessParams12.getLastFromGroupId();
            } else {
                str17 = null;
            }
            jSONObject.put("lastFromGroupId", str17);
            PhotoSearchEnterParams photoSearchEnterParams20 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams20 != null && (businessParams11 = photoSearchEnterParams20.getBusinessParams()) != null) {
                str18 = businessParams11.getAttachProducts();
            } else {
                str18 = null;
            }
            jSONObject.put("attach_products", str18);
            PhotoSearchEnterParams photoSearchEnterParams21 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams21 != null && (businessParams10 = photoSearchEnterParams21.getBusinessParams()) != null) {
                str19 = businessParams10.getLatestSearchId();
            } else {
                str19 = null;
            }
            jSONObject.put("last_search_id", str19);
            PhotoSearchEnterParams photoSearchEnterParams22 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams22 != null && (businessParams9 = photoSearchEnterParams22.getBusinessParams()) != null) {
                str20 = businessParams9.getPersonalContextInfo();
            } else {
                str20 = null;
            }
            jSONObject.put("personal_context_info", str20);
            PhotoSearchEnterParams photoSearchEnterParams23 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams23 != null && (toolsParams = photoSearchEnterParams23.getToolsParams()) != null) {
                str21 = toolsParams.getSearchSource();
            } else {
                str21 = null;
            }
            jSONObject.put("search_source", str21);
            jSONObject.put("query_correct_type", 1);
            PhotoSearchEnterParams photoSearchEnterParams24 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams24 != null && (businessParams8 = photoSearchEnterParams24.getBusinessParams()) != null) {
                num2 = businessParams8.isFilterSearch();
            } else {
                num2 = null;
            }
            jSONObject.put("is_filter_search", num2);
            jSONObject.put("current_uid", ((RBX) HG3.LJIILL()).getCurUserId());
            jSONObject.put("hot_search", 0);
            PhotoSearchEnterParams photoSearchEnterParams25 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams25 != null && (businessParams7 = photoSearchEnterParams25.getBusinessParams()) != null) {
                num3 = businessParams7.getSortType();
            } else {
                num3 = null;
            }
            jSONObject.put("sort_type", num3);
            PhotoSearchEnterParams photoSearchEnterParams26 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams26 != null && (businessParams6 = photoSearchEnterParams26.getBusinessParams()) != null) {
                num4 = businessParams6.getFilterBy();
            } else {
                num4 = null;
            }
            jSONObject.put("filter_by", num4);
            PhotoSearchEnterParams photoSearchEnterParams27 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams27 != null && (logParams4 = photoSearchEnterParams27.getLogParams()) != null) {
                str22 = logParams4.getSearchEntrance();
            } else {
                str22 = null;
            }
            jSONObject.put("search_entrance", str22);
            PhotoSearchEnterParams photoSearchEnterParams28 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams28 != null && (logParams3 = photoSearchEnterParams28.getLogParams()) != null) {
                str23 = logParams3.getPhotoSearchTypeDetail();
            } else {
                str23 = null;
            }
            jSONObject.put("photo_search_type_detail", str23);
            HashMap hashMap = new HashMap();
            PhotoSearchEnterParams photoSearchEnterParams29 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams29 != null && (businessParams5 = photoSearchEnterParams29.getBusinessParams()) != null) {
                str24 = businessParams5.getEnterFrom();
            } else {
                str24 = null;
            }
            hashMap.put("enter_from", str24);
            PhotoSearchEnterParams photoSearchEnterParams30 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams30 != null && (businessParams4 = photoSearchEnterParams30.getBusinessParams()) != null) {
                str25 = businessParams4.getEnterMethod();
            } else {
                str25 = null;
            }
            hashMap.put("enter_method", str25);
            PhotoSearchEnterParams photoSearchEnterParams31 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams31 != null && (businessParams3 = photoSearchEnterParams31.getBusinessParams()) != null) {
                str26 = businessParams3.getPhotoSearchPreviousPage();
            } else {
                str26 = null;
            }
            hashMap.put("photo_search_previous_page", str26);
            PhotoSearchEnterParams photoSearchEnterParams32 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams32 != null && (logParams2 = photoSearchEnterParams32.getLogParams()) != null) {
                str27 = logParams2.getPhotoSearchTypeDetail();
            } else {
                str27 = null;
            }
            hashMap.put("photo_search_type_detail", str27);
            PhotoSearchEnterParams photoSearchEnterParams33 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams33 != null && (pdpParams2 = photoSearchEnterParams33.getPdpParams()) != null) {
                str28 = pdpParams2.getEnterProductId();
            } else {
                str28 = null;
            }
            hashMap.put("enter_product_id", str28);
            PhotoSearchEnterParams photoSearchEnterParams34 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams34 != null && (pdpParams = photoSearchEnterParams34.getPdpParams()) != null) {
                str29 = pdpParams.getTrackId();
            } else {
                str29 = null;
            }
            hashMap.put("track_id", str29);
            PhotoSearchEnterParams photoSearchEnterParams35 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams35 != null && (businessParams2 = photoSearchEnterParams35.getBusinessParams()) != null && businessParams2.getRootEnterFromType() == EnumC51280KAq.PDP_FIND_SIMILAR.getValue()) {
                str30 = "product_detail";
            } else {
                str30 = null;
            }
            hashMap.put("previous_page", str30);
            PhotoSearchEnterParams photoSearchEnterParams36 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams36 != null && (logParams = photoSearchEnterParams36.getLogParams()) != null) {
                str31 = logParams.getSearchEntrance();
            } else {
                str31 = null;
            }
            hashMap.put("search_entrance", str31);
            jSONObject.put("bizLogParams", hashMap);
            PhotoSearchEnterParams photoSearchEnterParams37 = photoSearchViewModel4.LJLILLLLZI;
            if (photoSearchEnterParams37 != null && (businessParams = photoSearchEnterParams37.getBusinessParams()) != null) {
                num5 = businessParams.getRecallShield();
            } else {
                num5 = null;
            }
            jSONObject.put("recall_shield", num5);
            photoSearchViewModel4.LJLJL = jSONObject;
        }
        PhotoSearchViewModel photoSearchViewModel5 = ((PhotoSearchFragment) afS57S0200000_8.l0).LJLJLJ;
        if (photoSearchViewModel5 != null) {
            ActivityC45651qj activity = (ActivityC45651qj) afS57S0200000_8.l1;
            o.LJIIIIZZ(activity, "activity");
            PhotoSearchFragment lifecycleOwner = (PhotoSearchFragment) afS57S0200000_8.l0;
            o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
            photoSearchViewModel5.LJLJJLL = new C50863Jxj(activity, lifecycleOwner);
            String str34 = RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageImageSearch;
            DynamicPatch dynamicPatch = new DynamicPatch();
            dynamicPatch.schema = str34;
            List LJJIJIL = C47261Igj.LJJIJIL(new DynamicData(0, dynamicPatch, 1, null));
            C50863Jxj c50863Jxj = photoSearchViewModel5.LJLJJLL;
            if (c50863Jxj != null) {
                c50863Jxj.LJ(KHX.LJLIL, LJJIJIL);
            }
        }
        PhotoSearchViewModel photoSearchViewModel6 = ((PhotoSearchFragment) afS57S0200000_8.l0).LJLJLJ;
        if (photoSearchViewModel6 != null) {
            photoSearchViewModel6.jv0();
        }
        PhotoSearchViewModel photoSearchViewModel7 = ((PhotoSearchFragment) afS57S0200000_8.l0).LJLJLJ;
        if (photoSearchViewModel7 != null) {
            ActivityC45651qj activity2 = (ActivityC45651qj) afS57S0200000_8.l1;
            o.LJIIIIZZ(activity2, "activity");
            MutableLiveData iv0 = photoSearchViewModel7.iv0(activity2, khc);
            if (iv0 != null) {
                iv0.observe((ActivityC45651qj) afS57S0200000_8.l1, ((PhotoSearchFragment) afS57S0200000_8.l0).LJLLL);
            }
        }
    }

    public static final void accept$6(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        C50863Jxj c50863Jxj = (C50863Jxj) afS57S0200000_8.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS57S0200000_8.l1;
        c50863Jxj.LJIIIZ = dynamicPatch;
        c50863Jxj.LJIIL.LIZ(dynamicPatch);
        ((C50863Jxj) afS57S0200000_8.l0).LJIILLIIL((DynamicPatch) afS57S0200000_8.l1, (TemplateData) obj);
    }

    public static final void accept$7(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        C50863Jxj c50863Jxj = (C50863Jxj) afS57S0200000_8.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS57S0200000_8.l1;
        c50863Jxj.LJIIIZ = dynamicPatch;
        c50863Jxj.LJIIL.LIZ(dynamicPatch);
        ((C50863Jxj) afS57S0200000_8.l0).LJIILLIIL((DynamicPatch) afS57S0200000_8.l1, (TemplateData) obj);
    }

    public static final void accept$8(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        C50863Jxj c50863Jxj = (C50863Jxj) afS57S0200000_8.l0;
        c50863Jxj.LJIIL.LIZ(c50863Jxj.LJIIIZ);
        ((C50863Jxj) afS57S0200000_8.l0).LJIILLIIL((DynamicPatch) afS57S0200000_8.l1, (TemplateData) obj);
    }

    public static final void accept$9(AfS57S0200000_8 afS57S0200000_8, Object obj) {
        C50863Jxj c50863Jxj = (C50863Jxj) afS57S0200000_8.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS57S0200000_8.l1;
        c50863Jxj.LJIIIZ = dynamicPatch;
        c50863Jxj.LJIIL.LIZ(dynamicPatch);
        ((C50863Jxj) afS57S0200000_8.l0).LJIILLIIL((DynamicPatch) afS57S0200000_8.l1, (TemplateData) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS57S0200000_8(Object obj, ActionAISDKAgent actionAISDKAgent, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
        this.l1 = actionAISDKAgent;
    }
}
