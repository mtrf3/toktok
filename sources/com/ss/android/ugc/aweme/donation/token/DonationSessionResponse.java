package com.ss.android.ugc.aweme.donation.token;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DonationSessionResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("session_url")
    public final String sessionUrl;

    public static /* synthetic */ DonationSessionResponse copy$default(DonationSessionResponse donationSessionResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = donationSessionResponse.sessionUrl;
        }
        return donationSessionResponse.copy(str);
    }

    public final DonationSessionResponse copy(String str) {
        return new DonationSessionResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonationSessionResponse) && o.LJ(this.sessionUrl, ((DonationSessionResponse) obj).sessionUrl);
    }

    public int hashCode() {
        String str = this.sessionUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DonationSessionResponse(sessionUrl=");
        return q.LIZIZ(LIZ, this.sessionUrl, ')', LIZ);
    }

    public final String getSessionUrl() {
        return this.sessionUrl;
    }

    public DonationSessionResponse(String str) {
        this.sessionUrl = str;
    }
}
