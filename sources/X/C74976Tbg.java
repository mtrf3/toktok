package X;

import Y.ARunnableS32S0200000_13;
import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptPanelFixLayoutConfigSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tbg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74976Tbg implements InterfaceC76112Tu0 {
    public String LJLIL;
    public Boolean LJLILLLLZI;
    public final /* synthetic */ MultiGuestV3GuestPresenter LJLJI;

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    public C74976Tbg(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter) {
        this.LJLJI = multiGuestV3GuestPresenter;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        ZoomService zoomService;
        SurfaceView surfaceView;
        o.LJIIIZ(layout, "layout");
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLJI;
        Object obj = multiGuestV3GuestPresenter.liveVideoClient;
        Boolean bool = null;
        if ((obj instanceof SurfaceView) && (surfaceView = (SurfaceView) obj) != null) {
            surfaceView.post(new ARunnableS32S0200000_13(multiGuestV3GuestPresenter, surfaceView, 18));
        }
        if (MultiGuestOptPanelFixLayoutConfigSetting.INSTANCE.getValue().enableLayoutLoadingChange) {
            if (o.LJ(layout.getLayoutBusinessType(), EnumC74991Tbv.FLOAT_FIX.getBusinessType())) {
                if (!o.LJ(this.LJLIL, layout.getLayoutId())) {
                    C74824TYe.LJJJJLI();
                }
            } else if ((o.LJ(layout.getLayoutBusinessType(), EnumC74991Tbv.FLOAT.getBusinessType()) || o.LJ(layout.getLayoutBusinessType(), EnumC74991Tbv.GRID_FLOAT.getBusinessType())) && (zoomService = this.LJLJI.getZoomService()) != null && zoomService.LIZJ() && !o.LJ(this.LJLILLLLZI, Boolean.TRUE)) {
                C74824TYe.LJJJJLI();
            }
            this.LJLIL = layout.getLayoutId();
            ZoomService zoomService2 = this.LJLJI.getZoomService();
            if (zoomService2 != null) {
                bool = Boolean.valueOf(zoomService2.LIZJ());
            }
            this.LJLILLLLZI = bool;
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex interfaceC75179Tex, EnumC75419Tip enumC75419Tip, EnumC75419Tip enumC75419Tip2, U9O u9o, C75786Tok c75786Tok) {
        C75240Tfw.LIZ(interfaceC75179Tex, enumC75419Tip, enumC75419Tip2, u9o);
    }
}
