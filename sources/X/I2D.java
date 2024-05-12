package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I2D {
    public static final long LJI = C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration();
    public final ActivityC45651qj LIZ;
    public final I3X LIZIZ;
    public final I27 LIZJ;
    public final ShortVideoContext LIZLLL;
    public final C82622Wbi LJ;
    public final C62822Ol8 LJFF;

    public final void LIZ(C145355n9 chooseMusicResult) {
        long j;
        long j2;
        long j3;
        long j4;
        BackgroundVideo backgroundVideo;
        String str;
        I2H i2h;
        I2E LIZIZ;
        String str2;
        o.LJIIIZ(chooseMusicResult, "chooseMusicResult");
        if (chooseMusicResult.LIZ) {
            if (this.LIZ.isFinishing()) {
                return;
            }
            HB3.LIZ(this.LIZLLL);
            V16.LJ(this.LIZLLL);
            this.LIZIZ.vK(new C44302Ha6(this.LIZLLL.cameraComponentModel.mMaxDuration));
            this.LIZJ.handleCancelMusicResultEvent();
            return;
        }
        if (TextUtils.isEmpty(chooseMusicResult.LIZLLL) || this.LIZ.isFinishing()) {
            return;
        }
        String str3 = chooseMusicResult.LIZLLL;
        AVMusic aVMusic = chooseMusicResult.LIZJ;
        String str4 = chooseMusicResult.LIZIZ;
        ShortVideoContext shortVideoContext = this.LIZLLL;
        if (shortVideoContext.cameraComponentModel.mCurrentDurationMode) {
            j = LJI;
        } else {
            j = LivePlayEnforceIntervalSetting.DEFAULT;
        }
        if (HEG.LIZJ(shortVideoContext.stitchContext.stitchParams)) {
            StitchParams stitchParams = this.LIZLLL.stitchContext.stitchParams;
            o.LJI(stitchParams);
            OSJ<Long, Long, Long> LIZ = HEG.LIZ(stitchParams, str3, aVMusic, j);
            j3 = LIZ.getFirst().longValue();
            j4 = LIZ.getSecond().longValue();
            j2 = LIZ.getThird().longValue();
        } else {
            if (aVMusic != null && !TextUtils.isEmpty(str3)) {
                j3 = C44295HZz.LIZ(aVMusic, str3);
                j2 = Math.min(j3, j);
            } else {
                j2 = j;
                j3 = 0;
            }
            BackgroundVideo backgroundVideo2 = this.LIZLLL.cameraComponentModel.curBackgroundVideo;
            if (backgroundVideo2 != null) {
                long maxDuration = backgroundVideo2.getMaxDuration();
                if (maxDuration > 0 && (backgroundVideo = this.LIZLLL.cameraComponentModel.curBackgroundVideo) != null && !backgroundVideo.isMultiBgVideo()) {
                    j2 = Math.min(j2, maxDuration);
                }
            }
            j4 = j2;
        }
        this.LIZLLL.LJJIL(str4);
        ShortVideoContext shortVideoContext2 = this.LIZLLL;
        shortVideoContext2.cameraComponentModel.mMusicPath = str3;
        if (shortVideoContext2.LJJIJIIJIL()) {
            j2 = this.LIZLLL.cameraComponentModel.mMaxDuration;
        } else {
            this.LIZLLL.cameraComponentModel.mMaxDuration = j4;
        }
        WG0.LJFF(this.LIZLLL.cameraComponentModel.mMusicPath, new I2F(this));
        if (aVMusic != null) {
            str = aVMusic.getMusicId();
        } else {
            str = null;
        }
        PerformanceMonitor LIZIZ2 = C5IO.LIZIZ(str);
        if (LIZIZ2 != null) {
            C44298Ha2 c44298Ha2 = G8G.LIZ;
            c44298Ha2.getClass();
            c44298Ha2.LIZLLL(LIZIZ2.getType(), "back to record scene", LIZIZ2, 5);
        }
        this.LIZJ.handleChooseMusicResultEvent(aVMusic, str3);
        if (aVMusic != null && (i2h = (I2H) this.LJFF.getValue()) != null) {
            i2h.Ca(j, aVMusic);
        }
        if (this.LIZLLL.LJJIJIIJI()) {
            LIZIZ = C0R4.LIZIZ(new C0R4(this.LIZLLL), j, j2);
        } else {
            LIZIZ = C0R4.LIZIZ(new C0R4(this.LIZLLL), j, j3);
        }
        if (this.LIZLLL.creativeModel.reuseSoundAndEffectModel.isFromReuseMusic()) {
            if (aVMusic != null) {
                str2 = aVMusic.getMusicId();
            } else {
                str2 = null;
            }
            if (!o.LJ(str2, this.LIZLLL.creativeModel.reuseSoundAndEffectModel.getSoundId())) {
                this.LIZLLL.creativeModel.reuseSoundAndEffectModel.setFromReuseMusic(false);
            }
        }
        if (LIZIZ == I2E.MUSIC && chooseMusicResult.LJ) {
            this.LIZJ.showMusicTips(1);
        }
        this.LIZIZ.vK(new C44302Ha6(j2));
    }

    public I2D(ActivityC45651qj activity, InterfaceC45967I2h recordControlApi, I8C chooseMusicApi, ShortVideoContext shortVideoContext, C82622Wbi diContainer) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        o.LJIIIZ(chooseMusicApi, "chooseMusicApi");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = activity;
        this.LIZIZ = recordControlApi;
        this.LIZJ = chooseMusicApi;
        this.LIZLLL = shortVideoContext;
        this.LJ = diContainer;
        this.LJFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 221));
    }
}
