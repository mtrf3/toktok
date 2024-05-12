package X;

/* renamed from: X.Siv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72877Siv extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final OSZ<Integer, Integer> LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public final float LJLLI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ)};
    }

    public C72877Siv(int i, int i2, int i3, OSZ<Integer, Integer> osz, int i4, int i5, int i6, int i7) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = osz;
        this.LJLJJL = i4;
        this.LJLJJLL = i5;
        this.LJLJL = i6;
        this.LJLJLJ = i7;
        float f = ((i - i4) - i5) / i2;
        this.LJLJLLL = f;
        float f2 = f * i3;
        this.LJLL = f2;
        this.LJLLI = osz.getSecond().floatValue() * (f2 / osz.getFirst().floatValue());
    }
}
