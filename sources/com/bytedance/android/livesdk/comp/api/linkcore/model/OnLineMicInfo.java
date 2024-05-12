package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class OnLineMicInfo {
    public static final Companion Companion = new Companion();
    public final MicPositionInfo micPositionData;
    public final int onLinePattern;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public MicPositionInfo micPositionData;
        public int onLinePattern = 1;

        public final OnLineMicInfo build() {
            return new OnLineMicInfo(this);
        }

        public final MicPositionInfo getMicPositionData() {
            return this.micPositionData;
        }

        public final int getOnLinePattern() {
            return this.onLinePattern;
        }

        public final void setMicPositionData(MicPositionInfo micPositionInfo) {
            this.micPositionData = micPositionInfo;
        }

        public final void setOnLinePattern(int i) {
            this.onLinePattern = i;
        }
    }

    public /* synthetic */ OnLineMicInfo(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ OnLineMicInfo copy$default(OnLineMicInfo onLineMicInfo, int i, MicPositionInfo micPositionInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = onLineMicInfo.onLinePattern;
        }
        if ((i2 & 2) != 0) {
            micPositionInfo = onLineMicInfo.micPositionData;
        }
        return onLineMicInfo.copy(i, micPositionInfo);
    }

    public final OnLineMicInfo copy(int i, MicPositionInfo micPositionInfo) {
        return new OnLineMicInfo(i, micPositionInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLineMicInfo)) {
            return false;
        }
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) obj;
        return this.onLinePattern == onLineMicInfo.onLinePattern && o.LJ(this.micPositionData, onLineMicInfo.micPositionData);
    }

    public int hashCode() {
        int i = this.onLinePattern * 31;
        MicPositionInfo micPositionInfo = this.micPositionData;
        return i + (micPositionInfo == null ? 0 : micPositionInfo.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnLineMicInfo(onLinePattern=");
        LIZ.append(this.onLinePattern);
        LIZ.append(", micPositionData=");
        LIZ.append(this.micPositionData);
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

        public final OnLineMicInfo build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final MicPositionInfo getMicPositionData() {
        return this.micPositionData;
    }

    public final int getOnLinePattern() {
        return this.onLinePattern;
    }

    public OnLineMicInfo(Builder builder) {
        this(builder.getOnLinePattern(), builder.getMicPositionData());
    }

    public OnLineMicInfo(int i, MicPositionInfo micPositionInfo) {
        this.onLinePattern = i;
        this.micPositionData = micPositionInfo;
    }
}
