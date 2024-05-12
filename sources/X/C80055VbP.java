package X;

/* renamed from: X.VbP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80055VbP implements J7Y {
    public final /* synthetic */ C80049VbJ LIZ;
    public final /* synthetic */ J7Y LIZIZ;

    public C80055VbP(C80049VbJ c80049VbJ, J7Y j7y) {
        this.LIZ = c80049VbJ;
        this.LIZIZ = j7y;
    }

    @Override // X.J7Y
    public final void LIZ(long j, boolean z) {
        EnumC79999VaV enumC79999VaV;
        J7Y j7y = this.LIZIZ;
        if (j7y != null) {
            j7y.LIZ(j, z);
        }
        InterfaceC80047VbH interfaceC80047VbH = this.LIZ.LJI;
        if (z) {
            enumC79999VaV = EnumC79999VaV.SEEK_SUCCESS;
        } else {
            enumC79999VaV = EnumC79999VaV.SEEK_FAILED;
        }
        interfaceC80047VbH.LJIILJJIL(enumC79999VaV);
    }
}
