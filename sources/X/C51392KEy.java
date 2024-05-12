package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.ecommerce.model.EcSuggestWordStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EcWordStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.KEy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51392KEy {
    public static KFD LIZIZ(VideoItemParams item) {
        List<EcSuggestWordStruct> suggestWords;
        String str;
        String str2;
        EcWordStruct ecWordStruct;
        EcWordStruct ecWordStruct2;
        String str3;
        EcWordStruct ecWordStruct3;
        o.LJIIIZ(item, "item");
        KFD kfd = new KFD();
        EcFeedSuggestWordList ecFeedSuggestWordList = item.getAweme().getEcFeedSuggestWordList();
        if (ecFeedSuggestWordList != null && (suggestWords = ecFeedSuggestWordList.getSuggestWords()) != null) {
            for (EcSuggestWordStruct ecSuggestWordStruct : suggestWords) {
                if (ecSuggestWordStruct != null && o.LJ("feed_bar", ecSuggestWordStruct.getScene())) {
                    if (o.LJ("1", ecSuggestWordStruct.getQrecVirtualEnable())) {
                        Z9N z9n = Z9N.LIZIZ;
                        z9n.LLJJJ(item.getAweme().getAid(), true);
                        List<EcWordStruct> words = ecSuggestWordStruct.getWords();
                        if (words != null && (ecWordStruct3 = (EcWordStruct) ListProtector.get(words, 0)) != null) {
                            str3 = ecWordStruct3.getWord();
                        } else {
                            str3 = null;
                        }
                        z9n.LLIIL(str3, item.getAweme().getAid());
                    }
                    List<EcWordStruct> words2 = ecSuggestWordStruct.getWords();
                    String str4 = "";
                    if (words2 == null || (ecWordStruct2 = (EcWordStruct) ListProtector.get(words2, 0)) == null || (str = ecWordStruct2.getWord()) == null) {
                        str = "";
                    }
                    kfd.LIZ = str;
                    List<EcWordStruct> words3 = ecSuggestWordStruct.getWords();
                    if (words3 == null || (ecWordStruct = (EcWordStruct) ListProtector.get(words3, 0)) == null || (str2 = ecWordStruct.getWordId()) == null) {
                        str2 = "";
                    }
                    kfd.LIZIZ = str2;
                    String qrecVirtualEnable = ecSuggestWordStruct.getQrecVirtualEnable();
                    if (qrecVirtualEnable != null) {
                        str4 = qrecVirtualEnable;
                    }
                    kfd.LIZJ = str4;
                    Integer redirectPage = ecSuggestWordStruct.getRedirectPage();
                    if (redirectPage != null) {
                        int intValue = redirectPage.intValue();
                        KF7.Companion.getClass();
                        KF7 kf7 = KF7.MAP.get(Integer.valueOf(intValue));
                        if (kf7 != null) {
                            kfd.LIZLLL = kf7;
                        }
                    }
                }
            }
        }
        return kfd;
    }

    public static boolean LIZ(VideoItemParams item, KFD kfd) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(item, "item");
        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
        String str = kfd.LIZ;
        String str2 = kfd.LIZJ;
        Fragment fragment = item.fragment;
        if (fragment != null) {
            activityC45651qj = fragment.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        return LJJJJZI.LJJIIZ(activityC45651qj, str, str2);
    }
}
