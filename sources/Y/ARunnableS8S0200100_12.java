package Y;

import X.C71376Rzo;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommercebase.view.coupon.FlashSaleModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS8S0200100_12 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r8 = r0.l0
            X.Ro2 r8 = (X.C70646Ro2) r8
            java.lang.Object r13 = r0.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale r13 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale) r13
            long r2 = r0.j2
            android.os.Handler r1 = r8.LJFF
            Y.ARunnableS48S0100000_12 r0 = r8.LJIIJJI
            java.lang.String r17 = "countDownAction"
            r16 = 0
            if (r0 == 0) goto La6
            r1.removeCallbacks(r0)
            r0 = 0
            r8.LJIIJ = r0
            java.lang.String r0 = r13.startTime
            if (r0 == 0) goto L30
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = r13.endTime
            if (r0 == 0) goto L30
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 != 0) goto L31
        L30:
            return
        L31:
            r8.LJII = r2
            java.lang.String r0 = r13.startTime
            long r14 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r0
            long r14 = r14 * r6
            java.lang.String r0 = r13.endTime
            long r11 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            long r11 = r11 * r6
            java.lang.String r0 = r13.countdown
            r4 = 0
            if (r0 == 0) goto L9b
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L9b
            long r9 = r0.longValue()
        L54:
            long r9 = r9 * r6
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.LIZJ = r0
            java.lang.Integer r7 = r13.status
            r6 = 2
            if (r7 != 0) goto L7a
        L60:
            r4 = r9
        L61:
            long r0 = r8.LIZJ
            long r4 = r4 + r0
            r8.LIZLLL = r4
            long r0 = r0 + r9
            r8.LJ = r0
            Y.ARunnableS48S0100000_12 r0 = r8.LJIIJJI
            if (r0 == 0) goto La2
            r0.run()
            android.os.Handler r1 = r8.LJFF
            Y.ARunnableS48S0100000_12 r0 = r8.LJIIJJI
            if (r0 == 0) goto L9e
            r1.postDelayed(r0, r2)
            goto L30
        L7a:
            int r1 = r7.intValue()
            r0 = 1
            if (r1 != r0) goto L90
            r8.LJIIIIZZ = r0
            r8.LJIIIZ = r0
            long r11 = r11 + r9
            long r11 = r11 - r14
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 != 0) goto L8d
            r8.LJIIIIZZ = r6
        L8d:
            r4 = r9
            r9 = r11
            goto L61
        L90:
            int r0 = r7.intValue()
            if (r0 != r6) goto L60
            r8.LJIIIIZZ = r6
            r8.LJIIIZ = r6
            goto L61
        L9b:
            r9 = 0
            goto L54
        L9e:
            kotlin.jvm.internal.o.LJIJI(r17)
            throw r16
        La2:
            kotlin.jvm.internal.o.LJIJI(r17)
            throw r16
        La6:
            kotlin.jvm.internal.o.LJIJI(r17)
            throw r16
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S0200100_12.LIZ$0():void");
    }

    public final void LIZ$1() {
        long j;
        C71376Rzo c71376Rzo = (C71376Rzo) this.l0;
        FlashSaleModel flashSaleModel = (FlashSaleModel) this.l1;
        long j2 = this.j2;
        Handler handler = c71376Rzo.LJ;
        ARunnableS48S0100000_12 aRunnableS48S0100000_12 = c71376Rzo.LJIIIZ;
        if (aRunnableS48S0100000_12 != null) {
            handler.removeCallbacks(aRunnableS48S0100000_12);
            c71376Rzo.LJI = j2;
            try {
                String str = flashSaleModel.countdown;
                long j3 = 0;
                if (str != null) {
                    j = CastLongProtector.parseLong(str);
                } else {
                    j = 0;
                }
                long j4 = j * 1000;
                if (j4 >= 0) {
                    j3 = j4;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c71376Rzo.LIZIZ = elapsedRealtime;
                c71376Rzo.LIZJ = elapsedRealtime;
                c71376Rzo.LIZLLL = elapsedRealtime + j3;
                Handler handler2 = c71376Rzo.LJ;
                ARunnableS48S0100000_12 aRunnableS48S0100000_122 = c71376Rzo.LJIIIZ;
                if (aRunnableS48S0100000_122 != null) {
                    handler2.post(aRunnableS48S0100000_122);
                    return;
                } else {
                    o.LJIJI("countDownAction");
                    throw null;
                }
            } catch (Exception unused) {
                return;
            }
        }
        o.LJIJI("countDownAction");
        throw null;
    }

    public static final void run$0(ARunnableS8S0200100_12 aRunnableS8S0200100_12) {
        boolean LIZ;
        try {
            aRunnableS8S0200100_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS8S0200100_12 aRunnableS8S0200100_12) {
        boolean LIZ;
        try {
            aRunnableS8S0200100_12.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS8S0200100_12(Object obj, Object obj2, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j2 = j;
    }
}
