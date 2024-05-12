package com.ss.android.ugc.aweme.contact.data.base;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C3ZL;
import X.C87516YWi;
import X.C87517YWj;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.YWD;
import X.YWW;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class IMContactDatabase_Impl extends IMContactDatabase {
    public volatile C87516YWi LJIILJJIL;
    public volatile YWW LJIILL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "IM_USER_BASE_INFO", "SHARE_PERMISSION");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(C3ZL.class, Collections.emptyList());
        hashMap.put(YWD.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.contact.data.base.IMContactDatabase
    public final C3ZL LJIJ() {
        C87516YWi c87516YWi;
        if (this.LJIILJJIL != null) {
            return this.LJIILJJIL;
        }
        synchronized (this) {
            if (this.LJIILJJIL == null) {
                this.LJIILJJIL = new C87516YWi(this);
            }
            c87516YWi = this.LJIILJJIL;
        }
        return c87516YWi;
    }

    @Override // com.ss.android.ugc.aweme.contact.data.base.IMContactDatabase
    public final YWD LJIJI() {
        YWW yww;
        if (this.LJIILL != null) {
            return this.LJIILL;
        }
        synchronized (this) {
            if (this.LJIILL == null) {
                this.LJIILL = new YWW(this);
            }
            yww = this.LJIILL;
        }
        return yww;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87517YWj(this), "2faafbedb9959c92d9cd62ef208e804e", "17a40560ccec0c71e5cbb52e573cc541");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
