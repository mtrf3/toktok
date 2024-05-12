package X;

import android.content.Context;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HDo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43712HDo {
    public static long LIZLLL(Object obj) {
        long j;
        long videoLength;
        if (obj instanceof ShortVideoContext) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) obj;
            j = shortVideoContext.LJIILIIL();
            videoLength = shortVideoContext.LJIIIIZZ();
        } else if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel.mOrigin == 0 || C44384HbQ.LJJIIZI(videoPublishEditModel)) {
                return C44689HgL.LIZJ();
            }
            j = videoPublishEditModel.maxDuration;
            videoLength = videoPublishEditModel.getVideoLength();
        } else {
            return 0L;
        }
        return j - videoLength;
    }

    public static String LIZJ(String launchLibraryFrom, boolean z) {
        o.LJIIIZ(launchLibraryFrom, "launchLibraryFrom");
        if (o.LJ(launchLibraryFrom, "Record_Page") && C00F.LIZ(31744, 0, "studio_add_tiktok_videos_to_library", true) == 1 && !z) {
            return "toptiktok";
        }
        return "giphy";
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x028e, code lost:
    
        if (r9.equals("giphy") == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r31, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r32, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r33, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43712HDo.LIZ(android.content.Context, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, boolean):void");
    }

    public static /* synthetic */ void LIZIZ(Context context, MediaModel mediaModel, ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        ShortVideoContext shortVideoContext2 = shortVideoContext;
        boolean z2 = z;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if ((i & 4) != 0) {
            shortVideoContext2 = null;
        }
        if ((i & 8) == 0) {
            videoPublishEditModel2 = videoPublishEditModel;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        LIZ(context, mediaModel, shortVideoContext2, videoPublishEditModel2, z2, false);
    }
}
