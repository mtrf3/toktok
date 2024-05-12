package com.ss.android.ugc.aweme.services;

import X.C46612IRc;
import X.C46613IRd;
import X.C46620IRk;
import X.C46622IRm;
import X.C46625IRp;
import X.C46628IRs;
import X.C58096Mr6;
import X.EF7;
import X.IRZ;
import X.IS2;
import X.InterfaceC46627IRr;
import X.X1D;
import android.os.PowerManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.port.in.IToolsCPUDataService;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class ToolsCPUDataServiceImpl implements IToolsCPUDataService {
    public InterfaceC46627IRr assistStat;

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public void end() {
        InterfaceC46627IRr interfaceC46627IRr = this.assistStat;
        if (interfaceC46627IRr != null) {
            C46625IRp c46625IRp = (C46625IRp) interfaceC46627IRr;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("end, obj:");
            LIZ.append(c46625IRp);
            X1D.LIZIZ(LIZ);
            c46625IRp.LIZ.getClass();
            c46625IRp.LIZIZ.getClass();
            C46620IRk c46620IRk = c46625IRp.LIZJ;
            if (c46620IRk.LJLJI) {
                c46620IRk.LJLJI = false;
                IRZ irz = c46620IRk.LJLJJL;
                ((ArrayList) irz.LIZ).clear();
                ((ArrayList) irz.LIZIZ).clear();
                ((ArrayList) irz.LIZJ).clear();
                irz.LJFF = 0L;
                irz.LJI = 0L;
                irz.LJII = 0L;
                ((HashMap) c46620IRk.LJLJJLL).clear();
                ((HashMap) c46620IRk.LJLJL).clear();
                C46613IRd c46613IRd = c46620IRk.LJLJLLL;
                ((ArrayList) c46613IRd.LIZ).clear();
                ((ArrayList) c46613IRd.LIZIZ).clear();
                c46613IRd.LIZJ = 0L;
                c46613IRd.LIZLLL = 0L;
                c46613IRd.LJ = 0L;
                c46613IRd.LJFF = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                C46622IRm c46622IRm = c46620IRk.LJLLI;
                c46622IRm.LIZ = null;
                c46622IRm.LIZIZ = -1;
                c46622IRm.LIZJ = 0L;
                c46622IRm.LIZLLL = 0L;
                c46622IRm.LJ = 0L;
                c46622IRm.LJFF = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                c46622IRm.LJI = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                ((HashMap) c46620IRk.LJLLILLLL).clear();
                ((HashMap) c46620IRk.LJLLJ).clear();
                C46612IRc c46612IRc = c46620IRk.LJLLL;
                ((ArrayList) c46612IRc.LIZ).clear();
                ((ArrayList) c46612IRc.LIZIZ).clear();
                c46612IRc.LIZJ = 0L;
                c46612IRc.LIZLLL = 0L;
                c46612IRc.LJ = 0L;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public HashMap<String, Double> getCpuData() {
        Double d;
        double d2;
        HashMap<String, Double> hashMap = new HashMap<>();
        InterfaceC46627IRr interfaceC46627IRr = this.assistStat;
        if (interfaceC46627IRr != null) {
            ((C46625IRp) interfaceC46627IRr).LIZJ.LJI();
        }
        InterfaceC46627IRr interfaceC46627IRr2 = this.assistStat;
        double d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        Double d4 = null;
        if (interfaceC46627IRr2 != null) {
            C46620IRk c46620IRk = ((C46625IRp) interfaceC46627IRr2).LIZJ;
            if (((C46625IRp) ((InterfaceC46627IRr) c46620IRk.LJLILLLLZI)).LJ.LIZ) {
                d2 = c46620IRk.LJLLI.LJFF;
            } else {
                d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            d = Double.valueOf(d2);
        } else {
            d = null;
        }
        hashMap.put("proc_cpu_usage", d);
        InterfaceC46627IRr interfaceC46627IRr3 = this.assistStat;
        if (interfaceC46627IRr3 != null) {
            C46620IRk c46620IRk2 = ((C46625IRp) interfaceC46627IRr3).LIZJ;
            if (((C46625IRp) ((InterfaceC46627IRr) c46620IRk2.LJLILLLLZI)).LJ.LIZ) {
                d3 = c46620IRk2.LJLLI.LJI;
            }
            d4 = Double.valueOf(d3);
        }
        hashMap.put("proc_cpu_speed", d4);
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public HashMap<String, String> getThermalData() {
        String str;
        String str2;
        HashMap<String, String> hashMap = new HashMap<>();
        InterfaceC46627IRr interfaceC46627IRr = this.assistStat;
        if (interfaceC46627IRr == null || (str = Integer.valueOf(((C46625IRp) interfaceC46627IRr).LIZJ()).toString()) == null) {
            str = "-1";
        }
        hashMap.put("thermal", str);
        InterfaceC46627IRr interfaceC46627IRr2 = this.assistStat;
        if (interfaceC46627IRr2 != null) {
            C46628IRs c46628IRs = ((C46625IRp) interfaceC46627IRr2).LIZ;
            c46628IRs.LJI();
            str2 = Float.valueOf(c46628IRs.LJLJL).toString();
        } else {
            str2 = null;
        }
        hashMap.put("thermal_temp", str2);
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public void init() {
        IS2 is2 = new IS2();
        is2.LIZ = true;
        C46625IRp c46625IRp = new C46625IRp(EF7.LIZIZ(), is2);
        this.assistStat = c46625IRp;
        c46625IRp.LJ();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsCPUDataService
    public int isSavePowerEnable() {
        PowerManager powerManager;
        InterfaceC46627IRr interfaceC46627IRr = this.assistStat;
        if (interfaceC46627IRr == null || (powerManager = ((C46625IRp) interfaceC46627IRr).LIZ.LJLJI) == null) {
            return -1;
        }
        return powerManager.isPowerSaveMode() ? 1 : 0;
    }

    public final InterfaceC46627IRr getAssistStat() {
        return this.assistStat;
    }

    public static IToolsCPUDataService createIToolsCPUDataServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IToolsCPUDataService.class, z);
        if (LIZ != null) {
            return (IToolsCPUDataService) LIZ;
        }
        if (C58096Mr6.d6 == null) {
            synchronized (IToolsCPUDataService.class) {
                if (C58096Mr6.d6 == null) {
                    C58096Mr6.d6 = new ToolsCPUDataServiceImpl();
                }
            }
        }
        return C58096Mr6.d6;
    }

    public final void setAssistStat(InterfaceC46627IRr interfaceC46627IRr) {
        this.assistStat = interfaceC46627IRr;
    }
}
