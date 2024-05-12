package Y;

import X.C49111JPf;
import X.C49586Jd8;
import X.C50321Joz;
import X.C50356JpY;
import X.C50651JuJ;
import X.C50652JuK;
import X.C76800UCe;
import X.E7N;
import X.InterfaceC55251LmJ;
import X.J4A;
import X.J4G;
import X.JN8;
import X.JNE;
import X.JQA;
import X.ViewOnAttachStateChangeListenerC49251JUp;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyReportParam;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyRequestBody;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.SearchFeelgoodSurveyApi;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ACallableS37S1200000_8 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS37S1200000_8 aCallableS37S1200000_8) {
        String str = aCallableS37S1200000_8.s0;
        J4A j4a = new J4A(null, str);
        j4a.LIZIZ = str;
        MLCommonServiceImpl mLCommonServiceImpl = (MLCommonServiceImpl) aCallableS37S1200000_8.l1;
        ArrayList arrayList = (ArrayList) aCallableS37S1200000_8.l2;
        mLCommonServiceImpl.getClass();
        MLCommonServiceImpl.LIZJ("before_recommend_load_more", j4a, arrayList);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS37S1200000_8 aCallableS37S1200000_8) {
        ((MLCommonServiceImpl) aCallableS37S1200000_8.l1).checkAndInit(1);
        ArrayList<J4G> LIZIZ = ((MLCommonServiceImpl) aCallableS37S1200000_8.l1).LIZIZ("play_prepare");
        if (LIZIZ != null) {
            Aweme aweme = (Aweme) aCallableS37S1200000_8.l2;
            String str = aCallableS37S1200000_8.s0;
            MLCommonServiceImpl mLCommonServiceImpl = (MLCommonServiceImpl) aCallableS37S1200000_8.l1;
            J4A j4a = new J4A(aweme, str);
            mLCommonServiceImpl.getClass();
            MLCommonServiceImpl.LIZJ("play_prepare", j4a, LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS37S1200000_8 aCallableS37S1200000_8) {
        return SearchFeelgoodSurveyApi.LIZ(aCallableS37S1200000_8.s0, new FeelgoodSurveyRequestBody("7140153608942780417", "tt_search", new FeelgoodSurveyReportParam(((C50356JpY) aCallableS37S1200000_8.l1).LIZLLL, "search.survey.tiktok.com", SettingServiceImpl.LIZ().getAppLanguage(), 3, E7N.LIZ()), null, null, 24, null)).LIZLLL(new AgS111S0200000_8((C50356JpY) aCallableS37S1200000_8.l1, (Fragment) aCallableS37S1200000_8.l2, 1));
    }

    public static final Object call$3(ACallableS37S1200000_8 aCallableS37S1200000_8) {
        String str;
        SearchSpot searchSpot;
        VideoTag videoTag;
        String englishTitle;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = ((ViewOnAttachStateChangeListenerC49251JUp) aCallableS37S1200000_8.l1).itemView;
        c50651JuJ.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(view);
        String str2 = "";
        if (LIZLLL == null || (str = LIZLLL.getSearchKeyword()) == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Video video = ((Aweme) aCallableS37S1200000_8.l2).getVideo();
        if (video != null && (videoTag = video.getVideoTag()) != null && (englishTitle = videoTag.getEnglishTitle()) != null) {
            str2 = englishTitle;
        }
        linkedHashMap.put("video_tag", str2);
        JQA LJLJL = ((ViewOnAttachStateChangeListenerC49251JUp) aCallableS37S1200000_8.l1).LJLJL();
        LJLJL.LIZ(((ViewOnAttachStateChangeListenerC49251JUp) aCallableS37S1200000_8.l1).P().jv0());
        TopVideoHolderVM Q = ((ViewOnAttachStateChangeListenerC49251JUp) aCallableS37S1200000_8.l1).Q();
        Q.getClass();
        C49586Jd8 c49586Jd8 = null;
        r6 = null;
        String str3 = null;
        if (C49111JPf.LIZJ(Q.LJZ)) {
            TopVideoHolderVM Q2 = ((ViewOnAttachStateChangeListenerC49251JUp) aCallableS37S1200000_8.l1).Q();
            Q2.getClass();
            JN8 jn8 = new JN8(LJLJL);
            jn8.LJIIZILJ("search_id", LJLJL.LJII);
            jn8.LJIJI(LJLJL.LJFF);
            jn8.LJIJ("search_result_id", LJLJL.LJJIJIIJI);
            jn8.LJIIZILJ("search_keyword", str);
            SearchMixFeed searchMixFeed = Q2.LJZ;
            if (searchMixFeed != null && (searchSpot = searchMixFeed.hotSpot) != null) {
                str3 = searchSpot.alaSrc;
            }
            jn8.LJIIZILJ("token_type", str3);
            jn8.LJJIIJZLJL("1");
            jn8.LJJI(Integer.valueOf(LJLJL.LJIIL));
            jn8.LJIIZILJ("item_num", String.valueOf((Object) 1));
            jn8.LJIIZILJ("trending_type", "video");
            jn8.LJIILIIL();
        } else {
            Aweme aweme = (Aweme) aCallableS37S1200000_8.l2;
            String str4 = aCallableS37S1200000_8.s0;
            View itemView = ((ViewOnAttachStateChangeListenerC49251JUp) aCallableS37S1200000_8.l1).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            InterfaceC55251LmJ interfaceC55251LmJ = (InterfaceC55251LmJ) ((ViewOnAttachStateChangeListenerC49251JUp) aCallableS37S1200000_8.l1).LLILIL.getValue();
            if (interfaceC55251LmJ != null) {
                c49586Jd8 = (C49586Jd8) interfaceC55251LmJ.getSource();
            }
            JNE.LIZLLL(aweme, str4, LJLJL, itemView, c49586Jd8, str, LJLJL.LJIIL, linkedHashMap);
        }
        return C76800UCe.LIZ;
    }

    public ACallableS37S1200000_8(ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp, Aweme aweme, int i) {
        this.$t = i;
        this.l1 = viewOnAttachStateChangeListenerC49251JUp;
        this.l2 = aweme;
        this.s0 = "general_search";
    }

    public ACallableS37S1200000_8(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
