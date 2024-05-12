package X;

import android.graphics.Bitmap;

/* loaded from: classes8.dex */
public final class GS8<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ GS5 LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Bitmap LIZLLL;

    public GS8(GS5 gs5, int i, String str, Bitmap bitmap) {
        this.LIZ = gs5;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = bitmap;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        C42176Ggu c42176Ggu;
        if (!this.LIZ.LJFF.isFinishing() && (c42176Ggu = this.LIZ.LJIIIIZZ) != null) {
            c42176Ggu.LIZ(this.LIZIZ, new GZU(this.LIZJ, this.LIZLLL.getWidth(), this.LIZLLL.getHeight(), 8));
        }
        C42307Gj1.LIZLLL(this.LIZLLL);
        return C76800UCe.LIZ;
    }
}
