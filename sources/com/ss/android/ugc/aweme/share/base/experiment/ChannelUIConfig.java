package com.ss.android.ugc.aweme.share.base.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ChannelUIConfig extends F9E {

    @InterfaceC65349Pkn("collapse")
    public final int collapse;

    @InterfaceC65349Pkn("position")
    public final int position;

    @InterfaceC65349Pkn("visible_in_long_press")
    public final boolean visibleInLongPress;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelUIConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    public static /* synthetic */ ChannelUIConfig copy$default(ChannelUIConfig channelUIConfig, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = channelUIConfig.position;
        }
        if ((i3 & 2) != 0) {
            i2 = channelUIConfig.collapse;
        }
        if ((i3 & 4) != 0) {
            z = channelUIConfig.visibleInLongPress;
        }
        return channelUIConfig.copy(i, i2, z);
    }

    public final ChannelUIConfig copy(int i, int i2, boolean z) {
        return new ChannelUIConfig(i, i2, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.collapse), Boolean.valueOf(this.visibleInLongPress)};
    }

    public final int getCollapse() {
        return this.collapse;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getVisibleInLongPress() {
        return this.visibleInLongPress;
    }

    public ChannelUIConfig(int i, int i2, boolean z) {
        this.position = i;
        this.collapse = i2;
        this.visibleInLongPress = z;
    }

    public /* synthetic */ ChannelUIConfig(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z);
    }
}
