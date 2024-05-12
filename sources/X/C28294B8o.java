package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchScrollFpsOptSetting;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.B8o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28294B8o extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28294B8o(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        if (LiveWatchScrollFpsOptSetting.INSTANCE.enable("fanclub")) {
            C20910rv.LJI(R.layout.d3a, this, true, 8);
        } else {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.d3a, this, true);
        }
    }
}
