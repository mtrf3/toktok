package com.ss.android.ugc.aweme.offlinemode.database;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C87523YWp;
import X.C87524YWq;
import X.InterfaceC23730wT;
import X.InterfaceC26200AQa;
import X.InterfaceC262711j;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class OfflineModeFeedPBDataBase_Impl extends OfflineModeFeedPBDataBase {
    public volatile C87523YWp LJIILIIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "offline_mode_feed_pb");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC26200AQa.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase
    public final InterfaceC26200AQa LJIJ() {
        C87523YWp c87523YWp;
        if (this.LJIILIIL != null) {
            return this.LJIILIIL;
        }
        synchronized (this) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = new C87523YWp(this);
            }
            c87523YWp = this.LJIILIIL;
        }
        return c87523YWp;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87524YWq(this), "dcb159507d4c74ee870b9334529c1b8f", "8a5ed1d787016cae958f6282fc3c8d2f");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
