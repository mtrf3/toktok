package X;

import com.lynx.tasm.component.DynamicComponentLoader;

/* loaded from: classes15.dex */
public final class VEV implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ DynamicComponentLoader LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.LIZ.LIZIZ(this.LJLIL, new VEU(this));
        } finally {
            if (LIZ) {
            }
        }
    }

    public VEV(DynamicComponentLoader dynamicComponentLoader, String str, long j) {
        this.LJLJI = dynamicComponentLoader;
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }
}
