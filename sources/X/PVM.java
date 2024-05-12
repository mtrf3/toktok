package X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class PVM implements Closeable {
    public Reader reader;

    public abstract long contentLength();

    public abstract C39745Fin contentType();

    public abstract PW3 source();

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        PVN pvn = new PVN(source(), charset());
        this.reader = pvn;
        return pvn;
    }

    private Charset charset() {
        C39745Fin contentType = contentType();
        if (contentType != null) {
            return contentType.LIZ(PVA.LJIIIIZZ);
        }
        return PVA.LJIIIIZZ;
    }

    public final InputStream byteStream() {
        return source().K();
    }

    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            PW3 source = source();
            try {
                byte[] LLLLIIL = source.LLLLIIL();
                PVA.LJ(source);
                if (contentLength == -1 || contentLength == LLLLIIL.length) {
                    return LLLLIIL;
                }
                StringBuilder LIZJ = V10.LIZJ("Content-Length (", contentLength, ") and stream length (");
                throw new IOException(C08380Uo.LIZ(LIZJ, LLLLIIL.length, ") disagree", LIZJ));
            } catch (Throwable th) {
                PVA.LJ(source);
                throw th;
            }
        }
        throw new IOException(C61845OOz.LIZ("Cannot buffer entire body for content length: ", contentLength));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        PVA.LJ(source());
    }

    public final String string() {
        PW3 source = source();
        try {
            return source.LLLLL(PVA.LIZIZ(source, charset()));
        } finally {
            PVA.LJ(source);
        }
    }

    public static PVM create(C39745Fin c39745Fin, String string) {
        Charset charset = PVA.LJIIIIZZ;
        if (c39745Fin != null) {
            Charset LIZ = c39745Fin.LIZ(null);
            if (LIZ == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(c39745Fin);
                LIZ2.append("; charset=utf-8");
                c39745Fin = C39745Fin.LIZJ(X1D.LIZIZ(LIZ2));
            } else {
                charset = LIZ;
            }
        }
        C64533PUj c64533PUj = new C64533PUj();
        o.LJIIJ(string, "string");
        o.LJIIJ(charset, "charset");
        c64533PUj.LJJIL(string, 0, string.length(), charset);
        return create(c39745Fin, c64533PUj.LJLILLLLZI, c64533PUj);
    }

    public static PVM create(C39745Fin c39745Fin, C64537PUn byteString) {
        C64533PUj c64533PUj = new C64533PUj();
        o.LJIIJ(byteString, "byteString");
        byteString.write$jvm(c64533PUj);
        return create(c39745Fin, byteString.size(), c64533PUj);
    }

    public static PVM create(C39745Fin c39745Fin, byte[] bArr) {
        C64533PUj c64533PUj = new C64533PUj();
        c64533PUj.m27write(bArr);
        return create(c39745Fin, bArr.length, c64533PUj);
    }

    public static PVM create(C39745Fin c39745Fin, long j, PW3 pw3) {
        if (pw3 != null) {
            return new PVO(c39745Fin, j, pw3);
        }
        throw new NullPointerException("source == null");
    }
}
