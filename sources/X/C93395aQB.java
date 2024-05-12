package X;

import X.InterfaceC191727fk;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.aQB, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93395aQB<T extends InterfaceC191727fk> extends AbstractC93365aPh<T> {
    public static final C93359aPb LJ = new C93359aPb(1.0d);
    public final int LIZIZ = 80;
    public final Collection<C93366aPi<T>> LIZJ = new LinkedHashSet();
    public final C93361aPd<C93366aPi<T>> LIZLLL = new C93361aPd<>(new C93357aPZ(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d), 0);

    @Override // X.InterfaceC93348aPQ
    public final void LIZLLL() {
        synchronized (this.LIZLLL) {
            this.LIZJ.clear();
            C93361aPd<C93366aPi<T>> c93361aPd = this.LIZLLL;
            c93361aPd.LIZLLL = null;
            java.util.Set<C93366aPi<T>> set = c93361aPd.LIZJ;
            if (set != null) {
                set.clear();
            }
        }
    }

    @Override // X.InterfaceC93348aPQ
    public final Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.LIZLLL) {
            Iterator<C93366aPi<T>> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(it.next().LIZ);
            }
        }
        return linkedHashSet;
    }

    @Override // X.InterfaceC93348aPQ
    public final int LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC93348aPQ
    public final boolean LIZIZ(Collection<T> collection) {
        boolean add;
        Iterator<T> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C93366aPi<T> c93366aPi = new C93366aPi<>(it.next());
            synchronized (this.LIZLLL) {
                add = this.LIZJ.add(c93366aPi);
                if (add) {
                    C93361aPd<C93366aPi<T>> c93361aPd = this.LIZLLL;
                    c93361aPd.getClass();
                    C93394aQA c93394aQA = c93366aPi.LIZIZ;
                    C93357aPZ c93357aPZ = c93361aPd.LIZ;
                    double d = c93394aQA.LIZ;
                    double d2 = c93394aQA.LIZIZ;
                    if (c93357aPZ.LIZ <= d && d <= c93357aPZ.LIZJ && c93357aPZ.LIZIZ <= d2 && d2 <= c93357aPZ.LIZLLL) {
                        c93361aPd.LIZ(d, d2, c93366aPi);
                    }
                }
            }
            if (add) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC93348aPQ
    public final java.util.Set<? extends InterfaceC199697sb<T>> LJFF(float f) {
        C93357aPZ c93357aPZ;
        double intValue;
        int i = (int) f;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.LIZLLL) {
            try {
                for (C93366aPi<T> c93366aPi : this.LIZJ) {
                    if (!hashSet.contains(c93366aPi)) {
                        OSZ<Integer, Integer> LIZ = c93366aPi.LIZ.LIZ();
                        if (LIZ != null && LIZ.getFirst().intValue() != 0 && LIZ.getSecond().intValue() != 0) {
                            double d = i;
                            try {
                                intValue = (LIZ.getFirst().intValue() / Math.pow(2.0d, d)) / 256.0d;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                throw th;
                            }
                            try {
                                double intValue2 = (LIZ.getSecond().intValue() / Math.pow(2.0d, d)) / 256.0d;
                                C93394aQA c93394aQA = c93366aPi.LIZIZ;
                                double d2 = intValue / 2.0d;
                                double d3 = intValue2 / 2.0d;
                                double d4 = c93394aQA.LIZ;
                                double d5 = d4 - d2;
                                double d6 = d2 + d4;
                                double d7 = c93394aQA.LIZIZ;
                                c93357aPZ = new C93357aPZ(d5, d6, d7 - d3, d7 + d3);
                            } catch (Throwable th3) {
                                th = th3;
                                while (true) {
                                    break;
                                    break;
                                }
                                throw th;
                            }
                        } else {
                            double pow = (this.LIZIZ / Math.pow(2.0d, i)) / 256.0d;
                            C93394aQA c93394aQA2 = c93366aPi.LIZIZ;
                            double d8 = pow / 2.0d;
                            double d9 = c93394aQA2.LIZ;
                            double d10 = d9 - d8;
                            double d11 = d8 + d9;
                            double d12 = c93394aQA2.LIZIZ;
                            c93357aPZ = new C93357aPZ(d10, d11, d12 - d8, d12 + d8);
                        }
                        C93361aPd<C93366aPi<T>> c93361aPd = this.LIZLLL;
                        c93361aPd.getClass();
                        ArrayList arrayList = new ArrayList();
                        c93361aPd.LIZIZ(c93357aPZ, arrayList);
                        if (arrayList.size() == 1) {
                            hashSet2.add(c93366aPi);
                            hashSet.add(c93366aPi);
                            hashMap.put(c93366aPi, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
                        } else {
                            C93368aPk c93368aPk = new C93368aPk(c93366aPi.LIZ.getPosition());
                            hashSet2.add(c93368aPk);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C93366aPi c93366aPi2 = (C93366aPi) it.next();
                                Double d13 = (Double) hashMap.get(c93366aPi2);
                                C93394aQA c93394aQA3 = c93366aPi2.LIZIZ;
                                C93394aQA c93394aQA4 = c93366aPi.LIZIZ;
                                double d14 = c93394aQA3.LIZ - c93394aQA4.LIZ;
                                double d15 = c93394aQA3.LIZIZ - c93394aQA4.LIZIZ;
                                double d16 = (d14 * d14) + (d15 * d15);
                                if (d13 != null) {
                                    if (d13.doubleValue() >= d16) {
                                        ((C93368aPk) hashMap2.get(c93366aPi2)).LIZIZ.remove(c93366aPi2.LIZ);
                                    }
                                }
                                hashMap.put(c93366aPi2, Double.valueOf(d16));
                                c93368aPk.LIZIZ.add(c93366aPi2.LIZ);
                                hashMap2.put(c93366aPi2, c93368aPk);
                            }
                            hashSet.addAll(arrayList);
                        }
                    }
                }
                return hashSet2;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // X.InterfaceC93348aPQ
    public final boolean LJI(C191707fi c191707fi, C191707fi c191707fi2) {
        synchronized (this.LIZLLL) {
            ArrayList arrayList = new ArrayList();
            Iterator<C93366aPi<T>> it = this.LIZJ.iterator();
            int i = -1;
            int i2 = -1;
            while (it.hasNext()) {
                i2++;
                C93366aPi<T> next = it.next();
                if (next.LIZ == c191707fi) {
                    it.remove();
                    i = i2;
                } else {
                    arrayList.add(next);
                }
            }
            if (i == -1) {
                return false;
            }
            arrayList.add(i, new C93366aPi(c191707fi2));
            this.LIZJ.clear();
            this.LIZJ.addAll(arrayList);
            C93361aPd<C93366aPi<T>> c93361aPd = this.LIZLLL;
            c93361aPd.LIZLLL = null;
            java.util.Set<C93366aPi<T>> set = c93361aPd.LIZJ;
            if (set != null) {
                set.clear();
            }
            for (C93366aPi<T> c93366aPi : this.LIZJ) {
                C93361aPd<C93366aPi<T>> c93361aPd2 = this.LIZLLL;
                c93361aPd2.getClass();
                C93394aQA c93394aQA = c93366aPi.LIZIZ;
                C93357aPZ c93357aPZ = c93361aPd2.LIZ;
                double d = c93394aQA.LIZ;
                double d2 = c93394aQA.LIZIZ;
                if (c93357aPZ.LIZ <= d && d <= c93357aPZ.LIZJ && c93357aPZ.LIZIZ <= d2 && d2 <= c93357aPZ.LIZLLL) {
                    c93361aPd2.LIZ(d, d2, c93366aPi);
                }
            }
            return true;
        }
    }
}
