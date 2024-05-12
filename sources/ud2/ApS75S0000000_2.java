package ud2;

import X.AbstractC82618Wbe;
import X.C140625fW;
import X.C142755ix;
import X.C143115jX;
import X.C43941HMj;
import X.C60903NvH;
import X.C82622Wbi;
import X.C84488XDw;
import X.Y50;
import android.app.Application;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ApS75S0000000_2 extends AbstractC82618Wbe {
    public final int $t;

    public static final Object LIZIZ$0(ApS75S0000000_2 apS75S0000000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return container;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.Wbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.Wbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.Wbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.Wbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.Wbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Wbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Wbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.Wbi, java.lang.Object] */
    @Override // X.AbstractC82618Wbe
    public final C82622Wbi LIZIZ(C82622Wbi c82622Wbi) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c82622Wbi);
            case 1:
                return LIZIZ$1(this, c82622Wbi);
            case 2:
                return LIZIZ$2(this, c82622Wbi);
            case 3:
                return LIZIZ$3(this, c82622Wbi);
            case 4:
                return LIZIZ$4(this, c82622Wbi);
            case 5:
                return LIZIZ$5(this, c82622Wbi);
            case 6:
                return LIZIZ$6(this, c82622Wbi);
            default:
                return super.LIZIZ(c82622Wbi);
        }
    }

    public ApS75S0000000_2(int i) {
        this.$t = i;
    }

    public static final Object LIZIZ$1(ApS75S0000000_2 apS75S0000000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return new C142755ix();
    }

    public static final Object LIZIZ$2(ApS75S0000000_2 apS75S0000000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return new Y50(container);
    }

    public static final Object LIZIZ$3(ApS75S0000000_2 apS75S0000000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return new C143115jX();
    }

    public static final Object LIZIZ$4(ApS75S0000000_2 apS75S0000000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return new Y50(container);
    }

    public static final Object LIZIZ$5(ApS75S0000000_2 apS75S0000000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        if (C43941HMj.LIZIZ()) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            return C84488XDw.LIZ(application, null);
        }
        Application application2 = C60903NvH.LJ;
        o.LJIIIIZZ(application2, "getApplication()");
        return C84488XDw.LIZ(application2, C140625fW.LJLIL);
    }

    public static final Object LIZIZ$6(ApS75S0000000_2 apS75S0000000_2, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return Boolean.TRUE;
    }
}
