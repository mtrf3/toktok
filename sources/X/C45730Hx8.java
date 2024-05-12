package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Hx8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45730Hx8<TTaskResult, TContinuationResult> implements C10I<Bitmap, C76800UCe> {
    public final /* synthetic */ VEMediaParserFrameProviderImpl LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ InterfaceC45734HxC LJFF;

    public C45730Hx8(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, boolean z, int i, String str, int i2, InterfaceC45734HxC interfaceC45734HxC) {
        this.LIZ = vEMediaParserFrameProviderImpl;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = i2;
        this.LJFF = interfaceC45734HxC;
    }

    @Override // X.C10I
    public final C76800UCe then(C10K<Bitmap> task) {
        o.LJIIIIZZ(task, "task");
        if (task.LJIILJJIL() && this.LIZIZ) {
            this.LIZ.LJ(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, false);
        } else {
            Bitmap LJIIJJI = task.LJIIJJI();
            if (LJIIJJI != null && (!LJIIJJI.isRecycled())) {
                this.LIZ.getClass();
                C81392Vwy LJIIL = C81392Vwy.LJIIL(new W5C(LJIIJJI, C1E5.LJFF(), W8A.LIZLLL, 0));
                if (LJIIL != null && LJIIL.LJIIJ()) {
                    this.LJFF.LIZ(LJIIL.clone());
                    C81392Vwy.LJ(LJIIL);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
