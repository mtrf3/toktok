package X;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes12.dex */
public interface PVU extends PUJ, WritableByteChannel {
    OutputStream H();

    PVU LJJI(int i, byte[] bArr, int i2);

    C64533PUj LJJIJ();

    PVU LJJZZIII(long j);

    PVU LLIFFJFJJ();

    PVU LLIIIZ(String str);

    PVU LLJZIJLIL(long j);

    PVU LLLLIILL(int i);

    PVU LLLLLILLIL(long j);

    PVU LLLZIL();

    PVU c(C64537PUn c64537PUn);

    @Override // X.PUJ, java.io.Flushable
    void flush();

    long j(PUC puc);

    PVU write(byte[] bArr);

    PVU writeByte(int i);

    PVU writeInt(int i);

    PVU writeShort(int i);
}
