package com.ss.bytertc.engine.data;

import X.X1D;
import com.ss.bytertc.engine.IMediaPlayerCustomSourceProvider;

/* loaded from: classes33.dex */
public class MediaPlayerCustomSource {
    public MediaPlayerCustomSourceMode mode;
    public IMediaPlayerCustomSourceProvider provider;
    public MediaPlayerCustomSourceStreamType type;

    public MediaPlayerCustomSource() {
        this.mode = MediaPlayerCustomSourceMode.PUSH;
        this.type = MediaPlayerCustomSourceStreamType.RAW;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaPlayerCustomSource{provider='");
        LIZ.append(this.provider);
        LIZ.append('\'');
        LIZ.append(", MediaPlayerCustomSourceMode='");
        LIZ.append(this.mode);
        LIZ.append('\'');
        LIZ.append(", MediaPlayerCustomSourceStreamType='");
        LIZ.append(this.type);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public MediaPlayerCustomSource(IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider, MediaPlayerCustomSourceMode mediaPlayerCustomSourceMode, MediaPlayerCustomSourceStreamType mediaPlayerCustomSourceStreamType) {
        this.mode = MediaPlayerCustomSourceMode.PUSH;
        this.mode = mediaPlayerCustomSourceMode;
        this.type = mediaPlayerCustomSourceStreamType;
        this.provider = iMediaPlayerCustomSourceProvider;
    }
}
