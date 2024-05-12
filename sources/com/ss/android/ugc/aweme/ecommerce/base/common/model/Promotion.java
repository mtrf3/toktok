package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C27338AoA;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Promotion implements Parcelable {
    public static final Parcelable.Creator<Promotion> CREATOR = new C27338AoA();

    @InterfaceC65349Pkn("promotion_id")
    public final String promotionId;

    public static /* synthetic */ Promotion copy$default(Promotion promotion, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotion.promotionId;
        }
        return promotion.copy(str);
    }

    public final Promotion copy(String str) {
        return new Promotion(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Promotion) && o.LJ(this.promotionId, ((Promotion) obj).promotionId);
    }

    public int hashCode() {
        String str = this.promotionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.promotionId);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Promotion(promotionId=");
        return q.LIZIZ(LIZ, this.promotionId, ')', LIZ);
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public Promotion(String str) {
        this.promotionId = str;
    }
}
