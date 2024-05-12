package X;

import X.InterfaceC67754QiU;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.QiN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class HandlerC67747QiN<R extends InterfaceC67754QiU> extends HandlerC67272Qai {
    public HandlerC67747QiN(Looper looper) {
        super(looper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                android.util.Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            ((BasePendingResult) message.obj).LJFF(Status.RESULT_TIMEOUT);
            return;
        }
        Pair pair = (Pair) message.obj;
        InterfaceC67740QiG interfaceC67740QiG = (InterfaceC67740QiG) pair.first;
        InterfaceC67754QiU interfaceC67754QiU = (InterfaceC67754QiU) pair.second;
        try {
            interfaceC67740QiG.LIZ(interfaceC67754QiU);
        } catch (RuntimeException e) {
            BasePendingResult.LJIIL(interfaceC67754QiU);
            throw e;
        }
    }

    public final void LIZ(InterfaceC67740QiG<? super R> interfaceC67740QiG, R r) {
        sendMessage(obtainMessage(1, new Pair(interfaceC67740QiG, r)));
    }
}
