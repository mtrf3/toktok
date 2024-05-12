package com.bytedance.libcore.datastore;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RecordFileReq {

    @InterfaceC65349Pkn("request_type")
    public int type;

    @InterfaceC65349Pkn("project_id")
    public String projectId = "";

    @InterfaceC65349Pkn("extra")
    public String extra = "";

    public final String getExtra() {
        return this.extra;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final int getType() {
        return this.type;
    }

    public final void setExtra(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extra = str;
    }

    public final void setProjectId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.projectId = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
