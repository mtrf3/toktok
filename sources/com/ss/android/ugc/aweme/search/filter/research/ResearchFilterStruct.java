package com.ss.android.ugc.aweme.search.filter.research;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class ResearchFilterStruct implements Serializable {
    public boolean LJLIL;
    public float LJLILLLLZI;

    @InterfaceC65349Pkn("log_info")
    public String logInfo;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("request_content")
    public String requestContent;

    public final String getLogInfo() {
        return this.logInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRequestContent() {
        return this.requestContent;
    }

    public final float getWidth() {
        return this.LJLILLLLZI;
    }

    public final boolean isSelected() {
        return this.LJLIL;
    }

    public final void setLogInfo(String str) {
        this.logInfo = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequestContent(String str) {
        this.requestContent = str;
    }

    public final void setSelected(boolean z) {
        this.LJLIL = z;
    }

    public final void setWidth(float f) {
        this.LJLILLLLZI = f;
    }
}
