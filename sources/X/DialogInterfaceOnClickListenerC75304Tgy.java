package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

/* renamed from: X.Tgy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC75304Tgy implements DialogInterface.OnClickListener {
    public final /* synthetic */ MultiLiveAnchorSettingDialog LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public DialogInterfaceOnClickListenerC75304Tgy(MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog, boolean z) {
        this.LJLIL = multiLiveAnchorSettingDialog;
        this.LJLILLLLZI = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        String Sl = this.LJLIL.Sl();
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LJLIL.LLJLLL;
        if (multiLiveAnchorPanelSettings2 != null && multiLiveAnchorPanelSettings2.fixMicNumAction == 0) {
            z = true;
        } else {
            z = false;
        }
        C74824TYe.LJJL(Sl, "cancel", z, this.LJLILLLLZI);
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = this.LJLIL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = multiLiveAnchorSettingDialog.Pl().LJIIJ;
        if (multiLiveAnchorPanelSettings3 != null) {
            multiLiveAnchorPanelSettings = MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings3);
        } else {
            multiLiveAnchorPanelSettings = null;
        }
        multiLiveAnchorSettingDialog.LLJLLL = multiLiveAnchorPanelSettings;
        dialogInterface.dismiss();
    }
}
