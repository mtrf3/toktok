package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import org.json.JSONObject;

/* renamed from: X.BnF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29829BnF {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static HandlerThread LIZJ;
    public static Handler LIZLLL;

    static {
        Handler handler;
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            handler = new Handler(C39202Fa2.LIZ.LIZIZ());
        } else {
            HandlerThread handlerThread = new HandlerThread("liveMuteMicThread");
            LIZJ = handlerThread;
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        }
        LIZLLL = handler;
    }

    public static Handler LIZ() {
        if (!HandlerThreadOptSetting.INSTANCE.enable() && LIZIZ) {
            LIZIZ = false;
            HandlerThread handlerThread = new HandlerThread("liveMuteMicThread");
            LIZJ = handlerThread;
            handlerThread.start();
            LIZLLL = new Handler(handlerThread.getLooper());
        }
        return LIZLLL;
    }

    public static void LIZIZ(DataChannel dataChannel) {
        HandlerThread handlerThread;
        C29828BnE.LIZIZ(dataChannel);
        LIZ = false;
        LIZ().removeCallbacksAndMessages(null);
        if (!HandlerThreadOptSetting.INSTANCE.enable() && (handlerThread = LIZJ) != null) {
            handlerThread.quit();
            LIZIZ = true;
        }
    }

    public static void LIZJ(LiveCore liveCore, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_mute_mic", z ? 1 : 0);
            liveCore.addSeiField("live_sei_mute_mic", jSONObject, -1, false, true, 0);
        } catch (Exception e) {
            C0NB.LJI("LIVE_MUTE_MIC", e);
        }
    }
}
