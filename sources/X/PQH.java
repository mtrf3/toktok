package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class PQH implements PQM {
    public final int LIZ = 1;
    public final AtomicInteger LIZIZ = new AtomicInteger(0);
    public final PQJ LIZJ = new PQJ();

    @Override // X.PQM
    public final PQL create(String scene) {
        int incrementAndGet;
        o.LJIIIZ(scene, "scene");
        if (this.LIZIZ.get() >= this.LIZ || (incrementAndGet = this.LIZIZ.incrementAndGet()) > this.LIZ) {
            return null;
        }
        PQL create = this.LIZJ.create(scene);
        if (incrementAndGet == this.LIZ) {
            this.LIZJ.LIZ = null;
        }
        return create;
    }
}
