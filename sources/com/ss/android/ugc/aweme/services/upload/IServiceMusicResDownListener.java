package com.ss.android.ugc.aweme.services.upload;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes8.dex */
public interface IServiceMusicResDownListener {
    void onFailed();

    void onSuccess(MusicModel musicModel, String str);
}
