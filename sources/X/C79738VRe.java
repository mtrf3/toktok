package X;

import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;

/* renamed from: X.VRe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79738VRe implements InterfaceC79740VRg {
    public final /* synthetic */ LynxPickerViewColumn LIZ;

    @Override // X.InterfaceC79740VRg
    public final void LIZIZ(String str) {
    }

    public C79738VRe(LynxPickerViewColumn lynxPickerViewColumn) {
        this.LIZ = lynxPickerViewColumn;
    }

    @Override // X.InterfaceC79740VRg
    public final void LIZ(String str) {
        ((VSW) this.LIZ.mView).setUserItemHeight(OUP.LJIILJJIL(this.LIZ.mContext, str));
    }
}
