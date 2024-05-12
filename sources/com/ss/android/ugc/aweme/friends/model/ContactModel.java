package com.ss.android.ugc.aweme.friends.model;

import X.C78886Uxe;
import X.InterfaceC65349Pkn;
import X.O1A;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ContactModel {

    @O1A(deserialize = false, serialize = false)
    public String firstName;

    @O1A
    @InterfaceC65349Pkn("invited")
    public boolean isInvited;

    @O1A(deserialize = false, serialize = false)
    public String lastName;

    @O1A
    @InterfaceC65349Pkn("name")
    public String name;

    @O1A(deserialize = false, serialize = false)
    public int originIndex;

    @O1A
    @InterfaceC65349Pkn("phone_number")
    public String phoneNumber;
    public transient String photoUri;

    @O1A
    @InterfaceC65349Pkn("region_code")
    public String regionCode;

    @O1A(deserialize = false, serialize = false)
    public String section;

    @O1A(deserialize = false, serialize = false)
    public String url;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public ContactModel() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(ContactModel.class, obj.getClass())) {
            return false;
        }
        ContactModel contactModel = (ContactModel) obj;
        if (C78886Uxe.LJIIIIZZ(this.phoneNumber, contactModel.phoneNumber) && C78886Uxe.LJIIIIZZ(this.name, contactModel.name)) {
            return true;
        }
        return false;
    }

    public ContactModel(String str, String str2) {
        this.phoneNumber = str;
        this.name = str2;
    }
}
