package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JNE {
    public static final String LIZ(Aweme aweme) {
        int i;
        int i2 = 0;
        if (aweme != null) {
            i = aweme.getTotalProductAnchors();
        } else {
            i = 0;
        }
        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
        if (LJJJJZI != null) {
            i2 = LJJJJZI.LJJJJLI();
        }
        if (i <= 0) {
            return "";
        }
        if (i2 == 1) {
            return "search_video_top_icon";
        }
        return "search_video_single_anchor";
    }

    public static final boolean LIZIZ(Aweme aweme) {
        UrlModel urlModel;
        boolean LIZJ;
        UrlModel urlModel2;
        Video video;
        Video video2;
        UrlModel urlModel3 = null;
        if (aweme != null) {
            Video video3 = aweme.getVideo();
            if (video3 == null || (urlModel = video3.getAnimatedCover()) == null) {
                Video video4 = aweme.getVideo();
                if (video4 != null) {
                    urlModel = video4.getDynamicCover();
                }
            }
            LIZJ = LIZJ(urlModel);
            if (aweme == null && (video2 = aweme.getVideo()) != null) {
                urlModel2 = video2.getAiDynamicCover();
            } else {
                urlModel2 = null;
            }
            boolean LIZJ2 = LIZJ(urlModel2);
            if (aweme != null && (video = aweme.getVideo()) != null) {
                urlModel3 = video.getAiDynamicCoverBak();
            }
            boolean LIZJ3 = LIZJ(urlModel3);
            if (!LIZJ || LIZJ2 || LIZJ3) {
                return true;
            }
            return false;
        }
        urlModel = null;
        LIZJ = LIZJ(urlModel);
        if (aweme == null) {
        }
        urlModel2 = null;
        boolean LIZJ22 = LIZJ(urlModel2);
        if (aweme != null) {
            urlModel3 = video.getAiDynamicCoverBak();
        }
        boolean LIZJ32 = LIZJ(urlModel3);
        if (!LIZJ) {
        }
        return true;
    }

    public static final boolean LIZJ(UrlModel urlModel) {
        List<String> urlList;
        String str;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList)) == null || !C78857UxB.LJJJIL(str)) {
            return false;
        }
        return true;
    }

    public static final void LIZLLL(Aweme aweme, String enterFrom, JQA jqa, View view, C49586Jd8 c49586Jd8, String str, int i, java.util.Map<String, String> map) {
        UrlModel urlModel;
        String str2;
        Integer num;
        String str3;
        String str4;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        JL3 jl3 = JL3.LJLIL;
        Video video = aweme.getVideo();
        Integer num2 = null;
        if (video != null && video.getAiCover() != null && !LIZIZ(aweme)) {
            num = 0;
            str2 = null;
        } else {
            Video video2 = aweme.getVideo();
            if (video2 != null) {
                urlModel = video2.getAiCover();
            } else {
                urlModel = null;
            }
            str2 = "static";
            if (urlModel == null && LIZIZ(aweme)) {
                jl3.getClass();
                num = 1;
            } else {
                Video video3 = aweme.getVideo();
                if (video3 != null && video3.getAiCover() != null && LIZIZ(aweme)) {
                    jl3.getClass();
                    num = 2;
                } else {
                    num = null;
                    str2 = null;
                }
            }
        }
        int i2 = -1;
        if (aweme.getRank() != -1) {
            i = aweme.getRank();
        }
        JNF jnf = new JNF(jqa);
        jnf.LJIJI(enterFrom);
        jnf.LJIIZILJ("log_pb", C3A5.LIZ.LIZIZ(aweme.getRequestId()));
        jnf.LJIIZILJ("search_keyword", str);
        jnf.LJIIZILJ("group_id", C227768wm.LIZIZ(aweme));
        jnf.LIZ(K02.LIZ(aweme, "search_result_show_video", enterFrom, jqa));
        jnf.LJJI(Integer.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        jnf.LJIIZILJ("cover_type", str2);
        if (num != null) {
            i2 = num.intValue();
        }
        jnf.LIZJ(i2, "ai_cover");
        jnf.LJIIZILJ("origin_format", jqa.LJJIFFI);
        jnf.LJIIZILJ("current_format", jqa.LJJII);
        String str5 = jqa.LJIJJ;
        String str6 = "normal";
        if (str5 == null) {
            str5 = "normal";
        }
        jnf.LIZLLL("use_scenario", str5);
        String LJIILJJIL = C78939UyV.LJIILJJIL(aweme);
        if (LJIILJJIL != null) {
            jnf.LJIIZILJ("aweme_id", LJIILJJIL);
        }
        String str7 = jqa.LJIJI;
        if (str7 != null) {
            str6 = str7;
        }
        jnf.LIZLLL("tns_ban_type", str6);
        jnf.LJIIZILJ("search_id_a", jqa.LJII);
        jnf.LJIIZILJ("impr_id_a", jqa.LJIIIIZZ);
        C50652JuK.Companion.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(view);
        if (LIZLLL != null) {
            str3 = LIZLLL.getSearchId();
        } else {
            str3 = null;
        }
        jnf.LJIIZILJ("search_id_a_x", str3);
        if (c49586Jd8 != null) {
            str4 = c49586Jd8.getImplId();
        } else {
            str4 = null;
        }
        jnf.LJIIZILJ("impr_id_a_x", str4);
        jnf.LJIIZILJ("impr_id", jqa.LJII);
        jnf.LIZ(map);
        jnf.LJIL(Integer.valueOf(aweme.getAwemeType()));
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            num2 = Integer.valueOf(imageList.size());
        }
        jnf.LJJ(num2);
        jnf.LJIILIIL();
    }
}
