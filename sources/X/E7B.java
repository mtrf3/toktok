package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamVerifierConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class E7B implements InterfaceC65104Pgq {
    public static final EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel LIZ;
    public static final java.util.Map<String, List<EcomRequestParamVerifierConfig.Rule>> LIZIZ;

    static {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel ecomRequestParamVerifierModel = EcomRequestParamVerifierConfig.LIZ;
        EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel ecomRequestParamVerifierModel2 = (EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel) LIZLLL.LJIIIIZZ("ttec_request_rule_verification_v1", EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel.class, ecomRequestParamVerifierModel);
        if (ecomRequestParamVerifierModel2 != null) {
            ecomRequestParamVerifierModel = ecomRequestParamVerifierModel2;
        }
        LIZ = ecomRequestParamVerifierModel;
        LIZIZ = ecomRequestParamVerifierModel.getVerifierPaths();
        C221108m2.LIZIZ(E7C.LJLIL);
    }

    @Override // X.InterfaceC65104Pgq
    public final void LIZJ(Request request) {
        int i;
        o.LJIIIZ(request, "request");
        String path = request.getPath();
        Boolean enableNotification = LIZ.getEnableNotification();
        java.util.Map<String, List<EcomRequestParamVerifierConfig.Rule>> map = LIZIZ;
        if (map.containsKey(path)) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                HashMap<String, Object> LJII = C27739Aud.LJII(V1B.LJJLL(request));
                if (LJII == null) {
                    return;
                }
                List<EcomRequestParamVerifierConfig.Rule> list = map.get(path);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                LJIIJJI(list, linkedHashSet, linkedHashMap, linkedHashMap2);
                LJIIJ(request, true, LJII, linkedHashMap, arrayList2, arrayList, arrayList4);
                LJIIJ(request, false, LJII, linkedHashMap2, arrayList2, arrayList, arrayList4);
                for (Map.Entry<String, Object> entry : LJII.entrySet()) {
                    if (!linkedHashSet.contains(entry.getKey())) {
                        LJIIL(request, entry.getKey(), 3);
                        arrayList3.add(entry.getKey());
                    }
                }
                if (arrayList.size() + arrayList2.size() + arrayList3.size() + arrayList4.size() > 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                C71000Rtk c71000Rtk = new C71000Rtk();
                c71000Rtk.LJII(new EA1(request, i, elapsedRealtime2));
                c71000Rtk.LIZJ(false);
                o.LJ(enableNotification, Boolean.TRUE);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJFF(C64797Pbt<?> response) {
        o.LJIIIZ(response, "response");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJII(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void onException(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    public static void LJIIL(Request request, String str, int i) {
        C70998Rti c70998Rti = new C70998Rti();
        c70998Rti.LJII(new EA0(request, str, i));
        c70998Rti.LIZJ(false);
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJIIIIZZ(Request request, C64797Pbt<?> c64797Pbt, Throwable th) {
        o.LJIIIZ(request, "request");
    }

    public static void LJIIJJI(List list, java.util.Set set, java.util.Map map, java.util.Map map2) {
        boolean z;
        int i;
        boolean z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EcomRequestParamVerifierConfig.Rule rule = (EcomRequestParamVerifierConfig.Rule) it.next();
                if (rule.getKey() != null) {
                    Boolean required = rule.getRequired();
                    if (required != null) {
                        z = required.booleanValue();
                    } else {
                        z = false;
                    }
                    Integer type = rule.getType();
                    if (type != null) {
                        i = type.intValue();
                    } else {
                        i = 0;
                    }
                    Boolean empty = rule.getEmpty();
                    if (empty != null) {
                        z2 = empty.booleanValue();
                    } else {
                        z2 = false;
                    }
                    Object LJLLLL = ORZ.LJLLLL(s.LJLJJL(rule.getKey(), new String[]{"."}, 0, 6));
                    if (LJLLLL != null) {
                        set.add(LJLLLL);
                    }
                    if (z) {
                        map.put(rule.getKey(), new OSZ(Integer.valueOf(i), Boolean.valueOf(z2)));
                    } else {
                        map2.put(rule.getKey(), new OSZ(Integer.valueOf(i), Boolean.valueOf(z2)));
                    }
                }
            }
        }
    }

    public static int LJIILIIL(int i, int i2, boolean z, List list, HashMap hashMap) {
        HashMap hashMap2;
        int i3;
        int i4 = 0;
        if (i >= list.size()) {
            return 0;
        }
        Object obj = ListProtector.get(list, i);
        if (!hashMap.containsKey(obj)) {
            return 1;
        }
        if (i == C47261Igj.LJJI(list)) {
            Object obj2 = hashMap.get(obj);
            if (obj2 instanceof Number) {
                i3 = 0;
                i4 = 1;
            } else if (obj2 instanceof String) {
                String str = (String) obj2;
                if (str != null && ujb.o.LJJJJJL(str)) {
                    i4 = 1;
                }
                i3 = i4;
                i4 = 2;
            } else if (obj2 instanceof List) {
                List list2 = (List) obj2;
                if (list2 != null && list2.size() == 0) {
                    i4 = 1;
                }
                i3 = i4;
                i4 = 3;
            } else if (obj2 instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) obj2;
                if (map != null && map.size() == 0) {
                    i4 = 1;
                }
                i3 = i4;
                i4 = 4;
            } else {
                i3 = 0;
            }
            if (i2 != 0 && i2 != i4) {
                return 2;
            }
            if (z && i3 != 0) {
                return 4;
            }
            return 999;
        }
        Object obj3 = hashMap.get(obj);
        if (!(obj3 instanceof HashMap) || (hashMap2 = (HashMap) obj3) == null) {
            return 1;
        }
        return LJIILIIL(i + 1, i2, z, list, hashMap2);
    }

    public static void LJIIJ(Request request, boolean z, HashMap hashMap, java.util.Map map, List list, List list2, List list3) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int LJIILIIL = LJIILIIL(0, ((Number) ((OSZ) entry.getValue()).getFirst()).intValue(), ((Boolean) ((OSZ) entry.getValue()).getSecond()).booleanValue(), s.LJLJJL((CharSequence) entry.getKey(), new String[]{"."}, 0, 6), hashMap);
            if (LJIILIIL != 1) {
                if (LJIILIIL != 2) {
                    if (LJIILIIL == 4) {
                        LJIIL(request, (String) entry.getKey(), 4);
                        ((ArrayList) list3).add(entry.getKey());
                    }
                } else {
                    LJIIL(request, (String) entry.getKey(), 2);
                    ((ArrayList) list).add(entry.getKey());
                }
            } else if (z) {
                LJIIL(request, (String) entry.getKey(), 1);
                ((ArrayList) list2).add(entry.getKey());
            }
        }
    }
}
