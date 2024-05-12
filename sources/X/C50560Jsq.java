package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.translation.service.TranslationKevaServiceImpl;
import com.ss.android.ugc.aweme.translation.service.TranslationLangKevaServiceImpl;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jsq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50560Jsq {
    public static String LIZJ() {
        return TranslationServiceImpl.LJJIJ().LJJIIZI();
    }

    public static boolean LIZLLL() {
        return TranslationKevaServiceImpl.LJIIL().LIZLLL();
    }

    public static CaptionLanguage LIZ(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        if (aweme != null && (video = aweme.getVideo()) != null && (captionModel = video.getCaptionModel()) != null) {
            return captionModel.getOriginalCaptionLanguage();
        }
        return null;
    }

    public static int LIZIZ(Aweme aweme) {
        String str;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        CaptionLanguage LIZ = LIZ(aweme);
        if (LIZ == null || (str = LIZ.getLanguageCode()) == null) {
            str = "";
        }
        CaptionItemModel captionItemModel = null;
        if (aweme != null && (video = aweme.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && (captionList = captionModel.getCaptionList()) != null) {
            Iterator<CaptionItemModel> it = captionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CaptionItemModel next = it.next();
                if (o.LJ(str, next.getLanguageCode())) {
                    captionItemModel = next;
                    break;
                }
            }
            CaptionItemModel captionItemModel2 = captionItemModel;
            if (captionItemModel2 != null) {
                return captionItemModel2.getSubId();
            }
        }
        return 0;
    }

    public static boolean LJ(String str) {
        boolean z;
        boolean LJ;
        LIZLLL();
        C34265Dcb.LIZ();
        LIZJ();
        String[] LJ2 = TranslationLangKevaServiceImpl.LJIIZILJ().LJ();
        if (LJ2 != null) {
            for (String str2 : LJ2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append(',');
                X1D.LIZIZ(LIZ);
            }
        }
        SettingServiceImpl.LIZ().getAppLanguage();
        if (LIZLLL()) {
            LJ = o.LJ(str, LIZJ());
        } else if (C34265Dcb.LIZ() == 0) {
            LJ = o.LJ(str, LIZJ());
        } else {
            String[] LJ3 = TranslationLangKevaServiceImpl.LJIIZILJ().LJ();
            if (LJ3 == null || LJ3.length == 0 || !ORY.LJJIJIIJIL(str, LJ3)) {
                z = false;
            } else {
                z = true;
            }
            if (C34265Dcb.LIZ() == 1 && z) {
                return false;
            }
            String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
            if (C34265Dcb.LIZ() == 2 && (z || o.LJ(appLanguage, str))) {
                return false;
            }
            LJ = o.LJ(str, LIZJ());
        }
        return !LJ;
    }
}
