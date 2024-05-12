package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.pipo.ocr.view.OcrResultFragment;
import ij2.a;

/* loaded from: classes16.dex */
public final class Y5T implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ OcrResultFragment LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a aVar = a.LJIJ;
        long j = this.LJLILLLLZI.LJLJJL;
        long currentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        a.LJIIJ(j, currentTimeMillis, "info_confirm_ocr");
        this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    public Y5T(View view, OcrResultFragment ocrResultFragment) {
        this.LJLIL = view;
        this.LJLILLLLZI = ocrResultFragment;
    }
}
