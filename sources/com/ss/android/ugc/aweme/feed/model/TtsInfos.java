package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TtsInfos implements Serializable {

    @InterfaceC65349Pkn("lang")
    public String lang;

    @InterfaceC65349Pkn("language_code")
    public String languageCode;

    @InterfaceC65349Pkn("language_id")
    public Long languageId;

    @InterfaceC65349Pkn("play_addr")
    public PlayAddress playAddress;

    @InterfaceC65349Pkn("voice_type")
    public String voiceType;

    @InterfaceC65349Pkn("volume_info")
    public String volumeInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public TtsInfos() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TtsInfos copy$default(TtsInfos ttsInfos, String str, Long l, String str2, String str3, PlayAddress playAddress, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ttsInfos.lang;
        }
        if ((i & 2) != 0) {
            l = ttsInfos.languageId;
        }
        if ((i & 4) != 0) {
            str2 = ttsInfos.languageCode;
        }
        if ((i & 8) != 0) {
            str3 = ttsInfos.voiceType;
        }
        if ((i & 16) != 0) {
            playAddress = ttsInfos.playAddress;
        }
        if ((i & 32) != 0) {
            str4 = ttsInfos.volumeInfo;
        }
        return ttsInfos.copy(str, l, str2, str3, playAddress, str4);
    }

    public final TtsInfos copy(String str, Long l, String str2, String str3, PlayAddress playAddress, String str4) {
        return new TtsInfos(str, l, str2, str3, playAddress, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsInfos)) {
            return false;
        }
        TtsInfos ttsInfos = (TtsInfos) obj;
        return o.LJ(this.lang, ttsInfos.lang) && o.LJ(this.languageId, ttsInfos.languageId) && o.LJ(this.languageCode, ttsInfos.languageCode) && o.LJ(this.voiceType, ttsInfos.voiceType) && o.LJ(this.playAddress, ttsInfos.playAddress) && o.LJ(this.volumeInfo, ttsInfos.volumeInfo);
    }

    public int hashCode() {
        String str = this.lang;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.languageId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.languageCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.voiceType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PlayAddress playAddress = this.playAddress;
        int hashCode5 = (hashCode4 + (playAddress == null ? 0 : playAddress.hashCode())) * 31;
        String str4 = this.volumeInfo;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TtsInfos(lang=");
        LIZ.append(this.lang);
        LIZ.append(", languageId=");
        LIZ.append(this.languageId);
        LIZ.append(", languageCode=");
        LIZ.append(this.languageCode);
        LIZ.append(", voiceType=");
        LIZ.append(this.voiceType);
        LIZ.append(", playAddress=");
        LIZ.append(this.playAddress);
        LIZ.append(", volumeInfo=");
        return q.LIZIZ(LIZ, this.volumeInfo, ')', LIZ);
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final Long getLanguageId() {
        return this.languageId;
    }

    public final PlayAddress getPlayAddress() {
        return this.playAddress;
    }

    public final String getVoiceType() {
        return this.voiceType;
    }

    public final String getVolumeInfo() {
        return this.volumeInfo;
    }

    public TtsInfos(String str, Long l, String str2, String str3, PlayAddress playAddress, String str4) {
        this.lang = str;
        this.languageId = l;
        this.languageCode = str2;
        this.voiceType = str3;
        this.playAddress = playAddress;
        this.volumeInfo = str4;
    }

    public /* synthetic */ TtsInfos(String str, Long l, String str2, String str3, PlayAddress playAddress, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : playAddress, (i & 32) == 0 ? str4 : null);
    }
}
