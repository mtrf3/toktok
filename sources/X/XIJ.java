package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XIJ extends SZD {
    public final Object LIZJ;
    public final boolean LIZLLL;
    public final XIK LJ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZJ, Boolean.valueOf(this.LIZLLL), this.LJ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XIJ) {
            return C78966Uyw.LJIIIZ(((XIJ) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("AssemblePerformanceParams:%s,%s,%s", LIZ());
    }

    public XIJ(LifecycleOwner host, boolean z, XIK scene) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(scene, "scene");
        this.LIZJ = host;
        this.LIZLLL = z;
        this.LJ = scene;
    }
}
