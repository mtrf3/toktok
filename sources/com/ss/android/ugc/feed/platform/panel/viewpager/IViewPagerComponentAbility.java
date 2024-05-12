package com.ss.android.ugc.feed.platform.panel.viewpager;

import X.C2MA;
import X.C2MJ;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes2.dex */
public interface IViewPagerComponentAbility extends IViewPagerAbility {
    void Cp(C2MJ c2mj);

    Aweme DQ(Aweme aweme);

    void De0(C2MJ c2mj);

    int FQ();

    Object Fr0(int i, int i2);

    C2MA K80();

    void Qc0();

    Object TQ(int i);

    boolean ar0(int i, boolean z);

    void at(C2MA c2ma);

    Boolean fK(int i);

    Aweme fq0();

    List<C2MA> getAllViewHolders();

    C2MA getCurFeedViewHolderExcludeLive();

    C2MA getCurViewHolder();

    Aweme getCurrentAweme();

    Aweme getCurrentPlayAweme();

    Aweme getCurrentPlayAwemeInStoryCollectionAweme(Aweme aweme);

    C2MA getLastFeedViewHolder(boolean z);

    Aweme getNextAweme(Aweme aweme);

    C2MA getNextViewHolder();

    C2MA getOuterViewHolderByAwemeId(String str);

    C2MA getPreViewHolder();

    C2MA getViewHolderByAwemeId(String str);

    boolean isScrollDragging();

    boolean jl(int i);

    boolean moveViewPagerToIndex(int i);

    void scrollToNext();

    boolean u20();

    boolean w80(int i);
}
