package com.byted.cast.render.render.audio;

import com.byted.cast.render.render.IRender;

/* loaded from: classes29.dex */
public interface IAudioRender extends IRender {
    void config_audio_parameters(int i, int i2, int i3);

    float getMaxVol();

    float getMinVol();

    void setVolume(float f);
}
