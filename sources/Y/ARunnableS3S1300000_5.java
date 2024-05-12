package Y;

import X.BHJ;
import X.BUT;
import X.C29180Bcm;
import X.C30553Byv;
import X.C31130CJq;
import X.C32148CjY;
import X.C44;
import X.CN1;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.gift.AutoTriggerConfig;
import com.ss.android.ugc.aweme.AnchorLevelPermission;
import com.ss.android.ugc.aweme.LivePermissionApply;
import com.ss.android.ugc.aweme.LiveScenario;
import com.ss.android.ugc.aweme.TryMode;
import com.ss.android.ugc.aweme.live.model.LivePermissionResponse;
import java.util.Map;

/* loaded from: classes6.dex */
public class ARunnableS3S1300000_5 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS3S1300000_5 aRunnableS3S1300000_5) {
        C29180Bcm c29180Bcm;
        C30553Byv c30553Byv;
        BUT but;
        C31130CJq c31130CJq = (C31130CJq) aRunnableS3S1300000_5.l1;
        LivePermissionResponse livePermissionResponse = (LivePermissionResponse) aRunnableS3S1300000_5.l2;
        C44 c44 = (C44) aRunnableS3S1300000_5.l3;
        String str = aRunnableS3S1300000_5.s0;
        c31130CJq.getClass();
        LivePermissionResponse.LivePodcastResponse livePodcastResponse = livePermissionResponse.data;
        C31130CJq.LIZJ = livePodcastResponse.canLive;
        LiveScenario liveScenario = livePodcastResponse.liveScenario;
        TryMode tryMode = livePodcastResponse.tryMode;
        LivePermissionApply livePermissionApply = livePodcastResponse.livePermissionApply;
        AnchorLevelPermission anchorLevelPermission = livePodcastResponse.anchorLevelPermission;
        boolean z = livePodcastResponse.canShowLiveStudio;
        BHJ bhj = null;
        if (liveScenario != null) {
            c29180Bcm = new C29180Bcm(liveScenario.enableLiveVideo, liveScenario.enableLiveScreenshot, liveScenario.enableLiveThirdParty, liveScenario.enableLiveStudio, z, liveScenario.enableLiveVoice);
        } else {
            c29180Bcm = null;
        }
        if (tryMode == null || tryMode.toString().isEmpty()) {
            c30553Byv = new C30553Byv(1, true, 0);
        } else {
            c30553Byv = new C30553Byv(tryMode.hasCreatedRoom, tryMode.enableLiveVideo, tryMode.newAnchorMode);
        }
        if (livePermissionApply != null) {
            but = new BUT(livePermissionApply.enableLiveVideo, livePermissionApply.enableLiveScreenshot, livePermissionApply.enableLiveThirdParty);
        } else {
            but = null;
        }
        if (anchorLevelPermission != null) {
            bhj = new BHJ(anchorLevelPermission.giftSetting, anchorLevelPermission.beauty, anchorLevelPermission.effects, anchorLevelPermission.share, anchorLevelPermission.moderatorSetting, anchorLevelPermission.commentSetting, anchorLevelPermission.flip, anchorLevelPermission.donationSticker, anchorLevelPermission.liveCenter, anchorLevelPermission.topic, anchorLevelPermission.voiceEffect, anchorLevelPermission.liveIntro, anchorLevelPermission.liveGoal, anchorLevelPermission.promote, anchorLevelPermission.subSetting, anchorLevelPermission.poll, anchorLevelPermission.subscription);
        }
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).setDetailLivePermission(c29180Bcm);
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).setTryModeExperiment(c30553Byv);
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).setApplyLivePermission(but);
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).setAnchorLevelPermissionInPreview(bhj);
        c44.LIZ(Boolean.valueOf(C31130CJq.LIZJ), c29180Bcm, but);
        C31130CJq.LIZ(1, C31130CJq.LIZJ ? 1 : 0, "", "smooth".equals(str));
    }

    public static final void run$1(ARunnableS3S1300000_5 aRunnableS3S1300000_5) {
        boolean LIZ;
        try {
            ((C32148CjY) aRunnableS3S1300000_5.l1).LIZIZ(aRunnableS3S1300000_5.s0, (Map) aRunnableS3S1300000_5.l2, (AutoTriggerConfig) aRunnableS3S1300000_5.l3);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS3S1300000_5(Object obj, C32148CjY c32148CjY, String str, Map<String, String> map, AutoTriggerConfig autoTriggerConfig) {
        this.$t = autoTriggerConfig;
        this.l1 = obj;
        this.s0 = c32148CjY;
        this.l2 = str;
        this.l3 = map;
    }
}
