package net.jpountz.xxhash;

import X.C0H1;
import X.C16880lQ;
import X.X1D;
import java.util.zip.Checksum;

/* loaded from: classes15.dex */
public abstract class StreamingXXHash64 {
    public final long seed;

    /* loaded from: classes15.dex */
    public interface Factory {
        StreamingXXHash64 newStreamingHash(long j);
    }

    public abstract long getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i, int i2);

    public final Checksum asChecksum() {
        return new Checksum() { // from class: net.jpountz.xxhash.StreamingXXHash64.1
            @Override // java.util.zip.Checksum
            public long getValue() {
                return StreamingXXHash64.this.getValue();
            }

            @Override // java.util.zip.Checksum
            public void reset() {
                StreamingXXHash64.this.reset();
            }

            public String toString() {
                return StreamingXXHash64.this.toString();
            }

            @Override // java.util.zip.Checksum
            public void update(int i) {
                StreamingXXHash64.this.update(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.util.zip.Checksum
            public void update(byte[] bArr, int i, int i2) {
                StreamingXXHash64.this.update(bArr, i, i2);
            }
        };
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append("(seed=");
        return C0H1.LIZJ(LIZ, this.seed, ")", LIZ);
    }

    public StreamingXXHash64(long j) {
        this.seed = j;
    }
}
