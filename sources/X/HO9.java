package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;

/* loaded from: classes8.dex */
public final class HO9 extends AbstractC32209CkX {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ MyMediaModel LIZIZ;
    public final /* synthetic */ C45507HtX LIZJ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        C164066cE c164066cE;
        if (bitmap != null) {
            boolean z = this.LIZ;
            MyMediaModel myMediaModel = this.LIZIZ;
            C45507HtX c45507HtX = this.LIZJ;
            if (z && myMediaModel.LJ()) {
                if (bitmap.getWidth() / bitmap.getHeight() > 0.5625d && (c164066cE = c45507HtX.LJLIL) != null) {
                    XIC xic = C78613UtF.LIZ;
                    XKX.LIZLLL(C48841JEv.LIZ(xic), null, null, new C142295iD(bitmap, myMediaModel, c164066cE, null), 3).LIZIZ(null);
                    XKX.LIZLLL(C48841JEv.LIZ(xic), null, null, new C142295iD(bitmap, myMediaModel, c164066cE, null), 3);
                }
            }
        }
    }

    public HO9(boolean z, MyMediaModel myMediaModel, C45507HtX c45507HtX) {
        this.LIZ = z;
        this.LIZIZ = myMediaModel;
        this.LIZJ = c45507HtX;
    }
}
