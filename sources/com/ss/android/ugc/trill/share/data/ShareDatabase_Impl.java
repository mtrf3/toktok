package com.ss.android.ugc.trill.share.data;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C87531YWx;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.InterfaceC62452OfA;
import X.YX3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class ShareDatabase_Impl extends ShareDatabase {
    public volatile YX3 LJIILL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "Record");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC62452OfA.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.trill.share.data.ShareDatabase
    public final InterfaceC62452OfA LJIJI() {
        YX3 yx3;
        if (this.LJIILL != null) {
            return this.LJIILL;
        }
        synchronized (this) {
            if (this.LJIILL == null) {
                this.LJIILL = new YX3(this);
            }
            yx3 = this.LJIILL;
        }
        return yx3;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87531YWx(this), "4e670bbb58b1cec9bfaaeb409ecedc0d", "c53d71306862fad59b3a3fe103512963");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
