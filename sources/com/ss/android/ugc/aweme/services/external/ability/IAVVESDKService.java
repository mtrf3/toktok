package com.ss.android.ugc.aweme.services.external.ability;

import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;

/* loaded from: classes8.dex */
public interface IAVVESDKService {
    VEAudioFileInfo getAudioFileInfo(String str);

    AVMusicWaveBean getMusicWaveData(String str, int i, int i2);

    AVMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2);
}
