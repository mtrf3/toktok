package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import java.util.Map;

/* loaded from: classes14.dex */
public class FansClubMember {

    @InterfaceC65349Pkn("data")
    public FansClubData data;

    @InterfaceC65349Pkn("prefer_data")
    public Map<Integer, FansClubData> preferData;

    public FansClubData getData() {
        return this.data;
    }

    public Map<Integer, FansClubData> getPreferData() {
        return this.preferData;
    }

    public void setData(FansClubData fansClubData) {
        this.data = fansClubData;
    }

    public void setPreferData(Map<Integer, FansClubData> map) {
        this.preferData = map;
    }
}
