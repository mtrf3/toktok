package X;

import java.io.File;

/* loaded from: classes11.dex */
public interface OEF {
    int LJJI(int i, byte[] bArr, int i2);

    boolean LJJIFFI();

    void LJJII();

    File LJJIII();

    long length();

    long position();

    void position(long j);

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i, int i2);

    void release();

    long skip(long j);

    void write(int i);

    void write(byte[] bArr);
}
