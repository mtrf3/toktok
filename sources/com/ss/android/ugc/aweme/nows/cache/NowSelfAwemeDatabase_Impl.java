package com.ss.android.ugc.aweme.nows.cache;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C87533YWz;
import X.InterfaceC195027l4;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.YX7;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class NowSelfAwemeDatabase_Impl extends NowSelfAwemeDatabase {
    public volatile YX7 LJIILIIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "now_self_aweme_cache");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC195027l4.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeDatabase
    public final InterfaceC195027l4 LJIJ() {
        YX7 yx7;
        if (this.LJIILIIL != null) {
            return this.LJIILIIL;
        }
        synchronized (this) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = new YX7(this);
            }
            yx7 = this.LJIILIIL;
        }
        return yx7;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87533YWz(this), "870d4cd8c31f56069a4ed14699f7f18b", "fea443c58d176c642caf02bc36c173aa");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
