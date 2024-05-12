package com.ss.android.ugc.aweme.donation.token;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DonationTokenResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final DonationTokenBean data;

    public static /* synthetic */ DonationTokenResponse copy$default(DonationTokenResponse donationTokenResponse, DonationTokenBean donationTokenBean, int i, Object obj) {
        if ((i & 1) != 0) {
            donationTokenBean = donationTokenResponse.data;
        }
        return donationTokenResponse.copy(donationTokenBean);
    }

    public final DonationTokenResponse copy(DonationTokenBean donationTokenBean) {
        return new DonationTokenResponse(donationTokenBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonationTokenResponse) && o.LJ(this.data, ((DonationTokenResponse) obj).data);
    }

    public int hashCode() {
        DonationTokenBean donationTokenBean = this.data;
        if (donationTokenBean == null) {
            return 0;
        }
        return donationTokenBean.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DonationTokenResponse(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final DonationTokenBean getData() {
        return this.data;
    }

    public DonationTokenResponse(DonationTokenBean donationTokenBean) {
        this.data = donationTokenBean;
    }
}
