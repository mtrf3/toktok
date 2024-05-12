package X;

/* renamed from: X.5TA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TA implements C6KR {
    public final /* synthetic */ C5T9 LIZ;

    public C5TA(C5T9 c5t9) {
        this.LIZ = c5t9;
    }

    @Override // X.C6KR
    public final void LIZ(float f, boolean z) {
        int i;
        long j;
        long j2 = r1.LJ * f;
        InterfaceC153045zY interfaceC153045zY = this.LIZ.LIZLLL;
        if (interfaceC153045zY != null) {
            i = interfaceC153045zY.LLIZLLLIL();
        } else {
            i = 0;
        }
        int i2 = (int) (i * f);
        InterfaceC153045zY interfaceC153045zY2 = this.LIZ.LIZLLL;
        if (interfaceC153045zY2 != null) {
            j = interfaceC153045zY2.LLFZ(i2);
        } else {
            j = 0;
        }
        if (z) {
            C5T9 c5t9 = this.LIZ;
            c5t9.LJII = null;
            c5t9.LJFF.setValue(C5MM.LIZLLL(j));
            this.LIZ.LJFF.setValue(C5MM.LIZJ());
        } else {
            this.LIZ.LJFF.setValue(C5MM.LIZIZ(j));
            this.LIZ.LJFF.setValue(C5MM.LIZJ());
        }
        this.LIZ.LIZIZ().setValue(Long.valueOf(j2));
        C5TE c5te = this.LIZ.LJIIIIZZ;
        if (c5te != null) {
            c5te.LIZ(z);
        }
    }
}
