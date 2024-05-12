package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.PUi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64532PUi implements PW3 {
    public boolean LJLIL;
    public final C64533PUj LJLILLLLZI;
    public final PUC LJLJI;

    @Override // X.PW3
    public final InputStream K() {
        return new C64530PUg(this);
    }

    public final String LIZIZ() {
        long LIZ = LIZ((byte) 10, 0L, Long.MAX_VALUE);
        if (LIZ == -1) {
            long j = this.LJLILLLLZI.LJLILLLLZI;
            if (j != 0) {
                return LJJIFFI(j);
            }
            return null;
        }
        return this.LJLILLLLZI.LJIJI(LIZ);
    }

    @Override // X.PW3
    public final long LJIIIIZZ() {
        a(8L);
        return this.LJLILLLLZI.LJIIIIZZ();
    }

    @Override // X.PW3
    public final int LJIIZILJ() {
        a(4L);
        return this.LJLILLLLZI.LJIIZILJ();
    }

    @Override // X.PW3
    public final long LJLZ() {
        byte LJ;
        a(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            LJ = this.LJLILLLLZI.LJ(i);
            if ((LJ < ((byte) 48) || LJ > ((byte) 57)) && ((LJ < ((byte) 97) || LJ > ((byte) 102)) && (LJ < ((byte) 65) || LJ > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            String LLLZ = C16880lQ.LLLZ("Expected leading [0-9a-fA-F] character but was %#x", Arrays.copyOf(new Object[]{Byte.valueOf(LJ)}, 1));
            o.LJFF(LLLZ, "java.lang.String.format(format, *args)");
            throw new NumberFormatException(LLLZ);
        }
        return this.LJLILLLLZI.LJLZ();
    }

    @Override // X.PW3
    public final boolean LLJ() {
        if (!this.LJLIL) {
            if (this.LJLILLLLZI.LLJ() && this.LJLJI.read(this.LJLILLLLZI, FileUtils.BUFFER_SIZE) == -1) {
                return true;
            }
            return false;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PW3
    public final byte[] LLLLIIL() {
        this.LJLILLLLZI.j(this.LJLJI);
        return this.LJLILLLLZI.LLLLIIL();
    }

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        this.LJLJI.close();
        this.LJLILLLLZI.LIZ();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.LJLIL;
    }

    @Override // X.PW3
    public final byte readByte() {
        a(1L);
        return this.LJLILLLLZI.readByte();
    }

    @Override // X.PW3
    public final int readInt() {
        a(4L);
        return this.LJLILLLLZI.readInt();
    }

    @Override // X.PW3
    public final long readLong() {
        a(8L);
        return this.LJLILLLLZI.readLong();
    }

    @Override // X.PW3
    public final short readShort() {
        a(2L);
        return this.LJLILLLLZI.readShort();
    }

    @Override // X.PUC
    public final C64545PUv timeout() {
        return this.LJLJI.timeout();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("buffer(");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.PW3
    public final String LLIIZ() {
        return LLIIIILZ(Long.MAX_VALUE);
    }

    @Override // X.PW3
    public final C64533PUj LJJIJ() {
        return this.LJLILLLLZI;
    }

    public C64532PUi(PUC source) {
        o.LJIIJ(source, "source");
        this.LJLJI = source;
        this.LJLILLLLZI = new C64533PUj();
    }

    @Override // X.PW3
    public final String LJJIFFI(long j) {
        a(j);
        return this.LJLILLLLZI.LJJIFFI(j);
    }

    @Override // X.PW3
    public final boolean LJJLJ(C64537PUn bytes) {
        o.LJIIJ(bytes, "bytes");
        int size = bytes.size();
        if (!this.LJLIL) {
            if (size >= 0 && bytes.size() >= size) {
                for (int i = 0; i < size; i++) {
                    long j = i + 0;
                    if (request(1 + j) && this.LJLILLLLZI.LJ(j) == bytes.getByte(i)) {
                    }
                }
                return true;
            }
            return false;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PW3
    public final C64537PUn LJLIIIL(long j) {
        a(j);
        return this.LJLILLLLZI.LJLIIIL(j);
    }

    @Override // X.PW3
    public final String LLIIIILZ(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long LIZ = LIZ(b, 0L, j2);
            if (LIZ != -1) {
                return this.LJLILLLLZI.LJIJI(LIZ);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.LJLILLLLZI.LJ(j2 - 1) == ((byte) 13) && request(1 + j2) && this.LJLILLLLZI.LJ(j2) == b) {
                return this.LJLILLLLZI.LJIJI(j2);
            }
            C64533PUj c64533PUj = new C64533PUj();
            C64533PUj c64533PUj2 = this.LJLILLLLZI;
            c64533PUj2.LIZLLL(c64533PUj, 0L, Math.min(32, c64533PUj2.LJLILLLLZI));
            throw new EOFException("\\n not found: limit=" + Math.min(this.LJLILLLLZI.LJLILLLLZI, j) + " content=" + c64533PUj.LJIIL().hex() + "…");
        }
        String LIZ2 = C61845OOz.LIZ("limit < 0: ", j);
        LIZ2.toString();
        throw new IllegalArgumentException(LIZ2);
    }

    @Override // X.PW3
    public final long LLJJLIIIJLLLLLLLZ(C64533PUj c64533PUj) {
        long j = 0;
        while (this.LJLJI.read(this.LJLILLLLZI, FileUtils.BUFFER_SIZE) != -1) {
            long LIZJ = this.LJLILLLLZI.LIZJ();
            if (LIZJ > 0) {
                j += LIZJ;
                c64533PUj.LLIIIL(this.LJLILLLLZI, LIZJ);
            }
        }
        C64533PUj c64533PUj2 = this.LJLILLLLZI;
        long j2 = c64533PUj2.LJLILLLLZI;
        if (j2 > 0) {
            long j3 = j + j2;
            c64533PUj.LLIIIL(c64533PUj2, j2);
            return j3;
        }
        return j;
    }

    @Override // X.PW3
    public final String LLLLL(Charset charset) {
        o.LJIIJ(charset, "charset");
        this.LJLILLLLZI.j(this.LJLJI);
        return this.LJLILLLLZI.LLLLL(charset);
    }

    @Override // X.PW3
    public final void a(long j) {
        if (request(j)) {
        } else {
            throw new EOFException();
        }
    }

    public final int read(byte[] bArr) {
        long length = bArr.length;
        C30581Hy.LJIIIIZZ(bArr.length, 0, length);
        C64533PUj c64533PUj = this.LJLILLLLZI;
        if (c64533PUj.LJLILLLLZI == 0 && this.LJLJI.read(c64533PUj, FileUtils.BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.LJLILLLLZI.read(bArr, 0, (int) Math.min(length, this.LJLILLLLZI.LJLILLLLZI));
    }

    @Override // X.PW3
    public final void readFully(byte[] sink) {
        o.LJIIJ(sink, "sink");
        try {
            a(sink.length);
            this.LJLILLLLZI.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C64533PUj c64533PUj = this.LJLILLLLZI;
                long j = c64533PUj.LJLILLLLZI;
                if (j > 0) {
                    int read = c64533PUj.read(sink, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // X.PW3
    public final boolean request(long j) {
        C64533PUj c64533PUj;
        if (j >= 0) {
            if (!(!this.LJLIL)) {
                "closed".toString();
                throw new IllegalStateException("closed");
            }
            do {
                c64533PUj = this.LJLILLLLZI;
                if (c64533PUj.LJLILLLLZI >= j) {
                    return true;
                }
            } while (this.LJLJI.read(c64533PUj, FileUtils.BUFFER_SIZE) != -1);
            return false;
        }
        String LIZ = C61845OOz.LIZ("byteCount < 0: ", j);
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }

    @Override // X.PW3
    public final void skip(long j) {
        if (!this.LJLIL) {
            while (j > 0) {
                C64533PUj c64533PUj = this.LJLILLLLZI;
                if (c64533PUj.LJLILLLLZI != 0 || this.LJLJI.read(c64533PUj, FileUtils.BUFFER_SIZE) != -1) {
                    long min = Math.min(j, this.LJLILLLLZI.LJLILLLLZI);
                    this.LJLILLLLZI.skip(min);
                    j -= min;
                } else {
                    throw new EOFException();
                }
            }
            return;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        o.LJIIJ(sink, "sink");
        C64533PUj c64533PUj = this.LJLILLLLZI;
        if (c64533PUj.LJLILLLLZI == 0 && this.LJLJI.read(c64533PUj, FileUtils.BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.LJLILLLLZI.read(sink);
    }

    @Override // X.PW3
    public final void LLFZ(C64533PUj sink, long j) {
        o.LJIIJ(sink, "sink");
        try {
            a(j);
            this.LJLILLLLZI.LLFZ(sink, j);
        } catch (EOFException e) {
            sink.j(this.LJLILLLLZI);
            throw e;
        }
    }

    @Override // X.PUC
    public final long read(C64533PUj sink, long j) {
        o.LJIIJ(sink, "sink");
        if (j >= 0) {
            if (!this.LJLIL) {
                C64533PUj c64533PUj = this.LJLILLLLZI;
                if (c64533PUj.LJLILLLLZI == 0 && this.LJLJI.read(c64533PUj, FileUtils.BUFFER_SIZE) == -1) {
                    return -1L;
                }
                return this.LJLILLLLZI.read(sink, Math.min(j, this.LJLILLLLZI.LJLILLLLZI));
            }
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        String LIZ = C61845OOz.LIZ("byteCount < 0: ", j);
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }

    public final long LIZ(byte b, long j, long j2) {
        if (!this.LJLIL) {
            long j3 = 0;
            if (j2 >= 0) {
                while (j3 < j2) {
                    long LJFF = this.LJLILLLLZI.LJFF(b, j3, j2);
                    if (LJFF != -1) {
                        return LJFF;
                    }
                    C64533PUj c64533PUj = this.LJLILLLLZI;
                    long j4 = c64533PUj.LJLILLLLZI;
                    if (j4 >= j2 || this.LJLJI.read(c64533PUj, FileUtils.BUFFER_SIZE) == -1) {
                        break;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1L;
            }
            StringBuilder LIZJ = V10.LIZJ("fromIndex=", 0L, " toIndex=");
            LIZJ.append(j2);
            String LIZIZ = X1D.LIZIZ(LIZJ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }
}
