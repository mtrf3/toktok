package X;

import android.view.View;

/* renamed from: X.Ue4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77672Ue4 implements InterfaceC77695UeR {
    public final /* synthetic */ C77584Uce LIZ;

    public C77672Ue4(C77584Uce c77584Uce) {
        this.LIZ = c77584Uce;
    }

    @Override // X.InterfaceC77695UeR
    public final void LIZ(boolean z) {
        if (z) {
            View view = this.LIZ.LJLJJL;
            if (view == null) {
                return;
            }
            view.setVisibility(4);
            return;
        }
        View view2 = this.LIZ.LJLJJL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }
}
