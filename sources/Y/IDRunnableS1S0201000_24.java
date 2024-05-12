package Y;

import X.C90416Ze8;
import X.C90494ZfO;
import X.C90495ZfP;
import X.C90777Zjx;
import X.C90778Zjy;
import X.RunnableC90417Ze9;
import X.X1D;
import X.ZY4;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.discovery.NsdService;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.utils.DLNAOptionUtils;
import com.ss.chromecast.source.impl.ChromeCastSourceWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes29.dex */
public class IDRunnableS1S0201000_24 implements Runnable {
    public final int $t;
    public int i2;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((DeviceInfo) this.l0) != null) {
            RunnableC90417Ze9 runnableC90417Ze9 = (RunnableC90417Ze9) this.l1;
            ServiceInfo serviceInfo = runnableC90417Ze9.LJLIL;
            serviceInfo.port = this.i2;
            String str = serviceInfo.name;
            CastLogger castLogger = runnableC90417Ze9.LJLJI.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkService name: ");
            LIZ.append(str);
            castLogger.i("BDLinkServiceDiskCacheHelper", X1D.LIZIZ(LIZ));
            ((RunnableC90417Ze9) this.l1).LJLIL.data = ((DeviceInfo) this.l0).data;
            if (str.contains("BDLink")) {
                str = ((DeviceInfo) this.l0).name;
            }
            ServiceInfo serviceInfo2 = ((RunnableC90417Ze9) this.l1).LJLIL;
            serviceInfo2.name = str;
            serviceInfo2.deviceParams.put("source_bdlink_has_device_info", "true");
            RunnableC90417Ze9 runnableC90417Ze92 = (RunnableC90417Ze9) this.l1;
            C90416Ze8 c90416Ze8 = runnableC90417Ze92.LJLJI;
            C90494ZfO c90494ZfO = c90416Ze8.LJI;
            if (c90494ZfO != null) {
                ServiceInfo serviceInfo3 = runnableC90417Ze92.LJLIL;
                C90495ZfP c90495ZfP = c90494ZfO.LIZ;
                C90777Zjx c90777Zjx = c90495ZfP.LIZIZ;
                if (!DLNAOptionUtils.isEnableMdnsSearch(c90777Zjx.LIZIZ)) {
                    c90777Zjx.LIZJ.d("NsdClient", "onDiskCacheFoundService, isEnableMdnsSearch is false");
                } else {
                    serviceInfo3.portMirror = 0;
                    if (!c90777Zjx.LIZJ(serviceInfo3)) {
                        NsdService nsdService = new NsdService(serviceInfo3.name, c90777Zjx.LJIIIZ, serviceInfo3.ip, "", serviceInfo3.port, null);
                        ((ConcurrentHashMap) c90777Zjx.LJIILIIL).put(nsdService.getName(), nsdService);
                        ((ConcurrentHashMap) c90777Zjx.LJIILJJIL).put(serviceInfo3.name, serviceInfo3);
                        c90777Zjx.LIZLLL("diskCache");
                    }
                }
                c90495ZfP.LIZJ.getClass();
                ICastSource iCastSource = c90495ZfP.LIZLLL.LIZJ;
                if (iCastSource != null) {
                    iCastSource.onDiskCacheFoundService(serviceInfo3);
                    return;
                }
                return;
            }
            c90416Ze8.LIZJ.i("BDLinkServiceDiskCacheHelper", "checkService iDiskCacheListener is null ");
        }
    }

    public final void LIZ$1() {
        ArrayList arrayList = new ArrayList();
        for (ZY4 zy4 : (List) this.l0) {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.castId = zy4.LIZJ;
            serviceInfo.name = zy4.LIZLLL;
            serviceInfo.port = -1;
            serviceInfo.portMirror = -1;
            serviceInfo.protocols = "ChromeCast";
            serviceInfo.types = "ChromeCast";
            arrayList.add(serviceInfo);
        }
        CastLogger castLogger = ((C90778Zjy) this.l1).LIZIZ.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBrowse, code: ");
        LIZ.append(this.i2);
        LIZ.append("serviceInfos: ");
        LIZ.append(arrayList);
        castLogger.d("ChromeCastSourceWrapper", X1D.LIZIZ(LIZ));
        ((C90778Zjy) this.l1).LIZ.onBrowse(this.i2, arrayList);
        ChromeCastSourceWrapper chromeCastSourceWrapper = ((C90778Zjy) this.l1).LIZIZ;
        if (chromeCastSourceWrapper.LIZJ && this.i2 == 1) {
            chromeCastSourceWrapper.LIZJ = false;
        }
    }

    public static final void run$0(IDRunnableS1S0201000_24 iDRunnableS1S0201000_24) {
        boolean LIZ;
        try {
            iDRunnableS1S0201000_24.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS1S0201000_24 iDRunnableS1S0201000_24) {
        boolean LIZ;
        try {
            iDRunnableS1S0201000_24.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS1S0201000_24(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l0 = obj2;
        this.i2 = i;
    }
}
