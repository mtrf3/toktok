package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23220ve {
    public Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C23220ve() {
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = new LinkedHashMap();
    }

    public final void LIZ(C43911nv indicationInstance) {
        o.LJIIIZ(indicationInstance, "indicationInstance");
        Object obj = ((java.util.Map) this.LIZ).get(indicationInstance);
        if (obj != null) {
            ((java.util.Map) this.LIZIZ).remove(obj);
        }
        ((java.util.Map) this.LIZ).remove(indicationInstance);
    }

    public /* synthetic */ C23220ve(Bitmap bitmap, Rect rect) {
        o.LJIIIZ(bitmap, "bitmap");
        this.LIZ = rect;
        if (bitmap.getConfig() == Bitmap.Config.RGB_565) {
            this.LIZIZ = bitmap;
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size(), options);
        o.LJIIIIZZ(decodeByteArray, "decodeByteArray(dataByte…0, dataByte.size(), opts)");
        this.LIZIZ = decodeByteArray;
    }
}
