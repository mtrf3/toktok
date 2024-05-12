package X;

/* renamed from: X.2gm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64962gm implements InterfaceC70422pa {
    public final MBA LJLIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CoroutineScope(coroutineContext=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL;
    }

    public C64962gm(MBA mba) {
        this.LJLIL = mba;
    }
}
