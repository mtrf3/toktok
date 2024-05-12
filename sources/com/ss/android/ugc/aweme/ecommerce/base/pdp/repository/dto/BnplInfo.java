package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FL;
import X.C1NE;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RVK;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BnplInfo implements Parcelable {
    public static final Parcelable.Creator<BnplInfo> CREATOR = new RVK();

    @InterfaceC65349Pkn("installment_plans")
    public final List<InstallmentPlan> installmentPlans;

    @InterfaceC65349Pkn("is_auth")
    public final Boolean isAuth;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public BnplInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplInfo)) {
            return false;
        }
        BnplInfo bnplInfo = (BnplInfo) obj;
        return o.LJ(this.isAuth, bnplInfo.isAuth) && o.LJ(this.title, bnplInfo.title) && o.LJ(this.text, bnplInfo.text) && o.LJ(this.installmentPlans, bnplInfo.installmentPlans);
    }

    public final int hashCode() {
        Boolean bool = this.isAuth;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<InstallmentPlan> list = this.installmentPlans;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BnplInfo(isAuth=");
        LIZ.append(this.isAuth);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", installmentPlans=");
        return C1NE.LIZIZ(LIZ, this.installmentPlans, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Boolean bool = this.isAuth;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.title);
        out.writeString(this.text);
        List<InstallmentPlan> list = this.installmentPlans;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((InstallmentPlan) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public BnplInfo(Boolean bool, String str, String str2, List<InstallmentPlan> list) {
        this.isAuth = bool;
        this.title = str;
        this.text = str2;
        this.installmentPlans = list;
    }

    public /* synthetic */ BnplInfo(Boolean bool, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}
