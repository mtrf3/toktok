package com.ss.android.ugc.tiktok.tpsc.settings.account;

import X.C06540Nm;
import X.C1FJ;
import X.C76800UCe;
import X.C79062V1e;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.RTH;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DisclosureAdapterConfigs implements Parcelable {
    public static final Parcelable.Creator<DisclosureAdapterConfigs> CREATOR = new RTH();
    public final InterfaceC88472Yns<SmartRoute, C76800UCe> additionalParams;
    public final Integer iconRes;
    public final boolean isVisible;
    public final InterfaceC65784Pro<C76800UCe> onClick;
    public final String schema;
    public final Integer subTitleRes;
    public final int titleRes;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclosureAdapterConfigs)) {
            return false;
        }
        DisclosureAdapterConfigs disclosureAdapterConfigs = (DisclosureAdapterConfigs) obj;
        return this.titleRes == disclosureAdapterConfigs.titleRes && o.LJ(this.subTitleRes, disclosureAdapterConfigs.subTitleRes) && o.LJ(this.iconRes, disclosureAdapterConfigs.iconRes) && o.LJ(this.schema, disclosureAdapterConfigs.schema) && o.LJ(this.additionalParams, disclosureAdapterConfigs.additionalParams) && this.isVisible == disclosureAdapterConfigs.isVisible && o.LJ(this.onClick, disclosureAdapterConfigs.onClick);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.titleRes * 31;
        Integer num = this.subTitleRes;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Integer num2 = this.iconRes;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.schema, (i3 + hashCode2) * 31, 31);
        InterfaceC88472Yns<SmartRoute, C76800UCe> interfaceC88472Yns = this.additionalParams;
        if (interfaceC88472Yns == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC88472Yns.hashCode();
        }
        int i4 = (LJ + hashCode3) * 31;
        boolean z = this.isVisible;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.onClick;
        if (interfaceC65784Pro != null) {
            i2 = interfaceC65784Pro.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisclosureAdapterConfigs(titleRes=");
        LIZ.append(this.titleRes);
        LIZ.append(", subTitleRes=");
        LIZ.append(this.subTitleRes);
        LIZ.append(", iconRes=");
        LIZ.append(this.iconRes);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", additionalParams=");
        LIZ.append(this.additionalParams);
        LIZ.append(", isVisible=");
        LIZ.append(this.isVisible);
        LIZ.append(", onClick=");
        return C06540Nm.LIZJ(LIZ, this.onClick, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.titleRes);
        Integer num = this.subTitleRes;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.iconRes;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.schema);
        out.writeSerializable((Serializable) this.additionalParams);
        out.writeInt(this.isVisible ? 1 : 0);
        out.writeSerializable((Serializable) this.onClick);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DisclosureAdapterConfigs(int i, Integer num, Integer num2, String schema, InterfaceC88472Yns<? super SmartRoute, C76800UCe> interfaceC88472Yns, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(schema, "schema");
        this.titleRes = i;
        this.subTitleRes = num;
        this.iconRes = num2;
        this.schema = schema;
        this.additionalParams = interfaceC88472Yns;
        this.isVisible = z;
        this.onClick = interfaceC65784Pro;
    }

    public /* synthetic */ DisclosureAdapterConfigs(int i, Integer num, Integer num2, String str, InterfaceC88472Yns interfaceC88472Yns, boolean z, InterfaceC65784Pro interfaceC65784Pro, int i2) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, str, (i2 & 16) != 0 ? null : interfaceC88472Yns, (i2 & 32) != 0 ? true : z, (i2 & 64) == 0 ? interfaceC65784Pro : null);
    }
}
