package X;

import com.ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class FVE<V> implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ FeedAppLogParams LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public FVE(int i, FeedAppLogParams feedAppLogParams, boolean z, long j, boolean z2, String str, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = feedAppLogParams;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = z2;
        this.LJLJJLL = str;
        this.LJLJL = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r6 = this;
            int r1 = r6.LJLIL
            r0 = 1
            r5 = -1
            r3 = 0
            if (r1 != r0) goto L6a
            com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r0.mLastFeedItemList
            if (r0 == 0) goto L6a
            java.util.List r0 = r0.getItems()
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 != 0) goto L6a
            com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r0 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L64
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r0.mLastFeedItemList     // Catch: java.lang.Exception -> L64
            java.util.List r0 = r0.getItems()     // Catch: java.lang.Exception -> L64
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)     // Catch: java.lang.Exception -> L64
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()     // Catch: java.lang.Exception -> L64
            if (r1 == 0) goto L6e
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r1.getPlayAddr()     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r1.getPlayAddr()     // Catch: java.lang.Exception -> L64
            java.util.List r0 = r0.getUrlList()     // Catch: java.lang.Exception -> L64
            int r2 = r0.size()     // Catch: java.lang.Exception -> L64
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.getCover()     // Catch: java.lang.Exception -> L62
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.getCover()     // Catch: java.lang.Exception -> L62
            java.util.List r0 = r0.getUrlList()     // Catch: java.lang.Exception -> L62
            boolean r0 = X.C79004UzY.LJJIFFI(r0)     // Catch: java.lang.Exception -> L62
            if (r0 != 0) goto L6f
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.getCover()     // Catch: java.lang.Exception -> L62
            java.util.List r0 = r0.getUrlList()     // Catch: java.lang.Exception -> L62
            int r5 = r0.size()     // Catch: java.lang.Exception -> L62
            goto L6f
        L62:
            r0 = move-exception
            goto L66
        L64:
            r0 = move-exception
            r2 = -1
        L66:
            X.C36922EeM.LJFF(r0)
            goto L6f
        L6a:
            java.lang.String r1 = "0"
            r4 = -1
            goto L80
        L6e:
            r2 = -1
        L6f:
            com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r0 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r0.mLastFeedItemList
            int r3 = r0.blockCode
            java.lang.String r1 = r0.getRequestId()
            java.lang.String r0 = "params.feedItemList.requestId"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4 = r5
            r5 = r2
        L80:
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r0 = "request_id"
            r2.LJIIIZ(r0, r1)
            boolean r0 = r6.LJLJI
            if (r0 != 0) goto Leb
            int r0 = r6.LJLIL
        L90:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_success"
            r2.LJIIIZ(r0, r1)
            long r0 = r6.LJLJJI
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "duration"
            r2.LJIIIZ(r0, r1)
            boolean r0 = r6.LJLJJL
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_first"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = r6.LJLJJLL
            java.lang.String r0 = "request_method"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = r6.LJLJL
            java.lang.String r0 = "feed_tab"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "video_num"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "image_num"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "blockCode"
            r2.LJIIIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.LIZ
            java.lang.String r0 = "EventMapBuilder()\n      …               .builder()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r2)
            java.lang.String r0 = "feed_request_response_test_v3"
            X.FUA.LIZJ(r0, r1)
            r0 = 0
            return r0
        Leb:
            r0 = 2
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FVE.call():java.lang.Object");
    }
}
