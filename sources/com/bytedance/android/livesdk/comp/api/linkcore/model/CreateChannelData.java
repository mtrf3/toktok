package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CreateChannelData {
    public static final Companion Companion = new Companion();
    public final BizCreateChannelParams bizCreateChannelParams;
    public final String layoutId;
    public final Long liveRoomMode;
    public final int maxPosition;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public BizCreateChannelParams bizCreateChannelParams;
        public String layoutId;
        public Long liveRoomMode;
        public int maxPosition;

        public final CreateChannelData build() {
            return new CreateChannelData(this);
        }

        public final BizCreateChannelParams getBizCreateChannelParams() {
            return this.bizCreateChannelParams;
        }

        public final String getLayoutId() {
            return this.layoutId;
        }

        public final Long getLiveRoomMode() {
            return this.liveRoomMode;
        }

        public final int getMaxPosition() {
            return this.maxPosition;
        }

        public final void setBizCreateChannelParams(BizCreateChannelParams bizCreateChannelParams) {
            this.bizCreateChannelParams = bizCreateChannelParams;
        }

        public final void setLayoutId(String str) {
            this.layoutId = str;
        }

        public final void setLiveRoomMode(Long l) {
            this.liveRoomMode = l;
        }

        public final void setMaxPosition(int i) {
            this.maxPosition = i;
        }
    }

    public /* synthetic */ CreateChannelData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ CreateChannelData copy$default(CreateChannelData createChannelData, int i, String str, BizCreateChannelParams bizCreateChannelParams, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createChannelData.maxPosition;
        }
        if ((i2 & 2) != 0) {
            str = createChannelData.layoutId;
        }
        if ((i2 & 4) != 0) {
            bizCreateChannelParams = createChannelData.bizCreateChannelParams;
        }
        if ((i2 & 8) != 0) {
            l = createChannelData.liveRoomMode;
        }
        return createChannelData.copy(i, str, bizCreateChannelParams, l);
    }

    public final CreateChannelData copy(int i, String str, BizCreateChannelParams bizCreateChannelParams, Long l) {
        return new CreateChannelData(i, str, bizCreateChannelParams, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateChannelData)) {
            return false;
        }
        CreateChannelData createChannelData = (CreateChannelData) obj;
        return this.maxPosition == createChannelData.maxPosition && o.LJ(this.layoutId, createChannelData.layoutId) && o.LJ(this.bizCreateChannelParams, createChannelData.bizCreateChannelParams) && o.LJ(this.liveRoomMode, createChannelData.liveRoomMode);
    }

    public int hashCode() {
        int i = this.maxPosition * 31;
        String str = this.layoutId;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        BizCreateChannelParams bizCreateChannelParams = this.bizCreateChannelParams;
        int hashCode2 = (hashCode + (bizCreateChannelParams == null ? 0 : bizCreateChannelParams.hashCode())) * 31;
        Long l = this.liveRoomMode;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreateChannelData(maxPosition=");
        LIZ.append(this.maxPosition);
        LIZ.append(", layoutId=");
        LIZ.append(this.layoutId);
        LIZ.append(", bizCreateChannelParams=");
        LIZ.append(this.bizCreateChannelParams);
        LIZ.append(", liveRoomMode=");
        return JBR.LJ(LIZ, this.liveRoomMode, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final CreateChannelData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final BizCreateChannelParams getBizCreateChannelParams() {
        return this.bizCreateChannelParams;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final Long getLiveRoomMode() {
        return this.liveRoomMode;
    }

    public final int getMaxPosition() {
        return this.maxPosition;
    }

    public CreateChannelData(Builder builder) {
        this(builder.getMaxPosition(), builder.getLayoutId(), builder.getBizCreateChannelParams(), builder.getLiveRoomMode());
    }

    public CreateChannelData(int i, String str, BizCreateChannelParams bizCreateChannelParams, Long l) {
        this.maxPosition = i;
        this.layoutId = str;
        this.bizCreateChannelParams = bizCreateChannelParams;
        this.liveRoomMode = l;
    }
}
