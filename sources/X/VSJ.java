package X;

import android.graphics.Typeface;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public final class VSJ implements VEF {
    public final /* synthetic */ LynxBaseInputView LIZ;

    public VSJ(LynxBaseInputView lynxBaseInputView) {
        this.LIZ = lynxBaseInputView;
    }

    @Override // X.VEF
    public final void LIZ(Typeface typeface, int i) {
        LLog.LIZLLL(2, "LynxBaseInputView", "font-face is loaded successfully");
        LynxBaseInputView.LJIJJLI(this.LIZ).setTypeface(Typeface.create(typeface, i));
    }
}
