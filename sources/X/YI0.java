package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes16.dex */
public final class YI0 {
    public static final Charset LIZ = Charset.forName("UTF-8");
    public static final byte[] LIZIZ;

    public static int LIZ(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        LIZIZ = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new YI4(0, 0).LIZ(0);
        } catch (YI5 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
