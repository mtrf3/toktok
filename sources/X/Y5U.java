package X;

import com.bytedance.pipo.ocr.view.CardOcrActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y5U implements Y6E {
    public final /* synthetic */ CardOcrActivity LIZ;

    @Override // X.Y6E
    public final void LIZ() {
    }

    @Override // X.Y6E
    public final void LIZIZ() {
    }

    @Override // X.Y6E
    public final void LIZLLL() {
    }

    @Override // X.Y6E
    public final void LJ(Exception error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.Y6E
    public final void LIZJ() {
        CardOcrActivity cardOcrActivity = this.LIZ;
        C140575fR c140575fR = cardOcrActivity.LJZI;
        if (c140575fR != null) {
            this.LIZ.LLIIIZ().LLFZ = cardOcrActivity.LLIIIILZ(c140575fR);
            this.LIZ.LLIIIZ().LJI();
        } else {
            o.LJIJI("mScanView");
            throw null;
        }
    }

    public Y5U(CardOcrActivity cardOcrActivity) {
        this.LIZ = cardOcrActivity;
    }
}
