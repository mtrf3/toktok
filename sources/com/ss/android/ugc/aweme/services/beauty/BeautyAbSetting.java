package com.ss.android.ugc.aweme.services.beauty;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class BeautyAbSetting extends F9E {
    public final int abGroup;
    public final boolean isDataSync;

    /* JADX WARN: Multi-variable type inference failed */
    public BeautyAbSetting() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ BeautyAbSetting copy$default(BeautyAbSetting beautyAbSetting, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = beautyAbSetting.isDataSync;
        }
        if ((i2 & 2) != 0) {
            i = beautyAbSetting.abGroup;
        }
        return beautyAbSetting.copy(z, i);
    }

    public final BeautyAbSetting copy(boolean z, int i) {
        return new BeautyAbSetting(z, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isDataSync), Integer.valueOf(this.abGroup)};
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final boolean isDataSync() {
        return this.isDataSync;
    }

    public BeautyAbSetting(boolean z, int i) {
        this.isDataSync = z;
        this.abGroup = i;
    }

    public /* synthetic */ BeautyAbSetting(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
