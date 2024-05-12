package com.ss.android.ugc.aweme.service;

import X.A6Z;
import X.C58096Mr6;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class PaidContentCollectionPlayProgressServiceImpl implements IPaidContentCollectionPlayProgressService {
    public final Map<String, A6Z> LIZ = new LinkedHashMap();
    public double LIZIZ = 0.95d;

    public static IPaidContentCollectionPlayProgressService LJI() {
        Object LIZ = C58096Mr6.LIZ(IPaidContentCollectionPlayProgressService.class, false);
        if (LIZ != null) {
            return (IPaidContentCollectionPlayProgressService) LIZ;
        }
        if (C58096Mr6.a5 == null) {
            synchronized (IPaidContentCollectionPlayProgressService.class) {
                if (C58096Mr6.a5 == null) {
                    C58096Mr6.a5 = new PaidContentCollectionPlayProgressServiceImpl();
                }
            }
        }
        return C58096Mr6.a5;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService
    public final void LIZ() {
        ((LinkedHashMap) this.LIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService
    public final boolean isEmpty() {
        Map<String, A6Z> map = this.LIZ;
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService
    public final double LJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService
    public final void LIZLLL(double d) {
        this.LIZIZ = d;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService
    public final void LIZJ(long j, String str) {
        A6Z a6z;
        boolean z;
        if (this.LIZ.containsKey(str) && (a6z = (A6Z) ((LinkedHashMap) this.LIZ).get(str)) != null) {
            Map<String, A6Z> map = this.LIZ;
            long j2 = a6z.LJLIL;
            if (a6z.LJLJI || (j * 1.0d) / j2 >= this.LIZIZ) {
                z = true;
            } else {
                z = false;
            }
            map.put(str, new A6Z(j2, j, z));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService
    public final Long LJFF(long j, String str) {
        A6Z a6z = (A6Z) ((LinkedHashMap) this.LIZ).get(str);
        if (a6z != null) {
            if (a6z.LJLJI) {
                return Long.valueOf(a6z.LJLIL);
            }
            long j2 = a6z.LJLILLLLZI;
            if (j2 != j) {
                return Long.valueOf(j2);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService
    public final void LIZIZ(long j, long j2, String str, boolean z) {
        if (!this.LIZ.containsKey(str)) {
            this.LIZ.put(str, new A6Z(j, j2, z));
        }
    }
}
