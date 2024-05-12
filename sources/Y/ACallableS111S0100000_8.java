package Y;

import X.AbstractC029409q;
import X.C16880lQ;
import X.C170666ms;
import X.C36922EeM;
import X.C45804HyK;
import X.C46539IOh;
import X.C47549IlN;
import X.C47554IlS;
import X.C48948JIy;
import X.C49006JLe;
import X.C49915JiR;
import X.C50139Jm3;
import X.C50321Joz;
import X.C50651JuJ;
import X.C50652JuK;
import X.C76800UCe;
import X.C78934UyQ;
import X.C79146V4k;
import X.EnumC49404JaC;
import X.FMX;
import X.FR7;
import X.FUA;
import X.IR7;
import X.InterfaceC46541IOj;
import X.InterfaceC65784Pro;
import X.JN8;
import X.JND;
import X.JQA;
import X.O5Y;
import X.ORZ;
import X.OSZ;
import X.PEH;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.ttm.player.TTPlayerClient;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ACallableS111S0100000_8 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case 24:
                return call$24(this);
            case 25:
                return call$25(this);
            case 26:
                return call$26(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        ((Runnable) aCallableS111S0100000_8.l0).run();
        return "Done";
    }

    public static final Object call$1(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        try {
            C16880lQ.LLLZZIL((File) aCallableS111S0100000_8.l0);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object call$10(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        try {
            ((TTPlayerClient) aCallableS111S0100000_8.l0).LJLLLLLL.lockInterruptibly();
            try {
                if (((TTPlayerClient) aCallableS111S0100000_8.l0).LJJJJLI()) {
                    ((TTPlayerClient) aCallableS111S0100000_8.l0).LJZL.LJJI(null);
                }
                ((TTPlayerClient) aCallableS111S0100000_8.l0).LJLLLLLL.unlock();
                return "OK";
            } catch (Throwable th) {
                ((TTPlayerClient) aCallableS111S0100000_8.l0).LJLLLLLL.unlock();
                throw th;
            }
        } catch (InterruptedException unused) {
            O5Y.LJFF(TTPlayerClient.LLIIZ, aCallableS111S0100000_8, "mPlayer setsurface null failed.");
            return "OK";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$11(Y.ACallableS111S0100000_8 r16) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS111S0100000_8.call$11(Y.ACallableS111S0100000_8):java.lang.Object");
    }

    public static final Object call$12(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key_word", ((EcDynamicSearchFragment) aCallableS111S0100000_8.l0).Jl());
            if (o.LJ(((EcDynamicSearchFragment) aCallableS111S0100000_8.l0).LJLZ, "search_history")) {
                EcDynamicSearchFragment ecDynamicSearchFragment = (EcDynamicSearchFragment) aCallableS111S0100000_8.l0;
                ecDynamicSearchFragment.getClass();
                ecDynamicSearchFragment.LJZI = "search_history";
            } else if (o.LJ(((EcDynamicSearchFragment) aCallableS111S0100000_8.l0).LJLZ, "search_sug")) {
                EcDynamicSearchFragment ecDynamicSearchFragment2 = (EcDynamicSearchFragment) aCallableS111S0100000_8.l0;
                ecDynamicSearchFragment2.getClass();
                ecDynamicSearchFragment2.LJZI = "search_sug";
            } else {
                EcDynamicSearchFragment ecDynamicSearchFragment3 = (EcDynamicSearchFragment) aCallableS111S0100000_8.l0;
                ecDynamicSearchFragment3.getClass();
                ecDynamicSearchFragment3.LJZI = "normal_search";
            }
            jSONObject.put("enter_from", ((EcDynamicSearchFragment) aCallableS111S0100000_8.l0).LJZI);
        } catch (JSONException unused) {
        }
        String Il = ((EcDynamicSearchFragment) aCallableS111S0100000_8.l0).Il();
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("search");
        obtain.setLabelName(Il);
        obtain.setJsonObject(jSONObject);
        FMX.onEvent(obtain);
        return C76800UCe.LIZ;
    }

    public static final Object call$13(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        User user;
        ProductGroup productGroup;
        List<Product> list;
        User user2;
        String uid;
        String str5;
        User user3;
        User user4;
        User user5;
        User user6;
        SearchUser searchUser = ((SearchUserViewHolder) aCallableS111S0100000_8.l0).LLFFF;
        Integer num = null;
        if (searchUser != null && (user6 = searchUser.user) != null) {
            str = C79146V4k.LJJIJIL(user6);
        } else {
            str = null;
        }
        SearchUserViewHolder searchUserViewHolder = (SearchUserViewHolder) aCallableS111S0100000_8.l0;
        if (searchUserViewHolder.LLIIJLIL == EnumC49404JaC.SHOW_BLOCK) {
            str = "blocked";
        }
        JQA LJLJL = searchUserViewHolder.LJLJL();
        SearchGlobalViewModel M = ((SearchUserViewHolder) aCallableS111S0100000_8.l0).M();
        if (M != null) {
            str2 = M.jv0();
        } else {
            str2 = null;
        }
        LJLJL.LIZ(str2);
        String str6 = LJLJL.LJIIZILJ;
        String str7 = "";
        if (TextUtils.isEmpty(str6) && ((user5 = ((SearchUserViewHolder) aCallableS111S0100000_8.l0).LLIIIZ) == null || (str6 = user5.getUid()) == null)) {
            str6 = "";
        }
        String f0 = ((SearchUserViewHolder) aCallableS111S0100000_8.l0).f0();
        JN8 LIZIZ = JND.LIZIZ(LJLJL);
        SearchUserViewHolder searchUserViewHolder2 = (SearchUserViewHolder) aCallableS111S0100000_8.l0;
        LIZIZ.LJIJ("user_tag", str);
        LIZIZ.LJIIZILJ("user_list", str6);
        String h0 = searchUserViewHolder2.h0();
        SearchUser searchUser2 = searchUserViewHolder2.LLFFF;
        if (searchUser2 != null && (user4 = searchUser2.user) != null) {
            str3 = user4.getUniqueId();
        } else {
            str3 = null;
        }
        LIZIZ.LJIIZILJ("user_name", str3);
        SearchUser searchUser3 = searchUserViewHolder2.LLFFF;
        if (searchUser3 != null && (user3 = searchUser3.user) != null) {
            num = Integer.valueOf(C45804HyK.LJJIIJ(user3));
        }
        LIZIZ.LJIIZILJ("relation_tag", String.valueOf(num));
        SearchUser searchUser4 = searchUserViewHolder2.LLFFF;
        if (searchUser4 != null && !searchUser4.isAladdin() && LJLJL.LIZ) {
            LIZIZ.LJIIZILJ("item_rank", String.valueOf(searchUserViewHolder2.getAdapterPosition()));
        }
        if (LJLJL.LJJIJIIJIL != null) {
            LIZIZ.LJIIZILJ("list_result_type", "user");
            LIZIZ.LJJIII(Integer.valueOf(searchUserViewHolder2.getAdapterPosition()));
            User user7 = searchUserViewHolder2.LLFF;
            if (user7 == null || (str5 = user7.getSearchUserDesc()) == null) {
                str5 = "";
            }
            LIZIZ.LIZLLL("aladdin_words", str5);
        }
        SearchUser searchUser5 = searchUserViewHolder2.LLFFF;
        if (searchUser5 != null && searchUser5.isAladdin()) {
            SearchUser searchUser6 = searchUserViewHolder2.LLFFF;
            if (searchUser6 != null && (user2 = searchUser6.user) != null && (uid = user2.getUid()) != null) {
                str7 = uid;
            }
            LIZIZ.LJIIZILJ("list_item_id", str7);
        }
        LIZIZ.LJIIZILJ("token_type", h0);
        SearchUser searchUser7 = searchUserViewHolder2.LLFFF;
        if (searchUser7 != null && (productGroup = searchUser7.productGroup) != null && (list = productGroup.productList) != null && (!list.isEmpty())) {
            i = 1;
        } else {
            i = 0;
        }
        LIZIZ.LJJIIJ(Integer.valueOf(i));
        LIZIZ.LJJIIJZLJL(searchUserViewHolder2.c0());
        LIZIZ.LJJII(searchUserViewHolder2.g0());
        SearchUser searchUser8 = searchUserViewHolder2.LLFFF;
        if (searchUser8 != null && (user = searchUser8.user) != null && user.isLive()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.LJIIZILJ("is_live", str4);
        LIZIZ.LJIIZILJ("product_window_type", f0);
        LIZIZ.LJIIZILJ("ecom_user_type", searchUserViewHolder2.Y());
        LIZIZ.LIZLLL("section_type", searchUserViewHolder2.LLIIII);
        LIZIZ.LJIILIIL();
        if (f0.equals("showcase_entrance") && !((SearchUserViewHolder) aCallableS111S0100000_8.l0).LLIIIJ) {
            ((SearchUserViewHolder) aCallableS111S0100000_8.l0).LLIIIJ = true;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entrance_form", "search_usercard_showcase_entrance");
            FMX.LJIILJJIL("rd_ec_product_entrance_will_show", jSONObject);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$14(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cursor", ((C49915JiR) aCallableS111S0100000_8.l0).LJLJI);
        jSONObject.put("searchId", ((C49915JiR) aCallableS111S0100000_8.l0).LJLJJLL);
        jSONObject.put("keyword", ((C49915JiR) aCallableS111S0100000_8.l0).LJLILLLLZI);
        jSONObject.put("correctType", ((C49915JiR) aCallableS111S0100000_8.l0).LJLJLJ);
        FUA.LIZJ("search_page_repeat_request", jSONObject);
        return Integer.valueOf(Log.d("tlh", jSONObject.toString()));
    }

    public static final Object call$15(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        InterfaceC46541IOj interfaceC46541IOj = ((C46539IOh) aCallableS111S0100000_8.l0).LJLJJL;
        if (interfaceC46541IOj != null) {
            return interfaceC46541IOj.LIZJ();
        }
        return null;
    }

    public static final Object call$16(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        InterfaceC46541IOj interfaceC46541IOj = ((C46539IOh) aCallableS111S0100000_8.l0).LJLJJL;
        if (interfaceC46541IOj != null) {
            return interfaceC46541IOj.LIZJ();
        }
        return null;
    }

    public static final Object call$17(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        InterfaceC46541IOj interfaceC46541IOj = ((C46539IOh) aCallableS111S0100000_8.l0).LJLJJL;
        if (interfaceC46541IOj != null) {
            return interfaceC46541IOj.LIZJ();
        }
        return null;
    }

    public static final Object call$18(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        ((InterfaceC65784Pro) aCallableS111S0100000_8.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$19(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        List<? extends Aweme> list;
        List<Aweme> awemeList;
        List<SearchUser> list2;
        List<SearchMixFeed> list3 = (List) aCallableS111S0100000_8.l0;
        ArrayList arrayList = new ArrayList();
        for (SearchMixFeed searchMixFeed : list3) {
            if (searchMixFeed.getAweme() != null) {
                Aweme aweme = searchMixFeed.getAweme();
                o.LJIIIIZZ(aweme, "searchMixFeed.aweme");
                arrayList.add(aweme);
            } else if (searchMixFeed.getFeedType() == 70) {
                SearchSpot searchSpot = searchMixFeed.hotSpot;
                if (searchSpot != null && (list = searchSpot.awemeCards) != null) {
                    arrayList.addAll(list);
                }
            } else if (searchMixFeed.getFeedType() == 65514) {
                DynamicPatch LJI = searchMixFeed.LJI();
                if (LJI != null && (awemeList = LJI.getAwemeList()) != null) {
                    arrayList.addAll(ORZ.LJLL(awemeList));
                }
            } else if (searchMixFeed.getFeedType() == 65458 && (list2 = searchMixFeed.users) != null) {
                Iterator it = ((ArrayList) ORZ.LJLL(list2)).iterator();
                while (it.hasNext()) {
                    List<Aweme> list4 = ((SearchUser) it.next()).awemeCards;
                    if (list4 != null) {
                        arrayList.addAll(ORZ.LJLL(list4));
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Aweme aweme2 = (Aweme) it2.next();
            if (aweme2 != null) {
                HashMap<String, String> mobParams = aweme2.getMobParams();
                if (mobParams != null) {
                    mobParams.remove("click_times");
                }
                HashMap<String, String> mobParams2 = aweme2.getMobParams();
                if (mobParams2 != null) {
                    mobParams2.remove("is_slide");
                }
                HashMap<String, String> mobParams3 = aweme2.getMobParams();
                if (mobParams3 != null) {
                    mobParams3.remove("slide_rank");
                }
                Map<String, String> searchExtraParams = aweme2.getSearchExtraParams();
                if (searchExtraParams != null) {
                    searchExtraParams.remove("inner_last_consumed");
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        ((InterfaceC65784Pro) aCallableS111S0100000_8.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$20(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        ((Boolean) ((IR7) aCallableS111S0100000_8.l0).LIZJ.getValue()).booleanValue();
        return C76800UCe.LIZ;
    }

    public static final Object call$21(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        while (true) {
            C47554IlS c47554IlS = (C47554IlS) aCallableS111S0100000_8.l0;
            if (c47554IlS.LJIIL) {
                C47549IlN data = c47554IlS.LJII.take();
                try {
                    C47554IlS c47554IlS2 = (C47554IlS) aCallableS111S0100000_8.l0;
                    o.LJIIIIZZ(data, "data");
                    c47554IlS2.LIZJ(data);
                } catch (Exception unused) {
                }
            } else {
                return C76800UCe.LIZ;
            }
        }
    }

    public static final Object call$22(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        User author;
        User author2;
        User author3;
        User author4;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = ((C48948JIy) aCallableS111S0100000_8.l0).itemView;
        c50651JuJ.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(view);
        C49006JLe c49006JLe = new C49006JLe();
        String str7 = null;
        if (LIZLLL != null) {
            str = LIZLLL.getSearchId();
        } else {
            str = null;
        }
        c49006JLe.LJIIZILJ("search_id", str);
        if (LIZLLL != null) {
            str2 = LIZLLL.getSearchKeyword();
        } else {
            str2 = null;
        }
        c49006JLe.LJIIZILJ("search_keyword", str2);
        c49006JLe.LJIIZILJ("search_type", "general");
        Aweme aweme = ((C48948JIy) aCallableS111S0100000_8.l0).LJLLLLLL;
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        c49006JLe.LJIJ("search_result_id", str3);
        Aweme aweme2 = ((C48948JIy) aCallableS111S0100000_8.l0).LJLLLLLL;
        if (aweme2 == null || (author4 = aweme2.getAuthor()) == null || (str4 = Long.valueOf(C78934UyQ.LJIILJJIL(author4)).toString()) == null) {
            str4 = "";
        }
        c49006JLe.LJIIZILJ("list_item_id", str4);
        c49006JLe.LJIIZILJ("enter_from_merge", "general_search");
        c49006JLe.LJIIZILJ("enter_method", "live_cover");
        c49006JLe.LJIIZILJ("action_type", "click");
        Aweme aweme3 = ((C48948JIy) aCallableS111S0100000_8.l0).LJLLLLLL;
        if (aweme3 != null && (author3 = aweme3.getAuthor()) != null) {
            str5 = author3.getUid();
        } else {
            str5 = null;
        }
        c49006JLe.LJIIZILJ("anchor_id", str5);
        Aweme aweme4 = ((C48948JIy) aCallableS111S0100000_8.l0).LJLLLLLL;
        if (aweme4 != null && (author2 = aweme4.getAuthor()) != null) {
            str6 = Long.valueOf(C78934UyQ.LJIILJJIL(author2)).toString();
        } else {
            str6 = null;
        }
        c49006JLe.LJIIZILJ("room_id", str6);
        Aweme aweme5 = ((C48948JIy) aCallableS111S0100000_8.l0).LJLLLLLL;
        if (aweme5 != null) {
            str7 = aweme5.getRequestId();
        }
        c49006JLe.LJIIZILJ("request_id", str7);
        Aweme aweme6 = ((C48948JIy) aCallableS111S0100000_8.l0).LJLLLLLL;
        if (aweme6 != null && (author = aweme6.getAuthor()) != null) {
            i = author.getFollowStatus();
        } else {
            i = 0;
        }
        c49006JLe.LJJIII(i);
        c49006JLe.LJIILIIL();
        return C76800UCe.LIZ;
    }

    public static final Object call$23(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        AppLogNewUtils.onEventV3("adver_first_frame", (JSONObject) aCallableS111S0100000_8.l0);
        return null;
    }

    public static final Object call$24(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key_word", ((DynamicSearchFragment) aCallableS111S0100000_8.l0).Kl());
            if (o.LJ(((DynamicSearchFragment) aCallableS111S0100000_8.l0).LJLZ, "search_history")) {
                DynamicSearchFragment dynamicSearchFragment = (DynamicSearchFragment) aCallableS111S0100000_8.l0;
                dynamicSearchFragment.getClass();
                dynamicSearchFragment.LJZI = "search_history";
            } else if (o.LJ(((DynamicSearchFragment) aCallableS111S0100000_8.l0).LJLZ, "search_sug")) {
                DynamicSearchFragment dynamicSearchFragment2 = (DynamicSearchFragment) aCallableS111S0100000_8.l0;
                dynamicSearchFragment2.getClass();
                dynamicSearchFragment2.LJZI = "search_sug";
            } else {
                DynamicSearchFragment dynamicSearchFragment3 = (DynamicSearchFragment) aCallableS111S0100000_8.l0;
                dynamicSearchFragment3.getClass();
                dynamicSearchFragment3.LJZI = "normal_search";
            }
            jSONObject.put("enter_from", ((DynamicSearchFragment) aCallableS111S0100000_8.l0).LJZI);
        } catch (JSONException unused) {
        }
        String Jl = ((DynamicSearchFragment) aCallableS111S0100000_8.l0).Jl();
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("search");
        obtain.setLabelName(Jl);
        obtain.setJsonObject(jSONObject);
        FMX.onEvent(obtain);
        return C76800UCe.LIZ;
    }

    public static final Object call$25(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        FMX.LJIILL("search_start_refresh_data", new OSZ(((DynamicSearchFragment) aCallableS111S0100000_8.l0).Jl(), "search_type"), new OSZ(Integer.valueOf(((DynamicSearchFragment) aCallableS111S0100000_8.l0).LLF), "page_index"), new OSZ(((DynamicSearchFragment) aCallableS111S0100000_8.l0).LJZ, "enter_method"), new OSZ(Boolean.valueOf(C50139Jm3.LIZ), "is_first_search"));
        return C76800UCe.LIZ;
    }

    public static final Object call$26(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        String Jl;
        if (o.LJ(((SearchFragment) aCallableS111S0100000_8.l0).Jl(), "general_search")) {
            Jl = "general";
        } else {
            Jl = ((SearchFragment) aCallableS111S0100000_8.l0).Jl();
        }
        FMX.LJIILL("search_start_refresh_data", new OSZ(Jl, "search_type"), new OSZ(Integer.valueOf(((SearchFragment) aCallableS111S0100000_8.l0).LLF), "page_index"), new OSZ(((SearchFragment) aCallableS111S0100000_8.l0).LJZ, "enter_method"), new OSZ(Boolean.valueOf(C50139Jm3.LIZ), "is_first_search"));
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        FMX.LJIIL("enter_homepage_message", (Map) aCallableS111S0100000_8.l0);
        return null;
    }

    public static final Object call$4(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        PEH.LIZJ((Throwable) aCallableS111S0100000_8.l0);
        return null;
    }

    public static final Object call$5(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        FR7.LIZJ("use_last_predict_label", ((SmartFeedAdUIServiceImpl) aCallableS111S0100000_8.l0).LIZLLL);
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        PEH.LIZJ((Throwable) aCallableS111S0100000_8.l0);
        return null;
    }

    public static final Object call$7(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        ((InterfaceC65784Pro) aCallableS111S0100000_8.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$8(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        try {
            ((AbstractC029409q) aCallableS111S0100000_8.l0).notifyDataSetChanged();
            return null;
        } catch (Exception e) {
            C36922EeM.LIZIZ(e, ((AbstractC029409q) aCallableS111S0100000_8.l0).getClass().getName());
            return null;
        }
    }

    public static final Object call$9(ACallableS111S0100000_8 aCallableS111S0100000_8) {
        try {
            ((AbstractC029409q) aCallableS111S0100000_8.l0).notifyDataSetChanged();
            return null;
        } catch (Exception e) {
            C170666ms.LIZ(e, ((AbstractC029409q) aCallableS111S0100000_8.l0).getClass().getName());
            return null;
        }
    }

    public ACallableS111S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public ACallableS111S0100000_8(C46539IOh c46539IOh, String str, int i) {
        this.$t = i;
        this.l0 = c46539IOh;
    }
}
