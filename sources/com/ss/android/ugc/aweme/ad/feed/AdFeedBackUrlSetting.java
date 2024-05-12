package com.ss.android.ugc.aweme.ad.feed;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AdFeedBackUrlSetting {
    public static final AdFeedBackUrlModel LIZ = new AdFeedBackUrlModel(new String[]{"https://inapp.tiktokv.com/ad/tetris/experience/feedback_list"});

    /* loaded from: classes2.dex */
    public static final class AdFeedBackUrlModel {

        @InterfaceC65349Pkn("url")
        public final String[] url;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdFeedBackUrlModel) && o.LJ(this.url, ((AdFeedBackUrlModel) obj).url);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.url);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AdFeedBackUrlModel(url=");
            return q.LIZIZ(LIZ, Arrays.toString(this.url), ')', LIZ);
        }

        public AdFeedBackUrlModel(String[] url) {
            o.LJIIIZ(url, "url");
            this.url = url;
        }
    }
}
