package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C2068389v;
import X.C248629pK;
import X.C25859ACx;
import X.InterfaceC88472Yns;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public class AqS1S1010000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S1010000_4 aqS1S1010000_4, Object obj) {
        C248629pK setState = (C248629pK) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C248629pK.LIZ(setState, null, null, aqS1S1010000_4.s0, null, null, false, null, null, null, null, null, null, false, aqS1S1010000_4.z1, null, null, null, null, null, null, null, 2088955);
    }

    public static final Object invoke$1(AqS1S1010000_4 aqS1S1010000_4, Object obj) {
        C248629pK setState = (C248629pK) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C248629pK.LIZ(setState, null, aqS1S1010000_4.s0, null, null, null, false, null, null, null, null, null, null, aqS1S1010000_4.z1, false, null, null, null, null, null, null, null, 2093053);
    }

    public static final Object invoke$2(AqS1S1010000_4 aqS1S1010000_4, Object obj) {
        C25859ACx it = (C25859ACx) obj;
        o.LJIIIZ(it, "it");
        String str = it.LJZI;
        String str2 = aqS1S1010000_4.s0;
        if (str2 == null) {
            str2 = "";
        }
        C2068389v c2068389v = it.LLIILZL;
        Integer num = null;
        if (c2068389v != null) {
            if (!aqS1S1010000_4.z1) {
                num = Integer.valueOf(R.attr.d8);
            }
            c2068389v.LIZLLL = num;
        } else {
            c2068389v = null;
        }
        return new C25859ACx(str, null, it.LL, null, false, null, null, str2, false, false, null, null, false, false, null, c2068389v, null, 6291322);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1010000_4(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
