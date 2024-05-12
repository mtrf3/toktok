package X;

import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.o;

/* renamed from: X.Lqw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC55538Lqw extends Handler {
    public final /* synthetic */ C55537Lqv LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC55538Lqw(C55537Lqv c55537Lqv) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = c55537Lqv;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        int i = msg.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LIZ.LIZ();
            return;
        }
        C55537Lqv c55537Lqv = this.LIZ;
        Context context = c55537Lqv.LIZ.get();
        if (context == null) {
            c55537Lqv.LIZJ();
            return;
        }
        if (c55537Lqv.LJ) {
            return;
        }
        if (C16970lZ.LIZIZ(context, c55537Lqv.LIZIZ)) {
            c55537Lqv.LIZJ.run();
            c55537Lqv.LJ = true;
            if (c55537Lqv.LJFF == null) {
                return;
            }
            c55537Lqv.LIZLLL.post(new ARunnableS45S0100000_9(c55537Lqv, 3));
            return;
        }
        c55537Lqv.LIZLLL.sendEmptyMessageDelayed(1, 16L);
    }
}
