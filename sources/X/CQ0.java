package X;

import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public final class CQ0 implements UCZ {
    public final /* synthetic */ InterfaceC31293CPx LIZ;
    public final /* synthetic */ CQ1 LIZIZ;

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

    public CQ0(CQ1 cq1, InterfaceC31293CPx interfaceC31293CPx) {
        this.LIZIZ = cq1;
        this.LIZ = interfaceC31293CPx;
    }
}
