package X;

import com.byted.cast.common.Logger;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.async.ConcurrentSubject;
import com.byted.cast.common.async.Observer;
import com.byted.cast.common.sink.CallbackServerInfo;
import com.byted.cast.common.sink.IServerListener;
import com.byted.cast.common.sink.ServerInfo;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;

/* renamed from: X.ZlB, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90853ZlB implements Observer<CallbackServerInfo> {
    public boolean LIZ;
    public final /* synthetic */ C90547ZgF LIZIZ;

    public C90853ZlB(C90547ZgF c90547ZgF) {
        this.LIZIZ = c90547ZgF;
    }

    @Override // com.byted.cast.common.async.Observer
    public final void call(CallbackServerInfo callbackServerInfo) {
        CallbackServerInfo callbackServerInfo2 = callbackServerInfo;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("call: serviceId:");
        LIZ.append(callbackServerInfo2.serviceId);
        LIZ.append(", serverInfo:");
        LIZ.append(callbackServerInfo2.serverInfo);
        Logger.d("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("call: mCachedService.size():");
        LIZ2.append(((HashMap) this.LIZIZ.LJJIFFI).size());
        LIZ2.append(", castSinkMap.size():");
        LIZ2.append(((ConcurrentHashMap) this.LIZIZ.LJIIIIZZ).size());
        Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ2));
        if (((HashMap) this.LIZIZ.LJJIFFI).size() == ((ConcurrentHashMap) this.LIZIZ.LJIIIIZZ).size()) {
            this.LIZ = true;
            ServerInfo serverInfo = callbackServerInfo2.serverInfo;
            serverInfo.appendPortInfo(this.LIZIZ.LJJIFFI);
            ((HashMap) this.LIZIZ.LJJIFFI).clear();
            Logger.i("ByteCastSinkImpl", "will notify onStart");
            this.LIZIZ.getClass();
            IServerListener iServerListener = this.LIZIZ.LJIJJLI;
            if (iServerListener != null) {
                iServerListener.onStart(callbackServerInfo2.serviceId, serverInfo);
            }
            Monitor.sendSinkEvent("bytecast_start_server_success", "");
            ConcurrentSubject<CallbackServerInfo> concurrentSubject = this.LIZIZ.LJJII;
            if (concurrentSubject != null) {
                concurrentSubject.dispose();
                this.LIZIZ.LJJII.clearObservers();
            }
        }
    }

    @Override // com.byted.cast.common.async.Observer
    public final void exception(Exception exc) {
        if (this.LIZ && (exc instanceof TimeoutException)) {
            Logger.d("ByteCastSinkImpl", "timeout, startServer success, so no need handle it.");
        }
    }
}
