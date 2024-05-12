package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class MusicWaveBean implements Serializable {

    @InterfaceC65349Pkn("music_length")
    public long musicLength;

    @InterfaceC65349Pkn("music_wave_ary")
    public float[] musicWavePointArray = new float[0];

    @InterfaceC65349Pkn("video_length")
    public long videoLenght;

    public final MusicWaveBean clone() {
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.musicWavePointArray = (float[]) this.musicWavePointArray.clone();
        musicWaveBean.videoLenght = this.videoLenght;
        musicWaveBean.musicLength = this.musicLength;
        return musicWaveBean;
    }

    public final long getMusicLength() {
        return this.musicLength;
    }

    public final float[] getMusicWavePointArray() {
        return this.musicWavePointArray;
    }

    public final long getVideoLenght() {
        return this.videoLenght;
    }

    public final void setMusicLength(long j) {
        this.musicLength = j;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        o.LJIIIZ(fArr, "<set-?>");
        this.musicWavePointArray = fArr;
    }

    public final void setVideoLenght(long j) {
        this.videoLenght = j;
    }
}
