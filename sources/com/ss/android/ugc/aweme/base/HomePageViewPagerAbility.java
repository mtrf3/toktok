package com.ss.android.ugc.aweme.base;

import X.C0C3;
import X.C2K0;
import X.LPJ;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.FlingGestureAbility;

/* loaded from: classes10.dex */
public interface HomePageViewPagerAbility extends FlingGestureAbility, C2K0 {
    void J1(Aweme aweme, String str);

    void LJJJJZ(boolean z);

    void Nf0(boolean z);

    LPJ Wv();

    void de();

    boolean gG(MotionEvent motionEvent, float f, float f2);

    float gU();

    void ii(C0C3 c0c3);

    boolean isScrollSwitchHelperInit();

    void ku(C0C3 c0c3);

    void l7(String str);

    boolean toFeedPage(Boolean bool, boolean z);

    String zb0(int i);
}
