package X;

import java.io.InputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.1Pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32611Pt implements InterfaceC10860bi {
    public InputStream LIZ;

    @Override // X.InterfaceC10860bi
    public void close() {
        InputStream inputStream = this.LIZ;
        if (inputStream != null) {
            inputStream.close();
        } else {
            o.LJIJI("inputStream");
            throw null;
        }
    }

    public int LIZ(byte[] bArr, int i) {
        InputStream inputStream = this.LIZ;
        if (inputStream != null) {
            return inputStream.read(bArr, 0, i);
        }
        o.LJIJI("inputStream");
        throw null;
    }
}
