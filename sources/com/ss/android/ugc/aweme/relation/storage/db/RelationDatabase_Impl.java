package com.ss.android.ugc.aweme.relation.storage.db;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C68753Qyb;
import X.C68754Qyc;
import X.C87521YWn;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.InterfaceC787837i;
import X.InterfaceC789137v;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class RelationDatabase_Impl extends RelationDatabase {
    public volatile C68754Qyc LJIILIIL;
    public volatile C68753Qyb LJIILJJIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "maf_info", "user_info", "user_status");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC789137v.class, Collections.emptyList());
        hashMap.put(InterfaceC787837i.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase
    public final InterfaceC787837i LJIJ() {
        C68753Qyb c68753Qyb;
        if (this.LJIILJJIL != null) {
            return this.LJIILJJIL;
        }
        synchronized (this) {
            if (this.LJIILJJIL == null) {
                this.LJIILJJIL = new C68753Qyb(this);
            }
            c68753Qyb = this.LJIILJJIL;
        }
        return c68753Qyb;
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase
    public final InterfaceC789137v LJIJI() {
        C68754Qyc c68754Qyc;
        if (this.LJIILIIL != null) {
            return this.LJIILIIL;
        }
        synchronized (this) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = new C68754Qyc(this);
            }
            c68754Qyc = this.LJIILIIL;
        }
        return c68754Qyc;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87521YWn(this), "f75f2d2e74b409761abba7970ba9bb1b", "3cf942b7b80d0268cb3398705318a429");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
