package X;

import android.graphics.Bitmap;

/* renamed from: X.CPw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31292CPw implements UCZ {
    public final /* synthetic */ InterfaceC31293CPx LIZ;
    public final /* synthetic */ C31290CPu LIZIZ;

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        InterfaceC31293CPx interfaceC31293CPx = this.LIZ;
        if (interfaceC31293CPx != null) {
            interfaceC31293CPx.LJLIL(copy, this.LIZIZ);
        }
    }

    public C31292CPw(C31290CPu c31290CPu, InterfaceC31293CPx interfaceC31293CPx) {
        this.LIZIZ = c31290CPu;
        this.LIZ = interfaceC31293CPx;
    }
}
