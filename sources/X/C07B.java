package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.07B, reason: invalid class name */
/* loaded from: classes.dex */
public class C07B {
    public static int LIZ(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C07D.LIZ(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public static String LIZIZ(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C07D.LIZIZ(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static int LIZJ(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C07D.LIZJ(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return -1;
        }
    }

    public static android.net.Uri LIZLLL(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C07D.LIZLLL(obj);
        }
        try {
            return (android.net.Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Drawable LJ(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon LJFF(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        switch (iconCompat.LIZ) {
            case -1:
                return (Icon) iconCompat.LIZIZ;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.LIZIZ);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(iconCompat.LJ(), iconCompat.LJ);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.LIZIZ, iconCompat.LJ, iconCompat.LJFF);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.LIZIZ);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = C07C.LIZIZ((Bitmap) iconCompat.LIZIZ);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.LIZIZ((Bitmap) iconCompat.LIZIZ, false));
                    break;
                }
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    createWithBitmap = C07E.LIZ(iconCompat.LJI());
                    break;
                } else if (context != null) {
                    InputStream LJII = iconCompat.LJII(context);
                    if (LJII != null) {
                        if (i >= 26) {
                            createWithBitmap = C07C.LIZIZ(BitmapFactory.decodeStream(LJII));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.LIZIZ(BitmapFactory.decodeStream(LJII), false));
                            break;
                        }
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Cannot load adaptive icon from uri: ");
                        LIZ.append(iconCompat.LJI());
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Context is required to resolve the file uri of the icon: ");
                    LIZ2.append(iconCompat.LJI());
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                }
        }
        ColorStateList colorStateList = iconCompat.LJI;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.LJII;
        if (mode != IconCompat.LJIIJ) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
