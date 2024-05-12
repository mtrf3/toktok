package com.ss.ttlivestreamer.livestreamv2;

import com.ss.ttlivestreamer.core.statics.StaticsReport;

/* loaded from: classes12.dex */
public class LiveStreamReport extends StaticsReport {
    public int getADMMicVolumedB() {
        return getInt("adm_mic_rec_db");
    }

    public double getAudioMixerCostTimePerFrameMs() {
        return getDouble("audio_mixer_cost_time_per_frame_ms");
    }

    public long getCameraAverageExposureTime() {
        return getLong("camera_average_exposure_time");
    }

    public long getCameraAvgFps() {
        return getLong("camera_average_fps");
    }

    public long getISOInfo() {
        return getLong("camera_iso_info");
    }

    public double getMiniGameRenderFps() {
        return getDouble("mini_game_render_fps");
    }

    public long getTransportAdjustBitrate() {
        return getLong("trans_adjust_bps");
    }

    public double getVideoMixerCostTimePerFrameMs() {
        return getDouble("video_mixer_cost_time_per_frame_ms");
    }

    public void setADMMicVolumedB(int i) {
        setInt("adm_mic_rec_db", i);
    }

    public void setAudioMixerCostTimePerFrameMs(double d) {
        setDouble("audio_mixer_cost_time_per_frame_ms", d);
    }

    public void setCameraAverageExposureTime(long j) {
        setLong("camera_average_exposure_time", j);
    }

    public void setCameraAvgFps(long j) {
        setLong("camera_average_fps", j);
    }

    public void setISOInfo(long j) {
        setLong("camera_iso_info", j);
    }

    public void setMiniGameRenderFps(double d) {
        setDouble("mini_game_render_fps", d);
    }

    public void setTransportAdjustBps(long j) {
        setLong("trans_adjust_bps", j);
    }

    public void setVideoMixerCostTimePerFrameMs(double d) {
        setDouble("video_mixer_cost_time_per_frame_ms", d);
    }
}
