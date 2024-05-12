package com.ss.android.ugc.aweme.prop;

import X.HM6;
import X.HM7;
import X.HM8;

@HM6("ReuseStickerUpdateSP")
/* loaded from: classes8.dex */
public interface ReuseStickerUpdateSP {
    @HM8("eid")
    String getEid(String str);

    @HM8("time")
    long getTime(long j);

    @HM8("version_code")
    int getVcode(int i);

    @HM7("eid")
    void setEid(String str);

    @HM7("time")
    void setTime(long j);

    @HM7("version_code")
    void setVcode(int i);
}
