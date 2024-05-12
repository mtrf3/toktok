package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* loaded from: classes5.dex */
public final class ARM extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jw);
        a1.LJFF(context, "context");
        if (isInEditMode()) {
            ARK ark = new ARK(context);
            ark.LJ = "I'm a title.";
            ark.LJFF = "I'm some message";
            addView(ark.LIZIZ());
        }
    }
}
