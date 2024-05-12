package com.ss.android.ugc.aweme.bnpl.utils;

import X.C91823a0p;
import X.InterfaceC87283bg;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BillHomeArg implements IRouteArg, InterfaceC87283bg {
    public final Boolean noAnimation;
    public final String previousPageId;
    public final Boolean reportLandingCostTime;
    public static final Parcelable.Creator<BillHomeArg> CREATOR = new C91823a0p();
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public BillHomeArg() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BillHomeArg copy$default(BillHomeArg billHomeArg, Boolean bool, String str, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = billHomeArg.noAnimation;
        }
        if ((i & 2) != 0) {
            str = billHomeArg.previousPageId;
        }
        if ((i & 4) != 0) {
            bool2 = billHomeArg.reportLandingCostTime;
        }
        return billHomeArg.copy(bool, str, bool2);
    }

    public final BillHomeArg copy(Boolean bool, String str, Boolean bool2) {
        return new BillHomeArg(bool, str, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillHomeArg)) {
            return false;
        }
        BillHomeArg billHomeArg = (BillHomeArg) obj;
        return o.LJ(this.noAnimation, billHomeArg.noAnimation) && o.LJ(this.previousPageId, billHomeArg.previousPageId) && o.LJ(this.reportLandingCostTime, billHomeArg.reportLandingCostTime);
    }

    public int hashCode() {
        Boolean bool = this.noAnimation;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.previousPageId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.reportLandingCostTime;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillHomeArg(noAnimation=");
        LIZ.append(this.noAnimation);
        LIZ.append(", previousPageId=");
        LIZ.append(this.previousPageId);
        LIZ.append(", reportLandingCostTime=");
        LIZ.append(this.reportLandingCostTime);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Boolean bool = this.noAnimation;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeString(this.previousPageId);
        Boolean bool2 = this.reportLandingCostTime;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final Boolean getNoAnimation() {
        return this.noAnimation;
    }

    public final String getPreviousPageId() {
        return this.previousPageId;
    }

    public final Boolean getReportLandingCostTime() {
        return this.reportLandingCostTime;
    }

    public BillHomeArg(Boolean bool, String str, Boolean bool2) {
        this.noAnimation = bool;
        this.previousPageId = str;
        this.reportLandingCostTime = bool2;
    }

    public /* synthetic */ BillHomeArg(Boolean bool, String str, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? Boolean.FALSE : bool2);
    }
}
