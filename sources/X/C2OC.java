package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.2OC, reason: invalid class name */
/* loaded from: classes2.dex */
public class C2OC extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        View findViewById = findViewById(R.id.jbo);
        if (findViewById != null) {
            if (findViewById.getParent() == this) {
                windowInsets = findViewById.dispatchApplyWindowInsets(windowInsets);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("StatusBarView parent must be ");
                LIZ.append(C16880lQ.LJLLJ(getClass()));
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        View findViewById2 = findViewById(R.id.jbl);
        if (findViewById2 != null) {
            if (findViewById2.getParent() == this) {
                windowInsets = findViewById2.dispatchApplyWindowInsets(windowInsets);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("NavigationBarView parent must be ");
                LIZ2.append(C16880lQ.LJLLJ(getClass()));
                throw new IllegalStateException(X1D.LIZIZ(LIZ2));
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != findViewById && childAt != findViewById2) {
                windowInsets = childAt.dispatchApplyWindowInsets(windowInsets);
                if (windowInsets.isConsumed()) {
                    break;
                }
            }
        }
        return windowInsets;
    }

    public C2OC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
