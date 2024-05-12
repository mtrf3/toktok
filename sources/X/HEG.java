package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HEG {
    public static final int LIZIZ(StitchParams stitchParams) {
        int i;
        VideoFileInfo videoFileInfo;
        if (stitchParams == null) {
            return 0;
        }
        EditVideoSegment videoSegment = stitchParams.getVideoSegment();
        if (videoSegment != null && (videoFileInfo = videoSegment.getVideoFileInfo()) != null) {
            i = (int) videoFileInfo.getDuration();
        } else {
            i = 0;
        }
        return Math.max(stitchParams.getMusicStart(), 0) + i;
    }

    public static final boolean LIZJ(StitchParams stitchParams) {
        if (stitchParams == null || stitchParams.getMusic() == null || !stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            return false;
        }
        return true;
    }

    public static final OSJ<Long, Long, Long> LIZ(StitchParams stitchParams, String str, AVMusic aVMusic, long j) {
        long j2;
        long j3;
        long musicStart;
        VideoFileInfo videoFileInfo;
        o.LJIIIZ(stitchParams, "stitchParams");
        long musicDuration = C44172HVg.LJI.getMusicDuration(str);
        if (aVMusic != null) {
            j2 = aVMusic.getShootDuration();
        } else {
            j2 = musicDuration;
        }
        EditVideoSegment videoSegment = stitchParams.getVideoSegment();
        if (videoSegment != null && (videoFileInfo = videoSegment.getVideoFileInfo()) != null) {
            j3 = videoFileInfo.getDuration();
        } else {
            j3 = 0;
        }
        long j4 = j - j3;
        if (j2 > 0) {
            musicStart = Math.min((musicDuration - stitchParams.getMusicStart()) - j3, j2 - j3);
        } else {
            musicStart = (musicDuration - stitchParams.getMusicStart()) - j3;
        }
        if (musicStart >= 3000) {
            j4 = Math.min(j4, musicStart);
        }
        OSZ osz = new OSZ(Long.valueOf(j4), Long.valueOf(j4 + j3));
        return new OSJ<>(Long.valueOf(musicDuration), Long.valueOf(((Number) osz.getFirst()).longValue()), Long.valueOf(((Number) osz.getSecond()).longValue()));
    }
}
