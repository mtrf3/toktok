package X;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.GcA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41882GcA<T, R> implements InterfaceC48038ItG {
    public static final C41882GcA<T, R> LJLIL = new C41882GcA<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        Bitmap bitmap;
        C41881Gc9 it = (C41881Gc9) obj;
        o.LJIIIZ(it, "it");
        if (it.LIZ != null || (bitmap = it.LIZIZ) == null || bitmap.isRecycled()) {
            return it;
        }
        File cacheDir = C60903NvH.LJ.getCacheDir();
        o.LJIIIIZZ(cacheDir, "getApplication().cacheDir");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis());
        LIZ.append("_temp.jpg");
        File LLLILZJ = OR7.LLLILZJ(cacheDir, X1D.LIZIZ(LIZ));
        C42300Giu.LIZ(bitmap, LLLILZJ, 70, Bitmap.CompressFormat.JPEG);
        return C41884GcC.LIZIZ(LLLILZJ.getPath());
    }
}
