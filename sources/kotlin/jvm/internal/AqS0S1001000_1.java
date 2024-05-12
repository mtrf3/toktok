package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.im.sdk.search.data.SingleRecentContactData;

/* loaded from: classes2.dex */
public class AqS0S1001000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
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

    public static final Object invoke$0(AqS0S1001000_1 aqS0S1001000_1, Object obj) {
        boolean z;
        SingleRecentContactData it = (SingleRecentContactData) obj;
        o.LJIIIZ(it, "it");
        if (it.type == aqS0S1001000_1.i1 && o.LJ(it.businessId, aqS0S1001000_1.s0)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AqS0S1001000_1 aqS0S1001000_1, Object obj) {
        boolean z;
        SingleRecentContactData it = (SingleRecentContactData) obj;
        o.LJIIIZ(it, "it");
        if (it.type == aqS0S1001000_1.i1 && o.LJ(it.businessId, aqS0S1001000_1.s0)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S1001000_1(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }
}
