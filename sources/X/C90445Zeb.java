package X;

import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.ServiceInfoOrigin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Zeb, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90445Zeb {
    public final CastMonitor LIZ;
    public final CastLogger LIZIZ;
    public final List<C90444Zea> LIZJ;
    public final List<C90815ZkZ> LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public ServiceInfo LJI;

    public C90445Zeb() {
        throw null;
    }

    public final List<ServiceInfo> LIZLLL() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) this.LIZJ).iterator();
        while (true) {
            int i = 0;
            int i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            C90444Zea c90444Zea = (C90444Zea) it.next();
            CastLogger castLogger = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("wrapper : ");
            LIZ.append(c90444Zea);
            castLogger.d("ServiceInfoManager", X1D.LIZIZ(LIZ));
            if ("ChromeCast".equals(c90444Zea.LIZJ)) {
                CastLogger castLogger2 = this.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("serviceInfo : ");
                LIZ2.append(c90444Zea.LJ);
                castLogger2.d("ServiceInfoManager", X1D.LIZIZ(LIZ2));
                arrayList.add(c90444Zea.LJ);
            } else {
                Iterator it2 = arrayList.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    ServiceInfo serviceInfo = (ServiceInfo) it2.next();
                    if ((TextUtils.equals(c90444Zea.LIZ, serviceInfo.ip) && TextUtils.equals(c90444Zea.LIZIZ, serviceInfo.name)) || (TextUtils.equals(c90444Zea.LIZ, serviceInfo.ip) && c90444Zea.LIZLLL == serviceInfo.port)) {
                        String str = serviceInfo.protocols;
                        String str2 = c90444Zea.LIZJ;
                        if (!TextUtils.isEmpty(str) && !str.contains(str2)) {
                            String[] split = str.split(",");
                            if (split.length >= i2) {
                                Iterator<String> it3 = this.LJ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    String next = it3.next();
                                    if (TextUtils.equals(next, split[i])) {
                                        break;
                                    }
                                    if (TextUtils.equals(next, str2)) {
                                        CastLogger castLogger3 = this.LIZIZ;
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("handle data set higher priority protocol port:");
                                        LIZ3.append(c90444Zea.LIZLLL);
                                        LIZ3.append(",service info port:");
                                        LIZ3.append(serviceInfo.port);
                                        castLogger3.d("ServiceInfoManager", X1D.LIZIZ(LIZ3));
                                        serviceInfo.port = c90444Zea.LIZLLL;
                                        break;
                                    }
                                }
                            }
                        }
                        if (TextUtils.isEmpty(serviceInfo.protocols) || !serviceInfo.protocols.contains(c90444Zea.LIZJ)) {
                            String str3 = serviceInfo.protocols;
                            String str4 = c90444Zea.LIZJ;
                            if (TextUtils.isEmpty(str3)) {
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append(str4);
                                LIZ4.append(",");
                                str3 = X1D.LIZIZ(LIZ4);
                            } else if (!str3.contains(str4)) {
                                if (!this.LJ.contains(str4) && !str3.contains(str4)) {
                                    if (str3.endsWith(",")) {
                                        StringBuilder LIZ5 = X1D.LIZ();
                                        LIZ5.append(str3);
                                        LIZ5.append(str4);
                                        LIZ5.append(",");
                                        str3 = X1D.LIZIZ(LIZ5);
                                    } else {
                                        StringBuilder LIZ6 = X1D.LIZ();
                                        LIZ6.append(str3);
                                        LIZ6.append(",");
                                        LIZ6.append(str4);
                                        LIZ6.append(",");
                                        str3 = X1D.LIZIZ(LIZ6);
                                    }
                                } else {
                                    String[] split2 = str3.split(",");
                                    int length = split2.length + 1;
                                    String[] strArr = new String[length];
                                    while (i < split2.length) {
                                        int i3 = i + 1;
                                        strArr[i3] = split2[i];
                                        i = i3;
                                    }
                                    int i4 = 1;
                                    while (i4 < length) {
                                        if (this.LJ.contains(strArr[i4]) && this.LJ.indexOf(strArr[i4]) < this.LJ.indexOf(str4)) {
                                            strArr[i4 - 1] = strArr[i4];
                                            i4++;
                                        } else {
                                            strArr[i4 - 1] = str4;
                                            break;
                                        }
                                    }
                                    strArr[i4 - 1] = str4;
                                    str3 = "";
                                    for (int i5 = 0; i5 < length; i5++) {
                                        String str5 = strArr[i5];
                                        StringBuilder LIZ7 = X1D.LIZ();
                                        LIZ7.append(str3);
                                        LIZ7.append(str5);
                                        LIZ7.append(",");
                                        str3 = X1D.LIZIZ(LIZ7);
                                    }
                                    CastLogger castLogger4 = this.LIZIZ;
                                    StringBuilder LIZ8 = X1D.LIZ();
                                    LIZ8.append("get sorted protocols:");
                                    LIZ8.append(str3);
                                    castLogger4.d("ServiceInfoManager", X1D.LIZIZ(LIZ8));
                                }
                            }
                            serviceInfo.protocols = str3;
                            CastLogger castLogger5 = this.LIZIZ;
                            StringBuilder LIZ9 = X1D.LIZ();
                            LIZ9.append(" serviceInfo.protocols  : ");
                            LIZ9.append(serviceInfo.protocols);
                            castLogger5.d("ServiceInfoManager", X1D.LIZIZ(LIZ9));
                        }
                        if (TextUtils.equals(c90444Zea.LIZJ, "LeLink")) {
                            ServiceInfo serviceInfo2 = c90444Zea.LJ;
                            serviceInfo.types = serviceInfo2.types;
                            serviceInfo.browseLeLinkExtras = serviceInfo2.browseLeLinkExtras;
                        } else if (TextUtils.equals(c90444Zea.LIZJ, "BDLink")) {
                            ServiceInfo serviceInfo3 = c90444Zea.LJ;
                            serviceInfo.data = serviceInfo3.data;
                            serviceInfo.width = serviceInfo3.width;
                            serviceInfo.height = serviceInfo3.height;
                            serviceInfo.deviceID = serviceInfo3.deviceID;
                            serviceInfo.setSupportPing(serviceInfo3.isSupportPing());
                            serviceInfo.setSupportDetect(c90444Zea.LJ.isSupportDetect());
                            CastLogger castLogger6 = this.LIZIZ;
                            StringBuilder LIZ10 = X1D.LIZ();
                            LIZ10.append("serviceInfo.protocols:");
                            LIZ10.append(serviceInfo.protocols);
                            castLogger6.i("ServiceInfoManager", X1D.LIZIZ(LIZ10));
                        } else if (TextUtils.equals(c90444Zea.LIZJ, "ByteLink")) {
                            ServiceInfo serviceInfo4 = c90444Zea.LJ;
                            serviceInfo.data = serviceInfo4.data;
                            serviceInfo.portMirror = serviceInfo4.portMirror;
                            serviceInfo.width = serviceInfo4.width;
                            serviceInfo.height = serviceInfo4.height;
                            serviceInfo.fps = serviceInfo4.fps;
                            serviceInfo.features = serviceInfo4.features;
                            serviceInfo.deviceID = serviceInfo4.deviceID;
                            serviceInfo.firewall = serviceInfo4.firewall;
                        } else if (TextUtils.equals(c90444Zea.LIZJ, "BDDLNA")) {
                            ServiceInfo serviceInfo5 = c90444Zea.LJ;
                            serviceInfo.manufacture = serviceInfo5.manufacture;
                            serviceInfo.serviceIdentifierUDN = serviceInfo5.serviceIdentifierUDN;
                            serviceInfo.data = serviceInfo5.data;
                        }
                        serviceInfo.deviceParams.putAll(c90444Zea.LJ.deviceParams);
                        z = true;
                    }
                    i = 0;
                    i2 = 1;
                }
                if (!z && c90444Zea.LJ != null) {
                    CastLogger castLogger7 = this.LIZIZ;
                    StringBuilder LIZ11 = X1D.LIZ();
                    LIZ11.append("serviceInfo : ");
                    LIZ11.append(c90444Zea.LJ);
                    castLogger7.d("ServiceInfoManager", X1D.LIZIZ(LIZ11));
                    arrayList.add(c90444Zea.LJ.deepCopy());
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ServiceInfo serviceInfo6 = (ServiceInfo) it4.next();
            CastLogger castLogger8 = this.LIZIZ;
            StringBuilder LIZ12 = X1D.LIZ();
            LIZ12.append("service : ");
            LIZ12.append(serviceInfo6);
            castLogger8.d("ServiceInfoManager", X1D.LIZIZ(LIZ12));
            String[] split3 = serviceInfo6.protocols.split(",");
            for (int i6 = 0; i6 < split3.length; i6++) {
                if (!this.LJ.contains(split3[i6]) && !this.LJFF.contains(split3[i6])) {
                    split3[i6] = "";
                }
            }
            serviceInfo6.protocols = "";
            for (int i7 = 0; i7 < split3.length; i7++) {
                if (!TextUtils.isEmpty(split3[i7])) {
                    StringBuilder LIZ13 = X1D.LIZ();
                    LIZ13.append(serviceInfo6.protocols);
                    LIZ13.append(split3[i7]);
                    LIZ13.append(",");
                    serviceInfo6.protocols = X1D.LIZIZ(LIZ13);
                }
            }
        }
        List<C90815ZkZ> list = this.LIZLLL;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it5 = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
            while (it5.hasNext()) {
                C90444Zea c90444Zea2 = (C90444Zea) it5.next();
                Iterator it6 = arrayList.iterator();
                boolean z2 = false;
                while (it6.hasNext()) {
                    ServiceInfo serviceInfo7 = (ServiceInfo) it6.next();
                    if (TextUtils.equals(serviceInfo7.name, c90444Zea2.LIZIZ)) {
                        StringBuilder LIZ14 = X1D.LIZ();
                        LIZ14.append(serviceInfo7.protocols);
                        LIZ14.append("WIFIP2P,");
                        serviceInfo7.protocols = X1D.LIZIZ(LIZ14);
                        z2 = true;
                    }
                }
                if (!z2) {
                    arrayList.add(c90444Zea2.LJ);
                }
            }
        }
        return arrayList;
    }

    public final C90444Zea LIZJ(ServiceInfo serviceInfo) {
        synchronized (this) {
            if (serviceInfo == null) {
                this.LIZIZ.w("ServiceInfoManager", "serviceInfo is null");
                return null;
            }
            List<String> list = this.LJ;
            if (list == null || list.size() == 0) {
                CastMonitor castMonitor = this.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("play we cannot find device, linkProtocols : ");
                LIZ.append(this.LJ);
                LIZ.append(",serviceInfo:");
                LIZ.append(serviceInfo);
                castMonitor.sendSourceEvent("ByteCast_Play_Failure_Info", X1D.LIZIZ(LIZ), serviceInfo.connectID);
                return null;
            }
            if (this.LJI != null) {
                C90444Zea c90444Zea = new C90444Zea();
                ServiceInfo serviceInfo2 = this.LJI;
                c90444Zea.LJ = serviceInfo2;
                String str = serviceInfo2.protocols;
                if (str == null) {
                    return c90444Zea;
                }
                if (str.contains("BDLink")) {
                    c90444Zea.LIZJ = "BDLink";
                } else if (this.LJI.protocols.contains("BDCloud")) {
                    c90444Zea.LIZJ = "BDCloud";
                    c90444Zea.LJ.isSupportPlayList = serviceInfo.isSupportPlayList;
                } else if (this.LJI.protocols.contains("ChromeCast")) {
                    c90444Zea.LIZJ = "ChromeCast";
                }
                return c90444Zea;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                C90444Zea c90444Zea2 = (C90444Zea) it.next();
                if (TextUtils.equals(c90444Zea2.LIZ, serviceInfo.ip) && TextUtils.equals(c90444Zea2.LIZIZ, serviceInfo.name)) {
                    arrayList.add(c90444Zea2);
                }
            }
            for (String str2 : this.LJ) {
                if (!TextUtils.isEmpty(serviceInfo.protocols) && serviceInfo.protocols.contains(str2)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C90444Zea c90444Zea3 = (C90444Zea) it2.next();
                        if (TextUtils.equals(c90444Zea3.LIZJ, str2)) {
                            return c90444Zea3;
                        }
                    }
                }
            }
            CastMonitor castMonitor2 = this.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("play we cannot find device, linkProtocols : ");
            LIZ2.append(this.LJ);
            LIZ2.append(", alllist : ");
            LIZ2.append(this.LIZJ);
            LIZ2.append(",serviceInfo:");
            LIZ2.append(serviceInfo);
            castMonitor2.sendSourceEvent("ByteCast_Play_Failure_Info", X1D.LIZIZ(LIZ2), serviceInfo.connectID);
            return null;
        }
    }

    public final void LIZIZ(int i, String str) {
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clearData, code: ");
        LIZ.append(i);
        LIZ.append(", type: ");
        LIZ.append(str);
        castLogger.d("ServiceInfoManager", X1D.LIZIZ(LIZ));
        if (TextUtils.equals(str, "BDLink") || TextUtils.equals(str, "ByteLink")) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                C90444Zea c90444Zea = (C90444Zea) it.next();
                if (TextUtils.equals(c90444Zea.LIZJ, str)) {
                    ServiceInfoOrigin originFrom = c90444Zea.LJ.getOriginFrom();
                    originFrom.clearOriginBit(i, str);
                    if (originFrom.isEmpty()) {
                        arrayList.add(c90444Zea);
                    }
                }
            }
            ((CopyOnWriteArrayList) this.LIZJ).removeAll(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ((CopyOnWriteArrayList) this.LIZJ).iterator();
            while (it2.hasNext()) {
                C90444Zea c90444Zea2 = (C90444Zea) it2.next();
                if (TextUtils.equals(c90444Zea2.LIZJ, str)) {
                    arrayList2.add(c90444Zea2);
                }
            }
            ((CopyOnWriteArrayList) this.LIZJ).removeAll(arrayList2);
        }
        if (TextUtils.equals("WIFIP2P", str) && i != 5 && i != 7 && i != 8) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next());
            }
            ((CopyOnWriteArrayList) this.LIZLLL).removeAll(arrayList3);
        }
    }

    public C90445Zeb(ContextManager.CastContext castContext, List<String> list, List<String> list2) {
        this.LIZJ = new CopyOnWriteArrayList();
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LJ = list;
        this.LJFF = list2;
        this.LIZ = ContextManager.getMonitor(castContext);
        this.LIZIZ = ContextManager.getLogger(castContext);
    }

    public final void LIZ(int i, String str, List<ServiceInfo> list) {
        CastLogger castLogger = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addData, link :");
        LIZ.append(this.LJ);
        LIZ.append(", mirror:");
        LIZ.append(this.LJFF);
        castLogger.i("ServiceInfoManager", X1D.LIZIZ(LIZ));
        for (ServiceInfo serviceInfo : list) {
            CastLogger castLogger2 = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("addData, code: ");
            LIZ2.append(i);
            LIZ2.append(", type: ");
            LIZ2.append(str);
            LIZ2.append(", serviceInfo: ");
            LIZ2.append(serviceInfo);
            castLogger2.d("ServiceInfoManager", X1D.LIZIZ(LIZ2));
            if ((TextUtils.isEmpty(serviceInfo.protocols) || !serviceInfo.protocols.contains(str)) && ((TextUtils.equals(str, "BDLink") && this.LJ.contains("BDLink")) || !TextUtils.equals(str, "BDLink"))) {
                if (this.LJ.contains(str) && serviceInfo.deviceParams.containsKey("com.ss.cast:sink-bdlink")) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(serviceInfo.protocols);
                    LIZ3.append(str);
                    LIZ3.append(",");
                    serviceInfo.protocols = X1D.LIZIZ(LIZ3);
                    CastLogger castLogger3 = this.LIZIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("addData, type:");
                    LIZ4.append(str);
                    LIZ4.append(", protocols:");
                    LIZ4.append(serviceInfo.protocols);
                    castLogger3.i("ServiceInfoManager", X1D.LIZIZ(LIZ4));
                } else if (this.LJ.contains(str) && !TextUtils.equals("BDLink", str)) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(serviceInfo.protocols);
                    LIZ5.append(str);
                    LIZ5.append(",");
                    serviceInfo.protocols = X1D.LIZIZ(LIZ5);
                    CastLogger castLogger4 = this.LIZIZ;
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("addData, type:");
                    LIZ6.append(str);
                    LIZ6.append(", protocols:");
                    LIZ6.append(serviceInfo.protocols);
                    castLogger4.i("ServiceInfoManager", X1D.LIZIZ(LIZ6));
                }
            }
            String str2 = serviceInfo.ip;
            int i2 = serviceInfo.port;
            String str3 = serviceInfo.name;
            if (!"ChromeCast".equals(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    Iterator it = ((CopyOnWriteArrayList) this.LIZJ).iterator();
                    while (it.hasNext()) {
                        C90444Zea c90444Zea = (C90444Zea) it.next();
                        if (!TextUtils.isEmpty(c90444Zea.LIZIZ) && !TextUtils.isEmpty(c90444Zea.LIZJ) && str2.equals(c90444Zea.LIZ) && c90444Zea.LIZLLL == i2 && c90444Zea.LIZIZ.equals(str3) && c90444Zea.LIZJ.equals(str)) {
                            c90444Zea.LJ.getOriginFrom().setOriginBit(i, str);
                            break;
                        }
                    }
                }
            }
            serviceInfo.getOriginFrom().setOriginBit(i, str);
            C90444Zea c90444Zea2 = new C90444Zea();
            c90444Zea2.LIZ = serviceInfo.ip;
            c90444Zea2.LIZIZ = serviceInfo.name;
            c90444Zea2.LIZJ = str;
            c90444Zea2.LJ = serviceInfo;
            c90444Zea2.LIZLLL = serviceInfo.port;
            ((CopyOnWriteArrayList) this.LIZJ).add(c90444Zea2);
        }
    }

    public final List<ServiceInfo> LJ(int i, String str, List<ServiceInfo> list) {
        List<ServiceInfo> arrayList = new ArrayList<>();
        if (i != 2) {
            synchronized (C90445Zeb.class) {
                LIZIZ(i, str);
                LIZ(i, str, list);
                arrayList = LIZLLL();
            }
        }
        return arrayList;
    }
}
