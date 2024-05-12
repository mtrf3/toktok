package X;

import java.util.concurrent.Executor;

/* renamed from: X.28O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28O extends QXX {
    public static volatile C28O LJLILLLLZI;
    public static final C13F LJLJI = new C13F();
    public static final C13G LJLJJI = new Executor() { // from class: X.13G
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C28P c28p = C28O.LLLLZ().LJLIL;
            c28p.getClass();
            if (((Boolean) DP5.LIZJ.getValue()).booleanValue()) {
                if (runnable != null) {
                    C38995FSd.LIZLLL().execute(runnable);
                    return;
                }
                return;
            }
            c28p.LJLILLLLZI.execute(runnable);
        }
    };
    public final C28P LJLIL;

    public C28O() {
        super((Object) null);
        this.LJLIL = new C28P();
    }

    public static C28O LLLLZ() {
        if (LJLILLLLZI != null) {
            return LJLILLLLZI;
        }
        synchronized (C28O.class) {
            if (LJLILLLLZI == null) {
                LJLILLLLZI = new C28O();
            }
        }
        return LJLILLLLZI;
    }

    @Override // X.QXX
    public final boolean LLJJLIIIJLLLLLLLZ() {
        return this.LJLIL.LLJJLIIIJLLLLLLLZ();
    }

    @Override // X.QXX
    public final void LLLLIIL(Runnable runnable) {
        this.LJLIL.LLLLIIL(runnable);
    }
}
