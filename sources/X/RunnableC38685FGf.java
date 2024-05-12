package X;

import android.app.Application;

/* renamed from: X.FGf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38685FGf implements Runnable {
    public final /* synthetic */ Application LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = false;
    public final /* synthetic */ InterfaceC38689FGj LJLJJI;
    public final /* synthetic */ TTL LJLJJL;
    public final /* synthetic */ C43588H8u LJLJJLL;
    public final /* synthetic */ InterfaceC38690FGk LJLJL;

    public final void LIZ() {
        C38686FGg.LIZIZ = new C38692FGm(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, C38686FGg.LJIIIIZZ, C38686FGg.LJIIIZ);
        C38686FGg.LIZ = this.LJLJL;
        C38686FGg.LJI = true;
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

    public RunnableC38685FGf(Application application, C38684FGe c38684FGe, C38687FGh c38687FGh, C43588H8u c43588H8u, TTL ttl, String str) {
        this.LJLIL = application;
        this.LJLILLLLZI = str;
        this.LJLJJI = c38684FGe;
        this.LJLJJL = ttl;
        this.LJLJJLL = c43588H8u;
        this.LJLJL = c38687FGh;
    }
}
