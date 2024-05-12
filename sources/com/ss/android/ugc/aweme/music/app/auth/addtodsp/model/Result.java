package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class Result {

    @InterfaceC65349Pkn("musicUserToken")
    public final String userToken;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Result) && o.LJ(this.userToken, ((Result) obj).userToken);
    }

    public final int hashCode() {
        String str = this.userToken;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Result(userToken=");
        LIZ.append(this.userToken);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public Result(String str) {
        this.userToken = str;
    }
}
