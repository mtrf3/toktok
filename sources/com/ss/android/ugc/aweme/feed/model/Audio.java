package com.ss.android.ugc.aweme.feed.model;

import X.C47123IeV;
import X.C47124IeW;
import X.C76800UCe;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.V0N;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Audio extends F9E implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("CdnUrlExpired")
    public long CdnUrlExpired;

    @InterfaceC65349Pkn("TtsInfos")
    public List<TtsInfos> TtsInfos;

    @InterfaceC65349Pkn("original_sound_infos")
    public List<OriginalSound> originalSoundInfos;

    public Audio() {
    }

    public static final List<C47123IeV> convertToSimAudio(Video video, Audio audio) {
        return Companion.convertToSimAudio(video, audio);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Audio copy$default(Audio audio, long j, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = audio.CdnUrlExpired;
        }
        if ((i & 2) != 0) {
            list = audio.TtsInfos;
        }
        if ((i & 4) != 0) {
            list2 = audio.originalSoundInfos;
        }
        return audio.copy(j, list, list2);
    }

    public final Audio copy(long j, List<TtsInfos> TtsInfos, List<OriginalSound> originalSoundInfos) {
        o.LJIIIZ(TtsInfos, "TtsInfos");
        o.LJIIIZ(originalSoundInfos, "originalSoundInfos");
        return new Audio(j, TtsInfos, originalSoundInfos);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.CdnUrlExpired), this.TtsInfos, this.originalSoundInfos};
    }

    /* loaded from: classes5.dex */
    public enum InfoIdType {
        ORIGINAL(1),
        TRANSLATED(2);

        public final int infoId;

        public static InfoIdType valueOf(String str) {
            return (InfoIdType) V0N.LJJJ(InfoIdType.class, str);
        }

        public final int getInfoId() {
            return this.infoId;
        }

        InfoIdType(int i) {
            this.infoId = i;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final List<C47123IeV> convertToSimAudio(Video video, Audio audio) {
            C76800UCe c76800UCe;
            VideoUrlModel videoUrlModel;
            List<String> urlList;
            List<TtsInfos> ttsInfos;
            String fileCS;
            String urlKey;
            String urlKey2;
            List<String> urlList2;
            BitRate bitRate;
            o.LJIIIZ(video, "video");
            ArrayList arrayList = new ArrayList();
            if (audio != null && (ttsInfos = audio.getTtsInfos()) != null) {
                for (TtsInfos ttsInfos2 : ttsInfos) {
                    if (ttsInfos2.getPlayAddress() == null) {
                        return null;
                    }
                    C47124IeW c47124IeW = new C47124IeW();
                    String voiceType = ttsInfos2.getVoiceType();
                    if (voiceType != null) {
                        c47124IeW.LIZ.setVoiceType(voiceType);
                    }
                    List<BitRate> bitRate2 = video.getBitRate();
                    if (bitRate2 != null && (bitRate = (BitRate) ORZ.LJLLLL(bitRate2)) != null) {
                        c47124IeW.LIZ.setBitRate(Integer.valueOf(bitRate.getBitRate()));
                    }
                    String lang = ttsInfos2.getLang();
                    if (lang != null) {
                        c47124IeW.LIZ.setLang(lang);
                    }
                    PlayAddress playAddress = ttsInfos2.getPlayAddress();
                    if (playAddress != null && (urlList2 = playAddress.getUrlList()) != null) {
                        c47124IeW.LIZIZ(urlList2);
                    }
                    PlayAddress playAddress2 = ttsInfos2.getPlayAddress();
                    if (playAddress2 != null && (urlKey2 = playAddress2.getUrlKey()) != null) {
                        c47124IeW.LIZ.setFileKey(urlKey2);
                    }
                    PlayAddress playAddress3 = ttsInfos2.getPlayAddress();
                    if (playAddress3 != null && (urlKey = playAddress3.getUrlKey()) != null) {
                        c47124IeW.LIZJ(urlKey);
                    }
                    c47124IeW.LIZ.setCdnUrlExpired(Long.valueOf(audio.getCdnUrlExpired()));
                    PlayAddress playAddress4 = ttsInfos2.getPlayAddress();
                    if (playAddress4 != null && (fileCS = playAddress4.getFileCS()) != null) {
                        c47124IeW.LIZ(fileCS);
                    }
                    c47124IeW.LIZ.setInfoId(Integer.valueOf(InfoIdType.TRANSLATED.getInfoId()));
                    try {
                        c47124IeW.LIZ.setLoudness(Float.valueOf((float) JSONObjectProtectorUtils.getDouble(new JSONObject(ttsInfos2.getVolumeInfo()), "Loudness")));
                    } catch (JSONException unused) {
                    }
                    try {
                        c47124IeW.LIZ.setPeak(Float.valueOf((float) JSONObjectProtectorUtils.getDouble(new JSONObject(ttsInfos2.getVolumeInfo()), "Peak")));
                    } catch (JSONException unused2) {
                    }
                    c47124IeW.LIZ.setCreateTime(SystemClock.elapsedRealtime());
                    arrayList.add(c47124IeW.LIZ);
                }
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            if (c76800UCe == null || (videoUrlModel = video.playAddr) == null || (urlList = videoUrlModel.getUrlList()) == null || ORZ.LJLLLL(urlList) == null) {
                return null;
            }
            return arrayList;
        }
    }

    public final long getCdnUrlExpired() {
        return this.CdnUrlExpired;
    }

    public final List<OriginalSound> getOriginalSoundInfos() {
        return this.originalSoundInfos;
    }

    public final List<TtsInfos> getTtsInfos() {
        return this.TtsInfos;
    }

    public Audio(long j, List<TtsInfos> TtsInfos, List<OriginalSound> originalSoundInfos) {
        o.LJIIIZ(TtsInfos, "TtsInfos");
        o.LJIIIZ(originalSoundInfos, "originalSoundInfos");
        this.CdnUrlExpired = j;
        this.TtsInfos = TtsInfos;
        this.originalSoundInfos = originalSoundInfos;
    }

    public /* synthetic */ Audio(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, list, list2);
    }
}
