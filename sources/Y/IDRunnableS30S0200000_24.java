package Y;

import X.AbstractC90875ZlX;
import X.C16880lQ;
import X.C90101ZXt;
import X.C90414Ze6;
import X.C90416Ze8;
import X.C90431ZeN;
import X.C90469Zez;
import X.C90492ZfM;
import X.C90495ZfP;
import X.C90506Zfa;
import X.C90639Zhj;
import X.C90777Zjx;
import X.C90779Zjz;
import X.C90801ZkL;
import X.C90836Zku;
import X.C90918ZmE;
import X.C90932ZmS;
import X.InterfaceC67740QiG;
import X.InterfaceC90110ZYc;
import X.InterfaceC90502ZfW;
import X.QH7;
import X.X1D;
import X.ZY4;
import X.ZY5;
import X.ZYJ;
import Y.IDRunnableS30S0200000_24;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.PreferenceUtils;
import com.byted.cast.common.SourceMonitorUtils;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.api.PlayerInfo;
import com.byted.cast.common.discovery.INsdHelper;
import com.byted.cast.common.discovery.NsdService;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.utils.DLNAOptionUtils;
import com.byted.cast.common.utils.GsonUtils;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class IDRunnableS30S0200000_24 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ServiceInfo serviceInfo;
        if (((C90414Ze6) this.l1).LIZ == null || (serviceInfo = (ServiceInfo) this.l0) == null || !serviceInfo.isSupportDetect() || !((C90414Ze6) this.l1).LJI) {
            CastLogger castLogger = ((C90414Ze6) this.l1).LIZLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("detectService isStart: ");
            LIZ.append(((C90414Ze6) this.l1).LJI);
            LIZ.append(", nsdService: ");
            LIZ.append((ServiceInfo) this.l0);
            castLogger.w("BDLinkServiceDetector", X1D.LIZIZ(LIZ));
            return;
        }
        ServiceInfo currentPlayServiceInfo = ((C90414Ze6) this.l1).LIZ.getCurrentPlayServiceInfo();
        if (currentPlayServiceInfo != null && TextUtils.equals(((ServiceInfo) this.l0).name, currentPlayServiceInfo.name) && TextUtils.equals(((ServiceInfo) this.l0).ip, currentPlayServiceInfo.ip) && ((ServiceInfo) this.l0).port == currentPlayServiceInfo.port) {
            CastLogger castLogger2 = ((C90414Ze6) this.l1).LIZLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("currentService same with nsdService, currentService: ");
            LIZ2.append(currentPlayServiceInfo);
            LIZ2.append(", serviceInfo: ");
            LIZ2.append((ServiceInfo) this.l0);
            castLogger2.i("BDLinkServiceDetector", X1D.LIZIZ(LIZ2));
            return;
        }
        if (((ServiceInfo) this.l0).isSupportPing()) {
            ((C90414Ze6) this.l1).LIZLLL.i("BDLinkServiceDetector", "use ping detect");
            ICastSource iCastSource = ((C90414Ze6) this.l1).LIZ;
            ServiceInfo serviceInfo2 = (ServiceInfo) this.l0;
            if (iCastSource.ping(serviceInfo2.ip, serviceInfo2.port)) {
                CastLogger castLogger3 = ((C90414Ze6) this.l1).LIZLLL;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("detect success, name:");
                LIZ3.append(((ServiceInfo) this.l0).name);
                LIZ3.append(", ip:");
                LIZ3.append(((ServiceInfo) this.l0).ip);
                castLogger3.i("BDLinkServiceDetector", X1D.LIZIZ(LIZ3));
                ((ServiceInfo) this.l0).setDetectFailCount(0);
                return;
            }
        } else {
            ((C90414Ze6) this.l1).LIZLLL.i("BDLinkServiceDetector", "use getDeviceInfo detect");
            ICastSource iCastSource2 = ((C90414Ze6) this.l1).LIZ;
            ServiceInfo serviceInfo3 = (ServiceInfo) this.l0;
            if (iCastSource2.getSinkDeviceInfo(serviceInfo3.ip, serviceInfo3.port) != null) {
                CastLogger castLogger4 = ((C90414Ze6) this.l1).LIZLLL;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("detect success, name:");
                LIZ4.append(((ServiceInfo) this.l0).name);
                LIZ4.append(", ip:");
                LIZ4.append(((ServiceInfo) this.l0).ip);
                castLogger4.i("BDLinkServiceDetector", X1D.LIZIZ(LIZ4));
                ((ServiceInfo) this.l0).setDetectFailCount(0);
                return;
            }
        }
        ServiceInfo serviceInfo4 = (ServiceInfo) this.l0;
        serviceInfo4.setDetectFailCount(serviceInfo4.getDetectFailCount() + 1);
        ((C90414Ze6) this.l1).LIZLLL.i("BDLinkServiceDetector", "detect fail, name:" + ((ServiceInfo) this.l0).name + ", ip:" + ((ServiceInfo) this.l0) + ", detectFailCount:" + ((ServiceInfo) this.l0).getDetectFailCount());
        if (((ServiceInfo) this.l0).getDetectFailCount() < 3) {
            ((C90414Ze6) this.l1).LIZIZ.postDelayed(new IDRunnableS86S0100000_24(this, 6), 1000L);
            return;
        }
        C90492ZfM c90492ZfM = ((C90414Ze6) this.l1).LJ;
        ServiceInfo serviceInfo5 = (ServiceInfo) this.l0;
        C90495ZfP c90495ZfP = c90492ZfM.LIZ;
        C90777Zjx c90777Zjx = c90495ZfP.LIZIZ;
        if (!DLNAOptionUtils.isEnableMdnsSearch(c90777Zjx.LIZIZ)) {
            c90777Zjx.LIZJ.d("NsdClient", "onDeviceOffline, isEnableMdnsSearch is false");
        } else {
            synchronized (c90777Zjx) {
                INsdHelper iNsdHelper = c90777Zjx.LJIIIIZZ;
                if (iNsdHelper == null) {
                    c90777Zjx.LIZJ.w("NsdClient", "onDeviceOffline, mNsdHelper is null");
                } else {
                    int nsdHelperType = iNsdHelper.getNsdHelperType();
                    if (nsdHelperType == 1) {
                        c90777Zjx.LIZLLL.getSourceMonitor().trackBrowseEvent("nsdmanager", "Nsd_Service_Offline", serviceInfo5.toString());
                    } else if (nsdHelperType == 2) {
                        c90777Zjx.LIZLLL.getSourceMonitor().trackBrowseEvent("dnssd", "Nsd_Service_Offline", serviceInfo5.toString());
                    } else if (nsdHelperType == 3) {
                        c90777Zjx.LIZLLL.getSourceMonitor().trackBrowseEvent("jmdns", "Nsd_Service_Offline", serviceInfo5.toString());
                    }
                    NsdService nsdService = (NsdService) ((ConcurrentHashMap) c90777Zjx.LJIILIIL).get(serviceInfo5.name);
                    ((ConcurrentHashMap) c90777Zjx.LJIILIIL).remove(serviceInfo5.name);
                    CastLogger castLogger5 = c90777Zjx.LIZJ;
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("onDeviceOffline:");
                    LIZ5.append(serviceInfo5);
                    LIZ5.append("offlineService ");
                    LIZ5.append(nsdService);
                    LIZ5.append(", size:");
                    LIZ5.append(((ConcurrentHashMap) c90777Zjx.LJIILIIL).size());
                    castLogger5.i("NsdClient", X1D.LIZIZ(LIZ5));
                    c90777Zjx.LIZIZ(nsdService);
                }
            }
        }
        c90495ZfP.LIZJ.getClass();
        ICastSource iCastSource3 = c90495ZfP.LIZLLL.LIZJ;
        if (iCastSource3 == null) {
            return;
        }
        iCastSource3.onSsdpDeviceOffline(serviceInfo5);
    }

    public final void LIZ$1() {
        String projectId;
        C90416Ze8 c90416Ze8 = (C90416Ze8) this.l1;
        ServiceInfo serviceInfo = (ServiceInfo) this.l0;
        c90416Ze8.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(serviceInfo.ip);
        LIZ.append("_");
        LIZ.append(serviceInfo.port);
        LIZ.append("_");
        LIZ.append(serviceInfo.name);
        c90416Ze8.LJIIJJI.put(X1D.LIZIZ(LIZ), serviceInfo);
        String jsonIgnoreException = GsonUtils.toJsonIgnoreException(c90416Ze8.LJIIJJI);
        CastLogger castLogger = c90416Ze8.LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("writeCacheInner size: ");
        LIZ2.append(c90416Ze8.LJIIJJI.size());
        LIZ2.append(", serviceMap: ");
        LIZ2.append(jsonIgnoreException);
        castLogger.i("BDLinkServiceDiskCacheHelper", X1D.LIZIZ(LIZ2));
        Context context = c90416Ze8.LIZ;
        if (context != null) {
            ContextManager.CastContext castContext = c90416Ze8.LIZIZ;
            if (castContext == null) {
                projectId = "";
            } else {
                projectId = castContext.getProjectId();
            }
            PreferenceUtils.setBDLinkServiceInfo(context, projectId, jsonIgnoreException);
        }
    }

    public final void LIZ$2() {
        CastLogger castLogger = ((C90777Zjx) this.l1).LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lost, NsdService:");
        LIZ.append((NsdService) this.l0);
        castLogger.i("NsdClient", X1D.LIZIZ(LIZ));
        for (Map.Entry entry : ((ConcurrentHashMap) ((C90777Zjx) this.l1).LJIILJJIL).entrySet()) {
            if (TextUtils.equals(((ServiceInfo) entry.getValue()).name, ((NsdService) this.l0).getName())) {
                ((ConcurrentHashMap) ((C90777Zjx) this.l1).LJIILJJIL).remove(entry.getKey());
                ((C90777Zjx) this.l1).LIZLLL("lost");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03f3, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) != false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDRunnableS30S0200000_24.LIZ$3():void");
    }

    public final void LIZ$4() {
        try {
            if (((ServiceInfo) this.l0) == null) {
                ((C90506Zfa) this.l1).LJIJJLI.w("ChromeCastSourceImpl", "serviceInfo is null.");
                InterfaceC90502ZfW interfaceC90502ZfW = ((C90506Zfa) this.l1).LIZIZ;
                if (interfaceC90502ZfW != null) {
                    ((C90779Zjz) interfaceC90502ZfW).LIZ(null, 201, 26200005);
                    return;
                }
                return;
            }
            if (((ConcurrentHashMap) C90506Zfa.LJJIJIIJI).containsKey(((ServiceInfo) this.l0).castId)) {
                ((C90506Zfa) this.l1).LIZLLL = (ZY4) ((ConcurrentHashMap) C90506Zfa.LJJIJIIJI).get(((ServiceInfo) this.l0).castId);
                C90506Zfa c90506Zfa = (C90506Zfa) this.l1;
                if (c90506Zfa.LIZLLL != null) {
                    c90506Zfa.LJJIJ = false;
                    ((C90506Zfa) this.l1).LIZLLL.LJIIJJI();
                    return;
                }
            }
            InterfaceC90502ZfW interfaceC90502ZfW2 = ((C90506Zfa) this.l1).LIZIZ;
            if (interfaceC90502ZfW2 != null) {
                ((C90779Zjz) interfaceC90502ZfW2).LIZ(null, 201, 26200003);
            }
        } catch (Exception e) {
            ((C90506Zfa) this.l1).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            ((C90506Zfa) this.l1).LJIIZILJ = false;
            InterfaceC90502ZfW interfaceC90502ZfW3 = ((C90506Zfa) this.l1).LIZIZ;
            if (interfaceC90502ZfW3 != null) {
                ((C90779Zjz) interfaceC90502ZfW3).LIZ(null, 201, 26200006);
            }
        }
    }

    public final void LIZ$5() {
        C90101ZXt c90101ZXt;
        try {
            ((C90506Zfa) this.l1).LJII = ZYJ.LIZIZ((Context) this.l0);
            ((C90506Zfa) this.l1).LJIIJ = ZY5.LIZJ((Context) this.l0);
            C90506Zfa c90506Zfa = (C90506Zfa) this.l1;
            c90506Zfa.LJIIJJI = new C90836Zku(c90506Zfa);
            C90506Zfa c90506Zfa2 = (C90506Zfa) this.l1;
            ZYJ zyj = c90506Zfa2.LJII;
            zyj.getClass();
            QH7.LJ("Must be called from the main thread.");
            try {
                c90101ZXt = C90101ZXt.LIZIZ(zyj.LIZIZ.LJ());
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = ZYJ.LJII;
                C16880lQ.LJLLJ(InterfaceC90110ZYc.class);
                c90469Zez.getClass();
                c90101ZXt = null;
            }
            c90506Zfa2.LJIILJJIL = c90101ZXt;
            C90506Zfa c90506Zfa3 = (C90506Zfa) this.l1;
            c90506Zfa3.LJIIIIZZ = c90506Zfa3.LJII.LIZ().LIZJ();
            ((C90506Zfa) this.l1).LJII();
        } catch (Exception e) {
            ((C90506Zfa) this.l1).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            ((C90506Zfa) this.l1).LJIIZILJ = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.QiK] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.QiK] */
    public final void LIZ$6() {
        AbstractC90875ZlX abstractC90875ZlX;
        AbstractC90875ZlX abstractC90875ZlX2;
        try {
            if (((PlayerInfo) this.l0) == null) {
                ((C90506Zfa) this.l1).LJIJJLI.w("ChromeCastSourceImpl", "playerInfo is null.");
                return;
            }
            C90639Zhj LJ = ((C90506Zfa) this.l1).LJ(null);
            if (LJ == null) {
                ((C90506Zfa) this.l1).LJIJJLI.w("ChromeCastSourceImpl", " RemoteMediaClient is null.");
                return;
            }
            ((C90506Zfa) this.l1).LJJIIJ = new JSONObject();
            CastLogger castLogger = ((C90506Zfa) this.l1).LJIJJLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("serviceInfo: ");
            LIZ.append(((PlayerInfo) this.l0).getServiceInfo());
            castLogger.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ));
            if (((PlayerInfo) this.l0).getServiceInfo() != null) {
                ((C90506Zfa) this.l1).LJJIIJ.put("connectId", ((PlayerInfo) this.l0).getServiceInfo().connectID);
                ((C90506Zfa) this.l1).LJJIIJ.put("mediaAssetBean", GsonUtils.toJsonIgnoreException(((PlayerInfo) this.l0).getMetaDataBean()));
                ((C90506Zfa) this.l1).LJJIIJZLJL = ((PlayerInfo) this.l0).getServiceInfo().connectID;
            }
            if (((PlayerInfo) this.l0).getDramaList() == null || ((PlayerInfo) this.l0).getDramaList().length == 0) {
                ((C90506Zfa) this.l1).LJFF(((PlayerInfo) this.l0).getStartPosition(), ((PlayerInfo) this.l0).getMetaDataBean(), ((PlayerInfo) this.l0).getUrl(), ((PlayerInfo) this.l0).getType());
                double speed = ((PlayerInfo) this.l0).getSpeed();
                QH7.LJ("Must be called from the main thread.");
                if (!LJ.LJJIII()) {
                    abstractC90875ZlX = C90639Zhj.LJIJJLI();
                } else {
                    AbstractC90875ZlX c90932ZmS = new C90932ZmS(LJ, speed);
                    C90639Zhj.LJJIIJ(c90932ZmS);
                    abstractC90875ZlX = c90932ZmS;
                }
            } else {
                MediaQueueItem[] LIZIZ = ((C90506Zfa) this.l1).LIZIZ(((PlayerInfo) this.l0).getDramaList(), ((PlayerInfo) this.l0).getType(), -1);
                int max = Math.max(((C90506Zfa) this.l1).LIZLLL(((PlayerInfo) this.l0).getStartDramaId()), 0);
                JSONObject jSONObject = ((C90506Zfa) this.l1).LJJIIJ;
                QH7.LJ("Must be called from the main thread.");
                if (!LJ.LJJIII()) {
                    abstractC90875ZlX2 = C90639Zhj.LJIJJLI();
                } else {
                    AbstractC90875ZlX c90918ZmE = new C90918ZmE(LJ, LIZIZ, max, jSONObject);
                    C90639Zhj.LJJIIJ(c90918ZmE);
                    abstractC90875ZlX2 = c90918ZmE;
                }
                SourceMonitorUtils sourceMonitor = ((C90506Zfa) this.l1).LJIL.getSourceMonitor();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ChromeCast play Drama set list:");
                LIZ2.append(Arrays.toString(((PlayerInfo) this.l0).getDramaList()));
                sourceMonitor.trackByteCastStartDramaProtocol("ChromeCast", "set_url", X1D.LIZIZ(LIZ2));
                SourceMonitorUtils sourceMonitorUtils = ((C90506Zfa) this.l1).LJJ.getSourceMonitorUtils();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ChromeCast play Drama set list:");
                LIZ3.append(Arrays.toString(((PlayerInfo) this.l0).getDramaList()));
                sourceMonitorUtils.trackByteCastStartDramaProtocol("ChromeCast", "set_url", X1D.LIZIZ(LIZ3));
                abstractC90875ZlX = abstractC90875ZlX2;
            }
            abstractC90875ZlX.LIZIZ(new InterfaceC67740QiG() { // from class: X.Zkx
                @Override // X.InterfaceC67740QiG
                public final void LIZ(InterfaceC67754QiU interfaceC67754QiU) {
                    InterfaceC90638Zhi interfaceC90638Zhi = (InterfaceC90638Zhi) interfaceC67754QiU;
                    CastLogger castLogger2 = ((C90506Zfa) IDRunnableS30S0200000_24.this.l1).LJIJJLI;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("mediaChannelResult: ");
                    LIZ4.append(interfaceC90638Zhi.getStatus().LJJJJL());
                    LIZ4.append(", ");
                    Status status = interfaceC90638Zhi.getStatus();
                    status.getClass();
                    LIZ4.append(status);
                    LIZ4.append(", ");
                    LIZ4.append(interfaceC90638Zhi.LJJJJI());
                    castLogger2.d("ChromeCastSourceImpl", X1D.LIZIZ(LIZ4));
                }
            });
        } catch (Exception e) {
            ((C90506Zfa) this.l1).LJIJJLI.e("ChromeCastSourceImpl", e.getMessage());
            ((C90506Zfa) this.l1).LJIIZILJ = false;
        }
    }

    public static final void run$0(IDRunnableS30S0200000_24 iDRunnableS30S0200000_24) {
        boolean LIZ;
        try {
            iDRunnableS30S0200000_24.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS30S0200000_24 iDRunnableS30S0200000_24) {
        boolean LIZ;
        try {
            iDRunnableS30S0200000_24.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS30S0200000_24 iDRunnableS30S0200000_24) {
        boolean LIZ;
        try {
            iDRunnableS30S0200000_24.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS30S0200000_24 iDRunnableS30S0200000_24) {
        boolean LIZ;
        try {
            iDRunnableS30S0200000_24.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS30S0200000_24 iDRunnableS30S0200000_24) {
        C90801ZkL c90801ZkL = (C90801ZkL) iDRunnableS30S0200000_24.l0;
        Boolean[] boolArr = (Boolean[]) iDRunnableS30S0200000_24.l1;
        c90801ZkL.getClass();
        if (!boolArr[0].booleanValue() && c90801ZkL.LJJL != null) {
            c90801ZkL.LIZLLL.trackSourceGetDeviceInfoEvent("failure", new C90431ZeN());
            Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(c90801ZkL, 17));
        }
    }

    public static final void run$5(IDRunnableS30S0200000_24 iDRunnableS30S0200000_24) {
        boolean LIZ;
        try {
            iDRunnableS30S0200000_24.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS30S0200000_24 iDRunnableS30S0200000_24) {
        boolean LIZ;
        try {
            iDRunnableS30S0200000_24.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(IDRunnableS30S0200000_24 iDRunnableS30S0200000_24) {
        boolean LIZ;
        try {
            iDRunnableS30S0200000_24.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS30S0200000_24(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
