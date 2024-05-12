package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* renamed from: X.PdE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64880PdE extends QFM {
    public final IWsChannelClient LIZ;

    public C64880PdE(IWsChannelClient iWsChannelClient) {
        this.LIZ = iWsChannelClient;
    }

    @Override // X.QFM
    public final void LIZIZ(int i, String str) {
        Logger.debug();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1);
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        i = 6;
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 0;
            }
            jSONObject.put("state", i);
            jSONObject.put("url", str);
            this.LIZ.onConnection(jSONObject);
        } catch (Throwable unused) {
        }
    }

    @Override // X.QFM
    public final void LIZLLL(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[byteBuffer.capacity()];
        try {
            byteBuffer.get(bArr);
            this.LIZ.onMessage(bArr);
        } catch (Throwable unused) {
        }
    }

    @Override // X.QFM
    public final void LIZ(int i, String str, String str2) {
        Logger.debug();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 0);
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        i = 6;
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 0;
            }
            jSONObject.put("state", i);
            jSONObject.put("url", str);
            jSONObject.put("error", str2);
            this.LIZ.onConnection(jSONObject);
        } catch (Throwable unused) {
        }
    }

    @Override // X.QFM
    public final void LJ(String str, long j, long j2, boolean z) {
        try {
            PNJ.LIZ().LIZIZ(str, j, j2, z);
        } catch (Throwable unused) {
        }
    }
}
