package ud2;

import X.AbstractC43665HBt;
import X.AbstractC82618Wbe;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C143575kH;
import X.C146815pV;
import X.C163726bg;
import X.C165616ej;
import X.C165626ek;
import X.C165706es;
import X.C16880lQ;
import X.C275416g;
import X.C275516h;
import X.C43941HMj;
import X.C44226HXi;
import X.C44261HYr;
import X.C44263HYt;
import X.C44343Hal;
import X.C45306HqI;
import X.C45309HqL;
import X.C45310HqM;
import X.C45313HqP;
import X.C45849Hz3;
import X.C45943I1j;
import X.C46066I6c;
import X.C46072I6i;
import X.C46193IAz;
import X.C46200IBg;
import X.C53047Krr;
import X.C60903NvH;
import X.C61447O9r;
import X.C73040SlY;
import X.C74355TGd;
import X.C78688UuS;
import X.C82397WVl;
import X.C82519Wa3;
import X.C82622Wbi;
import X.C83113Wjd;
import X.C84488XDw;
import X.HXT;
import X.HYO;
import X.HZ3;
import X.HZ6;
import X.I61;
import X.I9T;
import X.IAR;
import X.InterfaceC84498XEg;
import X.ORZ;
import X.OSZ;
import X.WLA;
import X.WRI;
import X.WRN;
import X.WSN;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ApS200S0100000_7 extends AbstractC82618Wbe {
    public final int $t;
    public Object l0;

    /* JADX WARN: Type inference failed for: r0v102, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v105, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v111, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v117, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v120, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v126, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v129, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v132, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v135, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v138, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v141, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v144, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v147, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v150, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v153, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v156, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v159, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v162, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v165, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v168, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v171, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v174, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v177, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v180, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v183, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v186, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v189, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v192, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v195, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v198, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v201, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v204, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v207, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v210, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v213, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v216, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v219, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v222, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v225, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v228, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v231, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v234, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v237, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v240, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v243, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v246, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v249, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v252, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v255, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v258, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v261, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v264, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v267, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v270, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v273, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v276, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v279, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v282, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v285, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v288, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v291, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v294, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v297, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v300, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v303, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v306, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v309, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v312, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v315, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v318, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v321, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v324, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v325, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v93, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
    @Override // X.AbstractC82618Wbe
    public final CutVideoSpeedViewModel LIZIZ(C82622Wbi c82622Wbi) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c82622Wbi);
            case 1:
                return LIZIZ$1(this, c82622Wbi);
            case 2:
                return LIZIZ$2(this, c82622Wbi);
            case 3:
                return LIZIZ$3(this, c82622Wbi);
            case 4:
                return LIZIZ$4(this, c82622Wbi);
            case 5:
                return LIZIZ$5(this, c82622Wbi);
            case 6:
                return LIZIZ$6(this, c82622Wbi);
            case 7:
                return LIZIZ$7(this, c82622Wbi);
            case 8:
                return LIZIZ$8(this, c82622Wbi);
            case 9:
                return LIZIZ$9(this, c82622Wbi);
            case 10:
                return LIZIZ$10(this, c82622Wbi);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return LIZIZ$11(this, c82622Wbi);
            case 12:
                return LIZIZ$12(this, c82622Wbi);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return LIZIZ$13(this, c82622Wbi);
            case 14:
                return LIZIZ$14(this, c82622Wbi);
            case 15:
                return LIZIZ$15(this, c82622Wbi);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return LIZIZ$16(this, c82622Wbi);
            case 17:
                return LIZIZ$17(this, c82622Wbi);
            case 18:
                return LIZIZ$18(this, c82622Wbi);
            case 19:
                return LIZIZ$19(this, c82622Wbi);
            case 20:
                return LIZIZ$20(this, c82622Wbi);
            case 21:
                return LIZIZ$21(this, c82622Wbi);
            case 22:
                return LIZIZ$22(this, c82622Wbi);
            case 23:
                return LIZIZ$23(this, c82622Wbi);
            case 24:
                return LIZIZ$24(this, c82622Wbi);
            case 25:
                return LIZIZ$25(this, c82622Wbi);
            case 26:
                return LIZIZ$26(this, c82622Wbi);
            case 27:
                return LIZIZ$27(this, c82622Wbi);
            case 28:
                return LIZIZ$28(this, c82622Wbi);
            case 29:
                return LIZIZ$29(this, c82622Wbi);
            case 30:
                return LIZIZ$30(this, c82622Wbi);
            case 31:
                return LIZIZ$31(this, c82622Wbi);
            case 32:
                return LIZIZ$32(this, c82622Wbi);
            case 33:
                return LIZIZ$33(this, c82622Wbi);
            case 34:
                return LIZIZ$34(this, c82622Wbi);
            case 35:
                return LIZIZ$35(this, c82622Wbi);
            case 36:
                return LIZIZ$36(this, c82622Wbi);
            case 37:
                return LIZIZ$37(this, c82622Wbi);
            case 38:
                return LIZIZ$38(this, c82622Wbi);
            case 39:
                return LIZIZ$39(this, c82622Wbi);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return LIZIZ$40(this, c82622Wbi);
            case 41:
                return LIZIZ$41(this, c82622Wbi);
            case 42:
                return LIZIZ$42(this, c82622Wbi);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return LIZIZ$43(this, c82622Wbi);
            case 44:
                return LIZIZ$44(this, c82622Wbi);
            case 45:
                return LIZIZ$45(this, c82622Wbi);
            case 46:
                return LIZIZ$46(this, c82622Wbi);
            case 47:
                return LIZIZ$47(this, c82622Wbi);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return LIZIZ$48(this, c82622Wbi);
            case C61447O9r.LJIIJ:
                return LIZIZ$49(this, c82622Wbi);
            case 50:
                return LIZIZ$50(this, c82622Wbi);
            case 51:
                return LIZIZ$51(this, c82622Wbi);
            case 52:
                return LIZIZ$52(this, c82622Wbi);
            case 53:
                return LIZIZ$53(this, c82622Wbi);
            case 54:
                return LIZIZ$54(this, c82622Wbi);
            case 55:
                return LIZIZ$55(this, c82622Wbi);
            case 56:
                return LIZIZ$56(this, c82622Wbi);
            case 57:
                return LIZIZ$57(this, c82622Wbi);
            case 58:
                return LIZIZ$58(this, c82622Wbi);
            case 59:
                return LIZIZ$59(this, c82622Wbi);
            case 60:
                return LIZIZ$60(this, c82622Wbi);
            case 61:
                return LIZIZ$61(this, c82622Wbi);
            case BaseNotice.CREATOR /* 62 */:
                return LIZIZ$62(this, c82622Wbi);
            case 63:
                return LIZIZ$63(this, c82622Wbi);
            case 64:
                return LIZIZ$64(this, c82622Wbi);
            case 65:
                return LIZIZ$65(this, c82622Wbi);
            case 66:
                return LIZIZ$66(this, c82622Wbi);
            case 67:
                return LIZIZ$67(this, c82622Wbi);
            case 68:
                return LIZIZ$68(this, c82622Wbi);
            case 69:
                return LIZIZ$69(this, c82622Wbi);
            case 70:
                return LIZIZ$70(this, c82622Wbi);
            case 71:
                return LIZIZ$71(this, c82622Wbi);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return LIZIZ$72(this, c82622Wbi);
            case 73:
                return LIZIZ$73(this, c82622Wbi);
            case 74:
                return LIZIZ$74(this, c82622Wbi);
            case 75:
                return LIZIZ$75(this, c82622Wbi);
            case 76:
                return LIZIZ$76(this, c82622Wbi);
            case 77:
                return LIZIZ$77(this, c82622Wbi);
            case 78:
                return LIZIZ$78(this, c82622Wbi);
            case 79:
                return LIZIZ$79(this, c82622Wbi);
            case 80:
                return LIZIZ$80(this, c82622Wbi);
            case 81:
                return LIZIZ$81(this, c82622Wbi);
            case 82:
                return LIZIZ$82(this, c82622Wbi);
            case 83:
                return LIZIZ$83(this, c82622Wbi);
            case 84:
                return LIZIZ$84(this, c82622Wbi);
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                return LIZIZ$85(this, c82622Wbi);
            case 86:
                return LIZIZ$86(this, c82622Wbi);
            case 87:
                return LIZIZ$87(this, c82622Wbi);
            case 88:
                return LIZIZ$88(this, c82622Wbi);
            case 89:
                return LIZIZ$89(this, c82622Wbi);
            case 90:
                return LIZIZ$90(this, c82622Wbi);
            case 91:
                return LIZIZ$91(this, c82622Wbi);
            case 92:
                return LIZIZ$92(this, c82622Wbi);
            case 93:
                return LIZIZ$93(this, c82622Wbi);
            case 94:
                return LIZIZ$94(this, c82622Wbi);
            case 95:
                return LIZIZ$95(this, c82622Wbi);
            case 96:
                return LIZIZ$96(this, c82622Wbi);
            case 97:
                return LIZIZ$97(this, c82622Wbi);
            case 98:
                return LIZIZ$98(this, c82622Wbi);
            case 99:
                return LIZIZ$99(this, c82622Wbi);
            case 100:
                return LIZIZ$100(this, c82622Wbi);
            case 101:
                return LIZIZ$101(this, c82622Wbi);
            case 102:
                return LIZIZ$102(this, c82622Wbi);
            case 103:
                return LIZIZ$103(this, c82622Wbi);
            case 104:
                return LIZIZ$104(this, c82622Wbi);
            case 105:
                return LIZIZ$105(this, c82622Wbi);
            case 106:
                return LIZIZ$106(this, c82622Wbi);
            case 107:
                return LIZIZ$107(this, c82622Wbi);
            default:
                return super.LIZIZ(c82622Wbi);
        }
    }

    public ApS200S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object LIZIZ$0(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        C165626ek LIZIZ;
        o.LJIIIZ(container, "container");
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), ((C46066I6c) apS200S0100000_7.l0).LLIL);
        return LIZIZ.LIZ(CutVideoSpeedViewModel.class);
    }

    public static final Object LIZIZ$1(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        boolean z;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        boolean z2;
        o.LJIIIZ(container, "container");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = ((C46066I6c) apS200S0100000_7.l0).LJLIIL().multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.isMultiEditRetake) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MultiEditVideoRecordData multiEditVideoRecordData2 = ((C46066I6c) apS200S0100000_7.l0).LJLIIL().multiEditVideoRecordData.restoreMultiEditVideoRecordData;
            if (multiEditVideoRecordData2 != null) {
                list = multiEditVideoRecordData2.segmentDataList;
                if (list != null && list.size() > 1) {
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = ((C46066I6c) apS200S0100000_7.l0).LJLIIL().multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData2 != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) != null) {
                list = multiEditVideoRecordData.segmentDataList;
                if (list != null) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        return new I61(((C46066I6c) apS200S0100000_7.l0).LJLIIL().getOriginal(), z2, ((C46066I6c) apS200S0100000_7.l0).LJLIIL(), ((C46066I6c) apS200S0100000_7.l0).LJLIIL().multiEditVideoRecordData, ((C46066I6c) apS200S0100000_7.l0).LJLIIL().cut2EditTransferModel);
    }

    public static final Object LIZIZ$10(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        ShortVideoContext shortVideoContext = ((ExteriorVideoRecordScene) apS200S0100000_7.l0).LJLZ;
        o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
        return new IAR(shortVideoContext, new AqS157S0100000_7(container, 224));
    }

    public static final Object LIZIZ$100(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165706es.LJIIIIZZ(((C146815pV) apS200S0100000_7.l0).LLIL, null, null, 6).get("key_video_edit_view_model", VideoEditViewModel.class);
    }

    public static final Object LIZIZ$101(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165706es.LJIIIIZZ(((C146815pV) apS200S0100000_7.l0).LLIL, null, null, 6).get("key_cutter_view_model", VEVideoCutterViewModel.class);
    }

    public static final Object LIZIZ$102(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        C165626ek LIZIZ;
        o.LJIIIZ(container, "container");
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), ((C146815pV) apS200S0100000_7.l0).LLIL);
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModel = (EditAdjustClipsBottomViewModel) LIZIZ.LIZ(EditAdjustClipsBottomViewModel.class);
        Lifecycle lifecycle = ((C146815pV) apS200S0100000_7.l0).getLifecycle();
        editAdjustClipsBottomViewModel.getClass();
        o.LJIIIZ(lifecycle, "lifecycle");
        editAdjustClipsBottomViewModel.LJLJJLL = new C143575kH(lifecycle);
        return editAdjustClipsBottomViewModel;
    }

    public static final Object LIZIZ$103(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        C165626ek LIZIZ;
        o.LJIIIZ(container, "container");
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), ((C146815pV) apS200S0100000_7.l0).LLIL);
        return LIZIZ.LIZ(CutVideoSpeedViewModel.class);
    }

    public static final Object LIZIZ$104(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44261HYr LIZJ = CommerceToolsMissionService.LJIIJ().LIZJ(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        C275416g.LIZ(LIZJ, uptimeMillis);
        return LIZJ;
    }

    public static final Object LIZIZ$105(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C45943I1j c45943I1j = new C45943I1j(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c45943I1j.afterInit$als_release(uptimeMillis);
        return c45943I1j;
    }

    public static final Object LIZIZ$106(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44261HYr LIZJ = CommerceToolsMissionService.LJIIJ().LIZJ(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        C275416g.LIZ(LIZJ, uptimeMillis);
        return LIZJ;
    }

    public static final Object LIZIZ$107(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C45943I1j c45943I1j = new C45943I1j(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c45943I1j.afterInit$als_release(uptimeMillis);
        return c45943I1j;
    }

    public static final Object LIZIZ$11(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44226HXi c44226HXi = new C44226HXi(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c44226HXi.afterInit$als_release(uptimeMillis);
        return c44226HXi;
    }

    public static final Object LIZIZ$12(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C45313HqP c45313HqP = new C45313HqP(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c45313HqP.afterInit$als_release(uptimeMillis);
        return c45313HqP;
    }

    public static final Object LIZIZ$13(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        HYO hyo = new HYO(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        hyo.afterInit$als_release(uptimeMillis);
        return hyo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ$14(ud2.ApS200S0100000_7 r6, X.C82622Wbi r7) {
        /*
            java.lang.String r0 = "container"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            android.app.Application r1 = X.C60903NvH.LJ
            java.lang.String r0 = "getApplication()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.HZ4 r0 = X.HZ4.LJLIL
            X.XEg r2 = X.C84488XDw.LIZ(r1, r0)
            r0 = 3
            X.OSZ[] r3 = new X.OSZ[r0]
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene r0 = (com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LJLZ
            java.lang.String r5 = r0.shootWay
            java.lang.String r4 = ""
            if (r5 != 0) goto L22
            r5 = r4
        L22:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "source_category"
            r1.<init>(r0, r5)
            r0 = 0
            r3[r0] = r1
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene r0 = (com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LJLZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            java.lang.String r5 = X.I9T.LIZLLL(r0)
            if (r5 != 0) goto L3d
            r5 = r4
        L3d:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "music_id"
            r1.<init>(r0, r5)
            r0 = 1
            r3[r0] = r1
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene r1 = (com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene) r1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r1.LJLZ
            java.lang.String r0 = r0.presetEffectId
            if (r0 != 0) goto L7d
            java.util.List<java.lang.String> r0 = r1.LLFFF
            if (r0 == 0) goto L5b
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            if (r0 != 0) goto L7b
        L5b:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene r0 = (com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LLFII
            if (r0 == 0) goto L69
            java.lang.String r0 = r0.getEffectId()
            if (r0 != 0) goto L7d
        L69:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "sticker_id"
            r1.<init>(r0, r4)
            r0 = 2
            r3[r0] = r1
            java.util.Map r0 = X.C113554cx.LJJL(r3)
            r2.LJIJI(r0)
            return r2
        L7b:
            r4 = r0
            goto L69
        L7d:
            r4 = r0
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: ud2.ApS200S0100000_7.LIZIZ$14(ud2.ApS200S0100000_7, X.Wbi):java.lang.Object");
    }

    public static final Object LIZIZ$15(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44263HYt c44263HYt = new C44263HYt(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c44263HYt.afterInit$als_release(uptimeMillis);
        return c44263HYt;
    }

    public static final Object LIZIZ$16(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((ExteriorVideoRecordScene) apS200S0100000_7.l0).LJLZ;
    }

    public static final Object LIZIZ$17(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        Activity requireActivity = ((ExteriorVideoRecordScene) apS200S0100000_7.l0).requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type com.bytedance.ies.foundation.activity.BaseActivity");
        return requireActivity;
    }

    public static final Object LIZIZ$18(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165706es.LJIIIIZZ((ExteriorVideoRecordScene) apS200S0100000_7.l0, null, null, 6);
    }

    public static final Object LIZIZ$19(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        C165626ek LIZIZ;
        o.LJIIIZ(container, "container");
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), (ExteriorVideoRecordScene) apS200S0100000_7.l0);
        return LIZIZ;
    }

    public static final Object LIZIZ$2(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return new C46072I6i((ActivityC45651qj) C78688UuS.LJIJJ((C46066I6c) apS200S0100000_7.l0), (C46066I6c) apS200S0100000_7.l0, container);
    }

    public static final Object LIZIZ$20(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C45313HqP c45313HqP = new C45313HqP(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c45313HqP.afterInit$als_release(uptimeMillis);
        return c45313HqP;
    }

    public static final Object LIZIZ$21(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        Context LLLLJ = C16880lQ.LLLLJ(((VideoRecordNewScene) apS200S0100000_7.l0).requireActivity());
        o.LJIIIIZZ(LLLLJ, "requireActivity().applicationContext");
        return LLLLJ;
    }

    public static final Object LIZIZ$22(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((VideoRecordNewScene) apS200S0100000_7.l0).LLII;
    }

    public static final Object LIZIZ$23(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        View stickerGuideMaskView = ((VideoRecordNewScene) apS200S0100000_7.l0).LLF;
        o.LJIIIIZZ(stickerGuideMaskView, "stickerGuideMaskView");
        return stickerGuideMaskView;
    }

    public static final Object LIZIZ$24(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        HXT challengeStickerListener = ((VideoRecordNewScene) apS200S0100000_7.l0).LLIIII;
        o.LJIIIIZZ(challengeStickerListener, "challengeStickerListener");
        return new HZ6(container, challengeStickerListener, new AqS157S0100000_7((VideoRecordNewScene) apS200S0100000_7.l0, 309));
    }

    public static final Object LIZIZ$25(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((VideoRecordNewScene) apS200S0100000_7.l0).LLIIII;
    }

    public static final Object LIZIZ$26(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        ShortVideoContext shortVideoContext = ((VideoRecordNewScene) apS200S0100000_7.l0).LJLZ;
        o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
        return new IAR(shortVideoContext, new AqS157S0100000_7(container, 310));
    }

    public static final Object LIZIZ$27(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        InterfaceC84498XEg LIZ;
        Object effectId;
        Object LJLLLL;
        o.LJIIIZ(container, "container");
        if (C43941HMj.LIZIZ()) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            LIZ = C84488XDw.LIZ(application, null);
        } else {
            Application application2 = C60903NvH.LJ;
            o.LJIIIIZZ(application2, "getApplication()");
            LIZ = C84488XDw.LIZ(application2, HZ3.LJLIL);
        }
        OSZ[] oszArr = new OSZ[3];
        String str = ((VideoRecordNewScene) apS200S0100000_7.l0).LJLZ.shootWay;
        Object obj = "";
        if (str == null) {
            str = "";
        }
        oszArr[0] = new OSZ("source_category", str);
        String LIZLLL = I9T.LIZLLL(((VideoRecordNewScene) apS200S0100000_7.l0).LJLZ.creativeModel.musicBuzModel);
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        oszArr[1] = new OSZ("music_id", LIZLLL);
        VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) apS200S0100000_7.l0;
        Object obj2 = videoRecordNewScene.LJLZ.presetEffectId;
        if (obj2 == null) {
            List<String> list = videoRecordNewScene.LLFII;
            if (list == null || (LJLLLL = ORZ.LJLLLL(list)) == null) {
                Effect effect = ((VideoRecordNewScene) apS200S0100000_7.l0).LLFZ;
                if (effect != null && (effectId = effect.getEffectId()) != null) {
                    obj = effectId;
                }
            } else {
                obj = LJLLLL;
            }
        } else {
            obj = obj2;
        }
        oszArr[2] = new OSZ("sticker_id", obj);
        LIZ.LJIJI(C113554cx.LJJL(oszArr));
        return LIZ;
    }

    public static final Object LIZIZ$28(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((VideoRecordNewScene) apS200S0100000_7.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$29(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((VideoRecordNewScene) apS200S0100000_7.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$3(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((C46066I6c) apS200S0100000_7.l0).LLIFFJFJJ();
    }

    public static final Object LIZIZ$30(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        Activity requireActivity = ((VideoRecordNewScene) apS200S0100000_7.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        return requireActivity;
    }

    public static final Object LIZIZ$31(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        Activity requireActivity = ((VideoRecordNewScene) apS200S0100000_7.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        return requireActivity;
    }

    public static final Object LIZIZ$32(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((VideoRecordNewScene) apS200S0100000_7.l0).LJLZ;
    }

    public static final Object LIZIZ$33(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        Activity requireActivity = ((VideoRecordNewScene) apS200S0100000_7.l0).requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type com.bytedance.ies.foundation.activity.BaseActivity");
        return requireActivity;
    }

    public static final Object LIZIZ$34(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (VideoRecordNewScene) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$35(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165706es.LJIIIIZZ((VideoRecordNewScene) apS200S0100000_7.l0, null, null, 6);
    }

    public static final Object LIZIZ$36(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        C165626ek LIZIZ;
        o.LJIIIZ(container, "container");
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), (VideoRecordNewScene) apS200S0100000_7.l0);
        return LIZIZ;
    }

    public static final Object LIZIZ$37(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        HYO hyo = new HYO(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        hyo.afterInit$als_release(uptimeMillis);
        return hyo;
    }

    public static final Object LIZIZ$38(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C46200IBg c46200IBg = new C46200IBg(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c46200IBg.afterInit$als_release(uptimeMillis);
        return c46200IBg;
    }

    public static final Object LIZIZ$39(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44263HYt c44263HYt = new C44263HYt(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c44263HYt.afterInit$als_release(uptimeMillis);
        return c44263HYt;
    }

    public static final Object LIZIZ$4(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165706es.LJIIIIZZ(((C46066I6c) apS200S0100000_7.l0).LLIL, null, null, 6).get("key_multi_video_edit_model", CutMultiVideoViewModel.class);
    }

    public static final Object LIZIZ$40(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C45306HqI c45306HqI = new C45306HqI(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c45306HqI.afterInit$als_release(uptimeMillis);
        return c45306HqI;
    }

    public static final Object LIZIZ$41(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WLA wla = new WLA();
        ((C275416g) apS200S0100000_7.l0).getClass();
        wla.afterInit$als_release(uptimeMillis);
        return wla;
    }

    public static final Object LIZIZ$42(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WRN LIZ = WRI.LIZ(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        LIZ.afterInit$als_release(uptimeMillis);
        return LIZ;
    }

    public static final Object LIZIZ$43(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WSN wsn = new WSN(container, false, 2, null);
        ((C275416g) apS200S0100000_7.l0).getClass();
        wsn.afterInit$als_release(uptimeMillis);
        return wsn;
    }

    public static final Object LIZIZ$44(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C83113Wjd LIZIZ = C82519Wa3.LIZIZ(container, C45310HqM.LJLIL, 190);
        ((C275416g) apS200S0100000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$45(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44226HXi c44226HXi = new C44226HXi(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c44226HXi.afterInit$als_release(uptimeMillis);
        return c44226HXi;
    }

    public static final Object LIZIZ$46(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (C45849Hz3) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$47(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (TTEPEffectPreviewActivity) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$48(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        HXT challengeStickerListener = ((TTEPEffectPreviewActivity) apS200S0100000_7.l0).LLFII;
        o.LJIIIIZZ(challengeStickerListener, "challengeStickerListener");
        return new HZ6(container, challengeStickerListener, new AqS157S0100000_7((TTEPEffectPreviewActivity) apS200S0100000_7.l0, 508));
    }

    public static final Object LIZIZ$49(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        ShortVideoContext shortVideoContext = ((TTEPEffectPreviewActivity) apS200S0100000_7.l0).LJLLILLLL;
        o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
        return new IAR(shortVideoContext, new AqS157S0100000_7(container, 509));
    }

    public static final Object LIZIZ$5(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165706es.LJIIIIZZ(((C46066I6c) apS200S0100000_7.l0).LLIL, null, null, 6).get("key_video_edit_view_model", VideoEditViewModel.class);
    }

    public static final Object LIZIZ$50(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C46200IBg c46200IBg = new C46200IBg(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c46200IBg.afterInit$als_release(uptimeMillis);
        return c46200IBg;
    }

    public static final Object LIZIZ$51(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WLA wla = new WLA();
        ((C275416g) apS200S0100000_7.l0).getClass();
        wla.afterInit$als_release(uptimeMillis);
        return wla;
    }

    public static final Object LIZIZ$52(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WRN LIZ = WRI.LIZ(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        LIZ.afterInit$als_release(uptimeMillis);
        return LIZ;
    }

    public static final Object LIZIZ$53(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WSN wsn = new WSN(container, false, 2, null);
        ((C275416g) apS200S0100000_7.l0).getClass();
        wsn.afterInit$als_release(uptimeMillis);
        return wsn;
    }

    public static final Object LIZIZ$54(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C83113Wjd LIZIZ = C82519Wa3.LIZIZ(container, null, 254);
        ((C275416g) apS200S0100000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$55(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        C46193IAz LIZIZ = C74355TGd.LIZIZ(container, null, null, new C73040SlY(), new C53047Krr(), new AqS194S0100000_12(container, 199), 12);
        ((C275416g) apS200S0100000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$56(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44226HXi c44226HXi = new C44226HXi(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c44226HXi.afterInit$als_release(uptimeMillis);
        return c44226HXi;
    }

    public static final Object LIZIZ$57(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C45313HqP c45313HqP = new C45313HqP(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c45313HqP.afterInit$als_release(uptimeMillis);
        return c45313HqP;
    }

    public static final Object LIZIZ$58(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        HYO hyo = new HYO(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        hyo.afterInit$als_release(uptimeMillis);
        return hyo;
    }

    public static final Object LIZIZ$59(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ViewModelProviders.of((TTEPEffectPreviewActivity) apS200S0100000_7.l0);
    }

    public static final Object LIZIZ$6(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165706es.LJIIIIZZ(((C46066I6c) apS200S0100000_7.l0).LLIL, null, null, 6).get("key_cutter_view_model", VEVideoCutterViewModel.class);
    }

    public static final Object LIZIZ$60(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165616ej.LIZ((TTEPEffectPreviewActivity) apS200S0100000_7.l0);
    }

    public static final Object LIZIZ$61(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44261HYr LIZJ = CommerceToolsMissionService.LJIIJ().LIZJ(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        C275416g.LIZ(LIZJ, uptimeMillis);
        return LIZJ;
    }

    public static final Object LIZIZ$62(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (TTEPEffectPreviewActivity) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$63(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((TTEPEffectPreviewActivity) apS200S0100000_7.l0).LJLLILLLL;
    }

    public static final Object LIZIZ$64(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (TTEPEffectPreviewActivity) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$65(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        Activity requireActivity = ((AbstractC43665HBt) apS200S0100000_7.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        return requireActivity;
    }

    public static final Object LIZIZ$66(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        Activity requireActivity = ((AbstractC43665HBt) apS200S0100000_7.l0).requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return requireActivity;
    }

    public static final Object LIZIZ$67(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        Activity requireActivity = ((AbstractC43665HBt) apS200S0100000_7.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        return requireActivity;
    }

    public static final Object LIZIZ$68(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (AbstractC43665HBt) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$69(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((AbstractC43665HBt) apS200S0100000_7.l0).LJLILLLLZI;
    }

    public static final Object LIZIZ$7(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        C165626ek LIZIZ;
        o.LJIIIZ(container, "container");
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), ((C46066I6c) apS200S0100000_7.l0).LLIL);
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModel = (EditAdjustClipsBottomViewModel) LIZIZ.LIZ(EditAdjustClipsBottomViewModel.class);
        Lifecycle lifecycle = ((C46066I6c) apS200S0100000_7.l0).getLifecycle();
        editAdjustClipsBottomViewModel.getClass();
        o.LJIIIZ(lifecycle, "lifecycle");
        editAdjustClipsBottomViewModel.LJLJJLL = new C143575kH(lifecycle);
        return editAdjustClipsBottomViewModel;
    }

    public static final Object LIZIZ$70(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((AbstractC43665HBt) apS200S0100000_7.l0).LJLLI;
    }

    public static final Object LIZIZ$71(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((AbstractC43665HBt) apS200S0100000_7.l0).LJLIL;
    }

    public static final Object LIZIZ$72(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((AbstractC43665HBt) apS200S0100000_7.l0).LLJJIII();
    }

    public static final Object LIZIZ$73(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82397WVl c82397WVl = new C82397WVl(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c82397WVl.afterInit$als_release(uptimeMillis);
        return c82397WVl;
    }

    public static final Object LIZIZ$74(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ViewModelProviders.of((FTCVideoRecordNewActivity) apS200S0100000_7.l0);
    }

    public static final Object LIZIZ$75(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165616ej.LIZ((FTCVideoRecordNewActivity) apS200S0100000_7.l0);
    }

    public static final Object LIZIZ$76(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (FTCVideoRecordNewActivity) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$77(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((FTCVideoRecordNewActivity) apS200S0100000_7.l0).LJLLILLLL;
    }

    public static final Object LIZIZ$78(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (FTCVideoRecordNewActivity) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$79(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (FTCVideoRecordNewActivity) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$8(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WLA wla = new WLA();
        ((C275416g) apS200S0100000_7.l0).getClass();
        wla.afterInit$als_release(uptimeMillis);
        return wla;
    }

    public static final Object LIZIZ$80(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        HXT challengeStickerListener = ((FTCVideoRecordNewActivity) apS200S0100000_7.l0).LLFII;
        o.LJIIIIZZ(challengeStickerListener, "challengeStickerListener");
        return new HZ6(container, challengeStickerListener, new AqS157S0100000_7((FTCVideoRecordNewActivity) apS200S0100000_7.l0, 567));
    }

    public static final Object LIZIZ$81(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        ShortVideoContext shortVideoContext = ((FTCVideoRecordNewActivity) apS200S0100000_7.l0).LJLLILLLL;
        o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
        return new IAR(shortVideoContext, new AqS157S0100000_7(container, 568));
    }

    public static final Object LIZIZ$82(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C46200IBg c46200IBg = new C46200IBg(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c46200IBg.afterInit$als_release(uptimeMillis);
        return c46200IBg;
    }

    public static final Object LIZIZ$83(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44263HYt c44263HYt = new C44263HYt(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c44263HYt.afterInit$als_release(uptimeMillis);
        return c44263HYt;
    }

    public static final Object LIZIZ$84(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WLA wla = new WLA();
        ((C275416g) apS200S0100000_7.l0).getClass();
        wla.afterInit$als_release(uptimeMillis);
        return wla;
    }

    public static final Object LIZIZ$85(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        WSN wsn = new WSN(container, false, 2, null);
        ((C275416g) apS200S0100000_7.l0).getClass();
        wsn.afterInit$als_release(uptimeMillis);
        return wsn;
    }

    public static final Object LIZIZ$86(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C83113Wjd LIZIZ = C82519Wa3.LIZIZ(container, null, 254);
        ((C275416g) apS200S0100000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$87(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        C46193IAz LIZIZ = C74355TGd.LIZIZ(container, null, null, null, null, null, 124);
        ((C275416g) apS200S0100000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$88(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44226HXi c44226HXi = new C44226HXi(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c44226HXi.afterInit$als_release(uptimeMillis);
        return c44226HXi;
    }

    public static final Object LIZIZ$89(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C45313HqP c45313HqP = new C45313HqP(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        c45313HqP.afterInit$als_release(uptimeMillis);
        return c45313HqP;
    }

    public static final Object LIZIZ$9(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C83113Wjd LIZIZ = C82519Wa3.LIZIZ(container, C45309HqL.LJLIL, 190);
        ((C275416g) apS200S0100000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$90(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        HYO hyo = new HYO(container);
        ((C275416g) apS200S0100000_7.l0).getClass();
        hyo.afterInit$als_release(uptimeMillis);
        return hyo;
    }

    public static final Object LIZIZ$91(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((C44343Hal) apS200S0100000_7.l0).LIZLLL.LJ(ViewModelProvider.class, null);
    }

    public static final Object LIZIZ$92(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((C44343Hal) apS200S0100000_7.l0).LIZ;
    }

    public static final Object LIZIZ$93(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((C44343Hal) apS200S0100000_7.l0).LIZIZ;
    }

    public static final Object LIZIZ$94(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((C44343Hal) apS200S0100000_7.l0).LIZJ;
    }

    public static final Object LIZIZ$95(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return (C44343Hal) apS200S0100000_7.l0;
    }

    public static final Object LIZIZ$96(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((C44343Hal) apS200S0100000_7.l0).LJII.getValue();
    }

    public static final Object LIZIZ$97(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        boolean z;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        boolean z2;
        o.LJIIIZ(container, "container");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = ((C146815pV) apS200S0100000_7.l0).LJLIIL().multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.isMultiEditRetake) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MultiEditVideoRecordData multiEditVideoRecordData2 = ((C146815pV) apS200S0100000_7.l0).LJLIIL().multiEditVideoRecordData.restoreMultiEditVideoRecordData;
            if (multiEditVideoRecordData2 != null) {
                list = multiEditVideoRecordData2.segmentDataList;
                if (list != null && list.size() > 1) {
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = ((C146815pV) apS200S0100000_7.l0).LJLIIL().multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData2 != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) != null) {
                list = multiEditVideoRecordData.segmentDataList;
                if (list != null) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        return new I61(((C146815pV) apS200S0100000_7.l0).LJLIIL().getOriginal(), z2, ((C146815pV) apS200S0100000_7.l0).LJLIIL(), ((C146815pV) apS200S0100000_7.l0).LJLIIL().multiEditVideoRecordData, ((C146815pV) apS200S0100000_7.l0).LJLIIL().cut2EditTransferModel);
    }

    public static final Object LIZIZ$98(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return ((C146815pV) apS200S0100000_7.l0).LLIFFJFJJ();
    }

    public static final Object LIZIZ$99(ApS200S0100000_7 apS200S0100000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        return C165706es.LJIIIIZZ(((C146815pV) apS200S0100000_7.l0).LLIL, null, null, 6).get("key_multi_video_edit_model", CutMultiVideoViewModel.class);
    }

    public ApS200S0100000_7(C275416g c275416g, C275516h c275516h, int i) {
        this.$t = i;
        this.l0 = c275416g;
    }
}
