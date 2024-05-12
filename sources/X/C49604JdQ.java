package X;

import Y.ACListenerS21S0100000_1;
import Y.IDDListenerS147S0100000_8;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS5S2300000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JdQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49604JdQ {
    public static final boolean LIZ(SearchMixFeed searchMixFeed) {
        List<RelatedWord> list;
        if (searchMixFeed == null || searchMixFeed.getFeedType() != 1048336) {
            return false;
        }
        C62822Ol8 c62822Ol8 = C34092DZo.LIZ;
        if ((((Number) c62822Ol8.getValue()).intValue() != 1 && ((Number) c62822Ol8.getValue()).intValue() != 2) || (list = searchMixFeed.relatedWordList) == null || list.size() < 4) {
            return false;
        }
        if (!list.isEmpty()) {
            Iterator<RelatedWord> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().text.length() <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LIZIZ(int i, SearchMixFeed data) {
        String str;
        o.LJIIIZ(data, "data");
        if (data.getFeedType() == 37) {
            return true;
        }
        if (i <= 16777216 ? i == 8 : i < 33554432) {
            DynamicPatch LJI = data.LJI();
            if (LJI != null) {
                str = LJI.schema;
            } else {
                str = null;
            }
            if (o.LJ(JWA.LIZ(str), "related_search")) {
                return true;
            }
        }
        return false;
    }

    public static final void LIZJ(ClickSearchWord clickSearchWord, String str, String str2, JQA jqa) {
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        o.LJIIIZ(clickSearchWord, "<this>");
        C50646JuE c50646JuE = new C50646JuE();
        Word word = clickSearchWord.wordRecord;
        String str7 = null;
        if (word != null) {
            str3 = word.getId();
        } else {
            str3 = null;
        }
        c50646JuE.LJIIZILJ("group_id", str3);
        Word word2 = clickSearchWord.wordRecord;
        if (word2 != null) {
            str4 = word2.getWordSource();
        } else {
            str4 = null;
        }
        c50646JuE.LJIIZILJ("words_source", str4);
        Word word3 = clickSearchWord.wordRecord;
        if (word3 != null) {
            num = Integer.valueOf(word3.getWordPosition());
        } else {
            num = null;
        }
        c50646JuE.LJJIIJZLJL(num);
        c50646JuE.LJIIZILJ("words_content", clickSearchWord.word);
        if (jqa != null) {
            str5 = jqa.LJII;
        } else {
            str5 = null;
        }
        c50646JuE.LJIIZILJ("search_id", str5);
        if (jqa != null) {
            str7 = jqa.LJIIIZ;
        }
        c50646JuE.LJIIZILJ("impr_id", str7);
        c50646JuE.LJIIZILJ("raw_query", str);
        c50646JuE.LJIIZILJ("words_content", clickSearchWord.word);
        c50646JuE.LJIIZILJ("search_position", "general");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_group_id", str2);
        c50646JuE.LIZ(c188727au.LIZ);
        c50646JuE.LJIILIIL();
        C50699Jv5 c50699Jv5 = new C50699Jv5();
        if (jqa == null || (str6 = jqa.LJIIIZ) == null) {
            str6 = "";
        }
        c50699Jv5.LJII(str6);
    }

    public static final void LIZLLL(int i, String str, String str2, JQA jqa) {
        String str3;
        C49701Jez c49701Jez = new C49701Jez();
        c49701Jez.LJIIZILJ("words_source", "click_recom");
        c49701Jez.LJIIZILJ("words_num", String.valueOf(Integer.valueOf(i)));
        String str4 = null;
        if (jqa != null) {
            str3 = jqa.LJII;
        } else {
            str3 = null;
        }
        c49701Jez.LJIIZILJ("search_id", str3);
        if (jqa != null) {
            str4 = jqa.LJIIIZ;
        }
        c49701Jez.LJIIZILJ("impr_id", str4);
        c49701Jez.LJIIZILJ("raw_query", str);
        c49701Jez.LJIIZILJ("search_position", "general");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_group_id", str2);
        c49701Jez.LIZ(c188727au.LIZ);
        c49701Jez.LJIILIIL();
    }

    public static final void LJ(ClickSearchWord clickSearchWord, String str, String str2, JQA jqa) {
        String str3;
        String str4;
        String str5;
        Integer num;
        o.LJIIIZ(clickSearchWord, "<this>");
        if (clickSearchWord.LIZ) {
            return;
        }
        C50648JuG c50648JuG = new C50648JuG();
        Word word = clickSearchWord.wordRecord;
        String str6 = null;
        if (word != null) {
            str3 = word.getWordSource();
        } else {
            str3 = null;
        }
        c50648JuG.LJIIZILJ("words_source", str3);
        if (jqa != null) {
            str4 = jqa.LJII;
        } else {
            str4 = null;
        }
        c50648JuG.LJIIZILJ("search_id", str4);
        if (jqa != null) {
            str5 = jqa.LJIIIZ;
        } else {
            str5 = null;
        }
        c50648JuG.LJIIZILJ("impr_id", str5);
        c50648JuG.LJIIZILJ("raw_query", str);
        Word word2 = clickSearchWord.wordRecord;
        if (word2 != null) {
            num = Integer.valueOf(word2.getWordPosition());
        } else {
            num = null;
        }
        c50648JuG.LJJIIJZLJL(num);
        c50648JuG.LJIIZILJ("words_content", clickSearchWord.word);
        c50648JuG.LJIIZILJ("search_position", "general");
        c50648JuG.LJIIZILJ("words_content", clickSearchWord.word);
        Word word3 = clickSearchWord.wordRecord;
        if (word3 != null) {
            str6 = word3.getId();
        }
        c50648JuG.LJIIZILJ("group_id", str6);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_group_id", str2);
        c50648JuG.LIZ(c188727au.LIZ);
        c50648JuG.LJIILIIL();
        clickSearchWord.LIZ = true;
    }

    public static final void LJI(Context context, JQA jqa, Word word, String str) {
        String str2;
        String str3;
        Integer num;
        String str4;
        FragmentManager supportFragmentManager;
        o.LJIIIZ(context, "context");
        String currentTime = String.valueOf(System.currentTimeMillis());
        o.LJIIIZ(currentTime, "currentTime");
        C49702Jf0 c49702Jf0 = new C49702Jf0();
        String str5 = null;
        if (jqa != null) {
            str2 = jqa.LJ;
        } else {
            str2 = null;
        }
        c49702Jf0.LJIIZILJ("raw_query", str2);
        if (word != null) {
            str3 = word.getWord();
        } else {
            str3 = null;
        }
        c49702Jf0.LJIIZILJ("words_content", str3);
        if (word != null) {
            num = Integer.valueOf(word.getWordPosition());
        } else {
            num = null;
        }
        c49702Jf0.LJJIIJZLJL(num);
        if (jqa != null) {
            str4 = jqa.LJIIIIZZ;
        } else {
            str4 = null;
        }
        c49702Jf0.LJIIZILJ("impr_id", str4);
        if (word != null) {
            str5 = word.getId();
        }
        c49702Jf0.LJIIZILJ("group_id", str5);
        c49702Jf0.LJIIZILJ("words_source", str);
        c49702Jf0.LJ("feedback_id", currentTime, InterfaceC1798974f.LIZ);
        c49702Jf0.LJIILIIL();
        new C61996OUu(context).LIZ(1);
        C245319jz c245319jz = new C245319jz();
        C252659vp LIZIZ = C49606JdS.LIZIZ(R.raw.icon_flag, R.string.rwy);
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS5S2300000_8(context, word, jqa, str, currentTime, 0), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        C252659vp LIZIZ2 = C49606JdS.LIZIZ(R.raw.icon_heart_broken, R.string.qee);
        LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS5S2300000_8(context, word, jqa, str, currentTime, 1), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LIZ(LIZIZ, LIZIZ2);
        DialogInterfaceOnCancelListenerC49605JdR dialogInterfaceOnCancelListenerC49605JdR = new DialogInterfaceOnCancelListenerC49605JdR(word, jqa, str, currentTime);
        TuxActionSheet tuxActionSheet = c245319jz.LIZ;
        tuxActionSheet.LJLIL = dialogInterfaceOnCancelListenerC49605JdR;
        tuxActionSheet.LJLILLLLZI = new IDDListenerS147S0100000_8(context, 2);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            LIZJ.show(supportFragmentManager, "recommend report");
        }
        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(context);
        if (LJJIFFI2 != null) {
            ((SearchStateViewModel) ViewModelProviders.of(LJJIFFI2).get(SearchStateViewModel.class)).setShouldBlockMediaPlay(true);
        }
    }

    public static final void LJFF(Word word, JQA jqa, String str, String wordSource, String currentTime) {
        String str2;
        String str3;
        Integer num;
        String str4;
        o.LJIIIZ(wordSource, "wordSource");
        o.LJIIIZ(currentTime, "currentTime");
        C49699Jex c49699Jex = new C49699Jex();
        String str5 = null;
        if (jqa != null) {
            str2 = jqa.LJ;
        } else {
            str2 = null;
        }
        c49699Jex.LJIIZILJ("raw_query", str2);
        if (word != null) {
            str3 = word.getWord();
        } else {
            str3 = null;
        }
        c49699Jex.LJIIZILJ("words_content", str3);
        if (word != null) {
            num = Integer.valueOf(word.getWordPosition());
        } else {
            num = null;
        }
        c49699Jex.LJJIIJZLJL(num);
        if (jqa != null) {
            str4 = jqa.LJIIIIZZ;
        } else {
            str4 = null;
        }
        c49699Jex.LJIIZILJ("impr_id", str4);
        if (word != null) {
            str5 = word.getId();
        }
        c49699Jex.LJIIZILJ("group_id", str5);
        c49699Jex.LJIIZILJ("button_type", str);
        c49699Jex.LJIIZILJ("words_source", wordSource);
        c49699Jex.LJ("feedback_id", currentTime, InterfaceC1798974f.LIZ);
        c49699Jex.LJIILIIL();
    }
}
