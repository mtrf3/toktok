package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.linked;

import X.C31657Cbd;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C68332mD;
import X.InterfaceC74236TBo;
import X.TBT;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;

/* loaded from: classes14.dex */
public final class MultiGuestLinkedPreviewViewModel extends AbsMultiGuestNewPreviewViewModel {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public boolean LJLLI;
    public final C68332mD LJLLILLLL = C62814Ol0.LJIIJJI(this);
    public final C68332mD LJLLJ = C62814Ol0.LJIIJJI(this);
    public final C68332mD LJLLL = C62814Ol0.LJIIJJI(this);
    public final C68332mD LJLLLL = C62814Ol0.LJIIJJI(this);
    public final C31657Cbd LJLLLLLL = new C31657Cbd("ZOOM_SERVICE");

    static {
        TBT tbt = new TBT(MultiGuestLinkedPreviewViewModel.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65352Pkq.LIZ.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt};
    }

    public final ZoomService nv0() {
        return (ZoomService) this.LJLLLLLL.LIZ(this, LJLZ[0]);
    }

    public final String mv0() {
        String LJIIIZ;
        ZoomService nv0 = nv0();
        if (nv0 == null || (LJIIIZ = nv0.LJIIIZ()) == null) {
            return "";
        }
        return LJIIIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel
    public final void jv0(String str) {
        if (this.LJLLI) {
            return;
        }
        super.jv0("business_mute_close_manage_panel");
        this.LJLLI = true;
    }
}
