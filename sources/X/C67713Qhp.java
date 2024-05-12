package X;

import X.C0M9;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Qhp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67713Qhp {
    public final String LIZJ;
    public final String LIZLLL;
    public final Context LJFF;
    public C67674QhC LJII;
    public InterfaceC67707Qhj LJIIIZ;
    public final Looper LJIIJ;
    public final java.util.Set<Scope> LIZ = new HashSet();
    public final java.util.Set<Scope> LIZIZ = new HashSet();
    public final C1HQ LJ = new C1HQ();
    public final C1HQ LJI = new C1HQ();
    public int LJIIIIZZ = -1;
    public final GoogleApiAvailability LJIIJJI = GoogleApiAvailability.getInstance();
    public final C67724Qi0 LJIIL = C67720Qhw.LIZ;
    public final ArrayList<InterfaceC67706Qhi> LJIILIIL = new ArrayList<>();
    public final ArrayList<InterfaceC67707Qhj> LJIILJJIL = new ArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    public final C67756QiW LIZ() {
        boolean z = true;
        QH7.LIZ("must call addApi() to add at least one API", !this.LJI.isEmpty());
        C67725Qi1 c67725Qi1 = C67725Qi1.LJLIL;
        C1HQ c1hq = this.LJI;
        C67718Qhu<C67725Qi1> c67718Qhu = C67720Qhw.LIZIZ;
        if (c1hq.containsKey(c67718Qhu)) {
            c67725Qi1 = (C67725Qi1) this.LJI.getOrDefault(c67718Qhu, null);
        }
        C67736QiC c67736QiC = new C67736QiC(null, this.LIZ, this.LJ, this.LIZJ, this.LIZLLL, c67725Qi1);
        java.util.Map<C67718Qhu<?>, C89601ZEn> map = c67736QiC.LIZLLL;
        C1HQ c1hq2 = new C1HQ();
        C1HQ c1hq3 = new C1HQ();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C0M9.c) this.LJI.keySet()).iterator();
        C67718Qhu c67718Qhu2 = null;
        while (true) {
            boolean z2 = false;
            if (it.hasNext()) {
                C67718Qhu c67718Qhu3 = (C67718Qhu) it.next();
                V orDefault = this.LJI.getOrDefault(c67718Qhu3, null);
                if (map.get(c67718Qhu3) != null) {
                    z2 = true;
                }
                c1hq2.put(c67718Qhu3, Boolean.valueOf(z2));
                C67766Qig c67766Qig = new C67766Qig(c67718Qhu3, z2);
                arrayList.add(c67766Qig);
                AbstractC67715Qhr<?, O> abstractC67715Qhr = c67718Qhu3.LIZ;
                QH7.LJIIIIZZ(abstractC67715Qhr);
                InterfaceC67836Qjo LIZIZ = abstractC67715Qhr.LIZIZ(this.LJFF, this.LJIIJ, c67736QiC, orDefault, c67766Qig, c67766Qig);
                c1hq3.put(c67718Qhu3.LIZIZ, LIZIZ);
                if (LIZIZ.LJIIIZ()) {
                    if (c67718Qhu2 == null) {
                        c67718Qhu2 = c67718Qhu3;
                    } else {
                        String str = c67718Qhu3.LIZJ;
                        String str2 = c67718Qhu2.LIZJ;
                        throw new IllegalStateException(FP1.LIZLLL(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()), str, " cannot be used with ", str2));
                    }
                }
            } else {
                if (c67718Qhu2 != null) {
                    boolean equals = this.LIZ.equals(this.LIZIZ);
                    Object[] objArr = {c67718Qhu2.LIZJ};
                    if (!equals) {
                        throw new IllegalStateException(C16880lQ.LLLZ("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
                    }
                }
                C67756QiW c67756QiW = new C67756QiW(this.LJFF, new ReentrantLock(), this.LJIIJ, c67736QiC, this.LJIIJJI, this.LJIIL, c1hq2, this.LJIILIIL, this.LJIILJJIL, c1hq3, this.LJIIIIZZ, C67756QiW.LJIILL(c1hq3.values(), true), arrayList);
                java.util.Set<AbstractC67709Qhl> set = AbstractC67709Qhl.LJLIL;
                synchronized (set) {
                    set.add(c67756QiW);
                }
                if (this.LJIIIIZZ >= 0) {
                    InterfaceC67296Qb6 LIZJ = LifecycleCallback.LIZJ(this.LJII);
                    C67710Qhm c67710Qhm = (C67710Qhm) LIZJ.U(C67710Qhm.class, "AutoManageHelper");
                    if (c67710Qhm == null) {
                        c67710Qhm = new C67710Qhm(LIZJ);
                    }
                    int i = this.LJIIIIZZ;
                    InterfaceC67707Qhj interfaceC67707Qhj = this.LJIIIZ;
                    if (c67710Qhm.LJLJJLL.indexOfKey(i) >= 0) {
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Already managing a GoogleApiClient with id ");
                    sb.append(i);
                    QH7.LJIIJ(sb.toString(), z);
                    C67271Qah c67271Qah = c67710Qhm.LJLJI.get();
                    new StringBuilder(String.valueOf(c67271Qah).length() + 49);
                    C67711Qhn c67711Qhn = new C67711Qhn(c67710Qhm, i, c67756QiW, interfaceC67707Qhj);
                    c67756QiW.LJIILJJIL(c67711Qhn);
                    c67710Qhm.LJLJJLL.put(i, c67711Qhn);
                    if (c67710Qhm.LJLILLLLZI && c67271Qah == null) {
                        c67756QiW.LIZLLL();
                    }
                }
                return c67756QiW;
            }
        }
    }

    public C67713Qhp(Context context) {
        this.LJFF = context;
        this.LJIIJ = context.getMainLooper();
        this.LIZJ = context.getPackageName();
        this.LIZLLL = context.getClass().getName();
    }
}
