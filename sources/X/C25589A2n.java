package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A2n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25589A2n {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C188727au c188727au, CollectionDetailModel collectionDetailModel) {
        String str;
        PaidVideoItem paidVideoItem;
        if ((!collectionDetailModel.getPaidVideoList().isEmpty()) && (paidVideoItem = (PaidVideoItem) ORZ.LJLLLL(collectionDetailModel.getPaidVideoList())) != null && paidVideoItem.isIntro()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("has_intro_video", str);
    }

    public static void LIZIZ(C188727au c188727au, PaidCollectionListResponse paidCollectionListResponse) {
        StringBuilder sb = new StringBuilder();
        List<CollectionDetailModel> list = paidCollectionListResponse.collectionList;
        if (list != null) {
            int i = 0;
            for (CollectionDetailModel collectionDetailModel : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    CollectionDetailModel collectionDetailModel2 = collectionDetailModel;
                    if (i > 0) {
                        sb.append(",");
                    }
                    sb.append(String.valueOf(collectionDetailModel2.getCollectionId()));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        c188727au.LJI("collection_id_list", sb.toString());
    }

    public static void LIZJ(C188727au c188727au, CollectionDetailModel collectionDetailModel) {
        String str;
        User collectionCreator = collectionDetailModel.getCollectionCreator();
        if (collectionCreator != null) {
            str = collectionCreator.getUid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("collection_user_id", str);
    }

    public static void LIZLLL(C188727au c188727au, CollectionDetailModel collectionDetailModel) {
        String str;
        String str2;
        PriceInfo priceInfo = collectionDetailModel.getPriceInfo();
        String str3 = null;
        if (priceInfo != null) {
            str = priceInfo.getPriceInUsd();
        } else {
            str = null;
        }
        c188727au.LJI("collection_price", str);
        if (collectionDetailModel.getHasVoucher()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("is_discounted_flag", str2);
        PriceInfo discountedPriceInfo = collectionDetailModel.getDiscountedPriceInfo();
        if (discountedPriceInfo != null) {
            str3 = discountedPriceInfo.getPriceInUsd();
        }
        c188727au.LJI("discount_price", str3);
    }

    public static void LJ(C188727au c188727au, CollectionDetailModel collectionDetailModel) {
        String str;
        Long l;
        LIZJ(c188727au, collectionDetailModel);
        c188727au.LJ(collectionDetailModel.getCollectionId(), "collection_id");
        c188727au.LJIIIZ("collection_name", collectionDetailModel.getCollectionName());
        PriceInfo priceInfo = collectionDetailModel.getPriceInfo();
        if (priceInfo != null) {
            str = priceInfo.getPriceInUsd();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("collection_price", str);
        c188727au.LIZLLL(collectionDetailModel.getCollectionVideoNum(), "collection_video_cnt");
        c188727au.LIZIZ(collectionDetailModel.getCollectionRating(), "collection_rating");
        c188727au.LJ(collectionDetailModel.getCollectionTotalDuration() * 1000, "collection_duration");
        StringBuilder sb = new StringBuilder();
        List<PaidVideoItem> paidVideoList = collectionDetailModel.getPaidVideoList();
        if (paidVideoList != null) {
            int i = 0;
            for (PaidVideoItem paidVideoItem : paidVideoList) {
                int i2 = i + 1;
                if (i >= 0) {
                    PaidVideoItem paidVideoItem2 = paidVideoItem;
                    if (i > 0) {
                        sb.append(",");
                    }
                    if (paidVideoItem2 != null) {
                        l = Long.valueOf(paidVideoItem2.getPaidVideoId());
                    } else {
                        l = null;
                    }
                    sb.append(String.valueOf(l));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        c188727au.LJI("collection_video_list", sb.toString());
        LIZLLL(c188727au, collectionDetailModel);
        c188727au.LJ(collectionDetailModel.getCollectionRatingNum(), "collection_rating_num");
    }

    public static void LJFF(C188727au c188727au, String str) {
        if (str != null && str.length() > 0) {
            c188727au.LJI("enter_from", str);
        }
    }

    public static void LJI(C188727au c188727au, CollectionDetailModel collectionDetailModel) {
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        List<PaidVideoItem> paidVideoList = collectionDetailModel.getPaidVideoList();
        int i = 0;
        if (!(paidVideoList instanceof Collection) || !paidVideoList.isEmpty()) {
            Iterator<PaidVideoItem> it = paidVideoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PaidVideoItem next = it.next();
                if (next != null && (aweme = next.getAweme()) != null && (paidContentInfo = aweme.mPaidContentInfo) != null && paidContentInfo.getShouldShowPreview()) {
                    i = 1;
                    break;
                }
            }
        }
        c188727au.LIZLLL(i, "has_preview_video");
    }

    public static void LJII(C188727au c188727au, boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_from_anchor", str);
    }

    public static void LJIIIIZZ(C188727au c188727au, boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_success", str);
    }

    public static void LJIIIZ(C188727au c188727au, boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_success_purchase", str);
    }

    public static void LJIIL(int i, String str, String str2, String str3, String to_user_id) {
        o.LJIIIZ(to_user_id, "to_user_id");
        C188727au c188727au = new C188727au();
        c188727au.LJI("enter_from", str2);
        c188727au.LJI("from_user_id", str3);
        c188727au.LJI("to_user_id", to_user_id);
        c188727au.LIZLLL(i, "is_self");
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LJIILIIL(CollectionDetailModel collectionDetailModel, String str, boolean z, String str2, String str3) {
        C188727au c188727au = new C188727au();
        LJ(c188727au, collectionDetailModel);
        LJFF(c188727au, str);
        LJIIIIZZ(c188727au, z);
        c188727au.LJI("text", str2);
        LJIIIIZZ(c188727au, z);
        c188727au.LJI("review_id", str3);
        FMX.LJIIL("submit_series_review_reply", c188727au.LIZ);
    }

    public static void LJIIJ(String str, boolean z, String str2, boolean z2, boolean z3, boolean z4, String str3, String str4, String str5) {
        String str6;
        String str7;
        String str8;
        C188727au LIZ2 = CK3.LIZ("collection_id", str);
        String str9 = "1";
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJI("is_cover", str6);
        LIZ2.LJI("pricing_selection", str2);
        if (z3) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJI("is_name", str7);
        if (z4) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJI("is_description", str8);
        if (!z2) {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJI("is_discount_selected", str9);
        LIZ2.LJI("if_success", str3);
        LIZ2.LJI("error_code", str4);
        LIZ2.LJI("enter_from", str5);
        FMX.LJIIL("click_new_series_next", LIZ2.LIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x019b, code lost:
    
        if (r17.equals("collection_detail_page") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0448, code lost:
    
        if (r4 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x044a, code lost:
    
        LJ(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0451, code lost:
    
        if (r4.getHasPurchasedCollection() == false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0453, code lost:
    
        r0.LJIIIZ("is_paid", r6);
        LIZ(r0, r4);
        LIZLLL(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0460, code lost:
    
        r6 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01bf, code lost:
    
        if (r17.equals("collection_request_refund") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x042e, code lost:
    
        if (r4 == null) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0430, code lost:
    
        LJ(r0, r4);
        LIZ(r0, r4);
        LIZLLL(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0439, code lost:
    
        r0.LJIIIZ("video_id", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c8, code lost:
    
        if (r17.equals("click_rate_this_collection") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x027f, code lost:
    
        if (r17.equals("rate_collection_prompt") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0289, code lost:
    
        if (r17.equals("show_collection_refund_confirmation") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0415, code lost:
    
        if (r2 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0417, code lost:
    
        r0.LJIIIZ("refund_reason", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x041a, code lost:
    
        if (r4 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x041c, code lost:
    
        LJ(r0, r4);
        LIZ(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0293, code lost:
    
        if (r17.equals("collection_in_app_purchase_toast") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x029d, code lost:
    
        if (r17.equals("collection_refund_modal") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02d2, code lost:
    
        if (r17.equals("select_collection_refund_reason") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02dc, code lost:
    
        if (r17.equals("collection_refund_confirmation_submit") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0411, code lost:
    
        if (r17.equals("submit_collection_refund_reason") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x042a, code lost:
    
        if (r17.equals("collection_additional_menu") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0444, code lost:
    
        if (r17.equals("click_share_collection") == false) goto L114;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:112:0x0159. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Boolean r22, java.lang.Boolean r23, java.lang.String r24, java.lang.Integer r25, java.lang.Boolean r26, java.lang.String r27, java.lang.Long r28, java.lang.String r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Integer r33, java.lang.String r34, com.ss.android.ugc.aweme.model.CollectionDetailModel r35, com.ss.android.ugc.aweme.model.PaidCollectionListResponse r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.Integer r41, int r42) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25589A2n.LJIIJJI(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.model.CollectionDetailModel, com.ss.android.ugc.aweme.model.PaidCollectionListResponse, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int):void");
    }
}
