package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.google.gson.internal.b;
import org.json.JSONObject;

/* renamed from: X.Pd3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64869Pd3 {
    public final IWsChannelClient LIZ;
    public final Context LIZIZ;

    public C64869Pd3(Context context, IWsChannelClient iWsChannelClient) {
        this.LIZ = iWsChannelClient;
        this.LIZIZ = context;
    }

    public final void LIZ(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putInt("error_code", i);
        bundle.putString("error_msg", str2);
        bundle.putString("method", "onFailure");
        b.LJJI(this.LIZIZ, "WsChannelSdk_ok", bundle);
        if (this.LIZ != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 0);
                jSONObject.put("state", 2);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                jSONObject.put("error", str2);
                jSONObject.put("error_code", i);
                this.LIZ.onConnection(jSONObject);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
