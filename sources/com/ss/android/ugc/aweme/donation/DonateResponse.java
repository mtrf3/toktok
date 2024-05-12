package com.ss.android.ugc.aweme.donation;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DonateResponse extends BaseResponse {

    @InterfaceC65349Pkn("banner")
    public final BannerStruct banner;

    @InterfaceC65349Pkn("cursor")
    public final Integer cursor;

    @InterfaceC65349Pkn("donation_summary")
    public final String donationSummary;

    @InterfaceC65349Pkn("donor_list")
    public final List<DonorStruct> donorList;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("ngo_struct")
    public final NgoStruct ngo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonateResponse)) {
            return false;
        }
        DonateResponse donateResponse = (DonateResponse) obj;
        return o.LJ(this.ngo, donateResponse.ngo) && o.LJ(this.donorList, donateResponse.donorList) && o.LJ(this.cursor, donateResponse.cursor) && o.LJ(this.hasMore, donateResponse.hasMore) && o.LJ(this.banner, donateResponse.banner) && o.LJ(this.donationSummary, donateResponse.donationSummary);
    }

    public final int hashCode() {
        NgoStruct ngoStruct = this.ngo;
        int hashCode = (ngoStruct == null ? 0 : ngoStruct.hashCode()) * 31;
        List<DonorStruct> list = this.donorList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.cursor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        BannerStruct bannerStruct = this.banner;
        int hashCode5 = (hashCode4 + (bannerStruct == null ? 0 : bannerStruct.hashCode())) * 31;
        String str = this.donationSummary;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DonateResponse(ngo=");
        LIZ.append(this.ngo);
        LIZ.append(", donorList=");
        LIZ.append(this.donorList);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", banner=");
        LIZ.append(this.banner);
        LIZ.append(", donationSummary=");
        return q.LIZIZ(LIZ, this.donationSummary, ')', LIZ);
    }

    public DonateResponse(NgoStruct ngoStruct, List<DonorStruct> list, Integer num, Boolean bool, BannerStruct bannerStruct, String str) {
        this.ngo = ngoStruct;
        this.donorList = list;
        this.cursor = num;
        this.hasMore = bool;
        this.banner = bannerStruct;
        this.donationSummary = str;
    }
}
