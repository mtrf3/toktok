package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* loaded from: classes14.dex */
public final class ChangeLayoutParam {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizChangeLayoutParams extra;

    @InterfaceC65349Pkn("layout_id")
    public String layoutId;

    @InterfaceC65349Pkn("myself")
    public UserBean operator;

    @InterfaceC65349Pkn("pos_config")
    public PositionConfig positionConfig;

    @InterfaceC65349Pkn("scene_version")
    public int sceneVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeLayoutParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeLayoutParam)) {
            return false;
        }
        ChangeLayoutParam changeLayoutParam = (ChangeLayoutParam) obj;
        return o.LJ(this.common, changeLayoutParam.common) && o.LJ(this.operator, changeLayoutParam.operator) && o.LJ(this.channelId, changeLayoutParam.channelId) && o.LJ(this.positionConfig, changeLayoutParam.positionConfig) && o.LJ(this.layoutId, changeLayoutParam.layoutId) && this.sceneVersion == changeLayoutParam.sceneVersion && o.LJ(this.extra, changeLayoutParam.extra);
    }

    public final int hashCode() {
        LinkCommonBean linkCommonBean = this.common;
        int hashCode = (linkCommonBean == null ? 0 : linkCommonBean.hashCode()) * 31;
        UserBean userBean = this.operator;
        int hashCode2 = (hashCode + (userBean == null ? 0 : userBean.hashCode())) * 31;
        Long l = this.channelId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        PositionConfig positionConfig = this.positionConfig;
        int hashCode4 = (hashCode3 + (positionConfig == null ? 0 : positionConfig.hashCode())) * 31;
        String str = this.layoutId;
        int hashCode5 = (((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.sceneVersion) * 31;
        BizChangeLayoutParams bizChangeLayoutParams = this.extra;
        return hashCode5 + (bizChangeLayoutParams != null ? bizChangeLayoutParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeLayoutParam(common=");
        LIZ.append(this.common);
        LIZ.append(", operator=");
        LIZ.append(this.operator);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", positionConfig=");
        LIZ.append(this.positionConfig);
        LIZ.append(", layoutId=");
        LIZ.append(this.layoutId);
        LIZ.append(", sceneVersion=");
        LIZ.append(this.sceneVersion);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ChangeLayoutParam(LinkCommonBean linkCommonBean, UserBean userBean, Long l, PositionConfig positionConfig, String str, int i, BizChangeLayoutParams bizChangeLayoutParams) {
        this.common = linkCommonBean;
        this.operator = userBean;
        this.channelId = l;
        this.positionConfig = positionConfig;
        this.layoutId = str;
        this.sceneVersion = i;
        this.extra = bizChangeLayoutParams;
    }

    public /* synthetic */ ChangeLayoutParam(LinkCommonBean linkCommonBean, UserBean userBean, Long l, PositionConfig positionConfig, String str, int i, BizChangeLayoutParams bizChangeLayoutParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : linkCommonBean, (i2 & 2) != 0 ? null : userBean, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : positionConfig, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? 0 : i, (i2 & 64) == 0 ? bizChangeLayoutParams : null);
    }
}
