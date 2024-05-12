package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes12.dex */
public final class R2K {
    public final String LIZ;
    public int LIZIZ;
    public List<String> LIZJ = new ArrayList();
    public List<String> LIZLLL = new ArrayList();
    public List<String> LJ = new ArrayList();
    public final java.util.Map<Integer, List<String>> LJFF = new HashMap();
    public final java.util.Map<Integer, List<String>> LJI = new HashMap();
    public final java.util.Map<Integer, List<String>> LJII = new HashMap();
    public final ReentrantLock LJIIIIZZ = new ReentrantLock();
    public int LJIIIZ;

    public final List<String> LIZ() {
        this.LJIIIIZZ.lock();
        ArrayList arrayList = new ArrayList();
        List<String> list = this.LIZJ;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(this.LIZJ);
        }
        List<String> list2 = this.LJ;
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(this.LJ);
        }
        List<String> list3 = this.LIZLLL;
        if (list3 != null && !list3.isEmpty()) {
            arrayList.addAll(this.LIZLLL);
        }
        this.LJIIIIZZ.unlock();
        return arrayList;
    }

    public static boolean LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return PatternProtector.compile("(^((([0-9A-Fa-f]{1,4}:){7}(([0-9A-Fa-f]{1,4}){1}|:))|(([0-9A-Fa-f]{1,4}:){6}((:[0-9A-Fa-f]{1,4}){1}|((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){5}((:[0-9A-Fa-f]{1,4}){1,2}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){4}((:[0-9A-Fa-f]{1,4}){1,3}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){3}((:[0-9A-Fa-f]{1,4}){1,4}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){2}((:[0-9A-Fa-f]{1,4}){1,5}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){1}((:[0-9A-Fa-f]{1,4}){1,6}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(:((:[0-9A-Fa-f]{1,4}){1,7}|(:[fF]{4}){0,1}:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:)))$)").matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).matches();
    }

    public final String LJ(boolean z) {
        this.LJIIIIZZ.lock();
        if (DnsOptimizer.LJFF().LJJIJL == 4 && C79346VCc.LIZLLL().LJIIL.LIZLLL.mForbidUseIpv6InWiFi == 1) {
            for (String str : this.LIZJ) {
                if (!LIZLLL(str)) {
                    this.LJIIIIZZ.unlock();
                    return str;
                }
            }
            for (String str2 : this.LJ) {
                if (!LIZLLL(str2)) {
                    this.LJIIIIZZ.unlock();
                    return str2;
                }
            }
            for (String str3 : this.LIZLLL) {
                if (!LIZLLL(str3)) {
                    this.LJIIIIZZ.unlock();
                    return str3;
                }
            }
        }
        List<String> list = this.LIZJ;
        if (list != null && !list.isEmpty()) {
            String str4 = (String) ListProtector.get(this.LIZJ, 0);
            this.LJIIIIZZ.unlock();
            return str4;
        }
        List<String> list2 = this.LJ;
        if (list2 != null && !list2.isEmpty()) {
            String str5 = (String) ListProtector.get(this.LJ, 0);
            this.LJIIIIZZ.unlock();
            return str5;
        }
        List<String> list3 = this.LIZLLL;
        if (list3 != null && !list3.isEmpty()) {
            for (String str6 : this.LIZLLL) {
                if (LIZLLL(str6)) {
                    if (z) {
                        this.LJIIIIZZ.unlock();
                        return str6;
                    }
                } else if (!z) {
                    this.LJIIIIZZ.unlock();
                    return str6;
                }
            }
            String str7 = (String) ListProtector.get(this.LIZLLL, 0);
            this.LJIIIIZZ.unlock();
            return str7;
        }
        this.LJIIIIZZ.unlock();
        return null;
    }

    public final void LJII(List list) {
        this.LJIIIIZZ.lock();
        this.LIZLLL = list;
        if (list == null || list.isEmpty()) {
            this.LJIIIZ = 0;
        } else {
            this.LJIIIZ = 1;
        }
        this.LJIIIIZZ.unlock();
    }

    public R2K(String str, int i) {
        new ArrayList(10);
        new ArrayList();
        this.LJIIIZ = -1;
        this.LIZ = str;
        new Random(System.currentTimeMillis());
        this.LIZIZ = i;
    }

    public final List<String> LIZIZ(int i, int i2) {
        java.util.Map<Integer, List<String>> map;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 || (map = this.LJI) == null) {
                    return null;
                }
                if (!((HashMap) map).containsKey(Integer.valueOf(i))) {
                    return null;
                }
                return (List) ((HashMap) this.LJI).get(Integer.valueOf(i));
            }
            java.util.Map<Integer, List<String>> map2 = this.LJII;
            if (map2 == null) {
                return null;
            }
            if (!((HashMap) map2).containsKey(Integer.valueOf(i))) {
                return null;
            }
            return (List) ((HashMap) this.LJII).get(Integer.valueOf(i));
        }
        java.util.Map<Integer, List<String>> map3 = this.LJFF;
        if (map3 == null) {
            return null;
        }
        if (!((HashMap) map3).containsKey(Integer.valueOf(i))) {
            return null;
        }
        return (List) ((HashMap) this.LJFF).get(Integer.valueOf(i));
    }

    public final String LJFF(int i, boolean z) {
        this.LJIIIIZZ.lock();
        if (i == 4 && C79346VCc.LIZLLL().LJIIL.LIZLLL.mForbidUseIpv6InWiFi == 1) {
            for (String str : LIZIZ(i, 1)) {
                if (!LIZLLL(str)) {
                    this.LJIIIIZZ.unlock();
                    return str;
                }
            }
            for (String str2 : LIZIZ(i, 2)) {
                if (!LIZLLL(str2)) {
                    this.LJIIIIZZ.unlock();
                    return str2;
                }
            }
            for (String str3 : LIZIZ(i, 3)) {
                if (!LIZLLL(str3)) {
                    this.LJIIIIZZ.unlock();
                    return str3;
                }
            }
        }
        List<String> LIZIZ = LIZIZ(i, 1);
        if (LIZIZ != null && LIZIZ.size() > 0) {
            String str4 = (String) ListProtector.get(LIZIZ, 0);
            this.LJIIIIZZ.unlock();
            return str4;
        }
        List<String> LIZIZ2 = LIZIZ(i, 2);
        if (LIZIZ2 != null && LIZIZ2.size() > 0) {
            String str5 = (String) ListProtector.get(LIZIZ2, 0);
            this.LJIIIIZZ.unlock();
            return str5;
        }
        List<String> LIZIZ3 = LIZIZ(i, 3);
        if (LIZIZ3 != null && LIZIZ3.size() > 0) {
            for (String str6 : LIZIZ3) {
                if (LIZLLL(str6)) {
                    if (z) {
                        this.LJIIIIZZ.unlock();
                        return str6;
                    }
                } else if (!z) {
                    this.LJIIIIZZ.unlock();
                    return str6;
                }
            }
            String str7 = (String) ListProtector.get(LIZIZ3, 0);
            this.LJIIIIZZ.unlock();
            return str7;
        }
        this.LJIIIIZZ.unlock();
        return null;
    }

    public final void LJI(int i, int i2, List list) {
        java.util.Map<Integer, List<String>> map;
        this.LJIIIIZZ.lock();
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (map = this.LJI) != null) {
                    ((HashMap) map).put(Integer.valueOf(i2), list);
                }
            } else {
                java.util.Map<Integer, List<String>> map2 = this.LJII;
                if (map2 != null) {
                    ((HashMap) map2).put(Integer.valueOf(i2), list);
                }
            }
        } else {
            java.util.Map<Integer, List<String>> map3 = this.LJFF;
            if (map3 != null) {
                ((HashMap) map3).put(Integer.valueOf(i2), list);
            }
        }
        this.LJIIIIZZ.unlock();
    }

    public static void LIZJ(int i, int i2, List list, List list2, java.util.Set set, int i3) {
        boolean LIZLLL;
        ArrayList arrayList = (ArrayList) list2;
        int size = arrayList.size();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (i4 >= i3 || size >= i2) {
                    return;
                }
                if (i != 0) {
                    if (i == 1 && !TextUtils.isEmpty(str)) {
                        LIZLLL = PatternProtector.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).matches();
                    }
                } else {
                    LIZLLL = LIZLLL(str);
                    str = C78920UyC.LIZ('[', str, ']');
                }
                if (LIZLLL) {
                    HashSet hashSet = (HashSet) set;
                    if (!hashSet.contains(str)) {
                        arrayList.add(str);
                        hashSet.add(str);
                        size++;
                        i4++;
                    }
                }
            }
        }
    }
}
