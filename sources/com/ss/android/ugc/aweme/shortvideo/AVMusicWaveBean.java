package com.ss.android.ugc.aweme.shortvideo;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class AVMusicWaveBean implements Serializable {

    @InterfaceC65349Pkn("music_length")
    public long musicLength;

    @InterfaceC65349Pkn("video_length")
    public long videoLenght;

    @InterfaceC65349Pkn("music_wave_ary")
    public float[] musicWavePointArray = new float[0];

    @InterfaceC65349Pkn("music_path")
    public String musicPath = "";

    public final AVMusicWaveBean clone() {
        AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
        aVMusicWaveBean.musicWavePointArray = (float[]) this.musicWavePointArray.clone();
        aVMusicWaveBean.musicPath = this.musicPath;
        aVMusicWaveBean.videoLenght = this.videoLenght;
        aVMusicWaveBean.musicLength = this.musicLength;
        return aVMusicWaveBean;
    }

    public final long getMusicLength() {
        return this.musicLength;
    }

    public final String getMusicPath() {
        return this.musicPath;
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

    public final void setMusicPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.musicPath = str;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        o.LJIIIZ(fArr, "<set-?>");
        this.musicWavePointArray = fArr;
    }

    public final void setVideoLenght(long j) {
        this.videoLenght = j;
    }
}
