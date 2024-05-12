package com.ss.android.ugc.aweme.friendstab.cache;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C87520YWm;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.LW5;
import X.YWU;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class FriendsFeeRespDatabase_Impl extends FriendsFeeRespDatabase {
    public volatile YWU LJIILIIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "friends_feed_resp_cache");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(LW5.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.cache.FriendsFeeRespDatabase
    public final LW5 LJIJ() {
        YWU ywu;
        if (this.LJIILIIL != null) {
            return this.LJIILIIL;
        }
        synchronized (this) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = new YWU(this);
            }
            ywu = this.LJIILIIL;
        }
        return ywu;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87520YWm(this), "5f668dd49414fc71f4ae6f08222e15bd", "aced2fca3db659800b942ca2b024861f");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
