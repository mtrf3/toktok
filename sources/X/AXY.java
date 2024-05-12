package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;

/* loaded from: classes5.dex */
public final class AXY extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, Integer> {
    public static final AXY LJLIL = new AXY();

    public AXY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(Boolean bool) {
        bool.booleanValue();
        return Integer.valueOf(LiveCoverMinSizeSetting.DEFAULT);
    }
}
