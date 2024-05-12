package com.ss.android.ugc.aweme.account.login.v2.network;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommitUserNameData {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("error_code")
    public final Integer error_code;

    @InterfaceC65349Pkn("login_name")
    public final String login_name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitUserNameData)) {
            return false;
        }
        CommitUserNameData commitUserNameData = (CommitUserNameData) obj;
        return o.LJ(this.error_code, commitUserNameData.error_code) && o.LJ(this.description, commitUserNameData.description) && o.LJ(this.login_name, commitUserNameData.login_name);
    }

    public final int hashCode() {
        Integer num = this.error_code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.login_name;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommitUserNameData(error_code=");
        LIZ.append(this.error_code);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", login_name=");
        return q.LIZIZ(LIZ, this.login_name, ')', LIZ);
    }

    public CommitUserNameData(Integer num, String str, String str2) {
        this.error_code = num;
        this.description = str;
        this.login_name = str2;
    }

    public /* synthetic */ CommitUserNameData(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, str, str2);
    }
}
