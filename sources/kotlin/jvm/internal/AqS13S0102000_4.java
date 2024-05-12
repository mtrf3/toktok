package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C25531A0h;
import X.C25532A0i;
import X.C3C1;
import X.C43I;
import X.C9PL;
import X.C9PM;
import X.C9PN;
import X.InterfaceC88472Yns;
import X.OSJ;
import android.content.Intent;
import com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardVM;

/* loaded from: classes5.dex */
public class AqS13S0102000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS13S0102000_4 aqS13S0102000_4, Object obj) {
        C9PL c9pl = (C9PL) obj;
        if (c9pl != null) {
            return C9PL.LIZ(c9pl, null, null, null, new C43I(new OSJ(Integer.valueOf(aqS13S0102000_4.i1), Integer.valueOf(aqS13S0102000_4.i2), (Intent) aqS13S0102000_4.l0)), false, false, null, null, null, 503);
        }
        return null;
    }

    public static final Object invoke$1(AqS13S0102000_4 aqS13S0102000_4, Object obj) {
        C9PN c9pn = (C9PN) obj;
        if (c9pn != null) {
            return C9PN.LIZ(c9pn, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, new C43I(new OSJ(Integer.valueOf(aqS13S0102000_4.i1), Integer.valueOf(aqS13S0102000_4.i2), (Intent) aqS13S0102000_4.l0)), null, null, null, null, null, null, null, null, null, 268304383);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 == 3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS13S0102000_4 r13, java.lang.Object r14) {
        /*
            r3 = r14
            X.98Q r3 = (X.C98Q) r3
            java.lang.String r0 = "$this$setState"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            int r2 = r13.i1
            r4 = 0
            if (r2 <= 0) goto L30
            int r1 = r13.i2
            r6 = 1
            r0 = 3
            if (r1 == r0) goto L16
            r4 = 1
            if (r1 != r0) goto L18
        L16:
            int r6 = r3.LJLJI
        L18:
            X.2tb r8 = new X.2tb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r8.<init>(r0)
            int r5 = r13.i2
            r7 = 0
            r9 = 0
            r14 = 1000(0x3e8, float:1.401E-42)
            r10 = r9
            r11 = r9
            r12 = r7
            r13 = r7
            X.98Q r0 = X.C98Q.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L2f:
            return r0
        L30:
            X.2tb r8 = new X.2tb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r8.<init>(r0)
            java.lang.Object r1 = r13.l0
            com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardVM r1 = (com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardVM) r1
            int r0 = r13.i2
            r1.getClass()
            if (r0 != 0) goto L60
            X.43I r9 = new X.43I
            r0 = 2131846902(0x7f1166f6, float:1.9327266E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.<init>(r0)
        L50:
            r4 = 0
            int r5 = r13.i2
            r10 = 0
            r14 = 968(0x3c8, float:1.356E-42)
            r6 = r4
            r7 = r4
            r11 = r10
            r12 = r4
            r13 = r4
            X.98Q r0 = X.C98Q.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L2f
        L60:
            r9 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS13S0102000_4.invoke$2(kotlin.jvm.internal.AqS13S0102000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AqS13S0102000_4 aqS13S0102000_4, Object obj) {
        C25532A0i setState = (C25532A0i) obj;
        o.LJIIIZ(setState, "$this$setState");
        Throwable throwable = (Throwable) aqS13S0102000_4.l0;
        o.LJIIIIZZ(throwable, "throwable");
        return C25532A0i.LIZ(setState, null, null, null, null, null, new C3C1(throwable), null, null, null, null, null, null, new C43I(new C25531A0h(aqS13S0102000_4.i1, aqS13S0102000_4.i2)), 4063);
    }

    public static final Object invoke$4(AqS13S0102000_4 aqS13S0102000_4, Object obj) {
        C9PM setState = (C9PM) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C9PM.LIZ(setState, null, null, new C43I(new OSJ(Integer.valueOf(aqS13S0102000_4.i1), Integer.valueOf(aqS13S0102000_4.i2), (Intent) aqS13S0102000_4.l0)), null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, -5, 511);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0102000_4(int i, int i2, Intent intent, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0102000_4(int i, int i2, UserProfileUserCardVM userProfileUserCardVM, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = userProfileUserCardVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0102000_4(Throwable th, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = th;
        this.i1 = i;
        this.i2 = i2;
    }
}
