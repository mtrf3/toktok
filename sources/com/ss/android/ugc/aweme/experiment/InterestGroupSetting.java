package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes10.dex */
public final class InterestGroupSetting {

    @InterfaceC65349Pkn("group")
    public int group;

    @InterfaceC65349Pkn("use_new_key")
    public int useNewKey;

    @InterfaceC65349Pkn("start_index")
    public int startIndex = 4;

    @InterfaceC65349Pkn("skip_n")
    public int skip_n = 3;

    @InterfaceC65349Pkn("skip_s")
    public int skip_s = 3;

    @InterfaceC65349Pkn("interest_select_title")
    public String interest_select_title = "";

    @InterfaceC65349Pkn("interest_select_sub_title")
    public String interest_select_sub_title = "";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InterestGroupSetting(group=");
        LIZ.append(this.group);
        LIZ.append(", startIndex=");
        LIZ.append(this.startIndex);
        LIZ.append(", skip_n=");
        LIZ.append(this.skip_n);
        LIZ.append(", skip_s=");
        return b0.LIZJ(LIZ, this.skip_s, ')', LIZ);
    }
}
