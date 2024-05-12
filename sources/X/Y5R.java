package X;

import android.graphics.Bitmap;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import com.bytedance.pipo.ocr.ocr.OcrViewModel;
import ij2.a;
import yi2.b;

/* loaded from: classes16.dex */
public final class Y5R implements b {
    public final /* synthetic */ OcrViewModel LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ Bitmap LIZJ;
    public final /* synthetic */ InterfaceC65784Pro LIZLLL;

    public Y5R(OcrViewModel ocrViewModel, int i, Bitmap bitmap, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = ocrViewModel;
        this.LIZIZ = i;
        this.LIZJ = bitmap;
        this.LIZLLL = interfaceC65784Pro;
    }

    @Override // yi2.b
    public final void LIZ(int i, int i2, String str, PipoOcrResult pipoOcrResult, String str2) {
        if (i == 1 && i2 == 1 && pipoOcrResult != null) {
            a aVar = a.LJIJ;
            long currentTimeMillis = System.currentTimeMillis();
            OcrViewModel ocrViewModel = this.LIZ;
            long j = currentTimeMillis - ocrViewModel.LJLILLLLZI;
            long j2 = ocrViewModel.LJLJI;
            long currentTimeMillis2 = System.currentTimeMillis();
            aVar.getClass();
            a.LJII(j, j2, currentTimeMillis2, 0L, "success");
            this.LIZ.LJLIL.postValue(new C86815Y5j(i, i2, str, pipoOcrResult));
            return;
        }
        OcrViewModel ocrViewModel2 = this.LIZ;
        int i3 = this.LIZIZ - 1;
        Bitmap bitmap = this.LIZJ;
        InterfaceC65784Pro interfaceC65784Pro = this.LIZLLL;
        ocrViewModel2.getClass();
        if (i3 == 0) {
            interfaceC65784Pro.invoke();
            return;
        }
        a aVar2 = a.LJIJ;
        Y5R y5r = new Y5R(ocrViewModel2, i3, bitmap, interfaceC65784Pro);
        aVar2.getClass();
        a.LJI(bitmap, y5r);
    }
}
