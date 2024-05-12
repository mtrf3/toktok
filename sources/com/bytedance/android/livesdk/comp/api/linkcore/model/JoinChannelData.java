package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class JoinChannelData {
    public static final Companion Companion = new Companion();
    public final BizJoinChannelParams bizJoinChannelParams;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public BizJoinChannelParams bizJoinChannelParams;

        public final JoinChannelData build() {
            return new JoinChannelData(this);
        }

        public final BizJoinChannelParams getBizJoinChannelParams() {
            return this.bizJoinChannelParams;
        }

        public final void setBizJoinChannelParams(BizJoinChannelParams bizJoinChannelParams) {
            this.bizJoinChannelParams = bizJoinChannelParams;
        }
    }

    public /* synthetic */ JoinChannelData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ JoinChannelData copy$default(JoinChannelData joinChannelData, BizJoinChannelParams bizJoinChannelParams, int i, Object obj) {
        if ((i & 1) != 0) {
            bizJoinChannelParams = joinChannelData.bizJoinChannelParams;
        }
        return joinChannelData.copy(bizJoinChannelParams);
    }

    public final JoinChannelData copy(BizJoinChannelParams bizJoinChannelParams) {
        return new JoinChannelData(bizJoinChannelParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JoinChannelData) && o.LJ(this.bizJoinChannelParams, ((JoinChannelData) obj).bizJoinChannelParams);
    }

    public int hashCode() {
        BizJoinChannelParams bizJoinChannelParams = this.bizJoinChannelParams;
        if (bizJoinChannelParams == null) {
            return 0;
        }
        return bizJoinChannelParams.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JoinChannelData(bizJoinChannelParams=");
        LIZ.append(this.bizJoinChannelParams);
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

        public final JoinChannelData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final BizJoinChannelParams getBizJoinChannelParams() {
        return this.bizJoinChannelParams;
    }

    public JoinChannelData(Builder builder) {
        this(builder.getBizJoinChannelParams());
    }

    public JoinChannelData(BizJoinChannelParams bizJoinChannelParams) {
        this.bizJoinChannelParams = bizJoinChannelParams;
    }
}
