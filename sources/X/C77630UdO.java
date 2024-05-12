package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.UdO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77630UdO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ() {
        if (C77640UdY.LIZ) {
            C77640UdY.LJIIIZ = C30725C4b.LIZ();
            LJIIIIZZ(null, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77630UdO.LJFF():void");
    }

    public static void LIZIZ(String str) {
        String str2;
        if (C77659Udr.LIZ) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_create_order_loading_complete");
            LIZ2.LJIJJ(C77659Udr.LIZJ, "request_page");
            LIZ2.LJIJJ(Integer.valueOf(C77659Udr.LIZIZ ? 1 : 0), "is_first_recharge");
            LIZ2.LJIJJ(C77659Udr.LIZLLL, "pay_method");
            LIZ2.LJIJJ(C77659Udr.LJ, "charge_reason");
            if (str == null) {
                str2 = "success";
            } else {
                str2 = "failed";
            }
            LIZ2.LJIJJ(str2, "status");
            if (str == null) {
                str = "";
            }
            LIZ2.LJIJJ(str, "error_code");
            C28289B8j.LIZJ(C30725C4b.LIZ(), C77659Udr.LJFF, LIZ2, "recharge_create_order_duration");
            C77659Udr.LIZ = false;
            C77659Udr.LIZJ = "";
            C77659Udr.LIZLLL = "";
            C77659Udr.LJ = "";
            C77659Udr.LJFF = 0L;
        }
    }

    public static void LIZLLL(C77648Udg c77648Udg) {
        Object obj;
        Object obj2;
        Object obj3;
        long LIZ2 = C30725C4b.LIZ();
        BZI LIZ3 = C28787BRn.LIZ("livesdk_recharge_preload_sdk_loading_complete");
        LIZ3.LJIJJ(C77608Ud2.LIZ(), "pay_method");
        String str = "success";
        if (c77648Udg.LIZJ) {
            obj = "success";
        } else {
            obj = "failed";
        }
        LIZ3.LJIJJ(obj, "status");
        if (c77648Udg.LIZ) {
            obj2 = "success";
        } else {
            obj2 = "failed";
        }
        LIZ3.LJIJJ(obj2, "skproduct_process1_status");
        if (c77648Udg.LIZIZ) {
            obj3 = "success";
        } else {
            obj3 = "failed";
        }
        LIZ3.LJIJJ(obj3, "diamond_status");
        if (!c77648Udg.LIZJ) {
            str = "failed";
        }
        LIZ3.LJIJJ(str, "skproduct_process2_status");
        I9A.LIZ(LIZ2, c77648Udg.LIZLLL, LIZ3, "duration");
        I9A.LIZ(c77648Udg.LJFF, c77648Udg.LIZLLL, LIZ3, "skproduct_process1_loading_duration");
        I9A.LIZ(c77648Udg.LJI, c77648Udg.LJFF, LIZ3, "diamond_loading_duration");
        I9A.LIZ(c77648Udg.LJII, c77648Udg.LJI, LIZ3, "skproduct_process2_loading_duration");
        LIZ3.LJIJJ(c77648Udg.LJ, "request_page");
        LIZ3.LJJIIJZLJL();
    }

    public static void LJII(Throwable th) {
        if (th == null) {
            C77629UdN.LIZLLL = C30725C4b.LIZ();
        } else if (th instanceof C77623UdH) {
            C77623UdH c77623UdH = (C77623UdH) th;
            String valueOf = String.valueOf(c77623UdH.getErrorCode());
            o.LJIIIZ(valueOf, "<set-?>");
            C77629UdN.LJIIIZ = valueOf;
            String valueOf2 = String.valueOf(c77623UdH.getDetailCode());
            o.LJIIIZ(valueOf2, "<set-?>");
            C77629UdN.LJIIJ = valueOf2;
            C77629UdN.LJIIJJI = String.valueOf(c77623UdH.getMessage());
            String valueOf3 = String.valueOf(c77623UdH.getErrorCode());
            o.LJIIIZ(valueOf3, "<set-?>");
            C77629UdN.LJIILIIL = valueOf3;
        }
        if (C77629UdN.LJ != 0) {
            LJFF();
        }
    }

    public static void LJ(long j, boolean z) {
        String str;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_preload_wallet_loading_complete");
        LIZ2.LJIJJ(C77608Ud2.LIZ(), "pay_method");
        LIZ2.LJIJJ("live_room", "request_page");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        LIZ2.LJIJJ(str, "wallet_info_status");
        LIZ2.LJIJJ(Long.valueOf(j), "wallet_info_loading_duration");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJI(long j, Throwable th) {
        if (!C77629UdN.LIZ) {
            return;
        }
        if (th == null) {
            C77629UdN.LJ = j;
        } else if (th instanceof C77623UdH) {
            C77623UdH c77623UdH = (C77623UdH) th;
            String valueOf = String.valueOf(c77623UdH.getErrorCode());
            o.LJIIIZ(valueOf, "<set-?>");
            C77629UdN.LJIIIZ = valueOf;
            String valueOf2 = String.valueOf(c77623UdH.getDetailCode());
            o.LJIIIZ(valueOf2, "<set-?>");
            C77629UdN.LJIIJ = valueOf2;
            C77629UdN.LJIIJJI = String.valueOf(c77623UdH.getMessage());
            String valueOf3 = String.valueOf(c77623UdH.getErrorCode());
            o.LJIIIZ(valueOf3, "<set-?>");
            C77629UdN.LJIILJJIL = valueOf3;
        }
        if (C77629UdN.LIZLLL != 0) {
            LJFF();
        }
    }

    public static void LIZ(String requestPage, String chargeReason, boolean z) {
        o.LJIIIZ(requestPage, "requestPage");
        o.LJIIIZ(chargeReason, "chargeReason");
        C77659Udr.LIZ = true;
        C77659Udr.LIZJ = requestPage;
        C77659Udr.LIZLLL = C77608Ud2.LIZ();
        C77659Udr.LJ = chargeReason;
        C77659Udr.LJFF = C30725C4b.LIZ();
        C77659Udr.LIZIZ = z;
    }

    public static void LJIIIIZZ(String str, String str2, String str3) {
        Object obj;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_payment_result_result_return");
        LIZ2.LJIJJ(C77640UdY.LIZIZ, "request_page");
        LIZ2.LJIJJ(Integer.valueOf(C77640UdY.LIZJ ? 1 : 0), "is_first_recharge");
        LIZ2.LJIJJ(C77640UdY.LIZLLL, "pay_method");
        LIZ2.LJIJJ(C77640UdY.LJ, "charge_reason");
        String str4 = "success";
        if (str == null) {
            obj = "success";
        } else {
            obj = "failed";
        }
        LIZ2.LJIJJ(obj, "payment_result_load_status");
        LIZ2.LJIJJ(Integer.valueOf(C77640UdY.LJFF ? 1 : 0), "is_supplement");
        if (str == null) {
            str = "";
        }
        LIZ2.LJIJJ(str, "payment_result_load_error_code");
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.LJIJJ(str2, "payment_result_load_detail_error_code");
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.LJIJJ(str3, "payment_result_load_error_message");
        long j = C77640UdY.LJIIIZ;
        long j2 = 0;
        if (j != 0) {
            j2 = j - C77640UdY.LJI;
        }
        LIZ2.LJIJJ(Long.valueOf(j2), "payment_result_return_duration");
        LIZ2.LJIJJ(Long.valueOf(C77640UdY.LJIIIIZZ), "query_order_duration");
        if (o.LJ(C77640UdY.LJII.get("upload_receipt_duration"), CardStruct.IStatusCode.DEFAULT)) {
            str4 = "failed";
        }
        LIZ2.LJIJJ(str4, "upload_receipt_status");
        LIZ2.LJJIFFI(C77640UdY.LJII);
        LIZ2.LJJIIJZLJL();
        C77640UdY.LIZ();
    }
}
