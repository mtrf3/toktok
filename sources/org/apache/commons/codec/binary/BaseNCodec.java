package org.apache.commons.codec.binary;

import X.C16880lQ;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Arrays;

/* loaded from: classes16.dex */
public abstract class BaseNCodec {
    public final byte PAD = 61;
    public final int chunkSeparatorLength;
    public final int encodedBlockSize;
    public final int lineLength;
    public final int unencodedBlockSize;

    /* loaded from: classes16.dex */
    public static class Context {
        public byte[] buffer;
        public int currentLinePos;
        public boolean eof;
        public int ibitWorkArea;
        public long lbitWorkArea;
        public int modulus;
        public int pos;
        public int readPos;

        public String toString() {
            return C16880lQ.LLLZ("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{C16880lQ.LJLLJ(getClass()), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos)});
        }
    }

    public abstract void encode(byte[] bArr, int i, int i2, Context context);

    public int getDefaultBufferSize() {
        return FileUtils.BUFFER_SIZE;
    }

    public abstract boolean isInAlphabet(byte b);

    private byte[] resizeBuffer(Context context) {
        byte[] bArr = context.buffer;
        if (bArr == null) {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            context.buffer = bArr2;
        }
        return context.buffer;
    }

    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || isInAlphabet(b)) {
                return true;
            }
        }
        return false;
    }

    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, 0, bArr.length, context);
        encode(bArr, 0, -1, context);
        int i = context.pos - context.readPos;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i, context);
        return bArr2;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.unencodedBlockSize;
        long j = (((length + i) - 1) / i) * this.encodedBlockSize;
        int i2 = this.lineLength;
        if (i2 > 0) {
            return j + ((((i2 + j) - 1) / i2) * this.chunkSeparatorLength);
        }
        return j;
    }

    public byte[] ensureBufferSize(int i, Context context) {
        byte[] bArr = context.buffer;
        if (bArr == null || bArr.length < context.pos + i) {
            return resizeBuffer(context);
        }
        return bArr;
    }

    public BaseNCodec(int i, int i2, int i3, int i4) {
        this.unencodedBlockSize = i;
        this.encodedBlockSize = i2;
        int i5 = 0;
        if (i3 > 0 && i4 > 0) {
            i5 = (i3 / i2) * i2;
        }
        this.lineLength = i5;
        this.chunkSeparatorLength = i4;
    }

    public int readResults(byte[] bArr, int i, int i2, Context context) {
        if (context.buffer != null) {
            int min = Math.min(available(context), i2);
            System.arraycopy(context.buffer, context.readPos, bArr, i, min);
            int i3 = context.readPos + min;
            context.readPos = i3;
            if (i3 >= context.pos) {
                context.buffer = null;
            }
            return min;
        }
        if (context.eof) {
            return -1;
        }
        return 0;
    }
}
