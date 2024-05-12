package X;

import Y.ACListenerS31S0300000_5;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BxP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30459BxP implements InterfaceViewOnClickListenerC30227Btf {
    public boolean LJLIL;
    public View LJLILLLLZI;
    public C41071jL LJLJI;
    public final /* synthetic */ VideoWidget LJLJJI;

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

    public C30459BxP(VideoWidget videoWidget) {
        this.LJLJJI = videoWidget;
    }

    public final void LIZ(boolean z) {
        float f;
        View view = this.LJLILLLLZI;
        if (view != null && z) {
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            boolean z2 = this.LJLIL;
            float f2 = 0.4f;
            if (z2) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            fArr[0] = f;
            if (z2) {
                f2 = 1.0f;
            }
            fArr[1] = f2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
            ofFloat.setDuration(100L);
            ofFloat.start();
            C41071jL c41071jL = this.LJLJI;
            if (c41071jL != null) {
                c41071jL.setEnabled(this.LJLIL);
                this.LJLJI.setClickable(this.LJLIL);
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        BZI LIZ = C28787BRn.LIZ("livesdk_pm_live_mirror_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIIJZLJL();
        this.LJLILLLLZI = interfaceC30237Btp.LJFF();
        this.LJLJI = (C41071jL) interfaceC30237Btp.LIZ(R.id.gk4);
        if (InterfaceC30442Bx8.LJIIIZ.LIZIZ().intValue() == 1 && this.LJLJJI.isVideoEnable()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        LIZ(!z);
        this.LJLJI.setClickable(this.LJLIL);
        this.LJLJI.setEnabled(this.LJLIL);
        this.LJLJI.setChecked(this.LJLJJI.mIsMirror);
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue() && InterfaceC30442Bx8.LLLLLLLLL.LIZJ().booleanValue()) {
            this.LJLILLLLZI.findViewById(R.id.ldl).setVisibility(0);
        }
        C16880lQ.LJJIIJZLJL(this.LJLJI, new ACListenerS31S0300000_5(this, interfaceC30237Btp, dataChannel, 11));
    }
}
