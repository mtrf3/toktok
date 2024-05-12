package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto;

import X.C70308Ria;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SemiPdpRequest extends F9E implements Parcelable {
    public static final Parcelable.Creator<SemiPdpRequest> CREATOR = new C70308Ria();

    @InterfaceC65349Pkn("catalog_id")
    public final String catalogId;

    @InterfaceC65349Pkn("is_native")
    public final boolean isNative;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    @InterfaceC65349Pkn("seller_sec_uid")
    public final String sellerSecUid;

    @InterfaceC65349Pkn("source_info")
    public final SourceInfo sourceInfo;

    public static /* synthetic */ SemiPdpRequest copy$default(SemiPdpRequest semiPdpRequest, String str, String str2, String str3, SourceInfo sourceInfo, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = semiPdpRequest.catalogId;
        }
        if ((i & 2) != 0) {
            str2 = semiPdpRequest.productId;
        }
        if ((i & 4) != 0) {
            str3 = semiPdpRequest.sellerSecUid;
        }
        if ((i & 8) != 0) {
            sourceInfo = semiPdpRequest.sourceInfo;
        }
        if ((i & 16) != 0) {
            str4 = semiPdpRequest.roomId;
        }
        if ((i & 32) != 0) {
            z = semiPdpRequest.isNative;
        }
        return semiPdpRequest.copy(str, str2, str3, sourceInfo, str4, z);
    }

    public final SemiPdpRequest copy(String catalogId, String productId, String sellerSecUid, SourceInfo sourceInfo, String roomId, boolean z) {
        o.LJIIIZ(catalogId, "catalogId");
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(sellerSecUid, "sellerSecUid");
        o.LJIIIZ(sourceInfo, "sourceInfo");
        o.LJIIIZ(roomId, "roomId");
        return new SemiPdpRequest(catalogId, productId, sellerSecUid, sourceInfo, roomId, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.catalogId, this.productId, this.sellerSecUid, this.sourceInfo, this.roomId, Boolean.valueOf(this.isNative)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.catalogId);
        out.writeString(this.productId);
        out.writeString(this.sellerSecUid);
        this.sourceInfo.writeToParcel(out, i);
        out.writeString(this.roomId);
        out.writeInt(this.isNative ? 1 : 0);
    }

    public final String getCatalogId() {
        return this.catalogId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getSellerSecUid() {
        return this.sellerSecUid;
    }

    public final SourceInfo getSourceInfo() {
        return this.sourceInfo;
    }

    public final boolean isNative() {
        return this.isNative;
    }

    public SemiPdpRequest(String catalogId, String productId, String sellerSecUid, SourceInfo sourceInfo, String roomId, boolean z) {
        o.LJIIIZ(catalogId, "catalogId");
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(sellerSecUid, "sellerSecUid");
        o.LJIIIZ(sourceInfo, "sourceInfo");
        o.LJIIIZ(roomId, "roomId");
        this.catalogId = catalogId;
        this.productId = productId;
        this.sellerSecUid = sellerSecUid;
        this.sourceInfo = sourceInfo;
        this.roomId = roomId;
        this.isNative = z;
    }

    public /* synthetic */ SemiPdpRequest(String str, String str2, String str3, SourceInfo sourceInfo, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, sourceInfo, (i & 16) != 0 ? CardStruct.IStatusCode.DEFAULT : str4, (i & 32) != 0 ? true : z);
    }
}
