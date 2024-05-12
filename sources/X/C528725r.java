package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceSourceFragment;
import com.bytedance.android.live.broadcast.widget.DualDeviceFlipPowerWidget;
import com.bytedance.android.live.broadcast.widget.DualDevicePowerCameraWidget;
import com.bytedance.android.live.broadcast.widget.DualDevicePowerWidget;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceFlipCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.25r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C528725r extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ GameDualDeviceSourceFragment LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C528725r(GameDualDeviceSourceFragment gameDualDeviceSourceFragment, boolean z) {
        super(0);
        this.LJLIL = gameDualDeviceSourceFragment;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        SurfaceHolder holder;
        final GameDualDeviceSourceFragment gameDualDeviceSourceFragment = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        if (gameDualDeviceSourceFragment.isAdded() && z) {
            gameDualDeviceSourceFragment.LJLLLL = BHA.LIZ(new ViewModelProvider(gameDualDeviceSourceFragment), gameDualDeviceSourceFragment);
            gameDualDeviceSourceFragment.LJLLL = RecyclableWidgetManager.of(gameDualDeviceSourceFragment, gameDualDeviceSourceFragment.getView(), LiveWidgetProviderProxy.Companion.getInstance(), C30326BvG.LIZ);
            if (gameDualDeviceSourceFragment.LJLLI == null) {
                gameDualDeviceSourceFragment.LJLLI = new DualDevicePowerWidget();
            }
            if (gameDualDeviceSourceFragment.LJLLILLLL == null) {
                gameDualDeviceSourceFragment.LJLLILLLL = new DualDevicePowerCameraWidget();
            }
            if (gameDualDeviceSourceFragment.LJLLJ == null) {
                gameDualDeviceSourceFragment.LJLLJ = new DualDeviceFlipPowerWidget();
            }
            RecyclableWidgetManager recyclableWidgetManager = gameDualDeviceSourceFragment.LJLLL;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.load(R.id.aqv, gameDualDeviceSourceFragment.LJLLILLLL);
            }
            RecyclableWidgetManager recyclableWidgetManager2 = gameDualDeviceSourceFragment.LJLLL;
            if (recyclableWidgetManager2 != null) {
                recyclableWidgetManager2.load(R.id.aqu, gameDualDeviceSourceFragment.LJLLI);
            }
            RecyclableWidgetManager recyclableWidgetManager3 = gameDualDeviceSourceFragment.LJLLL;
            if (recyclableWidgetManager3 != null) {
                recyclableWidgetManager3.load(R.id.apr, gameDualDeviceSourceFragment.LJLLJ);
            }
            DataChannel dataChannel = gameDualDeviceSourceFragment.LJLLLL;
            if (dataChannel != null) {
                dataChannel.ov0(gameDualDeviceSourceFragment, LiveDualDevicePowerEvent.class, new IDqS416S0100000(gameDualDeviceSourceFragment, 287));
                dataChannel.ov0(gameDualDeviceSourceFragment, LiveDualDevicePowerCameraChannel.class, new IDqS416S0100000(gameDualDeviceSourceFragment, 288));
                dataChannel.ov0(gameDualDeviceSourceFragment, LiveDualDeviceFlipCameraChannel.class, new IDqS416S0100000(gameDualDeviceSourceFragment, 289));
            }
            SurfaceView surfaceView = gameDualDeviceSourceFragment.LJLJI;
            if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                holder.addCallback(new SurfaceHolder.Callback() { // from class: X.0v5
                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceChanged(SurfaceHolder holder2, int i, int i2, int i3) {
                        o.LJIIIZ(holder2, "holder");
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceCreated(SurfaceHolder holder2) {
                        o.LJIIIZ(holder2, "holder");
                        Surface surface = holder2.getSurface();
                        C005800o c005800o = GameDualDeviceSourceFragment.this.LLF;
                        if (c005800o != null) {
                            c005800o.LIZ(surface);
                        }
                        C0NB.LJIIL("GameDualDeviceSource", "ByteCast Source initViews: on SurfaceCreate");
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceDestroyed(SurfaceHolder holder2) {
                        o.LJIIIZ(holder2, "holder");
                        Surface surface = holder2.getSurface();
                        C005800o c005800o = GameDualDeviceSourceFragment.this.LLF;
                        if (c005800o != null) {
                            c005800o.LJIIIZ(surface);
                        }
                    }
                });
            }
            SurfaceView surfaceView2 = gameDualDeviceSourceFragment.LJLJI;
            if (surfaceView2 != null) {
                surfaceView2.setClipToOutline(true);
                surfaceView2.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0v4
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        o.LJIIIZ(view, "view");
                        o.LJIIIZ(outline, "outline");
                        outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), KL2.LIZJ(GameDualDeviceSourceFragment.this.getContext(), 12.0f));
                    }
                });
            }
            View view = gameDualDeviceSourceFragment.LJLJJI;
            if (view != null) {
                view.setClipToOutline(true);
                view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0v4
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view2, Outline outline) {
                        o.LJIIIZ(view2, "view");
                        o.LJIIIZ(outline, "outline");
                        outline.setRoundRect(new Rect(0, 0, view2.getWidth(), view2.getHeight()), KL2.LIZJ(GameDualDeviceSourceFragment.this.getContext(), 12.0f));
                    }
                });
            }
            gameDualDeviceSourceFragment.Gl(-1);
            gameDualDeviceSourceFragment.vl();
            BZI LIZ = C28787BRn.LIZ("livesdk_dual_device_source_init_succeed");
            LIZ.LJIJJ(Long.valueOf(C0JV.LIZ()), "user_id");
            LIZ.LJJIIJZLJL();
        }
        return C76800UCe.LIZ;
    }
}
