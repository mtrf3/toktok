package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreatorCenterURLSetting {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes5.dex */
    public static final class CreatorCenterInfoStructJsonModel {

        @InterfaceC65349Pkn("creator_center_live_entrance_url")
        public final String liveEntryURL;

        @InterfaceC65349Pkn("creator_center_tool_entrance_url")
        public final String toolsEntryURL;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreatorCenterInfoStructJsonModel)) {
                return false;
            }
            CreatorCenterInfoStructJsonModel creatorCenterInfoStructJsonModel = (CreatorCenterInfoStructJsonModel) obj;
            return o.LJ(this.liveEntryURL, creatorCenterInfoStructJsonModel.liveEntryURL) && o.LJ(this.toolsEntryURL, creatorCenterInfoStructJsonModel.toolsEntryURL);
        }

        public final int hashCode() {
            return this.toolsEntryURL.hashCode() + (this.liveEntryURL.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CreatorCenterInfoStructJsonModel(liveEntryURL=");
            LIZ.append(this.liveEntryURL);
            LIZ.append(", toolsEntryURL=");
            return q.LIZIZ(LIZ, this.toolsEntryURL, ')', LIZ);
        }

        public CreatorCenterInfoStructJsonModel(String liveEntryURL, String toolsEntryURL) {
            o.LJIIIZ(liveEntryURL, "liveEntryURL");
            o.LJIIIZ(toolsEntryURL, "toolsEntryURL");
            this.liveEntryURL = liveEntryURL;
            this.toolsEntryURL = toolsEntryURL;
        }
    }
}
