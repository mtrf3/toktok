package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* renamed from: X.Tgx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75303Tgx implements UHN {
    public final /* synthetic */ MultiLiveAnchorSettingDialog LIZ;

    public C75303Tgx(MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog) {
        this.LIZ = multiLiveAnchorSettingDialog;
    }

    @Override // X.UHN
    public final void LIZ(String str) {
        Integer LJJIL;
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = this.LIZ;
        multiLiveAnchorSettingDialog.getClass();
        multiLiveAnchorSettingDialog.Al(0);
        if (str != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
            int intValue = LJJIL.intValue();
            C2A7 c2a7 = this.LIZ.LLIIJI;
            if (c2a7 != null) {
                c2a7.setText(MultiLiveAnchorSettingDialog.Ll(intValue));
            }
            MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog2 = this.LIZ;
            multiLiveAnchorSettingDialog2.LLILLIZIL = intValue;
            long parseLong = CastLongProtector.parseLong(str);
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = multiLiveAnchorSettingDialog2.LLJLLL;
            if (multiLiveAnchorPanelSettings != null) {
                multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold = parseLong;
            }
            multiLiveAnchorSettingDialog2.xl(5);
            C74824TYe.LJLJJLL(intValue, "by_edit");
            C74824TYe.LJLJJL(intValue, "threshold_change");
        }
    }
}
