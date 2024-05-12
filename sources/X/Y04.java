package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y04 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Aweme aweme) {
        String str;
        CaptionModel captionModel;
        CaptionLanguage originalCaptionLanguage;
        if (aweme == null) {
            return false;
        }
        Video video = aweme.getVideo();
        if (video != null && (captionModel = video.getCaptionModel()) != null && (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) != null) {
            str = originalCaptionLanguage.getLanguageCode();
        } else {
            str = null;
        }
        return ORY.LJJIJIIJIL(str, C86678Y0c.LIZIZ().LJIILLIIL());
    }

    public static final boolean LIZIZ(Aweme aweme) {
        CaptionModel captionModel;
        Video video;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            captionModel = video.getCaptionModel();
        } else {
            captionModel = null;
        }
        if (captionModel == null) {
            return false;
        }
        if ((!C86678Y0c.LIZIZ().LJJIFFI() && TextUtils.equals(aweme.getAuthorUid(), ((RBX) HG3.LJIILL()).getCurUserId())) || LIZ(aweme)) {
            return false;
        }
        if ((!C52263KfD.LIZ() || LIZLLL(aweme) == null) && (C52472Kia.LIZ == 0 || !C86678Y0c.LIZIZ().LJIILJJIL(aweme, C86678Y0c.LIZIZ().LJJIIZI()))) {
            return false;
        }
        return true;
    }

    public static final CaptionItemModel LIZLLL(Aweme aweme) {
        return LIZJ(aweme, Y01.LIZIZ.LJJIIZI());
    }

    public static final int LJ(Aweme aweme) {
        CaptionItemModel LIZLLL;
        if (aweme != null && (LIZLLL = LIZLLL(aweme)) != null) {
            return LIZLLL.getSubId();
        }
        return 0;
    }

    public static final CaptionItemModel LIZJ(Aweme aweme, String languageCode) {
        String str;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        o.LJIIIZ(languageCode, "languageCode");
        CaptionItemModel captionItemModel = null;
        if (aweme != null && (video2 = aweme.getVideo()) != null && (captionModel2 = video2.getCaptionModel()) != null && (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) != null) {
            str = originalCaptionLanguage.getLanguageCode();
        } else {
            str = null;
        }
        if (o.LJ(str, languageCode) || aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null) {
            return null;
        }
        Iterator<CaptionItemModel> it = captionList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CaptionItemModel next = it.next();
            if (o.LJ(languageCode, next.getLanguageCode())) {
                captionItemModel = next;
                break;
            }
        }
        return captionItemModel;
    }
}
