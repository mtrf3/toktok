package X;

import djb.IDaS26S0000000_13;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes14.dex */
public final class UVO {
    public final CoroutineExceptionHandler LIZ;
    public final InterfaceC70422pa LIZIZ;
    public final String LIZJ;
    public final CopyOnWriteArrayList<UVN> LIZLLL;
    public final CopyOnWriteArrayList<UVM> LJ;

    public UVO(int i) {
        IDaS26S0000000_13 iDaS26S0000000_13 = new IDaS26S0000000_13(CoroutineExceptionHandler.LJJJJIZL, 2);
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()).plus(iDaS26S0000000_13));
        this.LIZ = iDaS26S0000000_13;
        this.LIZIZ = LIZ;
        this.LIZJ = "SendGiftResultHandlerManager";
        this.LIZLLL = new CopyOnWriteArrayList<>();
        this.LJ = new CopyOnWriteArrayList<>();
    }

    public final void LIZ(C32816CuK transactionTask, UV8 result) {
        o.LJIIIZ(transactionTask, "transactionTask");
        o.LJIIIZ(result, "result");
        XKX.LIZLLL(this.LIZIZ, null, null, new UVK(this, transactionTask, result, null), 3);
    }
}
