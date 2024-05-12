package X;

import java.util.Random;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQ9 implements PQO {
    public final Random LIZ = new Random();

    @Override // X.PQO
    public final boolean LIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        return true;
    }

    @Override // X.PQO
    public final boolean LIZIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (((Number) C35161Dr3.LIZ.getValue()).floatValue() > 0.0f) {
            if (!((Boolean) C35163Dr5.LIZIZ.getValue()).booleanValue()) {
                return false;
            }
            return PH3.LJIIJJI;
        }
        if (C36152EGu.LJ()) {
            return C64099PDr.LIZIZ("fps", scene);
        }
        if (o.LJ(scene, "system_launch_isolate_startup_to_first_frame") || o.LJ(scene, "system_launch_isolate_after_first_frame")) {
            if (this.LIZ.nextFloat() > 0.05f) {
                return false;
            }
            return true;
        }
        return C64099PDr.LIZIZ("fps", scene);
    }
}
