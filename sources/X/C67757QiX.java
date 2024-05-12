package X;

import X.C0M9;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.QiX */
/* loaded from: classes12.dex */
public final class C67757QiX implements InterfaceC67771Qil {
    public final Context LJLIL;
    public final C67756QiW LJLILLLLZI;
    public final Looper LJLJI;
    public final C67759QiZ LJLJJI;
    public final C67759QiZ LJLJJL;
    public final java.util.Map<C67733Qi9<?>, C67759QiZ> LJLJJLL;
    public final InterfaceC67836Qjo LJLJLJ;
    public Bundle LJLJLLL;
    public final Lock LJLLJ;
    public final java.util.Set<InterfaceC67786Qj0> LJLJL = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult LJLL = null;
    public ConnectionResult LJLLI = null;
    public boolean LJLLILLLL = false;
    public int LJLLL = 0;

    @Override // X.InterfaceC67771Qil
    public final void LIZIZ() {
        this.LJLLL = 2;
        this.LJLLILLLL = false;
        this.LJLLI = null;
        this.LJLL = null;
        this.LJLJJI.LIZIZ();
        this.LJLJJL.LIZIZ();
    }

    @Override // X.InterfaceC67771Qil
    public final void LIZLLL() {
        this.LJLLI = null;
        this.LJLL = null;
        this.LJLLL = 0;
        this.LJLJJI.LIZLLL();
        this.LJLJJL.LIZLLL();
        LJIIIIZZ();
    }

    @Override // X.InterfaceC67771Qil
    public final void LIZJ() {
        boolean z;
        this.LJLLJ.lock();
        try {
            this.LJLLJ.lock();
            if (this.LJLLL == 2) {
                z = true;
            } else {
                z = false;
            }
            this.LJLLJ.unlock();
            this.LJLJJL.LIZLLL();
            this.LJLLI = new ConnectionResult(4);
            if (z) {
                new HandlerC67272Qai(this.LJLJI).post(new RunnableC39680Fhk(this));
            } else {
                LJIIIIZZ();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            this.LJLLJ.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.LJLLL == 1) goto L30;
     */
    @Override // X.InterfaceC67771Qil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.LJLLJ
            r0.lock()
            X.QiZ r0 = r3.LJLJJI     // Catch: java.lang.Throwable -> L28
            X.Qik r0 = r0.LJLLI     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0 instanceof X.C67758QiY     // Catch: java.lang.Throwable -> L28
            r2 = 0
            if (r0 == 0) goto L22
            X.QiZ r0 = r3.LJLJJL     // Catch: java.lang.Throwable -> L28
            X.Qik r0 = r0.LJLLI     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0 instanceof X.C67758QiY     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.LJIIIZ()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            int r0 = r3.LJLLL     // Catch: java.lang.Throwable -> L28
            if (r0 != r1) goto L22
        L21:
            r2 = 1
        L22:
            java.util.concurrent.locks.Lock r0 = r3.LJLLJ
            r0.unlock()
            return r2
        L28:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.LJLLJ
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67757QiX.LJI():boolean");
    }

    public final void LJIIIIZZ() {
        Iterator<InterfaceC67786Qj0> it = this.LJLJL.iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
        this.LJLJL.clear();
    }

    public final boolean LJIIIZ() {
        ConnectionResult connectionResult = this.LJLLI;
        if (connectionResult != null && connectionResult.zzb == 4) {
            return true;
        }
        return false;
    }

    public final PendingIntent LJIIL() {
        if (this.LJLJLJ == null) {
            return null;
        }
        return PendingIntent.getActivity(this.LJLIL, System.identityHashCode(this.LJLILLLLZI), this.LJLJLJ.LJFF(), C67262QaY.LIZ | 134217728);
    }

    public static void LJIIJJI(C67757QiX c67757QiX) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3 = c67757QiX.LJLL;
        if (connectionResult3 != null && connectionResult3.LJJJJZ()) {
            ConnectionResult connectionResult4 = c67757QiX.LJLLI;
            if ((connectionResult4 != null && connectionResult4.LJJJJZ()) || c67757QiX.LJIIIZ()) {
                int i = c67757QiX.LJLLL;
                if (i != 1) {
                    if (i != 2) {
                        android.util.Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        c67757QiX.LJLLL = 0;
                        return;
                    } else {
                        C67756QiW c67756QiW = c67757QiX.LJLILLLLZI;
                        QH7.LJIIIIZZ(c67756QiW);
                        c67756QiW.LIZIZ(c67757QiX.LJLJLLL);
                    }
                }
                c67757QiX.LJIIIIZZ();
                c67757QiX.LJLLL = 0;
                return;
            }
            ConnectionResult connectionResult5 = c67757QiX.LJLLI;
            if (connectionResult5 != null) {
                if (c67757QiX.LJLLL == 1) {
                    c67757QiX.LJIIIIZZ();
                    return;
                } else {
                    c67757QiX.LJII(connectionResult5);
                    c67757QiX.LJLJJI.LIZLLL();
                    return;
                }
            }
            return;
        }
        if (c67757QiX.LJLL != null && (connectionResult2 = c67757QiX.LJLLI) != null && connectionResult2.LJJJJZ()) {
            c67757QiX.LJLJJL.LIZLLL();
            ConnectionResult connectionResult6 = c67757QiX.LJLL;
            QH7.LJIIIIZZ(connectionResult6);
            c67757QiX.LJII(connectionResult6);
            return;
        }
        ConnectionResult connectionResult7 = c67757QiX.LJLL;
        if (connectionResult7 != null && (connectionResult = c67757QiX.LJLLI) != null) {
            if (c67757QiX.LJLJJL.LJLLILLLL < c67757QiX.LJLJJI.LJLLILLLL) {
                connectionResult7 = connectionResult;
            }
            c67757QiX.LJII(connectionResult7);
        }
    }

