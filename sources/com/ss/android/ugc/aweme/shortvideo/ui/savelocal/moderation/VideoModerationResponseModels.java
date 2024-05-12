package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoModerationResponseModels extends F9E {

    @InterfaceC65349Pkn("results")
    public final ArrayList<VideoModerationResponseItem> results;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoModerationResponseModels copy$default(VideoModerationResponseModels videoModerationResponseModels, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = videoModerationResponseModels.results;
        }
        return videoModerationResponseModels.copy(arrayList);
    }

    public final VideoModerationResponseModels copy(ArrayList<VideoModerationResponseItem> results) {
        o.LJIIIZ(results, "results");
        return new VideoModerationResponseModels(results);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.results};
    }

    public final ArrayList<VideoModerationResponseItem> getResults() {
        return this.results;
    }

    public VideoModerationResponseModels(ArrayList<VideoModerationResponseItem> results) {
        o.LJIIIZ(results, "results");
        this.results = results;
    }
}
