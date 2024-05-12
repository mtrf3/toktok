package X;

import java.nio.charset.Charset;

/* loaded from: classes12.dex */
public abstract class Q9K implements Q9I {
    public static final Charset LIZ = Charset.forName("UTF-8");

    @Override // X.Q9I
    public final long LJIIIIZZ() {
        long j = 0;
        int i = 0;
        do {
            j |= (readByte() & 255) << (i * 8);
            i++;
        } while (i < 8);
        return j;
    }

    @Override // X.Q9I
    public final int LJIIZILJ() {
        return (readByte() & 255) | ((readByte() & 255) << 8) | ((readByte() & 255) << 16) | ((readByte() & 255) << 24);
    }
}
