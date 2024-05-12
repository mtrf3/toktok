package X;

/* renamed from: X.W5c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC81712W5c implements Runnable {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ W5H LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C79083V1z.LJ(this.LJLILLLLZI.LIZ.hashCode(), "FrescoImageLoaderImpl", "onProgressUpdate");
            InterfaceC78660Uu0 interfaceC78660Uu0 = this.LJLILLLLZI.LJ;
            if (interfaceC78660Uu0 != null) {
                interfaceC78660Uu0.onProgress(this.LJLIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC81712W5c(W5H w5h, float f) {
        this.LJLILLLLZI = w5h;
        this.LJLIL = f;
    }
}
