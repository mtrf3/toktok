package X;

import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5tR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C149255tR extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public C149255tR(NowsEditRootScene nowsEditRootScene) {
        super(1, nowsEditRootScene, NowsEditRootScene.class, "clickPublish", "clickPublish(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        final NowsEditRootScene nowsEditRootScene = (NowsEditRootScene) this.receiver;
        VideoPublishEditModel videoPublishEditModel = nowsEditRootScene.LJLL;
        if (videoPublishEditModel != null) {
            NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
            if (nowsShootModel != null) {
                nowsShootModel.isNormalPublish = booleanValue;
            }
            if (!C1B8.LIZJ()) {
                HQ7 accountService = C60903NvH.LJIIJJI().getAccountService();
                Activity requireActivity = nowsEditRootScene.requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                accountService.LIZ(requireActivity, "now_post_page", "click_shoot", null, new R3Y() { // from class: X.5tS
                    @Override // X.R3Y
                    public final void onCancel() {
                    }

                    @Override // X.R3Y
                    public final void onSuccess() {
                        NowsEditRootScene nowsEditRootScene2 = NowsEditRootScene.this;
                        nowsEditRootScene2.getClass();
                        nowsEditRootScene2.LLLFF(new AqS152S0100000_2(nowsEditRootScene2, UserLevelGeckoUpdateSetting.DEFAULT));
                    }
                });
            } else {
                nowsEditRootScene.LLLFF(new AqS152S0100000_2(nowsEditRootScene, UserLevelGeckoUpdateSetting.DEFAULT));
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("model");
        throw null;
    }
}
