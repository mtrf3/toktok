package com.ss.android.ugc.aweme.friendstab.db;

import X.AbstractC23740wU;
import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.InterfaceC23730wT;
import X.InterfaceC262711j;
import X.InterfaceC54862Lg2;
import X.YX1;
import X.YX2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public final class AwemeRecordDatabase_Impl extends AwemeRecordDatabase {
    public volatile YX2 LJIILJJIL;

    @Override // X.AbstractC03300Ba
    public final List LJII() {
        return Arrays.asList(new AbstractC23740wU[0]);
    }

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(0), new HashMap(0), "AWEME_READ_RECORD");
    }

    @Override // X.AbstractC03300Ba
    public final Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return new HashSet();
    }

    @Override // X.AbstractC03300Ba
    public final Map<Class<?>, List<Class<?>>> LJIIIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC54862Lg2.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.db.AwemeRecordDatabase
    public final InterfaceC54862Lg2 LJIJ() {
        YX2 yx2;
        if (this.LJIILJJIL != null) {
            return this.LJIILJJIL;
        }
        synchronized (this) {
            if (this.LJIILJJIL == null) {
                this.LJIILJJIL = new YX2(this);
            }
            yx2 = this.LJIILJJIL;
        }
        return yx2;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new YX1(this), "a57aa84ce150ca7ad0d33000cf2b3224", "8532c62a33f6fe7920fcdcaf335b9a8e");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
