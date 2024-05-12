package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.AdvancedFeatureBaseData;
import java.util.List;

/* loaded from: classes5.dex */
public final class LiveEventData extends AdvancedFeatureBaseData {

    @InterfaceC65349Pkn("events")
    public List<LiveEventStruct> liveEventStructList;

    public final List<LiveEventStruct> getLiveEventStructList() {
        return this.liveEventStructList;
    }

    public final void setLiveEventStructList(List<LiveEventStruct> list) {
        this.liveEventStructList = list;
    }
}
