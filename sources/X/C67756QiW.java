package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

/* renamed from: X.QiW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67756QiW extends AbstractC67709Qhl implements InterfaceC67781Qiv {
    public final Lock LJLILLLLZI;
    public final C67762Qic LJLJI;
    public InterfaceC67771Qil LJLJJI;
    public final int LJLJJL;
    public final Context LJLJJLL;
    public final Looper LJLJL;
    public volatile boolean LJLJLLL;
    public final HandlerC67775Qip LJLLILLLL;
    public final GoogleApiAvailability LJLLJ;
    public C61219O0x LJLLL;
    public final java.util.Map<C67733Qi9<?>, InterfaceC67836Qjo> LJLLLL;
    public final C67736QiC LJLZ;
    public final java.util.Map<C67718Qhu<?>, Boolean> LJZ;
    public final AbstractC67715Qhr<? extends InterfaceC67779Qit, C67725Qi1> LJZI;
    public final ArrayList<C67766Qig> LL;
    public Integer LLD;
    public final C67749QiP LLF;
    public final Queue<AbstractC67748QiO<?, ?>> LJLJLJ = new LinkedList();
    public final long LJLL = 120000;
    public final long LJLLI = 5000;
    public java.util.Set<Scope> LJLLLLLL = new HashSet();
    public final C67776Qiq LJZL = new C67776Qiq();

    @Override // X.AbstractC67709Qhl
    public final Context LJIIIIZZ() {
        return this.LJLJJLL;
    }

    @Override // X.AbstractC67709Qhl
    public final Looper LJIIIZ() {
        return this.LJLJL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r2 == 2) goto L20;
     */
    @Override // X.AbstractC67709Qhl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r6 = this;
            java.util.concurrent.locks.Lock r0 = r6.LJLILLLLZI
            r0.lock()
            int r0 = r6.LJLJJL     // Catch: java.lang.Throwable -> L85
            r3 = 0
            r5 = 1
            r4 = 2
            if (r0 < 0) goto L14
            java.lang.Integer r0 = r6.LLD     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L12
            r1 = 1
            goto L30
        L12:
            r1 = 0
            goto L30
        L14:
            java.lang.Integer r0 = r6.LLD     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L29
            java.util.Map<X.Qi9<?>, X.Qjo> r0 = r6.LJLLLL     // Catch: java.lang.Throwable -> L85
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L85
            int r0 = LJIILL(r0, r3)     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L85
            r6.LLD = r0     // Catch: java.lang.Throwable -> L85
            goto L35
        L29:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L85
            if (r0 == r4) goto L7d
            goto L35
        L30:
            java.lang.String r0 = "Sign-in mode should have been set explicitly by auto-manage."
            X.QH7.LJIIJ(r0, r1)     // Catch: java.lang.Throwable -> L85
        L35:
            java.lang.Integer r0 = r6.LLD     // Catch: java.lang.Throwable -> L85
            X.QH7.LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> L85
            int r2 = r0.intValue()     // Catch: java.lang.Throwable -> L85
            java.util.concurrent.locks.Lock r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L85
            r0.lock()     // Catch: java.lang.Throwable -> L85
            r0 = 3
            if (r2 == r0) goto L4d
            if (r2 == r5) goto L4d
            if (r2 != r4) goto L4f
        L4a:
            r2 = r4
            r3 = 1
            goto L4f
        L4d:
            r4 = r2
            goto L4a
        L4f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r0 = 33
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "Illegal sign-in mode: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            r1.append(r2)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L76
            X.QH7.LIZ(r0, r3)     // Catch: java.lang.Throwable -> L76
            r6.LJIIZILJ(r2)     // Catch: java.lang.Throwable -> L76
            r6.LJIJ()     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.locks.Lock r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L85
            r0.unlock()     // Catch: java.lang.Throwable -> L85
            java.util.concurrent.locks.Lock r0 = r6.LJLILLLLZI
            r0.unlock()
            return
        L76:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L85
            r0.unlock()     // Catch: java.lang.Throwable -> L85
            throw r1     // Catch: java.lang.Throwable -> L85
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L85
            throw r1     // Catch: java.lang.Throwable -> L85
        L85:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r6.LJLILLLLZI
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67756QiW.LIZLLL():void");
    }

    @Override // X.AbstractC67709Qhl
    public final void LJ() {
        Lock lock;
        boolean LJI;
        this.LJLILLLLZI.lock();
        try {
            C67749QiP c67749QiP = this.LLF;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) c67749QiP.LIZ.toArray(new BasePendingResult[0])) {
                basePendingResult.LJI.set(null);
                synchronized (basePendingResult.LIZ) {
                    if (basePendingResult.LIZJ.get() == null || !basePendingResult.LJIIL) {
                        basePendingResult.LIZLLL();
                    }
                    LJI = basePendingResult.LJI();
                }
                if (LJI) {
                    c67749QiP.LIZ.remove(basePendingResult);
                }
            }
            InterfaceC67771Qil interfaceC67771Qil = this.LJLJJI;
            if (interfaceC67771Qil != null) {
                interfaceC67771Qil.LIZLLL();
            }
            C67776Qiq c67776Qiq = this.LJZL;
            Iterator<C67890Qkg<?>> it = c67776Qiq.LIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ = null;
            }
            c67776Qiq.LIZ.clear();
            for (AbstractC67748QiO<?, ?> abstractC67748QiO : this.LJLJLJ) {
                abstractC67748QiO.LJI.set(null);
                abstractC67748QiO.LIZLLL();
            }
            ((LinkedList) this.LJLJLJ).clear();
            if (this.LJLJJI == null) {
                lock = this.LJLILLLLZI;
            } else {
                LJIILLIIL();
                C67762Qic c67762Qic = this.LJLJI;
                c67762Qic.LJLJJL = false;
                c67762Qic.LJLJJLL.incrementAndGet();
                lock = this.LJLILLLLZI;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.LJLILLLLZI.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC67709Qhl
    public final boolean LJIIJ() {
        InterfaceC67771Qil interfaceC67771Qil = this.LJLJJI;
        if (interfaceC67771Qil != null && interfaceC67771Qil.LJI()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC67709Qhl
    public final void LJIIL() {
        InterfaceC67771Qil interfaceC67771Qil = this.LJLJJI;
        if (interfaceC67771Qil != null) {
            interfaceC67771Qil.LIZJ();
        }
    }

    public final boolean LJIILLIIL() {
        if (!this.LJLJLLL) {
            return false;
        }
        this.LJLJLLL = false;
        this.LJLLILLLL.removeMessages(2);
        this.LJLLILLLL.removeMessages(1);
        C61219O0x c61219O0x = this.LJLLL;
        if (c61219O0x != null) {
            synchronized (c61219O0x) {
                Context context = c61219O0x.LIZ;
                if (context != null) {
                    C16880lQ.LJJLIIIJL(context, c61219O0x);
                }
                c61219O0x.LIZ = null;
            }
            this.LJLLL = null;
        }
        return true;
    }

    public final void LJIJ() {
        this.LJLJI.LJLJJL = true;
        InterfaceC67771Qil interfaceC67771Qil = this.LJLJJI;
        QH7.LJIIIIZZ(interfaceC67771Qil);
        interfaceC67771Qil.LIZIZ();
    }

    @Override // X.InterfaceC67781Qiv
    public final void LIZIZ(Bundle bundle) {
        while (!this.LJLJLJ.isEmpty()) {
            LJI((AbstractC67748QiO) ((LinkedList) this.LJLJLJ).remove());
        }
        C67762Qic c67762Qic = this.LJLJI;
        QH7.LIZLLL(c67762Qic.LJLJLJ, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (c67762Qic.LJLJLLL) {
            QH7.LJIIJJI(!c67762Qic.LJLJL);
            c67762Qic.LJLJLJ.removeMessages(1);
            c67762Qic.LJLJL = true;
            QH7.LJIIJJI(c67762Qic.LJLJI.isEmpty());
            ArrayList arrayList = new ArrayList(c67762Qic.LJLILLLLZI);
            int i = c67762Qic.LJLJJLL.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC67706Qhi interfaceC67706Qhi = (InterfaceC67706Qhi) it.next();
                if (!c67762Qic.LJLJJL || !c67762Qic.LJLIL.isConnected() || c67762Qic.LJLJJLL.get() != i) {
                    break;
                } else if (!c67762Qic.LJLJI.contains(interfaceC67706Qhi)) {
                    interfaceC67706Qhi.H0(bundle);
                }
            }
            c67762Qic.LJLJI.clear();
            c67762Qic.LJLJL = false;
        }
    }

    @Override // X.InterfaceC67781Qiv
    public final void LIZJ(ConnectionResult connectionResult) {
        if (!this.LJLLJ.isPlayServicesPossiblyUpdating(this.LJLJJLL, connectionResult.zzb)) {
            LJIILLIIL();
        }
        if (!this.LJLJLLL) {
            C67762Qic c67762Qic = this.LJLJI;
            QH7.LIZLLL(c67762Qic.LJLJLJ, "onConnectionFailure must only be called on the Handler thread");
            c67762Qic.LJLJLJ.removeMessages(1);
            synchronized (c67762Qic.LJLJLLL) {
                ArrayList arrayList = new ArrayList(c67762Qic.LJLJJI);
                int i = c67762Qic.LJLJJLL.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC67707Qhj interfaceC67707Qhj = (InterfaceC67707Qhj) it.next();
                    if (!c67762Qic.LJLJJL || c67762Qic.LJLJJLL.get() != i) {
                        break;
                    } else if (c67762Qic.LJLJJI.contains(interfaceC67707Qhj)) {
                        interfaceC67707Qhj.onConnectionFailed(connectionResult);
                    }
                }
            }
            C67762Qic c67762Qic2 = this.LJLJI;
            c67762Qic2.LJLJJL = false;
            c67762Qic2.LJLJJLL.incrementAndGet();
        }
    }

    @Override // X.AbstractC67709Qhl
    public final <A, T extends AbstractC67748QiO<? extends InterfaceC67754QiU, A>> T LJI(T t) {
        String str;
        Lock lock;
        C67718Qhu<?> c67718Qhu = t.LJIILL;
        boolean containsKey = this.LJLLLL.containsKey(t.LJIILJJIL);
        if (c67718Qhu != null) {
            str = c67718Qhu.LIZJ;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        QH7.LIZ(sb.toString(), containsKey);
        this.LJLILLLLZI.lock();
        try {
            InterfaceC67771Qil interfaceC67771Qil = this.LJLJJI;
            if (interfaceC67771Qil != null) {
                if (this.LJLJLLL) {
                    ((LinkedList) this.LJLJLJ).add(t);
                    while (!this.LJLJLJ.isEmpty()) {
                        AbstractC67748QiO abstractC67748QiO = (AbstractC67748QiO) ((LinkedList) this.LJLJLJ).remove();
                        C67749QiP c67749QiP = this.LLF;
                        c67749QiP.LIZ.add(abstractC67748QiO);
                        abstractC67748QiO.LJI.set(c67749QiP.LIZIZ);
                        abstractC67748QiO.LJIILJJIL(Status.RESULT_INTERNAL_ERROR);
                    }
                    lock = this.LJLILLLLZI;
                } else {
                    t = (T) interfaceC67771Qil.LIZ(t);
                    lock = this.LJLILLLLZI;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.LJLILLLLZI.unlock();
            throw th;
        }
    }

    @Override // X.AbstractC67709Qhl
    public final InterfaceC67836Qjo LJII(C67728Qi4 c67728Qi4) {
        InterfaceC67836Qjo interfaceC67836Qjo = this.LJLLLL.get(c67728Qi4);
        QH7.LJIIIZ(interfaceC67836Qjo, "Appropriate Api was not requested.");
        return interfaceC67836Qjo;
    }

    @Override // X.AbstractC67709Qhl
    public final boolean LJIIJJI(InterfaceC67786Qj0 interfaceC67786Qj0) {
        InterfaceC67771Qil interfaceC67771Qil = this.LJLJJI;
        if (interfaceC67771Qil != null && interfaceC67771Qil.LJFF(interfaceC67786Qj0)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC67709Qhl
    public final void LJIILIIL(C67711Qhn c67711Qhn) {
        C67762Qic c67762Qic = this.LJLJI;
        c67762Qic.getClass();
        synchronized (c67762Qic.LJLJLLL) {
            if (!c67762Qic.LJLJJI.remove(c67711Qhn)) {
                new StringBuilder(String.valueOf(c67711Qhn).length() + 57);
            }
        }
    }

    public final void LJIILJJIL(C67711Qhn c67711Qhn) {
        this.LJLJI.LIZ(c67711Qhn);
    }

    public final void LJIIZILJ(int i) {
        String str;
        Integer num = this.LLD;
        if (num == null) {
            this.LLD = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String str2 = "UNKNOWN";
            if (i == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (i == 2) {
                str = "SIGN_IN_MODE_OPTIONAL";
            } else if (i != 3) {
                str = "UNKNOWN";
            } else {
                str = "SIGN_IN_MODE_NONE";
            }
            int intValue = this.LLD.intValue();
            if (intValue == 1) {
                str2 = "SIGN_IN_MODE_REQUIRED";
            } else if (intValue == 2) {
                str2 = "SIGN_IN_MODE_OPTIONAL";
            } else if (intValue == 3) {
                str2 = "SIGN_IN_MODE_NONE";
            }
            StringBuilder sb = new StringBuilder(str2.length() + str.length() + 51);
            sb.append("Cannot use sign-in mode: ");
            sb.append(str);
            sb.append(". Mode was already set to ");
            sb.append(str2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.LJLJJI != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (InterfaceC67836Qjo interfaceC67836Qjo : this.LJLLLL.values()) {
            z |= interfaceC67836Qjo.LIZIZ();
            z2 |= interfaceC67836Qjo.LJIIIZ();
        }
        int intValue2 = this.LLD.intValue();
        if (intValue2 != 1) {
            if (intValue2 == 2 && z) {
                Context context = this.LJLJJLL;
                Lock lock = this.LJLILLLLZI;
                Looper looper = this.LJLJL;
                GoogleApiAvailability googleApiAvailability = this.LJLLJ;
                java.util.Map<C67733Qi9<?>, InterfaceC67836Qjo> map = this.LJLLLL;
                C67736QiC c67736QiC = this.LJLZ;
                java.util.Map<C67718Qhu<?>, Boolean> map2 = this.LJZ;
                AbstractC67715Qhr<? extends InterfaceC67779Qit, C67725Qi1> abstractC67715Qhr = this.LJZI;
                ArrayList<C67766Qig> arrayList = this.LL;
                C1HQ c1hq = new C1HQ();
                C1HQ c1hq2 = new C1HQ();
                InterfaceC67836Qjo interfaceC67836Qjo2 = null;
                for (Map.Entry<C67733Qi9<?>, InterfaceC67836Qjo> entry : map.entrySet()) {
                    InterfaceC67836Qjo value = entry.getValue();
                    if (true == value.LJIIIZ()) {
                        interfaceC67836Qjo2 = value;
                    }
                    if (value.LIZIZ()) {
                        c1hq.put(entry.getKey(), value);
                    } else {
                        c1hq2.put(entry.getKey(), value);
                    }
                }
                QH7.LJIIJ("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !c1hq.isEmpty());
                C1HQ c1hq3 = new C1HQ();
                C1HQ c1hq4 = new C1HQ();
                for (C67718Qhu<?> c67718Qhu : map2.keySet()) {
                    C67728Qi4<?> c67728Qi4 = c67718Qhu.LIZIZ;
                    if (c1hq.containsKey(c67728Qi4)) {
                        c1hq3.put(c67718Qhu, map2.get(c67718Qhu));
                    } else if (c1hq2.containsKey(c67728Qi4)) {
                        c1hq4.put(c67718Qhu, map2.get(c67718Qhu));
                    } else {
                        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C67766Qig c67766Qig = (C67766Qig) ListProtector.get(arrayList, i2);
                    if (c1hq3.containsKey(c67766Qig.LJLIL)) {
                        arrayList2.add(c67766Qig);
                    } else if (c1hq4.containsKey(c67766Qig.LJLIL)) {
                        arrayList3.add(c67766Qig);
                    } else {
                        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                    }
                }
                this.LJLJJI = new C67757QiX(context, this, lock, looper, googleApiAvailability, c1hq, c1hq2, c67736QiC, abstractC67715Qhr, interfaceC67836Qjo2, arrayList2, arrayList3, c1hq3, c1hq4);
                return;
            }
        } else if (z) {
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.LJLJJI = new C67759QiZ(this.LJLJJLL, this, this.LJLILLLLZI, this.LJLJL, this.LJLLJ, this.LJLLLL, this.LJLZ, this.LJZ, this.LJZI, this.LL, this);
    }

    public static int LJIILL(Iterable<InterfaceC67836Qjo> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (InterfaceC67836Qjo interfaceC67836Qjo : iterable) {
            z2 |= interfaceC67836Qjo.LIZIZ();
            z3 |= interfaceC67836Qjo.LJIIIZ();
        }
        if (z2) {
            if (z3 && z) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    @Override // X.InterfaceC67781Qiv
    public final void LIZ(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.LJLJLLL) {
                this.LJLJLLL = true;
                if (this.LJLLL == null) {
                    try {
                        this.LJLLL = this.LJLLJ.zac(C16880lQ.LLLLL(this.LJLJJLL), new C67773Qin(this));
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC67775Qip handlerC67775Qip = this.LJLLILLLL;
                handlerC67775Qip.sendMessageDelayed(handlerC67775Qip.obtainMessage(1), this.LJLL);
                HandlerC67775Qip handlerC67775Qip2 = this.LJLLILLLL;
                handlerC67775Qip2.sendMessageDelayed(handlerC67775Qip2.obtainMessage(2), this.LJLLI);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.LLF.LIZ.toArray(new BasePendingResult[0])) {
            basePendingResult.LJFF(C67749QiP.LIZJ);
        }
        C67762Qic c67762Qic = this.LJLJI;
        QH7.LIZLLL(c67762Qic.LJLJLJ, "onUnintentionalDisconnection must only be called on the Handler thread");
        c67762Qic.LJLJLJ.removeMessages(1);
        synchronized (c67762Qic.LJLJLLL) {
            c67762Qic.LJLJL = true;
            ArrayList arrayList = new ArrayList(c67762Qic.LJLILLLLZI);
            int i2 = c67762Qic.LJLJJLL.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC67706Qhi interfaceC67706Qhi = (InterfaceC67706Qhi) it.next();
                if (!c67762Qic.LJLJJL || c67762Qic.LJLJJLL.get() != i2) {
                    break;
                } else if (c67762Qic.LJLILLLLZI.contains(interfaceC67706Qhi)) {
                    interfaceC67706Qhi.v7(i);
                }
            }
            c67762Qic.LJLJI.clear();
            c67762Qic.LJLJL = false;
        }
        C67762Qic c67762Qic2 = this.LJLJI;
        c67762Qic2.LJLJJL = false;
        c67762Qic2.LJLJJLL.incrementAndGet();
        if (i == 2) {
            LJIJ();
        }
    }

    @Override // X.AbstractC67709Qhl
    public final void LJFF(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.LJLJJLL);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.LJLJLLL);
        printWriter.append(" mWorkQueue.size()=").print(((LinkedList) this.LJLJLJ).size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.LLF.LIZ.size());
        InterfaceC67771Qil interfaceC67771Qil = this.LJLJJI;
        if (interfaceC67771Qil != null) {
            interfaceC67771Qil.LJ(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C67756QiW(Context context, Lock lock, Looper looper, C67736QiC c67736QiC, GoogleApiAvailability googleApiAvailability, C67724Qi0 c67724Qi0, C1HQ c1hq, List list, List list2, C1HQ c1hq2, int i, int i2, ArrayList arrayList) {
        this.LLD = null;
        C30931Jh c30931Jh = new C30931Jh(this);
        this.LJLJJLL = context;
        this.LJLILLLLZI = lock;
        this.LJLJI = new C67762Qic(looper, c30931Jh);
        this.LJLJL = looper;
        this.LJLLILLLL = new HandlerC67775Qip(this, looper);
        this.LJLLJ = googleApiAvailability;
        this.LJLJJL = i;
        if (i >= 0) {
            this.LLD = Integer.valueOf(i2);
        }
        this.LJZ = c1hq;
        this.LJLLLL = c1hq2;
        this.LL = arrayList;
        this.LLF = new C67749QiP();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C67762Qic c67762Qic = this.LJLJI;
            c67762Qic.getClass();
            QH7.LJIIIIZZ(next);
            synchronized (c67762Qic.LJLJLLL) {
                if (c67762Qic.LJLILLLLZI.contains(next)) {
                    new StringBuilder(String.valueOf(next).length() + 62);
                } else {
                    c67762Qic.LJLILLLLZI.add(next);
                }
            }
            if (c67762Qic.LJLIL.isConnected()) {
                HandlerC67272Qai handlerC67272Qai = c67762Qic.LJLJLJ;
                handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(1, next));
            }
        }
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            this.LJLJI.LIZ((InterfaceC67707Qhj) it2.next());
        }
        this.LJLZ = c67736QiC;
        this.LJZI = c67724Qi0;
    }
}
