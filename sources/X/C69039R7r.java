package X;

/* renamed from: X.R7r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69039R7r<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    public C69039R7r(InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C68972R5c.LJIIIIZZ(Boolean.FALSE, this.LIZ, this.LIZIZ.q9(), false, null, 24);
        R96 r96 = new R96(c73516StE, this.LIZIZ, this.LIZ, this.LIZLLL, this.LIZJ);
        this.LIZIZ.bi(r96);
        String str = this.LIZ;
        int hashCode = str.hashCode();
        if (hashCode != 96619420) {
            if (hashCode != 106642798) {
                this.LIZIZ.r9().LJI(this.LIZJ, this.LIZLLL, r96);
                return;
            } else {
                this.LIZIZ.r9().LJI(this.LIZJ, this.LIZLLL, r96);
                return;
            }
        }
        if (str.equals("email")) {
            this.LIZIZ.r9().LJIIJJI(this.LIZJ, this.LIZLLL, r96);
            return;
        }
        this.LIZIZ.r9().LJIIZILJ(this.LIZJ, this.LIZLLL, r96);
    }
}
