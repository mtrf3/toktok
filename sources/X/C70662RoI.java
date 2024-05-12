package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import ujb.o;

/* renamed from: X.RoI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70662RoI implements InterfaceC78660Uu0 {
    public final /* synthetic */ C70663RoJ LJLIL;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    public C70662RoI(C70663RoJ c70663RoJ) {
        this.LJLIL = c70663RoJ;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (o.LJJJJJL(this.LJLIL.LIZIZ)) {
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            C70663RoJ c70663RoJ = this.LJLIL;
            c70663RoJ.LJFF = bitmapDrawable;
            c70663RoJ.LIZ(bitmapDrawable);
        }
        String str = this.LJLIL.LIZ;
        RunnableC70664RoK runnableC70664RoK = new RunnableC70664RoK(str);
        ConcurrentHashMap<String, Runnable> concurrentHashMap = C70660RoG.LIZ;
        Runnable runnable = concurrentHashMap.get(str);
        if (runnable != null) {
            ((Handler) C70660RoG.LIZIZ.getValue()).removeCallbacks(runnable);
        }
        concurrentHashMap.put(str, runnableC70664RoK);
        ((Handler) C70660RoG.LIZIZ.getValue()).postDelayed(runnableC70664RoK, 10000L);
    }
}
