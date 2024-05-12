package X;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBgOptTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameOtherBackgroundImageOptimizeSetting;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class U5P extends AbstractC65781Prl implements InterfaceC65784Pro<Drawable> {
    public static final U5P LJLIL = new U5P();

    public U5P() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Drawable invoke() {
        if (TtliveGameOtherBackgroundImageOptimizeSetting.INSTANCE.isBackgroundImmutable() && MultiGuestBgOptTechSwitchSetting.INSTANCE.isEnable()) {
            return new ColorDrawable(-16777216);
        }
        return new BitmapDrawable(BitmapFactory.decodeResource(C15380j0.LJIIJ(), R.drawable.d94));
    }
}
