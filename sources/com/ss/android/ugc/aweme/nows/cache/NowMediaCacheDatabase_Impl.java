package com.ss.android.ugc.aweme.nows.cache;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C87510YWc;
import X.C87518YWk;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.InterfaceC81671W3n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class NowMediaCacheDatabase_Impl extends NowMediaCacheDatabase {
    public volatile C87510YWc LJIILIIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "now_media_cache");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC81671W3n.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.nows.cache.NowMediaCacheDatabase
    public final InterfaceC81671W3n LJIJ() {
        C87510YWc c87510YWc;
        if (this.LJIILIIL != null) {
            return this.LJIILIIL;
        }
        synchronized (this) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = new C87510YWc(this);
            }
            c87510YWc = this.LJIILIIL;
        }
        return c87510YWc;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87518YWk(this), "bf446c0383e9d6806fb4799bd2414938", "b49a2e02df3855fb81e4b679f295c0ba");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
