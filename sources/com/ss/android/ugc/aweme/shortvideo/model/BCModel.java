package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class BCModel extends F9E {
    public final boolean shouldShowUsageCheck;

    public BCModel() {
        this(false, 1, null);
    }

    public static /* synthetic */ BCModel copy$default(BCModel bCModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bCModel.shouldShowUsageCheck;
        }
        return bCModel.copy(z);
    }

    public final BCModel copy(boolean z) {
        return new BCModel(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.shouldShowUsageCheck)};
    }

    public BCModel(boolean z) {
        this.shouldShowUsageCheck = z;
    }

    public /* synthetic */ BCModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
