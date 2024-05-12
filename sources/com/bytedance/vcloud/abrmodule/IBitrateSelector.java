package com.bytedance.vcloud.abrmodule;

import java.util.Map;

/* loaded from: classes9.dex */
public interface IBitrateSelector {
    ABRResult predictBitrate(IPlayStateSupplier iPlayStateSupplier);

    ABRResult predictStartupBitrate(IPlayStateSupplier iPlayStateSupplier);

    void release();

    void setMediaInfo(Map<String, IVideoStream> map, Map<String, IAudioStream> map2);
}
