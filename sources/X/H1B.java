package X;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1B {
    public final /* synthetic */ H15 LIZ;

    public H1B(H15 h15) {
        this.LIZ = h15;
    }

    public final String LIZ(H16 h16) {
        if (h16.LIZJ.LJ) {
            Object value = this.LIZ.LIZIZ.getValue();
            o.LJIIIIZZ(value, "<get-poolDir>(...)");
            return (String) value;
        }
        return this.LIZ.LJ();
    }

    public static File LIZIZ(Bitmap bitmap, String fileName, String str, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(fileName, "fileName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        String LIZIZ = C025908h.LIZIZ(LIZ, File.separator, fileName, ".jpg", LIZ);
        File file = new File(LIZIZ);
        String name = file.getName();
        o.LJIIIIZZ(name, "file.name");
        C86793Y4n.LJJIJL(bitmap, str, name, false);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LIZIZ);
        }
        return file;
    }
}
