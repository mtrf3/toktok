package X;

import Y.ACListenerS25S0100000_5;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.multihost.trymode.TryModeCoHostManageSheet;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BZ2 implements InterfaceViewOnClickListenerC30227Btf {
    public DataChannel LJLIL;
    public C2A4 LJLILLLLZI;
    public long LJLJI;

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
    public final /* synthetic */ void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LJLJI < 500) {
            return;
        }
        this.LJLJI = uptimeMillis;
        C75642TmQ.LJJJZ("connection_invite", null, 6);
        C75017TcL.LJIIJ(this.LJLIL);
        if (C78540Us4.LJJIII()) {
            Boolean LIZJ = InterfaceC30442Bx8.s3.LIZJ();
            o.LJIIIIZZ(LIZJ, "TRY_MODE_CO_HOST_WEBP_SHOW.value");
            if (LIZJ.booleanValue()) {
                FragmentManager LJFF = C29306Beo.LJFF(this.LJLIL);
                if (LJFF == null) {
                    return;
                }
                ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createTryModeEducationDialogFragment("co_host", new ACListenerS25S0100000_5(this, 346)).show(LJFF, "try_mode_interaction_co_host_sheet");
                return;
            }
        }
        FragmentManager LJFF2 = C29306Beo.LJFF(this.LJLIL);
        if (LJFF2 == null) {
            return;
        }
        C32044Chs.LJIIIZ(LJFF2, TryModeCoHostManageSheet.class, "try_mode_co_host_anchor_manage_dialog", null, null);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        interfaceC30237Btp.getContext();
        this.LJLIL = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BNK.class)) != null) {
            z = bool.booleanValue();
            if (z) {
                ((TextView) interfaceC30237Btp.LIZ(R.id.ldm)).setText(C15380j0.LJIILJJIL(R.string.n8l));
                this.LJLILLLLZI = (C2A4) interfaceC30237Btp.LIZ(R.id.ld4);
            }
        } else {
            z = false;
        }
        W5G w5g = (W5G) interfaceC30237Btp.LIZ(R.id.ext);
        if (w5g != null) {
            if (z) {
                C2A4 c2a4 = this.LJLILLLLZI;
                if (c2a4 != null) {
                    c2a4.setImageResource(R.drawable.cwv);
                    return;
                }
                return;
            }
            w5g.setImageResource(R.drawable.cwu);
        }
    }
}
