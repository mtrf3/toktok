package X;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes12.dex */
public final class PS2 implements Handler.Callback {
    public volatile Handler LJLIL = new Handler(PS1.LIZ, this);

    public final void LIZIZ() {
        Handler handler = this.LJLIL;
        if (handler == null) {
            return;
        }
        this.LJLIL = null;
        handler.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return true;
        }
        try {
            PS3 ps3 = (PS3) message.obj;
            long LIZ = ps3.LIZ();
            if (LIZ <= 0) {
                return true;
            }
            LIZ(ps3, LIZ);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void LIZ(PS3 ps3, long j) {
        Handler handler = this.LJLIL;
        if (handler == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = ps3;
        handler.sendMessageDelayed(obtain, j);
    }
}
