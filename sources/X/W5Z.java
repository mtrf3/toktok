package X;

import Y.ARunnableS33S0200000_14;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import java.io.File;

/* loaded from: classes15.dex */
public class W5Z implements FYV {
    public final InterfaceC31104CIq LIZ;
    public final W5E LIZIZ;
    public final /* synthetic */ FrescoImageLoaderImpl LIZJ;

    @Override // X.FYV
    public final void LIZ(File file) {
        W5E w5e;
        C79083V1z.LJFF(this.LIZIZ.hashCode(), "FrescoImageLoaderImpl", "OnWriterCacheListenerWrap", C0F0.LIZJ("onWriteCacheSuccess: ", file));
        if (this.LIZ != null && (w5e = this.LIZIZ) != null) {
            this.LIZJ.getCallbackExecutor(w5e).execute(new ARunnableS33S0200000_14(this, file, 12));
        }
    }

    public W5Z(FrescoImageLoaderImpl frescoImageLoaderImpl, W5E w5e, InterfaceC31104CIq interfaceC31104CIq) {
        this.LIZJ = frescoImageLoaderImpl;
        this.LIZ = interfaceC31104CIq;
        this.LIZIZ = w5e;
    }
}
