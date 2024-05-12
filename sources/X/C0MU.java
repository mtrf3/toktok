package X;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.0MU, reason: invalid class name */
/* loaded from: classes.dex */
public class C0MU extends InputStream implements DataInput {
    public static final ByteOrder LJLJJL = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder LJLJJLL = ByteOrder.BIG_ENDIAN;
    public final DataInputStream LJLIL;
    public ByteOrder LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.LJLIL.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.LJLJJI++;
        return this.LJLIL.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.LJLJJI++;
        return this.LJLIL.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        int i = this.LJLJJI + 1;
        this.LJLJJI = i;
        if (i <= this.LJLJI) {
            int read = this.LJLIL.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.LJLJJI += 2;
        return this.LJLIL.readChar();
    }

    @Override // java.io.DataInput
    public final int readInt() {
        int i = this.LJLJJI + 4;
        this.LJLJJI = i;
        if (i <= this.LJLJI) {
            int read = this.LJLIL.read();
            int read2 = this.LJLIL.read();
            int read3 = this.LJLIL.read();
            int read4 = this.LJLIL.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.LJLILLLLZI;
                if (byteOrder == LJLJJL) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == LJLJJLL) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Invalid byte order: ");
                LIZ.append(this.LJLILLLLZI);
                throw new IOException(X1D.LIZIZ(LIZ));
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final long readLong() {
        int i = this.LJLJJI + 8;
        this.LJLJJI = i;
        if (i <= this.LJLJI) {
            int read = this.LJLIL.read();
            int read2 = this.LJLIL.read();
            int read3 = this.LJLIL.read();
            int read4 = this.LJLIL.read();
            int read5 = this.LJLIL.read();
            int read6 = this.LJLIL.read();
            int read7 = this.LJLIL.read();
            int read8 = this.LJLIL.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.LJLILLLLZI;
                if (byteOrder == LJLJJL) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == LJLJJLL) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Invalid byte order: ");
                LIZ.append(this.LJLILLLLZI);
                throw new IOException(X1D.LIZIZ(LIZ));
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int i = this.LJLJJI + 2;
        this.LJLJJI = i;
        if (i <= this.LJLJI) {
            int read = this.LJLIL.read();
            int read2 = this.LJLIL.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.LJLILLLLZI;
                if (byteOrder == LJLJJL) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == LJLJJLL) {
                    return (short) ((read << 8) + read2);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Invalid byte order: ");
                LIZ.append(this.LJLILLLLZI);
                throw new IOException(X1D.LIZIZ(LIZ));
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.LJLJJI += 2;
        return this.LJLIL.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.LJLJJI++;
        return this.LJLIL.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        int i = this.LJLJJI + 2;
        this.LJLJJI = i;
        if (i <= this.LJLJI) {
            int read = this.LJLIL.read();
            int read2 = this.LJLIL.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.LJLILLLLZI;
                if (byteOrder == LJLJJL) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == LJLJJLL) {
                    return (read << 8) + read2;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Invalid byte order: ");
                LIZ.append(this.LJLILLLLZI);
                throw new IOException(X1D.LIZIZ(LIZ));
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public C0MU(InputStream inputStream) {
        this.LJLILLLLZI = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.LJLIL = dataInputStream;
        int available = dataInputStream.available();
        this.LJLJI = available;
        this.LJLJJI = 0;
        dataInputStream.mark(available);
    }

    public final void LIZ(long j) {
        int i = this.LJLJJI;
        if (i > j) {
            this.LJLJJI = 0;
            this.LJLIL.reset();
            this.LJLIL.mark(this.LJLJI);
        } else {
            j -= i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) == i2) {
        } else {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        int length = this.LJLJJI + bArr.length;
        this.LJLJJI = length;
        if (length <= this.LJLJI) {
            if (this.LJLIL.read(bArr, 0, bArr.length) == bArr.length) {
                return;
            } else {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        int min = Math.min(i, this.LJLJI - this.LJLJJI);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.LJLIL.skipBytes(min - i2);
        }
        this.LJLJJI += i2;
        return i2;
    }

    public C0MU(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.LJLIL.read(bArr, i, i2);
        this.LJLJJI += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.LJLJJI + i2;
        this.LJLJJI = i3;
        if (i3 <= this.LJLJI) {
            if (this.LJLIL.read(bArr, i, i2) == i2) {
                return;
            } else {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }
        throw new EOFException();
    }
}
