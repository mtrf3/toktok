package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import defpackage.a1;

/* renamed from: X.89R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89R extends DmtTextView {
    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        if (z) {
            setTextColor(ColorProtector.parseColor("#fe2c55"));
        } else {
            setTextColor(ColorProtector.parseColor("#80fe2c55"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89R(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
