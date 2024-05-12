package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Tgs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75298Tgs implements InterfaceC75414Tik<ChangeMaxPositionResult> {
    public final /* synthetic */ MultiLiveAnchorSettingDialog LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ EnumC75310Th4 LJLJJI;
    public final /* synthetic */ String LJLJJL;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ChangeMaxPositionResult value) {
        o.LJIIIZ(value, "value");
        DataChannel dataChannel = this.LJLIL.LJLJJL;
        if (dataChannel != null) {
            dataChannel.rv0(CurrentRealDisplayChannel.class, new OSZ(this.LJLILLLLZI, Integer.valueOf(this.LJLJI)));
        }
        this.LJLIL.Yl(this.LJLILLLLZI, this.LJLJJI);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        InterfaceC75441TjB R6;
        o.LJIIIZ(error, "error");
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = this.LJLIL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = multiLiveAnchorSettingDialog.Pl().LJIIJ;
        if (multiLiveAnchorPanelSettings2 != null) {
            multiLiveAnchorPanelSettings = MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings2);
        } else {
            multiLiveAnchorPanelSettings = null;
        }
        multiLiveAnchorSettingDialog.LLJLLL = multiLiveAnchorPanelSettings;
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && (R6 = C8E.LJ().R6()) != null) {
            R6.LJJJJL(this.LJLJJL);
        }
        BPP.LIZJ(this.LJLIL.getContext(), th);
        if (th != null) {
            C74987Tbr.LIZIZ("MultiLiveAnchorSettingDialog", "changeMaxPosition failed,", th);
        }
    }

    public C75298Tgs(MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog, String str, int i, EnumC75310Th4 enumC75310Th4, String str2) {
        this.LJLIL = multiLiveAnchorSettingDialog;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = enumC75310Th4;
        this.LJLJJL = str2;
    }
}
