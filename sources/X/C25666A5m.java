package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A5m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25666A5m implements C33Q {
    public final AbstractC72932td<List<CollectionDetailModel>> LJLIL;
    public final String LJLILLLLZI;
    public final C43I<Long> LJLJI;

    public C25666A5m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25666A5m)) {
            return false;
        }
        C25666A5m c25666A5m = (C25666A5m) obj;
        return o.LJ(this.LJLIL, c25666A5m.LJLIL) && o.LJ(this.LJLILLLLZI, c25666A5m.LJLILLLLZI) && o.LJ(this.LJLJI, c25666A5m.LJLJI);
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
        LIZ.append("PaidSeriesConfirmationPanelState(livePurchasedPaidSeriesList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", ownerId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", openSeriesDetailEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C25666A5m(int i) {
        this(C33X.LIZ, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C25666A5m(AbstractC72932td<? extends List<CollectionDetailModel>> livePurchasedPaidSeriesList, String str, C43I<Long> c43i) {
        o.LJIIIZ(livePurchasedPaidSeriesList, "livePurchasedPaidSeriesList");
        this.LJLIL = livePurchasedPaidSeriesList;
        this.LJLILLLLZI = str;
        this.LJLJI = c43i;
    }

    public static C25666A5m LIZ(C25666A5m c25666A5m, AbstractC72932td livePurchasedPaidSeriesList, C43I c43i, int i) {
        String str;
        if ((i & 1) != 0) {
            livePurchasedPaidSeriesList = c25666A5m.LJLIL;
        }
        if ((i & 2) != 0) {
            str = c25666A5m.LJLILLLLZI;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            c43i = c25666A5m.LJLJI;
        }
        c25666A5m.getClass();
        o.LJIIIZ(livePurchasedPaidSeriesList, "livePurchasedPaidSeriesList");
        return new C25666A5m(livePurchasedPaidSeriesList, str, c43i);
    }
}
