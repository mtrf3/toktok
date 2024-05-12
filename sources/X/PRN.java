package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PRN implements PQN {
    public final /* synthetic */ PRJ LIZ;

    public PRN(PRJ prj) {
        this.LIZ = prj;
    }

    @Override // X.PQN
    public final void LIZIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (o.LJ(scene, this.LIZ.LIZ)) {
            PRT prt = this.LIZ.LIZIZ;
            if (prt != null) {
                prt.LIZIZ(scene);
            }
            PRT prt2 = this.LIZ.LIZJ;
            if (prt2 != null) {
                prt2.LIZIZ(scene);
            }
        }
    }

    @Override // X.PQN
    public final void onStop(String scene) {
        o.LJIIIZ(scene, "scene");
        if (o.LJ(scene, this.LIZ.LIZ)) {
            PRT prt = this.LIZ.LIZIZ;
            if (prt != null) {
                prt.onStop(scene);
            }
            PRT prt2 = this.LIZ.LIZJ;
            if (prt2 != null) {
                prt2.onStop(scene);
            }
        }
    }
}
