package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C56386MBa;
import X.C76800UCe;
import X.C78685UuP;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class AqS4S1102000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
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

    public static final Object invoke$0(AqS4S1102000_9 aqS4S1102000_9, Object obj) {
        TrendingEventModel trendingEventModel;
        C56386MBa setState = (C56386MBa) obj;
        o.LJIIIZ(setState, "$this$setState");
        List<TrendingEventModel> list = ((C56386MBa) aqS4S1102000_9.l1).LJLJJL;
        String str = aqS4S1102000_9.s0;
        Iterator<TrendingEventModel> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                trendingEventModel = it.next();
                if (o.LJ(trendingEventModel.getEventId(), str)) {
                    break;
                }
            } else {
                trendingEventModel = null;
                break;
            }
        }
        TrendingEventModel trendingEventModel2 = trendingEventModel;
        if (trendingEventModel2 == null) {
            trendingEventModel2 = ((C56386MBa) aqS4S1102000_9.l1).LJLILLLLZI;
        }
        return C56386MBa.LIZ(setState, null, trendingEventModel2, null, null, null, null, C78685UuP.LJJJZ(aqS4S1102000_9.s0), aqS4S1102000_9.i2, aqS4S1102000_9.i3, 61);
    }

    public static final Object invoke$1(AqS4S1102000_9 aqS4S1102000_9, Object obj) {
        C56386MBa it = (C56386MBa) obj;
        o.LJIIIZ(it, "it");
        ((TrendingDetailSharedVM) aqS4S1102000_9.l1).setState(new AqS4S1102000_9(it, aqS4S1102000_9.s0, aqS4S1102000_9.i2, aqS4S1102000_9.i3, 0));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S1102000_9(C56386MBa c56386MBa, String str, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l1 = c56386MBa;
        this.s0 = str;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S1102000_9(TrendingDetailOperatorWrapper trendingDetailOperatorWrapper, String str, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l1 = trendingDetailOperatorWrapper;
        this.s0 = str;
        this.i2 = i;
        this.i3 = i2;
    }
}
