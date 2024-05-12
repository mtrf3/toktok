package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBgOptTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameOtherBackgroundImageOptimizeSetting;

/* loaded from: classes14.dex */
public final class U5R extends AbstractC65781Prl implements InterfaceC65784Pro<Drawable> {
    public static final U5R LJLIL = new U5R();

    public U5R() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Drawable invoke() {
        if (TtliveGameOtherBackgroundImageOptimizeSetting.INSTANCE.isBackgroundImmutable() && MultiGuestBgOptTechSwitchSetting.INSTANCE.isEnable()) {
            return new ColorDrawable(-16777216);
        }
        return new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[]{-16118210, -14676954});
    }
}
