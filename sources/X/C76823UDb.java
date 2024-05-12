package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGuideOnLeftRTLEnableSetting;

/* renamed from: X.UDb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76823UDb {
    public static void LIZ(UDZ udz) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        if (C15380j0.LJIIZILJ()) {
            if (LiveGiftGuideOnLeftRTLEnableSetting.INSTANCE.getValue()) {
                i = 83;
            } else {
                i = 85;
            }
            ViewGroup.LayoutParams layoutParams2 = udz.LIZ().getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = i;
            }
        }
        C16880lQ.LJIL(udz.LIZ(), ViewOnClickListenerC76822UDa.LJLIL);
    }
}
