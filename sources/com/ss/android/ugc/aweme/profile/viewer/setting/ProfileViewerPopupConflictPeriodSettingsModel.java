package com.ss.android.ugc.aweme.profile.viewer.setting;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ProfileViewerPopupConflictPeriodSettingsModel extends F9E {

    @InterfaceC65349Pkn("frequency")
    public final int frequencyInDay;

    public ProfileViewerPopupConflictPeriodSettingsModel() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.frequencyInDay)};
    }

    public ProfileViewerPopupConflictPeriodSettingsModel(int i) {
        this.frequencyInDay = i;
    }

    public /* synthetic */ ProfileViewerPopupConflictPeriodSettingsModel(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 7 : i);
    }
}
