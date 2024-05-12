package com.ss.android.ugc.aweme.account.login.passkey;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserData {

    @InterfaceC65349Pkn("displayName")
    public final String displayName;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("name")
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public UserData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) obj;
        return o.LJ(this.id, userData.id) && o.LJ(this.name, userData.name) && o.LJ(this.displayName, userData.displayName);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserData(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", displayName=");
        return q.LIZIZ(LIZ, this.displayName, ')', LIZ);
    }

    public UserData(String str, String str2, String str3) {
        this.id = str;
        this.name = str2;
        this.displayName = str3;
    }

    public /* synthetic */ UserData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
