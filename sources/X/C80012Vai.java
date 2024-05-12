package X;

import Y.ARunnableS33S0200000_14;
import android.os.Handler;
import com.bytedance.pipo.ocr.view.CardOcrActivity;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.TimerTask;

/* renamed from: X.Vai, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80012Vai extends TimerTask {
    public final /* synthetic */ CardOcrActivity LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            new PthreadThread(new ARunnableS33S0200000_14(this, new Handler(C16880lQ.LLJJJJ()), 73), "CardOcrActivity$initTimer$$inlined$apply$lambda$1").start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C80012Vai(CardOcrActivity cardOcrActivity) {
        this.LJLIL = cardOcrActivity;
    }
}
