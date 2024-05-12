package com.ss.android.ugc.aweme.favorites.business.aweme;

import X.AnonymousClass884;
import X.C192517h1;
import X.C2063487y;
import X.C52535Kjb;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C76800UCe;
import X.C84578XHi;
import X.C84581XHl;
import X.C88F;
import X.EnumC2063587z;
import X.EnumC84576XHg;
import X.InterfaceC192527h2;
import X.InterfaceC2062687q;
import X.InterfaceC2062787r;
import X.InterfaceC88473Ynt;
import X.TBT;
import X.XI1;
import X.XI2;
import X.XI3;
import X.XI6;
import com.bytedance.mota.storage.motacache.IMotaCache;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionCountCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.IDqS439S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AwemeCollectionCountAgent extends XI6<Long> implements InterfaceC2062787r, C88F, InterfaceC192527h2 {
    public AwemeCollectionCountAgent() {
        super(C65352Pkq.LIZ(AwemeCollectionCountCache.class));
        int i;
        C84581XHl<?> c84581XHl;
        InterfaceC2062687q LJIIZILJ = AwemeCollectionAgent.LJIIZILJ();
        o.LJII(LJIIZILJ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier");
        AnonymousClass884 anonymousClass884 = (AnonymousClass884) LJIIZILJ;
        if (!C52535Kjb.LIZIZ()) {
            anonymousClass884.LJI(this);
            return;
        }
        XI3 xi3 = new TBT() { // from class: X.XI3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AwemeCollectionCountCache) obj).getState();
            }
        };
        IDqS439S0100000_15 iDqS439S0100000_15 = new IDqS439S0100000_15(this, 6);
        ReentrantReadWriteLock reentrantReadWriteLock = C84578XHi.LIZ;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterator<C84581XHl<?>> it = C84578XHi.LIZLLL.iterator();
            while (true) {
                if (it.hasNext()) {
                    c84581XHl = it.next();
                    C84581XHl<?> c84581XHl2 = c84581XHl;
                    if (o.LJ(c84581XHl2.LIZ, C65352Pkq.LIZ(AwemeCollectionCountCache.class)) && o.LJ(c84581XHl2.LIZIZ, xi3.getName()) && c84581XHl2.LIZJ == iDqS439S0100000_15) {
                        break;
                    }
                } else {
                    c84581XHl = null;
                    break;
                }
            }
            if (c84581XHl == null) {
                C84578XHi.LIZLLL.add(new C84581XHl<>(C65352Pkq.LIZ(AwemeCollectionCountCache.class), xi3.getName(), iDqS439S0100000_15));
            }
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public static C88F LJIILIIL() {
        Object LIZ = C58096Mr6.LIZ(C88F.class, false);
        if (LIZ != null) {
            return (C88F) LIZ;
        }
        if (C58096Mr6.w0 == null) {
            synchronized (C88F.class) {
                if (C58096Mr6.w0 == null) {
                    C58096Mr6.w0 = new AwemeCollectionCountAgent();
                }
            }
        }
        return C58096Mr6.w0;
    }

    public static InterfaceC2062787r LJIILJJIL() {
        Object LIZ = C58096Mr6.LIZ(InterfaceC2062787r.class, false);
        if (LIZ != null) {
            return (InterfaceC2062787r) LIZ;
        }
        if (C58096Mr6.w0 == null) {
            synchronized (InterfaceC2062787r.class) {
                if (C58096Mr6.w0 == null) {
                    C58096Mr6.w0 = new AwemeCollectionCountAgent();
                }
            }
        }
        return C58096Mr6.w0;
    }

    @Override // X.InterfaceC213128Ya
    public final Long LJIIIZ() {
        return 0L;
    }

    @Override // X.AnonymousClass884
    public final void LIZJ(InterfaceC88473Ynt<? super String, Object, ? super EnumC84576XHg, C76800UCe> interfaceC88473Ynt) {
        int i;
        if (interfaceC88473Ynt != null) {
            XI2 xi2 = new TBT() { // from class: X.XI2
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((AwemeCollectionCountCache) obj).getState();
                }
            };
            ReentrantReadWriteLock reentrantReadWriteLock = C84578XHi.LIZ;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                Iterator<C84581XHl<?>> it = C84578XHi.LIZLLL.iterator();
                while (it.hasNext()) {
                    C84581XHl<?> next = it.next();
                    if (o.LJ(next.LIZ, C65352Pkq.LIZ(AwemeCollectionCountCache.class)) && o.LJ(next.LIZIZ, xi2.getName()) && next.LIZJ == interfaceC88473Ynt) {
                        C84578XHi.LIZLLL.remove(next);
                    }
                }
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
    }

    @Override // X.AnonymousClass884
    public final void LJFF(InterfaceC88473Ynt<? super String, Object, ? super EnumC84576XHg, C76800UCe> subscriber) {
        int i;
        C84581XHl<?> c84581XHl;
        o.LJIIIZ(subscriber, "subscriber");
        XI1 xi1 = new TBT() { // from class: X.XI1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AwemeCollectionCountCache) obj).getState();
            }
        };
        ReentrantReadWriteLock reentrantReadWriteLock = C84578XHi.LIZ;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterator<C84581XHl<?>> it = C84578XHi.LIZLLL.iterator();
            while (true) {
                if (it.hasNext()) {
                    c84581XHl = it.next();
                    C84581XHl<?> c84581XHl2 = c84581XHl;
                    if (o.LJ(c84581XHl2.LIZ, C65352Pkq.LIZ(AwemeCollectionCountCache.class)) && o.LJ(c84581XHl2.LIZIZ, xi1.getName()) && c84581XHl2.LIZJ == subscriber) {
                        break;
                    }
                } else {
                    c84581XHl = null;
                    break;
                }
            }
            if (c84581XHl == null) {
                C84578XHi.LIZLLL.add(new C84581XHl<>(C65352Pkq.LIZ(AwemeCollectionCountCache.class), xi1.getName(), subscriber));
            }
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    @Override // X.XI6
    public final IMotaCache LJIIL(Object obj, String id) {
        long longValue = ((Number) obj).longValue();
        o.LJIIIZ(id, "id");
        return new AwemeCollectionCountCache(id, longValue);
    }

    @Override // X.AnonymousClass885
    public final void id(String str, Boolean bool, EnumC2063587z enumC2063587z) {
        C192517h1.LIZ(this, str, bool.booleanValue(), enumC2063587z);
    }

    @Override // X.InterfaceC192527h2
    public final void u8(String id, boolean z, EnumC2063587z source) {
        long j;
        AwemeStatistics statistics;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(source, "source");
        int i = C2063487y.LIZ[source.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LJLILLLLZI.LIZJ(LJ(id), id);
                Aweme i6 = AwemeService.LIZ().i6(id);
                if (i6 == null || (statistics = i6.getStatistics()) == null) {
                    return;
                }
                statistics.setCollectCount(LJ(id).longValue());
                return;
            }
            this.LJLILLLLZI.LIZLLL(id);
            return;
        }
        if (z) {
            j = 1;
        } else {
            j = -1;
        }
        this.LJLILLLLZI.LIZIZ(Long.valueOf(LJ(id).longValue() + j), id);
    }
}
