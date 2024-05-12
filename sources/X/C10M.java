package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.10M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10M {
    public static final Object LJFF = new Object();
    public final Context LIZ;
    public final String LIZIZ;
    public C0GP LIZJ;
    public final java.util.Map<String, C04750Gp> LIZLLL;
    public final boolean LJ;

    public final void LIZJ() {
        if (this.LJ) {
            return;
        }
        try {
            synchronized (LJFF) {
                Iterator<Map.Entry<String, C04750Gp>> it = this.LIZLLL.entrySet().iterator();
                while (it.hasNext()) {
                    C04750Gp value = it.next().getValue();
                    Bitmap bitmap = value.LJI;
                    if (bitmap != null) {
                        bitmap.recycle();
                        value.LJI = null;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZLLL() {
        if (this.LJ) {
            return;
        }
        try {
            synchronized (LJFF) {
                Iterator<Map.Entry<String, C04750Gp>> it = this.LIZLLL.entrySet().iterator();
                while (it.hasNext()) {
                    C04750Gp value = it.next().getValue();
                    if (value.LJI != null) {
                        value.LJI = null;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final Bitmap LIZ(String str) {
        Bitmap decodeStream;
        C04750Gp c04750Gp = this.LIZLLL.get(str);
        if (c04750Gp == null) {
            return null;
        }
        Bitmap bitmap = c04750Gp.LJI;
        if (bitmap != null) {
            return bitmap;
        }
        c04750Gp.LJII = false;
        c04750Gp.LJIIIIZZ = false;
        if (C03970Dp.LIZ && C03970Dp.LJFF && C04010Dt.LIZJ) {
            int i = c04750Gp.LIZ;
            int i2 = c04750Gp.LIZIZ;
            if (i >= 32 && i2 >= 32) {
                c04750Gp.LJIIIIZZ = true;
            }
        }
        C0GP c0gp = this.LIZJ;
        if (c0gp != null) {
            Bitmap LJIILLIIL = c0gp.LJIILLIIL(c04750Gp);
            if (LJIILLIIL != null) {
                LIZIZ(LJIILLIIL, str);
            }
            return LJIILLIIL;
        }
        String str2 = c04750Gp.LIZLLL;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                LIZIZ(decodeByteArray, str);
                return decodeByteArray;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.LIZIZ)) {
                C0GK LIZ = C0GH.LIZ();
                IllegalStateException illegalStateException = new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fileName=");
                LIZ2.append(str2);
                LIZ2.append(" id=");
                LIZ2.append(str);
                LIZ.LIZ(illegalStateException, X1D.LIZIZ(LIZ2));
                return null;
            }
            Context context = this.LIZ;
            if (context == null) {
                C0GK LIZ3 = C0GH.LIZ();
                IllegalStateException illegalStateException2 = new IllegalStateException("context is null!");
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("fileName=");
                LIZ4.append(str2);
                LIZ4.append(" id=");
                LIZ4.append(str);
                LIZ3.LIZ(illegalStateException2, X1D.LIZIZ(LIZ4));
                return null;
            }
            AssetManager assets = context.getAssets();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(this.LIZIZ);
            LIZ5.append(str2);
            InputStream open = assets.open(X1D.LIZIZ(LIZ5));
            if (C03970Dp.LIZ) {
                if (c04750Gp.LJIIIIZZ) {
                    options.inSampleSize = 2;
                }
                try {
                    decodeStream = C06310Mp.LJFF(BitmapFactory.decodeStream(open, null, options), c04750Gp.LIZ, c04750Gp.LIZIZ, c04750Gp);
                } catch (IllegalArgumentException e) {
                    if (!C04020Du.LIZ) {
                        return null;
                    }
                    throw e;
                } catch (OutOfMemoryError e2) {
                    if (!C04020Du.LIZ) {
                        return null;
                    }
                    throw e2;
                }
            } else {
                decodeStream = BitmapFactory.decodeStream(open, null, options);
            }
            LIZIZ(decodeStream, str);
            return decodeStream;
        } catch (IOException unused2) {
            return null;
        }
    }

    public final void LIZIZ(Bitmap bitmap, String str) {
        synchronized (LJFF) {
            this.LIZLLL.get(str).LJI = bitmap;
        }
    }

    public C10M(Drawable.Callback callback, String str, C0GP c0gp, java.util.Map<String, C04750Gp> map, boolean z) {
        this.LIZIZ = str;
        this.LJ = z;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.LIZIZ = C42398GkU.LIZIZ(str, '/');
        }
        if (!(callback instanceof View)) {
            this.LIZLLL = new HashMap();
            this.LIZ = null;
        } else {
            this.LIZ = ((View) callback).getContext();
            this.LIZLLL = map;
            this.LIZJ = c0gp;
        }
    }
}
