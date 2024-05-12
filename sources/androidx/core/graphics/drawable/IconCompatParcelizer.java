package androidx.core.graphics.drawable;

import X.AbstractC06170Mb;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0061. Please report as an issue. */
    public static IconCompat read(AbstractC06170Mb abstractC06170Mb) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.LIZ = abstractC06170Mb.LJIIIZ(iconCompat.LIZ, 1);
        byte[] bArr = iconCompat.LIZJ;
        if (abstractC06170Mb.LJII(2)) {
            bArr = abstractC06170Mb.LJFF();
        }
        iconCompat.LIZJ = bArr;
        iconCompat.LIZLLL = abstractC06170Mb.LJIIJJI(iconCompat.LIZLLL, 3);
        iconCompat.LJ = abstractC06170Mb.LJIIIZ(iconCompat.LJ, 4);
        iconCompat.LJFF = abstractC06170Mb.LJIIIZ(iconCompat.LJFF, 5);
        iconCompat.LJI = (ColorStateList) abstractC06170Mb.LJIIJJI(iconCompat.LJI, 6);
        String str = iconCompat.LJIIIIZZ;
        if (abstractC06170Mb.LJII(7)) {
            str = abstractC06170Mb.LJIIL();
        }
        iconCompat.LJIIIIZZ = str;
        String str2 = iconCompat.LJIIIZ;
        if (abstractC06170Mb.LJII(8)) {
            str2 = abstractC06170Mb.LJIIL();
        }
        iconCompat.LJIIIZ = str2;
        iconCompat.LJII = PorterDuff.Mode.valueOf(iconCompat.LJIIIIZZ);
        switch (iconCompat.LIZ) {
            case -1:
                Parcelable parcelable = iconCompat.LIZLLL;
                if (parcelable != null) {
                    iconCompat.LIZIZ = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.LIZLLL;
                if (parcelable2 != null) {
                    iconCompat.LIZIZ = parcelable2;
                } else {
                    byte[] bArr2 = iconCompat.LIZJ;
                    iconCompat.LIZIZ = bArr2;
                    iconCompat.LIZ = 3;
                    iconCompat.LJ = 0;
                    iconCompat.LJFF = bArr2.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.LIZJ, Charset.forName("UTF-16"));
                iconCompat.LIZIZ = str3;
                if (iconCompat.LIZ == 2 && iconCompat.LJIIIZ == null) {
                    iconCompat.LJIIIZ = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.LIZIZ = iconCompat.LIZJ;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC06170Mb abstractC06170Mb) {
        abstractC06170Mb.getClass();
        iconCompat.LJIIIIZZ = iconCompat.LJII.name();
        switch (iconCompat.LIZ) {
            case -1:
                iconCompat.LIZLLL = (Parcelable) iconCompat.LIZIZ;
                break;
            case 1:
            case 5:
                iconCompat.LIZLLL = (Parcelable) iconCompat.LIZIZ;
                break;
            case 2:
                iconCompat.LIZJ = ((String) iconCompat.LIZIZ).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.LIZJ = (byte[]) iconCompat.LIZIZ;
                break;
            case 4:
            case 6:
                iconCompat.LIZJ = iconCompat.LIZIZ.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.LIZ;
        if (-1 != i) {
            abstractC06170Mb.LJIJI(i, 1);
        }
        byte[] bArr = iconCompat.LIZJ;
        if (bArr != null) {
            abstractC06170Mb.LJIILJJIL(2);
            abstractC06170Mb.LJIILLIIL(bArr);
        }
        Parcelable parcelable = iconCompat.LIZLLL;
        if (parcelable != null) {
            abstractC06170Mb.LJIILJJIL(3);
            abstractC06170Mb.LJIJJ(parcelable);
        }
        int i2 = iconCompat.LJ;
        if (i2 != 0) {
            abstractC06170Mb.LJIJI(i2, 4);
        }
        int i3 = iconCompat.LJFF;
        if (i3 != 0) {
            abstractC06170Mb.LJIJI(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.LJI;
        if (colorStateList != null) {
            abstractC06170Mb.LJIILJJIL(6);
            abstractC06170Mb.LJIJJ(colorStateList);
        }
        String str = iconCompat.LJIIIIZZ;
        if (str != null) {
            abstractC06170Mb.LJIILJJIL(7);
            abstractC06170Mb.LJIJJLI(str);
        }
        String str2 = iconCompat.LJIIIZ;
        if (str2 != null) {
            abstractC06170Mb.LJIILJJIL(8);
            abstractC06170Mb.LJIJJLI(str2);
        }
    }
}
