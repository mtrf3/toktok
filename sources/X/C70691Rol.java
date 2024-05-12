package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.AqS12S1201000_12;
import kotlin.jvm.internal.AqS13S2000000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.AqS50S1000000_12;
import kotlin.jvm.internal.AqS53S1200000_12;
import kotlin.jvm.internal.AqS5S2201000_12;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.AqS6S2300000_12;
import kotlin.jvm.internal.AqS8S1210000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rol, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70691Rol {
    public static float LJIILL;
    public static int LJIILLIIL;
    public static int LJIIZILJ;
    public static C70690Rok LJIJ;
    public static int LJIJI;
    public static String LJIJJ = "";
    public static int LJIJJLI = 1;
    public final Context LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public String LIZLLL;
    public final java.util.Set<String> LJ;
    public final java.util.Set<String> LJFF;
    public long LJI;
    public final java.util.Set<String> LJII;
    public final java.util.Set<String> LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    public static void LIZIZ(LaneParams laneParams) {
        String str;
        C70690Rok c70690Rok;
        Integer num;
        if (LJIJJLI == 2) {
            laneParams.plusAssign("shop_id", LJIJJ);
            laneParams.plusAssign("page_name", "shop_review");
            laneParams.plusAssign("review_cnt", Integer.valueOf(LJIIZILJ));
            C70690Rok c70690Rok2 = LJIJ;
            String str2 = null;
            if (c70690Rok2 != null) {
                str2 = c70690Rok2.LIZJ;
            }
            if (C78685UuP.LJJJZ(str2) && (c70690Rok = LJIJ) != null && (num = c70690Rok.LIZLLL) != null) {
                if (num.intValue() == 2) {
                    str = "rate";
                } else if (num.intValue() == 1) {
                    str = "keyword";
                } else if (num.intValue() == 3) {
                    str = "impression_tag";
                }
                laneParams.plusAssign("page_info", str);
                laneParams.plusAssign("impression_tag_cnt", Integer.valueOf(LJIJI));
                return;
            }
            str = "all";
            laneParams.plusAssign("page_info", str);
            laneParams.plusAssign("impression_tag_cnt", Integer.valueOf(LJIJI));
            return;
        }
        LIZLLL(laneParams);
    }

    public static void LIZJ(LaneParams laneParams) {
        C70669RoP.LIZ.getClass();
        boolean z = C70669RoP.LIZ().showRating;
        laneParams.put("has_rate", Integer.valueOf(z ? 1 : 0));
        if (z) {
            float f = LJIILL;
            if (f >= 0.0f) {
                laneParams.put("rate", Float.valueOf(f));
            }
        }
    }

    public static void LIZLLL(LaneParams laneParams) {
        laneParams.plusAssign("page_name", "product_review");
        laneParams.plusAssign("review_cnt", Integer.valueOf(LJIILLIIL));
        LIZJ(laneParams);
        laneParams.plusAssign("page_info", C70666RoM.LIZ());
        laneParams.plusAssign("impression_tag_cnt", Integer.valueOf(LJIJI));
    }

    public final void LJIIIZ(ECBaseJediFragment node) {
        o.LJIIIZ(node, "node");
        if (!this.LJIIL) {
            this.LJIIL = true;
            C78946Uyc.LJJII(node, new C70918RsQ(0), new AqS178S0100000_12(this, 609));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r0 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r1 = r8.LIZ
            java.lang.String r4 = "tiktokec_button_click"
            kotlin.jvm.internal.AqS35S1000000_12 r7 = new kotlin.jvm.internal.AqS35S1000000_12
            r0 = 45
            r7.<init>(r9, r0)
            r2 = 0
            if (r1 != 0) goto L23
        Le:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L13:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            X.Axv r6 = new X.Axv
            r6.<init>()
            java.lang.String r3 = ""
            r7.invoke(r6)
            goto L4b
        L23:
            android.app.Activity r1 = X.C27740Aue.LIZ(r1)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.1qj r1 = (X.ActivityC45651qj) r1
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider> r0 = com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider r0 = (com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider) r0
            java.lang.Object r1 = r0.LJLIL
            boolean r0 = r1 instanceof X.C122874rz
            if (r0 != 0) goto L49
        L40:
            X.4rz r2 = (X.C122874rz) r2
            if (r2 == 0) goto Le
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.LJLIL
            if (r0 != 0) goto L13
            goto Le
        L49:
            r2 = r1
            goto L40
        L4b:
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> L9f
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L9f
        L53:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L71
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L9f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L9f
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Exception -> L9f
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L9f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L9f
            r5.put(r1, r0)     // Catch: java.lang.Exception -> L9f
            goto L53
        L71:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.LIZ     // Catch: java.lang.Exception -> L9f
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L9f
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> L9f
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L9f
        L7d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L9f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L9f
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Exception -> L9f
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L9f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L9f
            r5.put(r1, r0)     // Catch: java.lang.Exception -> L9f
            goto L7d
        L9b:
            X.C48658J7u.LIZIZ(r4, r5)     // Catch: java.lang.Exception -> L9f
            goto Lb3
        L9f:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "ECLoggerUtils, sendLog1: fail send event tiktokec_button_click, key = "
            r1.<init>(r0)
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            X.C78983UzD.LJIJ(r2, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70691Rol.LJIIJ(java.lang.String):void");
    }

    public final void LJIIJJI(ECBaseJediFragment node) {
        o.LJIIIZ(node, "node");
        String str = (String) C1A8.LJIIZILJ(node, "buy_now_btn_status");
        if (!this.LJIILIIL) {
            this.LJIILIIL = true;
            C78946Uyc.LJJII(node, new C70918RsQ(0), new AqS65S1100000_12(this, str, 10));
        }
    }

    public final void LJIIL(InterfaceC71003Rtn node) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70917RsP(), new AqS178S0100000_12(this, 611));
    }

    public final void LJIILJJIL(ECBaseJediFragment eCBaseJediFragment) {
        if (!this.LJIIJ) {
            this.LJIIJ = true;
            C78946Uyc.LJJII(eCBaseJediFragment, new C70926RsY(0), new AqS178S0100000_12(this, 612));
        }
    }

    public final void LJIILL(ECBaseJediFragment eCBaseJediFragment) {
        if (!this.LJIIIZ) {
            this.LJIIIZ = true;
            C78946Uyc.LJJII(eCBaseJediFragment, new C70922RsU(), new AqS178S0100000_12(this, 615));
        }
    }

    public final void LJIJI(ECBaseJediFragment node) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70918RsQ(0), new AqS178S0100000_12(this, 617));
    }

    public final void LJIJJ(InterfaceC71003Rtn node) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70917RsP(), new AqS178S0100000_12(this, 630));
    }

    public final void LJJII(InterfaceC71003Rtn node) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70917RsP(), new AqS178S0100000_12(this, 631));
    }

    public final void LJJIII(ECBaseJediFragment eCBaseJediFragment) {
        if (!this.LJIIJJI) {
            this.LJIIJJI = true;
            C78946Uyc.LJJII(eCBaseJediFragment, new C70918RsQ(0), new AqS178S0100000_12(this, 627));
        }
    }

    public final void LJJIIJ(InterfaceC71003Rtn node) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70964RtA(), new AqS178S0100000_12(this, 632));
    }

    public final void LJJIIJZLJL(ECBaseJediFragment eCBaseJediFragment) {
        C78946Uyc.LJJII(eCBaseJediFragment, new C70941Rsn(), new AqS178S0100000_12(this, 628));
    }

    public final void LJJIJIL(InterfaceC71003Rtn node) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70921RsT(), new AqS65S1100000_12(this, this.LIZLLL, 17));
        this.LIZLLL = "return";
    }

    public final void LJJIJL(ECBaseJediFragment node) {
        o.LJIIIZ(node, "node");
        if (!this.LJIILJJIL) {
            this.LJIILJJIL = true;
            C78946Uyc.LJJII(node, new C70941Rsn(), new AqS178S0100000_12(this, 607));
        }
    }

    public static void LIZ(LaneParams laneParams, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    laneParams.put("filter_type", "all");
                    return;
                }
                laneParams.put("filter_type", "impression_tag");
                return;
            }
            laneParams.put("filter_type", "rate");
            return;
        }
        laneParams.put("filter_type", "keyword");
    }

    public static void LJIIZILJ(View view, String str) {
        C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS35S1000000_12(str, 46));
    }

    public static void LJIJ(View view, String str) {
        C78946Uyc.LJJIIJ(view, new C70920RsS(), new AqS35S1000000_12(str, 47));
    }

    public final void LJIIIIZZ(InterfaceC71003Rtn node, String str) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70917RsP(), new AqS65S1100000_12(this, str, 16));
    }

    public final void LJIILIIL(InterfaceC71003Rtn node, int i) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70934Rsg(), new AqS99S0101000_12(this, i, 22));
    }

    public final void LJJIJIIJIL(InterfaceC71003Rtn node, int i) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70918RsQ(0), new AqS99S0101000_12(this, i, 23));
    }

    public final void LJJIZ(InterfaceC71003Rtn node, boolean z) {
        o.LJIIIZ(node, "node");
        if (ActivityStack.isAppBackGround()) {
            this.LIZLLL = "close";
        }
        if (!z) {
            LJJIJIL(node);
        }
    }

    public C70691Rol(Context context, int i, String productId) {
        o.LJIIIZ(productId, "productId");
        this.LIZ = context;
        this.LIZIZ = productId;
        this.LIZJ = i;
        this.LIZLLL = "return";
        this.LJ = new LinkedHashSet();
        this.LJFF = new LinkedHashSet();
        this.LJI = SystemClock.elapsedRealtime();
        this.LJII = new LinkedHashSet();
        this.LJIIIIZZ = new LinkedHashSet();
    }

    public static void LJFF(ECBaseJediFragment node, String str, String str2) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70960Rt6(), new AqS13S2000000_12(str, str2, 2));
    }

    public final void LJJIIZ(View view, String str, Float f) {
        o.LJIIIZ(view, "view");
        C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS53S1200000_12(str, f, this, 19));
    }

    public final void LJJIIZI(View view, String str, Float f) {
        C78946Uyc.LJJIIJ(view, new C70920RsS(), new AqS53S1200000_12(str, f, this, 20));
    }

    public static void LJ(LaneParams laneParams, ReviewItemStruct reviewItemStruct, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        long j;
        ReviewItemStruct.MainReview mainReview;
        String str5;
        Long LJJIZ;
        ReviewItemStruct.MainReview mainReview2;
        ReviewItemStruct.MainReview mainReview3;
        laneParams.plusAssign("video_id", str);
        Integer num = null;
        if (reviewItemStruct != null && (mainReview3 = reviewItemStruct.review) != null) {
            str2 = mainReview3.rating;
        } else {
            str2 = null;
        }
        laneParams.plusAssign("rate", str2);
        if (reviewItemStruct != null && (mainReview2 = reviewItemStruct.review) != null) {
            str3 = mainReview2.reviewId;
        } else {
            str3 = null;
        }
        laneParams.plusAssign("review_id", str3);
        if (reviewItemStruct == null || (str4 = reviewItemStruct.skuId) == null) {
            str4 = "";
        }
        laneParams.plusAssign("sku_id", str4);
        if (reviewItemStruct != null) {
            num = reviewItemStruct.diggCount;
        }
        laneParams.plusAssign("like_cnt", num);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        if (reviewItemStruct != null && (mainReview = reviewItemStruct.review) != null && (str5 = mainReview.reviewTimeStamp) != null && (LJJIZ = C38350F3i.LJJIZ(str5)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        calendar.setTimeInMillis(j);
        laneParams.plusAssign("post_date", simpleDateFormat.format(calendar.getTime()));
        laneParams.plusAssign("is_self", Integer.valueOf(z ? 1 : 0));
    }

    public final void LJJIFFI(int i, View view, ReviewItemStruct reviewItemStruct, String str) {
        String str2;
        String str3;
        o.LJIIIZ(reviewItemStruct, "reviewItemStruct");
        java.util.Set<String> set = this.LJ;
        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
        if (mainReview != null) {
            str2 = mainReview.reviewId;
        } else {
            str2 = null;
        }
        if (!ORZ.LJLJJI(str2, set)) {
            ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
            if (mainReview2 != null && (str3 = mainReview2.reviewId) != null) {
                this.LJ.add(str3);
            }
            C78946Uyc.LJJIIJZLJL(view, new C70933Rsf(), new AqS162S0100000_12(reviewItemStruct, 1175), new AqS12S1201000_12(i, this, reviewItemStruct, str, 3));
        }
    }

    public final void LJJIJLIJ(View view, ReviewItemStruct reviewItemStruct, String str, boolean z) {
        C78946Uyc.LJJIIJ(view, new C70970RtG(), new AqS8S1210000_12(this, reviewItemStruct, str, z, 0));
    }

    public final void LJJIL(View view, ReviewItemStruct struct, String str, boolean z) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(struct, "struct");
        if (!this.LJIIIIZZ.contains(str)) {
            C78946Uyc.LJJIIJZLJL(view, new C70971RtH(), new AqS50S1000000_12(str, 7), new AqS8S1210000_12(this, struct, str, z, 1));
            this.LJIIIIZZ.add(str);
        }
    }

    public static void LJI(C70691Rol c70691Rol, ReviewFragment node, String str, String str2, String str3) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70968RtE(), new C70693Ron(str, str2, str3, null));
    }

    public static void LJII(ECBaseJediFragment node, String str, String quitType, long j, String str2) {
        o.LJIIIZ(node, "node");
        o.LJIIIZ(quitType, "quitType");
        C78946Uyc.LJJII(node, new C70935Rsh(0), new C70692Rom(str, quitType, j, str2));
    }

    public final void LJJ(int i, View view, ReviewItemStruct reviewItemStruct, String str, String str2) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(reviewItemStruct, "reviewItemStruct");
        C78946Uyc.LJJIIJ(view, new C70953Rsz(), new AqS65S1100000_12(reviewItemStruct, str2, 12));
        if (!o.LJ(str2, "cancel")) {
            C78946Uyc.LJJIIJ(view, new C70951Rsx(), new AqS12S1201000_12(i, this, reviewItemStruct, str, 2));
        }
    }

    public final void LJJI(int i, View view, ReviewItemStruct reviewItemStruct, String str, String str2) {
        String str3;
        o.LJIIIZ(reviewItemStruct, "reviewItemStruct");
        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
        if (mainReview != null && (str3 = mainReview.reviewId) != null) {
            this.LJ.add(str3);
        }
        C78946Uyc.LJJIIJ(view, new C70937Rsj(), new AqS5S2201000_12(str, i, str2, reviewItemStruct, this, 1));
    }

    public static void LJIILLIIL(C70691Rol c70691Rol, ECBaseJediFragment node, Integer num, ReviewFilterStruct reviewFilterStruct, String str, String str2, int i) {
        Integer num2 = num;
        String str3 = str;
        String str4 = null;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) == 0) {
            str4 = str2;
        }
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70939Rsl(), new AqS6S2300000_12(c70691Rol, reviewFilterStruct, num2, str4, str3, 3));
    }

    public final void LJIJJLI(View view, String str, String str2, int i, boolean z, String str3, String str4) {
        C78946Uyc.LJJIIJ(view, new C70959Rt5(), new C70668RoO(str2, i, this, str3, str, z, str4));
    }

    public final void LJIL(View view, ReviewItemStruct.MainReview mainReview, String str, String str2, int i, boolean z, String str3) {
        o.LJIIIZ(view, "view");
        if (!this.LJII.contains(str)) {
            C78946Uyc.LJJIIJZLJL(view, new C70940Rsm(), new AqS50S1000000_12(str, 6), new C70667RoN(str, i, mainReview, str2, z, str3, this));
            this.LJII.add(str);
        }
    }

    public final void LJJIJ(InterfaceC71003Rtn node, boolean z, long j, String str, Integer num, Integer num2, Integer num3, C70354RjK c70354RjK, C70357RjN c70357RjN, String str2, Integer num4, HeaderBannerDaInfo headerBannerDaInfo) {
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70925RsX(), new C70353RjJ(this, z, str, num, num2, j, num3, c70354RjK, c70357RjN, num4, str2, headerBannerDaInfo));
    }
}
