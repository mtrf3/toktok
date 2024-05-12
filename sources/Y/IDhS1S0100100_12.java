package Y;

import X.AFJ;
import X.C71801SFx;
import X.InterfaceC48038ItG;
import com.ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDhS1S0100100_12 implements InterfaceC48038ItG {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS1S0100100_12 iDhS1S0100100_12, Object obj) {
        KFeedItemList it = (KFeedItemList) obj;
        o.LJIIIZ(it, "it");
        AFJ.LIZ(2, 0, iDhS1S0100100_12.j1, "kids_api_feed");
        ((C71801SFx) iDhS1S0100100_12.l0).getClass();
        return C71801SFx.LIZLLL(it);
    }

    public static final Object apply$1(IDhS1S0100100_12 iDhS1S0100100_12, Object obj) {
        KFeedItemList it = (KFeedItemList) obj;
        o.LJIIIZ(it, "it");
        AFJ.LIZ(1, 0, iDhS1S0100100_12.j1, "kids_api_feed");
        ((C71801SFx) iDhS1S0100100_12.l0).getClass();
        return C71801SFx.LIZLLL(it);
    }

    public IDhS1S0100100_12(long j, C71801SFx c71801SFx, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = c71801SFx;
    }
}
