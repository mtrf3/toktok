package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.8pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223438pn {
    public static boolean LIZ(XI7 xi7) {
        boolean z;
        if (a.LJIIIZ().LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (o.LJ(xi7.LIZ, "") || o.LJ("1", xi7.LIZJ) || !Z9N.LIZIZ.LLLFZ() || z) {
            return false;
        }
        return true;
    }

    public static XI7 LIZIZ(VideoItemParams item) {
        List<SuggestWordStruct> suggestWords;
        String str;
        WordStruct wordStruct;
        String str2;
        String wordId;
        List<WordStruct> words;
        o.LJIIIZ(item, "item");
        XI7 xi7 = new XI7(1);
        CommentSuggestWordList commentSuggestWordList = item.getAweme().getCommentSuggestWordList();
        if (commentSuggestWordList != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                String str3 = null;
                if (suggestWordStruct != null) {
                    str = suggestWordStruct.getScene();
                } else {
                    str = null;
                }
                if (o.LJ("feed_bar", str)) {
                    List<WordStruct> words2 = suggestWordStruct.getWords();
                    if (words2 != null && words2.size() > 0 && (words = suggestWordStruct.getWords()) != null) {
                        wordStruct = (WordStruct) ListProtector.get(words, 0);
                    } else {
                        wordStruct = null;
                    }
                    if (o.LJ("1", suggestWordStruct.getQrecVirtualEnable())) {
                        Z9N z9n = Z9N.LIZIZ;
                        z9n.LLJJJ(item.getAweme().getAid(), true);
                        if (wordStruct != null) {
                            str3 = wordStruct.getWord();
                        }
                        z9n.LLIIL(str3, item.getAweme().getAid());
                    }
                    String str4 = "";
                    if (wordStruct == null || (str2 = wordStruct.getWord()) == null) {
                        str2 = "";
                    }
                    xi7.LIZ = str2;
                    if (wordStruct != null && (wordId = wordStruct.getWordId()) != null) {
                        str4 = wordId;
                    }
                    xi7.LIZIZ = str4;
                    String qrecVirtualEnable = suggestWordStruct.getQrecVirtualEnable();
                    o.LJIIIZ(qrecVirtualEnable, "<set-?>");
                    xi7.LIZJ = qrecVirtualEnable;
                }
            }
        }
        return xi7;
    }
}
