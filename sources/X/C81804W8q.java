package X;

import android.graphics.Bitmap;

/* renamed from: X.W8q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81804W8q implements InterfaceC81842WAc {
    @Override // X.InterfaceC81842WAc
    public final W5A decode(W8X w8x, int i, InterfaceC45733HxB interfaceC45733HxB, C81810W8w c81810W8w) {
        C81392Vwy<Bitmap> decodeFromEncodedImageWithColorSpace = ((W8W) W8E.LJII().LJIIJJI()).decodeFromEncodedImageWithColorSpace(w8x, c81810W8w.LJII, null, c81810W8w.LJI);
        try {
            W8A w8a = W8A.LIZLLL;
            w8x.LJIILIIL();
            int i2 = w8x.LJLJJI;
            w8x.LJIILIIL();
            return new W5C(decodeFromEncodedImageWithColorSpace, w8a, i2, w8x.LJLJJL);
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }
}
