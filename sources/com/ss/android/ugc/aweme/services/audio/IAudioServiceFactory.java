package com.ss.android.ugc.aweme.services.audio;

import com.ss.android.ugc.aweme.services.audio.IAudioParams;

/* loaded from: classes3.dex */
public interface IAudioServiceFactory<T extends IAudioParams> {
    IAudioService getAudioService(T t);
}
