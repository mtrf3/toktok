package X;

import android.os.Message;
import java.util.TimerTask;

/* renamed from: X.O7p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61393O7p extends TimerTask {
    public final /* synthetic */ O7W LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Message obtainMessage = this.LJLIL.LLIIII.obtainMessage();
            obtainMessage.what = 2;
            this.LJLIL.LLIIII.sendMessage(obtainMessage);
        } finally {
            if (LIZ) {
            }
        }
    }

    public C61393O7p(O7W o7w) {
        this.LJLIL = o7w;
    }
}
