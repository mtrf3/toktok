package X;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: X.BfL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29339BfL implements InterfaceC62096OYq {
    public final /* synthetic */ C29338BfK LJLIL;

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    public C29339BfL(C29338BfK c29338BfK) {
        this.LJLIL = c29338BfK;
    }

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
        C73521StJ<Object> c73521StJ = this.LJLIL.LIZIZ;
        if (c73521StJ != null) {
            c73521StJ.onError(th);
            this.LJLIL.LIZIZ = null;
        }
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String str, String str2, Bundle bundle) {
        C73521StJ<Object> c73521StJ = this.LJLIL.LIZIZ;
        if (c73521StJ != null) {
            c73521StJ.onSuccess(new Object());
            this.LJLIL.LIZIZ = null;
        }
    }
}
