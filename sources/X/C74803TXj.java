package X;

import com.bytedance.android.live.liveinteract.platform.common.monitor.MultiGuestSeiAbnormalDetector;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSeiAbnormalDetectorSwitch;

/* renamed from: X.TXj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74803TXj {
    public static MultiGuestSeiAbnormalDetector LIZ() {
        if (MultiGuestSeiAbnormalDetectorSwitch.INSTANCE.getValue().isOpenDetector) {
            return (MultiGuestSeiAbnormalDetector) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_SEI_ABNORMAL_DETECTOR");
        }
        return null;
    }
}
