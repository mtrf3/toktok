package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.2QX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2QX extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2QX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        int i = 0;
        do {
            addView(C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.drn, this, false));
            i++;
        } while (i < 11);
    }
}
