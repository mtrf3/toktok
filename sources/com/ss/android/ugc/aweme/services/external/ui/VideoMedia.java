package com.ss.android.ugc.aweme.services.external.ui;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoMedia implements MediaInfo {
    public Bundle extraBundle;
    public final String filePath;

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public VideoMedia(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        this.filePath = filePath;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }
}
