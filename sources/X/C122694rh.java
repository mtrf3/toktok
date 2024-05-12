package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122694rh {
    public final float LIZ;
    public final List<InterfaceC88471Ynr<Float, Float, C76800UCe>> LIZIZ;
    public float LIZJ;

    public C122694rh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C122694rh) && Float.compare(this.LIZ, ((C122694rh) obj).LIZ) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimationTracker(defaultCursor=");
        return C74221TAz.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public C122694rh(int i) {
        this.LIZ = 0.0f;
        this.LIZIZ = new ArrayList();
        this.LIZJ = 0.0f;
    }

    public final void LIZ(float f) {
        Iterator<InterfaceC88471Ynr<Float, Float, C76800UCe>> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().invoke(Float.valueOf(this.LIZJ), Float.valueOf(f));
        }
        this.LIZJ = f;
    }
}
