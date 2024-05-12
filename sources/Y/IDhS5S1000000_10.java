package Y;

import X.AbstractC73635Sv9;
import X.C62077OXx;
import X.C62078OXy;
import X.InterfaceC48038ItG;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDhS5S1000000_10 implements InterfaceC48038ItG {
    public final int $t;
    public String s0;

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

    public IDhS5S1000000_10(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(IDhS5S1000000_10 iDhS5S1000000_10, Object obj) {
        String res = (String) obj;
        o.LJIIIZ(res, "res");
        return AbstractC73635Sv9.LJ(new C62077OXx(res, iDhS5S1000000_10.s0));
    }

    public static final Object apply$1(IDhS5S1000000_10 iDhS5S1000000_10, Object obj) {
        String res = (String) obj;
        o.LJIIIZ(res, "res");
        return AbstractC73635Sv9.LJ(new C62078OXy(res, iDhS5S1000000_10.s0));
    }
}
