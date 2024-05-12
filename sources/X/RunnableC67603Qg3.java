package X;

import java.util.ArrayList;

/* renamed from: X.Qg3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67603Qg3 implements Runnable {
    public final /* synthetic */ C68241QqL LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;

    public RunnableC67603Qg3(C68241QqL c68241QqL, Runnable runnable) {
        this.LJLIL = c68241QqL;
        this.LJLILLLLZI = runnable;
    }

    public final void LIZ() {
        this.LJLIL.LJFF();
        C68241QqL c68241QqL = this.LJLIL;
        Runnable runnable = this.LJLILLLLZI;
        c68241QqL.LIZIZ().LJFF();
        if (c68241QqL.LJIILL == null) {
            c68241QqL.LJIILL = new ArrayList();
        }
        ((ArrayList) c68241QqL.LJIILL).add(runnable);
        this.LJLIL.LJIJI();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
