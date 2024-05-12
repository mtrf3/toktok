package com.ss.android.ugc.aweme.music.model;

import X.C48339Iy7;
import X.C79062V1e;
import X.X1D;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DspAuthParam {
    public final String awemeId;
    public final String buttonType;
    public final DspPlatform dspPlatform;
    public final TT2DSPSongInfo dspSongInfo;
    public final String enterFrom;
    public final Fragment fragment;
    public final boolean isFromMusicDetail;
    public final String metaSongId;
    public final String musicId;
    public final String musicVolume;

    public static /* synthetic */ DspAuthParam copy$default(DspAuthParam dspAuthParam, DspPlatform dspPlatform, Fragment fragment, TT2DSPSongInfo tT2DSPSongInfo, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dspPlatform = dspAuthParam.dspPlatform;
        }
        if ((i & 2) != 0) {
            fragment = dspAuthParam.fragment;
        }
        if ((i & 4) != 0) {
            tT2DSPSongInfo = dspAuthParam.dspSongInfo;
        }
        if ((i & 8) != 0) {
            str = dspAuthParam.metaSongId;
        }
        if ((i & 16) != 0) {
            str2 = dspAuthParam.enterFrom;
        }
        if ((i & 32) != 0) {
            str3 = dspAuthParam.awemeId;
        }
        if ((i & 64) != 0) {
            str4 = dspAuthParam.musicId;
        }
        if ((i & 128) != 0) {
            str5 = dspAuthParam.musicVolume;
        }
        if ((i & 256) != 0) {
            str6 = dspAuthParam.buttonType;
        }
        if ((i & 512) != 0) {
            z = dspAuthParam.isFromMusicDetail;
        }
        return dspAuthParam.copy(dspPlatform, fragment, tT2DSPSongInfo, str, str2, str3, str4, str5, str6, z);
    }

    public final DspAuthParam copy(DspPlatform dspPlatform, Fragment fragment, TT2DSPSongInfo tT2DSPSongInfo, String str, String enterFrom, String awemeId, String musicId, String musicVolume, String buttonType, boolean z) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(musicVolume, "musicVolume");
        o.LJIIIZ(buttonType, "buttonType");
        return new DspAuthParam(dspPlatform, fragment, tT2DSPSongInfo, str, enterFrom, awemeId, musicId, musicVolume, buttonType, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DspAuthParam)) {
            return false;
        }
        DspAuthParam dspAuthParam = (DspAuthParam) obj;
        return this.dspPlatform == dspAuthParam.dspPlatform && o.LJ(this.fragment, dspAuthParam.fragment) && o.LJ(this.dspSongInfo, dspAuthParam.dspSongInfo) && o.LJ(this.metaSongId, dspAuthParam.metaSongId) && o.LJ(this.enterFrom, dspAuthParam.enterFrom) && o.LJ(this.awemeId, dspAuthParam.awemeId) && o.LJ(this.musicId, dspAuthParam.musicId) && o.LJ(this.musicVolume, dspAuthParam.musicVolume) && o.LJ(this.buttonType, dspAuthParam.buttonType) && this.isFromMusicDetail == dspAuthParam.isFromMusicDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.dspPlatform.hashCode() * 31;
        Fragment fragment = this.fragment;
        int i = 0;
        if (fragment == null) {
            hashCode = 0;
        } else {
            hashCode = fragment.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        TT2DSPSongInfo tT2DSPSongInfo = this.dspSongInfo;
        if (tT2DSPSongInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = tT2DSPSongInfo.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.metaSongId;
        if (str != null) {
            i = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.buttonType, C79062V1e.LJ(this.musicVolume, C79062V1e.LJ(this.musicId, C79062V1e.LJ(this.awemeId, C79062V1e.LJ(this.enterFrom, (i3 + i) * 31, 31), 31), 31), 31), 31);
        boolean z = this.isFromMusicDetail;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return LJ + i4;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DspAuthParam(dspPlatform=");
        LIZ.append(this.dspPlatform);
        LIZ.append(", fragment=");
        LIZ.append(this.fragment);
        LIZ.append(", dspSongInfo=");
        LIZ.append(this.dspSongInfo);
        LIZ.append(", metaSongId=");
        LIZ.append(this.metaSongId);
        LIZ.append(", enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", awemeId=");
        LIZ.append(this.awemeId);
        LIZ.append(", musicId=");
        LIZ.append(this.musicId);
        LIZ.append(", musicVolume=");
        LIZ.append(this.musicVolume);
        LIZ.append(", buttonType=");
        LIZ.append(this.buttonType);
        LIZ.append(", isFromMusicDetail=");
        return C48339Iy7.LIZJ(LIZ, this.isFromMusicDetail, ')', LIZ);
    }

    public DspAuthParam(DspPlatform dspPlatform, Fragment fragment, TT2DSPSongInfo tT2DSPSongInfo, String str, String enterFrom, String awemeId, String musicId, String musicVolume, String buttonType, boolean z) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(musicVolume, "musicVolume");
        o.LJIIIZ(buttonType, "buttonType");
        this.dspPlatform = dspPlatform;
        this.fragment = fragment;
        this.dspSongInfo = tT2DSPSongInfo;
        this.metaSongId = str;
        this.enterFrom = enterFrom;
        this.awemeId = awemeId;
        this.musicId = musicId;
        this.musicVolume = musicVolume;
        this.buttonType = buttonType;
        this.isFromMusicDetail = z;
    }
}
