package com.bytedance.android.livesdk.i18n.db;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C87529YWv;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.InterfaceC86882Y7y;
import X.Y82;
import X.YWX;
import X.YWY;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class I18nDatabase_Impl extends I18nDatabase {
    public volatile YWX LJIIL;
    public volatile YWY LJIILIIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "translation", "information");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC86882Y7y.class, Collections.emptyList());
        hashMap.put(Y82.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.bytedance.android.livesdk.i18n.db.I18nDatabase
    public final Y82 LJIJ() {
        YWY ywy;
        if (this.LJIILIIL != null) {
            return this.LJIILIIL;
        }
        synchronized (this) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = new YWY(this);
            }
            ywy = this.LJIILIIL;
        }
        return ywy;
    }

    @Override // com.bytedance.android.livesdk.i18n.db.I18nDatabase
    public final InterfaceC86882Y7y LJIJI() {
        YWX ywx;
        if (this.LJIIL != null) {
            return this.LJIIL;
        }
        synchronized (this) {
            if (this.LJIIL == null) {
                this.LJIIL = new YWX(this);
            }
            ywx = this.LJIIL;
        }
        return ywx;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87529YWv(this), "db08c04e8a10c6c1ddb9d9ab384c2f17", "e3af7f9b450df7204a5f65d0fd2a1eaa");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
