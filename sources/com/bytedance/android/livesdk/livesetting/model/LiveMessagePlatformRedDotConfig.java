package com.bytedance.android.livesdk.livesetting.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessagePlatformRedDotConfig implements Serializable {

    @InterfaceC65349Pkn("lifetime")
    public final int lifetime;

    @InterfaceC65349Pkn("new_user_block")
    public final boolean newUserBlock;

    @InterfaceC65349Pkn("outer_layer_red_dot_list")
    public final List<String> outLayerList;

    @InterfaceC65349Pkn("priority")
    public final int priority;

    @InterfaceC65349Pkn("skip_downline_mechanism")
    public final boolean skipDownlineMechanism;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveMessagePlatformRedDotConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveMessagePlatformRedDotConfig copy$default(LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig, int i, boolean z, int i2, List list, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = liveMessagePlatformRedDotConfig.priority;
        }
        if ((i3 & 2) != 0) {
            z = liveMessagePlatformRedDotConfig.newUserBlock;
        }
        if ((i3 & 4) != 0) {
            i2 = liveMessagePlatformRedDotConfig.lifetime;
        }
        if ((i3 & 8) != 0) {
            list = liveMessagePlatformRedDotConfig.outLayerList;
        }
        if ((i3 & 16) != 0) {
            z2 = liveMessagePlatformRedDotConfig.skipDownlineMechanism;
        }
        return liveMessagePlatformRedDotConfig.copy(i, z, i2, list, z2);
    }

    public final LiveMessagePlatformRedDotConfig copy(int i, boolean z, int i2, List<String> list, boolean z2) {
        return new LiveMessagePlatformRedDotConfig(i, z, i2, list, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveMessagePlatformRedDotConfig)) {
            return false;
        }
        LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig = (LiveMessagePlatformRedDotConfig) obj;
        return this.priority == liveMessagePlatformRedDotConfig.priority && this.newUserBlock == liveMessagePlatformRedDotConfig.newUserBlock && this.lifetime == liveMessagePlatformRedDotConfig.lifetime && o.LJ(this.outLayerList, liveMessagePlatformRedDotConfig.outLayerList) && this.skipDownlineMechanism == liveMessagePlatformRedDotConfig.skipDownlineMechanism;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.priority * 31;
        boolean z = this.newUserBlock;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (((i + i2) * 31) + this.lifetime) * 31;
        List<String> list = this.outLayerList;
        return ((i3 + (list == null ? 0 : list.hashCode())) * 31) + (this.skipDownlineMechanism ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveMessagePlatformRedDotConfig(priority=");
        LIZ.append(this.priority);
        LIZ.append(", newUserBlock=");
        LIZ.append(this.newUserBlock);
        LIZ.append(", lifetime=");
        LIZ.append(this.lifetime);
        LIZ.append(", outLayerList=");
        LIZ.append(this.outLayerList);
        LIZ.append(", skipDownlineMechanism=");
        return C48339Iy7.LIZJ(LIZ, this.skipDownlineMechanism, ')', LIZ);
    }

    public final int getLifetime() {
        return this.lifetime;
    }

    public final boolean getNewUserBlock() {
        return this.newUserBlock;
    }

    public final List<String> getOutLayerList() {
        return this.outLayerList;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final boolean getSkipDownlineMechanism() {
        return this.skipDownlineMechanism;
    }

    public LiveMessagePlatformRedDotConfig(int i, boolean z, int i2, List<String> list, boolean z2) {
        this.priority = i;
        this.newUserBlock = z;
        this.lifetime = i2;
        this.outLayerList = list;
        this.skipDownlineMechanism = z2;
    }

    public /* synthetic */ LiveMessagePlatformRedDotConfig(int i, boolean z, int i2, List list, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? 3 : i2, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? false : z2);
    }
}
