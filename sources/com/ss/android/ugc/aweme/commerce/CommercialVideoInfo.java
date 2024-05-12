package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.commerce.model.MissionInfo;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes8.dex */
public final class CommercialVideoInfo implements Serializable {

    @InterfaceC65349Pkn("ibe_infos")
    public List<IBEInfo> ibeInfos;

    @InterfaceC65349Pkn("ibe_metadata")
    public InteractiveBrandedEffectInfo ibeMetaInfo;

    @InterfaceC65349Pkn("mission_info")
    public final MissionInfo missionInfo;

    public final List<IBEInfo> getIbeInfos() {
        return this.ibeInfos;
    }

    public final InteractiveBrandedEffectInfo getIbeMetaInfo() {
        return this.ibeMetaInfo;
    }

    public final MissionInfo getMissionInfo() {
        return this.missionInfo;
    }

    public final void setIbeInfos(List<IBEInfo> list) {
        this.ibeInfos = list;
    }

    public final void setIbeMetaInfo(InteractiveBrandedEffectInfo interactiveBrandedEffectInfo) {
        this.ibeMetaInfo = interactiveBrandedEffectInfo;
    }
}
