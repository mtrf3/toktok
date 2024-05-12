package X;

import Y.ARunnableS50S0100000_14;
import android.os.Handler;
import android.os.Message;

/* renamed from: X.VSg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class HandlerC79766VSg extends Handler {
    public final C79762VSc LIZ;

    public HandlerC79766VSg(C79762VSc c79762VSc) {
        this.LIZ = c79762VSc;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1000) {
            if (i != 2000) {
                if (i != 3000) {
                    return;
                }
                C79762VSc c79762VSc = this.LIZ;
                if (c79762VSc.LJLJJL == null) {
                    return;
                }
                c79762VSc.postDelayed(new ARunnableS50S0100000_14(c79762VSc, 214), 200L);
                return;
            }
            this.LIZ.LJFF(EnumC79549VJx.FLING);
            return;
        }
        this.LIZ.invalidate();
    }
}
