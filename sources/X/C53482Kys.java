package X;

/* renamed from: X.Kys, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53482Kys extends AbstractC53588L1k<EnumC53519KzT, C53526Kza> {
    public final C53526Kza LIZJ;

    @Override // X.AbstractC53588L1k
    public final /* bridge */ /* synthetic */ C53526Kza LJFF() {
        return this.LIZJ;
    }

    public C53482Kys(C53526Kza c53526Kza) {
        this.LIZJ = c53526Kza;
    }

    @Override // X.AbstractC53588L1k
    public final C53469Kyf LIZ(EnumC53519KzT enumC53519KzT) {
        int i = C53483Kyt.LIZ[enumC53519KzT.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C53526Kza c53526Kza = this.LIZJ;
                if (c53526Kza != null && c53526Kza.LIZJ) {
                    return LJI(false);
                }
                return null;
            }
            throw new C162476Zf();
        }
        return LJI(true);
    }

    public final C53469Kyf LJI(boolean z) {
        int i;
        if (z) {
            C53526Kza c53526Kza = this.LIZJ;
            if (c53526Kza != null) {
                i = c53526Kza.LIZ;
            }
            i = 0;
        } else {
            C53526Kza c53526Kza2 = this.LIZJ;
            if (c53526Kza2 != null) {
                i = c53526Kza2.LIZIZ;
            }
            i = 0;
        }
        return new C53469Kyf(new C53461KyX(new C53480Kyq(Integer.valueOf(i), new C53456KyS(0), C53443KyF.LJLIL)));
    }
}
