package com.ss.android.ugc.aweme.im.service.service;

import X.AbstractC73672Svk;
import X.C111144Xu;
import X.C4XO;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.dm.StoryQuickDMBottomBarAssem;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public interface IStoryIMService {
    boolean LIZ(Aweme aweme);

    void LIZIZ(String str, User user, Aweme aweme, String str2, String str3, Boolean bool, C4XO c4xo);

    AbstractC73672Svk<C111144Xu> LIZJ(Aweme aweme);

    void LIZLLL(View view, FragmentManager fragmentManager, Aweme aweme, User user, String str, String str2, String str3, boolean z, StoryQuickDMBottomBarAssem storyQuickDMBottomBarAssem, AqS169S0100000_3 aqS169S0100000_3);

    void LJ(PointF pointF);

    PointF LJFF();
}
