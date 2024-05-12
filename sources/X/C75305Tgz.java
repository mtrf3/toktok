package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

/* renamed from: X.Tgz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75305Tgz implements C0K7 {
    public final /* synthetic */ MultiLiveAnchorSettingDialog LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public C75305Tgz(MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog, int i) {
        this.LJLIL = multiLiveAnchorSettingDialog;
        this.LJLILLLLZI = i;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        Integer num;
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = this.LJLIL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = multiLiveAnchorSettingDialog.LLJLLL;
        if (multiLiveAnchorPanelSettings != null) {
            num = Integer.valueOf(multiLiveAnchorPanelSettings.layoutType);
        } else {
            num = null;
        }
        C74824TYe.LJJJJJ(multiLiveAnchorSettingDialog.Nl(num), this.LJLILLLLZI - 1, "normal", "click", "cancel");
        liveDialog.dismiss();
    }
}
