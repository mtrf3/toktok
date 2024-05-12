package X;

/* loaded from: classes14.dex */
public final class V55 extends F9E {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;

    public V55() {
        this(0.0f, 0.0f, 15);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI), Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI)};
    }

    public V55(float f, float f2, int i) {
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 8) != 0 ? 0.0f : f2;
        this.LJLIL = 0.0f;
        this.LJLILLLLZI = f;
        this.LJLJI = 0.0f;
        this.LJLJJI = f2;
    }
}
