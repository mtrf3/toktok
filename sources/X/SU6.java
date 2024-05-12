package X;

import Y.AfS64S0100000_12;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.dsp.ui.brand.TTMSheetDialogFragment;

/* loaded from: classes13.dex */
public final class SU6 implements InterfaceC78660Uu0 {
    public final /* synthetic */ TTMSheetDialogFragment LJLIL;
    public final /* synthetic */ ImageUrlModel LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        if (!this.LJLIL.viewValid) {
            bitmap.recycle();
            return;
        }
        this.LJLIL.LJLILLLLZI.LIZ(AbstractC73638SvC.LJIJ(bitmap).LJJIIJ(T16.LIZIZ).LJJII(new AfS64S0100000_12(this.LJLIL, 3), SU7.LJLIL));
        this.LJLIL.vl(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        this.LJLIL.vl(this.LJLILLLLZI);
    }

    public SU6(TTMSheetDialogFragment tTMSheetDialogFragment, ImageUrlModel imageUrlModel) {
        this.LJLIL = tTMSheetDialogFragment;
        this.LJLILLLLZI = imageUrlModel;
    }
}
