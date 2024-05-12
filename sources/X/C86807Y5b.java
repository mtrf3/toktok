package X;

import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.IDqS439S0100000_15;
import yi2.b;

/* renamed from: X.Y5b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86807Y5b implements b {
    public final /* synthetic */ IDqS439S0100000_15 LIZ;
    public final /* synthetic */ C36661cE LIZIZ;

    public C86807Y5b(IDqS439S0100000_15 iDqS439S0100000_15, C36661cE c36661cE) {
        this.LIZ = iDqS439S0100000_15;
        this.LIZIZ = c36661cE;
    }

    @Override // yi2.b
    public final void LIZ(int i, int i2, String str, PipoOcrResult pipoOcrResult, String str2) {
        C86808Y5c c86808Y5c = PipoOcrResult.CREATOR;
        C36661cE c36661cE = this.LIZIZ;
        c86808Y5c.getClass();
        PipoOcrResult LIZ = C86808Y5c.LIZ(c36661cE);
        LIZ.cardImage = pipoOcrResult.cardImage;
        ((Y5M) ((AqS162S0200000_15) this.LIZ.l0).l0).LJLIL.LJLIL.postValue(new C86815Y5j(1, 1, "success", LIZ));
    }
}
