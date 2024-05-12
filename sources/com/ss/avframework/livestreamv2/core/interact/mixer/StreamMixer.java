package com.ss.avframework.livestreamv2.core.interact.mixer;

import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class StreamMixer {
    public Config.MixStreamType mMixType;
    public boolean mStart;

    public void stopMixStream() {
        this.mStart = false;
    }

    public void updateMixStream(MixedStreamConfig mixedStreamConfig) {
    }

    public void updateMixStream(List<Region> list, String str, boolean z, boolean z2, Map<String, Client.RTCWaterMarkRegion> map) {
    }

    public void startMixStream(MixedStreamConfig mixedStreamConfig) {
        this.mStart = true;
    }
}
