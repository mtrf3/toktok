package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.Space;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.4RZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RZ extends FrameLayout {
    public final void LIZ() {
        removeAllViews();
        Space space = new Space(getContext());
        space.setLayoutParams(new FrameLayout.LayoutParams(-1, C7MY.LIZIZ(24)));
        addView(space);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4RZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jw);
        a1.LJFF(context, "context");
        LIZ();
    }
}
