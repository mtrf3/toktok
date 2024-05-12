package X;

import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.XEp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84507XEp {
    public static InterfaceC84498XEg LJIIIZ;
    public final InterfaceC84511XEt LIZ;
    public final AtomicInteger LJII;
    public final Queue<Effect> LIZIZ = new ConcurrentLinkedQueue();
    public final Queue<Effect> LIZJ = new ConcurrentLinkedQueue();
    public final Queue<Effect> LIZLLL = new ConcurrentLinkedQueue();
    public final List<InterfaceC84510XEs> LJ = FII.LIZ();
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final Handler LJIIIIZZ = new Handler(C16880lQ.LLJJJJ());

    public final void LJIIIZ() {
        Effect effect;
        boolean z = true;
        while (this.LJI.get() && this.LJII.get() > 0 && z) {
            if (!((ConcurrentLinkedQueue) this.LIZJ).isEmpty()) {
                effect = (Effect) ((ConcurrentLinkedQueue) this.LIZJ).poll();
            } else {
                if (!((ConcurrentLinkedQueue) this.LIZLLL).isEmpty()) {
                    if (this.LIZ.LIZ()) {
                        this.LIZ.LIZIZ(this.LIZIZ);
                    } else {
                        effect = (Effect) ((ConcurrentLinkedQueue) this.LIZLLL).poll();
                    }
                } else if (this.LIZ.LIZ()) {
                    this.LIZ.LIZIZ(this.LIZIZ);
                }
                z = false;
                this.LJI.set(!((ConcurrentLinkedQueue) this.LIZIZ).isEmpty());
            }
            if (effect != null) {
                if (!((ConcurrentLinkedQueue) this.LIZIZ).contains(effect)) {
                    ((ConcurrentLinkedQueue) this.LIZIZ).add(effect);
                    this.LJII.decrementAndGet();
                    LIZ(effect);
                    if (C52312Kg0.LIZ()) {
                        InterfaceC84498XEg LIZ = C170256mD.LIZ();
                        if (LIZ != null) {
                            LIZ.LIZJ(effect, true, true, true, new C44463Hch(new C44367Hb9(new C84508XEq(this, effect))));
                        }
                    } else {
                        InterfaceC84498XEg LIZ2 = C170256mD.LIZ();
                        if (LIZ2 != null) {
                            LIZ2.fetchEffect(effect, new C44463Hch(new C44367Hb9(new C84509XEr(this, effect))));
                        }
                    }
                }
                z = true;
                this.LJI.set(!((ConcurrentLinkedQueue) this.LIZIZ).isEmpty());
            }
            z = false;
            this.LJI.set(!((ConcurrentLinkedQueue) this.LIZIZ).isEmpty());
        }
    }

    public final void LJFF() {
        InterfaceC84498XEg LIZ = C170256mD.LIZ();
        if (LIZ != null) {
            LIZ.destroy();
        }
        LJIIIZ = null;
        ((ConcurrentLinkedQueue) this.LIZIZ).clear();
        ((ConcurrentLinkedQueue) this.LIZJ).clear();
        this.LJ.clear();
        this.LJI.set(false);
    }

    public static boolean LJ(Effect effect) {
        InterfaceC84498XEg LIZ;
        o.LJIIIZ(effect, "effect");
        if (!o.LJ(effect.getUnzipPath(), effect.getZipPath()) && ((LIZ = C170256mD.LIZ()) == null || !LIZ.LJJIJLIJ(effect))) {
            return false;
        }
        return true;
    }

    public final void LIZ(Effect effect) {
        this.LIZ.LJFF();
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            this.LJIIIIZZ.post(new ARunnableS34S0200000_15(this, effect, 62));
            return;
        }
        List<InterfaceC84510XEs> mCallbacks = this.LJ;
        o.LJIIIIZZ(mCallbacks, "mCallbacks");
        Iterator<InterfaceC84510XEs> it = mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().LLJJLIIIJLLLLLLLZ(effect);
        }
    }

    public final void LIZIZ(Effect effect) {
        if (effect == null) {
            return;
        }
        if (!((ConcurrentLinkedQueue) this.LIZJ).contains(effect) && !((ConcurrentLinkedQueue) this.LIZIZ).contains(effect)) {
            ((ConcurrentLinkedQueue) this.LIZJ).add(effect);
        }
        LIZ(effect);
        if (!this.LJI.get()) {
            this.LJIIIIZZ.post(new ARunnableS51S0100000_15(this, 126));
        }
    }

    public final boolean LIZJ(EffectModel effectModel) {
        String str;
        Iterator it = ((ConcurrentLinkedQueue) this.LIZIZ).iterator();
        while (it.hasNext()) {
            com.ss.ugc.effectplatform.model.Effect effect = (com.ss.ugc.effectplatform.model.Effect) it.next();
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            if (o.LJ(str, effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZLLL(EffectModel effectModel) {
        String str;
        Iterator it = ((ConcurrentLinkedQueue) this.LIZJ).iterator();
        while (it.hasNext()) {
            com.ss.ugc.effectplatform.model.Effect effect = (com.ss.ugc.effectplatform.model.Effect) it.next();
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            if (o.LJ(str, effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIIIZZ(List<? extends Effect> effects) {
        o.LJIIIZ(effects, "effects");
        Iterator it = ((ArrayList) effects).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((ConcurrentLinkedQueue) this.LIZLLL).contains(next)) {
                ((ConcurrentLinkedQueue) this.LIZLLL).add(next);
            }
        }
        this.LJI.set(true);
        this.LJFF.set(true);
        LJIIIZ();
    }

    public C84507XEp(int i, InterfaceC84511XEt interfaceC84511XEt) {
        this.LIZ = interfaceC84511XEt;
        this.LJII = new AtomicInteger(i);
    }

    public final void LJII(Effect rawEffect, Effect effect) {
        ((ConcurrentLinkedQueue) this.LIZIZ).remove(rawEffect);
        this.LJII.incrementAndGet();
        o.LJIIIZ(rawEffect, "rawEffect");
        this.LIZ.LJFF();
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            this.LJIIIIZZ.post(new ARunnableS34S0200000_15(this, rawEffect, effect, 64));
        } else {
            List<InterfaceC84510XEs> mCallbacks = this.LJ;
            o.LJIIIIZZ(mCallbacks, "mCallbacks");
            Iterator<InterfaceC84510XEs> it = mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().pl(rawEffect);
            }
        }
        this.LJI.set(true);
        this.LJIIIIZZ.post(new ARunnableS51S0100000_15(this, 127));
    }

    public final void LJI(Effect effect, Effect effect2, ExceptionResult exceptionResult) {
        String str;
        ((ConcurrentLinkedQueue) this.LIZIZ).remove(effect);
        this.LJII.incrementAndGet();
        this.LIZ.LJFF();
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            this.LJIIIIZZ.post(new ARunnableS34S0200000_15(this, effect2, exceptionResult, 63));
        } else {
            List<InterfaceC84510XEs> mCallbacks = this.LJ;
            o.LJIIIIZZ(mCallbacks, "mCallbacks");
            Iterator<InterfaceC84510XEs> it = mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().P3(effect2);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(o.LJ(effect, effect2));
        LIZ.append(", name: ");
        if (effect2 != null) {
            str = effect2.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", download failed, reason: ");
        LIZ.append(exceptionResult.getMsg());
        LIZ.append(", ");
        LIZ.append(android.util.Log.getStackTraceString(exceptionResult.getException()));
        X1D.LIZIZ(LIZ);
        this.LJI.set(!((ConcurrentLinkedQueue) this.LIZIZ).isEmpty());
    }
}
