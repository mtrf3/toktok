package X;

import Y.ARunnableS0S3100000_6;
import Y.ARunnableS1S2100000_6;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS6S2200000_6;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FGo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38694FGo {
    public final Context LIZ;
    public final TTL LIZIZ;
    public final java.util.Set<String> LIZJ;
    public java.util.Set<String> LJ;
    public final java.util.Set<String> LJFF;
    public String LJI;
    public String LJII;
    public java.util.Map<String, String> LJIIIIZZ;
    public final java.util.Set<String> LIZLLL = new ConcurrentSkipListSet();
    public final java.util.Map<String, java.util.Map<String, String>> LJIIIZ = new ConcurrentHashMap();
    public final List<String> LJIIJ = new CopyOnWriteArrayList();

    public final void LIZJ() {
        String vids;
        boolean z;
        String str;
        if (((ConcurrentSkipListSet) this.LIZJ).isEmpty() && ((ConcurrentSkipListSet) this.LJ).isEmpty() && ((ConcurrentSkipListSet) this.LIZLLL).isEmpty() && this.LJFF.isEmpty()) {
            vids = null;
        } else {
            java.util.Set[] setArr = {this.LIZJ, this.LJ, this.LIZLLL, this.LJFF};
            StringBuilder sb = new StringBuilder();
            int i = 0;
            boolean z2 = true;
            do {
                java.util.Set set = setArr[i];
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (z2) {
                            z2 = false;
                        } else {
                            sb.append(',');
                        }
                        sb.append((String) it.next());
                    }
                }
                i++;
            } while (i < 4);
            vids = sb.toString();
        }
        if (!TextUtils.equals(vids, this.LJII)) {
            this.LJII = vids;
            if (this.LIZIZ != null) {
                FH1.LJI.getClass();
                o.LJIIJ(vids, "vids");
                if (vids.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    List LJLJJL = s.LJLJJL(vids, new String[]{","}, 0, 6);
                    FHP fhp = FH1.LIZIZ;
                    Object[] array = LJLJJL.toArray(new String[0]);
                    if (array != null) {
                        fhp.LJIIIZ("__client_exp_vids", (String[]) array);
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    FH1.LIZIZ.LJIIIZ("__client_exp_vids", new String[0]);
                }
                String LJ = FH1.LJ();
                if (!C67612l3.LIZIZ.get()) {
                    str = C67652l7.LIZ(LJ);
                } else {
                    str = LJ;
                }
                AppLog.setAbSDKVersion(str);
                List value = Arrays.asList(LJ.split(","));
                o.LJIIJ(value, "value");
                ArrayList arrayList = new ArrayList();
                for (Object obj : value) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                C38697FGr.LIZ = arrayList;
                C40048Fng.LIZIZ(null, "vids_count", null, C51029K0z.LJJIIZI(new OSZ("vids_count", Integer.valueOf(((ArrayList) C38697FGr.LIZ).size()))));
            }
        }
    }

    public final void LIZ(String str, List<String> list) {
        java.util.Map map = (java.util.Map) ((ConcurrentHashMap) this.LJIIIZ).get(str);
        for (String str2 : map.keySet()) {
            if (!list.contains(str2)) {
                try {
                    ((ConcurrentSkipListSet) this.LIZLLL).remove(map.get(str2));
                    map.remove(str2);
                    Context context = this.LIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SP_CLIENT_EXPOSURE_CACHE$$$");
                    LIZ.append(str);
                    C38696FGq.LIZ(new ARunnableS1S2100000_6(context, X1D.LIZIZ(LIZ), str2, 4));
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C38694FGo(Context context, TTL ttl, java.util.Set<String> set) {
        this.LIZ = context;
        this.LIZIZ = ttl;
        this.LJFF = set;
        this.LJI = C38693FGn.LIZJ(context, "SP_EXPERIMENT_CACHE").getString("ab_test_current_uid", "");
        this.LIZJ = C38693FGn.LIZLLL(context, "SP_EXPERIMENT_EXPOSURE_CACHE");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SP_EXPERIMENT_EXPOSURE_CACHE_");
        LIZ.append(this.LJI);
        this.LJ = C38693FGn.LIZLLL(context, X1D.LIZIZ(LIZ));
        this.LJIIIIZZ = C38693FGn.LIZIZ(context, "SP_EXPERIMENT_EXPOSURE_CACHE");
        Iterator it = ((ConcurrentSkipListSet) C38693FGn.LIZLLL(context, "SP_CLIENT_EXPOSURE_CACHE")).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SP_CLIENT_EXPOSURE_CACHE$$$");
            LIZ2.append(str);
            java.util.Map<String, String> LIZIZ = C38693FGn.LIZIZ(context, X1D.LIZIZ(LIZ2));
            ((ConcurrentHashMap) this.LJIIIZ).put(str, LIZIZ);
            this.LIZLLL.addAll(((ConcurrentHashMap) LIZIZ).values());
        }
        LIZJ();
        C38696FGq.LIZ.schedule(new ARunnableS42S0100000_6(this, 111), 5000L, TimeUnit.MILLISECONDS);
    }

    public final <T> void LIZIZ(String str, EYS<T> eys, String str2) {
        if (eys == null) {
            return;
        }
        String str3 = eys.LIZLLL;
        if (!((ConcurrentHashMap) this.LJIIIZ).containsKey(str3)) {
            ((ConcurrentHashMap) this.LJIIIZ).put(str3, new ConcurrentHashMap());
            C38696FGq.LIZ(new ARunnableS6S2200000_6(this.LIZ, "SP_CLIENT_EXPOSURE_CACHE", ((ConcurrentHashMap) this.LJIIIZ).keySet(), 1));
        }
        String[] strArr = eys.LJ;
        if (strArr != null) {
            LIZ(str3, Arrays.asList(strArr));
        } else {
            ((CopyOnWriteArrayList) this.LJIIJ).add(str);
        }
        java.util.Map map = (java.util.Map) ((ConcurrentHashMap) this.LJIIIZ).get(str3);
        String str4 = (String) map.get(str);
        if (!TextUtils.equals(str4, str2)) {
            if (!TextUtils.isEmpty(str4)) {
                ((ConcurrentSkipListSet) this.LIZLLL).remove(str4);
                map.remove(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                ((ConcurrentSkipListSet) this.LIZLLL).add(str2);
                map.put(str, str2);
            }
            C38696FGq.LIZ(new ARunnableS0S3100000_6(this.LIZ, str2, i0.LJFF("SP_CLIENT_EXPOSURE_CACHE$$$", str3), str, 1));
            LIZJ();
        }
    }
}
