package X;

import Y.ACListenerS21S0100000_1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidContentReview;
import com.ss.android.ugc.aweme.model.PaidContentReviewSection;
import com.ss.android.ugc.aweme.paidcontent.fragments.RatingFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS14S2100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A4S {
    public static final XLM LIZ;
    public static final C79863Bm LIZIZ;

    static {
        XLM LIZ2 = V8H.LIZ(C61878OQg.INSTANCE);
        LIZ = LIZ2;
        LIZIZ = V1M.LIZLLL(LIZ2);
    }

    public static String LIZIZ() {
        String valueOf;
        loop0: while (true) {
            valueOf = String.valueOf(V0Q.Default.nextLong(0L, Long.MAX_VALUE));
            Iterable iterable = (Iterable) LIZ.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (o.LJ(((A4Y) it.next()).getId(), valueOf)) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return valueOf;
    }

    public static void LIZ(A4Y a4y) {
        XLM xlm = LIZ;
        Iterable iterable = (Iterable) xlm.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!o.LJ(((A4Y) obj).getId(), a4y.getId())) {
                arrayList.add(obj);
            }
        }
        xlm.setValue(ORZ.LLIIJI(a4y, arrayList));
    }

    public static float LIZJ(A4T a4t) {
        long j;
        int i;
        Object obj;
        A4Y a4y;
        Integer valueOf;
        o.LJIIIZ(a4t, "<this>");
        List list = (List) LIZIZ.getValue();
        A4Y LIZLLL = LIZLLL(a4t.getCollectionId());
        long j2 = 0;
        if (LIZLLL != null) {
            j = LIZLLL.getNumStars();
        } else {
            j = 0;
        }
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (it.hasNext()) {
                obj = it.next();
                A4Y a4y2 = (A4Y) obj;
                if (a4y2.getTempOverrideState() == EnumC25632A4e.EDIT) {
                    Long collectionId = a4y2.getCollectionId();
                    long collectionId2 = a4t.getCollectionId();
                    if (collectionId != null && collectionId.longValue() == collectionId2) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        A4Y a4y3 = (A4Y) obj;
        if (a4y3 != null) {
            Iterator<A4Y> it2 = a4t.getList().iterator();
            while (true) {
                if (it2.hasNext()) {
                    a4y = it2.next();
                    if (o.LJ(a4y3.getId(), a4y.getId())) {
                        break;
                    }
                } else {
                    a4y = null;
                    break;
                }
            }
            A4Y a4y4 = a4y;
            if (a4y4 != null && (valueOf = Integer.valueOf(a4y4.getNumStars())) != null) {
                j2 = a4y3.getNumStars() - valueOf.intValue();
            }
        }
        double averageReviewPoint = (a4t.getAverageReviewPoint() * a4t.getTotalReviews()) + j2 + j;
        long totalReviews = a4t.getTotalReviews();
        if (LIZLLL != null) {
            i = 1;
        }
        long j3 = totalReviews + i;
        if (j3 < 1) {
            j3 = 1;
        }
        return (float) (averageReviewPoint / ((float) j3));
    }

    public static A4Y LIZLLL(long j) {
        Object obj;
        Long collectionId;
        Iterator it = ((Iterable) LIZIZ.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                A4Y a4y = (A4Y) obj;
                if (a4y.getTempOverrideState() == EnumC25632A4e.CREATION && (collectionId = a4y.getCollectionId()) != null && collectionId.longValue() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (A4Y) obj;
    }

    public static A4T LJ(CollectionDetailModel collectionDetailModel) {
        List<PaidContentReview> reviews;
        o.LJIIIZ(collectionDetailModel, "<this>");
        long collectionId = collectionDetailModel.getCollectionId();
        ArrayList arrayList = new ArrayList();
        PaidContentReviewSection paidContentReviewSection = collectionDetailModel.getPaidContentReviewSection();
        if (paidContentReviewSection != null && (reviews = paidContentReviewSection.getReviews()) != null) {
            Iterator<PaidContentReview> it = reviews.iterator();
            while (it.hasNext()) {
                arrayList.addAll(LJIIJ(it.next(), collectionDetailModel.getCollectionId()));
            }
        }
        return new A4T(collectionId, ORZ.LLJI(arrayList), collectionDetailModel.getCollectionRating(), collectionDetailModel.getCollectionRatingNum(), collectionDetailModel.getCanReviewCollection());
    }

    public static long LJFF(A4T a4t) {
        int i;
        o.LJIIIZ(a4t, "<this>");
        A4Y LIZLLL = LIZLLL(a4t.getCollectionId());
        long totalReviews = a4t.getTotalReviews();
        if (LIZLLL != null) {
            i = 1;
        } else {
            i = 0;
        }
        return totalReviews + i;
    }

    public static void LJIIIIZZ(long j) {
        XLM xlm = LIZ;
        Iterable iterable = (Iterable) xlm.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            Long collectionId = ((A4Y) obj).getCollectionId();
            if (collectionId == null || collectionId.longValue() != j) {
                arrayList.add(obj);
            }
        }
        xlm.setValue(arrayList);
    }

    public static void LJIIIZ(A4Y item) {
        o.LJIIIZ(item, "item");
        XLM xlm = LIZ;
        Iterable iterable = (Iterable) xlm.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!o.LJ(obj, item)) {
                arrayList.add(obj);
            }
        }
        xlm.setValue(arrayList);
    }

    public static List LJIIJ(PaidContentReview paidContentReview, long j) {
        String str;
        String str2;
        String str3;
        boolean z;
        PaidContentReview reply;
        String str4;
        String str5;
        UrlModel avatarThumb;
        List<String> urlList;
        UrlModel avatarThumb2;
        List<String> urlList2;
        o.LJIIIZ(paidContentReview, "<this>");
        ArrayList arrayList = new ArrayList();
        String id = paidContentReview.getId();
        User user = paidContentReview.getUser();
        String str6 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        Long valueOf = Long.valueOf(j);
        User user2 = paidContentReview.getUser();
        if (user2 != null) {
            str2 = user2.getNickname();
        } else {
            str2 = null;
        }
        User user3 = paidContentReview.getUser();
        if (user3 != null && (avatarThumb2 = user3.getAvatarThumb()) != null && (urlList2 = avatarThumb2.getUrlList()) != null) {
            str3 = (String) ORZ.LJLLLL(urlList2);
        } else {
            str3 = null;
        }
        int rating = (int) paidContentReview.getRating();
        String text = paidContentReview.getText();
        long createTime = paidContentReview.getCreateTime();
        boolean canReply = paidContentReview.getCanReply();
        boolean canEdit = paidContentReview.getCanEdit();
        User user4 = paidContentReview.getUser();
        boolean z2 = true;
        if (user4 != null) {
            if (user4.getVerificationBadgeType() > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        arrayList.add(new A4Y(id, str, valueOf, str2, str3, rating, text, createTime, canReply, null, false, canEdit, z, null, false, 24576, null));
        if (paidContentReview.getReply() != null && (reply = paidContentReview.getReply()) != null) {
            String id2 = reply.getId();
            User user5 = reply.getUser();
            if (user5 != null) {
                str4 = user5.getUid();
            } else {
                str4 = null;
            }
            Long valueOf2 = Long.valueOf(j);
            User user6 = reply.getUser();
            if (user6 != null) {
                str5 = user6.getNickname();
            } else {
                str5 = null;
            }
            User user7 = reply.getUser();
            if (user7 != null && (avatarThumb = user7.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null) {
                str6 = (String) ORZ.LJLLLL(urlList);
            }
            int rating2 = (int) reply.getRating();
            String text2 = reply.getText();
            long createTime2 = reply.getCreateTime();
            boolean canReply2 = reply.getCanReply();
            String replyRefId = reply.getReplyRefId();
            boolean canEdit2 = reply.getCanEdit();
            User user8 = reply.getUser();
            if (user8 != null) {
                if (user8.getVerificationBadgeType() <= 0) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            arrayList.add(new A4Y(id2, str4, valueOf2, str5, str6, rating2, text2, createTime2, canReply2, replyRefId, true, canEdit2, z2, null, false, 24576, null));
        }
        return arrayList;
    }

    public static void LJII(ActivityC45651qj activityC45651qj, String str, String str2) {
        if (!C025908h.LJFF(false, str2)) {
            C245319jz c245319jz = new C245319jz();
            C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.qqc);
            LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS14S2100000_4(activityC45651qj, str, str2, 0), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            c245319jz.LIZIZ(LIZIZ2);
            c245319jz.LIZLLL(R.string.qqd);
            TuxActionSheet LIZJ = c245319jz.LIZJ();
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            LIZJ.show(supportFragmentManager, "ReportReview");
        }
    }

    public static void LJI(FragmentManager fragmentManager, int i, String str, String str2, long j, CollectionDetailModel collectionDetailModel, String str3, String str4, int i2) {
        String str5 = str3;
        int i3 = i;
        if ((i2 & 2) != 0) {
            i3 = 0;
        }
        String str6 = null;
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 256) == 0) {
            str6 = str4;
        }
        if (A4U.LIZ()) {
            Iterable<A4Y> iterable = (Iterable) LIZIZ.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (A4Y a4y : iterable) {
                    Long collectionId = a4y.getCollectionId();
                    if (collectionId != null && collectionId.longValue() == j && a4y.getTempOverrideState() == EnumC25632A4e.CREATION) {
                        return;
                    }
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", str);
        bundle.putInt("initial_star_rating", i3);
        bundle.putString("review_id", str5);
        bundle.putInt("num_stars", 0);
        bundle.putString("text", str6);
        RatingFragment ratingFragment = new RatingFragment(j, collectionDetailModel);
        ratingFragment.setArguments(bundle);
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = ratingFragment;
        tuxSheet.LJLLJ = true;
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        if (fragmentManager != null) {
            tuxSheet2.show(fragmentManager, "RatingFragment");
        }
        if (collectionDetailModel != null) {
            C25589A2n.LJIIJJI("click_rate_this_collection", str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, str2, null, 49807356);
            C25589A2n.LJIIJJI("rate_collection_prompt", str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, str2, null, 49807356);
        }
        if (o.LJ(str2, "header_rate_cta") && collectionDetailModel != null) {
            C25589A2n.LJIIJJI("click_collection_rate_this_series", str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, null, null, 66584572);
        }
    }
}
