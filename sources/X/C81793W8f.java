package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import defpackage.i0;

/* renamed from: X.W8f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81793W8f implements InterfaceC81842WAc {
    public final /* synthetic */ C81792W8e LIZ;

    public C81793W8f(C81792W8e c81792W8e) {
        this.LIZ = c81792W8e;
    }

    @Override // X.InterfaceC81842WAc
    public final W5A decode(W8X w8x, int i, InterfaceC45733HxB interfaceC45733HxB, C81810W8w c81810W8w) {
        Bitmap.Config config;
        String str;
        InterfaceC81842WAc interfaceC81842WAc;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.LIZ(c81810W8w);
        w8x.LJIILIIL();
        if (c81810W8w.LJIIJ) {
            config = c81810W8w.LJII;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        imageDecodeOptionsBuilder.setBitmapConfig(config);
        C81810W8w c81810W8w2 = new C81810W8w(imageDecodeOptionsBuilder);
        w8x.LJIILIIL();
        C81828W9o c81828W9o = w8x.LJLJI;
        if (c81828W9o == C81796W8i.LIZ) {
            C81792W8e c81792W8e = this.LIZ;
            c81792W8e.getClass();
            Rect rect = w8x.LJLLJ;
            if (rect != null) {
                if (!c81810W8w2.LJIIJJI) {
                    rect = c81810W8w2.LJIIL;
                }
            } else {
                rect = c81810W8w2.LJIIL;
            }
            C81392Vwy<Bitmap> decodeJPEGFromEncodedImageWithColorSpace = c81792W8e.LJ.decodeJPEGFromEncodedImageWithColorSpace(w8x, c81810W8w2.LJII, rect, i, c81810W8w2.LJI);
            try {
                w8x.LJIILIIL();
                int i2 = w8x.LJLJJI;
                w8x.LJIILIIL();
                int i3 = w8x.LJLJJL;
                Rect rect2 = w8x.LJLLJ;
                int i4 = w8x.LJLJLJ;
                w8x.LJIILIIL();
                return new W5C(decodeJPEGFromEncodedImageWithColorSpace, interfaceC45733HxB, i2, i3, rect, rect2, i4, w8x.LJLJI);
            } finally {
                decodeJPEGFromEncodedImageWithColorSpace.close();
            }
        }
        if (c81828W9o == C81796W8i.LIZJ) {
            C81792W8e c81792W8e2 = this.LIZ;
            c81792W8e2.getClass();
            if (!c81810W8w2.LJFF && (interfaceC81842WAc = c81792W8e2.LIZ) != null) {
                return interfaceC81842WAc.decode(w8x, i, interfaceC45733HxB, c81810W8w2);
            }
            return c81792W8e2.LIZ(w8x, c81810W8w2);
        }
        if (c81828W9o == C81796W8i.LJIIIZ) {
            return this.LIZ.LIZIZ.decode(w8x, i, interfaceC45733HxB, c81810W8w2);
        }
        if (c81828W9o == C81794W8g.LIZIZ()) {
            return this.LIZ.LIZJ.decode(w8x, i, interfaceC45733HxB, c81810W8w);
        }
        if (c81828W9o == C81828W9o.LIZIZ) {
            try {
                byte[] bArr = new byte[22];
                C81826W9m.LIZ(w8x.LJFF(), bArr, 22);
                StringBuilder sb = new StringBuilder(44);
                int i5 = 0;
                do {
                    String hexString = Integer.toHexString(bArr[i5] & 255);
                    if (hexString.length() < 2) {
                        sb.append('0');
                    }
                    sb.append(hexString.toLowerCase());
                    i5++;
                } while (i5 < 22);
                str = sb.toString();
            } catch (Throwable unused) {
                str = "unknow";
            }
            throw new C81822W9i(i0.LJFF("unknown image format, errorHead: ", str), w8x);
        }
        return this.LIZ.LIZ(w8x, c81810W8w2);
    }
}
