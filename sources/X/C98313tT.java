package X;

/* renamed from: X.3tT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98313tT implements InterfaceC84703Uc {
    public static final C98333tV LIZLLL = new C98333tV();
    public final InterfaceC65784Pro<Long> LIZ;
    public long LIZIZ;
    public long LIZJ;

    public C98313tT() {
        throw null;
    }

    @Override // X.InterfaceC84703Uc
    public final long LIZ() {
        return this.LIZJ - this.LIZIZ;
    }

    @Override // X.InterfaceC84703Uc
    public final boolean isRunning() {
        if (this.LIZIZ > 0 && this.LIZJ == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC84703Uc
    public final void start() {
        this.LIZIZ = this.LIZ.invoke().longValue();
    }

    @Override // X.InterfaceC84703Uc
    public final void stop() {
        this.LIZJ = this.LIZ.invoke().longValue();
    }

    public C98313tT(int i) {
        this.LIZ = C98323tU.LJLIL;
    }
}
