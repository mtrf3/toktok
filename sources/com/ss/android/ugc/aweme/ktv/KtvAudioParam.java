package com.ss.android.ugc.aweme.ktv;

import X.InterfaceC65349Pkn;
import X.OSZ;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KtvAudioParam implements Serializable {

    @InterfaceC65349Pkn("play_url_duration")
    public int duration;

    @InterfaceC65349Pkn("volume_loudness")
    public double loudness;

    @InterfaceC65349Pkn("volume_peak")
    public double peak;

    @InterfaceC65349Pkn("play_url_start")
    public int playStart;

    @InterfaceC65349Pkn("play_url")
    public UrlModel playUrl;

    @InterfaceC65349Pkn("play_time_list")
    public List<AudioInterval> timeList = new ArrayList();

    @InterfaceC65349Pkn("audio_track_index")
    public int audioTrackIndex = -1;

    @InterfaceC65349Pkn("audio_uuid")
    public String audioTrackUuid = "";

    @InterfaceC65349Pkn("volume_filter_index_list")
    public List<OSZ<Integer, Boolean>> volumeFilters = new ArrayList();

    @InterfaceC65349Pkn("volume_filter_uuid_list")
    public List<OSZ<String, Boolean>> volumeFiltersNLE = new ArrayList();

    @InterfaceC65349Pkn("balance_filter_index")
    public int balanceFilter = -1;

    @InterfaceC65349Pkn("enable_audio_track")
    public boolean enableAudioTrack = true;

    @InterfaceC65349Pkn("volume")
    public float volume = 0.5f;

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final String getAudioTrackUuid() {
        return this.audioTrackUuid;
    }

    public final int getBalanceFilter() {
        return this.balanceFilter;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final boolean getEnableAudioTrack() {
        return this.enableAudioTrack;
    }

    public final double getLoudness() {
        return this.loudness;
    }

    public final double getPeak() {
        return this.peak;
    }

    public final int getPlayStart() {
        return this.playStart;
    }

    public final UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public final List<AudioInterval> getTimeList() {
        return this.timeList;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final List<OSZ<Integer, Boolean>> getVolumeFilters() {
        return this.volumeFilters;
    }

    public final List<OSZ<String, Boolean>> getVolumeFiltersNLE() {
        return this.volumeFiltersNLE;
    }

    public final void setAudioTrackIndex(int i) {
        this.audioTrackIndex = i;
    }

    public final void setAudioTrackUuid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.audioTrackUuid = str;
    }

    public final void setBalanceFilter(int i) {
        this.balanceFilter = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setEnableAudioTrack(boolean z) {
        this.enableAudioTrack = z;
    }

    public final void setLoudness(double d) {
        this.loudness = d;
    }

    public final void setPeak(double d) {
        this.peak = d;
    }

    public final void setPlayStart(int i) {
        this.playStart = i;
    }

    public final void setPlayUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public final void setTimeList(List<AudioInterval> list) {
        o.LJIIIZ(list, "<set-?>");
        this.timeList = list;
    }

    public final void setVolume(float f) {
        this.volume = f;
    }

    public final void setVolumeFilters(List<OSZ<Integer, Boolean>> list) {
        o.LJIIIZ(list, "<set-?>");
        this.volumeFilters = list;
    }

    public final void setVolumeFiltersNLE(List<OSZ<String, Boolean>> list) {
        o.LJIIIZ(list, "<set-?>");
        this.volumeFiltersNLE = list;
    }
}
