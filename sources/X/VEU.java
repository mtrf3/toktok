package X;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.component.DynamicComponentLoader;

/* loaded from: classes15.dex */
public final class VEU implements VES {
    public boolean LIZ;
    public final /* synthetic */ VEV LIZIZ;

    public VEU(VEV vev) {
        this.LIZIZ = vev;
    }

    @Override // X.VES
    public final void LIZ(byte[] bArr, Throwable th) {
        synchronized (this) {
            if (this.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Illegal callback invocation from native. The loaded callback can only be invoked once! The url is ");
                LIZ.append(this.LIZIZ.LJLIL);
                LLog.LIZLLL(4, "DynamicComponentLoader", X1D.LIZIZ(LIZ));
                return;
            }
            this.LIZ = true;
            if (th == null && bArr != null && bArr.length > 0) {
                VEV vev = this.LIZIZ;
                vev.LJLJI.nativeDidPreloadTemplate(vev.LJLILLLLZI, vev.LJLIL, bArr);
                return;
            }
            VEV vev2 = this.LIZIZ;
            DynamicComponentLoader dynamicComponentLoader = vev2.LJLJI;
            String str = vev2.LJLIL;
            long j = vev2.LJLILLLLZI;
            if (th == null) {
                th = new Throwable("The dynamic component's binary template is empty");
            }
            dynamicComponentLoader.LIZ(j, str, th);
        }
    }
}
