package X;

/* renamed from: X.1RL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RL implements InterfaceC13120fM {
    public final int LIZ;
    public final long LIZIZ;
    public AnonymousClass166 LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC13120fM
    public final void cancel() {
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            AnonymousClass166 anonymousClass166 = this.LIZJ;
            if (anonymousClass166 != null) {
                anonymousClass166.LIZ();
            }
            this.LIZJ = null;
        }
    }

    public C1RL(long j, int i) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
