package com.bytedance.android.livesdk.hints;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import X.InterfaceC67352kd;
import com.bytedance.android.livesdk.gift.model.GiftHintResponse;
import com.bytedance.android.livesdk.goal.model.OwnerSettingResponse;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsReportResponse;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;
import java.util.List;

/* loaded from: classes14.dex */
public interface LiveGiftApi {
    @E8M("/webcast/goal/owner/setting/")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @InterfaceC195757mF
    Object enableLiveGoalCapsule(@InterfaceC64985Pev("capsule_guide") boolean z, InterfaceC67352kd<? super C28467BFf<OwnerSettingResponse.Data>> interfaceC67352kd);

    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @E8L("/webcast/gift/hints/")
    Object fetchGiftHints(@InterfaceC64986Pew("hint_ids") List<Integer> list, InterfaceC67352kd<? super C28467BFf<GiftHintResponse.Data>> interfaceC67352kd);

    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @E8L("/webcast/guide/keywords/")
    AbstractC73672Svk<C28467BFf<GuideKeywordsResponse.Data>> fetchHotWordLibrary(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("last_version") long j2);

    @E8M("/webcast/guide/keywords/report/")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<GuideKeywordsReportResponse.Data>> reportHotWordGiftAction(@InterfaceC64985Pev("keyword") String str, @InterfaceC64985Pev("gift_id") long j, @InterfaceC64985Pev("report_type") int i);
}
