package com.ss.android.ugc.aweme.favorites.business.collection;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectionManageRequest {

    @InterfaceC65349Pkn("add_ids")
    public final List<String> addIds;

    @InterfaceC65349Pkn("item_archive_id")
    public final String collectionId;

    @InterfaceC65349Pkn("item_archive_name")
    public final String collectionName;

    @InterfaceC65349Pkn("item_archive_id_from")
    public final String moveFromCollectionId;

    @InterfaceC65349Pkn("move_ids")
    public final List<String> moveIds;

    @InterfaceC65349Pkn("item_archive_id_to")
    public final String moveToCollectionId;

    @InterfaceC65349Pkn("operation")
    public final int operation;

    @InterfaceC65349Pkn("remove_ids")
    public final List<String> removeIds;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionManageRequest)) {
            return false;
        }
        CollectionManageRequest collectionManageRequest = (CollectionManageRequest) obj;
        return this.operation == collectionManageRequest.operation && o.LJ(this.collectionId, collectionManageRequest.collectionId) && o.LJ(this.collectionName, collectionManageRequest.collectionName) && o.LJ(this.moveFromCollectionId, collectionManageRequest.moveFromCollectionId) && o.LJ(this.moveToCollectionId, collectionManageRequest.moveToCollectionId) && o.LJ(this.addIds, collectionManageRequest.addIds) && o.LJ(this.removeIds, collectionManageRequest.removeIds) && o.LJ(this.moveIds, collectionManageRequest.moveIds) && o.LJ(this.status, collectionManageRequest.status);
    }

    public final int hashCode() {
        int i = this.operation * 31;
        String str = this.collectionId;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.collectionName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.moveFromCollectionId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.moveToCollectionId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.addIds;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.removeIds;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.moveIds;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.status;
        return hashCode7 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionManageRequest(operation=");
        LIZ.append(this.operation);
        LIZ.append(", collectionId=");
        LIZ.append(this.collectionId);
        LIZ.append(", collectionName=");
        LIZ.append(this.collectionName);
        LIZ.append(", moveFromCollectionId=");
        LIZ.append(this.moveFromCollectionId);
        LIZ.append(", moveToCollectionId=");
        LIZ.append(this.moveToCollectionId);
        LIZ.append(", addIds=");
        LIZ.append(this.addIds);
        LIZ.append(", removeIds=");
        LIZ.append(this.removeIds);
        LIZ.append(", moveIds=");
        LIZ.append(this.moveIds);
        LIZ.append(", status=");
        return s0.LIZJ(LIZ, this.status, ')', LIZ);
    }

    public CollectionManageRequest(int i, String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, Integer num) {
        this.operation = i;
        this.collectionId = str;
        this.collectionName = str2;
        this.moveFromCollectionId = str3;
        this.moveToCollectionId = str4;
        this.addIds = list;
        this.removeIds = list2;
        this.moveIds = list3;
        this.status = num;
    }

    public /* synthetic */ CollectionManageRequest(int i, String str, String str2, String str3, String str4, List list, List list2, List list3, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : list3, (i2 & 256) == 0 ? num : null);
    }
}
