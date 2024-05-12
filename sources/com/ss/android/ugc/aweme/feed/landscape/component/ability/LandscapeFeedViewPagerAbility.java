package com.ss.android.ugc.aweme.feed.landscape.component.ability;

import X.C2K0;
import X.C2MA;
import X.C76800UCe;
import X.C80796VnM;
import X.InterfaceC88472Yns;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public interface LandscapeFeedViewPagerAbility extends C2K0 {
    void Zn(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    Aweme getAwemeByIndex(int i);

    int getCurIndex();

    C2MA getCurViewHolder();

    Aweme getCurrentPlayAweme();

    int getIndexByAweme(Aweme aweme);

    int getItemCount();

    C2MA getNextViewHolder();

    C2MA getPreViewHolder();

    C2MA getViewHolderByAwemeId(String str);

    C80796VnM lH();

    Aweme nx();
}
