package X;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes14.dex */
public final class V93 {
    public static final Drawable LIZ = new ColorDrawable(0);

    public static void LIZIZ(V95 v95, V8L v8l) {
        v95.LIZ(v8l.LIZIZ);
        v95.LJFF(v8l.LIZJ);
        v95.LIZIZ(v8l.LJ, v8l.LJFF);
        v95.LIZJ(v8l.LJI);
        v95.LJIIJJI(v8l.LJII);
    }

    public static Drawable LIZLLL(Drawable drawable, V8L v8l) {
        try {
            C81939WDv.LIZIZ();
            if (drawable != null && v8l != null && v8l.LIZ == V8K.OVERLAY_COLOR) {
                V98 v98 = new V98(drawable);
                LIZIZ(v98, v8l);
                v98.LJLLLL = v8l.LIZLLL;
                v98.invalidateSelf();
                return v98;
            }
            return drawable;
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public static Drawable LIZ(Drawable drawable, V8L v8l, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C80623VkZ c80623VkZ = new C80623VkZ(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            LIZIZ(c80623VkZ, v8l);
            return c80623VkZ;
        }
        if (drawable instanceof NinePatchDrawable) {
            C80625Vkb c80625Vkb = new C80625Vkb((NinePatchDrawable) drawable);
            LIZIZ(c80625Vkb, v8l);
            return c80625Vkb;
        }
        if (drawable instanceof ColorDrawable) {
            C72430Sbi c72430Sbi = new C72430Sbi(((ColorDrawable) drawable).getColor());
            LIZIZ(c72430Sbi, v8l);
            return c72430Sbi;
        }
        Object[] objArr = {drawable};
        if (W58.LIZ.LJIIIIZZ(5)) {
            W58.LIZ.w("WrappingUtils", C16880lQ.LLLZI(null, "Don't know how to round that drawable: %s", objArr));
        }
        return drawable;
    }

    public static Drawable LIZJ(Drawable drawable, V8L v8l, Resources resources) {
        try {
            C81939WDv.LIZIZ();
            if (drawable != null && v8l != null && v8l.LIZ == V8K.BITMAP_ONLY) {
                if (drawable instanceof C80627Vkd) {
                    InterfaceC79080V1w interfaceC79080V1w = (C80627Vkd) drawable;
                    while (true) {
                        Object LJIIIIZZ = interfaceC79080V1w.LJIIIIZZ();
                        if (LJIIIIZZ == interfaceC79080V1w || !(LJIIIIZZ instanceof InterfaceC79080V1w)) {
                            break;
                        }
                        interfaceC79080V1w = (InterfaceC79080V1w) LJIIIIZZ;
                    }
                    interfaceC79080V1w.LJ(LIZ(interfaceC79080V1w.LJ(LIZ), v8l, resources));
                    return drawable;
                }
                return LIZ(drawable, v8l, resources);
            }
            return drawable;
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public static Drawable LJ(Drawable drawable, InterfaceC78716Uuu interfaceC78716Uuu, PointF pointF) {
        C81939WDv.LIZIZ();
        if (drawable == null || interfaceC78716Uuu == null) {
            C81939WDv.LIZIZ();
            return drawable;
        }
        C79265V8z c79265V8z = new C79265V8z(drawable, interfaceC78716Uuu);
        if (pointF != null) {
            c79265V8z.LJIILLIIL(pointF);
        }
        C81939WDv.LIZIZ();
        return c79265V8z;
    }
}
