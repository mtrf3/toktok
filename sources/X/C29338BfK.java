package X;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.android.livesdkapi.host.IHostShare;

/* renamed from: X.BfK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29338BfK implements BNI {
    public final IHostShare LIZ;
    public C73521StJ<Object> LIZIZ;
    public final C29339BfL LIZJ = new C29339BfL(this);

    public C29338BfK(IHostShare iHostShare) {
        this.LIZ = iHostShare;
    }

    public final void LIZ(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq) {
        c29930Bos.LIZIZ();
        if (this.LIZ.sharePanelRefactor().booleanValue()) {
            this.LIZ.getShareTuxSheet(activity, c29930Bos, interfaceC62096OYq);
            return;
        }
        Dialog shareDialog = this.LIZ.getShareDialog(activity, c29930Bos, interfaceC62096OYq);
        if (shareDialog == null) {
            return;
        }
        C16880lQ.LIZ(shareDialog);
    }
}
