package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.8HQ, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8HQ extends FrameLayout {
    public C8HQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        GradientDrawable LJJLJ = C78880UxY.LJJLJ(context, attributeSet, true);
        if (LJJLJ != null) {
            setBackground(LJJLJ);
        }
    }
}
