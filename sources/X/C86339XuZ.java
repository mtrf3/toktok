package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.BottomTipsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import kotlin.jvm.internal.AqS165S0100000_15;

/* renamed from: X.XuZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86339XuZ implements InterfaceC53841LBd {
    public final /* synthetic */ BottomTipsWidget LIZ;

    @Override // X.InterfaceC53841LBd
    public final void onCancel() {
        LivePreviewGuideEnterVM LJZI = this.LIZ.LJZI();
        if (LJZI != null) {
            LJZI.lv0("back");
        }
    }

    @Override // X.InterfaceC53841LBd
    public final void onSuccess() {
        LivePreviewGuideEnterVM LJZI = this.LIZ.LJZI();
        if (LJZI != null) {
            AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this.LIZ, 266);
            AqS165S0100000_15 aqS165S0100000_152 = new AqS165S0100000_15(this.LIZ, 267);
            FFL.LJIIIZ().getClass();
            LJZI.iv0(FFL.LJIILIIL(31744, 5000L, "live_preview_page_auto_entering_guide_duration"), "enter_room");
            if (!LJZI.gv0(true)) {
                aqS165S0100000_15.invoke();
            } else {
                aqS165S0100000_152.invoke();
            }
        }
    }

    public C86339XuZ(BottomTipsWidget bottomTipsWidget) {
        this.LIZ = bottomTipsWidget;
    }
}
