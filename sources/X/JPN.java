package X;

import android.text.TextUtils;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpotInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JPN {
    public SearchSpotInfo LIZ;
    public SearchSpot LIZIZ;
    public JQA LIZJ;

    public final void LIZ(String eventName, SearchSpot searchSpot) {
        String str;
        String str2;
        int i;
        String str3;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(searchSpot, "searchSpot");
        JQA jqa = this.LIZJ;
        if (jqa == null) {
            return;
        }
        ActivityC45651qj LIZ = C48966JJq.LIZ(((JPQ) this).LJ);
        if (LIZ != null) {
            jqa.LIZ(((SearchGlobalViewModel) ViewModelProviders.of(LIZ).get(SearchGlobalViewModel.class)).jv0());
        }
        String str4 = "";
        if (TextUtils.equals(eventName, "search_result_show")) {
            JN8 LIZIZ = JND.LIZIZ(jqa);
            LIZIZ.LJIIZILJ("token_type", searchSpot.alaSrc);
            SearchSpot searchSpot2 = this.LIZIZ;
            if (searchSpot2 != null && (str3 = searchSpot2.docId) != null) {
                str4 = str3;
            }
            LIZIZ.LJIJ("search_result_id", str4);
            List<? extends Aweme> list = searchSpot.awemeCards;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            LIZIZ.LJIIZILJ("item_num", String.valueOf(i));
            LIZIZ.LJIILIIL();
            return;
        }
        if (!TextUtils.equals(eventName, "search_result_click")) {
            return;
        }
        JNB LIZ2 = JND.LIZ(jqa);
        LIZ2.LJIIZILJ("token_type", searchSpot.alaSrc);
        LIZ2.LJIIZILJ("aladdin_button_type", "click_more_button");
        SearchSpotInfo searchSpotInfo = this.LIZ;
        if (searchSpotInfo == null || (str = searchSpotInfo.sentence) == null) {
            str = "";
        }
        LIZ2.LIZLLL("aladdin_words", str);
        SearchSpot searchSpot3 = this.LIZIZ;
        if (searchSpot3 != null && (str2 = searchSpot3.docId) != null) {
            str4 = str2;
        }
        LIZ2.LJIJ("search_result_id", str4);
        LIZ2.LJIILIIL();
    }
}
