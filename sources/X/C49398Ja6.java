package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* renamed from: X.Ja6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49398Ja6 implements MGH {
    public final /* synthetic */ C49402JaA LIZ;

    public C49398Ja6(C49402JaA c49402JaA) {
        this.LIZ = c49402JaA;
    }

    @Override // X.MGH
    public final void LIZ(Integer num, String str, String str2) {
        String str3;
        String str4;
        Integer num2;
        String str5;
        String searchResultId;
        String str6;
        String str7;
        String str8;
        String str9;
        C50469JrN searchVideoModel;
        String str10 = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C49402JaA c49402JaA = this.LIZ;
        JQA jqa = c49402JaA.LIZLLL;
        String str11 = "1";
        if (jqa != null) {
            String str12 = jqa.LJIIIIZZ;
            String str13 = jqa.LJII;
            String str14 = jqa.LJ;
            String str15 = jqa.LJFF;
            int i = jqa.LJIIL;
            JNB jnb = new JNB(jqa);
            jnb.LJIIZILJ("impr_id", str12);
            jnb.LJIIZILJ("search_id", str13);
            C49397Ja5 c49397Ja5 = c49402JaA.LJ;
            if (c49397Ja5 != null) {
                str6 = c49397Ja5.getSearchResultId();
            } else {
                str6 = null;
            }
            jnb.LJIJ("search_result_id", str6);
            jnb.LJIIZILJ("search_keyword", str14);
            jnb.LJJI(Integer.valueOf(i));
            jnb.LJIJI(str15);
            C49397Ja5 c49397Ja52 = c49402JaA.LJ;
            if (c49397Ja52 != null && c49397Ja52.isAladdin()) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            jnb.LJJIIJZLJL(str7);
            C49397Ja5 c49397Ja53 = c49402JaA.LJ;
            if (c49397Ja53 != null) {
                str8 = c49397Ja53.getTokenType();
            } else {
                str8 = null;
            }
            jnb.LJIIZILJ("token_type", str8);
            jnb.LJIIZILJ("list_result_type", "playlist");
            jnb.LJIIZILJ("list_item_id", str10);
            jnb.LIZLLL("aladdin_words", str2);
            jnb.LJJIII(num);
            jnb.LJIIZILJ("aladdin_button_type", "click_playlist");
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            View view = c49402JaA.LJI;
            c50651JuJ.getClass();
            C50650JuI LJI = C50651JuJ.LJI(view);
            if (LJI != null && (searchVideoModel = LJI.getSearchVideoModel()) != null) {
                str9 = searchVideoModel.getGroupId();
            } else {
                str9 = null;
            }
            jnb.LJIIZILJ("last_from_group_id", str9);
            jnb.LJIILIIL();
        }
        JQA jqa2 = this.LIZ.LIZLLL;
        if (jqa2 != null) {
            str3 = jqa2.LJII;
        } else {
            str3 = null;
        }
        linkedHashMap.put("search_id", String.valueOf(str3));
        C49397Ja5 c49397Ja54 = this.LIZ.LJ;
        String str16 = "";
        if (c49397Ja54 == null || (str4 = c49397Ja54.getTokenType()) == null) {
            str4 = "";
        }
        linkedHashMap.put("token_type", str4);
        C49397Ja5 c49397Ja55 = this.LIZ.LJ;
        if (c49397Ja55 != null) {
            num2 = Integer.valueOf(c49397Ja55.getRank());
        } else {
            num2 = null;
        }
        linkedHashMap.put("rank", String.valueOf(num2));
        C49397Ja5 c49397Ja56 = this.LIZ.LJ;
        if (c49397Ja56 == null || !c49397Ja56.isAladdin()) {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_aladdin", str11);
        JQA jqa3 = this.LIZ.LIZLLL;
        if (jqa3 == null || (str5 = jqa3.LJJIIZI) == null) {
            str5 = "";
        }
        linkedHashMap.put("list_result_type", str5);
        linkedHashMap.put("is_from_video", CardStruct.IStatusCode.DEFAULT);
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("list_item_id", str10);
        C49397Ja5 c49397Ja57 = this.LIZ.LJ;
        if (c49397Ja57 != null && (searchResultId = c49397Ja57.getSearchResultId()) != null) {
            str16 = searchResultId;
        }
        linkedHashMap.put("search_result_id", str16);
        C50653JuL.LJLILLLLZI.getClass();
        C50654JuM.LIZJ(linkedHashMap, false);
    }
}
