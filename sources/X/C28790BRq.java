package X;

import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.livesetting.gift.LiveTreasureBoxContainerOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.CollectPerformanceAfterEnterRoomSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.HashMap;

/* renamed from: X.BRq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28790BRq extends AbstractC30139BsF {
    public final /* synthetic */ AbsAudienceInteractionFragment LIZIZ;

    public final void LIZ() {
        long j;
        long j2;
        EnterRoomConfig.ECWrapData eCWrapData;
        HashMap<String, String> hashMap;
        BJE bje;
        BJE bje2;
        this.LIZIZ.loadWidgetWithFirstFrameP2();
        if (!LiveTreasureBoxContainerOptimizeSetting.INSTANCE.getValue()) {
            this.LIZIZ.loadTreasureBoxWidgetAndRedEnvelopeWidget();
        }
        if ("mall".equals(BJM.LJFF())) {
            C28246B6s LJIJI = BJM.LJIJI();
            if (LJIJI != null && (bje2 = LJIJI.LJ) != null) {
                j = bje2.LJII;
            } else {
                j = -1;
            }
            C28246B6s LJIJI2 = BJM.LJIJI();
            if (LJIJI2 != null && (bje = LJIJI2.LJ) != null) {
                j2 = bje.LJIIIIZZ;
            } else {
                j2 = -1;
            }
            if (j != -1 || j2 != -1) {
                long currentTimeMillis = System.currentTimeMillis();
                if (j2 != -1) {
                    j = j2;
                }
                long j3 = currentTimeMillis - j;
                EnterRoomConfig enterRoomConfig = this.LIZIZ.mEnterRoomConfig;
                if (enterRoomConfig == null) {
                    eCWrapData = null;
                } else {
                    eCWrapData = enterRoomConfig.mECData;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("real_duration", String.valueOf(j3));
                if (eCWrapData != null && (hashMap = eCWrapData.ecCommonExtraParam) != null) {
                    hashMap2.putAll(hashMap);
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_interaction_layer_start_inflation");
                LIZ.LJJIFFI(hashMap2);
                LIZ.LJIIZILJ();
                LIZ.LJJIIJZLJL();
            }
        }
        LivePerformanceManager LIZ2 = B4U.LIZ();
        LIZ2.getClass();
        if (!CollectPerformanceAfterEnterRoomSetting.INSTANCE.getEnable()) {
            return;
        }
        LIZ2.LLIILII = true;
    }

    public C28790BRq(AbsAudienceInteractionFragment absAudienceInteractionFragment) {
        this.LIZIZ = absAudienceInteractionFragment;
    }
}
