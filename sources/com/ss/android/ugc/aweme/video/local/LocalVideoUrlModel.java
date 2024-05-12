package com.ss.android.ugc.aweme.video.local;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* loaded from: classes9.dex */
public class LocalVideoUrlModel extends VideoUrlModel {

    @InterfaceC65349Pkn("author_id")
    public String authorId;

    @InterfaceC65349Pkn("local_path")
    public String localPath;

    public LocalVideoUrlModel() {
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public LocalVideoUrlModel(String str) {
        setSourceId(str);
    }
}
