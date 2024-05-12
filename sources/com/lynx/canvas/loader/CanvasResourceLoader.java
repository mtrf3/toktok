package com.lynx.canvas.loader;

import X.C39981Fmb;
import X.C39984Fme;
import X.O3M;
import X.O5Y;
import X.VA4;
import X.VEZ;
import X.VU8;
import X.VU9;
import X.VUA;
import X.VUB;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.lynx.canvas.KryptonApp;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public class CanvasResourceLoader {
    public final VU9 LIZ = new VU9();
    public final VU8 LIZIZ;

    public CanvasResourceLoader(KryptonApp kryptonApp) {
        VU8 vu8 = new VU8();
        this.LIZIZ = vu8;
        new WeakReference(kryptonApp);
        vu8.LIZIZ = kryptonApp.LIZ;
    }

    public Bitmap decodeDataURLSync(String str) {
        Bitmap bitmap;
        this.LIZ.getClass();
        if (!str.startsWith("data:") || str.indexOf("base64,") == -1) {
            O5Y.LJIILIIL("KryptonImageLoader", "decode DataURL failed, not data url");
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(str.indexOf("base64,") + 7), 0);
            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("decode DataURL failed, throw exception ");
            LIZ.append(e);
            O5Y.LJIILIIL("KryptonImageLoader", X1D.LIZIZ(LIZ));
            bitmap = null;
        }
        if (bitmap == null) {
            O5Y.LJIILIIL("KryptonImageLoader", "decode DataURL failed, bitmap = null ");
            return null;
        }
        return bitmap;
    }

    public String redirectUrl(String str, long j) {
        this.LIZIZ.getClass();
        return VU8.LIZLLL(str, j);
    }

    public void loadImage(String str, long j, long j2) {
        CanvasResourceResolver canvasResourceResolver = new CanvasResourceResolver(j);
        this.LIZ.getClass();
        try {
            String LIZ = VU9.LIZ(j2, str);
            if (LIZ == null || LIZ.length() <= 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("load ");
                LIZ2.append(str);
                LIZ2.append(" from invalid path after redirect");
                O5Y.LJJJ("KryptonImageLoader", X1D.LIZIZ(LIZ2));
                VU9.LIZIZ(str, canvasResourceResolver);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("load ");
                LIZ3.append(LIZ);
                LIZ3.append("from redirect url");
                O5Y.LJJJ("KryptonImageLoader", X1D.LIZIZ(LIZ3));
                VU9.LIZIZ(LIZ, canvasResourceResolver);
            }
        } catch (Exception e) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("load ");
            LIZ4.append(str);
            LIZ4.append(" exception");
            O5Y.LJIILIIL("KryptonImageLoader", X1D.LIZIZ(LIZ4));
            canvasResourceResolver.LIZ(e.getMessage());
        }
    }

    public void loadAssets(String str, long j, long j2, boolean z) {
        int i;
        CanvasResourceResolver canvasResourceResolver = new CanvasResourceResolver(j);
        VU8 vu8 = this.LIZIZ;
        vu8.getClass();
        String LIZLLL = VU8.LIZLLL(str, j2);
        if (LIZLLL != null && (LIZLLL.startsWith("http://") || LIZLLL.startsWith("https://"))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("load path: ");
            LIZ.append(LIZLLL);
            LIZ.append(" from network.");
            O5Y.LJIILIIL("AssetsLoader", X1D.LIZIZ(LIZ));
            O3M o3m = new O3M();
            VA4 va4 = (VA4) VEZ.LIZIZ().LIZ(VA4.class);
            if (va4 != null) {
                va4.fetchResourceAsync(LIZLLL, o3m, new VUA(vu8, canvasResourceResolver, z, LIZLLL));
                return;
            }
            C39984Fme c39984Fme = new C39984Fme(LIZLLL);
            if (C39981Fmb.LIZIZ == null) {
                synchronized (C39981Fmb.class) {
                    if (C39981Fmb.LIZIZ == null) {
                        C39981Fmb.LIZIZ = new C39981Fmb();
                    }
                }
            }
            C39981Fmb.LIZIZ.LIZ(c39984Fme, new VUB(vu8, canvasResourceResolver, z));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("load path: ");
        LIZ2.append(LIZLLL);
        LIZ2.append(" from local.");
        O5Y.LJIILIIL("AssetsLoader", X1D.LIZIZ(LIZ2));
        if (vu8.LIZIZ == null) {
            O5Y.LJIILIIL("AssetsLoader", "Local Loader setup failed for mContext == null.");
            VU8.LJ(canvasResourceResolver, "Local Loader setup failed", z);
            return;
        }
        try {
            if (LIZLLL.startsWith("assets:///") || LIZLLL.startsWith("asset:///")) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("load path: ");
                LIZ3.append(LIZLLL);
                LIZ3.append(" from assert.");
                O5Y.LJJJ("AssetsLoader", X1D.LIZIZ(LIZ3));
                if (LIZLLL.startsWith("assets:///")) {
                    i = 10;
                } else {
                    i = 9;
                }
                VU8.LIZJ(vu8.LIZIZ.getResources().getAssets().open(LIZLLL.substring(i)), canvasResourceResolver, z, 0);
            } else if (LIZLLL.startsWith("res:///")) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("load path: ");
                LIZ4.append(LIZLLL);
                LIZ4.append(" from resource.");
                O5Y.LJJJ("AssetsLoader", X1D.LIZIZ(LIZ4));
                VU8.LIZJ(vu8.LIZIZ.getResources().openRawResource(vu8.LIZIZ.getResources().getIdentifier(LIZLLL.substring(7), "drawable", vu8.LIZIZ.getPackageCodePath())), canvasResourceResolver, z, 0);
            } else if (LIZLLL.startsWith("file://")) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("load path: ");
                LIZ5.append(LIZLLL);
                LIZ5.append(" from file.");
                O5Y.LJJJ("AssetsLoader", X1D.LIZIZ(LIZ5));
                VU8.LIZIZ(canvasResourceResolver, LIZLLL.substring(7), z);
            } else if (LIZLLL.startsWith("data:")) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("load path: ");
                LIZ6.append(LIZLLL);
                LIZ6.append(" from data url.");
                O5Y.LJJJ("AssetsLoader", X1D.LIZIZ(LIZ6));
                VU8.LIZ(canvasResourceResolver, LIZLLL, z);
            } else {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("load invalid path: ");
                LIZ7.append(LIZLLL);
                O5Y.LJIILIIL("AssetsLoader", X1D.LIZIZ(LIZ7));
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("invalid path");
                LIZ8.append(LIZLLL);
                VU8.LJ(canvasResourceResolver, X1D.LIZIZ(LIZ8), z);
            }
        } catch (Exception e) {
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append("load path exception: ");
            LIZ9.append(e.toString());
            O5Y.LJIILIIL("AssetsLoader", X1D.LIZIZ(LIZ9));
            VU8.LJ(canvasResourceResolver, e.getMessage(), z);
        } catch (OutOfMemoryError e2) {
            O5Y.LJIILIIL("AssetsLoader", "load path out of memory");
            VU8.LJ(canvasResourceResolver, e2.getMessage(), z);
        }
    }

    public byte[] encodeBitmap(ByteBuffer byteBuffer, int i, int i2, int i3, float f) {
        Bitmap.CompressFormat compressFormat;
        if (i == 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            if (i == 1) {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i2 * i3) / 4) + 256);
        if (createBitmap.compress(compressFormat, Math.round(f * 100.0f), byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }
}
