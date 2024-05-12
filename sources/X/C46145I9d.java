package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.o;

/* renamed from: X.I9d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46145I9d implements IA6 {
    public C46150I9i LIZ;

    @Override // X.IA6
    public final long LIZ(CameraComponentModel context) {
        long j;
        MusicBuzModel musicBuzModel;
        long j2;
        o.LJIIIZ(context, "context");
        if (context.mCurrentDurationMode) {
            j = C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration();
        } else {
            j = LivePlayEnforceIntervalSetting.DEFAULT;
        }
        C46150I9i c46150I9i = this.LIZ;
        if (c46150I9i != null) {
            musicBuzModel = c46150I9i.LIZIZ();
        } else {
            musicBuzModel = null;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        String str = context.mMusicPath;
        if (extractAVMusic == null || str == null || str.length() == 0) {
            j2 = context.mTotalRecordingTime;
        } else {
            j = Math.min(j, C44295HZz.LIZ(extractAVMusic, str));
            j2 = context.mTotalRecordingTime;
        }
        return j - j2;
    }
}
