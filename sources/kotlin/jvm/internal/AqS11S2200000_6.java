package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OSZ;

/* loaded from: classes7.dex */
public class AqS11S2200000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS11S2200000_6 aqS11S2200000_6, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str = aqS11S2200000_6.s0;
        if (str != null) {
            sendLog.LIZLLL("redirect_url", str);
        }
        String str2 = aqS11S2200000_6.s1;
        if (str2 != null) {
            sendLog.LIZLLL("host", str2);
        }
        Boolean bool = (Boolean) aqS11S2200000_6.l2;
        if (bool != null) {
            bool.booleanValue();
            sendLog.LIZLLL("is_blank", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        Long l = (Long) aqS11S2200000_6.l3;
        if (l != null) {
            sendLog.LIZLLL("cost_time", Long.valueOf(l.longValue()));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        if (r2.LJIILJJIL == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS11S2200000_6 r5, java.lang.Object r6) {
        /*
            X.Axv r6 = (X.C27943Axv) r6
            java.lang.String r0 = "$this$sendLog"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.C78880UxY.LJIJI(r6)
            java.lang.Object r0 = r5.l2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.Pbv r0 = (X.C64799Pbv) r0
            X.PZo r2 = r0.getRequestInfo()
            java.lang.Object r0 = r5.l2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.Pbv r0 = (X.C64799Pbv) r0
            int r0 = r0.getStatusCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "error_code"
            r6.LIZIZ(r0, r1)
            java.lang.String r1 = r5.s0
            if (r1 != 0) goto L2d
            java.lang.String r1 = ""
        L2d:
            java.lang.String r0 = "path"
            r6.LIZJ(r0, r1)
            java.lang.Object r0 = r5.l2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.Pbw r0 = (X.C64800Pbw) r0
            java.lang.String r1 = r0.traceCode
            java.lang.String r0 = "log_id"
            r6.LIZIZ(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = r5.s1
            r6.LIZIZ(r1, r0)
            if (r2 == 0) goto L7f
            long r0 = r2.LJIILLIIL
        L4a:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration"
            r6.LIZJ(r0, r1)
            r4 = 0
            if (r2 == 0) goto L7d
            boolean r1 = r2.LJIILJJIL
            r0 = 1
            if (r1 != r0) goto L7d
        L5b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_socket_reused"
            r6.LIZJ(r0, r1)
            java.lang.Object r3 = r5.l3
            X.OSZ[] r3 = (X.OSZ[]) r3
            int r2 = r3.length
        L69:
            if (r4 >= r2) goto L82
            r0 = r3[r4]
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getSecond()
            r6.LIZIZ(r1, r0)
            int r4 = r4 + 1
            goto L69
        L7d:
            r0 = 0
            goto L5b
        L7f:
            r0 = 0
            goto L4a
        L82:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS11S2200000_6.invoke$1(kotlin.jvm.internal.AqS11S2200000_6, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S2200000_6(String str, Long l, Boolean bool, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = bool;
        this.l3 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS11S2200000_6(Throwable th, Throwable th2, String str, String str2, OSZ<String, ? extends Object>[] oszArr) {
        super(1);
        this.$t = oszArr;
        this.l2 = th;
        this.s0 = th2;
        this.s1 = str;
        this.l3 = str2;
    }
}
