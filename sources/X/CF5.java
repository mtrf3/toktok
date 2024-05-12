package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CF5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(JSONObject jSONObject, BarrageMessage barrageMessage) {
        if (barrageMessage != null) {
            C05630Jz.LIZ(barrageMessage.msgType, "barrage_msg_type", jSONObject);
            C05630Jz.LIZ(CF1.LIZLLL(barrageMessage), "barrage_grade", jSONObject);
        }
    }

    public static void LIZIZ(BarrageMessage barrageMessage, boolean z, String channel, boolean z2, String str) {
        String str2;
        o.LJIIIZ(channel, "channel");
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            C05630Jz.LJI(jSONObject, "error_msg", str);
        }
        C05630Jz.LJI(jSONObject, "channel", channel);
        if (z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        C05630Jz.LJI(jSONObject, "call_back_state", str2);
        LIZ(jSONObject, barrageMessage);
        C0K2.LJIIIIZZ("grade_channel_resource_download_event", !z ? 1 : 0, jSONObject);
    }
}
