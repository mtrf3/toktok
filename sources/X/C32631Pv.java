package X;

import java.io.FileOutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.1Pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32631Pv implements InterfaceC10860bi {
    public FileOutputStream LIZ;

    public void LIZ() {
        FileOutputStream fileOutputStream = this.LIZ;
        if (fileOutputStream != null) {
            fileOutputStream.close();
        } else {
            o.LJIJI("outputStream");
            throw null;
        }
    }

    @Override // X.InterfaceC10860bi
    public void close() {
        FileOutputStream fileOutputStream = this.LIZ;
        if (fileOutputStream != null) {
            fileOutputStream.close();
        } else {
            o.LJIJI("outputStream");
            throw null;
        }
    }

    public void LIZIZ(byte[] bArr, int i) {
        FileOutputStream fileOutputStream = this.LIZ;
        if (fileOutputStream != null) {
            fileOutputStream.write(bArr, 0, i);
        } else {
            o.LJIJI("outputStream");
            throw null;
        }
    }
}
