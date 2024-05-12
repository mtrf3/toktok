package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C00F;
import X.C27003Ail;
import X.C27005Ain;
import X.C27006Aio;
import X.C279017q;
import X.C47261Igj;
import X.C61878OQg;
import X.C78857UxB;
import X.C96Q;
import X.InterfaceC65349Pkn;
import X.ORY;
import X.ORZ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Address implements Parcelable {

    @InterfaceC65349Pkn("address_id")
    public final String addressId;

    @InterfaceC65349Pkn("districts")
    public final List<Region> districts;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("items")
    public final List<AddressItem> items;

    @InterfaceC65349Pkn("region")
    public final Region region;
    public static final C27006Aio Companion = new C27006Aio();
    public static final Parcelable.Creator<Address> CREATOR = new C27003Ail();

    public final String LIZ() {
        List LJJIJLIJ = ORY.LJJIJLIJ(new String[]{LIZLLL("address"), LIZLLL("house_number"), LIZLLL("unit_floor"), LIZLLL("address_detail")});
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJJIJLIJ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        return ORZ.LLD(arrayList, ",", null, null, C27005Ain.LJLIL, 30);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return o.LJ(this.id, address.id) && o.LJ(this.items, address.items) && o.LJ(this.region, address.region) && o.LJ(this.districts, address.districts) && o.LJ(this.addressId, address.addressId);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AddressItem> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Region region = this.region;
        int hashCode3 = (hashCode2 + (region == null ? 0 : region.hashCode())) * 31;
        List<Region> list2 = this.districts;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.addressId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean LJ() {
        AddressItem addressItem;
        List<AddressItem> list = this.items;
        String str = null;
        if (list != null) {
            Iterator<AddressItem> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    addressItem = it.next();
                    if (o.LJ(addressItem.key, "default")) {
                        break;
                    }
                } else {
                    addressItem = null;
                    break;
                }
            }
            AddressItem addressItem2 = addressItem;
            if (addressItem2 != null) {
                str = addressItem2.value;
            }
        }
        return o.LJ(str, "1");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Address(id=");
        LIZ.append(this.id);
        LIZ.append(", items=");
        LIZ.append(this.items);
        LIZ.append(", region=");
        LIZ.append(this.region);
        LIZ.append(", districts=");
        LIZ.append(this.districts);
        LIZ.append(", addressId=");
        return q.LIZIZ(LIZ, this.addressId, ')', LIZ);
    }

    public final String LIZLLL(String key) {
        AddressItem addressItem;
        o.LJIIIZ(key, "key");
        List<AddressItem> list = this.items;
        if (list == null) {
            return null;
        }
        Iterator<AddressItem> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                addressItem = it.next();
                if (o.LJ(addressItem.key, key)) {
                    break;
                }
            } else {
                addressItem = null;
                break;
            }
        }
        AddressItem addressItem2 = addressItem;
        if (addressItem2 == null) {
            return null;
        }
        return addressItem2.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        List<AddressItem> list = this.items;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((AddressItem) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Region region = this.region;
        if (region == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            region.writeToParcel(out, i);
        }
        List<Region> list2 = this.districts;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((Region) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.addressId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    public static String LIZIZ(Address address, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        List LJJIJIL = C47261Igj.LJJIJIL(address.region);
        Collection collection = address.districts;
        if (collection == null) {
            collection = C61878OQg.INSTANCE;
        }
        LJJIJIL.addAll(collection);
        List LJLL = ORZ.LJLL(LJJIJIL);
        ?? arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJLL).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Region region = (Region) next;
            if (C78857UxB.LJJJIL(region.code) || C78857UxB.LJJJIL(region.name)) {
                arrayList.add(next);
            }
        }
        if (z2) {
            arrayList = ORZ.LLIILII(arrayList);
        }
        String LLD = ORZ.LLD(arrayList, ", ", null, null, new AqS9S0010000_4(z, 56), 30);
        String LIZLLL = address.LIZLLL("neighborhood");
        if (C96Q.LIZ(LIZLLL)) {
            return C00F.LIZIZ(LIZLLL, ',', LLD);
        }
        return LLD;
    }

    public Address(String str, List<AddressItem> list, Region region, List<Region> list2, String str2) {
        this.id = str;
        this.items = list;
        this.region = region;
        this.districts = list2;
        this.addressId = str2;
    }

    public /* synthetic */ Address(String str, List list, Region region, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, region, list2, (i & 16) != 0 ? null : str2);
    }
}
