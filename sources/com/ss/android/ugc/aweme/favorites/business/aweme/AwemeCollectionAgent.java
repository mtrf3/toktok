package com.ss.android.ugc.aweme.favorites.business.aweme;

import X.C16880lQ;
import X.C203747z8;
import X.C203897zN;
import X.C203917zP;
import X.C203927zQ;
import X.C52535Kjb;
import X.C58096Mr6;
import X.C62982da;
import X.C65352Pkq;
import X.C76800UCe;
import X.C84578XHi;
import X.C84581XHl;
import X.C84584XHo;
import X.C84591XHv;
import X.C84592XHw;
import X.C84593XHx;
import X.C87U;
import X.C88G;
import X.EnumC84576XHg;
import X.InterfaceC2062687q;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import X.M8L;
import X.TBT;
import X.XGD;
import X.XKQ;
import X.XKX;
import com.bytedance.mota.storage.motacache.IMotaCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeFavoriteCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.IDqS439S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AwemeCollectionAgent extends XGD<Boolean> implements C87U, InterfaceC2062687q, C88G {
    public AwemeCollectionAgent() {
        super(C65352Pkq.LIZ(AwemeFavoriteCache.class));
        int i;
        C84581XHl<?> c84581XHl;
        if (C52535Kjb.LIZIZ()) {
            C84593XHx c84593XHx = new TBT() { // from class: X.XHx
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((AwemeFavoriteCache) obj).getState();
                }
            };
            IDqS439S0100000_15 iDqS439S0100000_15 = new IDqS439S0100000_15(this, 5);
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
                        if (o.LJ(c84581XHl2.LIZ, C65352Pkq.LIZ(AwemeFavoriteCache.class)) && o.LJ(c84581XHl2.LIZIZ, c84593XHx.getName()) && c84581XHl2.LIZJ == iDqS439S0100000_15) {
                            break;
                        }
                    } else {
                        c84581XHl = null;
                        break;
                    }
                }
                if (c84581XHl == null) {
                    C84578XHi.LIZLLL.add(new C84581XHl<>(C65352Pkq.LIZ(AwemeFavoriteCache.class), c84593XHx.getName(), iDqS439S0100000_15));
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

    public static C88G LJIILLIIL() {
        Object LIZ = C58096Mr6.LIZ(C88G.class, false);
        if (LIZ != null) {
            return (C88G) LIZ;
        }
        if (C58096Mr6.v0 == null) {
            synchronized (C88G.class) {
                if (C58096Mr6.v0 == null) {
                    C58096Mr6.v0 = new AwemeCollectionAgent();
                }
            }
        }
        return C58096Mr6.v0;
    }

    public static InterfaceC2062687q LJIIZILJ() {
        Object LIZ = C58096Mr6.LIZ(InterfaceC2062687q.class, false);
        if (LIZ != null) {
            return (InterfaceC2062687q) LIZ;
        }
        if (C58096Mr6.v0 == null) {
            synchronized (InterfaceC2062687q.class) {
                if (C58096Mr6.v0 == null) {
                    C58096Mr6.v0 = new AwemeCollectionAgent();
                }
            }
        }
        return C58096Mr6.v0;
    }

    public static C87U LJIJ() {
        Object LIZ = C58096Mr6.LIZ(C87U.class, false);
        if (LIZ != null) {
            return (C87U) LIZ;
        }
        if (C58096Mr6.v0 == null) {
            synchronized (C87U.class) {
                if (C58096Mr6.v0 == null) {
                    C58096Mr6.v0 = new AwemeCollectionAgent();
                }
            }
        }
        return C58096Mr6.v0;
    }

    @Override // X.InterfaceC213128Ya
    public final Boolean LJIIIZ() {
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC2062687q
    public final Boolean LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return Boolean.FALSE;
        }
        String id = aweme.getAid();
        o.LJIIIIZZ(id, "id");
        return LJ(id);
    }

    @Override // X.AnonymousClass884
    public final void LIZJ(InterfaceC88473Ynt<? super String, Object, ? super EnumC84576XHg, C76800UCe> interfaceC88473Ynt) {
        int i;
        if (interfaceC88473Ynt != null) {
            C84592XHw c84592XHw = new TBT() { // from class: X.XHw
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((AwemeFavoriteCache) obj).getState();
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
                    if (o.LJ(next.LIZ, C65352Pkq.LIZ(AwemeFavoriteCache.class)) && o.LJ(next.LIZIZ, c84592XHw.getName()) && next.LIZJ == interfaceC88473Ynt) {
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
        C84591XHv c84591XHv = new TBT() { // from class: X.XHv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AwemeFavoriteCache) obj).getState();
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
                    if (o.LJ(c84581XHl2.LIZ, C65352Pkq.LIZ(AwemeFavoriteCache.class)) && o.LJ(c84581XHl2.LIZIZ, c84591XHv.getName()) && c84581XHl2.LIZJ == subscriber) {
                        break;
                    }
                } else {
                    c84581XHl = null;
                    break;
                }
            }
            if (c84581XHl == null) {
                C84578XHi.LIZLLL.add(new C84581XHl<>(C65352Pkq.LIZ(AwemeFavoriteCache.class), c84591XHv.getName(), subscriber));
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
        return new AwemeFavoriteCache(id, booleanValue);
    }

    @Override // X.C87Q
    public final void LIZLLL(String id, Map<String, Object> map, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr2) {
        Object obj;
        int i;
        o.LJIIIZ(id, "id");
        if (map != null) {
            obj = map.get("privacy_setting");
        } else {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        LJIJI(id, false, i, interfaceC88471Ynr, interfaceC88471Ynr2);
    }

    @Override // X.C87Q
    public final void LJII(String id, Map<String, Object> map, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr2) {
        Object obj;
        int i;
        o.LJIIIZ(id, "id");
        if (map != null) {
            obj = map.get("privacy_setting");
        } else {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        LJIJI(id, true, i, interfaceC88471Ynr, interfaceC88471Ynr2);
    }

    public final void LJIJI(String str, boolean z, int i, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr2) {
        C203897zN c203897zN;
        XKQ LIZLLL = XKX.LIZLLL(this.LJLJI, null, null, new C62982da(null), 3);
        if (z) {
            c203897zN = new C203897zN(str, 1, i);
        } else {
            c203897zN = new C203897zN(str, 0, i);
        }
        C203917zP c203917zP = new C203917zP(new BaseResponse());
        C203747z8 c203747z8 = new C203747z8(interfaceC88471Ynr2, str, this, z, LIZLLL);
        AqS164S0200000_1 aqS164S0200000_1 = new AqS164S0200000_1(interfaceC88471Ynr, LIZLLL, 0);
        C203927zQ c203927zQ = C203927zQ.LJLIL;
        String LLLZ = C16880lQ.LLLZ("/aweme/v1/aweme/collect/", Arrays.copyOf(new Object[0], 0));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        M8L.LIZ(LLLZ);
        LJIILIIL(str, c203897zN, c203917zP, aqS164S0200000_1, c203747z8, c203927zQ, new C84584XHo(str, this, z));
    }
}
