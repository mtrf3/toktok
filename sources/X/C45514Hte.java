package X;

import Y.AObjectS87S0300000_7;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;

/* renamed from: X.Hte, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45514Hte implements InterfaceC45596Huy {
    public final /* synthetic */ C45499HtP LIZ;

    public C45514Hte(C45499HtP c45499HtP) {
        this.LIZ = c45499HtP;
    }

    @Override // X.InterfaceC45596Huy
    public final void LIZ(View view, MyMediaModel myMediaModel) {
        C45499HtP c45499HtP = this.LIZ;
        c45499HtP.getClass();
        if (myMediaModel == null) {
            return;
        }
        if (C45871HzP.LIZ()) {
            c45499HtP.LLJLILLLLZIIL(view, myMediaModel, C45508HtY.LIZIZ(myMediaModel.fileLocalUriPath, false));
        } else {
            C45508HtY.LIZ(myMediaModel.fileLocalUriPath, false, new AObjectS87S0300000_7(c45499HtP, view, myMediaModel, 2));
        }
    }
}
