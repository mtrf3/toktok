package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C15890jp;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PermitApplyData {
    public static final Companion Companion = new Companion();
    public final LiveRoomUser applicant;
    public final BizPermitParams bizPermitParams;
    public final Map<String, Object> custom;
    public final LayoutDSLConfig layoutDSLConfig;
    public final int permitStatus;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public final LiveRoomUser applicant;
        public BizPermitParams bizPermitParams;
        public Map<String, ? extends Object> custom;
        public LayoutDSLConfig layoutDSLConfig;
        public int permitStatus;

        public final PermitApplyData build() {
            return new PermitApplyData(this);
        }

        public final LiveRoomUser getApplicant() {
            return this.applicant;
        }

        public final BizPermitParams getBizPermitParams() {
            return this.bizPermitParams;
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final LayoutDSLConfig getLayoutDSLConfig() {
            return this.layoutDSLConfig;
        }

        public final int getPermitStatus() {
            return this.permitStatus;
        }

        public Builder(LiveRoomUser applicant) {
            o.LJIIIZ(applicant, "applicant");
            this.applicant = applicant;
        }

        public final void setBizPermitParams(BizPermitParams bizPermitParams) {
            this.bizPermitParams = bizPermitParams;
        }

        public final void setCustom(Map<String, ? extends Object> map) {
            this.custom = map;
        }

        public final void setLayoutDSLConfig(LayoutDSLConfig layoutDSLConfig) {
            this.layoutDSLConfig = layoutDSLConfig;
        }

        public final void setPermitStatus(int i) {
            this.permitStatus = i;
        }
    }

    public /* synthetic */ PermitApplyData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PermitApplyData copy$default(PermitApplyData permitApplyData, int i, BizPermitParams bizPermitParams, LiveRoomUser liveRoomUser, LayoutDSLConfig layoutDSLConfig, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = permitApplyData.permitStatus;
        }
        if ((i2 & 2) != 0) {
            bizPermitParams = permitApplyData.bizPermitParams;
        }
        if ((i2 & 4) != 0) {
            liveRoomUser = permitApplyData.applicant;
        }
        if ((i2 & 8) != 0) {
            layoutDSLConfig = permitApplyData.layoutDSLConfig;
        }
        if ((i2 & 16) != 0) {
            map = permitApplyData.custom;
        }
        return permitApplyData.copy(i, bizPermitParams, liveRoomUser, layoutDSLConfig, map);
    }

    public final PermitApplyData copy(int i, BizPermitParams bizPermitParams, LiveRoomUser applicant, LayoutDSLConfig layoutDSLConfig, Map<String, ? extends Object> map) {
        o.LJIIIZ(applicant, "applicant");
        return new PermitApplyData(i, bizPermitParams, applicant, layoutDSLConfig, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermitApplyData)) {
            return false;
        }
        PermitApplyData permitApplyData = (PermitApplyData) obj;
        return this.permitStatus == permitApplyData.permitStatus && o.LJ(this.bizPermitParams, permitApplyData.bizPermitParams) && o.LJ(this.applicant, permitApplyData.applicant) && o.LJ(this.layoutDSLConfig, permitApplyData.layoutDSLConfig) && o.LJ(this.custom, permitApplyData.custom);
    }

    public int hashCode() {
        int i = this.permitStatus * 31;
        BizPermitParams bizPermitParams = this.bizPermitParams;
        int hashCode = (this.applicant.hashCode() + ((i + (bizPermitParams == null ? 0 : bizPermitParams.hashCode())) * 31)) * 31;
        LayoutDSLConfig layoutDSLConfig = this.layoutDSLConfig;
        int hashCode2 = (hashCode + (layoutDSLConfig == null ? 0 : layoutDSLConfig.hashCode())) * 31;
        Map<String, Object> map = this.custom;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermitApplyData(permitStatus=");
        LIZ.append(this.permitStatus);
        LIZ.append(", bizPermitParams=");
        LIZ.append(this.bizPermitParams);
        LIZ.append(", applicant=");
        LIZ.append(this.applicant);
        LIZ.append(", layoutDSLConfig=");
        LIZ.append(this.layoutDSLConfig);
        LIZ.append(", custom=");
        return C15890jp.LIZ(LIZ, this.custom, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final PermitApplyData build(LiveRoomUser applicant, InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(applicant, "applicant");
            o.LJIIIZ(block, "block");
            Builder builder = new Builder(applicant);
            block.invoke(builder);
            return builder.build();
        }
    }

    public final LiveRoomUser getApplicant() {
        return this.applicant;
    }

    public final BizPermitParams getBizPermitParams() {
        return this.bizPermitParams;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final LayoutDSLConfig getLayoutDSLConfig() {
        return this.layoutDSLConfig;
    }

    public final int getPermitStatus() {
        return this.permitStatus;
    }

    public PermitApplyData(Builder builder) {
        this(builder.getPermitStatus(), builder.getBizPermitParams(), builder.getApplicant(), builder.getLayoutDSLConfig(), builder.getCustom());
    }

    public PermitApplyData(int i, BizPermitParams bizPermitParams, LiveRoomUser applicant, LayoutDSLConfig layoutDSLConfig, Map<String, ? extends Object> map) {
        o.LJIIIZ(applicant, "applicant");
        this.permitStatus = i;
        this.bizPermitParams = bizPermitParams;
        this.applicant = applicant;
        this.layoutDSLConfig = layoutDSLConfig;
        this.custom = map;
    }

    public /* synthetic */ PermitApplyData(int i, BizPermitParams bizPermitParams, LiveRoomUser liveRoomUser, LayoutDSLConfig layoutDSLConfig, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bizPermitParams, liveRoomUser, layoutDSLConfig, (i2 & 16) != 0 ? null : map);
    }
}
