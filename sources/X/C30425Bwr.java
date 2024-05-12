package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* renamed from: X.Bwr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30425Bwr implements InterfaceViewOnClickListenerC30227Btf {
    public C41071jL LJLIL;
    public View LJLILLLLZI;
    public DataChannel LJLJI;

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
    public final /* synthetic */ void ei() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final boolean ud() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        DataChannel dataChannel2 = this.LJLJI;
        BZI LIZ = C28787BRn.LIZ("livesdk_earphone_monitor_effective_switch");
        LIZ.LJIILLIIL(dataChannel2);
        LIZ.LJIJJ(Integer.valueOf(Boolean.compare(C30501By5.LIZ.LIZ(), false)), "earphone_status");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLJI = dataChannel;
        this.LJLIL = (C41071jL) interfaceC30237Btp.LIZ(R.id.cl_);
        this.LJLILLLLZI = interfaceC30237Btp.LIZ(R.id.ldl);
        C41071jL c41071jL = this.LJLIL;
        if (c41071jL != null) {
            c41071jL.setChecked(C30501By5.LIZ.LIZ());
        }
        View view = this.LJLILLLLZI;
        boolean z = false;
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
            Integer LIZJ = InterfaceC30442Bx8.LLLLIIIILLL.LIZJ();
            int ordinal = EnumC30502By6.DEFAULT.ordinal();
            if (LIZJ != null && LIZJ.intValue() == ordinal) {
                z = true;
            }
        }
        C29306Beo.LJJLIIIJJI(view, z);
        C41071jL c41071jL2 = this.LJLIL;
        if (c41071jL2 != null) {
            C29306Beo.LJJJLL(c41071jL2, 500L, new AqS171S0100000_5(this, 739));
        }
    }
}
