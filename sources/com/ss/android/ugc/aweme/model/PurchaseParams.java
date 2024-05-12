package com.ss.android.ugc.aweme.model;

import X.A6N;
import X.C05040Hs;
import X.C16880lQ;
import X.EnumC25627A3z;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PurchaseParams implements Parcelable {
    public static final Parcelable.Creator<PurchaseParams> CREATOR = new A6N();
    public final long collectionId;
    public final Long diamondId;
    public final Long discountedDiamondId;
    public final String discountedIapId;
    public final EnumC25627A3z entrySource;
    public final String iapId;
    public final Long voucherId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseParams)) {
            return false;
        }
        PurchaseParams purchaseParams = (PurchaseParams) obj;
        return this.collectionId == purchaseParams.collectionId && o.LJ(this.voucherId, purchaseParams.voucherId) && o.LJ(this.iapId, purchaseParams.iapId) && o.LJ(this.discountedIapId, purchaseParams.discountedIapId) && o.LJ(this.diamondId, purchaseParams.diamondId) && o.LJ(this.discountedDiamondId, purchaseParams.discountedDiamondId) && this.entrySource == purchaseParams.entrySource;
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.collectionId) * 31;
        Long l = this.voucherId;
        int hashCode = (LLJIJIL + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.iapId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discountedIapId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.diamondId;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.discountedDiamondId;
        return this.entrySource.hashCode() + ((hashCode4 + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PurchaseParams(collectionId=");
        LIZ.append(this.collectionId);
        LIZ.append(", voucherId=");
        LIZ.append(this.voucherId);
        LIZ.append(", iapId=");
        LIZ.append(this.iapId);
        LIZ.append(", discountedIapId=");
        LIZ.append(this.discountedIapId);
        LIZ.append(", diamondId=");
        LIZ.append(this.diamondId);
        LIZ.append(", discountedDiamondId=");
        LIZ.append(this.discountedDiamondId);
        LIZ.append(", entrySource=");
        LIZ.append(this.entrySource);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.collectionId);
        Long l = this.voucherId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.iapId);
        out.writeString(this.discountedIapId);
        Long l2 = this.diamondId;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
        Long l3 = this.discountedDiamondId;
        if (l3 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l3);
        }
        out.writeString(this.entrySource.name());
    }

    public PurchaseParams(long j, Long l, String str, String str2, Long l2, Long l3, EnumC25627A3z entrySource) {
        o.LJIIIZ(entrySource, "entrySource");
        this.collectionId = j;
        this.voucherId = l;
        this.iapId = str;
        this.discountedIapId = str2;
        this.diamondId = l2;
        this.discountedDiamondId = l3;
        this.entrySource = entrySource;
    }
}
