package com.ss.android.ugc.aweme.model;

import X.HBF;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CollectionInfoParcelableForShoot implements Serializable, Parcelable {
    public static final Parcelable.Creator<CollectionInfoParcelableForShoot> CREATOR = new HBF();
    public final String collectionId;
    public final String coverUrl;
    public final String entryPoint;
    public final String name;

    public static /* synthetic */ CollectionInfoParcelableForShoot copy$default(CollectionInfoParcelableForShoot collectionInfoParcelableForShoot, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collectionInfoParcelableForShoot.collectionId;
        }
        if ((i & 2) != 0) {
            str2 = collectionInfoParcelableForShoot.coverUrl;
        }
        if ((i & 4) != 0) {
            str3 = collectionInfoParcelableForShoot.name;
        }
        if ((i & 8) != 0) {
            str4 = collectionInfoParcelableForShoot.entryPoint;
        }
        return collectionInfoParcelableForShoot.copy(str, str2, str3, str4);
    }

    public final CollectionInfoParcelableForShoot copy(String collectionId, String str, String str2, String str3) {
        o.LJIIIZ(collectionId, "collectionId");
        return new CollectionInfoParcelableForShoot(collectionId, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionInfoParcelableForShoot)) {
            return false;
        }
        CollectionInfoParcelableForShoot collectionInfoParcelableForShoot = (CollectionInfoParcelableForShoot) obj;
        return o.LJ(this.collectionId, collectionInfoParcelableForShoot.collectionId) && o.LJ(this.coverUrl, collectionInfoParcelableForShoot.coverUrl) && o.LJ(this.name, collectionInfoParcelableForShoot.name) && o.LJ(this.entryPoint, collectionInfoParcelableForShoot.entryPoint);
    }

    public int hashCode() {
        int hashCode = this.collectionId.hashCode() * 31;
        String str = this.coverUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entryPoint;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.collectionId);
        out.writeString(this.coverUrl);
        out.writeString(this.name);
        out.writeString(this.entryPoint);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionInfoParcelableForShoot(collectionId=");
        LIZ.append(this.collectionId);
        LIZ.append(", coverUrl=");
        LIZ.append(this.coverUrl);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", entryPoint=");
        return q.LIZIZ(LIZ, this.entryPoint, ')', LIZ);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getName() {
        return this.name;
    }

    public CollectionInfoParcelableForShoot(String collectionId, String str, String str2, String str3) {
        o.LJIIIZ(collectionId, "collectionId");
        this.collectionId = collectionId;
        this.coverUrl = str;
        this.name = str2;
        this.entryPoint = str3;
    }

    public /* synthetic */ CollectionInfoParcelableForShoot(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
