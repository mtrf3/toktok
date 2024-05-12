package X;

import Y.ARunnableS32S0200000_13;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import com.lynx.tasm.base.LLog;
import java.io.InputStream;

/* loaded from: classes14.dex */
public final class V9S extends AbstractC32664Crs<C81392Vwy<InterfaceC81378Vwk>> {
    public final /* synthetic */ V9U LIZ;
    public final /* synthetic */ V9R LIZIZ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<InterfaceC81378Vwk>> w4w) {
        V9U v9u;
        Throwable LJFF = w4w.LJFF();
        if (LJFF != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadBitmapFromRemote failed: ");
            LIZ.append(LJFF.toString());
            LLog.LIZLLL(4, "LynxImageHelper", X1D.LIZIZ(LIZ));
        }
        V9R v9r = this.LIZIZ;
        if (v9r.LIZ != null) {
            V9T v9t = v9r.LIZIZ;
            if (v9t != null && (v9u = v9t.LJFF) != null && v9u.LJFF != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Android BigImageDrawingHelper loading image from remote failed, and the url is ");
                LIZ2.append(this.LIZIZ.LIZIZ.LJFF.LJFF);
                LIZ2.append(". The Fresco throw error msg is ");
                LIZ2.append(LJFF.toString());
                X1D.LIZIZ(LIZ2);
            } else if (LJFF != null) {
                LJFF.toString();
            }
            this.LIZIZ.LIZ.LIZ();
        }
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<InterfaceC81378Vwk>> w4w) {
        C81392Vwy<InterfaceC81378Vwk> result;
        C81377Vwj c81377Vwj;
        V9U v9u;
        if (w4w.LIZIZ() && (result = w4w.getResult()) != null) {
            C81392Vwy<InterfaceC81378Vwk> clone = result.clone();
            try {
                c81377Vwj = new C81377Vwj(clone.LJI());
                try {
                    BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance((InputStream) c81377Vwj, false);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    V9T LJI = this.LIZIZ.LJI(this.LIZ, newInstance.getWidth(), newInstance.getHeight());
                    if (LJI != null) {
                        options.inSampleSize = LJI.LIZ;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        LJI.LIZLLL = newInstance.decodeRegion(LJI.LIZIZ, options);
                        LJI.LJ = false;
                        V9R v9r = this.LIZIZ;
                        v9r.LIZJ.post(new ARunnableS32S0200000_13(LJI, v9r, 98));
                    }
                    newInstance.recycle();
                } catch (Throwable th) {
                    th = th;
                    try {
                        V9R v9r2 = this.LIZIZ;
                        if (v9r2.LIZ != null) {
                            V9T v9t = v9r2.LIZIZ;
                            if (v9t != null && (v9u = v9t.LJFF) != null && v9u.LJFF != null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Android BigImageDrawingHelper loading image from remote onNewResultImpl failed, and the url is ");
                                LIZ.append(this.LIZIZ.LIZIZ.LJFF.LJFF);
                                LIZ.append(". The Fresco throw error msg is ");
                                LIZ.append(th.toString());
                                X1D.LIZIZ(LIZ);
                            } else {
                                th.toString();
                            }
                            this.LIZIZ.LIZ.LIZ();
                        }
                    } finally {
                        V9R.LIZIZ(c81377Vwj);
                        result.close();
                        clone.close();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c81377Vwj = null;
            }
        }
    }

    public V9S(V9R v9r, V9U v9u) {
        this.LIZIZ = v9r;
        this.LIZ = v9u;
    }
}
