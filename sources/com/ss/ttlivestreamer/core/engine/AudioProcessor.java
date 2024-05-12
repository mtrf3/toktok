package com.ss.ttlivestreamer.core.engine;

import java.nio.Buffer;

/* loaded from: classes12.dex */
public abstract class AudioProcessor extends NativeObject {
    public abstract Buffer process(Buffer buffer, int i, int i2, int i3, long j);
}
