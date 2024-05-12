package X;

/* renamed from: X.Nkq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60256Nkq<T> implements InterfaceC60268Nl2<T> {
    public boolean LIZ;
    public T LIZIZ;

    @Override // X.InterfaceC60268Nl2
    public final T LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC60268Nl2
    public final boolean LIZJ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C60256Nkq(Object obj) {
        boolean z;
        if (obj != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
        this.LIZIZ = obj;
    }

    @Override // X.InterfaceC60268Nl2
    public final void LIZIZ(InterfaceC60268Nl2 interfaceC60268Nl2) {
        if (this.LIZ) {
            interfaceC60268Nl2.LIZJ();
        } else {
            if (!interfaceC60268Nl2.LIZJ()) {
                return;
            }
            T t = (T) interfaceC60268Nl2.LIZ();
            this.LIZ = true;
            this.LIZIZ = t;
        }
    }
}
