package com.ss.android.ugc.aweme.services.external.ui;

import android.os.Bundle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MultiMedia implements MediaInfo {
    public Bundle extraBundle;
    public final ArrayList<MediaModel> medias;

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final ArrayList<MediaModel> getMedias() {
        return this.medias;
    }

    public MultiMedia(ArrayList<MediaModel> medias) {
        o.LJIIIZ(medias, "medias");
        this.medias = medias;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }
}
