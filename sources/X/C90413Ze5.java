package X;

import Y.IDRunnableS30S0200000_24;
import android.os.Handler;
import android.os.Message;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.utils.DLNAOptionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ze5, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90413Ze5 implements Handler.Callback {
    public final /* synthetic */ C90414Ze6 LJLIL;

    public C90413Ze5(C90414Ze6 c90414Ze6) {
        this.LJLIL = c90414Ze6;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C90493ZfN c90493ZfN;
        List<ServiceInfo> arrayList;
        if (message.what == 1) {
            C90414Ze6 c90414Ze6 = this.LJLIL;
            if (c90414Ze6.LIZ == null || (c90493ZfN = c90414Ze6.LJFF) == null) {
                c90414Ze6.LIZLLL.w("BDLinkServiceDetector", "handleDetectMessage bdlinkSource is null or iGetDeviceListListener is null");
            } else {
                EnumC90443ZeZ enumC90443ZeZ = EnumC90443ZeZ.MDNS;
                C90495ZfP c90495ZfP = c90493ZfN.LIZ;
                c90495ZfP.getClass();
                List<ServiceInfo> list = null;
                if (enumC90443ZeZ.equals(enumC90443ZeZ)) {
                    C90777Zjx c90777Zjx = c90495ZfP.LIZIZ;
                    c90777Zjx.getClass();
                    arrayList = new ArrayList<>((Collection<? extends ServiceInfo>) ((ConcurrentHashMap) c90777Zjx.LJIILJJIL).values());
                } else if (EnumC90443ZeZ.SSDP.equals(enumC90443ZeZ)) {
                    ICastSource iCastSource = c90495ZfP.LIZLLL.LIZJ;
                    if (iCastSource != null) {
                        arrayList = iCastSource.getSsdpServiceInfoList();
                    }
                    arrayList = null;
                } else {
                    if (EnumC90443ZeZ.BLE.equals(enumC90443ZeZ)) {
                        c90495ZfP.LIZJ.getClass();
                        arrayList = new ArrayList<>();
                    }
                    arrayList = null;
                }
                C90493ZfN c90493ZfN2 = c90414Ze6.LJFF;
                EnumC90443ZeZ enumC90443ZeZ2 = EnumC90443ZeZ.SSDP;
                C90495ZfP c90495ZfP2 = c90493ZfN2.LIZ;
                c90495ZfP2.getClass();
                if (enumC90443ZeZ.equals(enumC90443ZeZ2)) {
                    C90777Zjx c90777Zjx2 = c90495ZfP2.LIZIZ;
                    c90777Zjx2.getClass();
                    list = new ArrayList<>((Collection<? extends ServiceInfo>) ((ConcurrentHashMap) c90777Zjx2.LJIILJJIL).values());
                } else if (enumC90443ZeZ2.equals(enumC90443ZeZ2)) {
                    ICastSource iCastSource2 = c90495ZfP2.LIZLLL.LIZJ;
                    if (iCastSource2 != null) {
                        list = iCastSource2.getSsdpServiceInfoList();
                    }
                } else if (EnumC90443ZeZ.BLE.equals(enumC90443ZeZ2)) {
                    c90495ZfP2.LIZJ.getClass();
                    list = new ArrayList<>();
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator<ServiceInfo> it = arrayList.iterator();
                    while (it.hasNext()) {
                        Dispatcher.getInstance().enqueue(new IDRunnableS30S0200000_24(c90414Ze6, it.next(), 0));
                    }
                }
                if (list != null && !list.isEmpty()) {
                    for (ServiceInfo serviceInfo : list) {
                        if (serviceInfo == null || arrayList == null || arrayList.isEmpty()) {
                            c90414Ze6.LIZLLL.d("BDLinkServiceDetector", " hasServiceInfo return !");
                        } else {
                            for (ServiceInfo serviceInfo2 : arrayList) {
                                if (!serviceInfo2.ip.equals(serviceInfo.ip) || serviceInfo2.port != serviceInfo.port) {
                                }
                            }
                        }
                        Dispatcher.getInstance().enqueue(new IDRunnableS30S0200000_24(c90414Ze6, serviceInfo, 0));
                    }
                }
            }
            if (this.LJLIL.LJI) {
                C90414Ze6 c90414Ze62 = this.LJLIL;
                long bdlinkDeviceOfflineDetectInterval = DLNAOptionUtils.getBdlinkDeviceOfflineDetectInterval(c90414Ze62.LIZJ);
                c90414Ze62.LIZIZ.removeMessages(1);
                c90414Ze62.LIZIZ.sendEmptyMessageDelayed(1, bdlinkDeviceOfflineDetectInterval);
            }
        }
        return true;
    }
}
