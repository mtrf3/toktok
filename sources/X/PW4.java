package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes12.dex */
public final class PW4 implements PUC {
    public final PW3 LJLIL;
    public int LJLILLLLZI;
    public byte LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public short LJLJJLL;

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.PUC
    public final C64545PUv timeout() {
        return this.LJLIL.timeout();
    }

    public PW4(PW3 pw3) {
        this.LJLIL = pw3;
    }

    @Override // X.PUC
    public final long read(C64533PUj c64533PUj, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.LJLJJL;
            if (i2 == 0) {
                this.LJLIL.skip(this.LJLJJLL);
                this.LJLJJLL = (short) 0;
                if ((this.LJLJI & 4) != 0) {
                    return -1L;
                }
                i = this.LJLJJI;
                PW3 pw3 = this.LJLIL;
                int readByte = (pw3.readByte() & 255) | ((pw3.readByte() & 255) << 16) | ((pw3.readByte() & 255) << 8);
                this.LJLJJL = readByte;
                this.LJLILLLLZI = readByte;
                byte readByte2 = (byte) (this.LJLIL.readByte() & 255);
                this.LJLJI = (byte) (this.LJLIL.readByte() & 255);
                Logger logger = PWC.LJLJJL;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(PPI.LIZ(true, this.LJLJJI, this.LJLILLLLZI, readByte2, this.LJLJI));
                }
                readInt = this.LJLIL.readInt() & Integer.MAX_VALUE;
                this.LJLJJI = readInt;
                if (readByte2 != 9) {
                    PPI.LIZIZ("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                    throw null;
                }
            } else {
                long read = this.LJLIL.read(c64533PUj, Math.min(j, i2));
                if (read == -1) {
                    return -1L;
                }
                this.LJLJJL = (int) (this.LJLJJL - read);
                return read;
            }
        } while (readInt == i);
        PPI.LIZIZ("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }
}
