package X;

import java.io.Closeable;

/* loaded from: classes12.dex */
public interface PUC extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(C64533PUj c64533PUj, long j);

    C64545PUv timeout();
}
