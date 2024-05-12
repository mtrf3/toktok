package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.MediaPlayerCustomSourceSeekWhence;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public interface IMediaPlayerCustomSourceProvider {
    int onReadData(ByteBuffer byteBuffer, int i);

    long onSeek(long j, MediaPlayerCustomSourceSeekWhence mediaPlayerCustomSourceSeekWhence);
}
