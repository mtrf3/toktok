package X;

import android.text.TextUtils;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FH1 {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final FHP LIZIZ;
    public static final List<String> LIZJ;
    public static final java.util.Map<String, String> LIZLLL;
    public static final ConcurrentHashMap<Object, Boolean> LJ;
    public static final C62822Ol8 LJFF;
    public static final FH1 LJI;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(FH1.class), "extraExposureHandler", "getExtraExposureHandler()Lcom/bytedance/ies/abmock/datacenter/precise/VidExposureDelegate;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
        LJI = new FH1();
        C38731FHz c38731FHz = C38731FHz.LIZIZ;
        o.LJFF(c38731FHz, "DataStorageManager.getInstance()");
        LIZIZ = c38731FHz.LIZ.LIZ();
        LIZJ = new ArrayList();
        LIZLLL = new LinkedHashMap();
        LJ = new ConcurrentHashMap<>();
        LJFF = C221108m2.LIZIZ(E7H.LJLIL);
    }

    public static E7F LJI() {
        return (E7F) LJFF.getValue();
    }

    public static void LIZIZ() {
        LJ.remove(Integer.valueOf(C16880lQ.LLLLIIIILLL().hashCode()));
    }

    public static String LJ() {
        FHP fhp = LIZIZ;
        String[] LJIIIIZZ = fhp.LJIIIIZZ("__client_exp_vids", new String[0]);
        o.LJFF(LJIIIIZZ, "preciseExposureRepo.getS…_VIDS, arrayOf<String>())");
        String[] exposureVids = fhp.LJIIIIZZ("__exposed_vids", new String[0]);
        ArrayList arrayList = new ArrayList();
        ORS.LJJLIIIJJIZ(arrayList, LJIIIIZZ);
        o.LJFF(exposureVids, "exposureVids");
        ORS.LJJLIIIJJIZ(arrayList, exposureVids);
        FHC LIZIZ2 = FHC.LIZIZ();
        o.LJFF(LIZIZ2, "DataProvider.getInstance()");
        if (LIZIZ2.LIZLLL != null) {
            String[] exposureVidsForCurrentUser = fhp.LJIIIIZZ(C0F0.LIZLLL("{__exposed_vids_for_current_user}_{", LJFF(), '}'), new String[0]);
            o.LJFF(exposureVidsForCurrentUser, "exposureVidsForCurrentUser");
            ORS.LJJLIIIJJIZ(arrayList, exposureVidsForCurrentUser);
        }
        ORS.LJJLIIIJJIZ(arrayList, LJII());
        C38701FGv.LJII.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ConcurrentHashMap<String, C38701FGv> concurrentHashMap = C38701FGv.LJFF;
        synchronized (concurrentHashMap) {
            Iterator<Map.Entry<String, C38701FGv>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                C38701FGv value = it.next().getValue();
                String[] LIZJ2 = ((EAB) value.LIZJ.getValue()).LIZJ();
                EAB LIZIZ3 = value.LIZIZ();
                if (LIZIZ3 != null) {
                    LIZJ2 = (String[]) C61898ORa.LJJIII(LIZJ2, LIZIZ3.LIZJ());
                }
                ORS.LJJLIIIJJIZ(linkedHashSet, LIZJ2);
            }
        }
        arrayList.addAll(linkedHashSet);
        return ORZ.LLD(new HashSet(arrayList), ",", null, null, null, 62);
    }

    public static void LIZLLL() {
        String LJ2 = LJ();
        FHC LIZIZ2 = FHC.LIZIZ();
        o.LJFF(LIZIZ2, "DataProvider.getInstance()");
        InterfaceC38688FGi interfaceC38688FGi = LIZIZ2.LIZLLL;
        if (interfaceC38688FGi != null) {
            interfaceC38688FGi.LJI(LJ2);
        }
    }

    public static String LJFF() {
        String str;
        FHC LIZIZ2 = FHC.LIZIZ();
        o.LJFF(LIZIZ2, "DataProvider.getInstance()");
        InterfaceC38688FGi interfaceC38688FGi = LIZIZ2.LIZLLL;
        if (interfaceC38688FGi == null || (str = interfaceC38688FGi.getCurrentUid()) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str) || o.LJ(CardStruct.IStatusCode.DEFAULT, str)) {
            return "";
        }
        return str;
    }

    public static String[] LJII() {
        E7F LJI2 = LJI();
        String[] LIZJ2 = LJI2.LIZJ.LIZJ();
        EAB LIZ2 = LJI2.LIZ();
        if (LIZ2 != null) {
            return (String[]) C61898ORa.LJJIII(LIZJ2, LIZ2.LIZJ());
        }
        return LIZJ2;
    }

    public static void LIZ(String key) {
        o.LJIIJ(key, "key");
        ConcurrentHashMap<Object, Boolean> concurrentHashMap = LJ;
        if (concurrentHashMap.containsKey(Integer.valueOf(C16880lQ.LLLLIIIILLL().hashCode())) || !concurrentHashMap.containsKey(key)) {
            return;
        }
        concurrentHashMap.remove(key);
        LJIIJ(key);
    }

    public static void LJIIJ(String key) {
        o.LJIIJ(key, "key");
        ConcurrentHashMap<Object, Boolean> concurrentHashMap = LJ;
        if (concurrentHashMap.containsKey(Integer.valueOf(C16880lQ.LLLLIIIILLL().hashCode()))) {
            if (((HashMap) KUZ.LIZIZ).containsKey(key)) {
                concurrentHashMap.put(key, Boolean.TRUE);
                return;
            }
            return;
        }
        LIZJ(key, ((ArrayList) LIZJ).contains(key));
    }

    public static void LIZJ(String key, boolean z) {
        o.LJIIJ(key, "key");
        FHP fhp = LIZIZ;
        if (fhp.contains(key)) {
            String LJFF2 = LJFF();
            if (z) {
                String[] exposedVidsForCurrentUser = fhp.LJIIIIZZ(C0F0.LIZLLL("{__exposed_vids_for_current_user}_{", LJFF2, '}'), new String[0]);
                String element = fhp.getString(key, "");
                o.LJFF(element, "element");
                if (element.length() > 0) {
                    o.LJFF(exposedVidsForCurrentUser, "exposedVidsForCurrentUser");
                    if (!ORY.LJJIJIIJIL(element, exposedVidsForCurrentUser)) {
                        ArrayList arrayList = (ArrayList) ORY.LJLIIIL(exposedVidsForCurrentUser);
                        arrayList.add(element);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("{__exposed_vids_for_current_user}_{");
                        LIZ2.append(LJFF2);
                        LIZ2.append('}');
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        Object[] array = arrayList.toArray(new String[0]);
                        if (array != null) {
                            fhp.LJIIIZ(LIZIZ2, (String[]) array);
                            LIZLLL();
                            return;
                        }
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    return;
                }
                return;
            }
            String[] exposedVids = fhp.LJIIIIZZ("__exposed_vids", new String[0]);
            String element2 = fhp.getString(key, "");
            o.LJFF(element2, "element");
            if (element2.length() <= 0) {
                return;
            }
            o.LJFF(exposedVids, "exposedVids");
            if (ORY.LJJIJIIJIL(element2, exposedVids)) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) ORY.LJLIIIL(exposedVids);
            arrayList2.add(element2);
            Object[] array2 = arrayList2.toArray(new String[0]);
            if (array2 != null) {
                fhp.LJIIIZ("__exposed_vids", (String[]) array2);
                LIZLLL();
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public static void LJIIIIZZ(m mVar, String str) {
        j LJJIJ;
        try {
            LJIIIZ(mVar, str);
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJ = LJJIJIL.LJJIJ("val")) != null) {
                FHE.LIZLLL.LJIIL(str, LJJIJ.toString());
            } else if (mVar.LJJIJLIJ(str)) {
                FHE.LIZLLL.LJIIL(str, null);
            } else {
                FHE.LIZLLL.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PreciseExposureManager ");
            LIZ2.append(th);
            LIZ2.append("  , key: ");
            LIZ2.append(str);
            PEH.LIZIZ(X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJIIIZ(m mVar, String str) {
        p LJJIJL;
        String LJJIFFI;
        try {
            m LJJIJIL = mVar.LJJIJIL(str);
            if (LJJIJIL != null && (LJJIJL = LJJIJIL.LJJIJL("vid")) != null && (LJJIFFI = LJJIJL.LJJIFFI()) != null) {
                LIZIZ.LIZIZ(str, LJJIFFI);
                LIZLLL.put(LJJIFFI, str);
            } else {
                FHP fhp = LIZIZ;
                if (fhp.contains(str)) {
                    fhp.LIZ(str);
                }
            }
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PreciseExposureManager saveKeyVid failed, ");
            LIZ2.append(th);
            LIZ2.append(" , key: ");
            LIZ2.append(str);
            PEH.LIZIZ(X1D.LIZIZ(LIZ2));
        }
    }
}
