package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.ttve.nativePort.VEBingoManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class P64 extends Handler {
    public final String[] LIZ;
    public final List<Integer> LIZIZ;
    public final P69 LIZJ;
    public final AtomicInteger LIZLLL;
    public final /* synthetic */ VEBingoManager LJ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        super.handleMessage(message);
        if (message.what != 1 || this.LIZJ.LIZIZ || this.LIZLLL.get() >= this.LIZIZ.size()) {
            return;
        }
        String str = this.LIZ[((Integer) ListProtector.get(this.LIZIZ, this.LIZLLL.getAndIncrement())).intValue()];
        Bitmap decodeBitmap = this.LJ.decodeBitmap(str);
        if (decodeBitmap == null || decodeBitmap.isRecycled()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("decodeBitmap fail, path: ");
            LIZ.append(str);
            P4Q.LIZJ("VEBingoManager", X1D.LIZIZ(LIZ));
            P69 p69 = this.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("decodeBitmap fail, path: ");
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
            p69.LIZ();
            return;
        }
        int processBingoImageFrame = this.LJ.processBingoImageFrame(decodeBitmap, 0.0f, str);
        decodeBitmap.recycle();
        if (processBingoImageFrame < 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("processBingoImageFrame fail, path: ");
            LIZ3.append(str);
            P4Q.LIZJ("VEBingoManager", X1D.LIZIZ(LIZ3));
            P69 p692 = this.LIZJ;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("processBingoImageFrame fail, path: ");
            LIZ4.append(str);
            X1D.LIZIZ(LIZ4);
            p692.LIZ();
            return;
        }
        P69 p693 = this.LIZJ;
        synchronized (p693) {
            p693.LIZ.incrementAndGet();
            if (p693.LIZIZ) {
                z = p693.LIZIZ;
            } else {
                throw null;
            }
        }
        if (z) {
            return;
        }
        Message.obtain(this, 1).sendToTarget();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P64(VEBingoManager vEBingoManager, Looper looper, String[] strArr, List<Integer> list, P69 p69) {
        super(looper);
        this.LJ = vEBingoManager;
        new TEVideoUtilsCallback();
        this.LIZLLL = new AtomicInteger(0);
        this.LIZ = strArr;
        this.LIZIZ = list;
        this.LIZJ = p69;
    }
}
