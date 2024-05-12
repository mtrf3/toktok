package com.ss.android.ugc.aweme.story.inbox;

import X.AbstractC73672Svk;
import X.C48710J9u;
import X.EnumC54603Lbr;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ies.powerlist.PowerCell;

/* loaded from: classes10.dex */
public interface IStoryInboxService {
    boolean canShowStoryCell();

    C48710J9u convertDayResponseToItem(OnThisDayResponse onThisDayResponse);

    AbstractC73672Svk<StoryGetFeedByPageResponse> fetchStoryItems(long j, long j2, String str, EnumC54603Lbr enumC54603Lbr);

    Object fetchStoryItemsByCont(long j, long j2, String str, EnumC54603Lbr enumC54603Lbr, InterfaceC67352kd<? super StoryGetFeedByPageResponse> interfaceC67352kd);

    Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] getOnThisDayCell();

    StoryGetFeedByPageResponse getPreloadGetFeedByPageResponse();

    Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] getStoryCell();

    void preloadOnBoot();

    AbstractC73672Svk<OnThisDayResponse> requestOnThisDayData();

    void sendViewedMemorableView(String str);

    boolean shouldShowShootingEntrance(boolean z, boolean z2);
}
