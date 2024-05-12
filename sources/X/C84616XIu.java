package X;

/* renamed from: X.XIu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84616XIu extends AbstractC06100Lu {
    @Override // X.AbstractC06100Lu
    public final void LJIIIIZZ(String str) {
        this.LJLIL = true;
        AbstractC84617XIv.LIZLLL = System.currentTimeMillis();
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIZ(long j, long j2, long j3, long j4, boolean z) {
        this.LJLIL = false;
        AbstractC84617XIv.LIZLLL = -1L;
        if (z) {
            AbstractC84617XIv.LJ = j4;
        }
    }
}
