package com.ss.android.ugc.aweme.feed.ab;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public final class BottomGradualOptimizeConfig extends F9E {

    @InterfaceC65349Pkn("groupId")
    public final int groupId;

    @InterfaceC65349Pkn("opacity")
    public final float opacity;

    public static /* synthetic */ BottomGradualOptimizeConfig copy$default(BottomGradualOptimizeConfig bottomGradualOptimizeConfig, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bottomGradualOptimizeConfig.groupId;
        }
        if ((i2 & 2) != 0) {
            f = bottomGradualOptimizeConfig.opacity;
        }
        return bottomGradualOptimizeConfig.copy(i, f);
    }

    public final BottomGradualOptimizeConfig copy(int i, float f) {
        return new BottomGradualOptimizeConfig(i, f);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.groupId), Float.valueOf(this.opacity)};
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public BottomGradualOptimizeConfig(int i, float f) {
        this.groupId = i;
        this.opacity = f;
    }
}
