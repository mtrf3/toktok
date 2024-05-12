package X;

import android.content.Context;
import android.util.LruCache;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import defpackage.a1;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Nu3 */
/* loaded from: classes11.dex */
public final class C60827Nu3 {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C60827Nu3.class), "CACHE_POOL", "getCACHE_POOL()Ljava/util/Map;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
    }

    public static java.util.Map LJ() {
        return (java.util.Map) C58310MuY.LIZ.getValue();
    }

    public static C59886Nes LJFF(String str) {
        return (C59886Nes) LJ().get(C60797NtZ.LIZ(str));
    }

    public static void LJIIL(String biz) {
        LruCache<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> lruCache;
        java.util.Map<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> snapshot;
        o.LJIIJ(biz, "biz");
        C59886Nes c59886Nes = (C59886Nes) LJ().remove(C60797NtZ.LIZ(biz));
        if (c59886Nes != null && (lruCache = c59886Nes.LJI) != null && (snapshot = lruCache.snapshot()) != null) {
            Iterator<Map.Entry<String, LinkedList<SoftReference<InterfaceC60831Nu7>>>> it = snapshot.entrySet().iterator();
            while (it.hasNext()) {
                LinkedList<SoftReference<InterfaceC60831Nu7>> value = it.next().getValue();
                o.LJFF(value, "entry.value");
                Iterator<T> it2 = value.iterator();
                while (it2.hasNext()) {
                    InterfaceC60831Nu7 interfaceC60831Nu7 = (InterfaceC60831Nu7) ((SoftReference) it2.next()).get();
                    if (interfaceC60831Nu7 != null) {
                        interfaceC60831Nu7.release();
                    }
                }
            }
        }
    }

    public static void LIZ(String cacheKey, String biz) {
        boolean z;
        Iterator<Map.Entry<String, LinkedList<SoftReference<InterfaceC60831Nu7>>>> it;
        o.LJIIJ(cacheKey, "cacheKey");
        o.LJIIJ(biz, "biz");
        boolean z2 = false;
        if (biz.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (cacheKey.length() == 0) {
                Iterator it2 = LJ().entrySet().iterator();
                while (it2.hasNext()) {
                    C59886Nes c59886Nes = (C59886Nes) ((Map.Entry) it2.next()).getValue();
                    java.util.Map<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> snapshot = c59886Nes.LJI.snapshot();
                    if (snapshot != null && (it = snapshot.entrySet().iterator()) != null) {
                        while (it.hasNext()) {
                            LinkedList<SoftReference<InterfaceC60831Nu7>> remove = c59886Nes.LJI.remove(it.next().getKey());
                            if (remove != null) {
                                Iterator<SoftReference<InterfaceC60831Nu7>> it3 = remove.iterator();
                                while (it3.hasNext()) {
                                    InterfaceC60831Nu7 interfaceC60831Nu7 = it3.next().get();
                                    if (interfaceC60831Nu7 != null) {
                                        interfaceC60831Nu7.release();
                                    }
                                }
                            }
                        }
                    }
                }
                LJ().clear();
                return;
            }
            return;
        }
        C59886Nes c59886Nes2 = (C59886Nes) LJ().get(C60797NtZ.LIZ(biz));
        if (c59886Nes2 != null) {
            if (cacheKey.length() == 0) {
                z2 = true;
            }
            if (z2) {
                java.util.Map<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> snapshot2 = c59886Nes2.LJI.snapshot();
                if (snapshot2 == null || (r6 = snapshot2.entrySet().iterator()) == null) {
                    return;
                }
                for (Map.Entry<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> entry : snapshot2.entrySet()) {
                    c59886Nes2.LJI.remove(entry.getKey());
                    LinkedList<SoftReference<InterfaceC60831Nu7>> value = entry.getValue();
                    o.LJFF(value, "entry.value");
                    Iterator<T> it4 = value.iterator();
                    while (it4.hasNext()) {
                        InterfaceC60831Nu7 interfaceC60831Nu72 = (InterfaceC60831Nu7) ((SoftReference) it4.next()).get();
                        if (interfaceC60831Nu72 != null) {
                            interfaceC60831Nu72.release();
                        }
                    }
                }
                return;
            }
            if (c59886Nes2.LIZ() == 1) {
                java.util.Map<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> snapshot3 = c59886Nes2.LJI.snapshot();
                if (snapshot3 != null && (r7 = snapshot3.entrySet().iterator()) != null) {
                    for (Map.Entry<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> entry2 : snapshot3.entrySet()) {
                        InterfaceC88471Ynr<? super String, ? super String, Boolean> interfaceC88471Ynr = c59886Nes2.LJFF;
                        String key = entry2.getKey();
                        o.LJFF(key, "entry.key");
                        if (interfaceC88471Ynr.invoke(key, cacheKey).booleanValue()) {
                            c59886Nes2.LJI.remove(entry2.getKey());
                            LinkedList<SoftReference<InterfaceC60831Nu7>> value2 = entry2.getValue();
                            o.LJFF(value2, "entry.value");
                            Iterator<T> it5 = value2.iterator();
                            while (it5.hasNext()) {
                                InterfaceC60831Nu7 interfaceC60831Nu73 = (InterfaceC60831Nu7) ((SoftReference) it5.next()).get();
                                if (interfaceC60831Nu73 != null) {
                                    interfaceC60831Nu73.release();
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            LinkedList<SoftReference<InterfaceC60831Nu7>> remove2 = c59886Nes2.LJI.remove(cacheKey);
            if (remove2 != null) {
                Iterator<SoftReference<InterfaceC60831Nu7>> it6 = remove2.iterator();
                while (it6.hasNext()) {
                    InterfaceC60831Nu7 interfaceC60831Nu74 = it6.next().get();
                    if (interfaceC60831Nu74 != null) {
                        interfaceC60831Nu74.release();
                    }
                }
            }
        }
    }

    public static InterfaceC60831Nu7 LJI(C60737Nsb c60737Nsb, LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        o.LJFF(it, "list.iterator()");
        while (it.hasNext()) {
            InterfaceC60831Nu7 interfaceC60831Nu7 = (InterfaceC60831Nu7) ((SoftReference) it.next()).get();
            if (interfaceC60831Nu7 != null) {
                if (!C60806Nti.LIZ(interfaceC60831Nu7.getHybridContext(), c60737Nsb)) {
                    C39048FUe.LIZIZ.LIZ("the theme of preloaded view is inconsistent", EnumC39866Fkk.E, "PreloadTool");
                } else {
                    it.remove();
                    return interfaceC60831Nu7;
                }
            }
        }
        return null;
    }

    public static void LJIIJJI(C59886Nes c59886Nes, Boolean bool) {
        String str;
        if (c59886Nes.LIZ() == 1) {
            if (((ALE) c59886Nes).LJIIIZ) {
                LJ().put(C60797NtZ.LIZ(c59886Nes.LIZ), c59886Nes);
            }
        } else {
            LJ().put(C60797NtZ.LIZ(c59886Nes.LIZ), c59886Nes);
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            str = "jsb";
        } else {
            str = "native";
        }
        FD5.LJIIIZ(null, "container_prerender", "config", str, null, null, C60797NtZ.LIZ(c59886Nes.LIZ), null, 177);
    }

    public static InterfaceC60833Nu9 LIZIZ(C60827Nu3 c60827Nu3, Context context, String schema, String biz) {
        c60827Nu3.getClass();
        o.LJIIJ(schema, "schema");
        o.LJIIJ(biz, "biz");
        return (InterfaceC60833Nu9) LIZJ(context, schema, biz, null, null);
    }

    public final void LJII(String schema, String biz, C60737Nsb c60737Nsb, C61491OBj c61491OBj) {
        o.LJIIJ(schema, "schema");
        o.LJIIJ(biz, "biz");
        LJIIJ(this, schema, biz, c60737Nsb, c61491OBj, false, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC60831Nu7 LIZJ(Context context, String cacheKey, String biz, C61491OBj c61491OBj, C60737Nsb c60737Nsb) {
        long j;
        InterfaceC60831Nu7 interfaceC60831Nu7;
        long j2;
        o.LJIIJ(context, "context");
        o.LJIIJ(cacheKey, "cacheKey");
        o.LJIIJ(biz, "biz");
        C39836FkG.LJII.getClass();
        if (C38262Ezy.LIZ().LJFF.LIZ == EnumC35622DyU.WHEN_FETCH) {
            Iterator it = LJ().entrySet().iterator();
            while (it.hasNext()) {
                C59886Nes c59886Nes = (C59886Nes) ((Map.Entry) it.next()).getValue();
                if (c59886Nes.LIZ() == 1) {
                    if (((ALE) c59886Nes).LJIIJJI != -1) {
                        java.util.Map<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> snapshot = c59886Nes.LJI.snapshot();
                        o.LJFF(snapshot, "bizPreloadInfo.cachedInstances.snapshot()");
                        Iterator<Map.Entry<String, LinkedList<SoftReference<InterfaceC60831Nu7>>>> it2 = snapshot.entrySet().iterator();
                        while (it2.hasNext()) {
                            Iterator<SoftReference<InterfaceC60831Nu7>> it3 = it2.next().getValue().iterator();
                            o.LJFF(it3, "entry.value.iterator()");
                            while (it3.hasNext()) {
                                SoftReference<InterfaceC60831Nu7> next = it3.next();
                                o.LJFF(next, "cacheInstancesIterator.next()");
                                SoftReference<InterfaceC60831Nu7> softReference = next;
                                long currentTimeMillis = System.currentTimeMillis();
                                InterfaceC60831Nu7 interfaceC60831Nu72 = softReference.get();
                                if (interfaceC60831Nu72 != null) {
                                    j2 = interfaceC60831Nu72.getViewCreatedTime();
                                } else {
                                    j2 = 0;
                                }
                                if (currentTimeMillis - j2 >= r11.LJIIJJI * 1000) {
                                    InterfaceC60831Nu7 interfaceC60831Nu73 = softReference.get();
                                    if (interfaceC60831Nu73 != null) {
                                        interfaceC60831Nu73.release();
                                    }
                                    it3.remove();
                                }
                            }
                        }
                    }
                }
            }
        }
        LJ().containsKey(C60797NtZ.LIZ(biz));
        C59886Nes c59886Nes2 = (C59886Nes) LJ().get(C60797NtZ.LIZ(biz));
        if (c59886Nes2 != null) {
            java.util.Map<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> snapshot2 = c59886Nes2.LJI.snapshot();
            o.LJFF(snapshot2, "bizPreloadInfo.cachedInstances.snapshot()");
            InterfaceC60831Nu7 interfaceC60831Nu74 = null;
            for (Map.Entry<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> entry : snapshot2.entrySet()) {
                InterfaceC88471Ynr<? super String, ? super String, Boolean> interfaceC88471Ynr = c59886Nes2.LJFF;
                String key = entry.getKey();
                o.LJFF(key, "entry.key");
                if (interfaceC88471Ynr.invoke(cacheKey, key).booleanValue()) {
                    int LIZ2 = c59886Nes2.LIZ();
                    if (LIZ2 != 0) {
                        if (LIZ2 != 1) {
                            continue;
                        } else {
                            ALE ale = (ALE) c59886Nes2;
                            if (entry.getValue().size() > 0) {
                                C39836FkG.LJII.getClass();
                                if (C38262Ezy.LIZ().LJFF.LIZ == EnumC35622DyU.WHEN_MATCH_VIEW && ale.LJIIJJI != -1) {
                                    while (entry.getValue().size() > 0) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        LinkedList<SoftReference<InterfaceC60831Nu7>> value = entry.getValue();
                                        o.LJFF(value, "entry.value");
                                        InterfaceC60831Nu7 interfaceC60831Nu75 = (InterfaceC60831Nu7) ((SoftReference) ORZ.LJLLJ(value)).get();
                                        if (interfaceC60831Nu75 != null) {
                                            j = interfaceC60831Nu75.getViewCreatedTime();
                                        } else {
                                            j = 0;
                                        }
                                        if (currentTimeMillis2 - j < ale.LJIIJJI * 1000) {
                                            break;
                                        }
                                        SoftReference<InterfaceC60831Nu7> removeFirst = entry.getValue().removeFirst();
                                        if (removeFirst != null && (interfaceC60831Nu7 = removeFirst.get()) != null) {
                                            interfaceC60831Nu7.release();
                                        }
                                    }
                                }
                                if (entry.getValue().size() > 0) {
                                    C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
                                    LinkedList<SoftReference<InterfaceC60831Nu7>> value2 = entry.getValue();
                                    o.LJFF(value2, "entry.value");
                                    c60827Nu3.getClass();
                                    InterfaceC60831Nu7 LJI = LJI(c60737Nsb, value2);
                                    interfaceC60831Nu74 = LJI;
                                    if (LJI != null) {
                                        LJI.setOptimization(2);
                                        interfaceC60831Nu74 = LJI;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        if (entry.getValue().size() == 0) {
                            return interfaceC60831Nu74;
                        }
                        if (c59886Nes2.LIZLLL) {
                            C39048FUe c39048FUe = C39048FUe.LIZIZ;
                            c39048FUe.LIZ("keepAliveWhenUsed is " + c59886Nes2.LIZLLL + ", we will not delete view if it is fetched", EnumC39866Fkk.D, "PreloadTool");
                            LinkedList<SoftReference<InterfaceC60831Nu7>> value3 = entry.getValue();
                            o.LJFF(value3, "entry.value");
                            InterfaceC60831Nu7 interfaceC60831Nu76 = value3.getFirst().get();
                            if (interfaceC60831Nu76 != 0) {
                                if (((View) interfaceC60831Nu76).getParent() == null) {
                                    C58310MuY.LIZIZ.getClass();
                                    boolean LIZ3 = C60806Nti.LIZ(interfaceC60831Nu76.getHybridContext(), c60737Nsb);
                                    interfaceC60831Nu74 = interfaceC60831Nu76;
                                    if (!LIZ3) {
                                        c39048FUe.LIZ("the theme of preloaded view is inconsistent", EnumC39866Fkk.E, "PreloadTool");
                                    }
                                }
                                interfaceC60831Nu74 = null;
                            } else {
                                throw new C37692Eqm("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            C60827Nu3 c60827Nu32 = C58310MuY.LIZIZ;
                            LinkedList<SoftReference<InterfaceC60831Nu7>> value4 = entry.getValue();
                            o.LJFF(value4, "entry.value");
                            c60827Nu32.getClass();
                            interfaceC60831Nu74 = LJI(c60737Nsb, value4);
                        }
                    }
                    if (interfaceC60831Nu74 != null) {
                        C60797NtZ.LIZIZ(interfaceC60831Nu74, context);
                        interfaceC60831Nu74.LIZJ(context, c60737Nsb);
                        FD5.LJIIIZ(null, "container_prerender", "use", null, cacheKey, biz, C60797NtZ.LIZ(biz), null, 137);
                        return interfaceC60831Nu74;
                    }
                }
            }
            return interfaceC60831Nu74;
        }
        return null;
    }

    public static /* synthetic */ InterfaceC60831Nu7 LIZLLL(C60827Nu3 c60827Nu3, Context context, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        c60827Nu3.getClass();
        return LIZJ(context, str, str2, null, null);
    }

    public static /* synthetic */ void LJIIIIZZ(C60827Nu3 c60827Nu3, String str, String str2, SparkContext sparkContext, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            sparkContext = null;
        }
        c60827Nu3.LJII(str, str2, sparkContext, null);
    }

    public static void LJIIIZ(String cacheKey, String biz, C60737Nsb c60737Nsb, C61491OBj c61491OBj, boolean z, Boolean bool) {
        boolean z2;
        o.LJIIJ(cacheKey, "cacheKey");
        o.LJIIJ(biz, "biz");
        if (biz.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C39048FUe.LIZIZ.LIZ(a1.LJ("preloadNG biz = ", biz, " must not empty"), EnumC39866Fkk.E, "PreloadTool");
            return;
        }
        if (cacheKey.length() == 0) {
            C39048FUe.LIZIZ.LIZ(a1.LJ("preloadNG cacheKey = ", cacheKey, " must not empty"), EnumC39866Fkk.W, "PreloadTool");
            return;
        }
        if (!LJ().containsKey(C60797NtZ.LIZ(biz))) {
            C39048FUe.LIZIZ.LIZ("biz not register preloadInfo", EnumC39866Fkk.D, "PreloadTool");
            if (c61491OBj != null) {
                c61491OBj.LJL(cacheKey, biz, c60737Nsb, new C30941Ji("biz not register preloadInfo"));
                return;
            }
            return;
        }
        C60826Nu2 c60826Nu2 = new C60826Nu2(biz, cacheKey, c61491OBj, c60737Nsb, bool);
        if (!z) {
            C60882Nuw.LIZ(c60826Nu2);
        } else {
            c60826Nu2.invoke();
        }
    }

    public static /* synthetic */ void LJIIJ(C60827Nu3 c60827Nu3, String str, String str2, C60737Nsb c60737Nsb, C61491OBj c61491OBj, boolean z, int i) {
        boolean z2 = z;
        C61491OBj c61491OBj2 = c61491OBj;
        String str3 = str2;
        C60737Nsb c60737Nsb2 = c60737Nsb;
        if ((i & 2) != 0) {
            str3 = "";
        }
        Boolean bool = null;
        if ((i & 4) != 0) {
            c60737Nsb2 = null;
        }
        if ((i & 8) != 0) {
            c61491OBj2 = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            bool = Boolean.FALSE;
        }
        c60827Nu3.getClass();
        LJIIIZ(str, str3, c60737Nsb2, c61491OBj2, z2, bool);
    }
}
