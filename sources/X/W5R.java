package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;

/* loaded from: classes15.dex */
public final class W5R {
    public static V92 LIZ(ImageView imageView, W5E w5e) {
        if (imageView == null || w5e == null) {
            return null;
        }
        V8L v8l = new V8L();
        S3L s3l = w5e.LJJ;
        if (s3l != null) {
            v8l = FrescoImageLoaderImpl.circleConvertRoundParams(v8l, s3l);
        }
        Resources resources = imageView.getResources();
        C79077V1t c79077V1t = new C79077V1t(resources);
        c79077V1t.LJIIL = w5e.LJIJJ;
        c79077V1t.LJIILL = v8l;
        EnumC72807Shn enumC72807Shn = w5e.LJIL;
        if (enumC72807Shn != null) {
            c79077V1t.LJIIJ = C78718Uuw.LIZ(enumC72807Shn);
        }
        int i = w5e.LJIILL;
        if (i > 0) {
            c79077V1t.LIZJ = resources.getDrawable(i);
            EnumC72807Shn enumC72807Shn2 = w5e.LJIIZILJ;
            if (enumC72807Shn2 != null) {
                c79077V1t.LIZLLL = C78718Uuw.LIZ(enumC72807Shn2);
            }
        } else {
            Drawable drawable = w5e.LJIILLIIL;
            if (drawable != null) {
                c79077V1t.LIZJ = drawable;
                EnumC72807Shn enumC72807Shn3 = w5e.LJIIZILJ;
                if (enumC72807Shn3 != null) {
                    c79077V1t.LIZLLL = C78718Uuw.LIZ(enumC72807Shn3);
                }
            }
        }
        int i2 = w5e.LJIJ;
        if (i2 > 0) {
            c79077V1t.LJI = resources.getDrawable(i2);
        } else {
            Drawable drawable2 = w5e.LJIJI;
            if (drawable2 != null) {
                c79077V1t.LJI = drawable2;
            }
        }
        Drawable drawable3 = w5e.LJJIZ;
        if (drawable3 != null) {
            c79077V1t.LJ = drawable3;
        }
        int i3 = w5e.LJIILJJIL;
        if (i3 >= 0) {
            C79077V1t.LJIJ = i3;
        }
        return c79077V1t.LIZ();
    }
}
