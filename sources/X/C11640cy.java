package X;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.o;

/* renamed from: X.0cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11640cy {
    public static final AbstractC13230fX LIZ(Bitmap bitmap) {
        AbstractC13230fX LIZIZ;
        o.LJIIIZ(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (LIZIZ = LIZIZ(colorSpace)) != null) {
            return LIZIZ;
        }
        return C13240fY.LIZJ;
    }

    public static final AbstractC13230fX LIZIZ(ColorSpace colorSpace) {
        o.LJIIIZ(colorSpace, "<this>");
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB))) {
            return C13240fY.LIZJ;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.ACES))) {
            return C13240fY.LJIILJJIL;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return C13240fY.LJIILL;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return C13240fY.LJIIL;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020))) {
            return C13240fY.LJII;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.BT709))) {
            return C13240fY.LJI;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return C13240fY.LJIIZILJ;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return C13240fY.LJIILLIIL;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return C13240fY.LJIIIIZZ;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return C13240fY.LJIIIZ;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return C13240fY.LJ;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return C13240fY.LJFF;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return C13240fY.LIZLLL;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return C13240fY.LJIIJ;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return C13240fY.LJIILIIL;
        }
        if (o.LJ(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C))) {
            return C13240fY.LJIIJJI;
        }
        return C13240fY.LIZJ;
    }

    public static final ColorSpace LIZLLL(AbstractC13230fX abstractC13230fX) {
        ColorSpace.Named named;
        o.LJIIIZ(abstractC13230fX, "<this>");
        if (o.LJ(abstractC13230fX, C13240fY.LIZJ)) {
            named = ColorSpace.Named.SRGB;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIILJJIL)) {
            named = ColorSpace.Named.ACES;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIILL)) {
            named = ColorSpace.Named.ACESCG;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIIL)) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJII)) {
            named = ColorSpace.Named.BT2020;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJI)) {
            named = ColorSpace.Named.BT709;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIIZILJ)) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIILLIIL)) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIIIIZZ)) {
            named = ColorSpace.Named.DCI_P3;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIIIZ)) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJ)) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJFF)) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (o.LJ(abstractC13230fX, C13240fY.LIZLLL)) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIIJ)) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIILIIL)) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else if (o.LJ(abstractC13230fX, C13240fY.LJIIJJI)) {
            named = ColorSpace.Named.SMPTE_C;
        } else {
            named = ColorSpace.Named.SRGB;
        }
        ColorSpace colorSpace = ColorSpace.get(named);
        o.LJIIIIZZ(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }

    public static final Bitmap LIZJ(int i, int i2, int i3, boolean z, AbstractC13230fX colorSpace) {
        o.LJIIIZ(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, C78688UuS.LJJLIIIJJI(i3), z, LIZLLL(colorSpace));
        o.LJIIIIZZ(createBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return createBitmap;
    }
}
