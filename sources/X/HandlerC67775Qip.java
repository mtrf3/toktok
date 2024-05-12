package X;

import android.os.Looper;
import android.os.Message;

/* renamed from: X.Qip, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC67775Qip extends HandlerC67272Qai {
    public final /* synthetic */ C67756QiW LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C67756QiW c67756QiW;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            c67756QiW = this.LIZ;
            c67756QiW.LJLILLLLZI.lock();
            try {
                if (c67756QiW.LJLJLLL) {
                    c67756QiW.LJIJ();
                }
                return;
            } finally {
            }
        }
        c67756QiW = this.LIZ;
        c67756QiW.LJLILLLLZI.lock();
        try {
            if (c67756QiW.LJIILLIIL()) {
                c67756QiW.LJIJ();
            }
        } finally {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC67775Qip(C67756QiW c67756QiW, Looper looper) {
        super(looper);
        this.LIZ = c67756QiW;
    }
}
