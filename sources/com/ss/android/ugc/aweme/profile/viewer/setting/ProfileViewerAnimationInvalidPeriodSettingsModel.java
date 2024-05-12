package com.ss.android.ugc.aweme.profile.viewer.setting;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ProfileViewerAnimationInvalidPeriodSettingsModel extends F9E {

    @InterfaceC65349Pkn("frequency")
    public final int frequencyInSecond;

    public ProfileViewerAnimationInvalidPeriodSettingsModel() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.frequencyInSecond)};
    }

    public ProfileViewerAnimationInvalidPeriodSettingsModel(int i) {
        this.frequencyInSecond = i;
    }

    public /* synthetic */ ProfileViewerAnimationInvalidPeriodSettingsModel(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 21600 : i);
    }
}
