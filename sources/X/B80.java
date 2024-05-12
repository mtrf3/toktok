package X;

/* loaded from: classes6.dex */
public final class B80<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;

    public B80(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        BR4.LJI(-1, this.LJLIL, null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("err stack: ");
        LIZ.append(obj);
        C0NB.LJ("GoodyBagService", X1D.LIZIZ(LIZ));
    }
}
