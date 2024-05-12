package X;

import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;

/* renamed from: X.VRb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79735VRb {
    public final /* synthetic */ LynxPickerViewColumn LIZ;

    public C79735VRb(LynxPickerViewColumn lynxPickerViewColumn) {
        this.LIZ = lynxPickerViewColumn;
    }

    public final void LIZ(String str) {
        Long LJIIL = OUP.LJIIL(str);
        if (LJIIL != null) {
            int longValue = (int) LJIIL.longValue();
            ((VSW) this.LIZ.mView).setTextColorCenter(longValue);
            ((VSW) this.LIZ.mView).setTextColorOut(longValue);
        }
    }

    public final void LIZIZ(String str) {
        ((VSW) this.LIZ.mView).setTextSizePx(OUP.LJIILJJIL(this.LIZ.mContext, str));
    }

    public final void LIZJ(String str) {
        ((VSW) this.LIZ.mView).setCenterWeight(str);
    }
}
