package com.ss.android.ugc.aweme.friends.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LocalContact extends F9E {
    public final String contactName;
    public final String phoneNumber;

    public static /* synthetic */ LocalContact copy$default(LocalContact localContact, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localContact.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = localContact.contactName;
        }
        return localContact.copy(str, str2);
    }

    public final LocalContact copy(String phoneNumber, String contactName) {
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(contactName, "contactName");
        return new LocalContact(phoneNumber, contactName);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.phoneNumber, this.contactName};
    }

    public LocalContact(String phoneNumber, String contactName) {
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(contactName, "contactName");
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
    }
}
