package X;

/* renamed from: X.Pdx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64925Pdx implements InterfaceC64924Pdw {
    public final int LIZ;

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    public C64925Pdx(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC64924Pdw
    public final boolean LJI(C64907Pdf c64907Pdf, C37826Esw c37826Esw, Throwable th, int i, boolean z) {
        if (z || i < this.LIZ) {
            return true;
        }
        return false;
    }
}
