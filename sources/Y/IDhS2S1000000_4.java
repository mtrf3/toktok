package Y;

import X.C38281F0r;
import X.C9XY;
import X.InterfaceC48038ItG;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDhS2S1000000_4 implements InterfaceC48038ItG {
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

    public IDhS2S1000000_4(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(IDhS2S1000000_4 iDhS2S1000000_4, Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        new C9XY(iDhS2S1000000_4.s0, false, it, 8).LIZLLL("@LinkRelation");
        return "";
    }

    public static final Object apply$1(IDhS2S1000000_4 iDhS2S1000000_4, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        C38281F0r c38281F0r = new C38281F0r(iDhS2S1000000_4.s0);
        c38281F0r.LIZLLL("checksum", it);
        String result = c38281F0r.LJ();
        if (it.length() > 0) {
            o.LJIIIIZZ(result, "result");
            new C9XY(result, true, null, 12).LIZLLL("@LinkRelation");
        }
        return result;
    }
}
