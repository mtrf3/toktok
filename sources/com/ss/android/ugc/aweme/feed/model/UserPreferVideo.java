package com.ss.android.ugc.aweme.feed.model;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* loaded from: classes9.dex */
public class UserPreferVideo {

    @InterfaceC65349Pkn("cover")
    public UrlModel cover;

    @InterfaceC65349Pkn("dynamic_cover")
    public UrlModel dynamicCover;

    @InterfaceC65349Pkn("gid")
    public String gid;

    @InterfaceC65349Pkn("play_addr")
    public UrlModel video;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserPreferVideo{gid='");
        Q89.LIZIZ(LIZ, this.gid, '\'', ", video=");
        LIZ.append(this.video);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", dynamicCover=");
        return C31461Li.LIZLLL(LIZ, this.dynamicCover, '}', LIZ);
    }
}
