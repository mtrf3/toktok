package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialogContract$AbsView;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;

/* renamed from: X.Th0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75306Th0 extends InteractDialogFragmentBaseContract$AbsPresenter<MultiLiveAnchorSettingDialogContract$AbsView> {
    public abstract void LIZJ(int i, String str, int i2, InterfaceC75414Tik<ChangeMaxPositionResult> interfaceC75414Tik);

    public abstract void LIZLLL();

    public abstract void LJ(Long l, Long l2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, String str, EnumC75310Th4 enumC75310Th4, String str2);

    public AbstractC75306Th0(MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog) {
        super(multiLiveAnchorSettingDialog);
    }
}
