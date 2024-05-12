package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QFE implements QFP {
    public final IWsChannelClient LIZ;
    public final QFB LIZIZ;

    public QFE(IWsChannelClient iWsChannelClient, QFB qfb) {
        this.LIZ = iWsChannelClient;
        this.LIZIZ = qfb;
    }

    public final void LIZIZ(int i, String str) {
        Logger.debug();
        if (i == 2) {
            this.LIZIZ.LJIIIIZZ = false;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("private_protocol_enable", 1);
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
            } else {
                i = 4;
            }
            jSONObject.put("state", i);
            jSONObject.put("url", str);
            this.LIZ.onConnection(jSONObject);
        } catch (Throwable unused) {
        }
    }

    public final void LIZ(int i, String str, String str2) {
        Logger.debug();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 0);
            jSONObject.put("private_protocol_enable", 1);
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
            } else {
                i = 4;
            }
            jSONObject.put("state", i);
            jSONObject.put("url", str);
            jSONObject.put("error", str2);
            this.LIZ.onConnection(jSONObject);
        } catch (Throwable unused) {
        }
    }
}
