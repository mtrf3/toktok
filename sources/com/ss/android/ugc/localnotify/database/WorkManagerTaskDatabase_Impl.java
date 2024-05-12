package com.ss.android.ugc.localnotify.database;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C68746QyU;
import X.C87519YWl;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.InterfaceC68487QuJ;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class WorkManagerTaskDatabase_Impl extends WorkManagerTaskDatabase {
    public volatile C68746QyU LJIILJJIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "workmanager_task");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC68487QuJ.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.localnotify.database.WorkManagerTaskDatabase
    public final InterfaceC68487QuJ LJIJ() {
        C68746QyU c68746QyU;
        if (this.LJIILJJIL != null) {
            return this.LJIILJJIL;
        }
        synchronized (this) {
            if (this.LJIILJJIL == null) {
                this.LJIILJJIL = new C68746QyU(this);
            }
            c68746QyU = this.LJIILJJIL;
        }
        return c68746QyU;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87519YWl(this), "6dd4eddad51a28e754515de777b23425", "6becf469740fb655e1ad996da0aa0003");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
