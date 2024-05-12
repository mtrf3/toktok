package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import kotlin.jvm.internal.o;

/* renamed from: X.VpU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80928VpU {
    public static Bitmap LIZ(Context context, Bitmap bitmap) {
        if (!C30581Hy.LJLJI) {
            o.LJIIIZ(context, "context");
            C80930VpW.LIZ = RenderScript.create(context);
            C80930VpW.LIZIZ = new C80929VpV(C80930VpW.LIZ);
            C30581Hy.LJLJI = true;
        }
        Bitmap darkBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Allocation createFromBitmap = Allocation.createFromBitmap(C80930VpW.LIZ, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        Allocation createTyped = Allocation.createTyped(C80930VpW.LIZ, createFromBitmap.getType(), Allocation.MipmapControl.MIPMAP_NONE, 1);
        C80929VpV c80929VpV = C80930VpW.LIZIZ;
        if (c80929VpV != null) {
            c80929VpV.LIZ(createFromBitmap, createTyped);
        }
        createTyped.copyTo(darkBitmap);
        createFromBitmap.destroy();
        createTyped.destroy();
        o.LJIIIIZZ(darkBitmap, "darkBitmap");
        return darkBitmap;
    }
}
