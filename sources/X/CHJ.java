package X;

import com.bytedance.android.livesdk.livesetting.other.LiveBadgeLoadOptSetting;

/* loaded from: classes6.dex */
public final class CHJ extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CHJ LJLIL = new CHJ();

    public CHJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(LiveBadgeLoadOptSetting.getValue());
    }
}
