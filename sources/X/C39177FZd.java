package X;

/* renamed from: X.FZd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39177FZd implements C10I<C39178FZe, Void> {
    public final /* synthetic */ boolean LIZ = false;

    @Override // X.C10I
    public final Void then(C10K<C39178FZe> c10k) {
        if (c10k.LJIIJJI() != null) {
            if (this.LIZ && C39179FZf.LIZ != null && c10k.LJIIJJI().LIZIZ != C39179FZf.LIZ.LIZIZ) {
                C39179FZf.LIZIZ = Integer.valueOf((int) (((c10k.LJIIJJI().LIZ - C39179FZf.LIZ.LIZ) * 100.0d) / (c10k.LJIIJJI().LIZIZ - C39179FZf.LIZ.LIZIZ)));
            }
            C39179FZf.LIZ = c10k.LJIIJJI();
            return null;
        }
        return null;
    }
}
