package Y;

import X.AFJ;
import X.C85039XZb;
import X.C85040XZc;
import X.InterfaceC48038ItG;
import com.ss.android.ugc.aweme.kids.discovery.model.KDisocverDetailList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDhS2S0100100_15 implements InterfaceC48038ItG {
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
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS2S0100100_15 iDhS2S0100100_15, Object obj) {
        KDisocverDetailList it = (KDisocverDetailList) obj;
        o.LJIIIZ(it, "it");
        AFJ.LIZ(2, 0, iDhS2S0100100_15.j1, "kids_api_detail");
        return ((C85039XZb) iDhS2S0100100_15.l0).LIZ(it);
    }

    public static final Object apply$1(IDhS2S0100100_15 iDhS2S0100100_15, Object obj) {
        KDisocverDetailList it = (KDisocverDetailList) obj;
        o.LJIIIZ(it, "it");
        AFJ.LIZ(1, 0, iDhS2S0100100_15.j1, "kids_api_detail");
        return ((C85039XZb) iDhS2S0100100_15.l0).LIZ(it);
    }

    public static final Object apply$2(IDhS2S0100100_15 iDhS2S0100100_15, Object obj) {
        KDisocverDetailList it = (KDisocverDetailList) obj;
        o.LJIIIZ(it, "it");
        AFJ.LIZ(3, 0, iDhS2S0100100_15.j1, "kids_api_detail");
        return ((C85040XZc) iDhS2S0100100_15.l0).LIZLLL(it);
    }

    public static final Object apply$3(IDhS2S0100100_15 iDhS2S0100100_15, Object obj) {
        KDisocverDetailList it = (KDisocverDetailList) obj;
        o.LJIIIZ(it, "it");
        AFJ.LIZ(2, 0, iDhS2S0100100_15.j1, "kids_api_detail");
        return ((C85040XZc) iDhS2S0100100_15.l0).LIZLLL(it);
    }

    public IDhS2S0100100_15(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
