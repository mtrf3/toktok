package X;

/* renamed from: X.Zje, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90758Zje implements InterfaceC90305ZcL {
    public final InterfaceC90712Ziu LIZ;
    public final String LIZIZ;
    public final Object[] LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC90305ZcL
    public final boolean LIZ() {
        return (this.LIZLLL & 2) == 2;
    }

    @Override // X.InterfaceC90305ZcL
    public final int LIZIZ() {
        return (this.LIZLLL & 1) == 1 ? 1 : 2;
    }

    @Override // X.InterfaceC90305ZcL
    public final InterfaceC90712Ziu zza() {
        return this.LIZ;
    }

    public C90758Zje(AbstractC90950Zmk abstractC90950Zmk, String str, Object[] objArr) {
        this.LIZ = abstractC90950Zmk;
        this.LIZIZ = str;
        this.LIZJ = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.LIZLLL = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.LIZLLL = i | (charAt2 << i3);
                return;
            }
        }
    }
}
