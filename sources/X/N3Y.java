package X;

import com.bytedance.android.live.liveinteract.multiguestv3.service.MultiGuestV3InternalServiceImplV2;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestCommonSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final /* synthetic */ class N3Y extends TBS implements InterfaceC65784Pro<String> {
    public N3Y(Object obj) {
        super(0, obj, MultiGuestV3InternalServiceImplV2.class, "generateRTCParamByRole", "generateRTCParamByRole()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        boolean z;
        Room room = ((MultiGuestV3InternalServiceImplV2) this.receiver).LJLIL;
        if (room != null) {
            if (room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                N3W.LIZ.getClass();
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    java.util.Map LIZIZ = N3W.LIZIZ(RtcAbLabelSetting.INSTANCE.getValue());
                    java.util.Map LIZIZ2 = N3W.LIZIZ(LinkMicRtcAbParamsSetting.INSTANCE.getValue());
                    java.util.Map LIZIZ3 = N3W.LIZIZ(LinkMicRtcAbParamsMultiGuestCommonSetting.INSTANCE.getValue());
                    java.util.Map LIZIZ4 = N3W.LIZIZ(LinkMicRtcAbParamsMultiGuestAnchorSetting.INSTANCE.getValue());
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
            N3W.LIZ.getClass();
            return N3W.LIZ();
        }
        o.LJIJI("room");
        throw null;
    }
}
