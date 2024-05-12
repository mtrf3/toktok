package X;

import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import java.nio.ByteBuffer;
import org.chromium.wschannel.WsClient;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QDO extends QFM {
    public final /* synthetic */ WsClient LIZ;

    public QDO(WsClient wsClient) {
        this.LIZ = wsClient;
    }

    @Override // X.QFM
    public final void LIZJ(String str) {
        IMessageReceiveListener iMessageReceiveListener = this.LIZ.mListener;
        if (iMessageReceiveListener != null) {
            iMessageReceiveListener.onFeedBackLog(str);
        }
    }

    @Override // X.QFM
    public final void LIZIZ(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", this.LIZ.cronetToWsStateAdapter(i));
            jSONObject.put("url", str);
            IMessageReceiveListener iMessageReceiveListener = this.LIZ.mListener;
            if (iMessageReceiveListener != null) {
                iMessageReceiveListener.onConnection(i, str, jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.QFM
    public final void LIZLLL(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[byteBuffer.capacity()];
        if (i != 1 && i != 2) {
            i = 0;
        }
        try {
            byteBuffer.get(bArr);
            IMessageReceiveListener iMessageReceiveListener = this.LIZ.mListener;
            if (iMessageReceiveListener != null) {
                iMessageReceiveListener.onMessage(bArr, i);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.QFM
    public final void LIZ(int i, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("error", str2);
            IMessageReceiveListener iMessageReceiveListener = this.LIZ.mListener;
            if (iMessageReceiveListener != null) {
                iMessageReceiveListener.onConnection(i, str, jSONObject);
            }
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
