package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import com.bytedance.pipo.ocr.view.CardOcrActivity;
import com.bytedance.pipo.ocr.view.OcrResultFragment;
import com.bytedance.pipo.ocr.view.component.IOcrComponent;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import yi2.b;

/* loaded from: classes16.dex */
public final class Y5L implements Runnable {
    public final /* synthetic */ CardOcrActivity LJLIL;
    public final /* synthetic */ PipoOcrResult LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ b LJLJJL;

    public Y5L(CardOcrActivity cardOcrActivity, PipoOcrResult pipoOcrResult, boolean z, String str, b bVar) {
        this.LJLIL = cardOcrActivity;
        this.LJLILLLLZI = pipoOcrResult;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = bVar;
    }

    public final void LIZ() {
        InterfaceC86320XuG interfaceC86320XuG;
        PipoOcrResult pipoOcrResult = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        boolean equals = TextUtils.equals(this.LJLIL.LLI, "1");
        String ocrSourceType = this.LJLJJI;
        b bVar = this.LJLJJL;
        o.LJIIIZ(ocrSourceType, "ocrSourceType");
        Bundle bundle = new Bundle();
        if (pipoOcrResult != null) {
            bundle.putParcelable("ocr_result", pipoOcrResult);
        }
        bundle.putBoolean("ocr_manually_input", z);
        bundle.putBoolean("showSecurityTips", equals);
        bundle.putString("ocr_source_type", ocrSourceType);
        OcrResultFragment ocrResultFragment = new OcrResultFragment();
        ocrResultFragment.setArguments(bundle);
        ocrResultFragment.LJLIL = bVar;
        IOcrComponent LIZ = C86818Y5m.LIZ();
        if (LIZ != null) {
            interfaceC86320XuG = LIZ.getSheet(this.LJLIL);
            if (interfaceC86320XuG != null) {
                FragmentManager supportFragmentManager = this.LJLIL.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
                interfaceC86320XuG.LIZIZ(supportFragmentManager, ocrResultFragment, new AqS165S0100000_15(this, 823), new AqS165S0100000_15(this, 824));
            }
        } else {
            interfaceC86320XuG = null;
        }
        ocrResultFragment.LJLILLLLZI = new AqS165S0100000_15(interfaceC86320XuG, 825);
        this.LJLIL.LLILIL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
