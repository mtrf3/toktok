package Y;

import X.C46418IJq;
import X.C64401PPh;
import X.C64403PPj;
import X.C65889PtV;
import X.C65905Ptl;
import X.C65923Pu3;
import X.C65924Pu4;
import X.C65926Pu6;
import X.C65935PuF;
import X.C65937PuH;
import X.C66059PwF;
import X.C66076PwW;
import X.C66083Pwd;
import X.C66226Pyw;
import X.C77275UUl;
import X.C78939UyV;
import X.C84763XOl;
import X.InterfaceC65784Pro;
import X.InterfaceC65953PuX;
import X.X1D;
import android.app.Activity;
import android.os.Handler;
import com.bytedance.helios.api.config.ApiStatistics;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.SkynetConfig;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.common.utils.CostTimeLog;
import com.bytedance.helios.common.utils.CostTimeline;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS3S1101000_11 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
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
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        NetworkConfig networkConfig;
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings != null && (networkConfig = settings.networkConfig) != null && C65905Ptl.LIZ(networkConfig.costTimeSampleRate)) {
            Iterator<CostTimeLog> it = ((CostTimeline) this.l1).getCostTimeLogs().iterator();
            while (it.hasNext()) {
                CostTimeLog next = it.next();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.s0);
                LIZ.append('_');
                LIZ.append(this.i2);
                LIZ.append('_');
                LIZ.append(next.getLabel());
                ApmEvent LJ = ApmEvent.LJ(next.getCost(), X1D.LIZIZ(LIZ));
                LJ.LJLIL = true;
                C66059PwF.LIZIZ(LJ);
            }
        }
    }

    public final void LIZ$1() {
        C66076PwW.LIZIZ(this.i2, 2, this.s0, (Throwable) this.l1);
        String opStr = this.s0;
        o.LJIIIZ(opStr, "opStr");
        Iterator<ApiStatistics> it = C66083Pwd.LIZJ.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                ApiStatistics next = it.next();
                if (!(!o.LJ(next.type, "appops"))) {
                    if (!next.isBlockList) {
                        if (next.items.isEmpty() || next.items.contains(opStr)) {
                            break;
                        }
                    } else if (!next.items.contains(opStr)) {
                        break;
                    }
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        C66083Pwd.LIZJ(i, opStr);
    }

    public final void LIZ$2() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            ((C65889PtV) this.l1).LIZJ(this.i2, LJIIIIZZ, this.s0);
            return;
        }
        new Handler().postDelayed(new ARunnableS3S1101000_11(this.i2, (C65889PtV) this.l1, this.s0, 4), 1000L);
    }

    public static final void run$0(ARunnableS3S1101000_11 aRunnableS3S1101000_11) {
        boolean LIZ;
        try {
            try {
                ((CronetWebsocketConnection) aRunnableS3S1101000_11.l1).LIZIZ.LIZIZ(aRunnableS3S1101000_11.i2, aRunnableS3S1101000_11.s0);
            } catch (Exception e) {
                C78939UyV.LJII("Exception in callback: ", e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S1101000_11 aRunnableS3S1101000_11) {
        NetworkComponent networkComponent;
        SettingsModel settings;
        NetworkConfig networkConfig;
        SkynetConfig skynetConfig;
        String str;
        String str2;
        String str3;
        long millis;
        String str4;
        String str5;
        IEventMonitor eventMonitor;
        InterfaceC65784Pro<String> interfaceC65784Pro;
        InterfaceC65784Pro<String> interfaceC65784Pro2;
        C65923Pu3 c65923Pu3 = (C65923Pu3) aRunnableS3S1101000_11.l1;
        int i = aRunnableS3S1101000_11.i2;
        String str6 = aRunnableS3S1101000_11.s0;
        if (c65923Pu3.LJLILLLLZI != null && (settings = (networkComponent = NetworkComponent.INSTANCE).getSettings()) != null && (networkConfig = settings.networkConfig) != null && (skynetConfig = networkConfig.skynetConfig) != null) {
            boolean LIZ = C65905Ptl.LIZ(skynetConfig.fuseUploadSampleRate);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            if (i == 0) {
                boolean z = false;
                if (str6 != null && !ujb.o.LJJJJJL(str6) && (LIZ || networkComponent.isOffLineEnv())) {
                    jSONObject.put("type", "dns_domain");
                    jSONObject.put("sdk_version", "5.2.0-rc.4");
                    SettingsModel settings2 = networkComponent.getSettings();
                    if (settings2 != null) {
                        str = settings2.version;
                    } else {
                        str = null;
                    }
                    jSONObject.put("settings_version", str);
                    jSONObject.put("report_tags", C77275UUl.LJII("shutdown"));
                    jSONObject.put("monitor_scenes", C77275UUl.LJII("skynet_dns_fuse_block_domain"));
                    jSONObject.put("domain", str6);
                    jSONObject.put("current_page", C64401PPh.LIZ());
                    C66226Pyw commonProxy = networkComponent.getCommonProxy();
                    if (commonProxy != null && (interfaceC65784Pro2 = commonProxy.LJLJI) != null) {
                        str2 = interfaceC65784Pro2.invoke();
                    } else {
                        str2 = null;
                    }
                    jSONObject.put("region", str2);
                    C66226Pyw commonProxy2 = networkComponent.getCommonProxy();
                    if (commonProxy2 != null && (interfaceC65784Pro = commonProxy2.LJLJJI) != null) {
                        str3 = interfaceC65784Pro.invoke();
                    } else {
                        str3 = null;
                    }
                    jSONObject.put("current_region", str3);
                    SettingsModel settings3 = networkComponent.getSettings();
                    if (settings3 != null) {
                        millis = settings3.backgroundFreezeDuration;
                    } else {
                        millis = TimeUnit.SECONDS.toMillis(2L);
                    }
                    jSONObject.put("is_background", C64403PPj.LIZLLL(millis));
                    jSONObject.put("action", "fuse");
                    C65935PuF appInfo = networkComponent.getAppInfo();
                    if (appInfo != null) {
                        str4 = appInfo.LJLJLJ;
                    } else {
                        str4 = null;
                    }
                    jSONObject.put("network_env", str4);
                    C65935PuF appInfo2 = networkComponent.getAppInfo();
                    if (appInfo2 != null) {
                        str5 = appInfo2.LJLJLLL;
                    } else {
                        str5 = null;
                    }
                    jSONObject.put("network_lane", str5);
                    C65935PuF appInfo3 = networkComponent.getAppInfo();
                    if (appInfo3 != null) {
                        z = appInfo3.LJLJJL;
                    }
                    jSONObject.put("is_debug", z);
                    jSONObject2.put("shutdown_sample_rate", skynetConfig.fuseUploadSampleRate);
                    if (LIZ && (eventMonitor = networkComponent.getEventMonitor()) != null) {
                        eventMonitor.monitorEvent("pns_network", jSONObject, new JSONObject(), jSONObject2);
                    }
                    new C46418IJq(jSONObject, jSONObject2);
                    Iterator it = ((ArrayList) C65924Pu4.LIZIZ).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC65953PuX) it.next()).LIZ();
                    }
                }
            }
            C65926Pu6.LIZIZ("Helios:Network-Skynet", new C65937PuH(str6, jSONObject, jSONObject2, LIZ), 4, null, 8);
        }
    }

    public static final void run$2(ARunnableS3S1101000_11 aRunnableS3S1101000_11) {
        boolean LIZ;
        try {
            aRunnableS3S1101000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS3S1101000_11 aRunnableS3S1101000_11) {
        boolean LIZ;
        try {
            aRunnableS3S1101000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS3S1101000_11 aRunnableS3S1101000_11) {
        boolean LIZ;
        try {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                ((C65889PtV) aRunnableS3S1101000_11.l1).LIZJ(aRunnableS3S1101000_11.i2, LJIIIIZZ, aRunnableS3S1101000_11.s0);
            } else {
                ((C65889PtV) aRunnableS3S1101000_11.l1).LIZJ.set(false);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS3S1101000_11 aRunnableS3S1101000_11) {
        boolean LIZ;
        try {
            aRunnableS3S1101000_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S1101000_11(int i, Object obj, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
