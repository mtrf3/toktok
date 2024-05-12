package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.EUk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC36506EUk extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C36505EUj.LIZ.handleMessage(message);
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        if (C36505EUj.LJFF && message.getCallback() == C36505EUj.LIZIZ) {
            C36505EUj.LIZ();
        }
        return super.sendMessageAtTime(message, j);
    }
}
