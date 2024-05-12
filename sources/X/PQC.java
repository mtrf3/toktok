package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQC implements PQO {
    public final /* synthetic */ V0Q LIZIZ;
    public final /* synthetic */ String LIZ = null;
    public final /* synthetic */ float LIZJ = 1.0f;

    public PQC(C66906QNq c66906QNq) {
        this.LIZIZ = c66906QNq;
    }

    @Override // X.PQO
    public final boolean LIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        String str = this.LIZ;
        if (str == null || o.LJ(str, scene)) {
            return true;
        }
        return false;
    }

    @Override // X.PQO
    public final boolean LIZIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (this.LIZIZ.nextFloat() <= this.LIZJ) {
            return true;
        }
        return false;
    }
}
