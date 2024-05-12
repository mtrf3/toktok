package com.ss.android.ugc.aweme.account.login.passkey;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RelyingParty {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("name")
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public RelyingParty() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelyingParty)) {
            return false;
        }
        RelyingParty relyingParty = (RelyingParty) obj;
        return o.LJ(this.name, relyingParty.name) && o.LJ(this.id, relyingParty.id);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelyingParty(name=");
        LIZ.append(this.name);
        LIZ.append(", id=");
        return q.LIZIZ(LIZ, this.id, ')', LIZ);
    }

    public RelyingParty(String str, String str2) {
        this.name = str;
        this.id = str2;
    }

    public /* synthetic */ RelyingParty(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
