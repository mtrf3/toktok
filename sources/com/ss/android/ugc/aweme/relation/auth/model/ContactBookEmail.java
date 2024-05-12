package com.ss.android.ugc.aweme.relation.auth.model;

import X.InterfaceC65349Pkn;
import X.O1A;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ContactBookEmail {

    @O1A
    @InterfaceC65349Pkn("hashed_email")
    public final String hashedEmail;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactBookEmail() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactBookEmail) && o.LJ(this.hashedEmail, ((ContactBookEmail) obj).hashedEmail);
    }

    public final int hashCode() {
        String str = this.hashedEmail;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContactBookEmail(hashedEmail=");
        return q.LIZIZ(LIZ, this.hashedEmail, ')', LIZ);
    }

    public ContactBookEmail(String str) {
        this.hashedEmail = str;
    }

    public /* synthetic */ ContactBookEmail(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
