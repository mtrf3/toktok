package X;

import android.graphics.Bitmap;

/* renamed from: X.CaC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31568CaC implements InterfaceC31664Cbk {
    public final /* synthetic */ C31563Ca7 LIZ;

    @Override // X.InterfaceC31664Cbk
    public final void onFail() {
    }

    public C31568CaC(C31563Ca7 c31563Ca7) {
        this.LIZ = c31563Ca7;
    }

    @Override // X.InterfaceC31664Cbk
    public final void LIZIZ(Bitmap bitmap) {
        this.LIZ.LJZI.setImageBitmap(bitmap);
    }
}
