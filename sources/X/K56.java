package X;

import com.ss.android.ugc.aweme.MiddleForSearchFromEC;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K56 {
    public static String LIZ = "";

    public static String LIZ(ActivityC45651qj activityC45651qj) {
        if (LIZLLL(activityC45651qj)) {
            return MiddleForSearchFromEC.LJIILIIL().LIZ();
        }
        return LIZ;
    }

    public static boolean LIZLLL(ActivityC45651qj activityC45651qj) {
        if (KB1.LJII(KB1.LIZ(JTO.LIZIZ(activityC45651qj)))) {
            C51141K5h.LIZ.getClass();
            if (C51141K5h.LIZIZ()) {
                return true;
            }
        }
        return false;
    }

    public static final void LJIIIIZZ(int i) {
        LIZ = "";
        C2U8.LIZ(new C61282aq(i));
    }

    public static String LIZIZ(SearchSugEntity searchSugEntity, String str, boolean z, boolean z2) {
        SugExtraInfo sugExtraInfo;
        if (str == null || !z) {
            return "";
        }
        if ((!o.LJ("shop", str) && !z2) || searchSugEntity == null || (sugExtraInfo = searchSugEntity.sugExtraInfo) == null) {
            return "";
        }
        String sugShopId = sugExtraInfo.getSugShopId();
        if (sugShopId != null) {
            return sugShopId;
        }
        String userId = sugExtraInfo.getUserId();
        if (userId == null) {
            return "";
        }
        return userId;
    }

    public static final String LIZJ(SearchSugEntity searchSugEntity, String str, boolean z, boolean z2) {
        SugExtraInfo sugExtraInfo;
        if (str == null || !z) {
            return "";
        }
        if ((!o.LJ("shop", str) && !z2) || searchSugEntity == null || (sugExtraInfo = searchSugEntity.sugExtraInfo) == null) {
            return "";
        }
        if (C78841Uwv.LJIL(searchSugEntity)) {
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

    public static final void LJ(int i, SearchSugEntity searchSugEntity, String str, int i2) {
        String str2;
        if (searchSugEntity == null) {
            return;
        }
        K58 k58 = new K58();
        if (!C78685UuP.LJJJZ(str)) {
            str = "";
        }
        k58.LJIIZILJ("enter_from", str);
        k58.LJIIZILJ("tab_name", C50605JtZ.LJFF(i2));
        Word word = searchSugEntity.mWord;
        String str3 = null;
        if (word != null) {
            str2 = word.getId();
        } else {
            str2 = null;
        }
        k58.LJIIZILJ("group_id", str2);
        Word word2 = searchSugEntity.mWord;
        if (word2 != null) {
            str3 = word2.getWord();
        }
        k58.LJIIZILJ("words_content", str3);
        k58.LJIIZILJ("words_source", "sug");
        k58.LJJIIJZLJL(Integer.valueOf(i));
        k58.LJIIZILJ("words_content", searchSugEntity.content);
        k58.LJIIZILJ("sug_type", "enrich_sug");
        java.util.Map map = searchSugEntity.LIZLLL;
        if (map == null) {
            map = C113554cx.LJJJLIIL();
        }
        k58.LIZ(map);
        k58.LJIILIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final void LJFF(String str, int i, SearchSugEntity searchSugEntity, String str2, String str3, int i2, boolean z, ActivityC45651qj activityC45651qj) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z2;
        String str12;
        SugExtraInfo sugExtraInfo;
        boolean z3;
        java.util.Map<String, String> map;
        if (searchSugEntity == null) {
            return;
        }
        if (!C78841Uwv.LJIL(searchSugEntity) && (map = searchSugEntity.LIZLLL) != null) {
            map.remove("sug_user_id");
        }
        String LIZ2 = LIZ(activityC45651qj);
        if (LIZLLL(activityC45651qj)) {
            LIZ2 = MiddleForSearchFromEC.LJIILIIL().LIZ();
        }
        C68322mC c68322mC = new C68322mC();
        C50646JuE c50646JuE = new C50646JuE();
        if (C78685UuP.LJJJZ(str3)) {
            str4 = str3;
        } else {
            str4 = str;
        }
        c50646JuE.LJIIZILJ("search_entrance", str4);
        String str13 = "";
        if (!C78685UuP.LJJJZ(str3)) {
            str3 = "";
        }
        c50646JuE.LJIIZILJ("enter_from", str3);
        c50646JuE.LJIIZILJ("tab_name", C50605JtZ.LJFF(i2));
        SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo2 == null || (str5 = sugExtraInfo2.isHistorySug()) == null) {
            str5 = "";
        }
        c50646JuE.LJIJ("is_history_sug", str5);
        SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo3 == null || (str6 = sugExtraInfo3.isPersonalized()) == null) {
            str6 = "";
        }
        c50646JuE.LJIJ("is_personalized", str6);
        SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo4 == null || (str7 = sugExtraInfo4.getQueryLang()) == null) {
            str7 = "";
        }
        c50646JuE.LJIJ("query_lang", str7);
        SugExtraInfo sugExtraInfo5 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo5 == null || (str8 = sugExtraInfo5.getRecallReason()) == null) {
            str8 = "";
        }
        c50646JuE.LJIJ("recall_reason", str8);
        SugExtraInfo sugExtraInfo6 = searchSugEntity.sugExtraInfo;
        String str14 = null;
        if (sugExtraInfo6 != null) {
            str9 = sugExtraInfo6.getUserRelationType();
        } else {
            str9 = null;
        }
        c50646JuE.LJIIZILJ("user_tag", str9);
        SearchResultActivity LJ = C50989Jzl.LJ();
        if (LJ != null) {
            c50646JuE.LJJIIJ(JTO.LIZ(LJ).hv0().obtainLogData("tab_name"));
        }
        C50652JuK.Companion.getClass();
        C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(LJ);
        boolean z4 = false;
        ?? r9 = str;
        if (LJIIJJI != null) {
            String searchPosition = LJIIJJI.getSearchPosition();
            r9 = str;
            if (searchPosition != null) {
                if (searchPosition.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r9 = str;
                if (Boolean.valueOf(z3).booleanValue()) {
                    r9 = searchPosition;
                }
            }
        }
        c68322mC.element = r9;
        c50646JuE.LJIIZILJ("search_position", r9);
        if (DYB.LIZ() && (sugExtraInfo = searchSugEntity.sugExtraInfo) != null && sugExtraInfo.isLiveQuery()) {
            c50646JuE.LJJIIZ("live");
        }
        Word word = searchSugEntity.mWord;
        if (word != null) {
            str10 = word.getId();
        } else {
            str10 = null;
        }
        c50646JuE.LJIIZILJ("group_id", str10);
        Word word2 = searchSugEntity.mWord;
        if (word2 != null) {
            str14 = word2.getWord();
        }
        c50646JuE.LJIIZILJ("words_content", str14);
        c50646JuE.LJIIZILJ("words_source", searchSugEntity.mWord.getWordSource());
        c50646JuE.LJIIZILJ("words_content", searchSugEntity.content);
        c50646JuE.LJJIIJZLJL(Integer.valueOf(i));
        c50646JuE.LJIIZILJ("sug_type", str2);
        SugExtraInfo sugExtraInfo7 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo7 == null) {
            str11 = "";
        } else {
            str11 = sugExtraInfo7.getSugHint();
        }
        c50646JuE.LJIIZILJ("tag_text", String.valueOf(str11));
        c50646JuE.LJIIZILJ("new_sug_session_id", LIZ2);
        java.util.Map map2 = searchSugEntity.LIZLLL;
        if (map2 == null) {
            map2 = C113554cx.LJJJLIIL();
        }
        c50646JuE.LIZ(map2);
        String str15 = (String) c68322mC.element;
        if (i2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        c50646JuE.LJIIZILJ("word_state", LIZJ(searchSugEntity, str15, z, z2));
        String str16 = (String) c68322mC.element;
        if (i2 == -1) {
            z4 = true;
        }
        c50646JuE.LJIIZILJ("user_id", LIZIZ(searchSugEntity, str16, z, z4));
        c50646JuE.LJIILIIL();
        C50699Jv5 c50699Jv5 = new C50699Jv5();
        java.util.Map<String, String> map3 = searchSugEntity.LIZLLL;
        if (map3 != null && (str12 = map3.get("impr_id")) != null) {
            str13 = str12;
        }
        c50699Jv5.LJII(str13);
    }

    public static final void LJI(String str, int i, SearchSugEntity searchSugEntity, String str2, String str3, int i2, boolean z, ActivityC45651qj activityC45651qj) {
        if (C34059DYh.LJLILLLLZI.LJJII()) {
            C38995FSd.LIZJ().execute(new K57(str, i, searchSugEntity, str2, str3, i2, z, activityC45651qj));
        } else {
            LJII(str, i, searchSugEntity, str2, str3, i2, z, activityC45651qj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final void LJII(String str, int i, SearchSugEntity searchSugEntity, String str2, String str3, int i2, boolean z, ActivityC45651qj activityC45651qj) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z2;
        SugExtraInfo sugExtraInfo;
        boolean z3;
        String str11;
        String str12;
        if (searchSugEntity != null) {
            java.util.Map<String, String> map = searchSugEntity.LIZLLL;
            String str13 = null;
            if (map != null && C78841Uwv.LJIL(searchSugEntity)) {
                SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
                if (sugExtraInfo2 != null) {
                    str11 = sugExtraInfo2.getUserId();
                } else {
                    str11 = null;
                }
                if (C78857UxB.LJJJIL(str11)) {
                    SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
                    if (sugExtraInfo3 != null) {
                        str12 = sugExtraInfo3.getUserId();
                    } else {
                        str12 = null;
                    }
                    map.put("sug_user_id", str12);
                }
            }
            String LIZ2 = LIZ(activityC45651qj);
            if (LIZLLL(activityC45651qj)) {
                LIZ2 = MiddleForSearchFromEC.LJIILIIL().LIZ();
            }
            C68322mC c68322mC = new C68322mC();
            C50648JuG c50648JuG = new C50648JuG();
            if (C78685UuP.LJJJZ(str3)) {
                str4 = str3;
            } else {
                str4 = str;
            }
            c50648JuG.LJIIZILJ("search_entrance", str4);
            String str14 = "";
            if (!C78685UuP.LJJJZ(str3)) {
                str3 = "";
            }
            c50648JuG.LJIIZILJ("enter_from", str3);
            c50648JuG.LJIIZILJ("tab_name", C50605JtZ.LJFF(i2));
            SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo4 == null || (str5 = sugExtraInfo4.isHistorySug()) == null) {
                str5 = "";
            }
            c50648JuG.LJIJ("is_history_sug", str5);
            SugExtraInfo sugExtraInfo5 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo5 == null || (str6 = sugExtraInfo5.isPersonalized()) == null) {
                str6 = "";
            }
            c50648JuG.LJIJ("is_personalized", str6);
            SugExtraInfo sugExtraInfo6 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo6 == null || (str7 = sugExtraInfo6.getQueryLang()) == null) {
                str7 = "";
            }
            c50648JuG.LJIJ("query_lang", str7);
            SugExtraInfo sugExtraInfo7 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo7 == null || (str8 = sugExtraInfo7.getRecallReason()) == null) {
                str8 = "";
            }
            c50648JuG.LJIJ("recall_reason", str8);
            SugExtraInfo sugExtraInfo8 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo8 != null) {
                str9 = sugExtraInfo8.getUserRelationType();
            } else {
                str9 = null;
            }
            c50648JuG.LJIIZILJ("user_tag", str9);
            SearchResultActivity LJ = C50989Jzl.LJ();
            if (LJ != null) {
                c50648JuG.LJJIIJ(JTO.LIZ(LJ).hv0().obtainLogData("tab_name"));
            }
            C50652JuK.Companion.getClass();
            C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(LJ);
            boolean z4 = false;
            ?? r9 = str;
            if (LJIIJJI != null) {
                String searchPosition = LJIIJJI.getSearchPosition();
                r9 = str;
                if (searchPosition != null) {
                    if (searchPosition.length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    r9 = str;
                    if (Boolean.valueOf(z3).booleanValue()) {
                        r9 = searchPosition;
                    }
                }
            }
            c68322mC.element = r9;
            c50648JuG.LJIIZILJ("search_position", r9);
            if (DYB.LIZ() && (sugExtraInfo = searchSugEntity.sugExtraInfo) != null && sugExtraInfo.isLiveQuery()) {
                c50648JuG.LJJIIZ("live");
            }
            Word word = searchSugEntity.mWord;
            if (word != null) {
                str10 = word.getId();
            } else {
                str10 = null;
            }
            c50648JuG.LJIIZILJ("group_id", str10);
            Word word2 = searchSugEntity.mWord;
            if (word2 != null) {
                str13 = word2.getWord();
            }
            c50648JuG.LJIIZILJ("words_content", str13);
            c50648JuG.LJIIZILJ("words_source", searchSugEntity.mWord.getWordSource());
            c50648JuG.LJIIZILJ("words_content", searchSugEntity.content);
            c50648JuG.LJJIIJZLJL(Integer.valueOf(i));
            c50648JuG.LJIIZILJ("sug_type", str2);
            java.util.Map map2 = searchSugEntity.LIZLLL;
            if (map2 == null) {
                map2 = C113554cx.LJJJLIIL();
            }
            c50648JuG.LIZ(map2);
            c50648JuG.LJIIZILJ("new_sug_session_id", LIZ2);
            SugExtraInfo sugExtraInfo9 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo9 != null) {
                str14 = sugExtraInfo9.getSugHint();
            }
            c50648JuG.LJIIZILJ("tag_text", String.valueOf(str14));
            String str15 = (String) c68322mC.element;
            if (i2 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c50648JuG.LJIIZILJ("word_state", LIZJ(searchSugEntity, str15, z, z2));
            String str16 = (String) c68322mC.element;
            if (i2 == -1) {
                z4 = true;
            }
            c50648JuG.LJIIZILJ("user_id", LIZIZ(searchSugEntity, str16, z, z4));
            c50648JuG.LJIILIIL();
        }
    }
}
