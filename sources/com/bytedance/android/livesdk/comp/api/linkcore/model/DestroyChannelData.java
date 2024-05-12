package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C15890jp;
import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class DestroyChannelData {
    public static final Companion Companion = new Companion();
    public final Map<String, String> customData;
    public final long finishReason;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public Map<String, String> customData;
        public long finishReason;

        public static /* synthetic */ void getFinishReason$annotations() {
        }

        public final DestroyChannelData build() {
            return new DestroyChannelData(this);
        }

        public final Map<String, String> getCustomData() {
            return this.customData;
        }

        public final long getFinishReason() {
            return this.finishReason;
        }

        public final void setCustomData(Map<String, String> map) {
            this.customData = map;
        }

        public final void setFinishReason(long j) {
            this.finishReason = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DestroyChannelData() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DestroyChannelData(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DestroyChannelData copy$default(DestroyChannelData destroyChannelData, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            j = destroyChannelData.finishReason;
        }
        if ((i & 2) != 0) {
            map = destroyChannelData.customData;
        }
        return destroyChannelData.copy(j, map);
    }

    public final DestroyChannelData copy(long j, Map<String, String> map) {
        return new DestroyChannelData(j, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DestroyChannelData)) {
            return false;
        }
        DestroyChannelData destroyChannelData = (DestroyChannelData) obj;
        return this.finishReason == destroyChannelData.finishReason && o.LJ(this.customData, destroyChannelData.customData);
    }

    public int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.finishReason) * 31;
        Map<String, String> map = this.customData;
        return LLJIJIL + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DestroyChannelData(finishReason=");
        LIZ.append(this.finishReason);
        LIZ.append(", customData=");
        return C15890jp.LIZ(LIZ, this.customData, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final DestroyChannelData build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final Map<String, String> getCustomData() {
        return this.customData;
    }

    public final long getFinishReason() {
        return this.finishReason;
    }

    public DestroyChannelData(Builder builder) {
        this(builder.getFinishReason(), builder.getCustomData());
    }

    public DestroyChannelData(long j, Map<String, String> map) {
        this.finishReason = j;
        this.customData = map;
    }

    public /* synthetic */ DestroyChannelData(long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (Map<String, String>) ((i & 2) != 0 ? null : map));
    }
}
