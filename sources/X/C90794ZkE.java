package X;

import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.IConnectListener;
import com.byted.cast.common.async.ConcurrentSubject;
import com.byted.cast.common.async.Observer;
import com.byted.cast.common.source.IServerListener;
import com.byted.cast.common.source.ServiceInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;

/* renamed from: X.ZkE, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90794ZkE implements Observer<C90429ZeL> {
    public final /* synthetic */ boolean[] LIZ;
    public final /* synthetic */ ServiceInfo LIZIZ;
    public final /* synthetic */ C90801ZkL LIZJ;

    @Override // com.byted.cast.common.async.Observer
    public final void call(C90429ZeL c90429ZeL) {
        C90429ZeL c90429ZeL2 = c90429ZeL;
        if (c90429ZeL2 == null) {
            this.LIZJ.LIZIZ.w("ByteCastSourceImpl", "connect callback, callbackInfo is null");
            return;
        }
        if (c90429ZeL2.LIZ != 1) {
            return;
        }
        this.LIZ[0] = true;
        CastLogger castLogger = this.LIZJ.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("parseQRCodeToServiceInfo, onConnect handleConnectCallback success serviceInfo:");
        LIZ.append(c90429ZeL2.LIZIZ);
        castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        C90801ZkL c90801ZkL = this.LIZJ;
        c90801ZkL.LJJIJIIJIL = EnumC90460Zeq.STATE_CONNECTED;
        ServiceInfo serviceInfo = c90429ZeL2.LIZIZ;
        ServiceInfo serviceInfo2 = c90801ZkL.LJJJZ;
        if (serviceInfo2 == null) {
            c90801ZkL.LJJJZ = serviceInfo;
        } else if (TextUtils.equals(serviceInfo2.ip, serviceInfo.ip) || TextUtils.equals(c90801ZkL.LJJJZ.name, serviceInfo.name)) {
            if (!c90801ZkL.LJJJZ.types.contains(serviceInfo.types)) {
                StringBuilder LIZ2 = X1D.LIZ();
                ServiceInfo serviceInfo3 = c90801ZkL.LJJJZ;
                LIZ2.append(serviceInfo3.types);
                LIZ2.append(",");
                LIZ2.append(serviceInfo.types);
                serviceInfo3.types = X1D.LIZIZ(LIZ2);
                ServiceInfo serviceInfo4 = c90801ZkL.LJJJZ;
                serviceInfo4.protocols = serviceInfo4.types;
            }
            if (TextUtils.isEmpty(c90801ZkL.LJJJZ.connectID)) {
                c90801ZkL.LJJJZ.connectID = serviceInfo.connectID;
            }
            if (TextUtils.isEmpty(c90801ZkL.LJJJZ.castId)) {
                c90801ZkL.LJJJZ.castId = serviceInfo.castId;
            }
            ServiceInfo serviceInfo5 = c90801ZkL.LJJJZ;
            if (serviceInfo5.portMirror <= 0) {
                serviceInfo5.portMirror = serviceInfo.portMirror;
            }
            if (serviceInfo5.port <= 0) {
                serviceInfo5.port = serviceInfo.port;
            }
            if (serviceInfo5.deviceParams.isEmpty()) {
                c90801ZkL.LJJJZ.deviceParams = serviceInfo.deviceParams;
            }
            if (TextUtils.isEmpty(c90801ZkL.LJJJZ.data)) {
                c90801ZkL.LJJJZ.data = serviceInfo.data;
            }
            if (TextUtils.isEmpty(c90801ZkL.LJJJZ.manufacture)) {
                c90801ZkL.LJJJZ.manufacture = serviceInfo.manufacture;
            }
            if (TextUtils.isEmpty(c90801ZkL.LJJJZ.name)) {
                c90801ZkL.LJJJZ.name = serviceInfo.name;
            }
            if (serviceInfo.isSupportPlayList) {
                ServiceInfo serviceInfo6 = c90801ZkL.LJJJZ;
                if (!serviceInfo6.isSupportPlayList) {
                    serviceInfo6.isSupportPlayList = true;
                }
            }
            if (serviceInfo.isSupportDetect() && !c90801ZkL.LJJJZ.isSupportDetect()) {
                c90801ZkL.LJJJZ.setSupportDetect(true);
            }
            if (serviceInfo.isSupportPing() && !c90801ZkL.LJJJZ.isSupportPing()) {
                c90801ZkL.LJJJZ.setSupportPing(true);
            }
            serviceInfo = c90801ZkL.LJJJZ;
        }
        IConnectListener iConnectListener = this.LIZJ.LJJIJLIJ;
        if (iConnectListener != null) {
            iConnectListener.onConnect(serviceInfo, c90429ZeL2.LIZLLL);
        }
        IServerListener iServerListener = this.LIZJ.LJJJJIZL;
        if (iServerListener != null) {
            iServerListener.onConnect(0, serviceInfo, c90429ZeL2.LIZLLL);
        }
        this.LIZJ.getClass();
        this.LIZJ.getClass();
        C90801ZkL c90801ZkL2 = this.LIZJ;
        synchronized (c90801ZkL2) {
            CastLogger castLogger2 = c90801ZkL2.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("in handleConnectCallback:");
            LIZ3.append(c90429ZeL2);
            castLogger2.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ3));
            if (((HashMap) c90801ZkL2.LJJIJL).containsKey(c90429ZeL2.LIZIZ.types)) {
                CastLogger castLogger3 = c90801ZkL2.LIZIZ;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("for ");
                LIZ4.append(c90429ZeL2.LIZIZ.types);
                LIZ4.append(", already connected!");
                castLogger3.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ4));
            } else {
                ((HashMap) c90801ZkL2.LJJIJL).put(c90429ZeL2.LIZIZ.types, c90429ZeL2);
                Iterator it = ((HashMap) c90801ZkL2.LJJIJIL).values().iterator();
                long j = 0;
                while (it.hasNext()) {
                    if (((C90430ZeM) it.next()).LIZIZ) {
                        j++;
                    }
                }
                CastLogger castLogger4 = c90801ZkL2.LIZIZ;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("handleConnectCallback: mCachedServices.size:");
                LIZ5.append(((HashMap) c90801ZkL2.LJJIJL).size());
                LIZ5.append(", thresholdSize:");
                LIZ5.append(j);
                castLogger4.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ5));
                if (((HashMap) c90801ZkL2.LJJIJL).size() >= j && c90801ZkL2.LJJIJLIJ != null && !c90801ZkL2.LJJJ.protocols.equals("")) {
                    CastLogger castLogger5 = c90801ZkL2.LIZIZ;
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("handleConnectCallback, onConnect:");
                    LIZ6.append(c90801ZkL2.LJJJ);
                    LIZ6.append(", extra:");
                    LIZ6.append(c90429ZeL2.LIZLLL);
                    castLogger5.d("ByteCastSourceImpl", X1D.LIZIZ(LIZ6));
                    ((HashMap) c90801ZkL2.LJJIJL).clear();
                    ConcurrentSubject<C90429ZeL> concurrentSubject = c90801ZkL2.LJJIJ;
                    if (concurrentSubject != null) {
                        concurrentSubject.dispose();
                    }
                }
            }
        }
        this.LIZJ.LJIJI.LJI = serviceInfo;
    }

    @Override // com.byted.cast.common.async.Observer
    public final void exception(Exception exc) {
        CastLogger castLogger = this.LIZJ.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mConnectObserver exception: ");
        LIZ.append(exc.toString());
        castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        if (exc instanceof TimeoutException) {
            if (!this.LIZ[0]) {
                this.LIZJ.getClass();
                this.LIZJ.getClass();
                IConnectListener iConnectListener = this.LIZJ.LJJIJLIJ;
                if (iConnectListener != null) {
                    iConnectListener.onDisconnect(this.LIZIZ, 201, 17020005);
                }
                IServerListener iServerListener = this.LIZJ.LJJJJIZL;
                if (iServerListener != null) {
                    iServerListener.onDisconnect(0, this.LIZIZ, 201, 17020005);
                }
            }
            ((HashMap) this.LIZJ.LJJIJL).clear();
            ConcurrentSubject<C90429ZeL> concurrentSubject = this.LIZJ.LJJIJ;
            if (concurrentSubject != null) {
                concurrentSubject.dispose();
            }
        }
        this.LIZJ.LJJIJIIJIL = EnumC90460Zeq.STATE_CONNECTED;
    }

    public C90794ZkE(C90801ZkL c90801ZkL, boolean[] zArr, ServiceInfo serviceInfo) {
        this.LIZJ = c90801ZkL;
        this.LIZ = zArr;
        this.LIZIZ = serviceInfo;
    }
}
