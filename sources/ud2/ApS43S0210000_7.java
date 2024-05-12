package ud2;

import X.AbstractC42651GoZ;
import X.AbstractC82618Wbe;
import X.C82622Wbi;
import X.W4I;
import X.W4L;
import X.WMH;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ApS43S0210000_7 extends AbstractC82618Wbe {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.W4L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.W4L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.W4L, java.lang.Object] */
    @Override // X.AbstractC82618Wbe
    public final W4L LIZIZ(C82622Wbi c82622Wbi) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c82622Wbi);
            case 1:
                return LIZIZ$1(this, c82622Wbi);
            default:
                return super.LIZIZ(c82622Wbi);
        }
    }

    public static final Object LIZIZ$0(ApS43S0210000_7 apS43S0210000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return new W4I(container, apS43S0210000_7.z2, new AqS154S0200000_7((AbstractC42651GoZ) apS43S0210000_7.l0, (WMH) apS43S0210000_7.l1, 134));
    }

    public static final Object LIZIZ$1(ApS43S0210000_7 apS43S0210000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return new W4I(container, apS43S0210000_7.z2, new AqS154S0200000_7((AbstractC42651GoZ) apS43S0210000_7.l0, (WMH) apS43S0210000_7.l1, 133));
    }

    public ApS43S0210000_7(boolean z, AbstractC42651GoZ abstractC42651GoZ, WMH wmh, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = abstractC42651GoZ;
        this.l1 = wmh;
    }
}
