package com.ss.android.ugc.aweme.compliance.api.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PreferenceSettings extends F9E implements Serializable {

    @InterfaceC65349Pkn("stem_feed")
    public final int stemFeedStatus;

    public PreferenceSettings() {
        this(0, 1, null);
    }

    public static /* synthetic */ PreferenceSettings copy$default(PreferenceSettings preferenceSettings, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = preferenceSettings.stemFeedStatus;
        }
        return preferenceSettings.copy(i);
    }

    public final PreferenceSettings copy(int i) {
        return new PreferenceSettings(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.stemFeedStatus)};
    }

    public final int getStemFeedStatus() {
        return this.stemFeedStatus;
    }

    public PreferenceSettings(int i) {
        this.stemFeedStatus = i;
    }

    public /* synthetic */ PreferenceSettings(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
