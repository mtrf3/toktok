package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xc4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85192Xc4 implements InterfaceC208718Hb<C85192Xc4, C85316Xe4> {
    public final String LJLIL;
    public final Boolean LJLILLLLZI;
    public final C8HZ<C85316Xe4> LJLJI;
    public final PoiSearchApi.PoiSearchResultWrapper LJLJJI;

    public C85192Xc4() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.LJLILLLLZI;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int hashCode3 = (this.LJLJI.hashCode() + ((i2 + hashCode2) * 31)) * 31;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = this.LJLJJI;
        if (poiSearchResultWrapper != null) {
            i = poiSearchResultWrapper.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // X.InterfaceC2064888m
    public final List<C85316Xe4> getListItemState() {
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
        LIZ.append("PoiSearchVMState(keyWord=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isShowLoadingHUD=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", listState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", poiSearchResult=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C85316Xe4> getListState() {
        return this.LJLJI;
    }

    public /* synthetic */ C85192Xc4(int i) {
        this(null, null, new C8HZ(null, null, 15), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85192Xc4)) {
            return false;
        }
        C85192Xc4 c85192Xc4 = (C85192Xc4) obj;
        if (o.LJ(this.LJLIL, c85192Xc4.LJLIL) && o.LJ(this.LJLILLLLZI, c85192Xc4.LJLILLLLZI) && o.LJ(this.LJLJI, c85192Xc4.LJLJI) && o.LJ(this.LJLJJI, c85192Xc4.LJLJJI)) {
            return true;
        }
        return false;
    }

    public C85192Xc4(String str, Boolean bool, C8HZ<C85316Xe4> listState, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = str;
        this.LJLILLLLZI = bool;
        this.LJLJI = listState;
        this.LJLJJI = poiSearchResultWrapper;
    }

    public static C85192Xc4 LIZ(C85192Xc4 c85192Xc4, String str, Boolean bool, C8HZ listState, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, int i) {
        if ((i & 1) != 0) {
            str = c85192Xc4.LJLIL;
        }
        if ((i & 2) != 0) {
            bool = c85192Xc4.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            listState = c85192Xc4.LJLJI;
        }
        if ((i & 8) != 0) {
            poiSearchResultWrapper = c85192Xc4.LJLJJI;
        }
        c85192Xc4.getClass();
        o.LJIIIZ(listState, "listState");
        return new C85192Xc4(str, bool, listState, poiSearchResultWrapper);
    }
}
