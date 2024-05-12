package com.ss.android.ugc.aweme.experiment;

import X.C113554cx;
import X.C1NE;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.OSZ;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedMultiTabOrderSettings {
    public static final Map<String, String> LIZ = C113554cx.LJJLIIIIJ(new OSZ("homepage_hot", "For You"), new OSZ("homepage_following", "Following"), new OSZ("homepage_popular", "Popular"), new OSZ("homepage_mall", "Shop"), new OSZ("homepage_nearby", "Nearby"), new OSZ("homepage_friends", "FRIENDS_FEED"), new OSZ("homepage_music", "MUSIC_DSP_XTAB"), new OSZ("homepage_explore", "homepage_explore"), new OSZ("homepage_stem", "Stem"), new OSZ("homepage_live", "Live"), new OSZ("homepage_topic0", "Topic0"), new OSZ("homepage_topic1", "Topic1"), new OSZ("homepage_topic2", "Topic2"), new OSZ("homepage_topic3", "Topic3"));
    public static final FeedMultiTabOrderModel LIZIZ = new FeedMultiTabOrderModel(C47261Igj.LJII("homepage_topic0", "homepage_topic1", "homepage_topic2", "homepage_topic3", "homepage_music", "homepage_nearby", "homepage_popular", "homepage_friends", "homepage_mall", "homepage_explore", "homepage_following", "homepage_hot", "homepage_live"));

    /* loaded from: classes7.dex */
    public static final class FeedMultiTabOrderModel {

        @InterfaceC65349Pkn("order")
        public final List<String> order;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FeedMultiTabOrderModel) && o.LJ(this.order, ((FeedMultiTabOrderModel) obj).order);
        }

        public final int hashCode() {
            return this.order.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FeedMultiTabOrderModel(order=");
            return C1NE.LIZIZ(LIZ, this.order, ')', LIZ);
        }

        public FeedMultiTabOrderModel(List<String> order) {
            o.LJIIIZ(order, "order");
            this.order = order;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r4 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.String> LIZ() {
        /*
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings$FeedMultiTabOrderModel> r1 = com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings.FeedMultiTabOrderModel.class
            com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings$FeedMultiTabOrderModel r4 = com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings.LIZIZ
            java.lang.String r0 = "feed_multi_tab_order"
            java.lang.Object r3 = r2.LJIIIIZZ(r0, r1, r4)
            com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings$FeedMultiTabOrderModel r3 = (com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings.FeedMultiTabOrderModel) r3
            if (r3 != 0) goto L15
            r3 = r4
            if (r4 == 0) goto L44
        L15:
            java.util.List<java.lang.String> r0 = r3.order
            if (r0 == 0) goto L44
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L44
            java.util.List<java.lang.String> r0 = r3.order
            java.lang.String r2 = "homepage_hot"
            int r1 = r0.indexOf(r2)
            java.util.List<java.lang.String> r0 = r3.order
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r1 == r0) goto L41
            boolean r0 = X.C53302Kvy.LIZ()
            if (r0 == 0) goto L44
            java.util.List<java.lang.String> r0 = r3.order
            int r0 = r0.indexOf(r2)
            if (r0 < 0) goto L44
        L41:
            java.util.List<java.lang.String> r0 = r3.order
            return r0
        L44:
            java.util.List<java.lang.String> r0 = r4.order
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings.LIZ():java.util.List");
    }
}
