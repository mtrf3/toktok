package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.rank.impl.setting.RankOptOutTipsDialog;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.B8g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28286B8g extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ RankOptOutTipsDialog LJLJJL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        Boolean bool;
        FragmentManager childFragmentManager;
        LiveAdminSettingDialog Kd0;
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29033BaP.class)).LIZ = "pop_window";
        DataChannel dataChannel = this.LJLJJL.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            Fragment parentFragment = this.LJLJJL.getParentFragment();
            if (parentFragment != null && (childFragmentManager = parentFragment.getChildFragmentManager()) != null && (Kd0 = ((IAdminSettingService) CN1.LIZ(IAdminSettingService.class)).Kd0(false)) != null) {
                Kd0.show(childFragmentManager, "LiveAdminSettingDialog");
            }
        } else {
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Kc0(this.LJLJJL.mo49getActivity());
        }
        this.LJLJJL.dismiss();
    }

    public C28286B8g(RankOptOutTipsDialog rankOptOutTipsDialog) {
        this.LJLJJL = rankOptOutTipsDialog;
    }
}
