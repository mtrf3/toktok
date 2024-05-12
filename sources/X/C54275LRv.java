package X;

/* renamed from: X.LRv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54275LRv implements InterfaceC54279LRz {
    public final /* synthetic */ C54274LRu LIZ;

    @Override // X.InterfaceC54279LRz
    public final void LIZ() {
        C54274LRu c54274LRu = this.LIZ;
        InterfaceC54279LRz interfaceC54279LRz = c54274LRu.LIZIZ;
        if (interfaceC54279LRz != null) {
            interfaceC54279LRz.LIZ();
        }
        if (c54274LRu.LIZLLL.compareAndSet(false, true)) {
            c54274LRu.LIZIZ = null;
            c54274LRu.LIZJ();
        }
    }

    public C54275LRv(C54274LRu c54274LRu) {
        this.LIZ = c54274LRu;
    }
}
