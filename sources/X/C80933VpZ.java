package X;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.VpZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80933VpZ implements InterfaceC80940Vpg {
    public final Context LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC80940Vpg
    public final String getKey() {
        return "blur-transform";
    }

    public C80933VpZ(Context context, int i) {
        this.LIZ = context;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC80940Vpg
    public final C80935Vpb LIZ(Bitmap bitmap, InterfaceC80941Vph interfaceC80941Vph) {
        return LIZIZ(bitmap, interfaceC80941Vph);
    }

    public final C80935Vpb LIZIZ(Bitmap bitmap, InterfaceC80941Vph factory) {
        Bitmap bitmap2;
        float f;
        int i;
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(factory, "factory");
        Bitmap.Config config = bitmap.getConfig();
        o.LJIIIIZZ(config, "bitmap.getConfig()");
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            bitmap2 = bitmap.copy(config2, true);
            o.LJIIIIZZ(bitmap2, "bitmap.copy(Bitmap.Config.ARGB_8888, true)");
        } else {
            bitmap2 = bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f = 0.6f;
        } else if (width < 200 || height < 200) {
            f = 0.3f;
        } else {
            f = 0.1f;
        }
        int LJJIIZ = O6R.LJJIIZ(width * f);
        int LJJIIZ2 = O6R.LJJIIZ(height * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, LJJIIZ, LJJIIZ2, false);
        if (f != 0.0f) {
            float f2 = LJJIIZ;
            float f3 = LJJIIZ2;
            if (Math.abs((f2 / f3) - this.LIZIZ) > 0.2f) {
                int i2 = (int) (f2 / f);
                if (i2 > LJJIIZ2) {
                    i = (int) (f3 * f);
                    i2 = LJJIIZ2;
                } else {
                    i = LJJIIZ;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (LJJIIZ - i) >> 1, (LJJIIZ2 - i2) >> 1, i, i2);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                LJJIIZ = i;
                LJJIIZ2 = i2;
            }
        }
        C81392Vwy<Bitmap> LJ = ((C80939Vpf) factory).LIZ.LJ(LJJIIZ, LJJIIZ2, Bitmap.Config.ARGB_8888);
        C80935Vpb c80935Vpb = new C80935Vpb(LJ);
        C80927VpT.LIZ(this.LIZIZ, this.LIZ, createScaledBitmap, LJ.LJI());
        createScaledBitmap.recycle();
        return c80935Vpb;
    }
}
