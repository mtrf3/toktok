package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DspAuthToken implements Serializable {

    @InterfaceC65349Pkn("amazon_music_token")
    public AmazonMusicToken amazonMusicToken;

    @InterfaceC65349Pkn("apple_music_token")
    public AppleMusicToken appleMusicToken;

    @InterfaceC65349Pkn("spotify_music_token")
    public SpotifyMusicToken spotifyMusicToken;

    public DspAuthToken() {
    }

    public static /* synthetic */ DspAuthToken copy$default(DspAuthToken dspAuthToken, AppleMusicToken appleMusicToken, AmazonMusicToken amazonMusicToken, SpotifyMusicToken spotifyMusicToken, int i, Object obj) {
        if ((i & 1) != 0) {
            appleMusicToken = dspAuthToken.appleMusicToken;
        }
        if ((i & 2) != 0) {
            amazonMusicToken = dspAuthToken.amazonMusicToken;
        }
        if ((i & 4) != 0) {
            spotifyMusicToken = dspAuthToken.spotifyMusicToken;
        }
        return dspAuthToken.copy(appleMusicToken, amazonMusicToken, spotifyMusicToken);
    }

    public final DspAuthToken copy(AppleMusicToken appleMusicToken, AmazonMusicToken amazonMusicToken, SpotifyMusicToken spotifyMusicToken) {
        return new DspAuthToken(appleMusicToken, amazonMusicToken, spotifyMusicToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DspAuthToken)) {
            return false;
        }
        DspAuthToken dspAuthToken = (DspAuthToken) obj;
        return o.LJ(this.appleMusicToken, dspAuthToken.appleMusicToken) && o.LJ(this.amazonMusicToken, dspAuthToken.amazonMusicToken) && o.LJ(this.spotifyMusicToken, dspAuthToken.spotifyMusicToken);
    }

    public int hashCode() {
        AppleMusicToken appleMusicToken = this.appleMusicToken;
        int hashCode = (appleMusicToken == null ? 0 : appleMusicToken.hashCode()) * 31;
        AmazonMusicToken amazonMusicToken = this.amazonMusicToken;
        int hashCode2 = (hashCode + (amazonMusicToken == null ? 0 : amazonMusicToken.hashCode())) * 31;
        SpotifyMusicToken spotifyMusicToken = this.spotifyMusicToken;
        return hashCode2 + (spotifyMusicToken != null ? spotifyMusicToken.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DspAuthToken(appleMusicToken=");
        LIZ.append(this.appleMusicToken);
        LIZ.append(", amazonMusicToken=");
        LIZ.append(this.amazonMusicToken);
        LIZ.append(", spotifyMusicToken=");
        LIZ.append(this.spotifyMusicToken);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AmazonMusicToken getAmazonMusicToken() {
        return this.amazonMusicToken;
    }

    public final AppleMusicToken getAppleMusicToken() {
        return this.appleMusicToken;
    }

    public final SpotifyMusicToken getSpotifyMusicToken() {
        return this.spotifyMusicToken;
    }

    public DspAuthToken(AppleMusicToken appleMusicToken, AmazonMusicToken amazonMusicToken, SpotifyMusicToken spotifyMusicToken) {
        this.appleMusicToken = appleMusicToken;
        this.amazonMusicToken = amazonMusicToken;
        this.spotifyMusicToken = spotifyMusicToken;
    }
}
