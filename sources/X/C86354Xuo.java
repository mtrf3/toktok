package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;

/* renamed from: X.Xuo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86354Xuo implements InterfaceC56552Jv {
    public final /* synthetic */ LivePreviewPlayerWidget LIZ;

    @Override // X.InterfaceC56552Jv
    public final void LIZ() {
        LivePreviewPlayerVM LJZI;
        if (((Boolean) C52971Kqd.LIZ.getValue()).booleanValue()) {
            this.LIZ.LLFII();
            this.LIZ.LLFFF();
        }
        C86343Xud LJLZ = this.LIZ.LJLZ();
        if (LJLZ == null || !LJLZ.LJIIJ) {
            if (C53199KuJ.LIZ()) {
                LivePreviewPlayerVM LJZI2 = this.LIZ.LJZI();
                if (LJZI2 != null) {
                    LJZI2.destroy();
                }
            } else {
                LivePreviewPlayerVM LJZI3 = this.LIZ.LJZI();
                if (LJZI3 != null) {
                    LJZI3.iv0();
                }
            }
        }
        C86343Xud LJLZ2 = this.LIZ.LJLZ();
        if (LJLZ2 == null || !LJLZ2.LJIIJ || (LJZI = this.LIZ.LJZI()) == null) {
            return;
        }
        LJZI.LJLJLJ = false;
    }

    public C86354Xuo(LivePreviewPlayerWidget livePreviewPlayerWidget) {
        this.LIZ = livePreviewPlayerWidget;
    }
}
