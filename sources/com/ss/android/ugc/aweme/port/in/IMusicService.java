package com.ss.android.ugc.aweme.port.in;

import X.InterfaceC84907XTz;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes16.dex */
public interface IMusicService {
    boolean checkValidMusic(AVMusic aVMusic, Context context, boolean z);

    String getCacheDir();

    String getDownloadDir();

    UrlModel getMusicModelAudioTrack(Object obj);

    String getRhythmMusicFilePath(String str);

    boolean isMusicTypeLocal(int i);

    void openChooseMusicPage(Fragment fragment, int i, String str, int i2, MusicModel musicModel, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, String str4, int i3, UrlModel urlModel, String str5, String str6, boolean z7);

    void requestMusic(String str, InterfaceC84907XTz interfaceC84907XTz);

    AVMusic transformNewAVMusic(String str);
}
