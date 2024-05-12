package com.ss.android.ugc.aweme.benchmark;

import X.C16880lQ;
import X.C1B8;
import X.C1DG;
import X.C264111x;
import X.C264211y;
import X.C38891fp;
import X.C38901fq;
import X.C39136FXo;
import X.C43075GvP;
import X.C44172HVg;
import X.C58096Mr6;
import X.C78983UzD;
import X.EF7;
import X.FRD;
import X.HQ7;
import X.InterfaceC12330e5;
import X.InterfaceC12340e6;
import X.QJY;
import android.os.Build;
import com.benchmark.IBTCHConfiguration;
import com.bytedance.vmsdk.monitor.VmSdkMonitor;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class BTCHConfigurationImpl implements IBTCHConfiguration {
    private final String getWordSpace() {
        String str;
        if (FRD.LIZ()) {
            str = null;
            File LLIIJI = C16880lQ.LLIIJI(EF7.LIZIZ(), null);
            if (LLIIJI != null) {
                str = LLIIJI.getPath();
            }
        } else {
            str = C43075GvP.LIZ;
        }
        String absolutePath = new File(str, "bytebench").getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "File(\n            if (En…h\"\n        ).absolutePath");
        return absolutePath;
    }

    @Override // com.benchmark.IBTCHConfiguration
    public C264211y getByteBenchConfig() {
        boolean z;
        BTCHMode bTCHMode;
        String str;
        String serverDeviceId;
        if (VmSdkMonitor.LIZ == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            VmSdkMonitor.LIZIZ(EF7.LIZIZ(), new C39136FXo(AppLog.getServerDeviceId(), EF7.LJIILIIL, String.valueOf(EF7.LJIIIZ), EF7.LIZLLL(), String.valueOf(EF7.LJFF())));
        }
        C38891fp.LJJIJIIJI(new InterfaceC12330e5() { // from class: com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl$getByteBenchConfig$1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
            
                if (r3.equals("bytebench_get_strategy_value_v2") == false) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
            
                if (X.C48331Ixz.LIZJ() != false) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
            
                if (r3.equals("bytebench_strategy_class_obtain_v2") == false) goto L6;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
            @Override // X.InterfaceC12330e5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onEvent(java.lang.String r3, org.json.JSONObject r4) {
                /*
                    r2 = this;
                    java.lang.String r0 = "eventName"
                    kotlin.jvm.internal.o.LJIIIZ(r3, r0)
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.o.LJIIIZ(r4, r0)
                    boolean r0 = X.C48331Ixz.LIZ()
                    if (r0 == 0) goto L17
                    int r0 = r3.hashCode()
                    switch(r0) {
                        case -1784441047: goto L3c;
                        case -828897669: goto L21;
                        case -642369578: goto L2a;
                        case 984743495: goto L33;
                        case 2008870842: goto L45;
                        default: goto L17;
                    }
                L17:
                    kotlin.jvm.internal.AqS80S1100000_13 r1 = new kotlin.jvm.internal.AqS80S1100000_13
                    r0 = 2
                    r1.<init>(r3, r4, r0)
                    X.C43045Guv.LIZIZ(r1)
                    return
                L21:
                    java.lang.String r0 = "bytebench_df_download_information"
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L44
                    goto L17
                L2a:
                    java.lang.String r0 = "bytebench_get_strategy_value_v2"
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L4e
                    goto L17
                L33:
                    java.lang.String r0 = "bytebench_df_install_result"
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L44
                    goto L17
                L3c:
                    java.lang.String r0 = "bytebench_strategy_get_operation_cost_time"
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto L17
                L44:
                    return
                L45:
                    java.lang.String r0 = "bytebench_strategy_class_obtain_v2"
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L4e
                    goto L17
                L4e:
                    boolean r0 = X.C48331Ixz.LIZJ()
                    if (r0 != 0) goto L17
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl$getByteBenchConfig$1.onEvent(java.lang.String, org.json.JSONObject):void");
            }
        });
        BTCHConfigurationImpl$getByteBenchConfig$2 bTCHConfigurationImpl$getByteBenchConfig$2 = new InterfaceC12340e6() { // from class: com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl$getByteBenchConfig$2
            @Override // X.InterfaceC12340e6
            public final void onException(Throwable throwable) {
                o.LJIIIZ(throwable, "throwable");
                C78983UzD.LJIJ(throwable, "benchmark test");
            }
        };
        synchronized (C38901fq.class) {
            C38901fq.LJLIL = bTCHConfigurationImpl$getByteBenchConfig$2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        QJY.LJI(linkedHashMap, true);
        if (!C1B8.LIZJ()) {
            bTCHMode = BTCHMode.NOT_LOGIN;
        } else if (C1DG.LJIIIIZZ()) {
            bTCHMode = BTCHMode.KIDS;
        } else {
            bTCHMode = BTCHMode.NORMAL;
        }
        linkedHashMap.put("mode", bTCHMode.getValue());
        C264111x c264111x = new C264111x();
        c264111x.LIZ = EF7.LIZIZ();
        c264111x.LIZJ = AVApiImpl.LIZJ().LIZ();
        c264111x.LIZLLL = Build.MODEL;
        c264111x.LJ = EF7.LJIIIZ;
        c264111x.LJFF = EF7.LIZ();
        c264111x.LJI = EF7.LJII();
        c264111x.LJII = EF7.LJI();
        HQ7 hq7 = C44172HVg.LJIJ;
        if (hq7 == null || (str = hq7.getCurrentUserID()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c264111x.LJIIIZ = str;
        if (AppLog.getServerDeviceId() == null) {
            serverDeviceId = CardStruct.IStatusCode.DEFAULT;
        } else {
            serverDeviceId = AppLog.getServerDeviceId();
        }
        c264111x.LJIIIIZZ = serverDeviceId;
        c264111x.LJIIJJI = BenchmarkEnableOpenRuntimeDecision.enable();
        c264111x.LIZIZ = getWordSpace();
        c264111x.LJIIL = linkedHashMap;
        c264111x.LJIIJ = (byte) 31;
        return new C264211y(c264111x);
    }

    public static IBTCHConfiguration createIBTCHConfigurationbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBTCHConfiguration.class, z);
        if (LIZ != null) {
            return (IBTCHConfiguration) LIZ;
        }
        if (C58096Mr6.LLJJI == null) {
            synchronized (IBTCHConfiguration.class) {
                if (C58096Mr6.LLJJI == null) {
                    C58096Mr6.LLJJI = new BTCHConfigurationImpl();
                }
            }
        }
        return C58096Mr6.LLJJI;
    }
}
