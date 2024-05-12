package com.bytedance.ies.ugc.aweme.rich.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class CommonAdData implements Serializable {

    @InterfaceC65349Pkn("charge_type")
    public int chargeType;

    @InterfaceC65349Pkn("creative_id")
    public Long creativeId;

    @InterfaceC65349Pkn("group_id")
    public Long groupId;

    @InterfaceC65349Pkn("log_extra")
    public String logExtra;

    @InterfaceC65349Pkn("system_origin")
    public int systemOrigin = -1;

    public String getCreativeIdStr() {
        Long l = this.creativeId;
        if (l == null) {
            return null;
        }
        return l.toString();
    }

    public int getChargeType() {
        return this.chargeType;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public int getSystemOrigin() {
        return this.systemOrigin;
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setGroupId(Long l) {
        this.groupId = l;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setSystemOrigin(int i) {
        this.systemOrigin = i;
    }
}
