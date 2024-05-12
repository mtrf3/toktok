package X;

import com.ss.android.ugc.aweme.model.PaidSeriesLiveListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A5R implements C33Q {
    public final C43I<C76800UCe> LJLIL;
    public final C43I<PaidSeriesLiveListResponse> LJLILLLLZI;
    public final C43I<Throwable> LJLJI;
    public final AbstractC72932td<Long> LJLJJI;
    public final AbstractC72932td<Long> LJLJJL;
    public final AbstractC72932td<Long> LJLJJLL;
    public final AbstractC72932td<Long> LJLJL;

    public A5R() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A5R)) {
            return false;
        }
        A5R a5r = (A5R) obj;
        return o.LJ(this.LJLIL, a5r.LJLIL) && o.LJ(this.LJLILLLLZI, a5r.LJLILLLLZI) && o.LJ(this.LJLJI, a5r.LJLJI) && o.LJ(this.LJLJJI, a5r.LJLJJI) && o.LJ(this.LJLJJL, a5r.LJLJJL) && o.LJ(this.LJLJJLL, a5r.LJLJJLL) && o.LJ(this.LJLJL, a5r.LJLJL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidSeriesBeforeLiveState(showEmptyNoSeries=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showCanAddSeries=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showError=");
        LIZ.append(this.LJLJI);
        LIZ.append(", removeSeriesFromListResponse=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", topSeriesFromListResponse=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", pinSeriesResponse=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", unpinSeriesResponse=");
        LIZ.append(this.LJLJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        C43I<C76800UCe> c43i = this.LJLIL;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = hashCode * 31;
        C43I<PaidSeriesLiveListResponse> c43i2 = this.LJLILLLLZI;
        if (c43i2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C43I<Throwable> c43i3 = this.LJLJI;
        if (c43i3 != null) {
            i = c43i3.hashCode();
        }
        return this.LJLJL.hashCode() + C03090Af.LIZ(this.LJLJJLL, C03090Af.LIZ(this.LJLJJL, C03090Af.LIZ(this.LJLJJI, (i3 + i) * 31, 31), 31), 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ A5R(int r9) {
        /*
            r8 = this;
            r1 = 0
            X.33X r4 = X.C33X.LIZ
            r0 = r8
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r4
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5R.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A5R(C43I<C76800UCe> c43i, C43I<PaidSeriesLiveListResponse> c43i2, C43I<? extends Throwable> c43i3, AbstractC72932td<Long> removeSeriesFromListResponse, AbstractC72932td<Long> topSeriesFromListResponse, AbstractC72932td<Long> pinSeriesResponse, AbstractC72932td<Long> unpinSeriesResponse) {
        o.LJIIIZ(removeSeriesFromListResponse, "removeSeriesFromListResponse");
        o.LJIIIZ(topSeriesFromListResponse, "topSeriesFromListResponse");
        o.LJIIIZ(pinSeriesResponse, "pinSeriesResponse");
        o.LJIIIZ(unpinSeriesResponse, "unpinSeriesResponse");
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
        this.LJLJJI = removeSeriesFromListResponse;
        this.LJLJJL = topSeriesFromListResponse;
        this.LJLJJLL = pinSeriesResponse;
        this.LJLJL = unpinSeriesResponse;
    }

    public static A5R LIZ(A5R a5r, C43I c43i, C43I c43i2, C43I c43i3, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, AbstractC72932td abstractC72932td3, AbstractC72932td abstractC72932td4, int i) {
        AbstractC72932td unpinSeriesResponse = abstractC72932td4;
        C43I c43i4 = c43i2;
        C43I c43i5 = c43i;
        C43I c43i6 = c43i3;
        AbstractC72932td removeSeriesFromListResponse = abstractC72932td;
        AbstractC72932td topSeriesFromListResponse = abstractC72932td2;
        AbstractC72932td pinSeriesResponse = abstractC72932td3;
        if ((i & 1) != 0) {
            c43i5 = a5r.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i4 = a5r.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i6 = a5r.LJLJI;
        }
        if ((i & 8) != 0) {
            removeSeriesFromListResponse = a5r.LJLJJI;
        }
        if ((i & 16) != 0) {
            topSeriesFromListResponse = a5r.LJLJJL;
        }
        if ((i & 32) != 0) {
            pinSeriesResponse = a5r.LJLJJLL;
        }
        if ((i & 64) != 0) {
            unpinSeriesResponse = a5r.LJLJL;
        }
        a5r.getClass();
        o.LJIIIZ(removeSeriesFromListResponse, "removeSeriesFromListResponse");
        o.LJIIIZ(topSeriesFromListResponse, "topSeriesFromListResponse");
        o.LJIIIZ(pinSeriesResponse, "pinSeriesResponse");
        o.LJIIIZ(unpinSeriesResponse, "unpinSeriesResponse");
        return new A5R(c43i5, c43i4, c43i6, removeSeriesFromListResponse, topSeriesFromListResponse, pinSeriesResponse, unpinSeriesResponse);
    }
}
