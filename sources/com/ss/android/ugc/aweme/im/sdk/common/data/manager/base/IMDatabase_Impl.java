package com.ss.android.ugc.aweme.im.sdk.common.data.manager.base;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C3FV;
import X.C3WD;
import X.C87511YWd;
import X.C87512YWe;
import X.C87515YWh;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.InterfaceC86133Zp;
import X.R1T;
import X.YWB;
import X.YX4;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class IMDatabase_Impl extends IMDatabase {
    public volatile R1T LJIIZILJ;
    public volatile C87511YWd LJIJ;
    public volatile YX4 LJIJI;
    public volatile C87512YWe LJIJJ;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "FRIENDS_RELATION", "SIMPLE_USER", "RECENT_SHARE", "MAF_USER");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC86133Zp.class, Collections.emptyList());
        hashMap.put(YWB.class, Collections.emptyList());
        hashMap.put(C3WD.class, Collections.emptyList());
        hashMap.put(C3FV.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.data.manager.base.IMDatabase
    public final InterfaceC86133Zp LJIJ() {
        R1T r1t;
        if (this.LJIIZILJ != null) {
            return this.LJIIZILJ;
        }
        synchronized (this) {
            if (this.LJIIZILJ == null) {
                this.LJIIZILJ = new R1T(this);
            }
            r1t = this.LJIIZILJ;
        }
        return r1t;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.data.manager.base.IMDatabase
    public final YWB LJIJI() {
        C87511YWd c87511YWd;
        if (this.LJIJ != null) {
            return this.LJIJ;
        }
        synchronized (this) {
            if (this.LJIJ == null) {
                this.LJIJ = new C87511YWd(this);
            }
            c87511YWd = this.LJIJ;
        }
        return c87511YWd;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.data.manager.base.IMDatabase
    public final C3FV LJIJJ() {
        C87512YWe c87512YWe;
        if (this.LJIJJ != null) {
            return this.LJIJJ;
        }
        synchronized (this) {
            if (this.LJIJJ == null) {
                this.LJIJJ = new C87512YWe(this);
            }
            c87512YWe = this.LJIJJ;
        }
        return c87512YWe;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.data.manager.base.IMDatabase
    public final C3WD LJIJJLI() {
        YX4 yx4;
        if (this.LJIJI != null) {
            return this.LJIJI;
        }
        synchronized (this) {
            if (this.LJIJI == null) {
                this.LJIJI = new YX4(this);
            }
            yx4 = this.LJIJI;
        }
        return yx4;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87515YWh(this), "0e004879a565543b4eee8d6aa86e7657", "c082af4e356d64bbb54e24752b901955");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
