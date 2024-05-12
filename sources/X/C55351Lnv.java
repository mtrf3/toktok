package X;

import djb.IDaS24S0000000_9;
import java.util.Calendar;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Lnv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55351Lnv {
    public static final IDaS24S0000000_9 LIZ = new IDaS24S0000000_9(CoroutineExceptionHandler.LJJJJIZL, 1);

    public static OSZ LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new OSZ(Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (X.C79004UzY.LJJIFFI(r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse r4) {
        /*
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            long r2 = r0.getCreateTime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            X.OSZ r2 = LIZ(r2)
            long r0 = java.lang.System.currentTimeMillis()
            X.OSZ r0 = LIZ(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            r2 = 0
            if (r0 == 0) goto L79
            int r0 = r4.isPosted()
            if (r0 != 0) goto L79
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.getAweme()
            boolean r0 = r1.isPhotoMode()
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r1.getPhotoModeImageInfo()
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r1.getPhotoModeImageInfo()
            if (r0 == 0) goto L7a
            java.util.List r0 = r0.getImageList()
        L3e:
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 == 0) goto L78
        L44:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddr()
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddr()
            java.util.List r0 = r0.getUrlList()
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 != 0) goto L79
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddrH264()
            java.util.List r0 = r0.getUrlList()
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 != 0) goto L79
        L78:
            r2 = 1
        L79:
            return r2
        L7a:
            r0 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55351Lnv.LIZIZ(com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse):boolean");
    }
}
