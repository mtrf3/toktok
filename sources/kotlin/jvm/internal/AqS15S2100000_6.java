package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C40002Fmw;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Map;

/* loaded from: classes7.dex */
public class AqS15S2100000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
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

    public static final Object invoke$0(AqS15S2100000_6 aqS15S2100000_6, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("page_name", "mall");
        String str = aqS15S2100000_6.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("schema", str);
        String str3 = aqS15S2100000_6.s1;
        if (str3 != null) {
            str2 = str3;
        }
        sendLog.LIZLLL("deeplink_from", str2);
        Map map = (Map) aqS15S2100000_6.l2;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                sendLog.LIZLLL((String) entry.getKey(), entry.getValue());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS15S2100000_6 aqS15S2100000_6, Object obj) {
        String result = (String) obj;
        o.LJIIIZ(result, "result");
        Activity topActivity = ActivityStack.getTopActivity();
        o.LJIIIIZZ(topActivity, "getTopActivity()");
        String str = aqS15S2100000_6.s0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aqS15S2100000_6.s1);
        LIZ.append(result);
        ((InterfaceC88472Yns) aqS15S2100000_6.l2).invoke(Boolean.valueOf(C40002Fmw.LIZ(topActivity, str, X1D.LIZIZ(LIZ))));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS15S2100000_6(String str, String str2, String str3, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S2100000_6(String str, String str2, AqS52S1200000_10 aqS52S1200000_10, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = aqS52S1200000_10;
    }
}
