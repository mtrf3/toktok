package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C71313Ryn;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.PII;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;

/* loaded from: classes5.dex */
public class AqS0S6300000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l6;
    public Object l7;
    public Object l8;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public String s5;

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

    public static final Object invoke$0(AqS0S6300000_4 aqS0S6300000_4, Object obj) {
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "payment_method");
        String str = aqS0S6300000_4.s0;
        if (str != null) {
            c27943Axv.LIZLLL("pay_request_id", str);
        }
        Long l = (Long) aqS0S6300000_4.l6;
        if (l != null) {
            c27943Axv.LIZLLL("pay_order_time", Long.valueOf(l.longValue()));
        }
        String str2 = aqS0S6300000_4.s1;
        if (str2 != null) {
            c27943Axv.LIZLLL("payment_method_id", str2);
        }
        String str3 = aqS0S6300000_4.s2;
        if (str3 != null) {
            c27943Axv.LIZLLL("payment_method_name", str3);
        }
        Boolean bool = (Boolean) aqS0S6300000_4.l7;
        if (bool != null) {
            c27943Axv.LIZLLL("is_create_order", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str4 = aqS0S6300000_4.s3;
        if (str4 != null) {
            c27943Axv.LIZLLL("source_page_type", str4);
        }
        CommuteType commuteType = (CommuteType) aqS0S6300000_4.l8;
        if (commuteType != null) {
            c27943Axv.LIZLLL("pay_commute_type", commuteType);
        }
        String str5 = aqS0S6300000_4.s4;
        if (str5 != null) {
            c27943Axv.LIZLLL("err_msg", str5);
        }
        String str6 = aqS0S6300000_4.s5;
        if (str6 != null) {
            c27943Axv.LIZLLL("code", str6);
        }
        c27943Axv.LIZLLL("traceparent", PII.LIZIZ());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S6300000_4 aqS0S6300000_4, Object obj) {
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "payment_method");
        String str = aqS0S6300000_4.s0;
        if (str != null) {
            c27943Axv.LIZLLL("pay_request_id", str);
        }
        Long l = (Long) aqS0S6300000_4.l6;
        if (l != null) {
            c27943Axv.LIZLLL("create_order_time", Long.valueOf(l.longValue()));
        }
        String str2 = aqS0S6300000_4.s1;
        if (str2 != null) {
            c27943Axv.LIZLLL("payment_method_id", str2);
        }
        String str3 = aqS0S6300000_4.s2;
        if (str3 != null) {
            c27943Axv.LIZLLL("payment_method_name", str3);
        }
        Boolean bool = (Boolean) aqS0S6300000_4.l7;
        if (bool != null) {
            c27943Axv.LIZLLL("is_create_order", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str4 = aqS0S6300000_4.s3;
        if (str4 != null) {
            c27943Axv.LIZLLL("source_page_type", str4);
        }
        CommuteType commuteType = (CommuteType) aqS0S6300000_4.l8;
        if (commuteType != null) {
            c27943Axv.LIZLLL("pay_commute_type", commuteType);
        }
        String str5 = aqS0S6300000_4.s4;
        if (str5 != null) {
            c27943Axv.LIZLLL("err_msg", str5);
        }
        String str6 = aqS0S6300000_4.s5;
        if (str6 != null) {
            c27943Axv.LIZLLL("code", str6);
        }
        c27943Axv.LIZLLL("traceparent", PII.LIZIZ());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S6300000_4(String str, Long l, String str2, String str3, Boolean bool, String str4, CommuteType commuteType, String str5, String str6, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l6 = l;
        this.s1 = str2;
        this.s2 = str3;
        this.l7 = bool;
        this.s3 = str4;
        this.l8 = commuteType;
        this.s4 = str5;
        this.s5 = str6;
    }
}
