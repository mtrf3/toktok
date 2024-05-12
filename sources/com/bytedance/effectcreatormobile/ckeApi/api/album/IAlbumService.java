package com.bytedance.effectcreatormobile.ckeapi.api.album;

import X.ActivityC45651qj;
import X.C94354afe;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;

/* loaded from: classes34.dex */
public interface IAlbumService extends IService {
    int getResultCode();

    List<EditMedia> parseIntentData(Intent intent, Integer num);

    void startSelectMedia(ActivityC45651qj activityC45651qj, int i, C94354afe c94354afe);

    void startSelectMedia(Fragment fragment, int i, C94354afe c94354afe);
}
