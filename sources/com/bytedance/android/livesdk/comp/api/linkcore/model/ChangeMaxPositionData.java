package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* loaded from: classes14.dex */
public final class ChangeMaxPositionData {
    public static final Companion Companion = new Companion();
    public final BizChangeLayoutParams bizChangeLayoutParams;
    public final Map<String, String> customData;
    public final String layoutId;
    public final int maxPosition;
    public final int sceneVersion;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public BizChangeLayoutParams bizChangeLayoutParams;
        public Map<String, String> customData;
        public String layoutId;
        public int maxPosition;
        public int sceneVersion;

        public final ChangeMaxPositionData build() {
            return new ChangeMaxPositionData(this);
        }

        public final BizChangeLayoutParams getBizChangeLayoutParams() {
            return this.bizChangeLayoutParams;
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final String getLayoutId() {
            return this.layoutId;
        }

        public final int getMaxPosition() {
            return this.maxPosition;
        }

        public final int getSceneVersion() {
            return this.sceneVersion;
        }

        public final void setBizChangeLayoutParams(BizChangeLayoutParams bizChangeLayoutParams) {
            this.bizChangeLayoutParams = bizChangeLayoutParams;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setLayoutId(String str) {
            this.layoutId = str;
        }

        public final void setMaxPosition(int i) {
            this.maxPosition = i;
        }

        public final void setSceneVersion(int i) {
            this.sceneVersion = i;
        }
    }

    public /* synthetic */ ChangeMaxPositionData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeMaxPositionData copy$default(ChangeMaxPositionData changeMaxPositionData, int i, String str, int i2, Map map, BizChangeLayoutParams bizChangeLayoutParams, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = changeMaxPositionData.maxPosition;
        }
        if ((i3 & 2) != 0) {
            str = changeMaxPositionData.layoutId;
        }
        if ((i3 & 4) != 0) {
            i2 = changeMaxPositionData.sceneVersion;
        }
        if ((i3 & 8) != 0) {
            map = changeMaxPositionData.customData;
        }
        if ((i3 & 16) != 0) {
            bizChangeLayoutParams = changeMaxPositionData.bizChangeLayoutParams;
        }
        return changeMaxPositionData.copy(i, str, i2, map, bizChangeLayoutParams);
    }

    public final ChangeMaxPositionData copy(int i, String str, int i2, Map<String, String> map, BizChangeLayoutParams bizChangeLayoutParams) {
        return new ChangeMaxPositionData(i, str, i2, map, bizChangeLayoutParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeMaxPositionData)) {
            return false;
        }
        ChangeMaxPositionData changeMaxPositionData = (ChangeMaxPositionData) obj;
        return this.maxPosition == changeMaxPositionData.maxPosition && o.LJ(this.layoutId, changeMaxPositionData.layoutId) && this.sceneVersion == changeMaxPositionData.sceneVersion && o.LJ(this.customData, changeMaxPositionData.customData) && o.LJ(this.bizChangeLayoutParams, changeMaxPositionData.bizChangeLayoutParams);
    }

    public int hashCode() {
        int i = this.maxPosition * 31;
        String str = this.layoutId;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.sceneVersion) * 31;
        Map<String, String> map = this.customData;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        BizChangeLayoutParams bizChangeLayoutParams = this.bizChangeLayoutParams;
        return hashCode2 + (bizChangeLayoutParams != null ? bizChangeLayoutParams.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeMaxPositionData(maxPosition=");
        LIZ.append(this.maxPosition);
        LIZ.append(", layoutId=");
        LIZ.append(this.layoutId);
        LIZ.append(", sceneVersion=");
        LIZ.append(this.sceneVersion);
        LIZ.append(", customData=");
        LIZ.append(this.customData);
        LIZ.append(", bizChangeLayoutParams=");
        LIZ.append(this.bizChangeLayoutParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ChangeMaxPositionData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final BizChangeLayoutParams getBizChangeLayoutParams() {
        return this.bizChangeLayoutParams;
    }

    public final Map<String, String> getCustomData() {
        return this.customData;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final int getMaxPosition() {
        return this.maxPosition;
    }

    public final int getSceneVersion() {
        return this.sceneVersion;
    }

    public ChangeMaxPositionData(Builder builder) {
        this(builder.getMaxPosition(), builder.getLayoutId(), builder.getSceneVersion(), builder.getCustomData(), builder.getBizChangeLayoutParams());
    }

    public ChangeMaxPositionData(int i, String str, int i2, Map<String, String> map, BizChangeLayoutParams bizChangeLayoutParams) {
        this.maxPosition = i;
        this.layoutId = str;
        this.sceneVersion = i2;
        this.customData = map;
        this.bizChangeLayoutParams = bizChangeLayoutParams;
    }
}
