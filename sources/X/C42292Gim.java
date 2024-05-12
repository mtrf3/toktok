package X;

import Y.IDCListenerS283S0100000_7;
import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;

/* renamed from: X.Gim, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42292Gim {
    public C42293Gin LIZ;

    public final void LIZ() {
        C42278GiY c42278GiY;
        C42293Gin c42293Gin = this.LIZ;
        if (c42293Gin != null && (c42278GiY = c42293Gin.LIZIZ) != null) {
            c42278GiY.dismiss();
        }
    }

    public final void LIZJ() {
        C42293Gin c42293Gin = this.LIZ;
        if (c42293Gin != null) {
            C42279GiZ c42279GiZ = C42279GiZ.LIZ;
            Context context = c42293Gin.LIZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(true);
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE);
            creativeLoadingDialogBuilder.cancelListener(new IDCListenerS283S0100000_7(c42293Gin, 5));
            C42278GiY c42278GiY = (C42278GiY) c42279GiZ.createLoadingDialog(context, 1102, creativeLoadingDialogBuilder);
            c42293Gin.LIZIZ = c42278GiY;
            c42278GiY.show();
        }
    }

    public final void LIZLLL(int i) {
        C42278GiY c42278GiY;
        C42293Gin c42293Gin = this.LIZ;
        if (c42293Gin != null && (c42278GiY = c42293Gin.LIZIZ) != null) {
            c42278GiY.updateProgress(i);
        }
    }

    public final void LIZIZ(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C42293Gin c42293Gin = new C42293Gin(context);
        c42293Gin.LIZJ = interfaceC65784Pro;
        this.LIZ = c42293Gin;
    }
}
