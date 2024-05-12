package org.chromium.wschannel;

import J.N;
import X.C16880lQ;
import X.KMP;
import X.QDO;
import X.QEK;
import X.QFA;
import X.QFK;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.CronetClient;

/* loaded from: classes12.dex */
public class WsClient implements IWsClient {
    public static QEK mCronetEngine;
    public QDO mCallback = new QDO(this);
    public IMessageReceiveListener mListener;
    public QFK mWebsocketConnection;

    public int cronetToWsStateAdapter(int i) {
        if (i == -1) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i;
        }
        return 5;
    }

    public static void loadCronetKernel() {
        Object newInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
        Reflect.on(newInstance).call("getInitCompletedLatch");
        Reflect.on(newInstance).call("preInitCronetKernel");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean isConnected() {
        QFK qfk = this.mWebsocketConnection;
        if (qfk == null || ((CronetWebsocketConnection) qfk).LJIJ.get() != 4) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void stopConnection() {
        QFK qfk = this.mWebsocketConnection;
        if (qfk != null) {
            qfk.LIZLLL();
            this.mWebsocketConnection.LIZIZ();
        }
    }

    private QEK getCronetEngine() {
        Logger.debug();
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
            Logger.debug();
        }
        return CronetClient.getCronetEngine();
    }

    public WsClient(IMessageReceiveListener iMessageReceiveListener) {
        if (mCronetEngine == null) {
            mCronetEngine = getCronetEngine();
        }
        this.mListener = iMessageReceiveListener;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean sendMessage(byte[] bArr, int i) {
        Logger.debug();
        if (this.mWebsocketConnection == null) {
            return false;
        }
        if (i == 2) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
            allocateDirect.put(bArr);
            this.mWebsocketConnection.LIZ(allocateDirect);
        } else if (i == 1) {
            String str = new String(bArr, "UTF-8");
            CronetWebsocketConnection cronetWebsocketConnection = (CronetWebsocketConnection) this.mWebsocketConnection;
            synchronized (cronetWebsocketConnection.LJIIZILJ) {
                if (cronetWebsocketConnection.LIZ != 0) {
                    N.MRnDfpSi(cronetWebsocketConnection.LIZ, cronetWebsocketConnection, str);
                }
            }
        } else {
            throw new IllegalArgumentException(KMP.LJ("Unsupported message type: ", i));
        }
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void onParameterChange(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        QFK qfk = this.mWebsocketConnection;
        if (qfk != null) {
            qfk.LIZLLL();
            this.mWebsocketConnection.LIZIZ();
        }
        openConnection(map, map2, list, z, z2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void openConnection(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        if (list != null && list.size() > 0) {
            Logger.debug();
            QFA LIZLLL = mCronetEngine.LIZLLL(this.mCallback, C16880lQ.LLLLZLLIL());
            LIZLLL.LIZLLL = list;
            if (map != null && !map.isEmpty()) {
                LIZLLL.LJIIJJI = map;
            }
            if (map2 != null && !map2.isEmpty()) {
                LIZLLL.LJIIL = map2;
            }
            LIZLLL.LJIILIIL = z;
            LIZLLL.LJIILJJIL = z2;
            QFK LIZ = LIZLLL.LIZ();
            this.mWebsocketConnection = LIZ;
            LIZ.LIZJ();
            return;
        }
        throw new IllegalArgumentException("urls size <= 0 !!!");
    }
}
