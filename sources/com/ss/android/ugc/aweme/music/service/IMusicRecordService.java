package com.ss.android.ugc.aweme.music.service;

import X.OV6;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;

/* loaded from: classes10.dex */
public interface IMusicRecordService {
    void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, OV6 ov6, int i, boolean z, String str3, int i2, String str4, String str5, Boolean bool);

    void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, OV6 ov6, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData);

    void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, OV6 ov6, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2);

    void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, OV6 ov6, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2, Boolean bool4);
}
