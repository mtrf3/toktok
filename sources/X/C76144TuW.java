package X;

import com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message.CoHostRtcMessage;
import java.util.HashMap;

/* renamed from: X.TuW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76144TuW {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new HashMap();
        new HashMap();
        new HashMap();
    }

    public static boolean LIZ(CoHostRtcMessage coHostRtcMessage) {
        boolean z;
        String str = coHostRtcMessage.method;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || coHostRtcMessage.channelId <= 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("validateRtcMessage fail: method or channel_id is null, rtcMessage=");
            LIZ2.append(coHostRtcMessage);
            U4R.LIZLLL("CoHostRtcMessageHelper", X1D.LIZIZ(LIZ2));
            return false;
        }
        if (!C76145TuX.LIZ.contains(coHostRtcMessage.method)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("validateRtcMessage fail: method invalidate, rtcMessage=");
            LIZ3.append(coHostRtcMessage);
            U4R.LIZLLL("CoHostRtcMessageHelper", X1D.LIZIZ(LIZ3));
            return false;
        }
        if (coHostRtcMessage.version > 2) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("validateRtcMessage fail: version invalidate, client_version=2, rtcMessage=");
            LIZ4.append(coHostRtcMessage);
            U4R.LIZLLL("CoHostRtcMessageHelper", X1D.LIZIZ(LIZ4));
            return false;
        }
        if (coHostRtcMessage.param != null) {
            return true;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("validateRtcMessage fail: param invalidate, rtcMessage=");
        LIZ5.append(coHostRtcMessage);
        U4R.LIZLLL("CoHostRtcMessageHelper", X1D.LIZIZ(LIZ5));
        return false;
    }
}
