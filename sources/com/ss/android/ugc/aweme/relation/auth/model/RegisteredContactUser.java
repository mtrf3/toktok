package com.ss.android.ugc.aweme.relation.auth.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class RegisteredContactUser extends User {

    @InterfaceC65349Pkn("social_name")
    public final String hashContactName;

    @InterfaceC65349Pkn("phone_number")
    public final String hashNationalNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public RegisteredContactUser() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getHashContactName() {
        return this.hashContactName;
    }

    public final String getHashNationalNumber() {
        return this.hashNationalNumber;
    }

    public RegisteredContactUser(String str, String str2) {
        this.hashContactName = str;
        this.hashNationalNumber = str2;
    }

    public /* synthetic */ RegisteredContactUser(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
