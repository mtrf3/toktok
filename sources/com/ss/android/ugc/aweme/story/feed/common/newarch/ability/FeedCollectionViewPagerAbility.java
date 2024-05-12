package com.ss.android.ugc.aweme.story.feed.common.newarch.ability;

import X.C2MA;
import X.EnumC215438ct;
import X.InterfaceC56392Jf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes4.dex */
public interface FeedCollectionViewPagerAbility extends IViewPagerAbility, IAdapterAbility, IViewPagerChangeListenerAbility, InterfaceC56392Jf {
    void Hr0();

    List<Aweme> Q8();

    EnumC215438ct R();

    boolean Tw();

    boolean g50();

    C2MA getCurViewHolder();

    Aweme getItem(int i);

    C2MA getViewHolderByAwemeId(String str);
}
