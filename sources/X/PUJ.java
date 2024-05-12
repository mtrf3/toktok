package X;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes12.dex */
public interface PUJ extends Closeable, Flushable {
    void LLIIIL(C64533PUj c64533PUj, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C64545PUv timeout();
}
