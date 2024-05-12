package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.extensions.LogExtra;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187677Yd {
    public static final String LIZ(Aweme aweme) {
        String str;
        AnchorCommonStruct anchorCommonStruct;
        String logExtra;
        boolean z;
        LogExtra logExtra2 = null;
        if (aweme == null || !aweme.isPhotoMode() || aweme.isAd()) {
            return null;
        }
        if (aweme.getPhotoContentType() != null) {
            return aweme.getPhotoContentType();
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorCommonStruct = it.next();
                    AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                    if (anchorCommonStruct2 != null && anchorCommonStruct2.getType() == EnumC42934Gt8.ARTICLE_PHOTO_MODE.getTYPE()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    anchorCommonStruct = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
            if (anchorCommonStruct3 != null && (logExtra = anchorCommonStruct3.getLogExtra()) != null) {
                try {
                    logExtra2 = (LogExtra) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), logExtra, LogExtra.class);
                } catch (s unused) {
                }
            }
        }
        if (logExtra2 == null || (str = logExtra2.L()) == null) {
            str = "";
        }
        aweme.setPhotoContentType(str);
        return aweme.getPhotoContentType();
    }
}
