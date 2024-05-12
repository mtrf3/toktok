package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class O6Y<T> implements InterfaceC64592gB {
    public static final O6Y<T> LJLIL = new O6Y<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (C19N.LJ("splash_quit_enable", true)) {
            Context LIZIZ = EF7.LIZIZ();
            C61358O6g.LIZIZ(LIZIZ);
            C61363O6l.LIZIZ(LIZIZ, null);
            O6X.LIZIZ.getClass();
            if (O75.LIZJ == null) {
                synchronized (O75.class) {
                    if (O75.LIZJ == null) {
                        O75.LIZJ = new O75();
                    }
                }
            }
            O75.LIZJ.LIZ = 0L;
        }
    }
}
