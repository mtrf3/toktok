package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Vwi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81376Vwi implements W84 {
    public final W82 LIZ;
    public final W8H LIZIZ;

    @Override // X.W84
    public final C81373Vwf LIZJ() {
        return new C81373Vwf(this.LIZIZ);
    }

    @Override // X.W84
    public final C80632Vki LIZ(InputStream inputStream) {
        C81373Vwf c81373Vwf = new C81373Vwf(this.LIZIZ);
        try {
            this.LIZ.LIZ(inputStream, c81373Vwf);
            return c81373Vwf.LIZ();
        } finally {
            c81373Vwf.close();
        }
    }

    @Override // X.W84
    public final C80632Vki LIZLLL(byte[] bArr) {
        C81373Vwf c81373Vwf = new C81373Vwf(this.LIZIZ, bArr.length);
        try {
            try {
                c81373Vwf.write(bArr, 0, bArr.length);
                return c81373Vwf.LIZ();
            } catch (IOException e) {
                J7I.LJIIL(e);
                throw null;
            }
        } finally {
            c81373Vwf.close();
        }
    }

    @Override // X.W84
    public final C81373Vwf LJ(int i) {
        return new C81373Vwf(this.LIZIZ, i);
    }

    public C81376Vwi(W8H w8h, W82 w82) {
        this.LIZIZ = w8h;
        this.LIZ = w82;
    }

    @Override // X.W84
    public final C80632Vki LIZIZ(InputStream inputStream, int i) {
        C81373Vwf c81373Vwf = new C81373Vwf(this.LIZIZ, i);
        try {
            this.LIZ.LIZ(inputStream, c81373Vwf);
            return c81373Vwf.LIZ();
        } finally {
            c81373Vwf.close();
        }
    }
}
