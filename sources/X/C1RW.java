package X;

/* renamed from: X.1RW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RW extends F9E {
    public final float LJLIL;
    public final float LJLILLLLZI;

    public final float[] L() {
        float f = this.LJLIL;
        float f2 = this.LJLILLLLZI;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI)};
    }

    public C1RW(float f, float f2) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
    }
}
