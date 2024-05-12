package com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Advertiser extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("hidden_adv_list")
    public final List<AdvertiserModel> hiddenAdvList;

    @InterfaceC65349Pkn("shown_adv_list")
    public final List<AdvertiserModel> shownAdvList;

    /* JADX WARN: Multi-variable type inference failed */
    public Advertiser() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Advertiser copy$default(Advertiser advertiser, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = advertiser.shownAdvList;
        }
        if ((i & 2) != 0) {
            list2 = advertiser.hiddenAdvList;
        }
        return advertiser.copy(list, list2);
    }

    public final Advertiser copy(List<AdvertiserModel> list, List<AdvertiserModel> list2) {
        return new Advertiser(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Advertiser)) {
            return false;
        }
        Advertiser advertiser = (Advertiser) obj;
        return o.LJ(this.shownAdvList, advertiser.shownAdvList) && o.LJ(this.hiddenAdvList, advertiser.hiddenAdvList);
    }

    public int hashCode() {
        List<AdvertiserModel> list = this.shownAdvList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AdvertiserModel> list2 = this.hiddenAdvList;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Advertiser(shownAdvList=");
        LIZ.append(this.shownAdvList);
        LIZ.append(", hiddenAdvList=");
        return C1NE.LIZIZ(LIZ, this.hiddenAdvList, ')', LIZ);
    }

    public final List<AdvertiserModel> getHiddenAdvList() {
        return this.hiddenAdvList;
    }

    public final List<AdvertiserModel> getShownAdvList() {
        return this.shownAdvList;
    }

    public Advertiser(List<AdvertiserModel> list, List<AdvertiserModel> list2) {
        this.shownAdvList = list;
        this.hiddenAdvList = list2;
    }

    public /* synthetic */ Advertiser(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
