package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.R3l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class HandlerC68929R3l extends Handler {
    public final InterfaceC65784Pro<C76800UCe> LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        this.LIZ.invoke();
    }

    public HandlerC68929R3l(Looper looper, AqS161S0100000_11 aqS161S0100000_11) {
        super(looper);
        this.LIZ = aqS161S0100000_11;
    }
}
