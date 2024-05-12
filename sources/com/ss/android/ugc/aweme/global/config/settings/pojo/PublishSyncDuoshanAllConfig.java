package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class PublishSyncDuoshanAllConfig {

    @InterfaceC65349Pkn("register_duoshan")
    public PublishSyncDuoshanConfig registerDuoshan;

    @InterfaceC65349Pkn("ungister_duoshan")
    public PublishSyncDuoshanConfig ungisterDuoshan;

    public PublishSyncDuoshanConfig getRegisterDuoshan() {
        PublishSyncDuoshanConfig publishSyncDuoshanConfig = this.registerDuoshan;
        if (publishSyncDuoshanConfig != null) {
            return publishSyncDuoshanConfig;
        }
        throw new C158056If();
    }

    public PublishSyncDuoshanConfig getUngisterDuoshan() {
        PublishSyncDuoshanConfig publishSyncDuoshanConfig = this.ungisterDuoshan;
        if (publishSyncDuoshanConfig != null) {
            return publishSyncDuoshanConfig;
        }
        throw new C158056If();
    }
}
