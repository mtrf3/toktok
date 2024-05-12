package com.ss.android.ugc.aweme.openauthorize.entity;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AuthorizedClient implements Serializable {

    @InterfaceC65349Pkn("client_icon")
    public final String clientIcon;

    @InterfaceC65349Pkn("client_key")
    public final String clientKey;

    @InterfaceC65349Pkn("client_name")
    public final String clientName;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizedClient() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthorizedClient copy$default(AuthorizedClient authorizedClient, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizedClient.clientKey;
        }
        if ((i & 2) != 0) {
            str2 = authorizedClient.clientName;
        }
        if ((i & 4) != 0) {
            str3 = authorizedClient.clientIcon;
        }
        return authorizedClient.copy(str, str2, str3);
    }

    public final AuthorizedClient copy(String str, String str2, String str3) {
        return new AuthorizedClient(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedClient)) {
            return false;
        }
        AuthorizedClient authorizedClient = (AuthorizedClient) obj;
        return o.LJ(this.clientKey, authorizedClient.clientKey) && o.LJ(this.clientName, authorizedClient.clientName) && o.LJ(this.clientIcon, authorizedClient.clientIcon);
    }

    public int hashCode() {
        String str = this.clientKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientIcon;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthorizedClient(clientKey=");
        LIZ.append(this.clientKey);
        LIZ.append(", clientName=");
        LIZ.append(this.clientName);
        LIZ.append(", clientIcon=");
        return q.LIZIZ(LIZ, this.clientIcon, ')', LIZ);
    }

    public final String getClientIcon() {
        return this.clientIcon;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public AuthorizedClient(String str, String str2, String str3) {
        this.clientKey = str;
        this.clientName = str2;
        this.clientIcon = str3;
    }

    public /* synthetic */ AuthorizedClient(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
