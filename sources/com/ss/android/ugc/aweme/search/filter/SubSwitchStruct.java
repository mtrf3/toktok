package com.ss.android.ugc.aweme.search.filter;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class SubSwitchStruct implements Serializable {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public ActivityOptionStruct LJLJI;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("log_info")
    public String logInfo;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("request_key")
    public String requestKey;

    public final ActivityOptionStruct getActivityOptionStruct() {
        return this.LJLJI;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLogInfo() {
        return this.logInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRequestKey() {
        return this.requestKey;
    }

    public final boolean isDefaultOption() {
        return this.LJLIL;
    }

    public final boolean isSelected() {
        return this.LJLILLLLZI;
    }

    public final void setActivityOptionStruct(ActivityOptionStruct activityOptionStruct) {
        this.LJLJI = activityOptionStruct;
    }

    public final void setDefaultOption(boolean z) {
        this.LJLIL = z;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setLogInfo(String str) {
        this.logInfo = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequestKey(String str) {
        this.requestKey = str;
    }

    public final void setSelected(boolean z) {
        this.LJLILLLLZI = z;
    }
}
