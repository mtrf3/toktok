package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiHostSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final /* synthetic */ class N3X extends TBS implements InterfaceC65784Pro<String> {
    public N3X(N3W n3w) {
        super(0, n3w, N3W.class, "generateForMultiHost", "generateForMultiHost()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        this.receiver.getClass();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Map LIZIZ = N3W.LIZIZ(RtcAbLabelSetting.INSTANCE.getValue());
            java.util.Map LIZIZ2 = N3W.LIZIZ(LinkMicRtcAbParamsSetting.INSTANCE.getValue());
            java.util.Map LIZIZ3 = N3W.LIZIZ(LinkMicRtcAbParamsMultiHostSetting.INSTANCE.getValue());
            linkedHashMap.putAll(LIZIZ);
            linkedHashMap.putAll(LIZIZ2);
            linkedHashMap.putAll(LIZIZ3);
            String jSONObject = new JSONObject(linkedHashMap).toString();
            o.LJIIIIZZ(jSONObject, "JSONObject(resultMap).toString()");
            return jSONObject;
        } catch (Throwable unused) {
            return "";
        }
    }
}
