package X;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public class W7I extends W90<C81392Vwy<W5A>, C81392Vwy<W5A>> {
    public final int LIZJ;
    public final int LIZLLL;

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        W5A w5a;
        Bitmap underlyingBitmap;
        C81392Vwy c81392Vwy = (C81392Vwy) obj;
        if (c81392Vwy != null && c81392Vwy.LJIIJ() && (w5a = (W5A) c81392Vwy.LJI()) != null && !w5a.isClosed() && (w5a instanceof W5C) && (underlyingBitmap = ((W5B) w5a).getUnderlyingBitmap()) != null) {
            int height = underlyingBitmap.getHeight() * underlyingBitmap.getRowBytes();
            if (height >= this.LIZJ && height <= this.LIZLLL) {
                underlyingBitmap.prepareToDraw();
            }
        }
        this.LIZIZ.LIZIZ(i, c81392Vwy);
    }

    public W7I(W7F<C81392Vwy<W5A>> w7f, int i, int i2) {
        super(w7f);
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
