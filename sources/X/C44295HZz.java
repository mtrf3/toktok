package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.HZz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44295HZz {
    public static final long LIZ(AVMusic aVMusic, String str) {
        long musicDuration = C44172HVg.LJI.getMusicDuration(str);
        if (aVMusic.getPresenterDuration() > 0) {
            long presenterDuration = aVMusic.getPresenterDuration();
            if (Math.abs(musicDuration - presenterDuration) >= 1000) {
                musicDuration = presenterDuration;
            }
        }
        if (HCG.LIZ() && aVMusic.isNeedReuse()) {
            return Math.min(musicDuration, aVMusic.getTrimmedMusicDuration());
        }
        return musicDuration;
    }
}
