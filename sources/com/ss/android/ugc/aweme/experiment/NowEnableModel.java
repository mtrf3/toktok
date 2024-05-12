package com.ss.android.ugc.aweme.experiment;

import X.F9E;

/* loaded from: classes9.dex */
public final class NowEnableModel extends F9E {
    public final int group;

    public static /* synthetic */ NowEnableModel copy$default(NowEnableModel nowEnableModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nowEnableModel.group;
        }
        return nowEnableModel.copy(i);
    }

    public final NowEnableModel copy(int i) {
        return new NowEnableModel(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group)};
    }

    public final int getGroup() {
        return this.group;
    }

    public NowEnableModel(int i) {
        this.group = i;
    }
}
