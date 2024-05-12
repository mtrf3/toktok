package X;

import Y.AfS64S0100000_12;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TOa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74560TOa<KEY, RESULT, INFO> implements TO9<KEY, RESULT, INFO> {
    public final int LJ;
    public final int LJI;
    public final AbstractC73851Syd<TO8> LIZ = new C73893SzJ().LJJZ();
    public final ConcurrentHashMap<String, RunnableC74561TOb<KEY, RESULT>> LIZIZ = new ConcurrentHashMap<>();
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C74571TOl.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1162));

    public abstract void LJFF(Object obj, TOZ toz);

    public abstract String LJI(KEY key);

    @Override // X.TO9
    public final C73426Srm LIZLLL() {
        AbstractC73851Syd<TO8> abstractC73851Syd = this.LIZ;
        abstractC73851Syd.getClass();
        return new C73426Srm(abstractC73851Syd);
    }

    public AbstractC74560TOa(int i) {
        this.LJI = i;
        this.LJ = Math.min((Runtime.getRuntime().availableProcessors() * 2) + 1, i);
    }

    @Override // X.TO9
    public final OSZ<EnumC74565TOf, Boolean> LIZJ(KEY key) {
        RunnableC74561TOb<KEY, RESULT> runnableC74561TOb = this.LIZIZ.get(LJI(key));
        EnumC74565TOf enumC74565TOf = null;
        if (runnableC74561TOb == null) {
            return null;
        }
        TO8 LJJZZIII = runnableC74561TOb.LJLIL.LJJZZIII();
        if (LJJZZIII != null) {
            enumC74565TOf = LJJZZIII.LJLIL;
        }
        return new OSZ<>(enumC74565TOf, Boolean.valueOf(runnableC74561TOb.LJLJJL));
    }

    public final void LJ(InterfaceC74566TOg<KEY, INFO> observer) {
        o.LJIIIZ(observer, "observer");
        C74563TOd c74563TOd = (C74563TOd) this.LIZLLL.getValue();
        c74563TOd.getClass();
        if (((ArrayList) c74563TOd.LIZ).contains(observer)) {
            return;
        }
        ((ArrayList) c74563TOd.LIZ).add(observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.TO9
    public final C73849Syb LIZIZ(Object obj, boolean z) {
        boolean z2;
        RunnableC74561TOb<KEY, RESULT> runnableC74561TOb;
        TO8 to8;
        synchronized (this.LIZIZ) {
            ConcurrentHashMap<String, RunnableC74561TOb<KEY, RESULT>> concurrentHashMap = this.LIZIZ;
            String LJI = LJI(obj);
            RunnableC74561TOb<KEY, RESULT> runnableC74561TOb2 = concurrentHashMap.get(LJI);
            if (runnableC74561TOb2 != null) {
                z2 = false;
            } else {
                runnableC74561TOb2 = new RunnableC74561TOb<>(obj, this.LIZJ.getAndIncrement(), new C74562TOc(this, (C74563TOd) this.LIZLLL.getValue()), z);
                RunnableC74561TOb<KEY, RESULT> putIfAbsent = concurrentHashMap.putIfAbsent(LJI, runnableC74561TOb2);
                if (putIfAbsent != null) {
                    runnableC74561TOb2 = putIfAbsent;
                }
                z2 = true;
            }
            runnableC74561TOb = runnableC74561TOb2;
            runnableC74561TOb.LJLJJL = z;
            to8 = null;
            if ((z2 || runnableC74561TOb.LJLIL.LJJZZIII() == null) && z) {
                runnableC74561TOb.LJLJJL = z;
                to8 = new TO8(EnumC74565TOf.PENDING, obj, null, null);
            }
            ((C74563TOd) this.LIZLLL.getValue()).LIZIZ(this.LIZIZ.size(), this.LJ, obj);
        }
        if (to8 != null) {
            runnableC74561TOb.LJLIL.onNext(to8);
        }
        if (z2) {
            runnableC74561TOb.LJLIL.LJJJ(T16.LIZ()).LJJJLIIL(new AfS64S0100000_12(this, 117), C73982T1u.LJLIL);
            runnableC74561TOb.LJLJJLL = ((ExecutorService) this.LJFF.getValue()).submit(runnableC74561TOb);
        }
        return runnableC74561TOb.LJLIL;
    }
}
