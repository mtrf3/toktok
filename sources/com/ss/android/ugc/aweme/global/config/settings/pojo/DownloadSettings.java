package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class DownloadSettings {

    @InterfaceC65349Pkn("download_dialog_config")
    public DownloadDialogSettings downloadDialogConfig;

    @InterfaceC65349Pkn("download_lib_switch")
    public Integer downloadLibSwitch;

    public DownloadDialogSettings getDownloadDialogConfig() {
        DownloadDialogSettings downloadDialogSettings = this.downloadDialogConfig;
        if (downloadDialogSettings != null) {
            return downloadDialogSettings;
        }
        throw new C158056If();
    }

    public Integer getDownloadLibSwitch() {
        Integer num = this.downloadLibSwitch;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
