package X;

import java.io.File;

/* loaded from: classes11.dex */
public final class NUY<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ String LIZIZ;

    public NUY(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        String LLLFFI;
        if (C59161NJt.LIZIZ.get() == this.LIZ) {
            File file = new File(this.LIZIZ);
            if (file.exists() && file.isFile()) {
                LLLFFI = C38485F8n.LLLFFI(file, PVC.LIZ);
                return LLLFFI;
            }
        }
        return null;
    }
}
