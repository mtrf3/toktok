package X;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.component.DynamicComponentLoader;

/* loaded from: classes15.dex */
public final class VET implements VES {
    public volatile boolean LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ DynamicComponentLoader LJFF;

    @Override // X.VES
    public final void LIZ(byte[] bArr, Throwable th) {
        String str;
        VEY vey;
        synchronized (this) {
            if (this.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Illegal callback invocation from native. The loaded callback can only be invoked once! The url is ");
                LIZ.append(this.LIZIZ);
                LLog.LIZLLL(4, "DynamicComponentLoader", X1D.LIZIZ(LIZ));
                return;
            }
            this.LIZ = true;
            if (bArr != null && bArr.length > 0 && th == null && (vey = this.LJFF.LIZJ) != null) {
                vey.LIZ("last_lynx_async_component_url", this.LIZIZ);
            }
            DynamicComponentLoader dynamicComponentLoader = this.LJFF;
            String str2 = this.LIZIZ;
            int i = this.LIZJ;
            long j = this.LIZLLL;
            long j2 = this.LJ;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            dynamicComponentLoader.nativeDidLoadComponent(str2, i, j, j2, bArr, str);
        }
    }

    public VET(DynamicComponentLoader dynamicComponentLoader, String str, int i, long j, long j2) {
        this.LJFF = dynamicComponentLoader;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = j;
        this.LJ = j2;
    }
}
