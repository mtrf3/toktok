package com.ss.android.ugc.aweme.im.service.camera.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class DMCameraFilesManagementSettingsConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("enable_auto_clean_files_interval")
    public final long cleanInterval;

    @InterfaceC65349Pkn("enable_auto_clean_files_on_startup")
    public final boolean enableClean;

    public DMCameraFilesManagementSettingsConfig() {
        this(false, 0L, 3, null);
    }

    public static /* synthetic */ DMCameraFilesManagementSettingsConfig copy$default(DMCameraFilesManagementSettingsConfig dMCameraFilesManagementSettingsConfig, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dMCameraFilesManagementSettingsConfig.enableClean;
        }
        if ((i & 2) != 0) {
            j = dMCameraFilesManagementSettingsConfig.cleanInterval;
        }
        return dMCameraFilesManagementSettingsConfig.copy(z, j);
    }

    public final DMCameraFilesManagementSettingsConfig copy(boolean z, long j) {
        return new DMCameraFilesManagementSettingsConfig(z, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableClean), Long.valueOf(this.cleanInterval)};
    }

    public final long getCleanInterval() {
        return this.cleanInterval;
    }

    public final boolean getEnableClean() {
        return this.enableClean;
    }

    public DMCameraFilesManagementSettingsConfig(boolean z, long j) {
        this.enableClean = z;
        this.cleanInterval = j;
    }

    public /* synthetic */ DMCameraFilesManagementSettingsConfig(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 86400000L : j);
    }
}
