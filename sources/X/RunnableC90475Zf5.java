package X;

import java.util.HashMap;

/* renamed from: X.Zf5, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class RunnableC90475Zf5 implements Runnable {
    public final /* synthetic */ C90909Zm5 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public RunnableC90475Zf5(C90909Zm5 c90909Zm5, String str, String str2) {
        this.LJLIL = c90909Zm5;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    public final void LIZ() {
        InterfaceC90219Zax interfaceC90219Zax;
        synchronized (this.LJLIL.LLIIJLIL) {
            interfaceC90219Zax = (InterfaceC90219Zax) ((HashMap) this.LJLIL.LLIIJLIL).get(this.LJLILLLLZI);
        }
        if (interfaceC90219Zax != null) {
            interfaceC90219Zax.LIZ(this.LJLJI);
        } else {
            C90909Zm5.LLIZLLLIL.getClass();
        }
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
