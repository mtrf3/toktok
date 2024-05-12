package com.ss.avframework.livestreamv2.core.interact;

import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.ttlivestreamer.core.utils.MiscUtils;

/* loaded from: classes12.dex */
public interface InteractEngine {
    public static final String AUDIO_LAYER_NAME = MiscUtils.getUUID("interact-audio");

    Client create(InteractConfig interactConfig);

    void dispose();
}
