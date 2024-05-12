package X;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.T4i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74048T4i extends C16120kC {
    public final /* synthetic */ C74059T4t LIZ;

    public C74048T4i(C74059T4t c74059T4t) {
        this.LIZ = c74059T4t;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        int intValue = ((Integer) view.getTag(R.id.gg9)).intValue();
        if (intValue > 0) {
            TextView textView = this.LIZ.LJLJL.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                c17760mq.LIZ.setTraversalAfter(textView);
            } else {
                c17760mq.getClass();
            }
        }
        c17760mq.LJIIZILJ(C17740mo.LIZ(0, 1, intValue, 1, view.isSelected()));
    }
}
