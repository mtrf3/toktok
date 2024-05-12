package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestCommonSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N3W {
    public static final N3W LIZ = new N3W();

    static {
        new LinkedHashMap();
    }

    public static String LIZ() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Map LIZIZ = LIZIZ(RtcAbLabelSetting.INSTANCE.getValue());
            java.util.Map LIZIZ2 = LIZIZ(LinkMicRtcAbParamsSetting.INSTANCE.getValue());
            java.util.Map LIZIZ3 = LIZIZ(LinkMicRtcAbParamsMultiGuestCommonSetting.INSTANCE.getValue());
            java.util.Map LIZIZ4 = LIZIZ(LinkMicRtcAbParamsMultiGuestGuestSetting.INSTANCE.getValue());
            linkedHashMap.putAll(LIZIZ);
            linkedHashMap.putAll(LIZIZ2);
            linkedHashMap.putAll(LIZIZ3);
            linkedHashMap.putAll(LIZIZ4);
            String jSONObject = new JSONObject(linkedHashMap).toString();
            o.LJIIIIZZ(jSONObject, "JSONObject(resultMap).toString()");
            return jSONObject;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static java.util.Map LIZIZ(String str) {
        C93833mF LJJJLIIL = C113554cx.LJJJLIIL();
        if (C96Q.LIZ(str)) {
            try {
                return C38385F4r.LIZIZ(new JSONObject(str));
            } catch (Throwable unused) {
                return LJJJLIIL;
            }
        }
        return LJJJLIIL;
    }
}
