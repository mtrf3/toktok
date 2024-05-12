package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class AudioStruct {

    @InterfaceC65349Pkn("audio_format")
    public int audioFormat;

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("volume_amplitude_peak")
    public double volumeAmplitudePeak;

    @InterfaceC65349Pkn("volume_loudness_lufs")
    public double volumeLoudnessLufs;

    @InterfaceC65349Pkn("vid")
    public String vid = "";

    @InterfaceC65349Pkn("audio_urls")
    public List<String> audioUrls = new ArrayList();
}
