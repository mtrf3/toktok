package ud2;

import X.AbstractC82618Wbe;
import X.C275416g;
import X.C275516h;
import X.C82306WRy;
import X.C82622Wbi;
import X.WMH;
import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ApS76S0201000_14 extends AbstractC82618Wbe {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC82618Wbe
    public final Object LIZIZ(C82622Wbi c82622Wbi) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c82622Wbi);
            case 1:
                return LIZIZ$1(this, c82622Wbi);
            default:
                return super.LIZIZ(c82622Wbi);
        }
    }

    public static final Object LIZIZ$0(ApS76S0201000_14 apS76S0201000_14, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82306WRy c82306WRy = new C82306WRy((WMH) apS76S0201000_14.l1, container, apS76S0201000_14.i2);
        ((C275416g) apS76S0201000_14.l0).getClass();
        c82306WRy.afterInit$als_release(uptimeMillis);
        return c82306WRy;
    }

    public static final Object LIZIZ$1(ApS76S0201000_14 apS76S0201000_14, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82306WRy c82306WRy = new C82306WRy((WMH) apS76S0201000_14.l1, container, apS76S0201000_14.i2);
        ((C275416g) apS76S0201000_14.l0).getClass();
        c82306WRy.afterInit$als_release(uptimeMillis);
        return c82306WRy;
    }

    public ApS76S0201000_14(C275416g c275416g, C275516h c275516h, WMH wmh, int i, int i2) {
        this.$t = i2;
        this.l0 = c275416g;
        this.l1 = wmh;
        this.i2 = i;
    }
}
