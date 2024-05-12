package X;

import Y.IDCListenerS289S0100000_15;
import Y.IDDListenerS154S0100000_15;
import androidx.fragment.app.FragmentManager;
import com.bytedance.pipo.ocr.view.OcrResultFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.XuF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86319XuF implements InterfaceC86320XuG {
    public TuxSheet LIZ;

    @Override // X.InterfaceC86320XuG
    public final void LIZ() {
        TuxSheet tuxSheet = this.LIZ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // X.InterfaceC86320XuG
    public final void LIZIZ(FragmentManager fragmentManager, OcrResultFragment ocrResultFragment, AqS165S0100000_15 aqS165S0100000_15, AqS165S0100000_15 aqS165S0100000_152) {
        TuxSheet tuxSheet = this.LIZ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        TuxSheet tuxSheet2 = C249109q6.LIZ(1).LIZ;
        tuxSheet2.LJLLILLLL = ocrResultFragment;
        tuxSheet2.LJZL = true;
        tuxSheet2.LJZI = true;
        tuxSheet2.LJLIL = new IDCListenerS289S0100000_15(aqS165S0100000_15, 6);
        tuxSheet2.LJLILLLLZI = new IDDListenerS154S0100000_15(aqS165S0100000_152, 7);
        this.LIZ = tuxSheet2;
        tuxSheet2.show(fragmentManager, "OcrResult");
    }
}
