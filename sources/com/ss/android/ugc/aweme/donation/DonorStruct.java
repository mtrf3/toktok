package com.ss.android.ugc.aweme.donation;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DonorStruct {

    @InterfaceC65349Pkn("user_amount")
    public final String amount;

    @InterfaceC65349Pkn("anonymous")
    public final Boolean anonymous;

    @InterfaceC65349Pkn("is_top_donor")
    public final boolean isTopDonor;

    @InterfaceC65349Pkn("tiktok_amount")
    public final String tiktokAmount;

    @InterfaceC65349Pkn("timestamp")
    public final Long timestamp;

    @InterfaceC65349Pkn("user")
    public final User user;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonorStruct)) {
            return false;
        }
        DonorStruct donorStruct = (DonorStruct) obj;
        return o.LJ(this.user, donorStruct.user) && o.LJ(this.timestamp, donorStruct.timestamp) && o.LJ(this.amount, donorStruct.amount) && o.LJ(this.tiktokAmount, donorStruct.tiktokAmount) && o.LJ(this.anonymous, donorStruct.anonymous) && this.isTopDonor == donorStruct.isTopDonor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        User user = this.user;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        Long l = this.timestamp;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.amount;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tiktokAmount;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.anonymous;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z = this.isTopDonor;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DonorStruct(user=");
        LIZ.append(this.user);
        LIZ.append(", timestamp=");
        LIZ.append(this.timestamp);
        LIZ.append(", amount=");
        LIZ.append(this.amount);
        LIZ.append(", tiktokAmount=");
        LIZ.append(this.tiktokAmount);
        LIZ.append(", anonymous=");
        LIZ.append(this.anonymous);
        LIZ.append(", isTopDonor=");
        return C48339Iy7.LIZJ(LIZ, this.isTopDonor, ')', LIZ);
    }

    public DonorStruct(User user, Long l, String str, String str2, Boolean bool, boolean z) {
        this.user = user;
        this.timestamp = l;
        this.amount = str;
        this.tiktokAmount = str2;
        this.anonymous = bool;
        this.isTopDonor = z;
    }

    public /* synthetic */ DonorStruct(User user, Long l, String str, String str2, Boolean bool, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, l, str, str2, bool, (i & 32) != 0 ? false : z);
    }
}
