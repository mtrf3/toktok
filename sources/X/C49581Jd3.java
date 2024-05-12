package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import kotlin.jvm.internal.o;

/* renamed from: X.Jd3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49581Jd3 {
    public static int LIZIZ() {
        int i;
        ICaptionKevaService LJJJJI = CaptionKevaServiceImpl.LJJJJI();
        if (((Number) C34108Da4.LIZ.getValue()).intValue() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        return LJJJJI.LJIJ(i);
    }

    public static C188727au LIZ(JQA jqa, Aweme aweme, boolean z) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        CaptionModel captionModel;
        C188727au c188727au = new C188727au();
        Video video = aweme.getVideo();
        Integer num2 = null;
        if (video != null) {
            num = Integer.valueOf(video.getDuration());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "item_duration");
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("target_lang", C50560Jsq.LIZJ());
        String str8 = "1";
        c188727au.LJIIIZ("has_subtitle", "1");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("have_transl", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("use_transl", str2);
        c188727au.LJIIIZ("subtitle_type", "asr");
        Video video2 = aweme.getVideo();
        if (video2 == null || (captionModel = video2.getCaptionModel()) == null || !o.LJ(captionModel.getHideOriginalCaption(), Boolean.TRUE)) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_burned_in", str8);
        CaptionLanguage LIZ = C50560Jsq.LIZ(aweme);
        if (LIZ != null) {
            str3 = LIZ.getLanguageCode();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("subtitle_source_lang", str3);
        if (LIZIZ() == 0) {
            str4 = "icon";
        } else {
            str4 = "captions";
        }
        c188727au.LJIIIZ("captions_show_type", str4);
        c188727au.LJIIIZ("enter_from", "general_search");
        if (jqa != null) {
            str5 = jqa.LJ;
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("search_keyword", str5);
        if (jqa != null) {
            str6 = jqa.LJII;
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("search_id", str6);
        if (jqa != null) {
            str7 = jqa.LIZJ;
        } else {
            str7 = null;
        }
        c188727au.LJIIIZ("search_type", str7);
        c188727au.LJIIIZ("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        if (jqa != null) {
            num2 = Integer.valueOf(jqa.LJIIL);
        }
        c188727au.LJFF(num2, "rank");
        return c188727au;
    }
}
