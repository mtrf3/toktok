package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.DisableMuteMicEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BpP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29963BpP implements InterfaceViewOnClickListenerC30227Btf {
    public final LifecycleOwner LJLIL;
    public C41071jL LJLILLLLZI;
    public DataChannel LJLJI;
    public InterfaceC30237Btp LJLJJI;

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

    public C29963BpP(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
    }

    public final void LIZ(boolean z) {
        float f;
        InterfaceC30237Btp interfaceC30237Btp = this.LJLJJI;
        if (interfaceC30237Btp != null) {
            if (z) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            interfaceC30237Btp.setAlpha(f);
        }
        C41071jL c41071jL = this.LJLILLLLZI;
        if (c41071jL != null) {
            c41071jL.setChecked(C29829BnF.LIZ);
        }
        C41071jL c41071jL2 = this.LJLILLLLZI;
        if (c41071jL2 == null) {
            return;
        }
        c41071jL2.setEnabled(C29306Beo.LJIILLIIL(Boolean.valueOf(z)));
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLJI = dataChannel;
        this.LJLJJI = interfaceC30237Btp;
        this.LJLILLLLZI = (C41071jL) interfaceC30237Btp.LIZ(R.id.gus);
        LIZ(C29925Bon.LJLJJI);
        C41071jL c41071jL = this.LJLILLLLZI;
        if (c41071jL != null) {
            C16880lQ.LJJIIJZLJL(c41071jL, new ACListenerS40S0200000_5(this, dataChannel, 55));
        }
        if (dataChannel != null) {
            dataChannel.lv0(this.LJLIL, DisableMuteMicEvent.class, new AqS171S0100000_5(this, 747));
        }
    }
}
