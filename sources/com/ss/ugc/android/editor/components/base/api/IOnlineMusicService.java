package com.ss.ugc.android.editor.components.base.api;

import X.C2YP;
import androidx.fragment.app.Fragment;
import com.bytedance.news.common.service.manager.IService;
import com.ss.ugc.android.editor.base.data.MusicCollection;
import com.ss.ugc.android.editor.base.music.IMusicFetcher;

/* loaded from: classes2.dex */
public interface IOnlineMusicService extends IService {
    Fragment createMusicListFragment(MusicCollection musicCollection, String str);

    void destroy();

    IMusicFetcher getMusicFetcher();

    void init(C2YP c2yp);

    Fragment showMusicPageFragment();
}
