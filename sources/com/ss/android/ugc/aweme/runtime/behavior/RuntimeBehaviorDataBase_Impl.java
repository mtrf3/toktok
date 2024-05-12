package com.ss.android.ugc.aweme.runtime.behavior;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C87530YWw;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.InterfaceC43179Gx5;
import X.YWV;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class RuntimeBehaviorDataBase_Impl extends RuntimeBehaviorDataBase {
    public volatile YWV LJIIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "runtimeBehaviorEntity");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC43179Gx5.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase
    public final InterfaceC43179Gx5 LJIJ() {
        YWV ywv;
        if (this.LJIIL != null) {
            return this.LJIIL;
        }
        synchronized (this) {
            if (this.LJIIL == null) {
                this.LJIIL = new YWV(this);
            }
            ywv = this.LJIIL;
        }
        return ywv;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87530YWw(this), "977ffca18b985d80d9f488e58c9d7da9", "3d4bcb8798a8e5184ae76e79c3f54456");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
