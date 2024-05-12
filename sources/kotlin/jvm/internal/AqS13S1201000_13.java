package kotlin.jvm.internal;

import X.ARN;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C0NY;
import X.C113554cx;
import X.C162476Zf;
import X.C76800UCe;
import X.C78886Uxe;
import X.C78949Uyf;
import X.FMX;
import X.InterfaceC88472Yns;
import X.N38;
import X.OSZ;
import X.UPK;
import X.UZ1;
import X.UZ7;
import X.UZ8;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.Map;

/* loaded from: classes14.dex */
public class AqS13S1201000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS13S1201000_13 aqS13S1201000_13, Object obj) {
        String str;
        Map<String, String> LJJL;
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        it.LIZJ = true;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS13S1201000_13.l1;
        String str2 = aqS13S1201000_13.s0;
        int i = aqS13S1201000_13.i3;
        UZ8 uz8 = (UZ8) aqS13S1201000_13.l2;
        int i2 = UZ7.LIZ[uz8.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str = "phone";
            } else {
                throw new C162476Zf();
            }
        } else {
            str = "email";
        }
        FMX.LJIIL("verify_pii_page_click", C113554cx.LJJL(new OSZ("enter_from", str2), new OSZ("enter_method", "normal"), new OSZ("show_index", String.valueOf(i)), new OSZ("click", "update"), new OSZ("verify_type", str), new OSZ("status", "1")));
        SmartRoute buildRoute = SmartRouter.buildRoute(C78949Uyf.LJIILL(activityC45651qj), "//account/setting/self");
        buildRoute.withParam("IS_ACCOUNT_INFO", true);
        buildRoute.withParam("enter_method", "normal");
        C0NY.LIZJ(buildRoute, "enter_from", str2, "is_from_prompt", true);
        if (uz8 == UZ8.EMAIL) {
            LJJL = C113554cx.LJJL(new OSZ("source", "13"), new OSZ("type", "2"), new OSZ("decision_uid", String.valueOf(UZ1.LJFF)));
        } else {
            LJJL = C113554cx.LJJL(new OSZ("source", "14"), new OSZ("type", "1"), new OSZ("decision_uid", String.valueOf(UZ1.LJFF)));
        }
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/identity/update_source/", LJJL, new N38());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS13S1201000_13 r14, java.lang.Object r15) {
        /*
            r2 = r15
            X.SY4 r2 = (X.SY4) r2
            java.lang.String r0 = "$this$configButton"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            boolean r0 = r2.LLI
            if (r0 == 0) goto Lf
        Lc:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lf:
            r0 = r14
            int r3 = r0.i3
            r1 = 2
            if (r3 != r1) goto L7a
            java.lang.String r7 = "facebook"
        L17:
            java.lang.String r12 = X.UQ4.LJIIIIZZ()
        L1b:
            java.lang.String r5 = r0.s0
            java.lang.String r6 = "user"
            r8 = 1
            r9 = 0
            java.lang.Object r3 = r0.l1
            X.UPK r3 = (X.UPK) r3
            java.lang.String r10 = r3.LJFF()
            java.lang.String r11 = "on"
            X.UPa r4 = X.C77134UPa.LIZ
            java.lang.Integer r13 = r4.LIZLLL()
            r14 = 0
            r15 = 528(0x210, float:7.4E-43)
            X.UQ4.LJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r5 = r0.s0
            java.lang.String r6 = "user"
            java.lang.Object r3 = r0.l1
            X.UPK r3 = (X.UPK) r3
            java.lang.String r8 = r3.LJFF()
            java.lang.String r3 = "on"
            java.lang.String r9 = X.UQ4.LJI(r3, r12)
            java.lang.String r10 = "process"
            java.lang.Integer r11 = r4.LIZLLL()
            r13 = 320(0x140, float:4.48E-43)
            r7 = r7
            r12 = r14
            X.UQ4.LIZLLL(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r4 = r0.l2
            X.ARN r4 = (X.ARN) r4
            r3 = 0
            r4.LIZJ = r3
            r3 = 1
            r2.setLoading(r3)
            int r2 = r0.i3
            if (r2 != r1) goto L78
        L65:
            java.lang.Object r2 = r0.l1
            X.UPK r2 = (X.UPK) r2
            r2.LIZLLL(r1)
            java.lang.Object r2 = r0.l1
            X.UPK r2 = (X.UPK) r2
            java.lang.Object r0 = r0.l2
            X.ARN r0 = (X.ARN) r0
            r2.LJII(r1, r3, r0)
            goto Lc
        L78:
            r1 = 1
            goto L65
        L7a:
            java.lang.String r7 = "contact"
            if (r3 != r1) goto L7f
            goto L17
        L7f:
            java.lang.String r12 = X.UQ4.LJII()
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS13S1201000_13.invoke$1(kotlin.jvm.internal.AqS13S1201000_13, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1201000_13(int i, ActivityC45651qj activityC45651qj, UZ8 uz8, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = activityC45651qj;
        this.s0 = str;
        this.i3 = i;
        this.l2 = uz8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1201000_13(int i, String str, UPK upk, ARN arn, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.l1 = upk;
        this.l2 = arn;
    }
}
