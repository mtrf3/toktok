package com.ss.avframework.livestreamv2.core.interact.audio;

import java.nio.Buffer;

/* loaded from: classes12.dex */
public interface AudioCallback {
    void onAudioWarning(String str);

    boolean updateAudioFrame(Buffer buffer, int i, long j);
}
