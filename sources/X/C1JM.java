package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1JM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JM extends C0Q9 {
    public float LIZ;
    public final int LIZIZ = 1;

    @Override // X.C0Q9
    public final void LIZLLL() {
        this.LIZ = 0.0f;
    }

    @Override // X.C0Q9
    public final C0Q9 LIZJ() {
        return new C1JM(0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        return o.LJIILLIIL(Float.valueOf(this.LIZ), "AnimationVector1D: value = ");
    }

    @Override // X.C0Q9
    public final int LIZIZ() {
        return this.LIZIZ;
    }

    public C1JM(float f) {
        this.LIZ = f;
    }

    @Override // X.C0Q9
    public final float LIZ(int i) {
        if (i == 0) {
            return this.LIZ;
        }
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1JM) || ((C1JM) obj).LIZ != this.LIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C0Q9
    public final void LJ(float f, int i) {
        if (i == 0) {
            this.LIZ = f;
        }
    }
}
