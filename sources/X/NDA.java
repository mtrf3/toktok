package X;

import android.graphics.Bitmap;
import ujb.o;

/* loaded from: classes11.dex */
public final class NDA extends AbstractC85293Wj {
    public final /* synthetic */ NDC LJLIL;
    public final /* synthetic */ ND1 LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadImageWithUrl onCompleted bitmap = ");
        LIZ.append(bitmap);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        NDC ndc = this.LJLIL;
        if (ndc != null) {
            ndc.LIZ(bitmap);
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        String str;
        String message;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadImageWithUrl onFailed errorMessage = ");
        String str2 = null;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        if (th == null || (message = th.getMessage()) == null || o.LJJJJJL(message)) {
            this.LJLILLLLZI.LJZL = "failed_reason_empty";
        } else {
            ND1 nd1 = this.LJLILLLLZI;
            if (th != null) {
                str2 = th.getMessage();
            }
            nd1.LJZL = str2;
        }
        NDC ndc = this.LJLIL;
        if (ndc != null) {
            if (th != null) {
                th.getMessage();
            }
            ndc.onFailed();
        }
    }

    public NDA(NDC ndc, ND1 nd1) {
        this.LJLIL = ndc;
        this.LJLILLLLZI = nd1;
    }
}
