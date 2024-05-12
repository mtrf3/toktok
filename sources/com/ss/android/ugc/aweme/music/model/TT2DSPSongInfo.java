package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TT2DSPSongInfo implements Serializable {

    @InterfaceC65349Pkn("button_type")
    public Integer buttonType;

    @InterfaceC65349Pkn("platform")
    public Integer dspPlatform;

    @InterfaceC65349Pkn("platform_selected_by_user")
    public Boolean platformSelectedByUser;

    @InterfaceC65349Pkn("song_id")
    public String songId;

    @InterfaceC65349Pkn("token")
    public DspAuthToken token;

    public TT2DSPSongInfo() {
    }

    public static /* synthetic */ TT2DSPSongInfo copy$default(TT2DSPSongInfo tT2DSPSongInfo, Integer num, String str, Boolean bool, DspAuthToken dspAuthToken, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = tT2DSPSongInfo.dspPlatform;
        }
        if ((i & 2) != 0) {
            str = tT2DSPSongInfo.songId;
        }
        if ((i & 4) != 0) {
            bool = tT2DSPSongInfo.platformSelectedByUser;
        }
        if ((i & 8) != 0) {
            dspAuthToken = tT2DSPSongInfo.token;
        }
        if ((i & 16) != 0) {
            num2 = tT2DSPSongInfo.buttonType;
        }
        return tT2DSPSongInfo.copy(num, str, bool, dspAuthToken, num2);
    }

    public final TT2DSPSongInfo copy(Integer num, String str, Boolean bool, DspAuthToken dspAuthToken, Integer num2) {
        return new TT2DSPSongInfo(num, str, bool, dspAuthToken, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TT2DSPSongInfo)) {
            return false;
        }
        TT2DSPSongInfo tT2DSPSongInfo = (TT2DSPSongInfo) obj;
        return o.LJ(this.dspPlatform, tT2DSPSongInfo.dspPlatform) && o.LJ(this.songId, tT2DSPSongInfo.songId) && o.LJ(this.platformSelectedByUser, tT2DSPSongInfo.platformSelectedByUser) && o.LJ(this.token, tT2DSPSongInfo.token) && o.LJ(this.buttonType, tT2DSPSongInfo.buttonType);
    }

    public int hashCode() {
        Integer num = this.dspPlatform;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.songId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.platformSelectedByUser;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        DspAuthToken dspAuthToken = this.token;
        int hashCode4 = (hashCode3 + (dspAuthToken == null ? 0 : dspAuthToken.hashCode())) * 31;
        Integer num2 = this.buttonType;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TT2DSPSongInfo(dspPlatform=");
        LIZ.append(this.dspPlatform);
        LIZ.append(", songId=");
        LIZ.append(this.songId);
        LIZ.append(", platformSelectedByUser=");
        LIZ.append(this.platformSelectedByUser);
        LIZ.append(", token=");
        LIZ.append(this.token);
        LIZ.append(", buttonType=");
        return s0.LIZJ(LIZ, this.buttonType, ')', LIZ);
    }

    public final Integer getButtonType() {
        return this.buttonType;
    }

    public final Integer getDspPlatform() {
        return this.dspPlatform;
    }

    public final Boolean getPlatformSelectedByUser() {
        return this.platformSelectedByUser;
    }

    public final String getSongId() {
        return this.songId;
    }

    public final DspAuthToken getToken() {
        return this.token;
    }

    public TT2DSPSongInfo(Integer num, String str, Boolean bool, DspAuthToken dspAuthToken, Integer num2) {
        this.dspPlatform = num;
        this.songId = str;
        this.platformSelectedByUser = bool;
        this.token = dspAuthToken;
        this.buttonType = num2;
    }

    public /* synthetic */ TT2DSPSongInfo(Integer num, String str, Boolean bool, DspAuthToken dspAuthToken, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, bool, dspAuthToken, (i & 16) != 0 ? null : num2);
    }
}
