package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHF extends AbstractC73391SrD<String> {
    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        FHL.LIZIZ = null;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIJ(e, "e");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request error: ");
        LIZ.append(e);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        m mVar;
        SaveConfigType$ConfigType saveConfigType$ConfigType;
        m LJJIJIL;
        long j;
        p LJJIJL;
        String t = (String) obj;
        o.LJIIJ(t, "t");
        C1JX.LJIIIIZZ("request finish: ", t);
        try {
            FHL.LIZJ.getClass();
            m LJIIZILJ = com.google.gson.o.LIZ(t).LJIIZILJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("response: ");
            LIZ.append(LJIIZILJ);
            X1D.LIZIZ(LIZ);
            LJJIJIL = LJIIZILJ.LJJIJIL("data");
            if (LJJIJIL != null && (LJJIJL = LJJIJIL.LJJIJL("settings_time")) != null) {
                j = LJJIJL.LJIJJLI();
            } else {
                j = 0;
            }
            FHL.LIZ = j;
            FHE.LIZLLL.LJIIIZ().LIZJ("lastSyncTimeStamp", FHL.LIZ);
        } catch (Exception unused) {
            mVar = new m();
        }
        if (LJJIJIL != null) {
            mVar = LJJIJIL.LJJIJIL("settings");
            if (mVar != null) {
                try {
                    java.util.Set<String> keys = mVar.LJJIZ();
                    o.LJFF(keys, "keys");
                    ArrayList arrayList = new ArrayList();
                    for (String str : keys) {
                        if (((HashMap) KUZ.LIZ).containsKey(str)) {
                            arrayList.add(str);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        ConfigItem configItem = (ConfigItem) ((HashMap) KUZ.LIZ).get(str2);
                        if (configItem != null && (saveConfigType$ConfigType = configItem.type) != null) {
                            int i = 0;
                            switch (C38710FHe.LIZ[saveConfigType$ConfigType.ordinal()]) {
                                case 1:
                                    p LJJIJL2 = mVar.LJJIJL(str2);
                                    if (LJJIJL2 != null) {
                                        FHE.LIZLLL.LJIIJJI(str2, LJJIJL2.LJLIL instanceof Number ? !o.LJ(LJJIJL2.LJIL(), 0) : LJJIJL2.LJFF());
                                        break;
                                    }
                                    break;
                                case 2:
                                    p LJJIJL3 = mVar.LJJIJL(str2);
                                    if (LJJIJL3 != null) {
                                        if (LJJIJL3.LJLIL instanceof Boolean) {
                                            if (LJJIJL3.LJFF()) {
                                                i = 1;
                                            }
                                        } else {
                                            i = LJJIJL3.LJIILJJIL();
                                        }
                                        FHE.LIZLLL.LJIIIZ().LIZLLL(str2, i);
                                        break;
                                    }
                                    break;
                                case 3:
                                    j LJJIJ = mVar.LJJIJ(str2);
                                    if (LJJIJ != null) {
                                        FHE.LIZLLL.LJIIIZ().LIZJ(str2, LJJIJ.LJIJJLI());
                                        break;
                                    }
                                    break;
                                case 4:
                                    j LJJIJ2 = mVar.LJJIJ(str2);
                                    if (LJJIJ2 != null) {
                                        FHE.LIZLLL.LJIIIZ().LJII(str2, LJJIJ2.LJIIJ());
                                        break;
                                    }
                                    break;
                                case 5:
                                    j LJJIJ3 = mVar.LJJIJ(str2);
                                    if (LJJIJ3 != null) {
                                        FHE.LIZLLL.LJIIIZ().LJ(str2, LJJIJ3.LJIIIZ());
                                        break;
                                    }
                                    break;
                                case 6:
                                    j LJJIJ4 = mVar.LJJIJ(str2);
                                    if (LJJIJ4 != null) {
                                        String LJJIFFI = LJJIJ4.LJJIFFI();
                                        o.LJFF(LJJIFFI, "jsonElement.asString");
                                        FHE.LIZLLL.LJIIL(str2, LJJIFFI);
                                        break;
                                    }
                                    break;
                                case 7:
                                    j LJJIJ5 = mVar.LJJIJ(str2);
                                    if (LJJIJ5 != null) {
                                        FHE fhe = FHE.LIZLLL;
                                        fhe.LJIIIZ().LJIIIZ(str2, (String[]) GsonProtectorUtils.fromJson(fhe.LJIIJ(), LJJIJ5, String[].class));
                                        break;
                                    }
                                    break;
                            }
                        }
                        j LJJIJ6 = mVar.LJJIJ(str2);
                        if (LJJIJ6 != null) {
                            FHE.LIZLLL.LJIIL(str2, LJJIJ6.toString());
                        }
                        FFL LJIIIZ = FFL.LJIIIZ();
                        if (str2 != null) {
                            ((ConcurrentHashMap) LJIIIZ.LIZ).remove(str2);
                        } else {
                            LJIIIZ.getClass();
                        }
                        FHC.LIZIZ().LIZLLL(str2);
                    }
                    Iterator it2 = ((ArrayList) FHL.LIZLLL).iterator();
                    while (it2.hasNext()) {
                        ((FIB) it2.next()).LIZ();
                    }
                } catch (Exception e) {
                    System.out.print(e);
                }
            }
        }
        FHL.LIZIZ = null;
    }
}
