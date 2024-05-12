package X;

import Y.ARunnableS4S1200000_5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridContainerOfflineLabelDenyListSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.OldContainerOfflineText;
import com.bytedance.android.livesdk.livesetting.hybrid.ShowNewContainerLabel;
import ujb.s;

/* renamed from: X.C6k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30786C6k {
    public static final void LIZ(View view, String str) {
        Context context;
        if (!((Boolean) COA.LIZIZ.getValue()).booleanValue() || !ShowNewContainerLabel.INSTANCE.getValue() || !(view instanceof FrameLayout) || (context = view.getContext()) == null) {
            return;
        }
        for (String str2 : LiveHybridContainerOfflineLabelDenyListSetting.INSTANCE.getValue()) {
            if (str != null && s.LJJJLZIJ(str, str2, false)) {
                return;
            }
        }
        String value = OldContainerOfflineText.INSTANCE.getValue();
        if (value.length() == 0) {
            return;
        }
        view.post(new ARunnableS4S1200000_5(context, view, value, 1));
    }
}
