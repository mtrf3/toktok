package X;

/* renamed from: X.Qgv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67657Qgv implements Runnable {
    public final /* synthetic */ AbstractC67638Qgc LJLIL;
    public final /* synthetic */ C67656Qgu LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            synchronized (this.LJLILLLLZI.LJLILLLLZI) {
                InterfaceC67679QhH interfaceC67679QhH = this.LJLILLLLZI.LJLJI;
                if (interfaceC67679QhH != null) {
                    interfaceC67679QhH.onFailure(this.LJLIL.LJIIIIZZ());
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC67657Qgv(C67656Qgu c67656Qgu, AbstractC67638Qgc abstractC67638Qgc) {
        this.LJLILLLLZI = c67656Qgu;
        this.LJLIL = abstractC67638Qgc;
    }
}
