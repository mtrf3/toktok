package X;

import Y.ARunnableS30S0200000_11;
import java.util.List;

/* renamed from: X.PvI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66000PvI implements InterfaceC66217Pyn {
    public static final java.util.Set<Integer> LIZ;
    public static final java.util.Set<Integer> LIZIZ;
    public static final java.util.Set<Integer> LIZJ;
    public static final java.util.Set<Integer> LIZLLL;
    public static final java.util.Set<java.util.Set<Integer>> LJ;
    public static final List<String> LJFF;
    public static final C66000PvI LJI = new C66000PvI();

    @Override // X.InterfaceC66217Pyn
    public final void LIZIZ(C66206Pyc c66206Pyc) {
    }

    @Override // X.InterfaceC66217Pyn
    public final void LIZJ(C66206Pyc c66206Pyc) {
    }

    static {
        java.util.Set<Integer> LJIIIIZZ = C77275UUl.LJIIIIZZ(102600, 102601);
        LIZ = LJIIIIZZ;
        java.util.Set<Integer> LJIIIIZZ2 = C77275UUl.LJIIIIZZ(240004, 240034);
        LIZIZ = LJIIIIZZ2;
        java.util.Set<Integer> LJIIIIZZ3 = C77275UUl.LJIIIIZZ(100100, 100206);
        LIZJ = LJIIIIZZ3;
        java.util.Set<Integer> LJIIIIZZ4 = C77275UUl.LJIIIIZZ(100201, 100101);
        LIZLLL = LJIIIIZZ4;
        LJ = C77275UUl.LJIIIIZZ(LJIIIIZZ, LJIIIIZZ2, LJIIIIZZ3, LJIIIIZZ4);
        LJFF = C47261Igj.LJJIJIIJI("location", "video", "audio", "clipboard", "contact");
    }

    @Override // X.InterfaceC66217Pyn
    public final void LIZ(C66206Pyc c66206Pyc) {
        Throwable th = new Throwable();
        HandlerThreadC65936PuG.LIZ();
        HandlerThreadC65936PuG.LJLJI.execute(new ARunnableS30S0200000_11(th, c66206Pyc, 0));
    }
}
