package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;

/* renamed from: X.I2d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45963I2d {
    public static final long LJ = C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration();
    public final InterfaceC45968I2i LIZ;
    public final HXB LIZIZ;
    public final ShortVideoContext LIZJ;
    public final I3X LIZLLL;

    public void onEvent(C45964I2e c45964I2e) {
        long j;
        long j2;
        long j3;
        long j4;
        I2E LJJIJIL;
        EnumC45965I2f enumC45965I2f;
        String str;
        HXB hxb;
        BackgroundVideo backgroundVideo;
        boolean z;
        if (c45964I2e.LJLIL) {
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZJ.creativeModel.musicBuzModel);
            String str2 = this.LIZJ.cameraComponentModel.mMusicPath;
            if (c45964I2e.LJLILLLLZI) {
                j = LivePlayEnforceIntervalSetting.DEFAULT;
            } else {
                j = LJ;
            }
            if (extractAVMusic != null && !TextUtils.isEmpty(str2)) {
                j3 = C44295HZz.LIZ(extractAVMusic, str2);
                if (this.LIZ != null && this.LIZJ.LJII().isEmpty()) {
                    InterfaceC45968I2i interfaceC45968I2i = this.LIZ;
                    if (j3 > j) {
                        z = true;
                    } else {
                        z = false;
                    }
                    interfaceC45968I2i.sa(z);
                }
                j2 = Math.min(j3, j);
            } else {
                j2 = j;
                j3 = 0;
            }
            BackgroundVideo backgroundVideo2 = this.LIZJ.cameraComponentModel.curBackgroundVideo;
            if (backgroundVideo2 != null) {
                long maxDuration = backgroundVideo2.getMaxDuration();
                if (maxDuration > 0 && (backgroundVideo = this.LIZJ.cameraComponentModel.curBackgroundVideo) != null && !backgroundVideo.isMultiBgVideo()) {
                    j2 = Math.min(j2, maxDuration);
                }
            }
            if (this.LIZJ.LJJIJIIJI()) {
                OSJ<Long, Long, Long> LIZ = HEG.LIZ(this.LIZJ.stitchContext.stitchParams, str2, extractAVMusic, j);
                j3 = LIZ.getFirst().longValue();
                j4 = LIZ.getSecond().longValue();
                j2 = LIZ.getThird().longValue();
            } else {
                j4 = j2;
            }
            if (this.LIZJ.LJJIJIIJI()) {
                LJJIJIL = C17J.LJJIJIL(new C17J(), j, j2);
            } else {
                LJJIJIL = C17J.LJJIJIL(new C17J(), j, j3);
            }
            I3X i3x = this.LIZLLL;
            if (c45964I2e.LJLILLLLZI) {
                enumC45965I2f = EnumC45965I2f.FORM_15S;
            } else {
                enumC45965I2f = EnumC45965I2f.FORM_60S;
            }
            i3x.Ul0(enumC45965I2f, !c45964I2e.LJLIL);
            ShortVideoContext shortVideoContext = this.LIZJ;
            boolean z2 = !c45964I2e.LJLILLLLZI;
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            cameraComponentModel.mCurrentDurationMode = z2;
            cameraComponentModel.mMaxDuration = j4;
            this.LIZLLL.vK(new C44302Ha6(j2));
            if (LJJIJIL == I2E.MUSIC && !c45964I2e.LJLJJL && (hxb = this.LIZIZ) != null) {
                hxb.showMusicTips(1);
            }
            ShortVideoContext shortVideoContext2 = this.LIZJ;
            if (this.LIZ != null && shortVideoContext2.LJII().isEmpty() && extractAVMusic != null) {
                if (extractAVMusic.getShootDuration() > j || Math.abs(extractAVMusic.getShootDuration() - extractAVMusic.getDuration()) >= 1000) {
                    this.LIZ.sa(true);
                } else {
                    this.LIZ.sa(false);
                }
            }
            C60903NvH.LJIIJJI().LJJIL().setDurationMode(this.LIZJ.cameraComponentModel.mCurrentDurationMode);
            IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C44350Has(0).LIZ(C60903NvH.LJ, IVideoRecordPreferences.class);
            if (iVideoRecordPreferences != null && !iVideoRecordPreferences.isDurationModeManuallyChange(false)) {
                iVideoRecordPreferences.setDurationModeManuallyChange(true);
            }
            if (c45964I2e.LJLJJI == 2) {
                return;
            }
            C145995oB c145995oB = new C145995oB();
            if (c45964I2e.LJLILLLLZI) {
                str = "15s";
            } else {
                str = "60s";
            }
            c145995oB.LJI("to_status", str);
            c145995oB.LJI("creation_id", this.LIZJ.LJI());
            c145995oB.LJI("shoot_way", this.LIZJ.shootWay);
            int i = this.LIZJ.draftId;
            if (i != 0) {
                c145995oB.LIZ(i, "draft_id");
            }
            if (!TextUtils.isEmpty(this.LIZJ.newDraftId)) {
                c145995oB.LIZLLL("new_draft_id", this.LIZJ.newDraftId);
            }
            FMX.LJIIL("change_record_mode", c145995oB.LIZ);
        }
    }

    public C45963I2d(ShortVideoContext shortVideoContext, C82622Wbi c82622Wbi) {
        this.LIZJ = shortVideoContext;
        this.LIZ = (InterfaceC45968I2i) c82622Wbi.LJIIIIZZ(null, InterfaceC45968I2i.class);
        this.LIZIZ = (HXB) c82622Wbi.LJIIIIZZ(null, HXB.class);
        this.LIZLLL = (I3X) c82622Wbi.LJ(I3X.class, null);
    }
}
