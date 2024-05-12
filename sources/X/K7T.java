package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K7T {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(SearchSugEntity searchSugEntity) {
        SugExtraInfo sugExtraInfo;
        if (searchSugEntity != null && (sugExtraInfo = searchSugEntity.sugExtraInfo) != null) {
            if (C78840Uwu.LJJIFFI(searchSugEntity)) {
                String sugShopId = sugExtraInfo.getSugShopId();
                if (sugShopId != null && C78685UuP.LJJJZ(sugShopId)) {
                    if (sugExtraInfo.isCreatorLive()) {
                        return "shop_living";
                    }
                    return "shop_regular";
                }
                if (sugExtraInfo.isCreatorLive()) {
                    return "author_living";
                }
                return "author_regular";
            }
            return "regular";
        }
        return "";
    }

    public static final void LIZJ(int i, SearchSugEntity searchSugEntity, String str, int i2) {
        String str2;
        if (searchSugEntity == null) {
            return;
        }
        K8F k8f = new K8F();
        if (!C78685UuP.LJJJZ(str)) {
            str = "";
        }
        k8f.LJIILL("enter_from", str);
        k8f.LJIILL("tab_name", C51214K8c.LJ(i2));
        Word word = searchSugEntity.mWord;
        String str3 = null;
        if (word != null) {
            str2 = word.getId();
        } else {
            str2 = null;
        }
        k8f.LJIILL("group_id", str2);
        Word word2 = searchSugEntity.mWord;
        if (word2 != null) {
            str3 = word2.getWord();
        }
        k8f.LJIILL("words_content", str3);
        k8f.LJIILL("words_source", "sug");
        k8f.LJIIZILJ(Integer.valueOf(i));
        k8f.LJIILL("words_content", searchSugEntity.content);
        k8f.LJIILL("sug_type", "enrich_sug");
        k8f.LIZ(searchSugEntity.LIZLLL);
        k8f.LJIILIIL();
    }

    public static void LIZIZ(String str, SearchSugEntity searchSugEntity, String requestId, Integer num, String str2, String str3) {
        String str4;
        String str5;
        o.LJIIIZ(requestId, "requestId");
        if (o.LJ(str3, "click")) {
            String LIZIZ = C3A5.LIZ.LIZIZ(requestId);
            if (C78840Uwu.LJJIFFI(searchSugEntity)) {
                str4 = "enrich_sug";
            } else {
                str4 = "normal_sug";
            }
            C51203K7r c51203K7r = new C51203K7r();
            c51203K7r.LJIILL("action_type", "click");
            c51203K7r.LJIILL("order", String.valueOf(num));
            c51203K7r.LJIILL("sug_keyword", str);
            c51203K7r.LJIILL("log_pb", LIZIZ);
            c51203K7r.LJIILL("search_type", str2);
            if (searchSugEntity != null) {
                str5 = searchSugEntity.content;
            } else {
                str5 = null;
            }
            c51203K7r.LJIILL("search_keyword", str5);
            c51203K7r.LJIILL("sug_type", str4);
            c51203K7r.LJIILIIL();
            return;
        }
        if (!o.LJ(str3, "show")) {
            return;
        }
        String LIZIZ2 = C3A5.LIZ.LIZIZ(requestId);
        C51203K7r c51203K7r2 = new C51203K7r();
        c51203K7r2.LJIILL("action_type", "show");
        c51203K7r2.LJIILL("sug_keyword", str);
        c51203K7r2.LJIILL("log_pb", LIZIZ2);
        c51203K7r2.LJIILL("search_type", str2);
        c51203K7r2.LJIILIIL();
    }

    public static final void LIZLLL(String str, int i, SearchSugEntity searchSugEntity, String str2, String str3, int i2, C50948Jz6 c50948Jz6) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Object obj;
        Object obj2;
        String str9;
        String searchPosition;
        boolean z;
        String str10;
        String str11;
        java.util.Map map;
        java.util.Map map2;
        java.util.Map<String, String> map3;
        if (searchSugEntity == null) {
            return;
        }
        if (!C78840Uwu.LJJIFFI(searchSugEntity) && (map3 = searchSugEntity.LIZLLL) != null) {
            map3.remove("sug_user_id");
        }
        new C68322mC();
        K8B k8b = new K8B();
        String str12 = null;
        if (c50948Jz6 != null && c50948Jz6.obtainEcLogData("search_entrance") != null) {
            str4 = String.valueOf(c50948Jz6.obtainEcLogData("search_entrance"));
        } else if (C78685UuP.LJJJZ(str3)) {
            str4 = str3;
        } else {
            str4 = str;
        }
        k8b.LJIILL("search_entrance", str4);
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        String str13 = "";
        if (sugExtraInfo == null || (str5 = sugExtraInfo.isHistorySug()) == null) {
            str5 = "";
        }
        k8b.LJIILJJIL.put("is_history_sug", str5);
        SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo2 == null || (str6 = sugExtraInfo2.isPersonalized()) == null) {
            str6 = "";
        }
        k8b.LJIILJJIL.put("is_personalized", str6);
        SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo3 == null || (str7 = sugExtraInfo3.getQueryLang()) == null) {
            str7 = "";
        }
        k8b.LJIILJJIL.put("query_lang", str7);
        SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo4 == null || (str8 = sugExtraInfo4.getRecallReason()) == null) {
            str8 = "";
        }
        k8b.LJIILJJIL.put("recall_reason", str8);
        if (c50948Jz6 != null && c50948Jz6.obtainEcLogData("enter_from") != null) {
            str3 = String.valueOf(c50948Jz6.obtainEcLogData("enter_from"));
        } else if (!C78685UuP.LJJJZ(str3)) {
            str3 = "";
        }
        k8b.LJIILL("enter_from", str3);
        if (C62814Ol0.LJIJJ(c50948Jz6)) {
            k8b.LJIILL("EVENT_ORIGIN_FEATURE", "TEMAI");
        }
        if (c50948Jz6 != null) {
            obj = c50948Jz6.obtainEcLogData("ec_middle_extra_log_params");
        } else {
            obj = null;
        }
        if (C65777Prh.LJII(obj) && (map2 = (java.util.Map) obj) != null) {
            for (Map.Entry entry : map2.entrySet()) {
                k8b.LJIILL((String) entry.getKey(), (String) entry.getValue());
            }
        }
        k8b.LJIILL("tab_name", C51214K8c.LJ(i2));
        if (c50948Jz6 != null) {
            obj2 = c50948Jz6.obtainEcLogData("ec_middle_extra_log_params");
        } else {
            obj2 = null;
        }
        if (C65777Prh.LJII(obj2) && (map = (java.util.Map) obj2) != null) {
            for (Map.Entry entry2 : map.entrySet()) {
                k8b.LJIILL((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        SugExtraInfo sugExtraInfo5 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo5 != null) {
            str9 = sugExtraInfo5.getUserRelationType();
        } else {
            str9 = null;
        }
        k8b.LJIILL("user_tag", str9);
        EcSearchResultActivity LIZIZ = C50988Jzk.LIZIZ();
        if (LIZIZ != null) {
            k8b.LJIIZILJ(JTO.LIZ(LIZIZ).hv0().obtainLogData("tab_name"));
        }
        if (c50948Jz6 != null && c50948Jz6.getLastSearchPosition() != null) {
            str = c50948Jz6.getLastSearchPosition();
        } else {
            C50652JuK.Companion.getClass();
            C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(LIZIZ);
            if (LJIIJJI != null && (searchPosition = LJIIJJI.getSearchPosition()) != null) {
                if (searchPosition.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (Boolean.valueOf(z).booleanValue()) {
                    str = searchPosition;
                }
            }
        }
        k8b.LJIILL("search_position", str);
        Word word = searchSugEntity.mWord;
        if (word != null) {
            str10 = word.getId();
        } else {
            str10 = null;
        }
        k8b.LJIILL("group_id", str10);
        Word word2 = searchSugEntity.mWord;
        if (word2 != null) {
            str12 = word2.getWord();
        }
        k8b.LJIILL("words_content", str12);
        k8b.LJIILL("words_source", "sug");
        k8b.LJIILL("words_content", searchSugEntity.content);
        k8b.LJIILL("words_position", String.valueOf(Integer.valueOf(i)));
        k8b.LJIILL("sug_type", str2);
        SugExtraInfo sugExtraInfo6 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo6 == null) {
            str11 = "";
        } else {
            str11 = sugExtraInfo6.getSugHint();
        }
        k8b.LJIILL("tag_text", String.valueOf(str11));
        k8b.LJIILL("new_sug_session_id", C51307KBr.LIZ);
        k8b.LIZ(searchSugEntity.LIZLLL);
        k8b.LJIILL("word_state", LIZ(searchSugEntity));
        SugExtraInfo sugExtraInfo7 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo7 != null) {
            String sugShopId = sugExtraInfo7.getSugShopId();
            if (sugShopId != null) {
                str13 = sugShopId;
            } else {
                String userId = sugExtraInfo7.getUserId();
                if (userId != null) {
                    str13 = userId;
                }
            }
        }
        k8b.LJIILL("user_id", str13);
        k8b.LJIILIIL();
    }

    public static final void LJ(String str, int i, SearchSugEntity searchSugEntity, String str2, String str3, int i2, C50948Jz6 c50948Jz6) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Object obj;
        String str9;
        String searchPosition;
        boolean z;
        String str10;
        String str11;
        java.util.Map map;
        String str12;
        String str13;
        if (searchSugEntity != null) {
            java.util.Map<String, String> map2 = searchSugEntity.LIZLLL;
            String str14 = null;
            if (map2 != null && C78840Uwu.LJJIFFI(searchSugEntity)) {
                SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
                if (sugExtraInfo != null) {
                    str12 = sugExtraInfo.getUserId();
                } else {
                    str12 = null;
                }
                if (C78857UxB.LJJJIL(str12)) {
                    SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
                    if (sugExtraInfo2 != null) {
                        str13 = sugExtraInfo2.getUserId();
                    } else {
                        str13 = null;
                    }
                    map2.put("sug_user_id", str13);
                }
            }
            new C68322mC();
            K89 k89 = new K89();
            if (c50948Jz6 != null && c50948Jz6.obtainEcLogData("search_entrance") != null) {
                str4 = String.valueOf(c50948Jz6.obtainEcLogData("search_entrance"));
            } else if (C78685UuP.LJJJZ(str3)) {
                str4 = str3;
            } else {
                str4 = str;
            }
            k89.LJIILL("search_entrance", str4);
            SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
            String str15 = "";
            if (sugExtraInfo3 == null || (str5 = sugExtraInfo3.isHistorySug()) == null) {
                str5 = "";
            }
            k89.LJIILJJIL.put("is_history_sug", str5);
            SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo4 == null || (str6 = sugExtraInfo4.isPersonalized()) == null) {
                str6 = "";
            }
            k89.LJIILJJIL.put("is_personalized", str6);
            SugExtraInfo sugExtraInfo5 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo5 == null || (str7 = sugExtraInfo5.getQueryLang()) == null) {
                str7 = "";
            }
            k89.LJIILJJIL.put("query_lang", str7);
            SugExtraInfo sugExtraInfo6 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo6 == null || (str8 = sugExtraInfo6.getRecallReason()) == null) {
                str8 = "";
            }
            k89.LJIILJJIL.put("recall_reason", str8);
            if (c50948Jz6 != null && c50948Jz6.obtainEcLogData("enter_from") != null) {
                str3 = String.valueOf(c50948Jz6.obtainEcLogData("enter_from"));
            } else if (!C78685UuP.LJJJZ(str3)) {
                str3 = "";
            }
            k89.LJIILL("enter_from", str3);
            if (C62814Ol0.LJIJJ(c50948Jz6)) {
                k89.LJIILL("EVENT_ORIGIN_FEATURE", "TEMAI");
            }
            if (c50948Jz6 != null) {
                obj = c50948Jz6.obtainEcLogData("ec_middle_extra_log_params");
            } else {
                obj = null;
            }
            if (C65777Prh.LJII(obj) && (map = (java.util.Map) obj) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    k89.LJIILL((String) entry.getKey(), (String) entry.getValue());
                }
            }
            k89.LJIILL("tab_name", C51214K8c.LJ(i2));
            SugExtraInfo sugExtraInfo7 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo7 != null) {
                str9 = sugExtraInfo7.getUserRelationType();
            } else {
                str9 = null;
            }
            k89.LJIILL("user_tag", str9);
            EcSearchResultActivity LIZIZ = C50988Jzk.LIZIZ();
            if (LIZIZ != null) {
                k89.LJIIZILJ(JTO.LIZ(LIZIZ).hv0().obtainLogData("tab_name"));
            }
            if (c50948Jz6 != null && c50948Jz6.getLastSearchPosition() != null) {
                str = c50948Jz6.getLastSearchPosition();
            } else {
                C50652JuK.Companion.getClass();
                C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(LIZIZ);
                if (LJIIJJI != null && (searchPosition = LJIIJJI.getSearchPosition()) != null) {
                    if (searchPosition.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Boolean.valueOf(z).booleanValue()) {
                        str = searchPosition;
                    }
                }
            }
            k89.LJIILL("search_position", str);
            Word word = searchSugEntity.mWord;
            if (word != null) {
                str10 = word.getId();
            } else {
                str10 = null;
            }
            k89.LJIILL("group_id", str10);
            Word word2 = searchSugEntity.mWord;
            if (word2 != null) {
                str14 = word2.getWord();
            }
            k89.LJIILL("words_content", str14);
            k89.LJIILL("words_source", "sug");
            k89.LJIILL("words_content", searchSugEntity.content);
            k89.LJIILL("words_position", String.valueOf(Integer.valueOf(i)));
            k89.LJIILL("sug_type", str2);
            k89.LIZ(searchSugEntity.LIZLLL);
            k89.LJIILL("new_sug_session_id", C51307KBr.LIZ);
            SugExtraInfo sugExtraInfo8 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo8 == null) {
                str11 = "";
            } else {
                str11 = sugExtraInfo8.getSugHint();
            }
            k89.LJIILL("tag_text", String.valueOf(str11));
            k89.LJIILL("word_state", LIZ(searchSugEntity));
            SugExtraInfo sugExtraInfo9 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo9 != null) {
                String sugShopId = sugExtraInfo9.getSugShopId();
                if (sugShopId != null) {
                    str15 = sugShopId;
                } else {
                    String userId = sugExtraInfo9.getUserId();
                    if (userId != null) {
                        str15 = userId;
                    }
                }
            }
            k89.LJIILL("user_id", str15);
            if (c50948Jz6 != null) {
                k89.LJIILL("root_enter_from_type", String.valueOf(c50948Jz6.getEcSearchEntranceValue()));
            }
            k89.LJIILIIL();
        }
    }
}
