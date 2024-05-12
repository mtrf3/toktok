package X;

import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lco, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54662Lco implements InterfaceC208718Hb<C54662Lco, Object> {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final InterfaceC54536Lam LJLJJI;
    public final LocationRegion LJLJJL;
    public final LocationRegion LJLJJLL;
    public final C8HZ<Object> LJLJL;

    public C54662Lco() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LJLILLLLZI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJLJI;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        InterfaceC54536Lam interfaceC54536Lam = this.LJLJJI;
        if (interfaceC54536Lam == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC54536Lam.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        LocationRegion locationRegion = this.LJLJJL;
        if (locationRegion == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = locationRegion.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        LocationRegion locationRegion2 = this.LJLJJLL;
        if (locationRegion2 != null) {
            i = locationRegion2.hashCode();
        }
        return this.LJLJL.hashCode() + ((i6 + i) * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<Object> getListItemState() {
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
        LIZ.append("RegionSearchState(keyword=");
        LIZ.append(this.LJLIL);
        LIZ.append(", currentCountryCode=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", currentCountryName=");
        LIZ.append(this.LJLJI);
        LIZ.append(", allRegions=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", selectedRegion=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", userCurrentRegion=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<Object> getListState() {
        return this.LJLJL;
    }

    public /* synthetic */ C54662Lco(int i) {
        this(null, null, null, null, null, null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54662Lco)) {
            return false;
        }
        C54662Lco c54662Lco = (C54662Lco) obj;
        if (o.LJ(this.LJLIL, c54662Lco.LJLIL) && o.LJ(this.LJLILLLLZI, c54662Lco.LJLILLLLZI) && o.LJ(this.LJLJI, c54662Lco.LJLJI) && o.LJ(this.LJLJJI, c54662Lco.LJLJJI) && o.LJ(this.LJLJJL, c54662Lco.LJLJJL) && o.LJ(this.LJLJJLL, c54662Lco.LJLJJLL) && o.LJ(this.LJLJL, c54662Lco.LJLJL)) {
            return true;
        }
        return false;
    }

    public C54662Lco(String str, String str2, String str3, InterfaceC54536Lam interfaceC54536Lam, LocationRegion locationRegion, LocationRegion locationRegion2, C8HZ<Object> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = interfaceC54536Lam;
        this.LJLJJL = locationRegion;
        this.LJLJJLL = locationRegion2;
        this.LJLJL = listState;
    }

    public static C54662Lco LIZ(C54662Lco c54662Lco, String str, String str2, String str3, InterfaceC54536Lam interfaceC54536Lam, LocationRegion locationRegion, LocationRegion locationRegion2, C8HZ c8hz, int i) {
        C8HZ listState = c8hz;
        String str4 = str2;
        String str5 = str;
        String str6 = str3;
        InterfaceC54536Lam interfaceC54536Lam2 = interfaceC54536Lam;
        LocationRegion locationRegion3 = locationRegion;
        LocationRegion locationRegion4 = locationRegion2;
        if ((i & 1) != 0) {
            str5 = c54662Lco.LJLIL;
        }
        if ((i & 2) != 0) {
            str4 = c54662Lco.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str6 = c54662Lco.LJLJI;
        }
        if ((i & 8) != 0) {
            interfaceC54536Lam2 = c54662Lco.LJLJJI;
        }
        if ((i & 16) != 0) {
            locationRegion3 = c54662Lco.LJLJJL;
        }
        if ((i & 32) != 0) {
            locationRegion4 = c54662Lco.LJLJJLL;
        }
        if ((i & 64) != 0) {
            listState = c54662Lco.LJLJL;
        }
        c54662Lco.getClass();
        o.LJIIIZ(listState, "listState");
        return new C54662Lco(str5, str4, str6, interfaceC54536Lam2, locationRegion3, locationRegion4, listState);
    }
}
