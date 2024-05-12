package X;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;

/* renamed from: X.QOz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66941QOz implements WeakHandler.IHandler {
    public static volatile C66941QOz LJLIL;
    public static WeakHandler LJLILLLLZI;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public static C66941QOz LIZ() {
        if (LJLIL == null) {
            synchronized (C66941QOz.class) {
                if (LJLIL == null) {
                    LJLIL = new C66941QOz();
                }
            }
        }
        return LJLIL;
    }

    public C66941QOz() {
        if (LJLILLLLZI == null) {
            try {
                LJLILLLLZI = QP5.LIZ().LJLIL;
            } catch (Throwable unused) {
                LJLILLLLZI = new WeakHandler(C06M.LIZ("WsHT").getLooper(), this);
            }
        }
    }
}
