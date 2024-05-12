package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class RoomPrivateInfo extends F9E {

    @InterfaceC65349Pkn("deprecated3")
    public Double deprecated3;

    @InterfaceC65349Pkn("deprecated4")
    public Double deprecated4;

    @InterfaceC65349Pkn("deprecated5")
    public String deprecated5;

    @InterfaceC65349Pkn("enter_region_match")
    public EnterRegionMatch enterRegionMatch;

    @InterfaceC65349Pkn("is_sandbox")
    public Boolean isSandbox;

    @InterfaceC65349Pkn("laneEnv")
    public String laneenv;

    @InterfaceC65349Pkn("locale")
    public String locale;

    @InterfaceC65349Pkn("pre_recorded")
    public int preRecorded;

    @InterfaceC65349Pkn("recommend_level")
    public Integer recommendLevel;

    @InterfaceC65349Pkn("region")
    public String region;

    @InterfaceC65349Pkn("tag_set")
    public String tagSet;

    @Override // X.F9E
    public final Object[] getObjects() {
        Boolean bool = this.isSandbox;
        EnterRegionMatch enterRegionMatch = this.enterRegionMatch;
        String str = this.locale;
        String str2 = this.tagSet;
        Double d = this.deprecated3;
        Double d2 = this.deprecated4;
        String str3 = this.deprecated5;
        String str4 = this.laneenv;
        String str5 = this.region;
        Integer num = this.recommendLevel;
        return new Object[]{bool, bool, enterRegionMatch, enterRegionMatch, str, str, str2, str2, d, d, d2, d2, str3, str3, str4, str4, Integer.valueOf(this.preRecorded), str5, str5, num, num};
    }
}
