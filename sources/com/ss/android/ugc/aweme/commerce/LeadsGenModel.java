package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class LeadsGenModel implements Serializable {

    @InterfaceC65349Pkn("action_name")
    public String actionName;

    @InterfaceC65349Pkn("business_data")
    public String businessData;

    @InterfaceC65349Pkn("has_leads_gen")
    public boolean hasLeadsGen;

    @InterfaceC65349Pkn("page_id")
    public long pageId;

    @InterfaceC65349Pkn("schema_url")
    public String schema;

    public final String getActionName() {
        return this.actionName;
    }

    public final String getBusinessData() {
        return this.businessData;
    }

    public final boolean getHasLeadsGen() {
        return this.hasLeadsGen;
    }

    public final long getPageId() {
        return this.pageId;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final void setActionName(String str) {
        this.actionName = str;
    }

    public final void setBusinessData(String str) {
        this.businessData = str;
    }

    public final void setHasLeadsGen(boolean z) {
        this.hasLeadsGen = z;
    }

    public final void setPageId(long j) {
        this.pageId = j;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
