package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQJ implements PQM {
    public volatile C64422PQc LIZ;

    @Override // X.PQM
    public final PQL create(String scene) {
        o.LJIIIZ(scene, "scene");
        C64422PQc c64422PQc = this.LIZ;
        if (c64422PQc != null) {
            return c64422PQc;
        }
        synchronized (this) {
            C64422PQc c64422PQc2 = this.LIZ;
            if (c64422PQc2 != null) {
                return c64422PQc2;
            }
            C64422PQc c64422PQc3 = new C64422PQc(scene);
            this.LIZ = c64422PQc3;
            return c64422PQc3;
        }
    }
}
