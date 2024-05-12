package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BnE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29828BnE {
    public static long LIZ;
    public static long LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;

    public static void LIZIZ(DataChannel dataChannel) {
        if (!C29829BnF.LIZ) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_mute_time");
        LIZ2.LJIILLIIL(dataChannel);
        I9A.LIZ(System.currentTimeMillis(), LIZ, LIZ2, "use_time");
        LIZ2.LJIJJ(LIZLLL, WM7.SCENE_SERVICE);
        LIZ2.LJIJJ(LIZJ, "method");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(DataChannel dataChannel, String str, boolean z) {
        if (z) {
            LIZ = System.currentTimeMillis();
            LIZJ = str;
            LIZLLL = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
        } else {
            LIZIZ(dataChannel);
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_mute_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_open");
        C06490Nh.LIZLLL(LIZ2, LIZLLL, WM7.SCENE_SERVICE, str, "method");
    }
}
