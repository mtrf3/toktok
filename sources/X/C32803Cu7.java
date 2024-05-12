package X;

import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cu7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32803Cu7 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("gift_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("msg_id", null);
        }
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_gift", hashMap);
    }

    public static final void LIZJ(EnumC35444Dvc identity) {
        String str;
        o.LJIIIZ(identity, "identity");
        if (identity == EnumC35444Dvc.ANCHOR) {
            str = "host_unable_receive";
        } else {
            str = "guest_unable_receive";
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_unable_gift_toast");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(str, "reason");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LIZIZ(int i, long j, int i2, String str, boolean z, boolean z2, String str2, int i3, String giftPageName, String orderId, String str3, String str4, boolean z3, int i4, long j2, boolean z4, Long l, String str5, Integer num, long j3, int i5, String str6, String str7, List<Long> list, C32818CuM c32818CuM, boolean z5, String str8, int i6, Long l2, Long l3, String str9, C76854UEg c76854UEg) {
        long j4;
        o.LJIIIZ(giftPageName, "giftPageName");
        o.LJIIIZ(orderId, "orderId");
        C32785Ctp.LJIILIIL.getClass();
        java.util.Map LIZJ = C32785Ctp.LIZJ();
        if (l3 != null) {
            j4 = l3.longValue();
        } else {
            j4 = 0;
        }
        C32786Ctq c32786Ctq = new C32786Ctq(i, j, z, str, str2, i3, giftPageName, str3, str4, z3, i4, j2, z4, l, str5, num, j3, LIZJ, i5, str6, str7, list, c32818CuM, z5, str8, i6, l2, str9, c76854UEg);
        boolean z6 = C32850Cus.LJIIIIZZ;
        if (!z6 || j != C32850Cus.LJII) {
            if (z6) {
                C32850Cus.LJFF.removeCallbacks(C32850Cus.LJIIIZ);
                C32850Cus.LIZIZ();
            }
            C32850Cus.LIZ = c32786Ctq;
            C32850Cus.LJI = 1;
            C32850Cus.LJIIIIZZ = true;
            C32850Cus.LJFF.postDelayed(C32850Cus.LJIIIZ, 3000L);
            C32850Cus.LJ = 0;
            C32850Cus.LIZLLL = 1L;
            if (j != C32850Cus.LJII) {
                C32850Cus.LJII = j;
            }
            C32850Cus.LIZIZ = z2;
            C32850Cus.LIZJ = orderId;
            return;
        }
        C32850Cus.LJI += i2;
        StringBuilder LIZ2 = X1D.LIZ();
        C32850Cus.LIZJ = C0MT.LIZ(LIZ2, C32850Cus.LIZJ, ',', orderId, LIZ2);
        if (j4 > 1) {
            C32850Cus.LIZLLL = j4;
            C32850Cus.LJ++;
        }
        Handler handler = C32850Cus.LJFF;
        RunnableC35342Dty runnableC35342Dty = C32850Cus.LJIIIZ;
        handler.removeCallbacks(runnableC35342Dty);
        handler.postDelayed(runnableC35342Dty, 3000L);
    }
}
