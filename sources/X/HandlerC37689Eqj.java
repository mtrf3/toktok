package X;

import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* renamed from: X.Eqj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC37689Eqj extends Handler implements InterfaceC37690Eqk {
    public final Handler LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.InterfaceC37690Eqk
    public final void start() {
        boolean z;
        if (C37684Eqe.LIZ(this) && C37684Eqe.LIZIZ(this.LJLIL, this)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        if (z) {
        }
    }

    public HandlerC37689Eqj(Handler handler) {
        super(handler.getLooper());
        this.LJLIL = handler;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        Handler handler = this.LJLIL;
        if (handler != null) {
            handler.dispatchMessage(message);
        } else {
            super.dispatchMessage(message);
        }
    }

    @Override // X.InterfaceC37690Eqk
    public final boolean LIZ(Message message, long j) {
        return sendMessageAtTime(message, j);
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Handler handler;
        if (!this.LJLILLLLZI && (handler = this.LJLIL) != null) {
            return handler.sendMessageAtTime(message, j);
        }
        if (this.LJLIL != null) {
            if (message.what == 159) {
                if (Build.VERSION.SDK_INT >= 23) {
                    message.setAsynchronous(true);
                }
                if (C37688Eqi.LIZ()) {
                    int i = C37688Eqi.LJII;
                    C37688Eqi.LJII = i + 1;
                    return super.sendMessageAtTime(message, i);
                }
                Handler handler2 = this.LJLIL;
                int i2 = C37688Eqi.LJII;
                C37688Eqi.LJII = i2 + 1;
                return handler2.sendMessageAtTime(message, i2);
            }
            if (C37688Eqi.LIZ()) {
                int i3 = C37688Eqi.LJIIIIZZ;
                C37688Eqi.LJIIIIZZ = i3 + 1;
                return super.sendMessageAtTime(message, i3);
            }
            Handler handler3 = this.LJLIL;
            int i4 = C37688Eqi.LJIIIIZZ;
            C37688Eqi.LJIIIIZZ = i4 + 1;
            return handler3.sendMessageAtTime(message, i4);
        }
        return super.sendMessageAtTime(message, j);
    }
}
