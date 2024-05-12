package X;

/* renamed from: X.Sva, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73662Sva extends AbstractC73661SvZ<InterfaceC29937Boz> {
    public static final long serialVersionUID = -8219729196779211169L;

    public C73662Sva() {
        super(new InterfaceC29937Boz() { // from class: X.90Q
            @Override // X.InterfaceC29937Boz
            public final void run() {
                G1P.LIZ = C90P.LJLIL;
            }
        });
    }

    @Override // X.AbstractC73661SvZ
    public final void LIZ(InterfaceC29937Boz interfaceC29937Boz) {
        try {
            interfaceC29937Boz.run();
        } catch (Throwable th) {
            throw C73864Syq.LIZIZ(th);
        }
    }
}
