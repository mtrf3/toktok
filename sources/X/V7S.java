package X;

/* loaded from: classes14.dex */
public final class V7S implements InterfaceC07020Pi {
    public final float LIZ;
    public final float LIZIZ;

    public V7S(float f) {
        this.LIZ = f;
        this.LIZIZ = 2 * f;
    }

    @Override // X.InterfaceC07020Pi
    public final float LIZ(float f) {
        if (this.LIZ == 1.0f) {
            return f * f;
        }
        return (float) Math.pow(f, this.LIZIZ);
    }
}
