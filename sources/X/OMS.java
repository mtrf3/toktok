package X;

import android.util.LruCache;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OMS {
    public static final Keva LIZ = Keva.getRepo("repo_multi_survey");
    public static final HashSet<String> LIZIZ = new HashSet<>();
    public static final LruCache<String, Long> LIZJ = new LruCache<>(64);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(OMY.LJLIL);
    public static final ONJ LJ = new ONJ("Frequency");
    public static final HashSet<String> LJFF = new HashSet<>();

    public static List LIZIZ() {
        List LIZ2 = OBO.LIZ();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LIZ2).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            OMV omv = (OMV) next;
            int i = OBO.LIZJ;
            if (i >= omv.LJ && i <= omv.LJFF) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((OMV) it2.next()).LIZLLL);
        }
        C51653KOz LJLIIIL = ORZ.LJLIIIL(arrayList2);
        ArrayList<OMV> arrayList3 = OBO.LJ;
        ArrayList arrayList4 = new ArrayList();
        Iterator<OMV> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            OMV next2 = it3.next();
            OMV omv2 = next2;
            if (omv2.LIZIZ <= 0 || omv2.LIZ < 0) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((OMV) it4.next()).LIZLLL);
        }
        List LJJIJLIJ = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJZ(OJ4.LJJJJ(OJ4.LJJJLZIJ(LJLIIIL, arrayList5), OMT.LJLIL), OMX.LJLIL)));
        LJ.LJIIJ(new AqS158S0100000_8(LJJIJLIJ, (List<String>) 628));
        return LJJIJLIJ;
    }

    public static long LIZ(String str) {
        LruCache<String, Long> lruCache = LIZJ;
        Long l = lruCache.get(str);
        if (l != null) {
            return l.longValue();
        }
        long j = LIZ.getLong(str, 0L);
        lruCache.put(str, Long.valueOf(j));
        return j;
    }

    public static String LIZJ(Aweme aweme) {
        return i0.LJFF("short_internal_", String.valueOf(C79081V1x.LJIILLIIL(aweme).getType()));
    }

    public static boolean LIZLLL(String str) {
        HashSet<String> hashSet = LIZIZ;
        if (hashSet.contains(str)) {
            ONJ onj = LJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("has submit: ");
            LIZ2.append(hashSet);
            onj.LJIIIIZZ(X1D.LIZIZ(LIZ2));
            return true;
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        String str;
        boolean z;
        boolean z2;
        ((ISurveyDebuggerService) LIZLLL.getValue()).isOpen();
        long currentTimeMillis = System.currentTimeMillis();
        if (aweme == null || (str = aweme.getMainSurveyKey()) == null) {
            str = "";
        }
        boolean z3 = false;
        if (LIZ(str) > currentTimeMillis) {
            z = true;
        } else {
            z = false;
        }
        if (LIZ(LIZJ(aweme)) > currentTimeMillis) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            z3 = true;
        }
        ONJ onj = LJ;
        StringBuilder LIZLLL2 = C00F.LIZLLL("[inFrequencyControl]: ", z3, ", long:", z, ", short:");
        LIZLLL2.append(z2);
        onj.LJII(aweme, X1D.LIZIZ(LIZLLL2));
        return z3;
    }

    public static void LJFF(String str) {
        LIZIZ.add(str);
        ONJ onj = LJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("record submit: ");
        LIZ2.append(str);
        onj.LJIIIIZZ(X1D.LIZIZ(LIZ2));
    }

    public static void LJII(Aweme aweme) {
        String str;
        OMW LIZLLL2 = OMU.LIZLLL(aweme);
        if (LIZLLL2 == null) {
            return;
        }
        long j = LIZLLL2.LJFF;
        long currentTimeMillis = System.currentTimeMillis();
        if (j != 0) {
            if (aweme == null || (str = aweme.getMainSurveyKey()) == null) {
                str = "";
            }
            String LIZJ2 = LIZJ(aweme);
            LJ.LJII(aweme, C0ON.LIZJ("[setNextTime] longKey:", str, ", shortKey:", LIZJ2));
            LJI((j * 1000) + currentTimeMillis, str);
            LJI(currentTimeMillis + 600000, LIZJ2);
            java.util.Map<String, Long> map = LIZLLL2.LJI;
            if (map == null) {
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                String key = entry.getKey();
                long longValue = entry.getValue().longValue();
                ONJ onj = LJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[setRelationNextTime] key:");
                LIZ2.append(key);
                LIZ2.append(", interval:");
                LIZ2.append(longValue);
                onj.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                LJI((longValue * 1000) + currentTimeMillis2, key);
            }
        }
    }

    public static void LJI(long j, String key) {
        o.LJIIIZ(key, "key");
        long max = Math.max(j, LIZ(key));
        LIZ.storeLong(key, max);
        LIZJ.put(key, Long.valueOf(max));
    }
}
