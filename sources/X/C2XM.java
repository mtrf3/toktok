package X;

import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.o;

/* renamed from: X.2XM, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2XM implements C2XO {
    public static final Object LIZJ = new Object();
    public static final Object LIZLLL = new Object();
    public final Handler LIZ;
    public Message LIZIZ;

    @Override // X.C2XO
    public final void LIZIZ() {
        Message message = this.LIZIZ;
        if (message == null) {
            return;
        }
        this.LIZIZ = null;
        Object obj = message.obj;
        Object obj2 = LIZJ;
        if (!o.LJ(obj, obj2) || !o.LJ(message.getTarget(), this.LIZ)) {
            return;
        }
        Message obtain = Message.obtain(message);
        obtain.obj = LIZLLL;
        this.LIZ.sendMessageAtFrontOfQueue(obtain);
        this.LIZ.removeMessages(message.what, obj2);
    }

    public C2XM(Handler handler) {
        this.LIZ = handler;
    }

    @Override // X.C2XO
    public final boolean LIZ(Message doFrameMessage, long j) {
        o.LJIIIZ(doFrameMessage, "doFrameMessage");
        if (doFrameMessage.obj != null) {
            return false;
        }
        this.LIZIZ = doFrameMessage;
        doFrameMessage.obj = LIZJ;
        return this.LIZ.sendMessageAtTime(doFrameMessage, j);
    }
}
