package com.ss.android.ugc.aweme.services.external.ability;

import com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* loaded from: classes8.dex */
public interface IAVTransformService {

    /* loaded from: classes8.dex */
    public interface ITransformCallback<T> {
        void finish(T t);
    }

    /* loaded from: classes8.dex */
    public interface ITransformProgress {
        void update(int i);
    }

    void audio2wavebean(String str, ITransformCallback<MusicWaveBean> iTransformCallback);

    ExternalUploadVideoConfig parseUploadVideoConfig(String str);

    void video2gif(VideoShare2GifEditContext videoShare2GifEditContext, ITransformProgress iTransformProgress, ITransformCallback<Boolean> iTransformCallback);

    void video2webp(String str, String str2, int i, int i2, ITransformCallback<Integer> iTransformCallback, ITransformProgress iTransformProgress);
}
