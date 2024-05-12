package X;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes12.dex */
public final class PL3 extends PrintWriter {
    public final MessageDigest LJLIL;
    public final Charset LJLILLLLZI;
    public final C64298PLi LJLJI;

    public static String LIZ(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return PKW.LIZ(messageDigest.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.LJLIL;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    public PL3(OutputStream outputStream, MessageDigest messageDigest, C64298PLi c64298PLi) {
        super(outputStream);
        this.LJLIL = messageDigest;
        this.LJLJI = c64298PLi;
        if (messageDigest != null) {
            this.LJLILLLLZI = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.LJLIL != null) {
            C64298PLi c64298PLi = this.LJLJI;
            if (c64298PLi == null || c64298PLi.LIZ(str)) {
                this.LJLIL.update(this.LJLILLLLZI.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.LJLIL;
        if (messageDigest != null) {
            messageDigest.update(this.LJLILLLLZI.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
