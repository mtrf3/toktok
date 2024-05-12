package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.IMediaPlayerCustomSourceProvider;
import com.ss.bytertc.engine.data.MediaPlayerCustomSourceSeekWhence;
import com.ss.bytertc.engine.data.ReturnStatus;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class RTCMediaPlayerCustomSourceProvider {
    public IMediaPlayerCustomSourceProvider mCustomSourceProvider;

    public void setCustomSourceProvider(IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider) {
        this.mCustomSourceProvider = iMediaPlayerCustomSourceProvider;
    }

    public int onReadData(ByteBuffer byteBuffer, int i) {
        IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider = this.mCustomSourceProvider;
        if (iMediaPlayerCustomSourceProvider != null) {
            return iMediaPlayerCustomSourceProvider.onReadData(byteBuffer, i);
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    public long onSeek(long j, int i) {
        IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider = this.mCustomSourceProvider;
        if (iMediaPlayerCustomSourceProvider != null) {
            return iMediaPlayerCustomSourceProvider.onSeek(j, MediaPlayerCustomSourceSeekWhence.fromId(i));
        }
        return ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }
}
