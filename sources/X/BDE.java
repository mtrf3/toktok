package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BDE implements InterfaceViewOnClickListenerC30227Btf, Observer<C47622ImY> {
    public Room LJLIL;
    public DataChannel LJLILLLLZI;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public BDE(Context context) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJZ;
        Boolean bool = Boolean.FALSE;
        c48459J0d.LIZ(bool);
        C48459J0d<java.util.Map<String, Boolean>> c48459J0d2 = InterfaceC30442Bx8.LLD;
        c48459J0d2.LIZJ().put(CardStruct.IStatusCode.DEFAULT, bool);
        c48459J0d2.LIZ(c48459J0d2.LIZJ());
        if (C2NU.LIZ.LIZIZ()) {
            FragmentManager fragmentManager = (FragmentManager) this.LJLILLLLZI.kv0(C29494Bhq.class);
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29033BaP.class)).LIZ = "more_page_setting";
            LiveAdminSettingDialog Kd0 = C7N.LIZIZ().Kd0(false);
            if (this.LJLIL != null && fragmentManager != null && Kd0 != null) {
                Kd0.show(fragmentManager, "ToolbarManageBehavior");
                BZI LIZ = C28787BRn.LIZ("livesdk_anchor_set_page_click");
                LIZ.LJIILLIIL(this.LJLILLLLZI);
                LIZ.LJIJJ(C28509BGv.LIZ(this.LJLIL.getStreamType()), "live_type");
                LIZ.LJJIIJZLJL();
                return;
            }
            return;
        }
        C30868C9o.LIZJ(R.string.n0o);
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C47622ImY c47622ImY) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        StarCommentConfig starCommentConfig;
        C77800Ug8.LJ("livesdk_anchor_set_icon_show", dataChannel);
        this.LJLILLLLZI = dataChannel;
        this.LJLIL = (Room) dataChannel.kv0(RoomChannel.class);
        dataChannel.kv0(BCX.class);
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.SETTING;
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue() && InterfaceC30442Bx8.LJZ.LIZJ().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        enumC30204BtI.setRedDotVisible(dataChannel, z);
        Room room = this.LJLIL;
        if (room != null && (starCommentConfig = room.starCommentConfig) != null && starCommentConfig.starCommentQualification && InterfaceC30442Bx8.LLD.LIZJ().get(CardStruct.IStatusCode.DEFAULT) == null) {
            enumC30204BtI.setRedDotVisible(dataChannel, true);
        }
    }
}
