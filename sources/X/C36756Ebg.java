package X;

import Y.AObjectS135S0100000_6;
import Y.ARunnableS25S0200000_6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ebg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36756Ebg implements InterfaceC36771Ebv {
    public final C35980EAe<String, C36760Ebk> LIZ;
    public final LinkedHashSet<String> LIZIZ = new LinkedHashSet<>();
    public final InterfaceC36763Ebn LIZJ;
    public final InterfaceC36604EYe LIZLLL;
    public final Executor LJ;

    @Override // X.InterfaceC36771Ebv
    public final void LIZ() {
        C35980EAe<String, C36760Ebk> c35980EAe = this.LIZ;
        synchronized (c35980EAe) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Start trimming, entry count: ");
            LIZ.append(c35980EAe.LIZ.size());
            LIZ.append('.');
            C36762Ebm.LIZJ(X1D.LIZIZ(LIZ));
            Iterator<Map.Entry<String, C36760Ebk>> it = c35980EAe.LIZ.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, C36760Ebk> next = it.next();
                if (c35980EAe.LJFF.invoke(next.getKey(), next.getValue()).booleanValue()) {
                    it.remove();
                    c35980EAe.LJI.invoke(next.getKey(), next.getValue());
                    int i = c35980EAe.LIZIZ;
                    next.getKey();
                    next.getValue();
                    c35980EAe.LIZIZ = i - 1;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Entry removed: ");
                    LIZ2.append((Object) next.getKey());
                    LIZ2.append('.');
                    C36762Ebm.LIZJ(X1D.LIZIZ(LIZ2));
                }
            }
        }
        InterfaceC36763Ebn interfaceC36763Ebn = this.LIZJ;
        if (interfaceC36763Ebn != null) {
            interfaceC36763Ebn.LIZIZ(this.LIZIZ);
        }
    }

    public static boolean LJI(C36760Ebk c36760Ebk) {
        if ((System.currentTimeMillis() - c36760Ebk.LJIIIIZZ) - c36760Ebk.LJIIIZ > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC36771Ebv
    public final void LIZJ(AObjectS135S0100000_6 aObjectS135S0100000_6) {
        this.LJ.execute(new ARunnableS25S0200000_6(aObjectS135S0100000_6, this, 26));
    }

    @Override // X.InterfaceC36771Ebv
    public final C36760Ebk LIZLLL(C36758Ebi c36758Ebi) {
        String string;
        Object LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Start to get from cache for ");
        LIZ2.append(c36758Ebi);
        LIZ2.append('.');
        C36762Ebm.LIZJ(X1D.LIZIZ(LIZ2));
        String c36758Ebi2 = c36758Ebi.toString();
        C36760Ebk LIZ3 = this.LIZ.LIZ(c36758Ebi2);
        if (LIZ3 == null) {
            C36762Ebm.LIZJ("Not found in lruCache.");
            InterfaceC36763Ebn interfaceC36763Ebn = this.LIZJ;
            if (interfaceC36763Ebn != null && (string = interfaceC36763Ebn.getString(c36758Ebi2)) != null) {
                try {
                    LIZ = C36757Ebh.LIZ(new JSONObject(string));
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = null;
                }
                C36760Ebk c36760Ebk = (C36760Ebk) LIZ;
                if (c36760Ebk == null || LJI(c36760Ebk)) {
                    C36762Ebm.LIZJ("Found in local storage but expired.");
                    LJIIJ(c36758Ebi);
                } else {
                    C36762Ebm.LIZJ("Found in local storage.");
                    EnumC36761Ebl enumC36761Ebl = EnumC36761Ebl.CACHED;
                    o.LJIIJ(enumC36761Ebl, "<set-?>");
                    c36760Ebk.LIZJ = enumC36761Ebl;
                    LJIIIZ(c36758Ebi, c36760Ebk);
                    return c36760Ebk;
                }
            }
        } else {
            if (!LJI(LIZ3)) {
                C36762Ebm.LIZJ("Found in lruCache.");
                if (LIZ3.LJFF != null) {
                    EnumC36761Ebl enumC36761Ebl2 = EnumC36761Ebl.CACHED;
                    o.LJIIJ(enumC36761Ebl2, "<set-?>");
                    LIZ3.LIZJ = enumC36761Ebl2;
                }
                return LIZ3;
            }
            C36762Ebm.LIZJ("Found in lruCache but expired.");
            LJIIJ(c36758Ebi);
        }
        C36762Ebm.LIZJ("Fallback to normal fetch.");
        return LJII(null, c36758Ebi, -1L, true, true);
    }

    @Override // X.InterfaceC36771Ebv
    public final C36760Ebk LJFF(C36758Ebi c36758Ebi) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Skip Cache to normal fetch for ");
        LIZ.append(c36758Ebi);
        LIZ.append('.');
        C36762Ebm.LIZJ(X1D.LIZIZ(LIZ));
        return LJII(null, c36758Ebi, -1L, true, true);
    }

    public final void LJIIJ(C36758Ebi c36758Ebi) {
        String c36758Ebi2 = c36758Ebi.toString();
        C35980EAe<String, C36760Ebk> c35980EAe = this.LIZ;
        c35980EAe.getClass();
        new C68322mC();
        synchronized (c35980EAe) {
            if (c35980EAe.LIZ.remove(c36758Ebi2) != null) {
                c35980EAe.LIZIZ--;
            }
        }
        InterfaceC36763Ebn interfaceC36763Ebn = this.LIZJ;
        if (interfaceC36763Ebn != null) {
            if (this.LIZIZ.remove(c36758Ebi2)) {
                interfaceC36763Ebn.LIZIZ(this.LIZIZ);
            }
            interfaceC36763Ebn.remove(c36758Ebi2);
        }
    }

    @Override // X.InterfaceC36771Ebv
    public final List LJ(String str, InterfaceC36766Ebq interfaceC36766Ebq) {
        LinkedHashMap linkedHashMap;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Start to get cache by ");
        LIZ.append(str);
        LIZ.append('.');
        C36762Ebm.LIZJ(X1D.LIZIZ(LIZ));
        C35980EAe<String, C36760Ebk> c35980EAe = this.LIZ;
        synchronized (c35980EAe) {
            linkedHashMap = new LinkedHashMap(c35980EAe.LIZ);
        }
        ArrayList arrayList = null;
        for (C36760Ebk c36760Ebk : linkedHashMap.values()) {
            if (o.LJ(str, c36760Ebk.LJI)) {
                if (!LJI(c36760Ebk)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(c36760Ebk.LJII.LIZLLL);
                    LIZ2.append(" found in lruCache.");
                    C36762Ebm.LIZJ(X1D.LIZIZ(LIZ2));
                    if (c36760Ebk.LJFF != null) {
                        EnumC36761Ebl enumC36761Ebl = EnumC36761Ebl.CACHED;
                        o.LJIIJ(enumC36761Ebl, "<set-?>");
                        c36760Ebk.LIZJ = enumC36761Ebl;
                    }
                    c36760Ebk.LIZLLL = c36760Ebk.LJIIIIZZ;
                    c36760Ebk.LIZIZ = interfaceC36766Ebq;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c36760Ebk);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(c36760Ebk.LJII.LIZLLL);
                    LIZ3.append(" found in lruCache but expired.");
                    C36762Ebm.LIZJ(X1D.LIZIZ(LIZ3));
                    LJIIJ(c36760Ebk.LJII);
                }
            }
        }
        return arrayList;
    }

    public final void LJIIIZ(C36758Ebi c36758Ebi, C36760Ebk c36760Ebk) {
        InterfaceC36763Ebn interfaceC36763Ebn;
        JSONObject jSONObject;
        if (c36760Ebk.LJIIIZ <= 0) {
            return;
        }
        String c36758Ebi2 = c36758Ebi.toString();
        this.LIZ.LIZIZ(c36758Ebi2, c36760Ebk);
        if (c36760Ebk.LJFF != null && (interfaceC36763Ebn = this.LIZJ) != null) {
            if (this.LIZIZ.add(c36758Ebi2)) {
                interfaceC36763Ebn.LIZIZ(this.LIZIZ);
            }
            JSONObject put = new JSONObject().put("page_url", c36760Ebk.LJI).put("request", c36760Ebk.LJII.LIZIZ.getValue()).put("timestamp", c36760Ebk.LJIIIIZZ).put("expires", c36760Ebk.LJIIIZ);
            C36754Ebe c36754Ebe = c36760Ebk.LJFF;
            JSONObject jSONObject2 = null;
            if (c36754Ebe != null) {
                JSONObject jSONObject3 = new JSONObject();
                java.util.Map<String, String> map = c36754Ebe.LIZJ;
                if (map != null) {
                    jSONObject = C36748EbY.LIZIZ(map);
                } else {
                    jSONObject = null;
                }
                jSONObject3.put("headers", jSONObject);
                jSONObject3.put("body", c36754Ebe.LIZ());
                jSONObject3.put("status_code", c36754Ebe.LIZLLL);
                java.util.Map<String, String> map2 = c36754Ebe.LJ;
                if (map2 != null) {
                    jSONObject2 = C36748EbY.LIZIZ(map2);
                }
                jSONObject3.put("extra", jSONObject2);
                jSONObject2 = jSONObject3;
            }
            JSONObject put2 = put.put("response", jSONObject2);
            o.LJFF(put2, "JSONObject()\n        .pu…response?.toJSONObject())");
            String jSONObject4 = put2.toString();
            o.LJFF(jSONObject4, "process.toJSONObject().toString()");
            interfaceC36763Ebn.putString(c36758Ebi2, jSONObject4);
        }
    }

    public static SortedMap LJIIIIZZ(SortedMap sortedMap, SortedMap sortedMap2, SortedMap sortedMap3) {
        String str;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : sortedMap3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof C36751Ebb) {
                str = ((AbstractC36750Eba) entry.getValue()).LIZ;
            } else {
                if (!(value instanceof C36752Ebc)) {
                    if (value instanceof C36753Ebd) {
                        if (sortedMap != null) {
                            str = (String) sortedMap.get(((AbstractC36750Eba) entry.getValue()).LIZ);
                        }
                    } else if (sortedMap2 != null) {
                        str = (String) sortedMap2.get(((AbstractC36750Eba) entry.getValue()).LIZ);
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("No param '");
                LIZ.append(((AbstractC36750Eba) entry.getValue()).LIZ);
                LIZ.append("' found.");
                C36762Ebm.LIZJ(X1D.LIZIZ(LIZ));
            }
            if (str != null) {
                Object key = entry.getKey();
                o.LJFF(key, "entry.key");
                treeMap.put(key, str);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Append param: ");
                LIZ2.append((String) entry.getKey());
                LIZ2.append(" = ");
                LIZ2.append(str);
                C36762Ebm.LIZJ(X1D.LIZIZ(LIZ2));
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("No param '");
                LIZ3.append(((AbstractC36750Eba) entry.getValue()).LIZ);
                LIZ3.append("' found.");
                C36762Ebm.LIZJ(X1D.LIZIZ(LIZ3));
            }
        }
        return treeMap;
    }

    public C36756Ebg(InterfaceC36763Ebn interfaceC36763Ebn, InterfaceC36604EYe interfaceC36604EYe, Executor executor, int i) {
        this.LIZJ = interfaceC36763Ebn;
        this.LIZLLL = interfaceC36604EYe;
        this.LJ = executor;
        this.LIZ = new C35980EAe<>(i, new AqS188S0100000_6(this, 8), new AqS188S0100000_6(this, 9));
    }

    @Override // X.InterfaceC36771Ebv
    public final void LIZIZ(String str, SortedMap sortedMap, SortedMap sortedMap2, C36755Ebf config) {
        SortedMap sortedMap3;
        C36760Ebk LIZ;
        boolean LJI;
        o.LJIIJ(config, "config");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Start request: ");
        LIZ2.append(config);
        C36762Ebm.LIZJ(X1D.LIZIZ(LIZ2));
        SortedMap<String, AbstractC36750Eba> sortedMap4 = config.LJ;
        JSONObject jSONObject = null;
        if (sortedMap4 != null) {
            sortedMap3 = LJIIIIZZ(sortedMap, sortedMap2, sortedMap4);
        } else {
            sortedMap3 = null;
        }
        SortedMap<String, AbstractC36750Eba> sortedMap5 = config.LJFF;
        if (sortedMap5 != null) {
            jSONObject = C36748EbY.LIZIZ(LJIIIIZZ(sortedMap, sortedMap2, sortedMap5));
        }
        C36758Ebi c36758Ebi = new C36758Ebi(config.LIZ, config.LIZIZ, config.LIZLLL, sortedMap3, jSONObject, config.LJII, config.LJIIIIZZ);
        String str2 = c36758Ebi.LJ;
        Locale locale = Locale.ROOT;
        o.LJFF(locale, "Locale.ROOT");
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(locale);
            o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (o.LJ(lowerCase, "post") || (LIZ = this.LIZ.LIZ(c36758Ebi.toString())) == null) {
                LJI = true;
            } else {
                LJI = LJI(LIZ);
            }
            LJII(str, c36758Ebi, config.LJI, false, LJI);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C36760Ebk LJII(java.lang.String r21, X.C36758Ebi r22, long r23, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36756Ebg.LJII(java.lang.String, X.Ebi, long, boolean, boolean):X.Ebk");
    }
}
