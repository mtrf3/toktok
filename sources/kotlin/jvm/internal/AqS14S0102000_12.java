package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C70216Rh6;
import X.C76800UCe;
import X.FII;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* loaded from: classes13.dex */
public class AqS14S0102000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS14S0102000_12 aqS14S0102000_12, Object obj) {
        int i;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("button_name", "sku_select");
        FII.LIZIZ(aqS14S0102000_12.i1, 1, logWhenShow, "pdp_sku_attr_rank");
        FII.LIZIZ(aqS14S0102000_12.i2, 1, logWhenShow, "pdp_sku_value_rank");
        C70216Rh6 c70216Rh6 = (C70216Rh6) aqS14S0102000_12.l0;
        if (c70216Rh6 != null && !c70216Rh6.LJ) {
            i = 1;
        } else {
            i = 0;
        }
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS14S0102000_12 aqS14S0102000_12, Object obj) {
        String str;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("button_name", "sku_select");
        logWhenShow.plusAssign("button_type", "select_attr");
        C70216Rh6 c70216Rh6 = (C70216Rh6) aqS14S0102000_12.l0;
        int i = 0;
        if (c70216Rh6 != null && c70216Rh6.LJFF) {
            str = "select";
        } else {
            str = "cancel";
        }
        logWhenShow.plusAssign("select_type", str);
        FII.LIZIZ(aqS14S0102000_12.i1, 1, logWhenShow, "pdp_sku_attr_rank");
        FII.LIZIZ(aqS14S0102000_12.i2, 1, logWhenShow, "pdp_sku_value_rank");
        C70216Rh6 c70216Rh62 = (C70216Rh6) aqS14S0102000_12.l0;
        if (c70216Rh62 != null && !c70216Rh62.LJ) {
            i = 1;
        }
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS14S0102000_12 aqS14S0102000_12, Object obj) {
        String str;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("button_name", "sku_select");
        logWhenShow.plusAssign("button_type", "select_attr");
        C70216Rh6 c70216Rh6 = (C70216Rh6) aqS14S0102000_12.l0;
        int i = 0;
        if (c70216Rh6 != null && c70216Rh6.LJFF) {
            str = "select";
        } else {
            str = "cancel";
        }
        logWhenShow.plusAssign("select_type", str);
        FII.LIZIZ(aqS14S0102000_12.i1, 1, logWhenShow, "pdp_sku_attr_rank");
        FII.LIZIZ(aqS14S0102000_12.i2, 1, logWhenShow, "pdp_sku_value_rank");
        C70216Rh6 c70216Rh62 = (C70216Rh6) aqS14S0102000_12.l0;
        if (c70216Rh62 != null && !c70216Rh62.LJ) {
            i = 1;
        }
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS14S0102000_12 aqS14S0102000_12, Object obj) {
        int i;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("button_name", "sku_select");
        FII.LIZIZ(aqS14S0102000_12.i1, 1, logWhenShow, "pdp_sku_attr_rank");
        FII.LIZIZ(aqS14S0102000_12.i2, 1, logWhenShow, "pdp_sku_value_rank");
        C70216Rh6 c70216Rh6 = (C70216Rh6) aqS14S0102000_12.l0;
        if (c70216Rh6 != null && !c70216Rh6.LJ) {
            i = 1;
        } else {
            i = 0;
        }
        logWhenShow.plusAssign("sale_prop_status", Integer.valueOf(i ^ 1));
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS14S0102000_12(int r3, int r4, X.C70216Rh6 r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.i1 = r3
            r1.i2 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.i1 = r3
            r1.i2 = r4
            r1.l0 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS14S0102000_12.<init>(int, int, X.Rh6, int):void");
    }
}
