package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class FansStruct implements Serializable {

    @InterfaceC65349Pkn("fans_level")
    public int fansLevel;

    @InterfaceC65349Pkn("fans_name")
    public String fansName;

    @InterfaceC65349Pkn("is_fan")
    public boolean isFan;

    @InterfaceC65349Pkn("light_up")
    public boolean lightUp;

    public int getFansLevel() {
        return this.fansLevel;
    }

    public String getFansName() {
        return this.fansName;
    }

    public boolean isFan() {
        return this.isFan;
    }

    public boolean isLightUp() {
        return this.lightUp;
    }

    public void setFan(boolean z) {
        this.isFan = z;
    }

    public void setFansLevel(int i) {
        this.fansLevel = i;
    }

    public void setFansName(String str) {
        this.fansName = str;
    }

    public void setLightUp(boolean z) {
        this.lightUp = z;
    }
}
