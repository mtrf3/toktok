package X;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.PAw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64026PAw {
    public MappedByteBuffer LIZ;
    public long LIZIZ;

    public final long LIZ() {
        if (this.LIZ == null) {
            try {
                String LJIJJ = PC5.LJIJJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJIJJ.replace(".", "_").replace(":", "-"));
                LIZ.append("_seq_num.txt");
                File file = new File(O5Y.LJJIIZ(), X1D.LIZIZ(LIZ));
                boolean exists = file.exists();
                if (!exists) {
                    file.createNewFile();
                }
                MappedByteBuffer map = new RandomAccessFile(file, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 8L);
                this.LIZ = map;
                if (!exists) {
                    map.putLong(0, 0L);
                    return 0L;
                }
            } catch (Throwable th) {
                C64028PAy.LIZJ("APM-Slardar", "prepare seq_number fail.", th);
            }
        }
        MappedByteBuffer mappedByteBuffer = this.LIZ;
        if (mappedByteBuffer != null) {
            long j = mappedByteBuffer.getLong(0) + 1;
            this.LIZIZ = j;
            this.LIZ.putLong(0, j);
            return this.LIZIZ;
        }
        long j2 = this.LIZIZ;
        this.LIZIZ = 1 + j2;
        return j2;
    }
}
