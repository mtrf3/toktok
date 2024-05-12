package X;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.broadcast.api.ZoomCameraScaleEvent;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BxO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30458BxO implements InterfaceViewOnClickListenerC30227Btf {
    public boolean LJLIL;
    public long LJLILLLLZI;
    public final /* synthetic */ VideoWidget LJLJI;

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
    public final boolean ud() {
        return false;
    }

    public C30458BxO(VideoWidget videoWidget) {
        this.LJLJI = videoWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        if (!this.LJLJI.isVideoEnable()) {
            return;
        }
        if (C18360no.LIZIZ()) {
            C30868C9o.LIZLLL(R.string.sqy, C15380j0.LIZLLL());
        }
        if (this.LJLILLLLZI == 0) {
            this.LJLILLLLZI = SystemClock.elapsedRealtime();
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < this.LJLILLLLZI + 1500) {
                return;
            } else {
                this.LJLILLLLZI = elapsedRealtime;
            }
        }
        boolean z = !this.LJLIL;
        this.LJLIL = z;
        if (z) {
            C31014CFe.LJJIIJZLJL = 1;
        } else {
            C31014CFe.LJJIIJZLJL = 2;
        }
        VideoWidget videoWidget = this.LJLJI;
        if (!videoWidget.mIsMirror) {
            videoWidget.mCameraCapture.LIZJ(false);
        }
        InterfaceC30442Bx8.LLLLLLL.LIZ(Boolean.FALSE);
        EnumC30204BtI.REVERSE_CAMERA.setRedDotVisible(this.LJLJI.dataChannel, false);
        ((C30514ByI) this.LJLJI.mCameraCapture).LJIIZILJ(C78857UxB.LJJIIJ(1476788233, "bpea-376"));
        this.LJLJI.dataChannel.qv0(ZoomCameraScaleEvent.class, Float.valueOf(0.0f));
        C30459BxP c30459BxP = this.LJLJI.mToolbarReverseMirrorBehavior;
        c30459BxP.LJLIL = this.LJLIL;
        c30459BxP.LIZ(true);
        C30355Bvj.LIZJ().LJIILIIL();
        InterfaceC30442Bx8.LJIIIZ.LJ(Integer.valueOf(this.LJLIL ? 1 : 0));
        BZI LIZ = C28787BRn.LIZ("pm_live_switch_camera_click");
        LIZ.LJIILLIIL(this.LJLJI.dataChannel);
        LIZ.LJIIIZ("live_take");
        LIZ.LJIIL("click");
        LIZ.LJJIIJZLJL();
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_switch_camera");
        LIZ2.LJ("broadcast");
        if (this.LJLIL) {
            str = "front";
        } else {
            str = "back";
        }
        LIZ2.LIZLLL("select_camera_type", str);
        LIZ2.LJIIIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        float f;
        if (InterfaceC30442Bx8.LJIIIZ.LIZIZ().intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        if (z) {
            C31014CFe.LJJIIJZLJL = 1;
        } else {
            C31014CFe.LJJIIJZLJL = 2;
        }
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.REVERSE_CAMERA;
        View view = enumC30204BtI.getView(this.LJLJI.dataChannel);
        if (view != null) {
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            float f2 = 0.4f;
            if (this.LJLJI.isVideoEnable()) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            fArr[0] = f;
            if (this.LJLJI.isVideoEnable()) {
                f2 = 1.0f;
            }
            fArr[1] = f2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
            ofFloat.setDuration(100L);
            ofFloat.start();
        }
        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue() && InterfaceC30442Bx8.LLLLLLL.LIZJ().booleanValue()) {
            enumC30204BtI.setRedDotVisible(dataChannel, true);
        }
        C77800Ug8.LJ("livesdk_pm_live_switch_camera_show", dataChannel);
    }
}
