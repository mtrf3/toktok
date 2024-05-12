package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.RoM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70666RoM {
    public static String LIZ() {
        String str;
        C70690Rok c70690Rok = C70691Rol.LJIJ;
        if (c70690Rok != null) {
            str = c70690Rok.LIZJ;
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            return "impression_tag";
        }
        return "all";
    }

    public static java.util.Map LIZIZ() {
        String str;
        String str2;
        LinkedHashMap LIZ = C0JU.LIZ("page_name", "product_review");
        LIZ.put("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
        C70690Rok c70690Rok = C70691Rol.LJIJ;
        if (c70690Rok != null) {
            str = c70690Rok.LIZJ;
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            str2 = "impression_tag";
        } else {
            str2 = "all";
        }
        LIZ.put("page_info", str2);
        LIZ.put("impression_tag_cnt", Integer.valueOf(C70691Rol.LJIJI));
        C70669RoP.LIZ.getClass();
        boolean z = C70669RoP.LIZ().showRating;
        LIZ.put("has_rate", Integer.valueOf(z ? 1 : 0));
        if (z) {
            float f = C70691Rol.LJIILL;
            if (f >= 0.0f) {
                LIZ.put("rate", Float.valueOf(f));
            }
        }
        return LIZ;
    }

    public static java.util.Map LIZJ() {
        String str;
        Integer num;
        LinkedHashMap LIZ = C0JU.LIZ("page_name", "shop_review");
        LIZ.put("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
        LIZ.put("shop_review_cnt", Integer.valueOf(C70691Rol.LJIIZILJ));
        C70690Rok c70690Rok = C70691Rol.LJIJ;
        String str2 = null;
        if (c70690Rok != null) {
            str2 = c70690Rok.LIZJ;
        }
        if (C78685UuP.LJJJZ(str2)) {
            C70690Rok c70690Rok2 = C70691Rol.LJIJ;
            if (c70690Rok2 != null && (num = c70690Rok2.LIZLLL) != null) {
                if (num.intValue() == 2) {
                    str = "rate";
                } else if (num.intValue() == 1) {
                    str = "keyword";
                } else if (num.intValue() == 3) {
                    str = "impression_tag";
                }
                LIZ.put("page_info", str);
                LIZ.put("impression_tag_cnt", Integer.valueOf(C70691Rol.LJIJI));
            }
            str = "all";
            LIZ.put("page_info", str);
            LIZ.put("impression_tag_cnt", Integer.valueOf(C70691Rol.LJIJI));
        }
        return LIZ;
    }

    public static void LIZLLL(LaneParams laneParams, String str) {
        Object obj;
        o.LJIIIZ(laneParams, "<this>");
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        if (LJII != null) {
            obj = LJII.get("product_id");
        } else {
            obj = null;
        }
        laneParams.plusAssign("product_id", obj);
    }

    public static void LJ(LaneParams laneParams, ReviewItemStruct reviewItemStruct, C70690Rok c70690Rok) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        int i4;
        long j;
        int i5;
        ReviewItemStruct.AppendReview appendReview;
        String str3;
        Long LJJIZ;
        List<ReviewMedia> list;
        ReviewItemStruct.AppendReview appendReview2;
        List<ReviewMedia> list2;
        List<ReviewMedia> list3;
        o.LJIIIZ(laneParams, "<this>");
        o.LJIIIZ(reviewItemStruct, "reviewItemStruct");
        laneParams.put("is_self", Integer.valueOf(o.LJ(reviewItemStruct.isOwner, Boolean.TRUE) ? 1 : 0));
        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
        int i6 = 0;
        if (mainReview != null && (list3 = mainReview.media) != null) {
            i = 0;
            i2 = 0;
            for (ReviewMedia reviewMedia : list3) {
                Integer num = reviewMedia.mediaType;
                if (num == null || num.intValue() != 2) {
                    Integer num2 = reviewMedia.mediaType;
                    if (num2 != null && num2.intValue() == 1) {
                        i2++;
                    }
                } else {
                    i++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
        if (mainReview2 != null && (appendReview2 = mainReview2.appendReview) != null && (list2 = appendReview2.media) != null) {
            for (ReviewMedia reviewMedia2 : list2) {
                Integer num3 = reviewMedia2.mediaType;
                if (num3 == null || num3.intValue() != 2) {
                    Integer num4 = reviewMedia2.mediaType;
                    if (num4 != null && num4.intValue() == 1) {
                        i2++;
                    }
                } else {
                    i++;
                }
            }
        }
        Integer num5 = reviewItemStruct.reviewSourceType;
        if (num5 != null) {
            laneParams.put("is_third_party", Integer.valueOf(num5.intValue()));
        }
        laneParams.put("photo_cnt", Integer.valueOf(i2));
        laneParams.put("video_cnt", Integer.valueOf(i));
        ReviewItemStruct.MainReview mainReview3 = reviewItemStruct.review;
        if (mainReview3 != null && (list = mainReview3.media) != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        laneParams.put("photo_show_type", Integer.valueOf(i3));
        ReviewItemStruct.MainReview mainReview4 = reviewItemStruct.review;
        String str4 = null;
        if (mainReview4 != null) {
            str = mainReview4.rating;
        } else {
            str = null;
        }
        laneParams.put("rate", str);
        ReviewItemStruct.MainReview mainReview5 = reviewItemStruct.review;
        if (mainReview5 != null && o.LJ(mainReview5.hasOriginText, Boolean.TRUE)) {
            str2 = "comment";
        } else {
            str2 = "default";
        }
        laneParams.put("text_type", str2);
        Integer num6 = reviewItemStruct.diggCount;
        if (num6 != null) {
            i4 = num6.intValue();
        } else {
            i4 = 0;
        }
        laneParams.put("like_cnt", Integer.valueOf(i4));
        laneParams.put("sku_id", reviewItemStruct.skuId);
        ReviewItemStruct.MainReview mainReview6 = reviewItemStruct.review;
        if (mainReview6 != null) {
            str4 = mainReview6.reviewId;
        }
        laneParams.put("review_id", str4);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        ReviewItemStruct.MainReview mainReview7 = reviewItemStruct.review;
        if (mainReview7 != null && (str3 = mainReview7.reviewTimeStamp) != null && (LJJIZ = C38350F3i.LJJIZ(str3)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        calendar.setTimeInMillis(j);
        laneParams.put("post_date", simpleDateFormat.format(calendar.getTime()));
        laneParams.put("is_anonymous", Integer.valueOf(o.LJ(reviewItemStruct.isAnonymous, Boolean.TRUE) ? 1 : 0));
        if (c70690Rok != null) {
            laneParams.put("filter_name", c70690Rok.LIZIZ);
            laneParams.put("filter_id", c70690Rok.LIZJ);
        }
        ReviewItemStruct.MainReview mainReview8 = reviewItemStruct.review;
        if (mainReview8 != null && mainReview8.reply != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (mainReview8 != null && (appendReview = mainReview8.appendReview) != null && appendReview.reply != null) {
            i5++;
        }
        laneParams.put("reply_cnt", Integer.valueOf(i5));
        ReviewItemStruct.MainReview mainReview9 = reviewItemStruct.review;
        if (mainReview9 != null && mainReview9.appendReview != null) {
            i6 = 1;
        }
        laneParams.put("has_add_review", Integer.valueOf(i6));
        laneParams.put("has_edit", Integer.valueOf(reviewItemStruct.isUpdated ? 1 : 0));
    }
}
