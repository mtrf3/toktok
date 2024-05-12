package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* loaded from: classes9.dex */
public final class K7W {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SearchSugEntity searchSugEntity, int i, String str, String str2, String str3, String str4, String str5) {
        Word word = searchSugEntity.mWord;
        if (word == null) {
            return;
        }
        K8H k8h = new K8H();
        k8h.LJIILL("raw_query", str4);
        k8h.LJIILL("words_content", word.getWord());
        k8h.LJIIZILJ(Integer.valueOf(i));
        k8h.LJIILL("impr_id", str5);
        k8h.LJIILL("group_id", word.getId());
        k8h.LJIILL("button_type", str);
        k8h.LJIILL("words_source", "sug");
        k8h.LJIILL("sug_type", str2);
        k8h.LJ("feedback_id", str3, InterfaceC1798974f.LIZ);
        k8h.LJIILIIL();
    }
}
