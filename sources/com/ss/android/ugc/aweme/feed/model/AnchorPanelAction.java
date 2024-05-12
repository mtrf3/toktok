package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class AnchorPanelAction implements Serializable {

    @InterfaceC65349Pkn("action_type")
    public int actionType;

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("schema")
    public String schema = "";

    public final int getActionType() {
        return this.actionType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getSchema() {
        return this.schema;
    }
}
