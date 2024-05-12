package X;

/* renamed from: X.PYn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64641PYn implements InterfaceC65017PfR<PVM, PVM> {
    public static final C64641PYn LJLIL = new C64641PYn();

    @Override // X.InterfaceC65017PfR
    public final PVM LIZ(PVM pvm) {
        PVM pvm2 = pvm;
        try {
            C64533PUj c64533PUj = new C64533PUj();
            pvm2.source().LLJJLIIIJLLLLLLLZ(c64533PUj);
            return PVM.create(pvm2.contentType(), pvm2.contentLength(), c64533PUj);
        } finally {
            pvm2.close();
        }
    }
}
