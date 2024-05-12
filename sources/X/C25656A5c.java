package X;

import kotlin.jvm.internal.o;

/* renamed from: X.A5c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25656A5c implements C33Q {
    public final long LJLIL;
    public final AbstractC72932td<C254699z7> LJLILLLLZI;
    public final AbstractC72932td<C25654A5a> LJLJI;
    public final C43I<Long> LJLJJI;

    public C25656A5c() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25656A5c)) {
            return false;
        }
        C25656A5c c25656A5c = (C25656A5c) obj;
        return this.LJLIL == c25656A5c.LJLIL && o.LJ(this.LJLILLLLZI, c25656A5c.LJLILLLLZI) && o.LJ(this.LJLJI, c25656A5c.LJLJI) && o.LJ(this.LJLJJI, c25656A5c.LJLJJI);
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C03090Af.LIZ(this.LJLJI, C03090Af.LIZ(this.LJLILLLLZI, C16880lQ.LLJIJIL(this.LJLIL) * 31, 31), 31);
        C43I<Long> c43i = this.LJLJJI;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return LIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidSeriesAddSeriesToLiveState(roomId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", creatorSeriesData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", seriesAddOrRemoveResult=");
        LIZ.append(this.LJLJI);
        LIZ.append(", loadingEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C25656A5c(int r7) {
        /*
            r6 = this;
            r1 = 0
            X.33X r3 = X.C33X.LIZ
            r5 = 0
            r0 = r6
            r4 = r3
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25656A5c.<init>(int):void");
    }

    public C25656A5c(long j, AbstractC72932td<C254699z7> creatorSeriesData, AbstractC72932td<C25654A5a> seriesAddOrRemoveResult, C43I<Long> c43i) {
        o.LJIIIZ(creatorSeriesData, "creatorSeriesData");
        o.LJIIIZ(seriesAddOrRemoveResult, "seriesAddOrRemoveResult");
        this.LJLIL = j;
        this.LJLILLLLZI = creatorSeriesData;
        this.LJLJI = seriesAddOrRemoveResult;
        this.LJLJJI = c43i;
    }

    public static C25656A5c LIZ(C25656A5c c25656A5c, long j, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, C43I c43i, int i) {
        C43I c43i2 = c43i;
        AbstractC72932td seriesAddOrRemoveResult = abstractC72932td2;
        long j2 = j;
        AbstractC72932td creatorSeriesData = abstractC72932td;
        if ((i & 1) != 0) {
            j2 = c25656A5c.LJLIL;
        }
        if ((i & 2) != 0) {
            creatorSeriesData = c25656A5c.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            seriesAddOrRemoveResult = c25656A5c.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i2 = c25656A5c.LJLJJI;
        }
        c25656A5c.getClass();
        o.LJIIIZ(creatorSeriesData, "creatorSeriesData");
        o.LJIIIZ(seriesAddOrRemoveResult, "seriesAddOrRemoveResult");
        return new C25656A5c(j2, creatorSeriesData, seriesAddOrRemoveResult, c43i2);
    }
}
