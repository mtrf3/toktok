package X;

import android.graphics.Typeface;
import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;

/* renamed from: X.VRa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79734VRa implements VEF {
    public final /* synthetic */ LynxPickerViewColumn LIZ;

    public C79734VRa(LynxPickerViewColumn lynxPickerViewColumn) {
        this.LIZ = lynxPickerViewColumn;
    }

    @Override // X.VEF
    public final void LIZ(Typeface typeface, int i) {
        ((VSW) this.LIZ.mView).setTypeface(Typeface.create(typeface, i));
    }
}
