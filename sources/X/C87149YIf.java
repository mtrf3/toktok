package X;

/* renamed from: X.YIf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87149YIf {
    public final AbstractC87153YIj LIZ;

    public C87149YIf(C87154YIk c87154YIk) {
        this.LIZ = c87154YIk;
        c87154YIk.LJLJJI = this;
    }

    public final void LIZ(int i, AbstractC87134YHq abstractC87134YHq) {
        this.LIZ.LJLLI(i, abstractC87134YHq);
    }

    public final void LIZIZ(int i, YIV yiv, Object obj) {
        AbstractC87153YIj abstractC87153YIj = this.LIZ;
        abstractC87153YIj.LJZI(i, 3);
        yiv.LJI(obj, abstractC87153YIj.LJLJJI);
        abstractC87153YIj.LJZI(i, 4);
    }

    public final void LIZJ(int i, YIV yiv, Object obj) {
        AbstractC87153YIj abstractC87153YIj = this.LIZ;
        Object obj2 = (YIH) obj;
        abstractC87153YIj.LL((i << 3) | 2);
        YIP yip = (YIP) obj2;
        int LJFF = yip.LJFF();
        if (LJFF == -1) {
            LJFF = yiv.LIZJ(yip);
            yip.LJII(LJFF);
        }
        abstractC87153YIj.LL(LJFF);
        yiv.LJI(obj2, abstractC87153YIj.LJLJJI);
    }
}
