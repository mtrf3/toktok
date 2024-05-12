package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.data.BroadcasterProductsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S5B implements InterfaceC208718Hb<S5B, C71271Ry7> {
    public final C8HZ<C71271Ry7> LJLIL;
    public final AbstractC72932td<BroadcasterProductsData> LJLILLLLZI;
    public final ArrayList<C71271Ry7> LJLJI;
    public final ArrayList<C71271Ry7> LJLJJI;

    public S5B() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        ArrayList<C71271Ry7> arrayList = this.LJLJI;
        int i = 0;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i2 = (LIZ + hashCode) * 31;
        ArrayList<C71271Ry7> arrayList2 = this.LJLJJI;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return i2 + i;
    }

    @Override // X.InterfaceC2064888m
    public final List<C71271Ry7> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", broadcasterProductsData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", productList=");
        LIZ.append(this.LJLJI);
        LIZ.append(", searchResult=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C71271Ry7> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ S5B(int i) {
        this(new C8HZ(null, null, 15), C33X.LIZ, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5B)) {
            return false;
        }
        S5B s5b = (S5B) obj;
        if (o.LJ(this.LJLIL, s5b.LJLIL) && o.LJ(this.LJLILLLLZI, s5b.LJLILLLLZI) && o.LJ(this.LJLJI, s5b.LJLJI) && o.LJ(this.LJLJJI, s5b.LJLJJI)) {
            return true;
        }
        return false;
    }

    public S5B(C8HZ<C71271Ry7> listState, AbstractC72932td<BroadcasterProductsData> broadcasterProductsData, ArrayList<C71271Ry7> arrayList, ArrayList<C71271Ry7> arrayList2) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(broadcasterProductsData, "broadcasterProductsData");
        this.LJLIL = listState;
        this.LJLILLLLZI = broadcasterProductsData;
        this.LJLJI = arrayList;
        this.LJLJJI = arrayList2;
    }

    public static S5B LIZ(S5B s5b, C8HZ listState, AbstractC72932td broadcasterProductsData, ArrayList arrayList, ArrayList arrayList2, int i) {
        if ((i & 1) != 0) {
            listState = s5b.LJLIL;
        }
        if ((i & 2) != 0) {
            broadcasterProductsData = s5b.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            arrayList = s5b.LJLJI;
        }
        if ((i & 8) != 0) {
            arrayList2 = s5b.LJLJJI;
        }
        s5b.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(broadcasterProductsData, "broadcasterProductsData");
        return new S5B(listState, broadcasterProductsData, arrayList, arrayList2);
    }
}
