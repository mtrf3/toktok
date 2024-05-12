package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ManageCollectionRequest {

    @InterfaceC65349Pkn("collection_cover")
    public final String collectionCover;

    @InterfaceC65349Pkn("collection_description")
    public final String collectionDescription;

    @InterfaceC65349Pkn("collection_id")
    public final String collectionId;

    @InterfaceC65349Pkn("collection_name")
    public final String collectionName;

    @InterfaceC65349Pkn("discount_amount_in_usd")
    public final String discountAmountInUsd;

    @InterfaceC65349Pkn("operation")
    public final int operation;

    @InterfaceC65349Pkn("price_in_usd")
    public final String priceInUsd;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManageCollectionRequest)) {
            return false;
        }
        ManageCollectionRequest manageCollectionRequest = (ManageCollectionRequest) obj;
        return this.operation == manageCollectionRequest.operation && o.LJ(this.collectionId, manageCollectionRequest.collectionId) && o.LJ(this.collectionName, manageCollectionRequest.collectionName) && o.LJ(this.collectionDescription, manageCollectionRequest.collectionDescription) && o.LJ(this.collectionCover, manageCollectionRequest.collectionCover) && o.LJ(this.priceInUsd, manageCollectionRequest.priceInUsd) && o.LJ(this.discountAmountInUsd, manageCollectionRequest.discountAmountInUsd);
    }

    public final int hashCode() {
        int i = this.operation * 31;
        String str = this.collectionId;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.collectionName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.collectionDescription;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.collectionCover;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceInUsd;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.discountAmountInUsd;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ManageCollectionRequest(operation=");
        LIZ.append(this.operation);
        LIZ.append(", collectionId=");
        LIZ.append(this.collectionId);
        LIZ.append(", collectionName=");
        LIZ.append(this.collectionName);
        LIZ.append(", collectionDescription=");
        LIZ.append(this.collectionDescription);
        LIZ.append(", collectionCover=");
        LIZ.append(this.collectionCover);
        LIZ.append(", priceInUsd=");
        LIZ.append(this.priceInUsd);
        LIZ.append(", discountAmountInUsd=");
        return q.LIZIZ(LIZ, this.discountAmountInUsd, ')', LIZ);
    }

    public ManageCollectionRequest(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.operation = i;
        this.collectionId = str;
        this.collectionName = str2;
        this.collectionDescription = str3;
        this.collectionCover = str4;
        this.priceInUsd = str5;
        this.discountAmountInUsd = str6;
    }

    public /* synthetic */ ManageCollectionRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) == 0 ? str6 : null);
    }
}
