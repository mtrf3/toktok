package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: X.W8e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81792W8e implements InterfaceC81842WAc {
    public final InterfaceC81842WAc LIZ;
    public final InterfaceC81842WAc LIZIZ;
    public final InterfaceC81842WAc LIZJ;
    public final InterfaceC81842WAc LIZLLL;
    public final W95 LJ;
    public final C81793W8f LJFF = new C81793W8f(this);
    public final java.util.Map<C81828W9o, InterfaceC81842WAc> LJI;

    public static String LIZIZ(W8X w8x) {
        InputStream LJFF = w8x.LJFF();
        byte[] bArr = new byte[64];
        try {
            try {
                LJFF.read(bArr);
            } catch (IOException e) {
                Object[] objArr = new Object[0];
                if (W58.LIZ.LJIIIIZZ(5)) {
                    W58.LIZ.w("DefaultImageDecoder", C16880lQ.LLLZI(null, "read encode Image 64 byte", objArr), e);
                }
            }
            StringBuilder sb = new StringBuilder("ImageFormat:");
            w8x.LJIILIIL();
            sb.append(w8x.LJLJI.LIZ);
            sb.append(":");
            sb.append(Arrays.toString(bArr));
            return sb.toString();
        } finally {
            try {
                WFR.LIZ(LJFF);
            } catch (IOException unused) {
            }
        }
    }

    public final W5C LIZ(W8X w8x, C81810W8w c81810W8w) {
        Rect rect = w8x.LJLLJ;
        if (rect != null) {
            if (!c81810W8w.LJIIJJI) {
                rect = c81810W8w.LJIIL;
            }
        } else {
            rect = c81810W8w.LJIIL;
        }
        C81392Vwy<Bitmap> decodeFromEncodedImageWithColorSpace = this.LJ.decodeFromEncodedImageWithColorSpace(w8x, c81810W8w.LJII, rect, c81810W8w.LJI);
        try {
            W8A w8a = W8A.LIZLLL;
            w8x.LJIILIIL();
            int i = w8x.LJLJJI;
            w8x.LJIILIIL();
            int i2 = w8x.LJLJJL;
            Rect rect2 = w8x.LJLLJ;
            int i3 = w8x.LJLJLJ;
            w8x.LJIILIIL();
            return new W5C(decodeFromEncodedImageWithColorSpace, w8a, i, i2, rect, rect2, i3, w8x.LJLJI);
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }

    @Override // X.InterfaceC81842WAc
    public final W5A decode(W8X w8x, int i, InterfaceC45733HxB interfaceC45733HxB, C81810W8w c81810W8w) {
        InterfaceC81842WAc interfaceC81842WAc;
        InterfaceC81842WAc interfaceC81842WAc2 = c81810W8w.LJIIIIZZ;
        if (interfaceC81842WAc2 != null) {
            return interfaceC81842WAc2.decode(w8x, i, interfaceC45733HxB, c81810W8w);
        }
        w8x.LJIILIIL();
        C81828W9o c81828W9o = w8x.LJLJI;
        if (c81828W9o == null || c81828W9o == C81828W9o.LIZIZ) {
            try {
                c81828W9o = C81802W8o.LIZ(w8x.LJFF());
                w8x.LJLJI = c81828W9o;
            } catch (IOException e) {
                J7I.LJIIL(e);
                throw null;
            }
        }
        java.util.Map<C81828W9o, InterfaceC81842WAc> map = this.LJI;
        if (map != null && (interfaceC81842WAc = map.get(c81828W9o)) != null) {
            return interfaceC81842WAc.decode(w8x, i, interfaceC45733HxB, c81810W8w);
        }
        return this.LJFF.decode(w8x, i, interfaceC45733HxB, c81810W8w);
    }

    public C81792W8e(InterfaceC81842WAc interfaceC81842WAc, InterfaceC81842WAc interfaceC81842WAc2, InterfaceC81842WAc interfaceC81842WAc3, InterfaceC81842WAc interfaceC81842WAc4, W95 w95, java.util.Map<C81828W9o, InterfaceC81842WAc> map) {
        this.LIZ = interfaceC81842WAc;
        this.LIZIZ = interfaceC81842WAc2;
        this.LIZJ = interfaceC81842WAc3;
        this.LIZLLL = interfaceC81842WAc4;
        this.LJ = w95;
        this.LJI = map;
    }
}
