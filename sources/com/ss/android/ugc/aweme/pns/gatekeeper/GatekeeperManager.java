package com.ss.android.ugc.aweme.pns.gatekeeper;

import X.C233919Fz;
import X.C39777FjJ;
import X.C39778FjK;
import X.C58096Mr6;
import X.E7A;
import X.FMX;
import X.InterfaceC39779FjL;
import X.InterfaceC39781FjN;
import X.ORS;
import X.ORZ;
import X.X1D;
import Y.IDComparatorS339S0100000_6;
import android.os.Bundle;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS39S1300000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GatekeeperManager implements GatekeeperService {
    public boolean LIZ;
    public final E7A LIZIZ = new E7A();
    public C233919Fz LIZJ = new C233919Fz(true, 2);
    public final Map<String, C39777FjJ> LIZLLL = new LinkedHashMap();
    public List<String> LJ = new ArrayList();
    public final Object LJFF = new Object();

    public static GatekeeperService LJ() {
        Object LIZ = C58096Mr6.LIZ(GatekeeperService.class, false);
        if (LIZ != null) {
            return (GatekeeperService) LIZ;
        }
        if (C58096Mr6.U3 == null) {
            synchronized (GatekeeperService.class) {
                if (C58096Mr6.U3 == null) {
                    C58096Mr6.U3 = new GatekeeperManager();
                }
            }
        }
        return C58096Mr6.U3;
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService
    public final void reset() {
        Iterator it = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
        while (it.hasNext()) {
            C39777FjJ c39777FjJ = (C39777FjJ) ((Map.Entry) it.next()).getValue();
            c39777FjJ.LIZJ = false;
            c39777FjJ.LIZIZ = false;
            c39777FjJ.LIZLLL = 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService
    public final void LIZ(InterfaceC39779FjL interfaceC39779FjL) {
        this.LIZLLL.put(interfaceC39779FjL.LIZJ(), new C39777FjJ(interfaceC39779FjL));
    }

    public final boolean LIZJ(InterfaceC39779FjL interfaceC39779FjL) {
        if (interfaceC39779FjL.category().isBlocking()) {
            return true;
        }
        Iterator it = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            C39777FjJ c39777FjJ = (C39777FjJ) ((Map.Entry) it.next()).getValue();
            if (c39777FjJ.LIZ.category().isBlocking()) {
                i += c39777FjJ.LIZLLL;
            }
        }
        interfaceC39779FjL.LIZ();
        if (i < 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService
    public final void LIZIZ(Bundle extra, String str) {
        o.LJIIIZ(extra, "extra");
        if (o.LJ(str, "AppStart")) {
            if (this.LIZ) {
                return;
            } else {
                this.LIZ = true;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("signal", str);
        FMX.LJIIJJI("gate_keeper_signal_triggered", bundle);
        synchronized (this.LJFF) {
            for (Map.Entry entry : ((LinkedHashMap) this.LIZLLL).entrySet()) {
                String str2 = (String) entry.getKey();
                if (((C39777FjJ) entry.getValue()).LIZ.LIZIZ().contains(str) && !((ArrayList) this.LJ).contains(str2)) {
                    ((ArrayList) this.LJ).add(str2);
                }
            }
        }
        LIZLLL(extra, str);
    }

    public final void LIZLLL(Bundle bundle, String str) {
        synchronized (this.LJFF) {
            E7A e7a = this.LIZIZ;
            List<String> taskList = this.LJ;
            e7a.getClass();
            o.LJIIIZ(taskList, "taskList");
            this.LJ = ORZ.LLJILJILJ(ORZ.LLILII(new IDComparatorS339S0100000_6(e7a, 1), taskList));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = ((ArrayList) this.LJ).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                C39777FjJ c39777FjJ = (C39777FjJ) ((LinkedHashMap) this.LIZLLL).get(str2);
                if (c39777FjJ != null) {
                    InterfaceC39779FjL interfaceC39779FjL = c39777FjJ.LIZ;
                    if ((interfaceC39779FjL instanceof InterfaceC39781FjN) && !c39777FjJ.LIZIZ) {
                        if (!c39777FjJ.LIZJ) {
                            c39777FjJ.LIZJ = true;
                            ((InterfaceC39781FjN) interfaceC39779FjL).LJFF(str, bundle, new AqS39S1300000_6(c39777FjJ, this, str, bundle, 5));
                        }
                    } else {
                        Iterator it2 = ((ArrayList) this.LIZIZ.LIZ(str2)).iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            String str3 = (String) it2.next();
                            if (((C39777FjJ) ((LinkedHashMap) this.LIZLLL).get(str3)) != null && !linkedHashSet.contains(str3)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            linkedHashSet.add(str2);
                            if (interfaceC39779FjL.LJ(bundle, str) && LIZJ(interfaceC39779FjL)) {
                                interfaceC39779FjL.LIZLLL(str, bundle, new C39778FjK(this, interfaceC39779FjL, str2));
                                c39777FjJ.LIZLLL++;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("key", str2);
                                FMX.LJIIJJI("gate_keeper_task_triggered", bundle2);
                            }
                        }
                    }
                }
            }
            ORS.LJJLIL(new AqS167S0100000_1(linkedHashSet, (Set<String>) 452), this.LJ);
            Iterator it3 = ((ArrayList) this.LJ).iterator();
            while (it3.hasNext()) {
                LJFF((String) it3.next(), this.LJ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("End of signal ");
            LIZ.append(str);
            LIZ.append(", current task list is ");
            LIZ.append(this.LJ);
            X1D.LIZIZ(LIZ);
        }
    }

    public final void LJFF(String str, List<String> list) {
        Iterator it = ((ArrayList) this.LIZIZ.LIZ(str)).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list.contains(str2)) {
                Bundle bundle = new Bundle();
                bundle.putString("key", str);
                bundle.putString("blocking", str2);
                FMX.LJIIJJI("gate_keeper_task_queued", bundle);
                return;
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("key", str);
        bundle2.putString("blocking", "Unknown");
        FMX.LJIIJJI("gate_keeper_task_queued", bundle2);
    }
}
