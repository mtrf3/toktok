package X;

import Y.ACallableS35S1200000_6;
import Y.ACallableS81S0101000_10;
import Y.AfS36S0101000_5;
import Y.AgS23S1000000_6;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.zhiliaoapp.musically.R;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F5V implements Handler.Callback {
    public static volatile F5V LJLJLJ;
    public static volatile boolean LJLJLLL;
    public static volatile boolean LJLL;
    public static volatile C31134CJu LJLLI;
    public static volatile C73411SrX LJLLILLLL;
    public volatile AbstractC37134Ehm LJLJJLL;
    public final Executor LJLIL = C16880lQ.LLLLZLLIL();
    public long LJLJL = -1;
    public final ConcurrentLinkedDeque<AbstractC37134Ehm> LJLILLLLZI = new ConcurrentLinkedDeque<>();
    public final ConcurrentLinkedQueue<AbstractC37134Ehm> LJLJI = new ConcurrentLinkedQueue<>();
    public final ConcurrentHashMap<String, F5U> LJLJJI = new ConcurrentHashMap<>();
    public final Handler LJLJJL = new Handler(C06M.LIZ("df_download_thread").getLooper(), this);

    public static F5V LIZLLL() {
        if (LJLJLJ == null) {
            synchronized (F5V.class) {
                if (LJLJLJ == null) {
                    LJLJLJ = new F5V();
                }
            }
        }
        return LJLJLJ;
    }

    public final void LJI() {
        synchronized (F5V.class) {
            if (!LJLL) {
                LJLLILLLL = (C73411SrX) C84763XOl.LJI().LJJJJZI(new AfS36S0101000_5(4, this, 69));
                LJLL = true;
            }
        }
    }

    public final void LJII() {
        if (!LJLJLLL) {
            synchronized (F5V.class) {
                if (!LJLJLLL) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    LJLLI = new C31134CJu();
                    C16880lQ.LJJLIIIJILLIZJL(LJLLI, EF7.LIZIZ(), intentFilter);
                    LJLJLLL = true;
                    C84763XOl.LJII().LJJJJZI(new AfS36S0101000_5(2, this, 25));
                }
            }
        }
    }

    public final void LJIIL() {
        C10K.LIZIZ(new ACallableS81S0101000_10(1, this, 1), this.LJLIL, null);
    }

    public F5V() {
        C84763XOl.LJII().LJJJJZI(new AfS36S0101000_5(3, this, 15));
    }

    public static void LIZ(AbstractC37134Ehm abstractC37134Ehm) {
        int intValue;
        if (abstractC37134Ehm == null) {
            return;
        }
        String packageName = abstractC37134Ehm.LIZIZ;
        o.LJIIIZ(packageName, "packageName");
        ConcurrentHashMap<String, Integer> concurrentHashMap = C37101EhF.LIZ;
        synchronized (concurrentHashMap) {
            Integer num = concurrentHashMap.get(packageName);
            if (num != null) {
                intValue = num.intValue();
            } else {
                intValue = -1;
            }
        }
        if (intValue == -1) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sessionId:");
        LIZ.append(intValue);
        C37099EhD.LIZ(abstractC37134Ehm, 4, X1D.LIZIZ(LIZ));
        F5W.LIZIZ.LIZIZ(intValue);
    }

    public final synchronized boolean LIZJ(AbstractC37134Ehm abstractC37134Ehm) {
        String str;
        String str2;
        int i;
        C36976EfE.LIZIZ(abstractC37134Ehm);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("executeTask: ");
        LIZ.append(abstractC37134Ehm.LIZ);
        LIZ.append("  cur: ");
        if (this.LJLJJLL == null) {
            str = "null";
        } else {
            str = this.LJLJJLL.LIZ;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        F5U LJ = LJ(abstractC37134Ehm.LIZ);
        boolean z = abstractC37134Ehm.LJFF;
        if (this.LJLJJLL == null || this.LJLJJLL.LJIIIZ.isFinished()) {
            LJ.LIZIZ(abstractC37134Ehm);
            if (abstractC37134Ehm.LJI.LJ && !C48189Ivh.LJI(EF7.LIZIZ())) {
                str2 = "failed because required wifi";
                if (!z && abstractC37134Ehm.LJ) {
                    C38405F5l.LIZ(R.string.eyh);
                }
                if (abstractC37134Ehm.LJI.LIZIZ) {
                    LJIIJJI(abstractC37134Ehm, 0L);
                }
                i = 4;
            } else {
                EF7.LIZIZ();
                if (C2NU.LIZ.LIZIZ()) {
                    if (C84763XOl.LJIIJJI) {
                        str2 = "failed because app is background";
                        LJI();
                        LJIIJ(abstractC37134Ehm);
                        i = 6;
                    } else {
                        if (this.LJLJJLL != null && abstractC37134Ehm.LJIIIIZZ == 2) {
                            LIZ(this.LJLJJLL);
                        }
                        C37099EhD.LIZ(abstractC37134Ehm, 1, "start to execute");
                        LJFF(abstractC37134Ehm);
                        return true;
                    }
                } else {
                    str2 = "failed because no network";
                    if (!z && abstractC37134Ehm.LJ) {
                        C38405F5l.LIZ(R.string.im9);
                    }
                    if (abstractC37134Ehm.LJI.LIZIZ) {
                        LJII();
                        LJIIJ(abstractC37134Ehm);
                    }
                    i = 5;
                }
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Failed because other module is currently executing:");
            LIZ2.append(this.LJLJJLL.LIZ);
            str2 = X1D.LIZIZ(LIZ2);
            if (abstractC37134Ehm.LJIIIIZZ == 2) {
                if (abstractC37134Ehm.equals(this.LJLILLLLZI.peek())) {
                    this.LJLILLLLZI.poll();
                }
                this.LJLILLLLZI.addFirst(abstractC37134Ehm);
                C37099EhD.LIZ(abstractC37134Ehm, 1, str2);
                LIZ(this.LJLJJLL);
                LJIIIZ(this.LJLJJLL);
                return true;
            }
            LJIIJ(abstractC37134Ehm);
            i = 7;
        }
        abstractC37134Ehm.LIZ(i, abstractC37134Ehm.LJIIIIZZ);
        C37099EhD.LIZ(abstractC37134Ehm, 1, str2);
        return false;
    }

    public final synchronized F5U LJ(String str) {
        F5U f5u;
        f5u = this.LJLJJI.get(str);
        if (f5u == null) {
            f5u = new F5U(str);
            C37097EhB morpheusStateListener = f5u.LJFF;
            o.LJIIIZ(morpheusStateListener, "morpheusStateListener");
            ((CopyOnWriteArrayList) C37095Eh9.LIZIZ).add(morpheusStateListener);
            this.LJLJJI.put(str, f5u);
        }
        return f5u;
    }

    public final void LJFF(AbstractC37134Ehm abstractC37134Ehm) {
        this.LJLJJLL = abstractC37134Ehm;
        C37099EhD.LIZ(abstractC37134Ehm, 5, null);
        final String str = abstractC37134Ehm.LIZIZ;
        if (abstractC37134Ehm.LIZLLL()) {
            C10K.LIZJ(new ACallableS35S1200000_6(this, abstractC37134Ehm, str, 3)).LIZLLL(new AgS23S1000000_6(str, 1));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJL;
        long longValue = ((Number) EPA.LIZLLL.getValue()).longValue();
        if (longValue > currentTimeMillis) {
            try {
                Thread.sleep(Math.min(longValue, (long) ((longValue - currentTimeMillis) * 1.1d)));
            } catch (Throwable unused) {
            }
        }
        this.LJLJL = System.currentTimeMillis();
        InterfaceC38394F5a interfaceC38394F5a = F5W.LIZIZ;
        if (abstractC37134Ehm instanceof C37124Ehc) {
            F5W.LIZ(str);
            return;
        }
        if (abstractC37134Ehm.LIZJ()) {
            F5W.LIZ(str);
            return;
        }
        C38403F5j c38403F5j = new C38403F5j();
        ((ArrayList) c38403F5j.LIZ).add(abstractC37134Ehm.LIZ);
        List<String> list = abstractC37134Ehm.LJI.LJIIIIZZ;
        java.util.Set<String> LIZIZ = EPA.LIZIZ();
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!LIZIZ.contains(next)) {
                    ((ArrayList) c38403F5j.LIZ).add(next);
                }
            }
        }
        C40561Fvx LIZJ = interfaceC38394F5a.LIZJ(new C38398F5e(c38403F5j));
        InterfaceC40563Fvz interfaceC40563Fvz = new InterfaceC40563Fvz() { // from class: X.F5i
            @Override // X.InterfaceC40563Fvz
            public final void onSuccess(Object obj) {
                String packageName = str;
                int intValue = ((Integer) obj).intValue();
                o.LJIIIZ(packageName, "packageName");
                ConcurrentHashMap<String, Integer> concurrentHashMap = C37101EhF.LIZ;
                synchronized (concurrentHashMap) {
                    concurrentHashMap.put(packageName, Integer.valueOf(intValue));
                }
            }
        };
        LIZJ.getClass();
        E1Q e1q = C38410F5q.LIZ;
        LIZJ.LIZJ(e1q, interfaceC40563Fvz);
        InterfaceC40570Fw6 interfaceC40570Fw6 = new InterfaceC40570Fw6() { // from class: X.F5n
            @Override // X.InterfaceC40570Fw6
            public final void onFailure(Exception exc) {
                F5W.LIZIZ(exc, str);
            }
        };
        C40566Fw2<ResultT> c40566Fw2 = LIZJ.LIZIZ;
        C40567Fw3 c40567Fw3 = new C40567Fw3(e1q, interfaceC40570Fw6);
        synchronized (c40566Fw2.LIZ) {
            if (c40566Fw2.LIZIZ == null) {
                c40566Fw2.LIZIZ = new ArrayDeque();
            }
            ((ArrayDeque) c40566Fw2.LIZIZ).add(c40567Fw3);
        }
        LIZJ.LIZLLL();
    }

    public final synchronized void LJIIIIZZ(String str) {
        C37097EhB morpheusStateListener = LJ(str).LJFF;
        o.LJIIIZ(morpheusStateListener, "morpheusStateListener");
        ((CopyOnWriteArrayList) C37095Eh9.LIZIZ).remove(morpheusStateListener);
    }

    public final void LJIIIZ(AbstractC37134Ehm abstractC37134Ehm) {
        if (abstractC37134Ehm == null) {
            return;
        }
        long j = abstractC37134Ehm.LJI.LJFF;
        if (j == 0) {
            LJIIJ(abstractC37134Ehm);
        } else {
            LJIIJJI(abstractC37134Ehm, j);
        }
    }

    public final void LJIIJ(AbstractC37134Ehm abstractC37134Ehm) {
        if (abstractC37134Ehm == null) {
            return;
        }
        abstractC37134Ehm.LJFF = true;
        abstractC37134Ehm.LJI.LIZ = false;
        abstractC37134Ehm.LJIIIIZZ = 0;
        C37099EhD.LIZ(abstractC37134Ehm, 2, "retry immediately");
        LIZIZ(abstractC37134Ehm, this.LJLILLLLZI);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1024) {
            Iterator<AbstractC37134Ehm> it = this.LJLJI.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC37134Ehm next = it.next();
                if (next.LJIILIIL <= System.currentTimeMillis() && (!next.LJI.LJ || C48189Ivh.LJI(EF7.LIZIZ()))) {
                    LIZIZ(next, this.LJLILLLLZI);
                    this.LJLJI.remove(next);
                    z = true;
                }
            }
            if (z) {
                LJIIL();
            }
        }
        return true;
    }

    public static void LIZIZ(AbstractC37134Ehm abstractC37134Ehm, AbstractCollection abstractCollection) {
        if (abstractCollection.contains(abstractC37134Ehm)) {
            int i = C217568gK.LIZ[abstractC37134Ehm.LJI.LJI.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    return;
                }
            } else {
                abstractCollection.remove(abstractC37134Ehm);
            }
        }
        abstractCollection.add(abstractC37134Ehm);
    }

    public final void LJIIJJI(AbstractC37134Ehm abstractC37134Ehm, long j) {
        if (abstractC37134Ehm == null) {
            return;
        }
        abstractC37134Ehm.LJFF = true;
        abstractC37134Ehm.LJI.LIZ = false;
        abstractC37134Ehm.LJIIIIZZ = 0;
        if (j == 0) {
            abstractC37134Ehm.LJIIL = j;
            abstractC37134Ehm.LJIILIIL = System.currentTimeMillis() + j;
            LIZIZ(abstractC37134Ehm, this.LJLJI);
            if (abstractC37134Ehm.LJI.LJ) {
                LJII();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("delay:");
            LIZ.append(j);
            C37099EhD.LIZ(abstractC37134Ehm, 2, X1D.LIZIZ(LIZ));
            return;
        }
        long j2 = abstractC37134Ehm.LJIIL + j;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("delay:");
        LIZ2.append(j2);
        C37099EhD.LIZ(abstractC37134Ehm, 2, X1D.LIZIZ(LIZ2));
        if (j2 / j > 5) {
            return;
        }
        abstractC37134Ehm.LJIIL = j2;
        abstractC37134Ehm.LJIILIIL = System.currentTimeMillis() + j2;
        LIZIZ(abstractC37134Ehm, this.LJLJI);
        if (abstractC37134Ehm.LJI.LJ) {
            LJII();
        }
        this.LJLJJL.sendEmptyMessageDelayed(1024, j2);
    }
}
