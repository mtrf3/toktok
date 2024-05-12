package X;

import Y.ARunnableS8S0201000_5;
import java.io.File;

/* loaded from: classes15.dex */
public final class W5W implements InterfaceC47046IdG<File> {
    public final /* synthetic */ InterfaceC31104CIq LIZ;
    public final /* synthetic */ W5J LIZIZ;

    @Override // X.InterfaceC47046IdG
    public final void onResult(File file) {
        File file2 = file;
        C79083V1z.LIZ(this.LIZIZ.LIZ.hashCode(), "FrescoImageLoaderImpl", "download", C0F0.LIZJ("onCompleted image path=", file2));
        W5J w5j = this.LIZIZ;
        w5j.LIZJ.getCallbackExecutor(w5j.LIZ).execute(new ARunnableS8S0201000_5(1, this.LIZ, file2, 8));
    }

    public W5W(W5J w5j, InterfaceC31104CIq interfaceC31104CIq) {
        this.LIZIZ = w5j;
        this.LIZ = interfaceC31104CIq;
    }
}
