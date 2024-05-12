package com.ss.android.ugc.aweme.relation.auth.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.O1A;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ContactBookUploadItem {

    @O1A
    @InterfaceC65349Pkn("email_list")
    public final List<ContactBookEmail> contactBookEmailList;

    @O1A
    @InterfaceC65349Pkn("phone_list")
    public final List<ContactBookPhone> contactBookPhoneList;

    public ContactBookUploadItem() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactBookUploadItem)) {
            return false;
        }
        ContactBookUploadItem contactBookUploadItem = (ContactBookUploadItem) obj;
        return o.LJ(this.contactBookPhoneList, contactBookUploadItem.contactBookPhoneList) && o.LJ(this.contactBookEmailList, contactBookUploadItem.contactBookEmailList);
    }

    public final int hashCode() {
        int hashCode = this.contactBookPhoneList.hashCode() * 31;
        List<ContactBookEmail> list = this.contactBookEmailList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContactBookUploadItem(contactBookPhoneList=");
        LIZ.append(this.contactBookPhoneList);
        LIZ.append(", contactBookEmailList=");
        return C1NE.LIZIZ(LIZ, this.contactBookEmailList, ')', LIZ);
    }

    public ContactBookUploadItem(List<ContactBookPhone> contactBookPhoneList, List<ContactBookEmail> list) {
        o.LJIIIZ(contactBookPhoneList, "contactBookPhoneList");
        this.contactBookPhoneList = contactBookPhoneList;
        this.contactBookEmailList = list;
    }

    public ContactBookUploadItem(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? null : list2);
    }
}
