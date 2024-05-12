package X;

import android.util.SparseBooleanArray;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: X.0Wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09010Wz {
    public static final C1O6 LJIIIZ = new C0YM<Boolean>() { // from class: X.1O6
        @Override // X.C0YM
        public final Boolean LIZIZ() {
            if (C0U7.LIZLLL.LIZ() != null) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    };
    public static volatile C1O7 LJIIJ = new C0YM<Boolean>() { // from class: X.1O7
        @Override // X.C0YM
        public final Boolean LIZIZ() {
            Boolean bool;
            C01I c01i = C01H.LIZIZ;
            if (c01i != null && (bool = Boolean.TRUE) != null) {
                c01i.getClass();
                return bool;
            }
            return Boolean.TRUE;
        }
    };
    public final java.util.Map<C0NR, TreeSet<C0X3>> LIZ = new HashMap();
    public final transient ReentrantLock LIZIZ;
    public final java.util.Map<C0NR, C0X3> LIZJ;
    public final PThreadScheduledThreadPoolExecutor LIZLLL;
    public final ConcurrentHashMap<C0X3, C0NT> LJ;
    public final ConcurrentHashMap<C0NT, C0X3> LJFF;
    public final C1O5 LJI;
    public final C1O8 LJII;
    public final C1O9 LJIIIIZZ;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1O5] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1O8] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1O9] */
    public C09010Wz() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZIZ = reentrantLock;
        reentrantLock.newCondition();
        this.LIZJ = new HashMap();
        this.LIZLLL = null;
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = new C0YM<SparseBooleanArray>() { // from class: X.1O5
            @Override // X.C0YM
            public final SparseBooleanArray LIZIZ() {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                if (C01H.LIZIZ != null) {
                    C48693J9d.LIZIZ();
                    Iterator it = C48693J9d.LIZIZ().iterator();
                    while (it.hasNext()) {
                        sparseBooleanArray.append(((Integer) it.next()).intValue(), true);
                    }
                }
                return sparseBooleanArray;
            }
        };
        this.LJII = new C0YM<WeakReference<C01G>>() { // from class: X.1O8
            @Override // X.C0YM
            public final WeakReference<C01G> LIZIZ() {
                if (C01H.LIZIZ != null) {
                    C01H.LIZIZ.getClass();
                    return new WeakReference<>(FJL.LIZ);
                }
                return null;
            }
        };
        this.LJIIIIZZ = new C0YQ() { // from class: X.1O9
            @Override // X.C0YQ
            public final void LIZ(String str, JSONObject jSONObject) {
                if (LIZ() == null || LIZ().get() == null) {
                    return;
                }
                LIZ().get().LIZ(str, jSONObject);
            }
        };
        this.LIZLLL = new PThreadScheduledThreadPoolExecutor(2, new DefaultThreadFactory("equestManager"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00a3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0266 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C0NT r11) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09010Wz.LIZ(X.0NT):java.lang.Object");
    }

    public final void LIZJ(C0NR c0nr) {
        boolean z;
        C0YN.LIZ(3);
        TreeSet treeSet = (TreeSet) ((HashMap) this.LIZ).get(c0nr);
        if (treeSet != null) {
            treeSet.toString();
        }
        C0YN.LIZ(3);
        if (treeSet != null && !treeSet.isEmpty()) {
            final C0X3 c0x3 = (C0X3) treeSet.pollFirst();
            c0x3.LJLLI = System.currentTimeMillis();
            C0X5 c0x5 = c0x3.LJLJL;
            C0X5 c0x52 = C0X5.USE_OURS;
            if (c0x5 == c0x52 && c0x3.LIZJ() > 50) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Should set timeout task:");
            LIZ.append(z);
            X1D.LIZIZ(LIZ);
            C0YN.LIZ(3);
            if (z) {
                C0YN.LIZ(3);
                C0X6 c0x6 = new C0X6(c0x3);
                c0x6.LJLILLLLZI = this.LIZLLL.schedule(c0x6, c0x3.LIZJ(), TimeUnit.MILLISECONDS);
                c0x3.LJLLILLLL = c0x6;
                c0x3.LJLJI = c0x3.LIZJ();
            }
            if (LIZLLL(c0x3)) {
                if (c0x3.LJLJL == c0x52 && c0x3.LIZJ() <= 50) {
                    LIZJ(c0x3.LJLIL);
                    return;
                }
                C0YN.LIZ(3);
                this.LIZLLL.submit(new Callable<Integer>(c0x3) { // from class: X.0X0
                    public final C0X3 LJLIL;

                    {
                        this.LJLIL = c0x3;
                    }

                    /* JADX WARN: Type inference failed for: r0v12, types: [X.0U4, X.0UC] */
                    /* JADX WARN: Type inference failed for: r1v0, types: [X.0U4, X.0UC] */
                    @Override // java.util.concurrent.Callable
                    public final Integer call() {
                        ?? r0;
                        C0U7 LIZJ = C0U7.LIZJ();
                        C0X3 c0x32 = this.LJLIL;
                        ?? r1 = LIZJ.LIZ;
                        if ((r1 != 0 && r1.LIZJ(c0x32.LJLIL)) || LIZJ.LIZIZ.LIZJ(c0x32.LJLIL)) {
                            if (!this.LJLIL.LJLJJL) {
                                C0UD LIZLLL = C0U7.LIZJ().LIZLLL(this.LJLIL);
                                if (LIZLLL != null && (r0 = LIZLLL.LIZIZ) != 0) {
                                    r0.LIZ(LIZLLL);
                                }
                            } else {
                                C0U7.LIZJ().LIZIZ(this.LJLIL);
                            }
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("no provider support this ability ");
                            LIZ2.append(this.LJLIL.LJLIL);
                            X1D.LIZIZ(LIZ2);
                            C0YN.LIZ(3);
                        }
                        C09000Wy.LIZ.LIZIZ(this.LJLIL, false);
                        return null;
                    }
                });
                ((HashMap) this.LIZJ).put(c0x3.LJLIL, c0x3);
            }
        }
    }

    public final boolean LIZLLL(C0X3 c0x3) {
        C0X5 c0x5;
        C0X3 c0x32 = (C0X3) ((HashMap) this.LIZJ).get(c0x3.LJLIL);
        boolean z = true;
        if (this.LIZJ != null && c0x32 != null) {
            if ((r1 = C08990Wx.LIZIZ[c0x3.LJLL.ordinal()]) != 1) {
                z = false;
                c0x5 = c0x3.LJLJL;
                if ((c0x5 != C0X5.USE_OURS || c0x5 == C0X5.USE_PROVIDERS) && c0x3.LIZJ() <= 50) {
                    return false;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Should notify provider:");
                LIZ.append(z);
                X1D.LIZIZ(LIZ);
                C0YN.LIZ(3);
            } else {
                z = false;
                c0x5 = c0x3.LJLJL;
                if (c0x5 != C0X5.USE_OURS) {
                }
                return false;
            }
        }
        return z;
    }

    public final void LIZIZ(C0X3 c0x3, boolean z) {
        C0YN.LIZ(3);
        this.LIZIZ.lock();
        if (z) {
            try {
                this.LJFF.remove(c0x3.LJLLJ);
            } finally {
                this.LIZIZ.unlock();
            }
        }
        if (c0x3.LJLLILLLL == null || z) {
            this.LJ.remove(c0x3);
            ((HashMap) this.LIZJ).remove(c0x3.LJLIL);
            TreeSet treeSet = (TreeSet) ((HashMap) this.LIZ).get(c0x3.LJLIL);
            if (treeSet != null && !treeSet.isEmpty()) {
                LIZJ(c0x3.LJLIL);
            }
        }
    }
}
