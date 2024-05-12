package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class MiniAppConfig implements Serializable {
    public Serializable appClass;
    public MicroAppModel appInfo;
    public String stickerId;

    public final Serializable getAppClass() {
        return this.appClass;
    }

    public final MicroAppModel getAppInfo() {
        return this.appInfo;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final void setAppClass(Serializable serializable) {
        this.appClass = serializable;
    }

    public final void setAppInfo(MicroAppModel microAppModel) {
        this.appInfo = microAppModel;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }
}
