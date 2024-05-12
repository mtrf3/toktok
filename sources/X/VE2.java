package X;

import android.os.Bundle;
import android.os.Message;
import com.ss.videoarch.live.ttquic.PreloadManager;
import com.ss.videoarch.live.ttquic.TTEvent;
import com.ss.videoarch.live.ttquic.TTRequestParam;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes15.dex */
public class VE2 implements Runnable {
    public TTRequestParam LJLJLJ;
    public Bundle LJLJLLL;
    public final /* synthetic */ PreloadManager LJLLI;
    public String LJLIL = "";
    public int LJLILLLLZI = -1;
    public final AtomicInteger LJLJI = new AtomicInteger(0);
    public long LJLJJI = -1;
    public long LJLJJL = -1;
    public int LJLJJLL = 0;
    public int LJLJL = -1;
    public final CountDownLatch LJLL = new CountDownLatch(1);

    public final void LIZ() {
        int native_preload;
        String str;
        if (this.LJLJI.get() != 1 && this.LJLJI.get() != 6) {
            str = C16880lQ.LLLZ("PreloadTask state invalid : %d", new Object[]{Integer.valueOf(this.LJLJI.get())});
            native_preload = -3007;
        } else {
            PreloadManager preloadManager = this.LJLLI;
            native_preload = preloadManager.native_preload(preloadManager.mNativePtr, this.LJLJLJ);
            if (native_preload != 0) {
                str = "invoke native_preload error";
            } else {
                try {
                    this.LJLL.await();
                    return;
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
        }
        TTEvent tTEvent = new TTEvent();
        tTEvent.what = 2;
        tTEvent.url = this.LJLIL;
        tTEvent.error = str;
        tTEvent.code = native_preload;
        Message obtainMessage = this.LJLLI.mEventHandler.obtainMessage();
        obtainMessage.what = tTEvent.what;
        obtainMessage.obj = tTEvent;
        this.LJLLI.mEventHandler.sendMessage(obtainMessage);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadTask{url='");
        Q89.LIZIZ(LIZ, this.LJLIL, '\'', ", playerId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", state=");
        LIZ.append(this.LJLJI);
        LIZ.append(", cachedTime=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", code=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", mode=");
        LIZ.append(this.LJLJL);
        LIZ.append(", requestParam=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", scheduleTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLJJL, '}', LIZ);
    }

    public VE2(PreloadManager preloadManager) {
        this.LJLLI = preloadManager;
    }
}
