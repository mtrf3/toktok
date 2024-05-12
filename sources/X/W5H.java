package X;

import Y.ARunnableS33S0200000_14;
import Y.ARunnableS47S0100000_11;
import Y.ARunnableS50S0100000_14;
import android.graphics.Bitmap;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class W5H extends AbstractC32209CkX {
    public final /* synthetic */ W5E LIZ;
    public final /* synthetic */ W53 LIZIZ;
    public final /* synthetic */ InterfaceC81715W5f LIZJ;
    public final /* synthetic */ W4W LIZLLL;
    public final /* synthetic */ InterfaceC78660Uu0 LJ;
    public final /* synthetic */ FrescoImageLoaderImpl LJFF;

    @Override // X.AbstractC32664Crs, X.IHD
    public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
        if (abstractC48384Iyq == null) {
            return;
        }
        this.LJFF.getCallbackExecutor(this.LIZ).execute(new RunnableC81712W5c(this, abstractC48384Iyq.LIZ()));
    }

    @Override // X.AbstractC32664Crs, X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
        HWC.LIZIZ(this.LIZ);
        if (abstractC48384Iyq == null) {
            return;
        }
        abstractC48384Iyq.close();
        this.LJFF.getCallbackExecutor(this.LIZ).execute(new ARunnableS50S0100000_14(this, 20));
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        HWC.LIZIZ(this.LIZ);
        if (w4w == null) {
            return;
        }
        this.LJFF.getCallbackExecutor(this.LIZ).execute(new ARunnableS33S0200000_14(this, w4w.LJFF(), 11));
    }

    @Override // X.AbstractC32209CkX, X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<W5A>> w4w) {
        Bitmap bitmap;
        C79083V1z.LJ(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "onNewResultImpl$$0");
        if (!w4w.LIZIZ()) {
            C79083V1z.LIZIZ(0, "FrescoImageLoaderImpl", "onNewResultImpl$$0", "dataSource unfinished");
            return;
        }
        C81392Vwy<W5A> result = w4w.getResult();
        if (result == null) {
            C79083V1z.LIZIZ(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "onNewResultImpl$$0", "closeableImageRef is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scene_tag", this.LIZ.LJJIII);
        this.LIZIZ.LJIIIZ(null, result.LJI(), null, this.LIZJ.LIZ(w4w), hashMap);
        if (result.LJI() instanceof W5B) {
            bitmap = ((W5B) result.LJI()).getUnderlyingBitmap();
        } else {
            bitmap = null;
        }
        try {
            LJI(bitmap);
        } finally {
            C81392Vwy.LJ(result);
        }
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        C79083V1z.LJ(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "onNewResultImpl$$1");
        HWC.LIZIZ(this.LIZ);
        if (this.LIZLLL.LIZIZ() && bitmap != null && !bitmap.isRecycled()) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            try {
                Bitmap copy = bitmap.copy(config, true);
                this.LIZLLL.close();
                this.LJFF.getCallbackExecutor(this.LIZ).execute(new ARunnableS33S0200000_14(this, copy, 10));
                return;
            } catch (Throwable th) {
                if (W5U.LIZLLL().LIZ) {
                    W5I.LIZ().LIZ();
                    C49612JdY.LIZ.LIZIZ();
                    System.gc();
                    this.LJFF.getCallbackExecutor(this.LIZ).execute(new ARunnableS47S0100000_11(this, 25));
                    return;
                }
                throw th;
            }
        }
        this.LJFF.getCallbackExecutor(this.LIZ).execute(new ARunnableS50S0100000_14(this, 19));
    }

    public W5H(FrescoImageLoaderImpl frescoImageLoaderImpl, W5E w5e, W53 w53, InterfaceC81715W5f interfaceC81715W5f, W4W w4w, InterfaceC78660Uu0 interfaceC78660Uu0) {
        this.LJFF = frescoImageLoaderImpl;
        this.LIZ = w5e;
        this.LIZIZ = w53;
        this.LIZJ = interfaceC81715W5f;
        this.LIZLLL = w4w;
        this.LJ = interfaceC78660Uu0;
    }
}
