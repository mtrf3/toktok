package X;

/* renamed from: X.Uvd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78761Uvd extends AbstractC32664Crs<C81392Vwy<W5A>> {
    public int LIZ = 1;
    public final /* synthetic */ InterfaceC72705Sg9 LIZIZ;
    public final /* synthetic */ W6J LIZJ;
    public final /* synthetic */ W5O[] LIZLLL;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        Throwable LJFF = w4w.LJFF();
        W6J w6j = this.LIZJ;
        W5O[] w5oArr = this.LIZLLL;
        int i = this.LIZ;
        this.LIZ = i + 1;
        if (i >= w5oArr.length) {
            this.LIZIZ.onFailure(new RuntimeException(LJFF));
            return;
        }
        ((AbstractC48384Iyq) w6j.LJ(w5oArr[i], null)).LJ(this, FT1.LIZ());
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<W5A>> w4w) {
        this.LIZIZ.LIZ(w4w);
    }

    public C78761Uvd(InterfaceC72705Sg9 interfaceC72705Sg9, W6J w6j, W5O[] w5oArr) {
        this.LIZIZ = interfaceC72705Sg9;
        this.LIZJ = w6j;
        this.LIZLLL = w5oArr;
    }
}
