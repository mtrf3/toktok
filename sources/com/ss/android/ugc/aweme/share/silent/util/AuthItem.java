package com.ss.android.ugc.aweme.share.silent.util;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AuthItem {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("client_key")
    public final String clientKey;

    @InterfaceC65349Pkn("raw_scopes")
    public final ArrayList<String> rawScopes;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthItem copy$default(AuthItem authItem, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authItem.clientKey;
        }
        if ((i & 2) != 0) {
            arrayList = authItem.rawScopes;
        }
        return authItem.copy(str, arrayList);
    }

    public final AuthItem copy(String clientKey, ArrayList<String> arrayList) {
        o.LJIIIZ(clientKey, "clientKey");
        return new AuthItem(clientKey, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthItem)) {
            return false;
        }
        AuthItem authItem = (AuthItem) obj;
        return o.LJ(this.clientKey, authItem.clientKey) && o.LJ(this.rawScopes, authItem.rawScopes);
    }

    public int hashCode() {
        int hashCode = this.clientKey.hashCode() * 31;
        ArrayList<String> arrayList = this.rawScopes;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthItem(clientKey=");
        LIZ.append(this.clientKey);
        LIZ.append(", rawScopes=");
        LIZ.append(this.rawScopes);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final ArrayList<String> getRawScopes() {
        return this.rawScopes;
    }

    public AuthItem(String clientKey, ArrayList<String> arrayList) {
        o.LJIIIZ(clientKey, "clientKey");
        this.clientKey = clientKey;
        this.rawScopes = arrayList;
    }

    public /* synthetic */ AuthItem(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
