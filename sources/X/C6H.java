package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickIntervalSetting;

/* loaded from: classes6.dex */
public final class C6H {
    public static void LIZ(View.OnClickListener onClickListener, View view) {
        if (view != null) {
            if (FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue()) {
                C16880lQ.LJIIJ(new C6N(FirstScreenDebounceClickIntervalSetting.INSTANCE.getValue(), onClickListener), view);
            } else {
                C16880lQ.LJIIJ(onClickListener, view);
            }
        }
    }
}
