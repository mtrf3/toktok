package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class AudioPropertiesConfig {
    public AudioPropertiesMode audioReportMode;
    public boolean enableSpectrum;
    public boolean enableVad;
    public boolean enableVoicePitch;
    public int interval;
    public AudioReportMode localMainReportMode;
    public float smooth;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioPropertiesConfig{interval='");
        LIZ.append(this.interval);
        LIZ.append('\'');
        LIZ.append("enable_spectrum='");
        LIZ.append(this.enableSpectrum);
        LIZ.append('\'');
        LIZ.append("enable_vad='");
        LIZ.append(this.enableVad);
        LIZ.append('\'');
        LIZ.append("local_main_report_mode='");
        LIZ.append(this.localMainReportMode);
        LIZ.append('\'');
        LIZ.append("audio_report_mode='");
        LIZ.append(this.audioReportMode.toString());
        LIZ.append('\'');
        LIZ.append("enable_voice_pitch='");
        LIZ.append(this.enableVoicePitch);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public AudioPropertiesConfig(int i) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.interval = i;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        AudioPropertiesMode audioPropertiesMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.audioReportMode = audioPropertiesMode;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2, AudioReportMode audioReportMode) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = audioReportMode;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2, AudioReportMode audioReportMode, float f) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = audioReportMode;
        this.smooth = f;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2, AudioReportMode audioReportMode, float f, AudioPropertiesMode audioPropertiesMode) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = audioReportMode;
        this.smooth = f;
        this.audioReportMode = audioPropertiesMode;
    }
}
