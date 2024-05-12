package X;

import Y.AfS1S1201100_13;
import Y.AfS5S1100100_13;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialogContract$AbsView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* renamed from: X.Tgr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75297Tgr extends AbstractC75306Th0 {
    @Override // X.AbstractC75306Th0
    public final void LIZLLL() {
    }

    public C75297Tgr(MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog) {
        super(multiLiveAnchorSettingDialog);
    }

    @Override // X.AbstractC75306Th0
    public final void LIZJ(int i, String str, int i2, InterfaceC75414Tik<ChangeMaxPositionResult> interfaceC75414Tik) {
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
            bizChangeLayoutParams.displayId = i2;
            R6.LJJIIJZLJL(new C76606U4s(i, str, bizChangeLayoutParams), interfaceC75414Tik);
        }
    }

    @Override // X.AbstractC75306Th0
    public final void LJ(Long l, Long l2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, String str, EnumC75310Th4 enumC75310Th4, String str2) {
        String str3;
        if (i == 1) {
            str3 = "change_layout";
        } else {
            str3 = "change_permission";
        }
        if (l != null && l2 != null && multiLiveAnchorPanelSettings != null) {
            long LIZIZ = C31012CFc.LIZIZ();
            C74716TUa.LIZIZ((MultiLiveApi) TTL.LIZ(MultiLiveApi.class, "get().getService(MultiLiveApi::class.java)"), l.longValue(), C78886Uxe.LJJJLIIL(C8E.LJ()), l2.longValue(), multiLiveAnchorPanelSettings.layoutType, multiLiveAnchorPanelSettings.fixMicNumAction, multiLiveAnchorPanelSettings.allowViewerReq, multiLiveAnchorPanelSettings.onlyAllowFollowerReq, str, str2, 0, multiLiveAnchorPanelSettings.applierSortSetting, multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold, 512).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS1S1201100_13(LIZIZ, str3, this, i, enumC75310Th4, 0), new AfS5S1100100_13(LIZIZ, str3, this, 4));
        } else {
            MultiLiveAnchorSettingDialogContract$AbsView multiLiveAnchorSettingDialogContract$AbsView = (MultiLiveAnchorSettingDialogContract$AbsView) this.LJLILLLLZI;
            if (multiLiveAnchorSettingDialogContract$AbsView != null) {
                multiLiveAnchorSettingDialogContract$AbsView.U2(new Throwable("param illegal."));
            }
        }
    }
}
