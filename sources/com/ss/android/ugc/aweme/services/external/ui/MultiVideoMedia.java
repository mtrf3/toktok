package com.ss.android.ugc.aweme.services.external.ui;

import android.os.Bundle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MultiVideoMedia implements MediaInfo {
    public Bundle extraBundle;
    public final ArrayList<MediaModel> videoMedias;

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final ArrayList<MediaModel> getVideoMedias() {
        return this.videoMedias;
    }

    public MultiVideoMedia(ArrayList<MediaModel> videoMedias) {
        o.LJIIIZ(videoMedias, "videoMedias");
        this.videoMedias = videoMedias;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }
}
