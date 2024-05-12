package X;

/* renamed from: X.Qez, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67537Qez implements InterfaceC67510QeY {
    public boolean LIZ;
    public boolean LIZIZ;
    public C48260Iwq LIZJ;
    public final C67524Qem LIZLLL;

    public C67537Qez(C67524Qem c67524Qem) {
        this.LIZLLL = c67524Qem;
    }

    @Override // X.InterfaceC67510QeY
    public final InterfaceC67510QeY LIZ(String str) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZLLL.LIZ(this.LIZJ, str, this.LIZIZ);
            return this;
        }
        throw new C67504QeS("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // X.InterfaceC67510QeY
    public final InterfaceC67510QeY LIZJ(boolean z) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZLLL.LIZJ(this.LIZJ, z ? 1 : 0, this.LIZIZ);
            return this;
        }
        throw new C67504QeS("Cannot encode a second value in the ValueEncoderContext");
    }
}
