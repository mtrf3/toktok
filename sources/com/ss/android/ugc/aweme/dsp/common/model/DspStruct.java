package com.ss.android.ugc.aweme.dsp.common.model;

import X.C91087Zox;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* loaded from: classes22.dex */
public final class DspStruct implements Serializable {
    public static final C91087Zox Companion = new C91087Zox();

    @InterfaceC65349Pkn("ttm_artist")
    public TTMArtistStruct ttmArtist;

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme = new Aweme();

    @InterfaceC65349Pkn("dsp_extra")
    public final DspExtraStruct dspExtra = new DspExtraStruct();

    @InterfaceC65349Pkn("media_type")
    public final int mediaType = -1;

    @InterfaceC65349Pkn("dsp_music")
    public final DspMusicStruct dspMusic = new DspMusicStruct();

    @InterfaceC65349Pkn("media_id")
    public final String mediaId = "";

    public final boolean isAudio() {
        if (this.mediaType == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> getMusicDspLyricStartAndEndTime() {
        /*
            r11 = this;
            boolean r0 = r11.isAudio()
            if (r0 == 0) goto L74
            com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct r0 = r11.dspMusic
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r0.getMatchedSongInfo()
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.music.model.MusicChorusInfo r10 = r0.getChorusInfo()
        L18:
            com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct r0 = r11.dspMusic
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            r5 = 0
            if (r0 == 0) goto L70
            int r0 = r0.getDuration()
            int r4 = r0 * 1000
        L27:
            r8 = 0
            if (r10 == 0) goto L6d
            long r1 = r10.getStartTime()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L41
            long r6 = r10.getStartTime()
            long r1 = (long) r4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L41
            long r0 = r10.getStartTime()
            int r5 = (int) r0
        L41:
            long r1 = r10.getDuration()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L6d
            long r2 = r10.getDuration()
            int r1 = (int) r2
            r0 = 60000(0xea60, float:8.4078E-41)
            if (r1 <= r0) goto L66
            int r0 = r0 + r5
        L54:
            if (r0 <= r4) goto L64
        L56:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.<init>(r1, r0)
        L63:
            return r2
        L64:
            r4 = r0
            goto L56
        L66:
            long r1 = r10.getDuration()
            int r0 = (int) r1
            int r0 = r0 + r5
            goto L54
        L6d:
            int r0 = r5 + 30000
            goto L54
        L70:
            r4 = 0
            goto L27
        L72:
            r10 = 0
            goto L18
        L74:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.aweme
            android.util.Pair r2 = r0.getMusicDspStartAndEndTime()
            java.lang.String r0 = "{\n            aweme.musi…StartAndEndTime\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.common.model.DspStruct.getMusicDspLyricStartAndEndTime():android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> getMusicDspStartAndEndTime() {
        /*
            r11 = this;
            boolean r0 = r11.isAudio()
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct r0 = r11.dspMusic
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r0.getMatchedSongInfo()
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.music.model.MusicChorusInfo r10 = r0.getChorusInfo()
        L18:
            com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct r0 = r11.dspMusic
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            r5 = 0
            if (r0 == 0) goto L6d
            int r0 = r0.getDuration()
            int r4 = r0 * 1000
        L27:
            r8 = 0
            if (r10 == 0) goto L52
            long r1 = r10.getStartTime()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L41
            long r6 = r10.getStartTime()
            long r1 = (long) r4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L41
            long r0 = r10.getStartTime()
            int r5 = (int) r0
        L41:
            long r1 = r10.getDuration()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L52
            long r2 = r10.getDuration()
            int r1 = (int) r2
            r0 = 30000(0x7530, float:4.2039E-41)
            if (r1 <= r0) goto L66
        L52:
            int r0 = r5 + 30000
        L54:
            if (r0 <= r4) goto L64
        L56:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.<init>(r1, r0)
        L63:
            return r2
        L64:
            r4 = r0
            goto L56
        L66:
            long r1 = r10.getDuration()
            int r0 = (int) r1
            int r0 = r0 + r5
            goto L54
        L6d:
            r4 = 0
            goto L27
        L6f:
            r10 = 0
            goto L18
        L71:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.aweme
            android.util.Pair r2 = r0.getMusicDspStartAndEndTime()
            java.lang.String r0 = "{\n            aweme.musi…StartAndEndTime\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.common.model.DspStruct.getMusicDspStartAndEndTime():android.util.Pair");
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final DspExtraStruct getDspExtra() {
        return this.dspExtra;
    }

    public final DspMusicStruct getDspMusic() {
        return this.dspMusic;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final TTMArtistStruct getTtmArtist() {
        return this.ttmArtist;
    }

    public final void setTtmArtist(TTMArtistStruct tTMArtistStruct) {
        this.ttmArtist = tTMArtistStruct;
    }
}
