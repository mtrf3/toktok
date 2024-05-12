package X;

import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3Kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82153Kh {
    public final Handler LIZ;
    public final InterfaceC70422pa LIZIZ;
    public final C37Q LIZJ;
    public final boolean LIZLLL;
    public volatile XKQ LJ;
    public volatile int LJFF;

    public final void LIZIZ(int i, InterfaceC81953Jn paginationData) {
        o.LJIIIZ(paginationData, "paginationData");
        XKQ xkq = this.LJ;
        if (xkq != null && !xkq.isCompleted()) {
            if ((C82133Kf.LIZ() & 8) != 0 && this.LJFF != 2) {
                this.LJFF = i;
                return;
            }
            return;
        }
        String msg = KMP.LJ("Will update data， from=", i);
        o.LJIIIZ(msg, "msg");
        synchronized (C3K5.LJLIL) {
            C3K5.LIZJ("refresh_start", null);
        }
        XKQ LIZLLL = XKX.LIZLLL(this.LIZIZ, null, null, new C37P(this, i, paginationData, null), 3);
        LIZLLL.LJJIII(new AqS132S0200000_1(this, paginationData, 98));
        this.LJ = LIZLLL;
    }

    public C82153Kh(C3L9 refreshHandler, C64962gm c64962gm, C37Q updateHandler) {
        boolean z;
        o.LJIIIZ(refreshHandler, "refreshHandler");
        o.LJIIIZ(updateHandler, "updateHandler");
        this.LIZ = refreshHandler;
        this.LIZIZ = c64962gm;
        this.LIZJ = updateHandler;
        if ((C3SX.LIZ() & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
        this.LJFF = -1;
    }

    public final void LIZ(int i, Handler handler, InterfaceC81953Jn paginationData) {
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(paginationData, "paginationData");
        if (this.LIZLLL) {
            LIZIZ(i, paginationData);
            return;
        }
        Message obtainMessage = handler.obtainMessage(1);
        obtainMessage.arg1 = i;
        obtainMessage.obj = paginationData;
        handler.sendMessage(obtainMessage);
    }
}
