package com.ss.android.ugc.aweme.friends.model;

import X.C78886Uxe;
import X.InterfaceC65349Pkn;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ContactModelV2 {

    @InterfaceC65349Pkn("addresses")
    public List<String> addresses;

    @InterfaceC65349Pkn("birthday")
    public String birthday;

    @InterfaceC65349Pkn("department_name")
    public String department;

    @InterfaceC65349Pkn("emails")
    public List<String> emails;
    public String familyName;
    public String givenName;

    @InterfaceC65349Pkn("image_url")
    public String imageUrl;

    @InterfaceC65349Pkn("instant_message_addresses")
    public Map<String, String> instantMessageAddresses;

    @InterfaceC65349Pkn("job_desc")
    public String jobDesc;

    @InterfaceC65349Pkn("modification_date")
    public String modificationDate;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("nick_name")
    public String nickName;

    @InterfaceC65349Pkn("note")
    public String note;

    @InterfaceC65349Pkn("organization_name")
    public String organization;

    @InterfaceC65349Pkn("phone_number")
    public List<String> phoneNumber;
    public transient String photoUri;
    public String section;

    @InterfaceC65349Pkn("urls")
    public List<String> urls;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(ContactModelV2.class, obj.getClass())) {
            return false;
        }
        ContactModelV2 contactModelV2 = (ContactModelV2) obj;
        if (C78886Uxe.LJIIIIZZ(this.phoneNumber, contactModelV2.phoneNumber) && C78886Uxe.LJIIIIZZ(this.name, contactModelV2.name)) {
            return true;
        }
        return false;
    }
}
