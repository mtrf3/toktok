package Y;

import X.C46193IAz;
import X.C60903NvH;
import X.C76800UCe;
import X.C78605Ut7;
import X.C78983UzD;
import X.F9J;
import X.GGS;
import X.GGT;
import X.HB4;
import X.InterfaceC65784Pro;
import X.J8V;
import X.WX6;
import android.content.SharedPreferences;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;

/* loaded from: classes8.dex */
public class AObjectS136S0100000_7 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        ExteriorVideoRecordScene exteriorVideoRecordScene = (ExteriorVideoRecordScene) aObjectS136S0100000_7.l0;
        exteriorVideoRecordScene.LL.addView(exteriorVideoRecordScene.LLILLJJLI.e8().getViewFunction().getView());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) aObjectS136S0100000_7.l0;
        videoRecordNewScene.LL.addView(videoRecordNewScene.LLJI.e8().getViewFunction().getView());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) aObjectS136S0100000_7.l0;
        String str = videoRecordNewScene.LJLZ.shootWay;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit.putString("shoot_way", str);
        WX6.LIZ(edit);
        HB4.LJFF(videoRecordNewScene.LJLZ.creativeInfo);
        boolean z = videoRecordNewScene.LJLZ.creativeModel.micDataModel.recordOriginalSoundWithBGM;
        SharedPreferences.Editor edit2 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit2.putBoolean("record_original_sound_with_bgm", z);
        WX6.LIZ(edit2);
        String str3 = C78983UzD.LJLJL;
        SharedPreferences.Editor edit3 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit3.putString("from_item_id", str3);
        WX6.LIZ(edit3);
        String str4 = videoRecordNewScene.LJLZ.creativeModel.followUpPublishTrackerModel.followUpFirstItemId;
        if (str4 == null) {
            str4 = "";
        }
        SharedPreferences.Editor edit4 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit4.putString("follow_up_first_item_id", str4);
        WX6.LIZ(edit4);
        String str5 = videoRecordNewScene.LJLZ.creativeModel.followUpPublishTrackerModel.followUpItemIdGroups;
        if (str5 != null) {
            str2 = str5;
        }
        SharedPreferences.Editor edit5 = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit5.putString("follow_up_item_id_groups", str2);
        WX6.LIZ(edit5);
        HB4.LJI(Boolean.valueOf(videoRecordNewScene.LJLZ.creativeModel.followUpPublishTrackerModel.enterRecordFromFeed));
        return null;
    }

    public static final Object invoke$11(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        return ((VideoRecordNewScene) aObjectS136S0100000_7.l0).LJLZ;
    }

    public static final Object invoke$12(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        if (!C78605Ut7.LIZJ(new String[]{"android.permission.RECORD_AUDIO"})) {
            ((C46193IAz) aObjectS136S0100000_7.l0).LLZL().LIZJ(J8V.LJFF());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        ((GGT) aObjectS136S0100000_7.l0).getClass();
        return GGS.LJFF;
    }

    public static final Object invoke$14(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        ((GGT) aObjectS136S0100000_7.l0).getClass();
        return GGS.LIZIZ;
    }

    public static final Object invoke$2(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        ((GGT) aObjectS136S0100000_7.l0).getClass();
        return GGS.LJFF;
    }

    public static final Object invoke$3(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        ((VideoPublishContainerScene) aObjectS136S0100000_7.l0).J();
        return null;
    }

    public static final Object invoke$4(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS136S0100000_7.l0;
        videoPublishContainerScene.LLILZ.LIZJ(videoPublishContainerScene.LLIIIZ, videoPublishContainerScene.LLILZLL, videoPublishContainerScene.LLLLIIL(), videoPublishContainerScene.LLILZLL.getCreationId(), videoPublishContainerScene.LJLZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        return ((VideoRecordNewScene) aObjectS136S0100000_7.l0).LJLLLLLL;
    }

    public static final Object invoke$6(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        return ((VideoRecordNewScene) aObjectS136S0100000_7.l0).LLJIJIL;
    }

    public static final Object invoke$7(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        ((VideoRecordNewScene) aObjectS136S0100000_7.l0).LLJJI();
        return null;
    }

    public static final Object invoke$8(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        return Boolean.valueOf(((VideoPublishContainerScene) aObjectS136S0100000_7.l0).LLLLLILLIL());
    }

    public static final Object invoke$9(AObjectS136S0100000_7 aObjectS136S0100000_7) {
        ((VideoPublishContainerScene) aObjectS136S0100000_7.l0).LLLILZ();
        return null;
    }

    public AObjectS136S0100000_7(VideoPublishContainerScene videoPublishContainerScene, int i) {
        this.$t = i;
        switch (i) {
            case 3:
            case 4:
            case 8:
                this.l0 = videoPublishContainerScene;
                return;
            case 5:
            case 6:
            case 7:
            default:
                this.l0 = videoPublishContainerScene;
                return;
        }
    }

    public AObjectS136S0100000_7(VideoRecordNewScene videoRecordNewScene, int i) {
        this.$t = i;
        switch (i) {
            case 1:
                this.l0 = videoRecordNewScene;
                return;
            default:
                this.l0 = videoRecordNewScene;
                return;
        }
    }

    public AObjectS136S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
