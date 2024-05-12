package X;

import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;

/* renamed from: X.QFh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66689QFh {
    public static final String LIZ = C16880lQ.LJLLJ(C66689QFh.class);

    public static IWsClient LIZ(C66692QFk c66692QFk) {
        try {
            Class<?> cls = Class.forName("org.chromium.wschannel.WsClient");
            if (cls != null) {
                Object newInstance = cls.getDeclaredConstructor(IMessageReceiveListener.class).newInstance(c66692QFk);
                if (!(newInstance instanceof IWsClient)) {
                    return null;
                }
                return (IWsClient) newInstance;
            }
        } catch (Throwable unused) {
        }
        throw new ClassNotFoundException("org.chromium.wschannel.WsClient class not found");
    }
}
