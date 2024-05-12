package com.ss.android.ugc.aweme.poi.collect;

import X.AbstractC73672Svk;
import X.C187157Wd;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.b0;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public interface PoiCollectApi {
    public static final C187157Wd LIZ = C187157Wd.LIZ;

    @E4Q("/tiktok/poi/collections/v1")
    AbstractC73672Svk<PoiCollectListResponse> getPoiCollectList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

    /* loaded from: classes4.dex */
    public static final class PoiCollectListResponse extends BaseResponse {

        @InterfaceC65349Pkn("cursor")
        public final int cursor;

        @InterfaceC65349Pkn("has_more")
        public final int hasMore;

        @InterfaceC65349Pkn("poi_list")
        public final List<PoiDetail> poiList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiCollectListResponse)) {
                return false;
            }
            PoiCollectListResponse poiCollectListResponse = (PoiCollectListResponse) obj;
            return this.cursor == poiCollectListResponse.cursor && o.LJ(this.poiList, poiCollectListResponse.poiList) && this.hasMore == poiCollectListResponse.hasMore;
        }

        public final int hashCode() {
            int i = this.cursor * 31;
            List<PoiDetail> list = this.poiList;
            return ((i + (list == null ? 0 : list.hashCode())) * 31) + this.hasMore;
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiCollectListResponse(cursor=");
            LIZ.append(this.cursor);
            LIZ.append(", poiList=");
            LIZ.append(this.poiList);
            LIZ.append(", hasMore=");
            return b0.LIZJ(LIZ, this.hasMore, ')', LIZ);
        }

        public PoiCollectListResponse(int i, List<PoiDetail> list, int i2) {
            this.cursor = i;
            this.poiList = list;
            this.hasMore = i2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiDetail {

        @InterfaceC65349Pkn("formatted_address")
        public final String poiAddress;

        @InterfaceC65349Pkn("poi_id")
        public final String poiId;

        @InterfaceC65349Pkn("poi_name")
        public final String poiName;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiDetail() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiDetail)) {
                return false;
            }
            PoiDetail poiDetail = (PoiDetail) obj;
            return o.LJ(this.poiName, poiDetail.poiName) && o.LJ(this.poiAddress, poiDetail.poiAddress) && o.LJ(this.poiId, poiDetail.poiId);
        }

        public final int hashCode() {
            String str = this.poiName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.poiAddress;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.poiId;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiDetail(poiName=");
            LIZ.append(this.poiName);
            LIZ.append(", poiAddress=");
            LIZ.append(this.poiAddress);
            LIZ.append(", poiId=");
            return q.LIZIZ(LIZ, this.poiId, ')', LIZ);
        }

        public PoiDetail(String str, String str2, String str3) {
            this.poiName = str;
            this.poiAddress = str2;
            this.poiId = str3;
        }

        public /* synthetic */ PoiDetail(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }
}
