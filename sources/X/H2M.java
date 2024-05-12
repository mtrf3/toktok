package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H2M extends AbstractC41873Gc1 {
    public H2P LJ;
    public H2N LJFF;

    public H2M() {
        super((Object) null, 3);
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        Object obj;
        Object obj2;
        Object obj3;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (obj2 == null || (obj2 instanceof H2P)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        this.LJ = (H2P) obj2;
        Iterator<Object> it2 = args.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj3 = it2.next();
                if (obj3 == null || (obj3 instanceof H2N)) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        if (obj3 instanceof H2N) {
            obj = obj3;
        }
        this.LJFF = (H2N) obj;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZIZ(C41875Gc3 happenTime, Object sourceTag, Object info) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(info, "info");
        if ((info instanceof H2O) && ((H2O) info).LJLIL) {
            H2N h2n = this.LJFF;
            if (h2n == null) {
                h2n = new H2N(0);
            }
            C43399H1n c43399H1n = new C43399H1n(h2n);
            H2P h2p = this.LJ;
            if (h2p != null) {
                h2p.LIZIZ(c43399H1n);
            }
        }
    }
}
