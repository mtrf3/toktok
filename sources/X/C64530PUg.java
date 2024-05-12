package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.PUg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64530PUg extends InputStream {
    public final /* synthetic */ C64532PUi LJLIL;

    @Override // java.io.InputStream
    public final int available() {
        C64532PUi c64532PUi = this.LJLIL;
        if (!c64532PUi.LJLIL) {
            return (int) Math.min(c64532PUi.LJLILLLLZI.LJLILLLLZI, Integer.MAX_VALUE);
        }
        throw new IOException("closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        C64532PUi c64532PUi = this.LJLIL;
        if (!c64532PUi.LJLIL) {
            C64533PUj c64533PUj = c64532PUi.LJLILLLLZI;
            if (c64533PUj.LJLILLLLZI == 0 && c64532PUi.LJLJI.read(c64533PUj, FileUtils.BUFFER_SIZE) == -1) {
                return -1;
            }
            return this.LJLIL.LJLILLLLZI.readByte() & 255;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(".inputStream()");
        return X1D.LIZIZ(LIZ);
    }

    public C64530PUg(C64532PUi c64532PUi) {
        this.LJLIL = c64532PUi;
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i, int i2) {
        o.LJIIJ(data, "data");
        if (!this.LJLIL.LJLIL) {
            C30581Hy.LJIIIIZZ(data.length, i, i2);
            C64532PUi c64532PUi = this.LJLIL;
            C64533PUj c64533PUj = c64532PUi.LJLILLLLZI;
            if (c64533PUj.LJLILLLLZI == 0 && c64532PUi.LJLJI.read(c64533PUj, FileUtils.BUFFER_SIZE) == -1) {
                return -1;
            }
            return this.LJLIL.LJLILLLLZI.read(data, i, i2);
        }
        throw new IOException("closed");
    }
}
