package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Tgw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75302Tgw implements InterfaceC75414Tik<ChangeMaxPositionResult> {
    public final /* synthetic */ MultiLiveAnchorSettingDialog LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ChangeMaxPositionResult value) {
        o.LJIIIZ(value, "value");
        DataChannel dataChannel = this.LJLIL.LJLJJL;
        if (dataChannel != null) {
            dataChannel.rv0(CurrentRealDisplayChannel.class, new OSZ(this.LJLILLLLZI, Integer.valueOf(this.LJLJI)));
        }
        this.LJLIL.Yl(this.LJLILLLLZI, null);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        o.LJIIIZ(error, "error");
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = this.LJLIL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = multiLiveAnchorSettingDialog.Pl().LJIIJ;
        if (multiLiveAnchorPanelSettings2 != null) {
            multiLiveAnchorPanelSettings = MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings2);
        } else {
            multiLiveAnchorPanelSettings = null;
        }
        multiLiveAnchorSettingDialog.LLJLLL = multiLiveAnchorPanelSettings;
        BPP.LIZJ(this.LJLIL.getContext(), th);
        if (th != null) {
            C74987Tbr.LIZIZ("MultiLiveAnchorSettingDialog", "changeMaxPosition failed,", th);
        }
    }

    public C75302Tgw(int i, MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog, String str) {
        this.LJLIL = multiLiveAnchorSettingDialog;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }
}
