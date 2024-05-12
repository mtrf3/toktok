package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Qib, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67761Qib implements InterfaceC67770Qik {
    public final C67759QiZ LIZ;
    public final Lock LIZIZ;
    public final Context LIZJ;
    public final C67258QaU LIZLLL;
    public ConnectionResult LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public InterfaceC67779Qit LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public InterfaceC67936QlQ LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final C67736QiC LJIIZILJ;
    public final java.util.Map<C67718Qhu<?>, Boolean> LJIJ;
    public final AbstractC67715Qhr<? extends InterfaceC67779Qit, C67725Qi1> LJIJI;
    public final Bundle LJIIIIZZ = new Bundle();
    public final java.util.Set<C67733Qi9> LJIIIZ = new HashSet();
    public final ArrayList<Future<?>> LJIJJ = new ArrayList<>();

    @Override // X.InterfaceC67770Qik
    public final void LIZLLL() {
    }

    public final void LJII() {
        this.LJIIL = false;
        this.LIZ.LJLLJ.LJLLLLLL = Collections.emptySet();
        Iterator it = ((HashSet) this.LJIIIZ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((HashMap) this.LIZ.LJLJL).containsKey(next)) {
                ((HashMap) this.LIZ.LJLJL).put(next, new ConnectionResult(17, null));
            }
        }
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZJ() {
        ((HashMap) this.LIZ.LJLJL).clear();
        this.LJIIL = false;
        this.LJ = null;
        this.LJI = 0;
        this.LJIIJJI = true;
        this.LJIILIIL = false;
        this.LJIILL = false;
        HashMap hashMap = new HashMap();
        for (C67718Qhu<?> c67718Qhu : this.LJIJ.keySet()) {
            InterfaceC67836Qjo interfaceC67836Qjo = this.LIZ.LJLJJLL.get(c67718Qhu.LIZIZ);
            QH7.LJIIIIZZ(interfaceC67836Qjo);
            c67718Qhu.LIZ.getClass();
            boolean booleanValue = this.LJIJ.get(c67718Qhu).booleanValue();
            if (interfaceC67836Qjo.LIZIZ()) {
                this.LJIIL = true;
                if (booleanValue) {
                    ((HashSet) this.LJIIIZ).add(c67718Qhu.LIZIZ);
                } else {
                    this.LJIIJJI = false;
                }
            }
            hashMap.put(interfaceC67836Qjo, new C67765Qif(this, c67718Qhu, booleanValue));
        }
        if (this.LJIIL) {
            QH7.LJIIIIZZ(this.LJIIZILJ);
            QH7.LJIIIIZZ(this.LJIJI);
            this.LJIIZILJ.LJIIIIZZ = Integer.valueOf(System.identityHashCode(this.LIZ.LJLLJ));
            C67767Qih c67767Qih = new C67767Qih(this);
            AbstractC67715Qhr<? extends InterfaceC67779Qit, C67725Qi1> abstractC67715Qhr = this.LJIJI;
            Context context = this.LIZJ;
            Looper looper = this.LIZ.LJLLJ.LJLJL;
            C67736QiC c67736QiC = this.LJIIZILJ;
            this.LJIIJ = abstractC67715Qhr.LIZIZ(context, looper, c67736QiC, c67736QiC.LJII, c67767Qih, c67767Qih);
        }
        this.LJII = this.LIZ.LJLJJLL.size();
        this.LJIJJ.add(C39013FSv.LIZ.submit(new C67764Qie(this, hashMap)));
    }

    @Override // X.InterfaceC67770Qik
    public final boolean LJFF() {
        ArrayList<Future<?>> arrayList = this.LJIJJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) ListProtector.get(arrayList, i)).cancel(true);
        }
        this.LJIJJ.clear();
        LJIIIIZZ(true);
        this.LIZ.LJII();
        return true;
    }

    public final void LJIIIZ() {
        Bundle bundle;
        C67759QiZ c67759QiZ = this.LIZ;
        c67759QiZ.LJLIL.lock();
        try {
            c67759QiZ.LJLLJ.LJIILLIIL();
            c67759QiZ.LJLLI = new C67758QiY(c67759QiZ);
            c67759QiZ.LJLLI.LIZJ();
            c67759QiZ.LJLILLLLZI.signalAll();
            c67759QiZ.LJLIL.unlock();
            C39013FSv.LIZ.execute(new IOG(this));
            InterfaceC67779Qit interfaceC67779Qit = this.LJIIJ;
            if (interfaceC67779Qit != null) {
                if (this.LJIILL) {
                    InterfaceC67936QlQ interfaceC67936QlQ = this.LJIILJJIL;
                    QH7.LJIIIIZZ(interfaceC67936QlQ);
                    interfaceC67779Qit.LJIILL(interfaceC67936QlQ, this.LJIILLIIL);
                }
                LJIIIIZZ(false);
            }
            Iterator it = ((HashMap) this.LIZ.LJLJL).keySet().iterator();
            while (it.hasNext()) {
                InterfaceC67836Qjo interfaceC67836Qjo = this.LIZ.LJLJJLL.get(it.next());
                QH7.LJIIIIZZ(interfaceC67836Qjo);
                interfaceC67836Qjo.LIZLLL();
            }
            if (this.LJIIIIZZ.isEmpty()) {
                bundle = null;
            } else {
                bundle = this.LJIIIIZZ;
            }
            this.LIZ.LJLLL.LIZIZ(bundle);
        } catch (Throwable th) {
            c67759QiZ.LJLIL.unlock();
            throw th;
        }
    }

    public final void LJIIL() {
        if (this.LJII != 0) {
            return;
        }
        if (!this.LJIIL || this.LJIILIIL) {
            ArrayList arrayList = new ArrayList();
            this.LJI = 1;
            this.LJII = this.LIZ.LJLJJLL.size();
            for (C67733Qi9<?> c67733Qi9 : this.LIZ.LJLJJLL.keySet()) {
                if (((HashMap) this.LIZ.LJLJL).containsKey(c67733Qi9)) {
                    if (LJIILJJIL()) {
                        LJIIIZ();
                    }
                } else {
                    arrayList.add(this.LIZ.LJLJJLL.get(c67733Qi9));
                }
            }
            if (!arrayList.isEmpty()) {
                this.LJIJJ.add(C39013FSv.LIZ.submit(new C67763Qid(this, arrayList)));
            }
        }
    }

    public final boolean LJIILJJIL() {
        int i = this.LJII - 1;
        this.LJII = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            android.util.Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            LJIIJ(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.LJ;
        if (connectionResult != null) {
            this.LIZ.LJLLILLLL = this.LJFF;
            LJIIJ(connectionResult);
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZ(Bundle bundle) {
        if (!LJIILIIL(1)) {
            return;
        }
        if (bundle != null) {
            this.LJIIIIZZ.putAll(bundle);
        }
        if (LJIILJJIL()) {
            LJIIIZ();
        }
    }

    @Override // X.InterfaceC67770Qik
    public final void LJ(int i) {
        LJIIJ(new ConnectionResult(8, null));
    }

    @Override // X.InterfaceC67770Qik
    public final <A, T extends AbstractC67748QiO<? extends InterfaceC67754QiU, A>> T LJI(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void LJIIIIZZ(boolean z) {
        InterfaceC67779Qit interfaceC67779Qit = this.LJIIJ;
        if (interfaceC67779Qit != null) {
            if (interfaceC67779Qit.isConnected() && z) {
                interfaceC67779Qit.LJ();
            }
            interfaceC67779Qit.LIZLLL();
            QH7.LJIIIIZZ(this.LJIIZILJ);
            this.LJIILJJIL = null;
        }
    }

    public final void LJIIJ(ConnectionResult connectionResult) {
        ArrayList<Future<?>> arrayList = this.LJIJJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) ListProtector.get(arrayList, i)).cancel(true);
        }
        this.LJIJJ.clear();
        LJIIIIZZ(!connectionResult.LJJJJL());
        this.LIZ.LJII();
        this.LIZ.LJLLL.LIZJ(connectionResult);
    }

    public final boolean LJIILIIL(int i) {
        String str;
        int i2 = this.LJI;
        if (i2 != i) {
            String str2 = "STEP_GETTING_REMOTE_SERVICE";
            if (i2 != 0) {
                str = "STEP_GETTING_REMOTE_SERVICE";
            } else {
                str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            if (i == 0) {
                str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            new StringBuilder(str2.length() + str.length() + 70);
            new Exception();
            LJIIJ(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZIZ(ConnectionResult connectionResult, C67718Qhu<?> c67718Qhu, boolean z) {
        if (!LJIILIIL(1)) {
            return;
        }
        LJIIJJI(connectionResult, c67718Qhu, z);
        if (LJIILJJIL()) {
            LJIIIZ();
        }
    }

    public final void LJIIJJI(ConnectionResult connectionResult, C67718Qhu<?> c67718Qhu, boolean z) {
        c67718Qhu.LIZ.getClass();
        if ((!z || connectionResult.LJJJJL() || this.LIZLLL.getErrorResolutionIntent(connectionResult.zzb) != null) && (this.LJ == null || Integer.MAX_VALUE < this.LJFF)) {
            this.LJ = connectionResult;
            this.LJFF = Integer.MAX_VALUE;
        }
        ((HashMap) this.LIZ.LJLJL).put(c67718Qhu.LIZIZ, connectionResult);
    }

    public C67761Qib(C67759QiZ c67759QiZ, C67736QiC c67736QiC, java.util.Map<C67718Qhu<?>, Boolean> map, C67258QaU c67258QaU, AbstractC67715Qhr<? extends InterfaceC67779Qit, C67725Qi1> abstractC67715Qhr, Lock lock, Context context) {
        this.LIZ = c67759QiZ;
        this.LJIIZILJ = c67736QiC;
        this.LJIJ = map;
        this.LIZLLL = c67258QaU;
        this.LJIJI = abstractC67715Qhr;
        this.LIZIZ = lock;
        this.LIZJ = context;
    }
}
