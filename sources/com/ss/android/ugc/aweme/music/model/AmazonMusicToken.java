package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AmazonMusicToken implements Serializable {

    @InterfaceC65349Pkn("user_token")
    public final String userToken;

    public static /* synthetic */ AmazonMusicToken copy$default(AmazonMusicToken amazonMusicToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amazonMusicToken.userToken;
        }
        return amazonMusicToken.copy(str);
    }

    public final AmazonMusicToken copy(String str) {
        return new AmazonMusicToken(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmazonMusicToken) && o.LJ(this.userToken, ((AmazonMusicToken) obj).userToken);
    }

    public int hashCode() {
        String str = this.userToken;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AmazonMusicToken(userToken=");
        return q.LIZIZ(LIZ, this.userToken, ')', LIZ);
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public AmazonMusicToken(String str) {
        this.userToken = str;
    }
}
