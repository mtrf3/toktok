package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.H7f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43547H7f {
    public static VideoSegment LIZIZ(MediaModel mediaModel, java.util.Map map) {
        VEUtils.VEVideoFileInfo LIZIZ;
        VideoSegment videoSegment = new VideoSegment(mediaModel);
        if (map.get(mediaModel.fileLocalUriPath) != null) {
            LIZIZ = (VEUtils.VEVideoFileInfo) map.get(mediaModel.fileLocalUriPath);
            H8A.LIZ(LIZIZ);
        } else {
            String str = mediaModel.fileLocalUriPath;
            o.LJIIIIZZ(str, "model.fileLocalUriPath");
            LIZIZ = H8A.LIZIZ(str);
        }
        if (LIZIZ != null) {
            videoSegment.width = LIZIZ.width;
            videoSegment.height = LIZIZ.height;
            videoSegment.duration = LIZIZ.duration;
            long LJ = videoSegment.LJ();
            long j = videoSegment.duration;
            if (LJ > j) {
                videoSegment.LJIIJJI(j);
            }
            videoSegment.fps = LIZIZ.fps;
            videoSegment.bitRate = LIZIZ.bitrate;
            videoSegment.gop = LIZIZ.keyFrameCount;
            videoSegment.codecId = LIZIZ.codec;
        }
        return videoSegment;
    }

    public static ArrayList LIZ(List medias, boolean z, C142185i2 c142185i2, int i) {
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        java.util.Map videoInfoCache = c142185i2;
        if ((i & 4) != 0) {
            videoInfoCache = C113554cx.LJJJLIIL();
        }
        o.LJIIIZ(medias, "medias");
        o.LJIIIZ(videoInfoCache, "videoInfoCache");
        ArrayList arrayList = new ArrayList();
        if (C32151Nz.LJJIIZI(medias)) {
            if (medias.size() == 1) {
                if (z || C44694HgQ.LJIJJ((MediaModel) ListProtector.get(medias, 0))) {
                    arrayList.add(new VideoSegment((MediaModel) ListProtector.get(medias, 0)));
                } else {
                    arrayList.add(LIZIZ((MediaModel) ListProtector.get(medias, 0), videoInfoCache));
                }
            } else {
                Iterator it = medias.iterator();
                while (it.hasNext()) {
                    VideoSegment videoSegment = new VideoSegment((MediaModel) it.next());
                    videoSegment.videoIndex = i2;
                    arrayList.add(videoSegment);
                    i2++;
                }
            }
        }
        return arrayList;
    }
}
