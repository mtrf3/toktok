package X;

import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;

/* renamed from: X.VRc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79736VRc {
    public final /* synthetic */ LynxPickerViewColumn LIZ;

    public C79736VRc(LynxPickerViewColumn lynxPickerViewColumn) {
        this.LIZ = lynxPickerViewColumn;
    }

    public final void LIZ(String str) {
        Long LJIIL = OUP.LJIIL(str);
        if (LJIIL != null) {
            ((VSW) this.LIZ.mView).setDividerColor((int) LJIIL.longValue());
        }
    }

    public final void LIZIZ(String str) {
        ((VSW) this.LIZ.mView).setDividerWidth(OUP.LJIILJJIL(this.LIZ.mContext, str));
    }
}
