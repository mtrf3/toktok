package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* renamed from: X.OOq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61836OOq {
    public static C61837OOr LIZ;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r4) {
        /*
            r1 = 4
            java.lang.String r0 = "refreshPayment"
            X.C36746EbW.LIZ(r1, r0)
            java.lang.String r0 = "ordersubmit"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto La9
            java.lang.String r2 = "ec_payment_change"
        L10:
            com.ss.android.ugc.aweme.ecommerce.service.IEventCenter r1 = com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter.LJ()
            java.lang.String r0 = "{}"
            r1.LIZ(r2, r0)
        L19:
            java.lang.String r0 = "ecom_finish_bind_web_switch"
            r4 = 1
            boolean r0 = X.C19N.LJ(r0, r4)
            if (r0 == 0) goto L47
            android.app.Activity[] r1 = com.ss.android.ugc.aweme.utils.ActivityStack.getActivityStack()
            java.lang.String r0 = "activities"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Object r2 = X.ORY.LJJJLZIJ(r1)
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity
            if (r0 != 0) goto L3d
            boolean r0 = r2 instanceof com.bytedance.hybrid.spark.page.SparkActivity
            if (r0 != 0) goto L3d
            boolean r0 = r2 instanceof X.AbstractActivityC60177NjZ
            if (r0 == 0) goto L46
        L3d:
            boolean r0 = r2 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L46
        L41:
            if (r2 == 0) goto L46
            r2.finish()
        L46:
            return
        L47:
            android.app.Activity[] r3 = com.ss.android.ugc.aweme.utils.ActivityStack.getActivityStack()
            int r2 = r3.length
            X.Fox r0 = X.C40127Fox.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ecommerce.ab.SparkSwitchConfig r0 = X.C40127Fox.LIZ()
            boolean r0 = r0.enableSparkContainer
            if (r0 == 0) goto L87
            java.lang.Object r0 = X.ORY.LJJJLZIJ(r3)
            boolean r0 = r0 instanceof X.InterfaceC40159FpT
            java.lang.String r1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            if (r0 == 0) goto L75
            java.lang.Object r0 = X.ORY.LJJJLZIJ(r3)
            boolean r0 = r0 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L75
            java.lang.Object r2 = X.ORY.LJJJLZIJ(r3)
            kotlin.jvm.internal.o.LJII(r2, r1)
            android.app.Activity r2 = (android.app.Activity) r2
            goto L41
        L75:
            if (r2 <= r4) goto L46
            int r0 = r2 + (-2)
            r2 = r3[r0]
            boolean r0 = r2 instanceof X.InterfaceC40159FpT
            if (r0 == 0) goto L46
            boolean r0 = r2 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L46
            kotlin.jvm.internal.o.LJII(r2, r1)
            goto L41
        L87:
            java.lang.Object r0 = X.ORY.LJJJLZIJ(r3)
            boolean r0 = r0 instanceof X.AbstractActivityC60177NjZ
            java.lang.String r1 = "null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity"
            if (r0 == 0) goto L9b
            java.lang.Object r2 = X.ORY.LJJJLZIJ(r3)
            kotlin.jvm.internal.o.LJII(r2, r1)
            android.app.Activity r2 = (android.app.Activity) r2
            goto L41
        L9b:
            if (r2 <= r4) goto L46
            int r0 = r2 + (-2)
            r2 = r3[r0]
            boolean r0 = r2 instanceof X.AbstractActivityC60177NjZ
            if (r0 == 0) goto L46
            kotlin.jvm.internal.o.LJII(r2, r1)
            goto L41
        La9:
            java.lang.String r0 = "orderdetail"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto L19
            java.lang.String r2 = "ec_payment_page_refresh_data"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61836OOq.LIZIZ(java.lang.String):void");
    }

    public static void LIZ(Context context, String str, String str2, String url, CommuteType commuteType, String str3) {
        int i;
        o.LJIIIZ(url, "url");
        if (commuteType == null) {
            i = -1;
        } else {
            i = C61839OOt.LIZ[commuteType.ordinal()];
        }
        String str4 = "";
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                return;
            }
            if (ujb.o.LJJJLIIL(url, "http", false) || ujb.o.LJJJLIIL(url, "https", false)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("aweme://webview/?url=");
                LIZ2.append(URLEncoder.encode(url, "ISO-8859-1"));
                url = X1D.LIZIZ(LIZ2);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(url);
            C40127Fox.LIZ.getClass();
            if (C40127Fox.LIZ().enableSparkContainer) {
                str4 = "&use_spark=1";
            }
            LIZ3.append(str4);
            SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ3)).open();
            if (commuteType != CommuteType.WAP_TO_APP) {
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("pay source in PaymentBindHelper ");
            LIZ4.append(str3);
            C36746EbW.LIZ(4, X1D.LIZIZ(LIZ4));
            if (str == null) {
                str = AnonymousClass629.LIZ("randomUUID().toString()");
            }
            C36746EbW.LIZ(4, "pollBindResult");
            ActivityStack.removeAppBackGroundListener(LIZ);
            C61837OOr c61837OOr = new C61837OOr(str3, str);
            LIZ = c61837OOr;
            ActivityStack.addNonWeakAppBackGroundListener(c61837OOr);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!C60004Ngm.LIZIZ(context, str2, url)) {
            return;
        }
        if (str == null) {
            str = AnonymousClass629.LIZ("randomUUID().toString()");
        }
        C36746EbW.LIZ(4, "pollBindResult");
        ActivityStack.removeAppBackGroundListener(LIZ);
        C61837OOr c61837OOr2 = new C61837OOr(str3, str);
        LIZ = c61837OOr2;
        ActivityStack.addNonWeakAppBackGroundListener(c61837OOr2);
    }
}
