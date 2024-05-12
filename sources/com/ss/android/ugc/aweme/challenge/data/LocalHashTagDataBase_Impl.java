package com.ss.android.ugc.aweme.challenge.data;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.InterfaceC51573KLx;
import X.YX0;
import X.YX5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class LocalHashTagDataBase_Impl extends LocalHashTagDataBase {
    public volatile YX5 LJIIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "localHashTag");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC51573KLx.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase
    public final InterfaceC51573KLx LJIJ() {
        YX5 yx5;
        if (this.LJIIL != null) {
            return this.LJIIL;
        }
        synchronized (this) {
            if (this.LJIIL == null) {
                this.LJIIL = new YX5(this);
            }
            yx5 = this.LJIIL;
        }
        return yx5;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new YX0(this), "0fdb23fe113307f93af74ceea527f0a9", "606e3395020db78e36e0b235c6657129");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
