package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostAddFeedComponentsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAudienceSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TuG */
/* loaded from: classes14.dex */
public final class C76128TuG {
    public static int LIZ = -1;

    public static boolean LIZ(DataChannel dataChannel, boolean z, boolean z2) {
        if (z2) {
            return LiveCoHostAddFeedComponentsSetting.INSTANCE.isEnable();
        }
        if (z) {
            LIZ = -1;
        }
        int i = LIZ;
        if (i > -1) {
            if (i == 1) {
                return true;
            }
            return false;
        }
        if (C29306Beo.LJIIJ(dataChannel)) {
            LIZ = LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled() ? 1 : 0;
        } else if (C29306Beo.LJIIL(dataChannel)) {
            LIZ = LiveMatchReDesignAudienceSetting.INSTANCE.isEnabled() ? 1 : 0;
        }
        if (LIZ == 1) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean LIZIZ(DataChannel dataChannel, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return LIZ(dataChannel, false, z);
    }
}
