package com.bytedance.ies.ugc.aweme.commercialize.splash.service;

import X.ActivityC45651qj;
import X.C29S;
import X.C60192Njo;
import X.NW4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.RealTimeSplashTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadJsonTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadTask;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes7.dex */
public interface ISplashAdService {
    RealTimeSplashTask LIZ();

    SplashBgInflate LIZIZ();

    boolean LIZJ(C29S c29s);

    void LIZLLL(Context context, String str);

    void LJ(boolean z);

    void LJFF();

    void LJI(NW4 nw4);

    C60192Njo LJII(ActivityC45651qj activityC45651qj);

    Drawable LJIIIIZZ(Context context);

    void LJIIIZ();

    void LJIIJ(NW4 nw4);

    View LJIIJJI(ViewGroup viewGroup, Fragment fragment);

    View LJIIL(View view);

    int LJIILIIL();

    boolean LJIILJJIL();

    void LJIILL(String str);

    Aweme LJIILLIIL(String str);

    void LJIIZILJ();

    String LJIJ();

    TopViewPreloadTask LJIJI(List list);

    TopViewPreloadJsonTask LJIJJ();

    SplashAdManagerPreloadTask LJIJJLI();

    void LJIL();

    void LJJ(ActivityC45651qj activityC45651qj);
}
