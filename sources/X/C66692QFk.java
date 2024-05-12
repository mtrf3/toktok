package X;

import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QFk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66692QFk implements IMessageReceiveListener {
    public String LIZ;
    public String LIZIZ;
    public final /* synthetic */ InterfaceC66694QFm LIZJ;

    public C66692QFk(C66691QFj c66691QFj) {
        this.LIZJ = c66691QFj;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener
    public final void onFeedBackLog(String str) {
        JSONObject jSONObject;
        String str2;
        JSONObject jSONObject2;
        if (this.LIZJ == null) {
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        int optInt = jSONObject.optInt("ws_state", -1);
        if (optInt == -1) {
            return;
        }
        if (optInt == 0) {
            if (jSONObject.optBoolean("using_quic")) {
                str2 = "quic";
            } else {
                str2 = "tcp";
            }
            try {
                jSONObject2 = new JSONObject(this.LIZIZ);
            } catch (Exception unused2) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put("__MP_RESP_HEADER", jSONObject.optString("response_header"));
            } catch (Exception unused3) {
            }
            try {
                jSONObject2.put("__MP_TRANSPORT_PROTOCOL", str2);
            } catch (Exception unused4) {
            }
            try {
                jSONObject2.put("__MP_LOG", jSONObject);
            } catch (JSONException unused5) {
            }
            this.LIZJ.LIZ(4, this.LIZ, String.valueOf(jSONObject2));
            return;
        }
        if (optInt == 1 || optInt == 3) {
            this.LIZJ.LIZ(3, this.LIZ, jSONObject.optString("ws_error"));
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener
    public final void onMessage(byte[] bArr, int i) {
        InterfaceC66694QFm interfaceC66694QFm = this.LIZJ;
        if (interfaceC66694QFm == null) {
            return;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 0;
            }
        }
        interfaceC66694QFm.onMessage(bArr, i2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener
    public final void onConnection(int i, String str, JSONObject jSONObject) {
        String str2;
        if (this.LIZJ == null) {
            return;
        }
        if (jSONObject != null) {
            str2 = String.valueOf(jSONObject);
        } else {
            str2 = "{}";
        }
        if (i == 4 || i == 3 || i == 2) {
            this.LIZ = str;
            this.LIZIZ = str2;
        } else {
            this.LIZJ.LIZ(i, str, str2);
        }
    }
}
