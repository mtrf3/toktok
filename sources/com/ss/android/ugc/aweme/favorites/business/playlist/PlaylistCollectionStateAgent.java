package com.ss.android.ugc.aweme.favorites.business.playlist;

import X.C52535Kjb;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C76800UCe;
import X.C84578XHi;
import X.C84581XHl;
import X.C84585XHp;
import X.C84586XHq;
import X.C84587XHr;
import X.C84588XHs;
import X.C84594XHy;
import X.C84595XHz;
import X.C88E;
import X.C88H;
import X.EnumC84576XHg;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import X.M87;
import X.TBT;
import X.XGC;
import X.XGD;
import X.XI0;
import X.XI4;
import X.XI5;
import com.bytedance.mota.storage.motacache.IMotaCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistFavoriteCache;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.IDqS439S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PlaylistCollectionStateAgent extends XGD<Boolean> implements M87, C88E, C88H {
    public PlaylistCollectionStateAgent() {
        super(C65352Pkq.LIZ(PlaylistFavoriteCache.class));
        int i;
        C84581XHl<?> c84581XHl;
        if (C52535Kjb.LIZIZ()) {
            XI0 xi0 = new TBT() { // from class: X.XI0
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((PlaylistFavoriteCache) obj).getState();
                }
            };
            IDqS439S0100000_15 iDqS439S0100000_15 = new IDqS439S0100000_15(this, 7);
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
                        if (o.LJ(c84581XHl2.LIZ, C65352Pkq.LIZ(PlaylistFavoriteCache.class)) && o.LJ(c84581XHl2.LIZIZ, xi0.getName()) && c84581XHl2.LIZJ == iDqS439S0100000_15) {
                            break;
                        }
                    } else {
                        c84581XHl = null;
                        break;
                    }
                }
                if (c84581XHl == null) {
                    C84578XHi.LIZLLL.add(new C84581XHl<>(C65352Pkq.LIZ(PlaylistFavoriteCache.class), xi0.getName(), iDqS439S0100000_15));
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

    public static M87 LJIILLIIL() {
        Object LIZ = C58096Mr6.LIZ(M87.class, false);
        if (LIZ != null) {
            return (M87) LIZ;
        }
        if (C58096Mr6.x0 == null) {
            synchronized (M87.class) {
                if (C58096Mr6.x0 == null) {
                    C58096Mr6.x0 = new PlaylistCollectionStateAgent();
                }
            }
        }
        return C58096Mr6.x0;
    }

    public static C88H LJIIZILJ() {
        Object LIZ = C58096Mr6.LIZ(C88H.class, false);
        if (LIZ != null) {
            return (C88H) LIZ;
        }
        if (C58096Mr6.x0 == null) {
            synchronized (C88H.class) {
                if (C58096Mr6.x0 == null) {
                    C58096Mr6.x0 = new PlaylistCollectionStateAgent();
                }
            }
        }
        return C58096Mr6.x0;
    }

    public static C88E LJIJ() {
        Object LIZ = C58096Mr6.LIZ(C88E.class, false);
        if (LIZ != null) {
            return (C88E) LIZ;
        }
        if (C58096Mr6.x0 == null) {
            synchronized (C88E.class) {
                if (C58096Mr6.x0 == null) {
                    C58096Mr6.x0 = new PlaylistCollectionStateAgent();
                }
            }
        }
        return C58096Mr6.x0;
    }

    @Override // X.InterfaceC213128Ya
    public final Boolean LJIIIZ() {
        return Boolean.FALSE;
    }

    @Override // X.AnonymousClass884
    public final void LIZJ(InterfaceC88473Ynt<? super String, Object, ? super EnumC84576XHg, C76800UCe> interfaceC88473Ynt) {
        int i;
        if (interfaceC88473Ynt != null) {
            C84595XHz c84595XHz = new TBT() { // from class: X.XHz
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((PlaylistFavoriteCache) obj).getState();
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
                    if (o.LJ(next.LIZ, C65352Pkq.LIZ(PlaylistFavoriteCache.class)) && o.LJ(next.LIZIZ, c84595XHz.getName()) && next.LIZJ == interfaceC88473Ynt) {
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
        C84594XHy c84594XHy = new TBT() { // from class: X.XHy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PlaylistFavoriteCache) obj).getState();
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
                    if (o.LJ(c84581XHl2.LIZ, C65352Pkq.LIZ(PlaylistFavoriteCache.class)) && o.LJ(c84581XHl2.LIZIZ, c84594XHy.getName()) && c84581XHl2.LIZJ == subscriber) {
                        break;
                    }
                } else {
                    c84581XHl = null;
                    break;
                }
            }
            if (c84581XHl == null) {
                C84578XHi.LIZLLL.add(new C84581XHl<>(C65352Pkq.LIZ(PlaylistFavoriteCache.class), c84594XHy.getName(), subscriber));
            }
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    @Override // X.XGD
    public final Object LJIILL(Object obj) {
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }

    @Override // X.XI6
    public final IMotaCache LJIIL(Object obj, String id) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(id, "id");
        return new PlaylistFavoriteCache(id, booleanValue);
    }

    @Override // X.C87Q
    public final void LIZLLL(String id, Map<String, Object> map, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIIZ(id, "id");
        LJIILIIL(id, new C84588XHs(id), new XI5(new BaseResponse()), interfaceC88471Ynr, interfaceC88471Ynr2, C84586XHq.LJLIL, new XGC(this));
    }

    @Override // X.C87Q
    public final void LJII(String id, Map<String, Object> map, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIIZ(id, "id");
        LJIILIIL(id, new C84587XHr(id), new XI4(new BaseResponse()), interfaceC88471Ynr, interfaceC88471Ynr2, C84585XHp.LJLIL, new XGC(this));
    }
}
