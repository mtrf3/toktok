package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* loaded from: classes13.dex */
public final class S2C extends FrameLayout {
    public S2H LJLIL;

    public final C26773Af3 getFlashCountDownView() {
        S2H s2h = this.LJLIL;
        if (s2h != null) {
            return s2h.LIZIZ();
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2C(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    public final void setFlashSaleText(String str) {
        TuxTextView LIZ;
        TuxTextView LIZ2;
        if (!TextUtils.isEmpty(str)) {
            S2H s2h = this.LJLIL;
            if (s2h == null || (LIZ2 = s2h.LIZ()) == null) {
                return;
            }
            LIZ2.setText(str);
            return;
        }
        S2H s2h2 = this.LJLIL;
        if (s2h2 == null || (LIZ = s2h2.LIZ()) == null) {
            return;
        }
        LIZ.setText(C16880lQ.LLLLL(getContext()).getString(R.string.htw));
    }
}
