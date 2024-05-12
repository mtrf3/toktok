package X;

import djb.IDaS26S0000000_13;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.UVv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77311UVv {
    public final CoroutineExceptionHandler LIZ;
    public final InterfaceC70422pa LIZIZ;
    public final UW1 LIZJ;
    public final Comparator<C32816CuK> LIZLLL;
    public final InterfaceC88472Yns<C32816CuK, Boolean> LJ;
    public final InterfaceC88472Yns<List<C32816CuK>, C76800UCe> LJFF;
    public final String LJI;
    public final LinkedList<C32816CuK> LJII;
    public final AtomicInteger LJIIIIZZ;
    public final XK4 LJIIIZ;

    public C77311UVv(UW1 uw1, Comparator comparator, AqS179S0100000_13 aqS179S0100000_13, AqS179S0100000_13 aqS179S0100000_132) {
        IDaS26S0000000_13 iDaS26S0000000_13 = new IDaS26S0000000_13(CoroutineExceptionHandler.LJJJJIZL, 3);
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()).plus(iDaS26S0000000_13));
        this.LIZ = iDaS26S0000000_13;
        this.LIZIZ = LIZ;
        this.LIZJ = uw1;
        this.LIZLLL = comparator;
        this.LJ = aqS179S0100000_13;
        this.LJFF = aqS179S0100000_132;
        this.LJI = "SendGiftTransactionTaskBuffer";
        this.LJII = new LinkedList<>();
        this.LJIIIIZZ = new AtomicInteger(0);
        this.LJIIIZ = C78934UyQ.LIZJ(Integer.MAX_VALUE, null, 6);
        XKX.LIZLLL(LIZ, null, null, new C77310UVu(this, null), 3);
    }
}
