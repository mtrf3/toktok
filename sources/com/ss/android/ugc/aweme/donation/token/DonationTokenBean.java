package com.ss.android.ugc.aweme.donation.token;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DonationTokenBean implements Serializable {

    @InterfaceC65349Pkn("token")
    public final String token;

    public static /* synthetic */ DonationTokenBean copy$default(DonationTokenBean donationTokenBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = donationTokenBean.token;
        }
        return donationTokenBean.copy(str);
    }

    public final DonationTokenBean copy(String str) {
        return new DonationTokenBean(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonationTokenBean) && o.LJ(this.token, ((DonationTokenBean) obj).token);
    }

    public int hashCode() {
        String str = this.token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DonationTokenBean(token=");
        return q.LIZIZ(LIZ, this.token, ')', LIZ);
    }

    public final String getToken() {
        return this.token;
    }

    public DonationTokenBean(String str) {
        this.token = str;
    }
}
