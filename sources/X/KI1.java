package X;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugCell;

/* loaded from: classes9.dex */
public final class KI1 extends KL6 {
    public final /* synthetic */ SearchMusicSugCell LJLILLLLZI;
    public final /* synthetic */ KI9 LJLJI;

    @Override // X.KL6
    public final void LIZLLL(View view) {
        SearchSugEntity searchSugEntity;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String recallReason;
        String str6;
        if (C6ZT.LIZ(view) || (searchSugEntity = this.LJLILLLLZI.LJLIL) == null || TextUtils.isEmpty(searchSugEntity.content)) {
            return;
        }
        int layoutPosition = this.LJLILLLLZI.getLayoutPosition();
        SearchSugEntity searchSugEntity2 = this.LJLILLLLZI.LJLIL;
        if (searchSugEntity2 != null) {
            KI4 ki4 = new KI4();
            ki4.LIZJ("words_source", "sug");
            ki4.LIZJ("search_position", "video_music");
            ki4.LIZ(layoutPosition, "words_position");
            ki4.LIZJ("words_content", searchSugEntity2.content);
            Word word = searchSugEntity2.mWord;
            String str7 = "";
            if (word == null || (str = word.getId()) == null) {
                str = "";
            }
            ki4.LIZJ("group_id", str);
            ki4.LIZJ("creation_id", XVF.LJ);
            ki4.LIZIZ(searchSugEntity2.LIZLLL);
            ki4.LIZJ("new_sug_session_id", KIO.LIZ);
            if (C78841Uwv.LJIL(searchSugEntity2)) {
                str2 = "enrich_sug";
            } else {
                str2 = "normal_sug";
            }
            ki4.LIZJ("sug_type", str2);
            SugExtraInfo sugExtraInfo = searchSugEntity2.sugExtraInfo;
            if (sugExtraInfo == null || (str3 = sugExtraInfo.isHistorySug()) == null) {
                str3 = "";
            }
            ki4.LIZJ("is_history_sug", str3);
            SugExtraInfo sugExtraInfo2 = searchSugEntity2.sugExtraInfo;
            if (sugExtraInfo2 == null || (str4 = sugExtraInfo2.isPersonalized()) == null) {
                str4 = "";
            }
            ki4.LIZJ("is_personalized", str4);
            SugExtraInfo sugExtraInfo3 = searchSugEntity2.sugExtraInfo;
            if (sugExtraInfo3 == null || (str5 = sugExtraInfo3.getQueryLang()) == null) {
                str5 = "";
            }
            ki4.LIZJ("query_lang", str5);
            SugExtraInfo sugExtraInfo4 = searchSugEntity2.sugExtraInfo;
            if (sugExtraInfo4 != null && (recallReason = sugExtraInfo4.getRecallReason()) != null) {
                str7 = recallReason;
            }
            ki4.LIZJ("recall_reason", str7);
            FMX.LJIIL("trending_words_click", ki4.LIZ);
        }
        C51468KHw c51468KHw = new C51468KHw();
        c51468KHw.LIZJ = false;
        this.LJLILLLLZI.getLayoutPosition();
        SearchSugEntity searchSugEntity3 = this.LJLILLLLZI.LJLIL;
        String str8 = null;
        if (searchSugEntity3 != null) {
            str6 = searchSugEntity3.content;
        } else {
            str6 = null;
        }
        c51468KHw.LIZIZ = str6;
        c51468KHw.LIZ = "search_sug";
        C2U8.LIZIZ(new K2I(c51468KHw));
        KIQ kiq = this.LJLJI.LJLILLLLZI;
        int layoutPosition2 = this.LJLILLLLZI.getLayoutPosition();
        SearchSugEntity searchSugEntity4 = this.LJLILLLLZI.LJLIL;
        if (searchSugEntity4 != null) {
            str8 = searchSugEntity4.content;
        }
        kiq.e2(layoutPosition2, str8);
    }

    public KI1(SearchMusicSugCell searchMusicSugCell, KI9 ki9) {
        this.LJLILLLLZI = searchMusicSugCell;
        this.LJLJI = ki9;
    }
}
