package X;

import Y.ARunnableS32S0200000_13;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.lynx.tasm.base.LLog;

/* renamed from: X.V9u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79286V9u implements InterfaceC79291V9z {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ C79285V9t LJ;

    public final void LIZ(Object obj) {
        try {
            if (!(obj instanceof C81392Vwy)) {
                this.LJ.LJI();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("localCache image is not CloseableReference and the url is: ");
                LIZ.append(this.LIZ);
                LLog.LIZLLL(3, "ImageDelegate", X1D.LIZIZ(LIZ));
                return;
            }
            Object LJI = ((C81392Vwy) obj).LJI();
            if (!(LJI instanceof Bitmap) && !(LJI instanceof W5B)) {
                this.LJ.LJI();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("localCache cannot get bitmap and the url is: ");
                LIZ2.append(this.LIZ);
                LLog.LIZLLL(3, "ImageDelegate", X1D.LIZIZ(LIZ2));
                return;
            }
            ARunnableS32S0200000_13 aRunnableS32S0200000_13 = new ARunnableS32S0200000_13(obj, this, 35);
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                aRunnableS32S0200000_13.run();
            } else {
                new Handler(C16880lQ.LLJJJJ()).post(aRunnableS32S0200000_13);
            }
        } catch (Throwable unused) {
            this.LJ.LJI();
        }
    }

    public C79286V9u(C79285V9t c79285V9t, String str, int i, int i2, long j) {
        this.LJ = c79285V9t;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
    }
}
