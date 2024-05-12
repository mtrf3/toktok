package X;

/* loaded from: classes14.dex */
public final class V7T implements InterfaceC07020Pi {
    public final float LIZ;

    public V7T(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC07020Pi
    public final float LIZ(float f) {
        boolean z;
        float pow;
        if (this.LIZ == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        float f2 = 1.0f - f;
        if (z) {
            pow = f2 * f2;
        } else {
            pow = (float) Math.pow(f2, 2 * r1);
        }
        return 1.0f - pow;
    }
}
