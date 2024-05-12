package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.ecommerce.preloader.EcomRoundedCornerPostprocessor;
import kotlin.jvm.internal.o;

/* renamed from: X.Uva, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78758Uva extends V9H {
    public static final /* synthetic */ int LJJIJ = 0;
    public final Context LJJIIZI;

    public C78758Uva(Context context) {
        super(context, W5I.LIZJ(), null, false);
        this.LJJIIZI = context;
    }

    public final boolean LJFF(String bizScene, String src, int i, int i2, boolean z, Bitmap.Config bitmapConfig, int i3, int i4, int i5, int i6, float[] borderRadii, InterfaceC78716Uuu scaleType) {
        W5O LIZ;
        o.LJIIIZ(bizScene, "bizScene");
        o.LJIIIZ(src, "src");
        o.LJIIIZ(bitmapConfig, "bitmapConfig");
        o.LJIIIZ(borderRadii, "borderRadii");
        o.LJIIIZ(scaleType, "scaleType");
        if (i < 1 || i2 < 1 || (i == 1 && i2 == 1)) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C79285V9t c79285V9t = this.LJJIIJ;
        c79285V9t.LJIIIZ = bitmapConfig;
        c79285V9t.LJIJI.LIZJ();
        if (z) {
            W5P LIZIZ = W5P.LIZIZ(LIZ(new C117434jD(this.LJJIIZI, src, 0), i, i2, i3, i4, i5, i6, borderRadii, scaleType));
            LIZIZ.LJIIJ = new EcomRoundedCornerPostprocessor(src, i, i2, i3, i4, i5, i6, borderRadii, scaleType, null, null, bitmapConfig);
            LIZ = LIZIZ.LIZ();
        } else {
            W5P LIZLLL = W5P.LIZLLL(C17N.LJJJJIZL(src));
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(bitmapConfig);
            imageDecodeOptionsBuilder.getClass();
            LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
            LIZLLL.LIZJ = new C79238V7y(i, i2);
            LIZLLL.LIZLLL = V85.LIZJ;
            LIZ = LIZLLL.LIZ();
        }
        V91 LIZLLL2 = W5I.LIZ().LJIIIIZZ.LIZLLL(LIZ, null);
        if (W5I.LIZ().LIZLLL.LJFF(LIZLLL2) == null) {
            C78757UvZ c78757UvZ = new C78757UvZ(this, bizScene, LIZLLL2);
            C79238V7y c79238V7y = LIZ.LJIIIIZZ;
            if (c79238V7y != null) {
                C58403Mw3.LIZIZ.put(src, c79238V7y);
            }
            ((AbstractC48384Iyq) W5I.LIZ().LJ(LIZ, null)).LJ(new C78759Uvb(c78757UvZ, elapsedRealtime), C10K.LJI);
            return true;
        }
        return false;
    }
}
