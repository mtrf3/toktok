package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AppleMusicToken implements Serializable {

    @InterfaceC65349Pkn("developer_token")
    public String developToken;

    @InterfaceC65349Pkn("user_token")
    public String userToken;

    public AppleMusicToken() {
    }

    public static /* synthetic */ AppleMusicToken copy$default(AppleMusicToken appleMusicToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appleMusicToken.developToken;
        }
        if ((i & 2) != 0) {
            str2 = appleMusicToken.userToken;
        }
        return appleMusicToken.copy(str, str2);
    }

    public final AppleMusicToken copy(String str, String str2) {
        return new AppleMusicToken(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppleMusicToken)) {
            return false;
        }
        AppleMusicToken appleMusicToken = (AppleMusicToken) obj;
        return o.LJ(this.developToken, appleMusicToken.developToken) && o.LJ(this.userToken, appleMusicToken.userToken);
    }

    public int hashCode() {
        String str = this.developToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userToken;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AppleMusicToken(developToken=");
        LIZ.append(this.developToken);
        LIZ.append(", userToken=");
        return q.LIZIZ(LIZ, this.userToken, ')', LIZ);
    }

    public final String getDevelopToken() {
        return this.developToken;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public AppleMusicToken(String str, String str2) {
        this.developToken = str;
        this.userToken = str2;
    }
}
