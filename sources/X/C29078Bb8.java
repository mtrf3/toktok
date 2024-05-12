package X;

import Y.AObjectS10S0001000_5;
import Y.AObjectS11S0001000_6;
import Y.AObjectS42S0101000_5;
import Y.AObjectS86S0300000_5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bb8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29078Bb8 implements InterfaceViewOnClickListenerC30227Btf, Observer<C47622ImY> {
    public DataChannel LJLIL;
    public final Context LJLILLLLZI;
    public final AObjectS11S0001000_6 LJLJI = new AObjectS11S0001000_6(0, 3);
    public EnumC12540eQ LJLJJI;

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
    public final boolean ud() {
        BEF bef = (BEF) this.LJLIL.kv0(LiveBanCapabilityChannel.class);
        if (this.LJLJJI == EnumC12540eQ.ON && (bef == null || !bef.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C29078Bb8(Context context) {
        this.LJLILLLLZI = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BEF bef = (BEF) this.LJLIL.kv0(LiveBanCapabilityChannel.class);
        if (bef != null && bef.LJLILLLLZI) {
            C30868C9o.LIZJ(R.string.o7y);
        } else {
            BCD.LIZ(this.LJLIL, this.LJLJI, new AObjectS42S0101000_5(2, this, 22), new AObjectS10S0001000_5(0, 6), this.LJLILLLLZI.getString(R.string.k1g), Boolean.TRUE);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C47622ImY c47622ImY) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLIL = dataChannel;
        AObjectS11S0001000_6 extractServerResponse = this.LJLJI;
        AObjectS86S0300000_5 aObjectS86S0300000_5 = new AObjectS86S0300000_5(this, dataChannel, interfaceC30237Btp, 2);
        o.LJIIIZ(extractServerResponse, "extractServerResponse");
        BCD.LIZ(null, extractServerResponse, aObjectS86S0300000_5, null, null, Boolean.TRUE);
        BZI LIZ = C28787BRn.LIZ("livesdk_room_detail_setting");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(C29232Bdc.LJIIZILJ(((ISubscribeService) CN1.LIZ(ISubscribeService.class)).ze0()));
        LIZ.LIZJ("show");
        LIZ.LJJIIJZLJL();
        dataChannel.lv0(C29306Beo.LIZ(this.LJLILLLLZI), LiveBanCapabilityChannel.class, new AObjectS42S0101000_5(1, interfaceC30237Btp, 41));
    }
}
