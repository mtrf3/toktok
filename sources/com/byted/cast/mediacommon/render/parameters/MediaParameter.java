package com.byted.cast.mediacommon.render.parameters;

import X.V0N;

/* loaded from: classes29.dex */
public enum MediaParameter {
    Video_Decoder_IsSetSurface,
    Audio_IsAutoPlay,
    Render_IsOpenJitterBuffer,
    Render_IsUseSoftDecoder,
    Audio_Render_Channel,
    Audio_Render_SampleRate,
    Audio_Render_BitWidth,
    Audio_Render_FrameSize,
    Audio_Render_BitRate,
    Audio_Render_SessionId,
    Video_JitterBuffer_Mode,
    Audio_JitterBuffer_Mode,
    Audio_JitterBuffer_Delay,
    Video_JitterBuffer_Delay,
    Audio_Render_volume,
    Audio_Render_max_vol,
    Audio_Render_min_vol,
    Audio_Render_routingChangedListener,
    Render_videoLatencyListener,
    Render_audioLatencyListener,
    Render_dumpFilePath,
    Render_context;

    public static MediaParameter valueOf(String str) {
        return (MediaParameter) V0N.LJJJ(MediaParameter.class, str);
    }
}
