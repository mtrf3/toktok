package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.8HR, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8HR extends RelativeLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        GradientDrawable LJJLJ = C78880UxY.LJJLJ(context, attributeSet, true);
        if (LJJLJ != null) {
            setBackground(LJJLJ);
        }
    }
}
