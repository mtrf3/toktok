package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7rR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198977rR {
    public static String LIZ;
    public static PoiReviewsApi.PoiReviewModel LIZIZ;

    public static PoiReviewsApi.PoiReviewModel LIZ(String str, String reviewId, double d, String text, long j, List list) {
        String str2 = str;
        o.LJIIIZ(reviewId, "reviewId");
        o.LJIIIZ(text, "text");
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (str2 == null) {
            str2 = "";
        }
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = new PoiReviewsApi.PoiReviewUserModel(curUser.getUid(), curUser.getNickname(), curUser.getUniqueId(), curUser.getAvatarThumb(), curUser.getAvatarMedium(), curUser.getAvatarLarger(), null, null, 192, null);
        Double valueOf = Double.valueOf(d);
        ArrayList arrayList = new ArrayList();
        if ((!((ArrayList) list).isEmpty()) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (C78685UuP.LJJJZ(str3)) {
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(C47261Igj.LJJIJ(str3));
                    UrlModel urlModel2 = new UrlModel();
                    urlModel2.setUrlList(C47261Igj.LJJIJ(str3));
                    arrayList.add(new PoiReviewsApi.ImageDataModel(urlModel2, urlModel));
                }
            }
        }
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel = new PoiReviewsApi.PoiReviewContentModel(valueOf, text, arrayList);
        PoiReviewsApi.PoiReviewBasicInfoModel poiReviewBasicInfoModel = new PoiReviewsApi.PoiReviewBasicInfoModel(Long.valueOf(j));
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = new PoiReviewsApi.PoiReviewStatisticsModel(0L);
        Boolean bool = Boolean.FALSE;
        return new PoiReviewsApi.PoiReviewModel(str2, reviewId, poiReviewUserModel, poiReviewContentModel, poiReviewBasicInfoModel, poiReviewStatisticsModel, new PoiReviewsApi.PoiReviewUserStatusModel(bool, bool), null, null, false, false, null, 3968, null);
    }
}
