package X;

import Y.IDeS153S0200000_15;
import djb.IDaS66S0100000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.3PI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PI {
    public final String LIZ;
    public final C64962gm LIZIZ;
    public final C83483Pk LIZJ;
    public final C83593Pv LIZLLL;
    public final C62822Ol8 LJ;

    public C3PI(String uid) {
        o.LJIIIZ(uid, "uid");
        this.LIZ = uid;
        this.LJ = C221108m2.LIZIZ(C3PH.LJLIL);
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()).plus(new IDaS66S0100000_1(CoroutineExceptionHandler.LJJJJIZL, this, 1)));
        C83483Pk c83483Pk = new C83483Pk(LIZ);
        this.LIZJ = c83483Pk;
        ((C3BJ) c83483Pk.LJIIL.getValue()).LIZIZ(new C3PT(C3PO.REPLACE_ALL, null, false, 2));
        C83593Pv c83593Pv = new C83593Pv(LIZ);
        this.LIZLLL = c83593Pv;
        V1M.LJJIJIIJIL(new IDeS153S0200000_15(new C79823Bi(C47261Igj.LJJIJIIJI(c83593Pv.LJIIJ, c83593Pv.LJIIL), MBB.INSTANCE, -2, XKI.SUSPEND), new C83603Pw(c83593Pv, null), 0), c83593Pv.LIZ);
        this.LIZIZ = LIZ;
    }
}
