package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C56386MBa;
import X.C57051MaF;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.MXP;
import X.MXQ;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM;

/* loaded from: classes10.dex */
public class AqS14S1101000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l1;
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

    public static final Object invoke$0(AqS14S1101000_9 aqS14S1101000_9, Object obj) {
        C56386MBa it = (C56386MBa) obj;
        o.LJIIIZ(it, "it");
        if (!o.LJ(it.LJLILLLLZI.getEventId(), aqS14S1101000_9.s0)) {
            TrendingDetailSharedVM trendingDetailSharedVM = (TrendingDetailSharedVM) aqS14S1101000_9.l1;
            trendingDetailSharedVM.LJLIL = 0L;
            trendingDetailSharedVM.LJLLJ = aqS14S1101000_9.s0;
            trendingDetailSharedVM.setState(new AqS33S0001000_9(aqS14S1101000_9.i2, 4));
            ((TrendingDetailSharedVM) aqS14S1101000_9.l1).manualListRefresh();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS14S1101000_9 aqS14S1101000_9, Object obj) {
        C57051MaF withMeta = (C57051MaF) obj;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LIZ = ((MXP) aqS14S1101000_9.l1).getTypeName();
        int i = MXQ.LIZ[((MXP) aqS14S1101000_9.l1).ordinal()];
        if (i != 1) {
            if (i == 2) {
                withMeta.LIZJ = aqS14S1101000_9.i2;
            }
        } else {
            withMeta.LIZIZ = aqS14S1101000_9.i2;
        }
        withMeta.LIZLLL = aqS14S1101000_9.s0;
        withMeta.LJFF = SystemClock.uptimeMillis();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S1101000_9(MXP mxp, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = mxp;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S1101000_9(String str, TrendingDetailSharedVM trendingDetailSharedVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = trendingDetailSharedVM;
        this.i2 = i;
    }
}