    @Override // X.InterfaceC67771Qil
    public final <A, T extends AbstractC67748QiO<? extends InterfaceC67754QiU, A>> T LIZ(T t) {
        C67759QiZ c67759QiZ = this.LJLJJLL.get(t.LJIILJJIL);
        QH7.LJIIIZ(c67759QiZ, "GoogleApiClient is not configured to use the API required for this call.");
        if (c67759QiZ.equals(this.LJLJJL)) {
            if (LJIIIZ()) {
                t.LJIILJJIL(new Status(4, LJIIL(), null));
                return t;
            }
            C67759QiZ c67759QiZ2 = this.LJLJJL;
            c67759QiZ2.getClass();
            t.LJIIJJI();
            return (T) c67759QiZ2.LJLLI.LJI(t);
        }
        C67759QiZ c67759QiZ3 = this.LJLJJI;
        c67759QiZ3.getClass();
        t.LJIIJJI();
        return (T) c67759QiZ3.LJLLI.LJI(t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        throw r1;
     */
    @Override // X.InterfaceC67771Qil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(X.InterfaceC67786Qj0 r5) {
        /*
            r4 = this;
            java.util.concurrent.locks.Lock r0 = r4.LJLLJ
            r0.lock()
            java.util.concurrent.locks.Lock r0 = r4.LJLLJ     // Catch: java.lang.Throwable -> L4f
            r0.lock()     // Catch: java.lang.Throwable -> L4f
            int r1 = r4.LJLLL     // Catch: java.lang.Throwable -> L48
            r0 = 2
            r3 = 1
            r2 = 0
            if (r1 != r0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            java.util.concurrent.locks.Lock r0 = r4.LJLLJ     // Catch: java.lang.Throwable -> L4f
            r0.unlock()     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L21
            boolean r0 = r4.LJI()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L42
        L21:
            X.QiZ r0 = r4.LJLJJL     // Catch: java.lang.Throwable -> L4f
            X.Qik r0 = r0.LJLLI     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r0 instanceof X.C67758QiY     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L42
            java.util.Set<X.Qj0> r0 = r4.LJLJL     // Catch: java.lang.Throwable -> L4f
            r0.add(r5)     // Catch: java.lang.Throwable -> L4f
            int r0 = r4.LJLLL     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L34
            r4.LJLLL = r3     // Catch: java.lang.Throwable -> L4f
        L34:
            r0 = 0
            r4.LJLLI = r0     // Catch: java.lang.Throwable -> L4f
            X.QiZ r0 = r4.LJLJJL     // Catch: java.lang.Throwable -> L4f
            r0.LIZIZ()     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.locks.Lock r0 = r4.LJLLJ
            r0.unlock()
            return r3
        L42:
            java.util.concurrent.locks.Lock r0 = r4.LJLLJ
            r0.unlock()
            return r2
        L48:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r4.LJLLJ     // Catch: java.lang.Throwable -> L4f
            r0.unlock()     // Catch: java.lang.Throwable -> L4f
            throw r1     // Catch: java.lang.Throwable -> L4f
        L4f:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r4.LJLLJ
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67757QiX.LJFF(X.Qj0):boolean");
    }

    public final void LJII(ConnectionResult connectionResult) {
        int i = this.LJLLL;
        if (i != 1) {
            if (i != 2) {
                android.util.Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.LJLLL = 0;
            }
            this.LJLILLLLZI.LIZJ(connectionResult);
        }
        LJIIIIZZ();
        this.LJLLL = 0;
    }

    public static /* bridge */ /* synthetic */ void LJIIJ(C67757QiX c67757QiX, int i, boolean z) {
        c67757QiX.LJLILLLLZI.LIZ(i, z);
        c67757QiX.LJLLI = null;
        c67757QiX.LJLL = null;
    }

    @Override // X.InterfaceC67771Qil
    public final void LJ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.LJLJJL.LJ(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.LJLJJI.LJ(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public C67757QiX(Context context, C67756QiW c67756QiW, Lock lock, Looper looper, GoogleApiAvailability googleApiAvailability, C1HQ c1hq, C1HQ c1hq2, C67736QiC c67736QiC, AbstractC67715Qhr abstractC67715Qhr, InterfaceC67836Qjo interfaceC67836Qjo, ArrayList arrayList, ArrayList arrayList2, C1HQ c1hq3, C1HQ c1hq4) {
        this.LJLIL = context;
        this.LJLILLLLZI = c67756QiW;
        this.LJLLJ = lock;
        this.LJLJI = looper;
        this.LJLJLJ = interfaceC67836Qjo;
        this.LJLJJI = new C67759QiZ(context, c67756QiW, lock, looper, googleApiAvailability, c1hq2, null, c1hq4, null, arrayList2, new C39679Fhj(this));
        this.LJLJJL = new C67759QiZ(context, c67756QiW, lock, looper, googleApiAvailability, c1hq, c67736QiC, c1hq3, abstractC67715Qhr, arrayList, new C39670Fha(this));
        C1HQ c1hq5 = new C1HQ();
        Iterator it = ((C0M9.c) c1hq2.keySet()).iterator();
        while (it.hasNext()) {
            c1hq5.put(it.next(), this.LJLJJI);
        }
        Iterator it2 = ((C0M9.c) c1hq.keySet()).iterator();
        while (it2.hasNext()) {
            c1hq5.put(it2.next(), this.LJLJJL);
        }
        this.LJLJJLL = Collections.unmodifiableMap(c1hq5);
    }
}
