package X;

import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import kotlin.jvm.internal.IDqS188S0200000_15;
import yi2.b;

/* renamed from: X.Y5e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86810Y5e implements b {
    public final /* synthetic */ IDqS188S0200000_15 LIZ;
    public final /* synthetic */ PipoOcrResult LIZIZ;

    public C86810Y5e(IDqS188S0200000_15 iDqS188S0200000_15, PipoOcrResult pipoOcrResult) {
        this.LIZ = iDqS188S0200000_15;
        this.LIZIZ = pipoOcrResult;
    }

    @Override // yi2.b
    public final void LIZ(int i, int i2, String str, PipoOcrResult pipoOcrResult, String str2) {
        PipoOcrResult pipoOcrResult2 = this.LIZIZ;
        pipoOcrResult2.cardImage = pipoOcrResult.cardImage;
        ((Y5Y) this.LIZ.l0).LIZ.LJLIL.LIZ(1, 1, "success", pipoOcrResult2);
    }
}
