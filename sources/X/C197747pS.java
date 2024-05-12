package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import defpackage.e1;
import java.util.List;

/* renamed from: X.7pS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197747pS {
    public static String LIZ(Aweme aweme) {
        boolean z;
        UrlModel compositeImageLTR;
        List<String> urlList;
        UrlModel watermarkImageLTR;
        List<String> urlList2;
        UrlModel compositeImageRTL;
        List<String> urlList3;
        UrlModel watermarkImageRTL;
        List<String> urlList4;
        UrlModel compositeImageLtrWithoutWatermark;
        List<String> urlList5;
        UrlModel compositeImageRtlWithoutWatermark;
        List<String> urlList6;
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null && (downloadGeneral = awemeACLShare.getDownloadGeneral()) != null && downloadGeneral.getTranscode() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C90193gN.LIZ()) {
                NowPostInfo nowPostInfo = aweme.nowPostInfo;
                if (nowPostInfo == null || (compositeImageRtlWithoutWatermark = nowPostInfo.getCompositeImageRtlWithoutWatermark()) == null || (urlList6 = compositeImageRtlWithoutWatermark.getUrlList()) == null || !(!urlList6.isEmpty())) {
                    return null;
                }
                return (String) ListProtector.get(urlList6, 0);
            }
            NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
            if (nowPostInfo2 == null || (compositeImageLtrWithoutWatermark = nowPostInfo2.getCompositeImageLtrWithoutWatermark()) == null || (urlList5 = compositeImageLtrWithoutWatermark.getUrlList()) == null || !(!urlList5.isEmpty())) {
                return null;
            }
            return (String) ListProtector.get(urlList5, 0);
        }
        if (C90193gN.LIZ()) {
            if (e1.LIZ(31744, "download_photo_new_watermark", true, false)) {
                NowPostInfo nowPostInfo3 = aweme.nowPostInfo;
                if (nowPostInfo3 == null || (watermarkImageRTL = nowPostInfo3.getWatermarkImageRTL()) == null || (urlList4 = watermarkImageRTL.getUrlList()) == null || !(!urlList4.isEmpty())) {
                    return null;
                }
                return (String) ListProtector.get(urlList4, 0);
            }
            NowPostInfo nowPostInfo4 = aweme.nowPostInfo;
            if (nowPostInfo4 == null || (compositeImageRTL = nowPostInfo4.getCompositeImageRTL()) == null || (urlList3 = compositeImageRTL.getUrlList()) == null || !(!urlList3.isEmpty())) {
                return null;
            }
            return (String) ListProtector.get(urlList3, 0);
        }
        if (e1.LIZ(31744, "download_photo_new_watermark", true, false)) {
            NowPostInfo nowPostInfo5 = aweme.nowPostInfo;
            if (nowPostInfo5 == null || (watermarkImageLTR = nowPostInfo5.getWatermarkImageLTR()) == null || (urlList2 = watermarkImageLTR.getUrlList()) == null || !(!urlList2.isEmpty())) {
                return null;
            }
            return (String) ListProtector.get(urlList2, 0);
        }
        NowPostInfo nowPostInfo6 = aweme.nowPostInfo;
        if (nowPostInfo6 == null || (compositeImageLTR = nowPostInfo6.getCompositeImageLTR()) == null || (urlList = compositeImageLTR.getUrlList()) == null || !(!urlList.isEmpty())) {
            return null;
        }
        return (String) ListProtector.get(urlList, 0);
    }
}
