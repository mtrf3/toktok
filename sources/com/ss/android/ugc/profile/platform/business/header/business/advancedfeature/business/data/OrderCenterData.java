package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.AdvancedFeatureBaseData;

/* loaded from: classes5.dex */
public final class OrderCenterData extends AdvancedFeatureBaseData {

    @InterfaceC65349Pkn("order_center_title_en")
    public String entryName;

    @InterfaceC65349Pkn("order_center_schema")
    public String orderCenterSchema;

    @InterfaceC65349Pkn("order_center_title")
    public String orderCenterTitle;

    @InterfaceC65349Pkn("show_red_dot")
    public boolean showRedDot;

    public final String getEntryName() {
        return this.entryName;
    }

    public final String getOrderCenterSchema() {
        return this.orderCenterSchema;
    }

    public final String getOrderCenterTitle() {
        return this.orderCenterTitle;
    }

    public final boolean getShowRedDot() {
        return this.showRedDot;
    }

    public final void setEntryName(String str) {
        this.entryName = str;
    }

    public final void setOrderCenterSchema(String str) {
        this.orderCenterSchema = str;
    }

    public final void setOrderCenterTitle(String str) {
        this.orderCenterTitle = str;
    }

    public final void setShowRedDot(boolean z) {
        this.showRedDot = z;
    }
}
