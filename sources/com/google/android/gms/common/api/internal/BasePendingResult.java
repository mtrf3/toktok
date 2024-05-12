package com.google.android.gms.common.api.internal;

import X.AbstractC67709Qhl;
import X.AbstractC67744QiK;
import X.C16880lQ;
import X.C67752QiS;
import X.C67753QiT;
import X.EGZ;
import X.HandlerC67747QiN;
import X.InterfaceC67740QiG;
import X.InterfaceC67745QiL;
import X.InterfaceC67754QiU;
import X.InterfaceC67755QiV;
import X.QH7;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public abstract class BasePendingResult<R extends InterfaceC67754QiU> extends AbstractC67744QiK<R> {
    public static final EGZ LJIILIIL = new EGZ();
    public final Object LIZ;
    public final HandlerC67747QiN<R> LIZIZ;
    public final WeakReference<AbstractC67709Qhl> LIZJ;
    public final CountDownLatch LIZLLL;
    public final ArrayList<InterfaceC67745QiL> LJ;
    public InterfaceC67740QiG<? super R> LJFF;
    public final AtomicReference<C67753QiT> LJI;
    public R LJII;
    public Status LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public C67752QiS mResultGuardian;

    public abstract R LJ(Status status);

    public final void LIZLLL() {
        synchronized (this.LIZ) {
            if (this.LJIIJ || this.LJIIIZ) {
                return;
            }
            LJIIL(this.LJII);
            this.LJIIJ = true;
            LJIIJ(LJ(Status.RESULT_CANCELED));
        }
    }

    public final boolean LJI() {
        boolean z;
        synchronized (this.LIZ) {
            z = this.LJIIJ;
        }
        return z;
    }

    public final boolean LJII() {
        if (this.LIZLLL.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final R LJIIIZ() {
        R r;
        synchronized (this.LIZ) {
            QH7.LJIIJ("Result has already been consumed.", !this.LJIIIZ);
            QH7.LJIIJ("Result is not ready.", LJII());
            r = this.LJII;
            this.LJII = null;
            this.LJFF = null;
            this.LJIIIZ = true;
        }
        C67753QiT andSet = this.LJI.getAndSet(null);
        if (andSet != null) {
            andSet.LIZ.LIZ.remove(this);
        }
        QH7.LJIIIIZZ(r);
        return r;
    }

    public final void LJIIJJI() {
        boolean z;
        if (this.LJIIL || LJIILIIL.get().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIL = z;
    }

    public BasePendingResult() {
        this.LIZ = new Object();
        this.LIZLLL = new CountDownLatch(1);
        this.LJ = new ArrayList<>();
        this.LJI = new AtomicReference<>();
        this.LJIIL = false;
        this.LIZIZ = new HandlerC67747QiN<>(C16880lQ.LLJJJJ());
        this.LIZJ = new WeakReference<>(null);
    }

    public BasePendingResult(AbstractC67709Qhl abstractC67709Qhl) {
        Looper LLJJJJ;
        this.LIZ = new Object();
        this.LIZLLL = new CountDownLatch(1);
        this.LJ = new ArrayList<>();
        this.LJI = new AtomicReference<>();
        this.LJIIL = false;
        if (abstractC67709Qhl != null) {
            LLJJJJ = abstractC67709Qhl.LJIIIZ();
        } else {
            LLJJJJ = C16880lQ.LLJJJJ();
        }
        this.LIZIZ = new HandlerC67747QiN<>(LLJJJJ);
        this.LIZJ = new WeakReference<>(abstractC67709Qhl);
    }

    public static void LJIIL(InterfaceC67754QiU interfaceC67754QiU) {
        if (interfaceC67754QiU instanceof InterfaceC67755QiV) {
            try {
                ((InterfaceC67755QiV) interfaceC67754QiU).release();
            } catch (RuntimeException unused) {
                String.valueOf(interfaceC67754QiU);
            }
        }
    }

    @Override // X.AbstractC67744QiK
    public final void LIZIZ(InterfaceC67740QiG<? super R> interfaceC67740QiG) {
        synchronized (this.LIZ) {
            QH7.LJIIJ("Result has already been consumed.", !this.LJIIIZ);
            if (LJI()) {
                return;
            }
            if (LJII()) {
                this.LIZIZ.LIZ(interfaceC67740QiG, LJIIIZ());
            } else {
                this.LJFF = interfaceC67740QiG;
            }
        }
    }

    public final void LIZJ(InterfaceC67745QiL interfaceC67745QiL) {
        synchronized (this.LIZ) {
            if (LJII()) {
                interfaceC67745QiL.LIZ(this.LJIIIIZZ);
            } else {
                this.LJ.add(interfaceC67745QiL);
            }
        }
    }

    public final void LJFF(Status status) {
        synchronized (this.LIZ) {
            if (!LJII()) {
                LIZ(LJ(status));
                this.LJIIJJI = true;
            }
        }
    }

    @Override // X.InterfaceC68012Qme
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void LIZ(R r) {
        synchronized (this.LIZ) {
            if (!this.LJIIJJI && !this.LJIIJ) {
                LJII();
                QH7.LJIIJ("Results have already been set", !LJII());
                QH7.LJIIJ("Result has already been consumed", !this.LJIIIZ);
                LJIIJ(r);
                return;
            }
            LJIIL(r);
        }
    }

    public final void LJIIJ(R r) {
        this.LJII = r;
        this.LJIIIIZZ = r.getStatus();
        this.LIZLLL.countDown();
        if (this.LJIIJ) {
            this.LJFF = null;
        } else {
            InterfaceC67740QiG<? super R> interfaceC67740QiG = this.LJFF;
            if (interfaceC67740QiG == null) {
                if (this.LJII instanceof InterfaceC67755QiV) {
                    this.mResultGuardian = new C67752QiS(this);
                }
            } else {
                this.LIZIZ.removeMessages(2);
                this.LIZIZ.LIZ(interfaceC67740QiG, LJIIIZ());
            }
        }
        ArrayList<InterfaceC67745QiL> arrayList = this.LJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC67745QiL) ListProtector.get(arrayList, i)).LIZ(this.LJIIIIZZ);
        }
        this.LJ.clear();
    }

    public BasePendingResult(Looper looper) {
        this.LIZ = new Object();
        this.LIZLLL = new CountDownLatch(1);
        this.LJ = new ArrayList<>();
        this.LJI = new AtomicReference<>();
        this.LJIIL = false;
        this.LIZIZ = new HandlerC67747QiN<>(looper);
        this.LIZJ = new WeakReference<>(null);
    }
}
