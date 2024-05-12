package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XBm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84426XBm extends C32611Pt {
    public final InterfaceC79048V0q LIZIZ;

    @Override // X.C32611Pt, X.InterfaceC10860bi
    public final void close() {
        this.LIZIZ.close();
    }

    public C84426XBm(InterfaceC79048V0q byteReadStream) {
        o.LJIIJ(byteReadStream, "byteReadStream");
        this.LIZIZ = byteReadStream;
    }

    @Override // X.C32611Pt
    public final int LIZ(byte[] bArr, int i) {
        return this.LIZIZ.read(bArr, 0, i);
    }
}
