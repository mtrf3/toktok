package X;

import android.graphics.Bitmap;
import com.ss.android.ttve.nativePort.TEImageInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.5xE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151605xE {
    public static boolean LIZ(Bitmap bitmap, String path, int i) {
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(path, "path");
        Boolean convertBitmapWithRgba = TEImageInterface.convertBitmapWithRgba(bitmap, path, i);
        o.LJIIIIZZ(convertBitmapWithRgba, "TEImageInterface.convert…hRgba(bitmap, path, mode)");
        return convertBitmapWithRgba.booleanValue();
    }
}
