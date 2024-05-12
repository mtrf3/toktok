package com.ss.android.ugc.aweme.detail.platform;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* loaded from: classes10.dex */
public interface IDetailPageAbility extends IDetailLifecycleAbility {
    void Jk();

    Aweme O1();

    void P90();

    long Sb();

    DetailFragmentPanel Wr();

    int Zg();

    long aG();

    DetailPageComponent lk();

    boolean mq();

    void ph(Music music, EditPostPermission editPostPermission);

    void rY(KeyEvent keyEvent);

    void wn(List<? extends Aweme> list);
}
