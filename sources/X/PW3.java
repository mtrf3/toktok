package X;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes12.dex */
public interface PW3 extends PUC, ReadableByteChannel {
    InputStream K();

    long LJIIIIZZ();

    int LJIIZILJ();

    String LJJIFFI(long j);

    C64533PUj LJJIJ();

    boolean LJJLJ(C64537PUn c64537PUn);

    C64537PUn LJLIIIL(long j);

    long LJLZ();

    void LLFZ(C64533PUj c64533PUj, long j);

    String LLIIIILZ(long j);

    String LLIIZ();

    boolean LLJ();

    long LLJJLIIIJLLLLLLLZ(C64533PUj c64533PUj);

    byte[] LLLLIIL();

    String LLLLL(Charset charset);

    void a(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    void skip(long j);
}
