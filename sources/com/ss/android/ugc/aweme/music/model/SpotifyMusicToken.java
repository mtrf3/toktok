package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SpotifyMusicToken implements Serializable {

    @InterfaceC65349Pkn("access_token")
    public final String userToken;

    public static /* synthetic */ SpotifyMusicToken copy$default(SpotifyMusicToken spotifyMusicToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotifyMusicToken.userToken;
        }
        return spotifyMusicToken.copy(str);
    }

    public final SpotifyMusicToken copy(String str) {
        return new SpotifyMusicToken(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpotifyMusicToken) && o.LJ(this.userToken, ((SpotifyMusicToken) obj).userToken);
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
        LIZ.append("SpotifyMusicToken(userToken=");
        return q.LIZIZ(LIZ, this.userToken, ')', LIZ);
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public SpotifyMusicToken(String str) {
        this.userToken = str;
    }
}
