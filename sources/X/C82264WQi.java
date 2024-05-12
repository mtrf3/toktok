package X;

import Y.AfS66S0100000_14;
import Y.IDhS107S0100000_14;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.WQi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82264WQi implements InterfaceC82274WQs {
    public InterfaceC82275WQt LIZLLL;
    public final InterfaceC82272WQq LJFF;
    public final InterfaceC82271WQp LJI;
    public final InterfaceC139745e6<AbstractC48314Ixi> LJII;
    public final int LJIIIIZZ = 3;
    public final AbstractC73851Syd<C82263WQh> LIZ = new C73893SzJ().LJJZ();
    public final ConcurrentHashMap<Integer, RunnableC82267WQl> LIZIZ = new ConcurrentHashMap<>();
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1075));

    public final C73426Srm LJ() {
        AbstractC73851Syd<C82263WQh> abstractC73851Syd = this.LIZ;
        abstractC73851Syd.getClass();
        return new C73426Srm(abstractC73851Syd);
    }

    @Override // X.InterfaceC82274WQs
    public final void cancelAllDownload() {
        List<RunnableC82267WQl> LLJI;
        synchronized (this.LIZIZ) {
            Collection<RunnableC82267WQl> values = this.LIZIZ.values();
            o.LJIIIIZZ(values, "downloadTaskRegistry.values");
            LLJI = ORZ.LLJI(values);
            this.LIZIZ.clear();
        }
        for (RunnableC82267WQl runnableC82267WQl : LLJI) {
            runnableC82267WQl.LJLJJI.onNext(new C82263WQh(EnumC82257WQb.FAILED, runnableC82267WQl.LJLIL, null, null));
            runnableC82267WQl.LJLJJI.onComplete();
            Future<?> future = runnableC82267WQl.LJLJJLL;
            if (future != null) {
                future.cancel(true);
            }
        }
    }

    @Override // X.InterfaceC82274WQs
    public final C73849Syb LIZ(C79155V4t filterMeta) {
        o.LJIIIZ(filterMeta, "filterMeta");
        return LIZLLL(filterMeta, false);
    }

    @Override // X.InterfaceC82274WQs
    public final C73849Syb LIZIZ(C79155V4t filterMeta) {
        o.LJIIIZ(filterMeta, "filterMeta");
        return LIZLLL(filterMeta, true);
    }

    @Override // X.InterfaceC82274WQs
    public final EnumC82257WQb LIZJ(C79155V4t c79155V4t) {
        C73849Syb<C82263WQh> c73849Syb;
        C82263WQh LJJZZIII;
        RunnableC82267WQl runnableC82267WQl = this.LIZIZ.get(Integer.valueOf(c79155V4t.LIZ));
        if (runnableC82267WQl != null && (c73849Syb = runnableC82267WQl.LJLJJI) != null && (LJJZZIII = c73849Syb.LJJZZIII()) != null) {
            return LJJZZIII.LJLIL;
        }
        return null;
    }

    public final C73849Syb LIZLLL(C79155V4t c79155V4t, boolean z) {
        boolean z2;
        RunnableC82267WQl runnableC82267WQl;
        C82263WQh c82263WQh;
        synchronized (this.LIZIZ) {
            ConcurrentHashMap<Integer, RunnableC82267WQl> concurrentHashMap = this.LIZIZ;
            Integer valueOf = Integer.valueOf(c79155V4t.LIZ);
            RunnableC82267WQl runnableC82267WQl2 = concurrentHashMap.get(valueOf);
            if (runnableC82267WQl2 != null) {
                z2 = false;
            } else {
                runnableC82267WQl2 = new RunnableC82267WQl(c79155V4t, this.LIZJ.getAndIncrement(), new IDhS107S0100000_14(this, 1), new C73849Syb(), z);
                RunnableC82267WQl putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, runnableC82267WQl2);
                if (putIfAbsent != null) {
                    runnableC82267WQl2 = putIfAbsent;
                }
                z2 = true;
            }
            runnableC82267WQl = runnableC82267WQl2;
            c82263WQh = null;
            if ((z2 || runnableC82267WQl.LJLJJI.LJJZZIII() == null) && z) {
                runnableC82267WQl.LJLJJL = z;
                c82263WQh = new C82263WQh(EnumC82257WQb.PENDING, c79155V4t, null, null);
            }
        }
        if (c82263WQh != null) {
            runnableC82267WQl.LJLJJI.onNext(c82263WQh);
        }
        if (z2) {
            runnableC82267WQl.LJLJJI.LJJJ(T16.LIZ()).LJJJLIIL(new AfS66S0100000_14(this, 32), C73982T1u.LJLIL);
            runnableC82267WQl.LJLJJLL = ((ExecutorService) this.LJ.getValue()).submit(runnableC82267WQl);
        }
        return runnableC82267WQl.LJLJJI;
    }

    public C82264WQi(InterfaceC82272WQq interfaceC82272WQq, InterfaceC82271WQp interfaceC82271WQp, InterfaceC139745e6 interfaceC139745e6) {
        this.LJFF = interfaceC82272WQq;
        this.LJI = interfaceC82271WQp;
        this.LJII = interfaceC139745e6;
    }
}
