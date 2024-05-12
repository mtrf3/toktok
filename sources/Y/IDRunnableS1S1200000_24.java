package Y;

import X.C63832P3k;
import X.C90466Zew;
import X.C90780Zk0;
import X.X1D;
import X.ZWQ;
import com.byted.cast.common.Logger;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.ble.BleData;
import com.byted.cast.common.discovery.INsdHelper;
import com.byted.cast.common.discovery.NsdFactory;
import com.byted.cast.common.discovery.NsdUtils;
import com.byted.cast.common.sink.ServiceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes29.dex */
public class IDRunnableS1S1200000_24 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return;
        }
    }

    public static final void run$0(IDRunnableS1S1200000_24 iDRunnableS1S1200000_24) {
        ServiceInfo serviceInfo;
        int i;
        ZWQ zwq = (ZWQ) iDRunnableS1S1200000_24.l1;
        String str = iDRunnableS1S1200000_24.s0;
        List list = (List) iDRunnableS1S1200000_24.l2;
        zwq.LIZLLL = str;
        ((ArrayList) zwq.LJI).clear();
        ((ArrayList) zwq.LJI).addAll(list);
        ICastSink iCastSink = zwq.LJIIIZ;
        ServiceInfo serviceInfo2 = null;
        if (iCastSink != null) {
            serviceInfo = iCastSink.getServiceInfo();
        } else {
            serviceInfo = null;
        }
        HashMap hashMap = new HashMap();
        ICastSink iCastSink2 = zwq.LJIIIZ;
        if (iCastSink2 != null) {
            serviceInfo2 = iCastSink2.getServiceInfo();
        }
        ServiceInfo serviceInfo3 = new ServiceInfo();
        if (serviceInfo2 != null && ((ArrayList) zwq.LJI).contains("BDLink")) {
            serviceInfo3.ip = serviceInfo2.ip;
            serviceInfo3.port = serviceInfo2.port;
            serviceInfo3.data = serviceInfo2.data;
            serviceInfo3.bdlinkVersion = serviceInfo2.bdlinkVersion;
        }
        if (zwq.LJIIJ != null && ((ArrayList) zwq.LJI).contains("ByteLink")) {
            ServiceInfo serviceInfo4 = zwq.LJIIJ.getServiceInfo();
            String str2 = serviceInfo4.name;
            if (str2 == null) {
                str2 = zwq.LIZLLL;
            }
            serviceInfo3.name = str2;
            serviceInfo3.portMirror = serviceInfo4.portMirror;
            serviceInfo3.width = serviceInfo4.width;
            serviceInfo3.height = serviceInfo4.height;
            serviceInfo3.fps = serviceInfo4.fps;
            serviceInfo3.features = serviceInfo4.features;
            serviceInfo3.deviceID = serviceInfo4.deviceID;
            serviceInfo3.bytelinkVersion = serviceInfo4.bytelinkVersion;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startServer, bytelinkServiceInfo:");
            LIZ.append(serviceInfo4);
            LIZ.append(", combinedServiceInfo:");
            LIZ.append(serviceInfo3);
            Logger.i("NsdServer", X1D.LIZIZ(LIZ));
        } else {
            serviceInfo3.name = zwq.LIZLLL;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startServer, bdlinkServiceInfo:");
        LIZ2.append(serviceInfo2);
        LIZ2.append(", combinedServiceInfo:");
        LIZ2.append(serviceInfo3);
        Logger.i("NsdServer", X1D.LIZIZ(LIZ2));
        hashMap.put(C63832P3k.LIZ, serviceInfo3.ip);
        hashMap.put("port", Integer.toString(serviceInfo3.port));
        hashMap.put("data", serviceInfo3.data);
        hashMap.put("name", serviceInfo3.name);
        hashMap.put("portMirror", Integer.toString(serviceInfo3.portMirror));
        hashMap.put("width", Integer.toString(serviceInfo3.width));
        hashMap.put("height", Integer.toString(serviceInfo3.height));
        hashMap.put("fps", Integer.toString(serviceInfo3.fps));
        hashMap.put("features", Integer.toString(serviceInfo3.features));
        hashMap.put("deviceID", serviceInfo3.deviceID);
        hashMap.put("bytelinkver", serviceInfo3.bytelinkVersion);
        hashMap.put("bdlinkver", serviceInfo3.bdlinkVersion);
        hashMap.put("protver", "2");
        boolean isDnssdEnabledFromGrayConfig = NsdUtils.isDnssdEnabledFromGrayConfig();
        boolean isDnssdEnabledFromLocalConfig = NsdUtils.isDnssdEnabledFromLocalConfig();
        NsdFactory.Type nsdType = NsdUtils.getNsdType();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("startServer, enableDnssd:");
        LIZ3.append(isDnssdEnabledFromGrayConfig);
        LIZ3.append(", forceDnssd: ");
        LIZ3.append(isDnssdEnabledFromLocalConfig);
        LIZ3.append(", type:");
        LIZ3.append(nsdType);
        Logger.i("NsdServer", X1D.LIZIZ(LIZ3));
        INsdHelper createNsdHelper = NsdFactory.createNsdHelper(nsdType, zwq.LIZIZ, zwq.LJIIL, "NsdServer", zwq.LJIIIIZZ);
        zwq.LIZ = createNsdHelper;
        if (createNsdHelper != null) {
            createNsdHelper.setLogEnabled(zwq.LJ);
            INsdHelper iNsdHelper = zwq.LIZ;
            String str3 = zwq.LIZJ;
            if (serviceInfo != null) {
                i = serviceInfo.port;
            } else {
                i = 3530;
            }
            zwq.LJII = iNsdHelper.registerService(str, str3, i, hashMap, zwq.LJIIL);
        }
    }

    public static final void run$1(IDRunnableS1S1200000_24 iDRunnableS1S1200000_24) {
        boolean LIZ;
        try {
            ((C90780Zk0) iDRunnableS1S1200000_24.l2).LIZ.onDramaId((com.byted.cast.common.source.ServiceInfo) iDRunnableS1S1200000_24.l1, iDRunnableS1S1200000_24.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS1S1200000_24 iDRunnableS1S1200000_24) {
        C90466Zew c90466Zew = (C90466Zew) iDRunnableS1S1200000_24.l1;
        c90466Zew.LIZ.LIZIZ(iDRunnableS1S1200000_24.s0, (BleData) iDRunnableS1S1200000_24.l2);
    }

    public IDRunnableS1S1200000_24(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
