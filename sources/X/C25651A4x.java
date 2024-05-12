package X;

import com.ss.android.ugc.aweme.model.PaidSeriesLiveListResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.A4x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25651A4x implements C33Q {
    public final AbstractC72932td<PaidSeriesLiveListResponse> LJLIL;
    public final String LJLILLLLZI;
    public final C43I<Long> LJLJI;

    public C25651A4x() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25651A4x)) {
            return false;
        }
        C25651A4x c25651A4x = (C25651A4x) obj;
        return o.LJ(this.LJLIL, c25651A4x.LJLIL) && o.LJ(this.LJLILLLLZI, c25651A4x.LJLILLLLZI) && o.LJ(this.LJLJI, c25651A4x.LJLJI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C43I<Long> c43i = this.LJLJI;
        return hashCode2 + (c43i != null ? c43i.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidSeriesShopPanelState(livePaidSeriesResponse=");
        LIZ.append(this.LJLIL);
        LIZ.append(", ownerId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", openSeriesDetailEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C25651A4x(int i) {
        this(C33X.LIZ, null, null);
    }

    public C25651A4x(AbstractC72932td<PaidSeriesLiveListResponse> livePaidSeriesResponse, String str, C43I<Long> c43i) {
        o.LJIIIZ(livePaidSeriesResponse, "livePaidSeriesResponse");
        this.LJLIL = livePaidSeriesResponse;
        this.LJLILLLLZI = str;
        this.LJLJI = c43i;
    }

    public static C25651A4x LIZ(C25651A4x c25651A4x, AbstractC72932td livePaidSeriesResponse, String str, C43I c43i, int i) {
        if ((i & 1) != 0) {
            livePaidSeriesResponse = c25651A4x.LJLIL;
        }
        if ((i & 2) != 0) {
            str = c25651A4x.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i = c25651A4x.LJLJI;
        }
        c25651A4x.getClass();
        o.LJIIIZ(livePaidSeriesResponse, "livePaidSeriesResponse");
        return new C25651A4x(livePaidSeriesResponse, str, c43i);
    }
}
