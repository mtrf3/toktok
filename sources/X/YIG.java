package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes16.dex */
public final class YIG {
    public static final Charset LIZ;
    public static final byte[] LIZIZ;

    public static int LIZ(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        Charset.forName("US-ASCII");
        LIZ = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        LIZIZ = bArr;
        ByteBuffer.wrap(bArr);
        YIJ yij = new YIJ();
        try {
            int i = yij.LIZ + yij.LIZIZ;
        } catch (C87144YIa e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static YIN LIZIZ(Object obj, Object obj2) {
        YIR LIZJ = ((YIH) obj).LIZJ();
        YIH yih = (YIH) obj2;
        LIZJ.getClass();
        if (LIZJ.LJLIL.getClass().isInstance(yih)) {
            LIZJ.LJI((YIN) ((YIP) yih));
            return LIZJ.LJIIIZ();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
