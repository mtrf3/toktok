package X;

import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;

/* renamed from: X.VRf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79739VRf implements InterfaceC79740VRg {
    public final /* synthetic */ LynxPickerViewColumn LIZ;

    @Override // X.InterfaceC79740VRg
    public final void LIZ(String str) {
    }

    public C79739VRf(LynxPickerViewColumn lynxPickerViewColumn) {
        this.LIZ = lynxPickerViewColumn;
    }

    @Override // X.InterfaceC79740VRg
    public final void LIZIZ(String str) {
        Long LJIIL = OUP.LJIIL(str);
        if (LJIIL != null) {
            ((VSW) this.LIZ.mView).setMaskColor((int) LJIIL.longValue());
        }
    }
}
