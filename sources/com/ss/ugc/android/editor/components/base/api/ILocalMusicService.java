package com.ss.ugc.android.editor.components.base.api;

import X.ActivityC45651qj;
import androidx.fragment.app.Fragment;
import com.bytedance.news.common.service.manager.IService;
import com.ss.ugc.android.editor.base.data.MusicCollection;
import java.util.List;

/* loaded from: classes2.dex */
public interface ILocalMusicService extends IService {
    Fragment getAudioEffectListFragment(MusicCollection musicCollection, String str);

    Fragment getLocalMusicFragment(ActivityC45651qj activityC45651qj, int i);

    List<MusicCollection> getSoundEffectsCollection();
}
