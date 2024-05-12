package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BYa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28956BYa {
    public static void LIZ(DataChannel dataChannel, String str, boolean z, boolean z2) {
        String str2;
        if (!z) {
            str2 = "screencasting_entrance_show";
        } else {
            str2 = "screencasting_entrance_click";
        }
        String str3 = LiveMode.LIVE_STUDIO.logStreamingType;
        BZI LIZ = C28787BRn.LIZ(str2);
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(str3, "live_type");
        LIZ.LJIJJ(str, "event_page");
        if (z) {
            LIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "screencasting_status");
        }
        LIZ.LJJIIJZLJL();
    }
}
