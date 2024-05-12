package net.jpountz.xxhash;

import X.C08380Uo;
import X.C16880lQ;
import X.X1D;
import java.util.zip.Checksum;

/* loaded from: classes15.dex */
public abstract class StreamingXXHash32 {
    public final int seed;

    /* loaded from: classes15.dex */
    public interface Factory {
        StreamingXXHash32 newStreamingHash(int i);
    }

    public abstract int getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i, int i2);

    public final Checksum asChecksum() {
        return new Checksum() { // from class: net.jpountz.xxhash.StreamingXXHash32.1
            @Override // java.util.zip.Checksum
            public long getValue() {
                return StreamingXXHash32.this.getValue() & 268435455;
            }

            @Override // java.util.zip.Checksum
            public void reset() {
                StreamingXXHash32.this.reset();
            }

            public String toString() {
                return StreamingXXHash32.this.toString();
            }

            @Override // java.util.zip.Checksum
            public void update(int i) {
                StreamingXXHash32.this.update(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.util.zip.Checksum
            public void update(byte[] bArr, int i, int i2) {
                StreamingXXHash32.this.update(bArr, i, i2);
            }
        };
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append("(seed=");
        return C08380Uo.LIZ(LIZ, this.seed, ")", LIZ);
    }

    public StreamingXXHash32(int i) {
        this.seed = i;
    }
}
