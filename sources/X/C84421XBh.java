package X;

import java.io.FileOutputStream;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XBh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84421XBh extends C32631Pv {
    public final C32631Pv LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // X.C32631Pv
    public final void LIZ() {
        try {
            this.LIZIZ.LIZ();
        } catch (Exception unused) {
            this.LIZJ.invoke();
        }
    }

    @Override // X.C32631Pv, X.InterfaceC10860bi
    public final void close() {
        try {
            this.LIZIZ.close();
        } catch (Exception unused) {
            this.LIZJ.invoke();
        }
    }

    public C84421XBh(C32631Pv out, AqS165S0100000_15 aqS165S0100000_15) {
        o.LJIIJ(out, "out");
        this.LIZIZ = out;
        this.LIZJ = aqS165S0100000_15;
        FileOutputStream fileOutputStream = out.LIZ;
        if (fileOutputStream != null) {
            this.LIZ = fileOutputStream;
        } else {
            o.LJIJI("outputStream");
            throw null;
        }
    }

    @Override // X.C32631Pv
    public final void LIZIZ(byte[] bArr, int i) {
        try {
            this.LIZIZ.LIZIZ(bArr, i);
        } catch (Exception unused) {
            this.LIZJ.invoke();
        }
    }
}
